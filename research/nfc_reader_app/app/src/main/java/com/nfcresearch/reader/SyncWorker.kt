package com.nfcresearch.reader

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

class SyncWorker(ctx: Context, params: WorkerParameters) : CoroutineWorker(ctx, params) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        try {
            val db     = HarvestDb(applicationContext)
            val apiKey = db.getApiKey()
            val body   = get("http://${db.getServerIp()}:4444/me", apiKey)
            db.replaceCves(parseCves(body))
            Result.success()
        } catch (e: Exception) {
            Result.retry()
        }
    }

    private fun get(url: String, apiKey: String?): String {
        val conn = URL(url).openConnection() as HttpURLConnection
        conn.requestMethod  = "GET"
        conn.connectTimeout = 5_000
        conn.readTimeout    = 5_000
        if (!apiKey.isNullOrBlank())
            conn.setRequestProperty("Authorization", "Bearer $apiKey")
        val body = conn.inputStream.readBytes().toString(Charsets.UTF_8)
        conn.disconnect()
        return body
    }

    private fun parseCves(body: String): List<HarvestDb.CveRow> {
        val arr = JSONObject(body).getJSONArray("cves")
        return (0 until arr.length()).map { i ->
            val o = arr.getJSONObject(i)
            HarvestDb.CveRow(
                id       = o.getInt("id"),
                name     = o.getString("name"),
                amount   = o.getLong("amount"),
                mcTags   = o.optJSONObject("mastercard_tags")?.toString() ?: "{}",
                visaTags = o.optJSONObject("visa_tags")?.toString()        ?: "{}"
            )
        }
    }
}
