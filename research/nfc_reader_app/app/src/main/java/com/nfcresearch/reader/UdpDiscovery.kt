package com.nfcresearch.reader

import android.util.Log
import kotlinx.coroutines.*
import org.json.JSONObject
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.SocketTimeoutException

class UdpDiscovery(
    private val scope: CoroutineScope,
    private val onDiscovered: (ip: String, port: Int) -> Unit
) {
    companion object { const val UDP_PORT = 4445 }

    fun start() {
        scope.launch(Dispatchers.IO) {
            var socket: DatagramSocket? = null
            try {
                socket = DatagramSocket(UDP_PORT)
                socket.broadcast = true
                socket.soTimeout = 2000   // unblock every 2s to check isActive
                val buf = ByteArray(512)
                Log.d("UDP", "Auto-discovery listening on UDP $UDP_PORT")
                while (isActive) {
                    val packet = DatagramPacket(buf, buf.size)
                    try {
                        socket.receive(packet)
                        val text = String(packet.data, 0, packet.length, Charsets.UTF_8)
                        val obj  = JSONObject(text)
                        if (obj.optString("type") == "harvest_server") {
                            val ip   = packet.address.hostAddress ?: continue
                            val port = obj.optInt("port", 4444)
                            onDiscovered(ip, port)
                        }
                    } catch (_: SocketTimeoutException) {
                        // normal — just re-check isActive
                    } catch (_: Exception) {}
                }
            } catch (e: Exception) {
                Log.w("UDP", "Discovery socket failed: ${e.message}")
            } finally {
                socket?.close()
                Log.d("UDP", "Discovery socket closed")
            }
        }
    }
}
