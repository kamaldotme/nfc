package com.nfcresearch.reader

import android.util.Log
import kotlinx.coroutines.*
import okhttp3.*
import org.json.JSONObject
import java.util.concurrent.TimeUnit

class WsClient(
    private val scope: CoroutineScope,
    private val serverIp: () -> String,
    val onConfig:      (JSONObject) -> Unit,
    val onClear:       () -> Unit,
    val onAck:         (Int) -> Unit,
    val onConnected:   () -> Unit,
    val onDisconnected:() -> Unit
) {
    private val http = OkHttpClient.Builder()
        .pingInterval(0, TimeUnit.SECONDS)   // disable OkHttp ping; server sends pings
        .connectTimeout(8, TimeUnit.SECONDS)
        .readTimeout(0, TimeUnit.SECONDS)
        .build()

    @Volatile var isConnected = false
        private set

    private var ws: WebSocket? = null
    private var reconnectJob: Job? = null

    fun start() {
        reconnectJob = scope.launch(Dispatchers.IO) {
            while (isActive) {
                connect()
                delay(5_000)   // wait before reconnecting
            }
        }
    }

    private fun buildUrl(): String {
        val addr = serverIp()
        return when {
            addr.startsWith("ws://") || addr.startsWith("wss://") -> addr
            addr.contains(":") -> "ws://$addr/ws"   // host:port supplied
            else -> "ws://$addr:4444/ws"
        }
    }

    private suspend fun connect() = suspendCancellableCoroutine<Unit> { cont ->
        val url = buildUrl()
        val req = Request.Builder().url(url).build()

        val listener = object : WebSocketListener() {
            override fun onOpen(ws: WebSocket, response: Response) {
                Log.d("WS", "Connected to $url")
                isConnected = true
                ws.send(JSONObject().apply { put("type", "hello") }.toString())
                onConnected()
            }
            override fun onMessage(ws: WebSocket, text: String) {
                try {
                    val obj = JSONObject(text)
                    when (obj.optString("type")) {
                        "config" -> onConfig(obj)
                        "clear"  -> onClear()
                        "ack"    -> onAck(obj.optInt("stored", 0))
                    }
                } catch (e: Exception) {
                    Log.w("WS", "Bad message: $text")
                }
            }
            override fun onClosing(ws: WebSocket, code: Int, reason: String) {
                ws.close(1000, null)
            }
            override fun onClosed(ws: WebSocket, code: Int, reason: String) {
                isConnected = false
                onDisconnected()
                if (cont.isActive) cont.resume(Unit) {}
            }
            override fun onFailure(ws: WebSocket, t: Throwable, response: Response?) {
                Log.w("WS", "Failed: ${t.message}")
                isConnected = false
                onDisconnected()
                if (cont.isActive) cont.resume(Unit) {}
            }
        }

        ws = http.newWebSocket(req, listener)
        cont.invokeOnCancellation { ws?.close(1000, "cancelled") }
    }

    fun send(json: String): Boolean {
        val ok = ws?.send(json) ?: false
        if (!ok) Log.w("WS", "send failed — not connected")
        return ok
    }

    fun close() {
        reconnectJob?.cancel()
        ws?.close(1000, "shutdown")
    }
}
