// capture_c2_native.js  v5 — Frida 17.x / ART / arm64
//
// ARCHITECTURE: Live dashboard redirect.
//
// Instead of hardcoded mock responses, every Reporter call is redirected to
// the local dashboard at http://127.0.0.1:8771 (reachable via the ADB reverse
// tunnel: `adb reverse tcp:8771 tcp:8771`).
//
//   Reporter.fetchCves(...)        → GET  http://127.0.0.1:8771/me
//   Reporter.uploadHarvestData(..) → POST http://127.0.0.1:8771/harvest   (real card data)
//   Reporter.fetchReport(...)      → GET  http://127.0.0.1:8771/report
//
// The dashboard already has correct /me (CVE config) and /harvest (card storage)
// handlers — this makes it the single source of truth instead of tqqemv.xyz.
//
// Why Java.perform (not native Interceptor):
//   v3's JNI vtable approach called NewStringUTF (vtable slot 167) to return
//   strings.  On this ART build NewStringUTF returned ptr(0) — Kotlin got null,
//   Gson failed silently, CVEs were never stored, so the EMV transaction never
//   started.  Java.perform intercepts at Dalvik method-dispatch; Frida converts
//   JS strings to java.lang.String automatically — no JNI plumbing needed.
//
// Setup required before launching:
//   adb forward  tcp:27042 tcp:27042   # Mac → Frida gadget
//   adb reverse  tcp:8771  tcp:8771    # device 127.0.0.1:8771 → Mac dashboard
//   python3 dashboard.py               # must be running on Mac port 8771
//
// Passive analysis only — no live tqqemv.xyz traffic leaves the device.
'use strict';

// Fallback CVE response used ONLY if the dashboard is unreachable.
// Matches the CveConfig schema exactly so Gson can deserialise it.
var FALLBACK_CVE_RESP = JSON.stringify({
    name: 'analyst-fallback',
    cves: [
        {
            id: 1,
            name: 'visa-baseline',
            amount: 5000,
            mastercard_tags: {},
            visa_tags: {
                '9F02': '000000005000',
                '5F2A': '0840',
                '9F1A': '0840',
                '9F35': '22',
                '9F33': 'E0F8C8',
                '9C':   '00'
            }
        },
        {
            id: 2,
            name: 'mc-baseline',
            amount: 5000,
            mastercard_tags: {
                '9F02': '000000005000',
                '5F2A': '0840',
                '9F1A': '0840',
                '9F35': '22',
                '9F33': 'E0F8C8',
                '9C':   '00'
            },
            visa_tags: {}
        }
    ],
    latest_version: null
});

// ── Java-level hooks ─────────────────────────────────────────────────────────
if (Java.available) {
    Java.perform(function () {

        // ── Class handles (captured once; reused across all hook invocations) ─
        var URL                = Java.use('java.net.URL');
        var HttpURLConnection  = Java.use('java.net.HttpURLConnection');
        var Scanner            = Java.use('java.util.Scanner');
        var OutputStreamWriter = Java.use('java.io.OutputStreamWriter');

        // ── HTTP helpers ─────────────────────────────────────────────────────
        // Calls run on whatever background thread the app used — all fine, no
        // NetworkOnMainThreadException risk.  localhost (127.0.0.1) is exempt
        // from Android 9+ cleartext-traffic restrictions by policy.

        function dashGet(path) {
            try {
                var url  = URL.$new('http://127.0.0.1:8771' + path);
                var conn = Java.cast(url.openConnection(), HttpURLConnection);
                conn.setConnectTimeout(3000);
                conn.setReadTimeout(5000);
                // GET is the default; no setRequestMethod needed.
                var is  = conn.getInputStream();
                // Scanner + \A delimiter reads the entire stream as one token.
                var sc  = Scanner.$new(is, 'UTF-8');
                sc.useDelimiter('\\A');
                var body = sc.hasNext() ? String(sc.next()) : '';
                sc.close();
                conn.disconnect();
                return body;   // plain JS string
            } catch (e) {
                send({ tag: 'http_err', path: path, method: 'GET', err: String(e) });
                return null;
            }
        }

        function dashPost(path, body) {
            try {
                var url  = URL.$new('http://127.0.0.1:8771' + path);
                var conn = Java.cast(url.openConnection(), HttpURLConnection);
                conn.setRequestMethod('POST');
                conn.setDoOutput(true);
                conn.setRequestProperty('Content-Type', 'application/json; charset=utf-8');
                conn.setConnectTimeout(3000);
                conn.setReadTimeout(5000);
                // OutputStreamWriter handles charset encoding cleanly.
                var os     = conn.getOutputStream();
                var writer = OutputStreamWriter.$new(os, 'UTF-8');
                writer.write(body);     // JS string → java.lang.String auto-converted
                writer.flush();
                writer.close();
                var code = conn.getResponseCode();
                conn.disconnect();
                return code;
            } catch (e) {
                send({ tag: 'http_err', path: path, method: 'POST', err: String(e) });
                return -1;
            }
        }

        // ── Reporter hooks ───────────────────────────────────────────────────
        // xyz.happify.ckemv.Reporter is a Kotlin singleton whose three native
        // methods live in libckemv_reporter.so.  Hooking at Java/Dalvik layer
        // intercepts before the native call, completely replacing tqqemv.xyz.
        try {
            var R = Java.use('xyz.happify.ckemv.Reporter');

            // fetchCves — called by SyncWorker every ~60 s and on provisioning.
            // Returns the /me JSON body; the app's Gson deserialises it into
            // MeResponse → CveConfig list → stored in local DB → used during EMV.
            R.fetchCves.implementation = function (apiKey, baseUrl) {
                send({
                    tag:     'fetchCves',
                    apiKey:  String(apiKey),
                    baseUrl: String(baseUrl),
                    ts:      new Date().toISOString()
                });
                var resp = dashGet('/me');
                if (resp && resp.length > 0) {
                    send({ tag: 'fetchCves_ok', bytes: resp.length });
                    return resp;          // real CVE config from dashboard
                }
                // Dashboard unreachable — use built-in fallback so the EMV
                // transaction can still proceed and card data gets captured.
                send({ tag: 'fetchCves_fallback', reason: 'dashboard unreachable' });
                return FALLBACK_CVE_RESP;
            };

            // uploadHarvestData — called after a successful EMV exchange with
            // the real NFC card.  json contains the full CardRecord payload
            // (PAN, AID, ARQC, ATC, network, EMV tags…).  We POST it directly
            // to the dashboard which stores it in SQLite and streams it to the
            // browser via SSE.
            R.uploadHarvestData.implementation = function (json, apiKey, baseUrl) {
                var jsonStr = String(json);
                send({
                    tag:     'harvest',
                    json:    jsonStr,
                    apiKey:  String(apiKey),
                    baseUrl: String(baseUrl),
                    ts:      new Date().toISOString()
                });
                // POST the real card payload to the dashboard.
                var code = dashPost('/harvest', jsonStr);
                send({ tag: 'harvest_forwarded', http_code: code });
                // Return a success envelope so the app considers the upload done.
                return '{"result":"Success","stored":true}';
            };

            // fetchReport — periodic health/status check; redirect to dashboard.
            R.fetchReport.implementation = function (apiKey, baseUrl) {
                send({
                    tag:     'fetchReport',
                    apiKey:  String(apiKey),
                    baseUrl: String(baseUrl),
                    ts:      new Date().toISOString()
                });
                var resp = dashGet('/report');
                return resp || '{"status":"ok"}';
            };

            send({ tag: 'info', msg: 'v5: Reporter.{fetchCves,uploadHarvestData,fetchReport} → dashboard redirect active' });
        } catch (e) {
            send({ tag: 'error', msg: 'Reporter hook failed: ' + String(e) });
        }

        // ── IsoDep.transceive — APDU diagnostic ──────────────────────────────
        // Logs every APDU command/response during the EMV card transaction.
        // Confirms: (a) card dispatched, (b) AID recognised, (c) card held long
        // enough for the full exchange (~6–8 rounds × 300ms = 2–3 s minimum).
        // Uses Interceptor.attach semantics via implementation — original runs.
        try {
            var IsoDep = Java.use('android.nfc.tech.IsoDep');

            function bytesToHex(arr) {
                if (!arr) return '';
                var h = '';
                for (var i = 0; i < arr.length; i++) {
                    h += ('00' + ((arr[i] + 256) & 0xff).toString(16)).slice(-2);
                }
                return h.toUpperCase();
            }

            // Reentrancy guard: our hook calls this.transceive() which would
            // otherwise recurse back into the hook.
            var _busy = false;
            IsoDep.transceive.implementation = function (data) {
                if (_busy) return this.transceive(data);
                _busy = true;
                var reqHex = '';
                try { reqHex = bytesToHex(data); } catch (_) {}
                try {
                    var resp = this.transceive(data);
                    send({
                        tag:  'apdu',
                        req:  reqHex,
                        resp: bytesToHex(resp),
                        ts:   new Date().toISOString()
                    });
                    return resp;
                } catch (ex) {
                    send({ tag: 'apdu', req: reqHex, err: String(ex), ts: new Date().toISOString() });
                    throw ex;
                } finally {
                    _busy = false;
                }
            };
            send({ tag: 'info', msg: 'v5: IsoDep.transceive hooked — APDU log active' });
        } catch (e) {
            send({ tag: 'warn', msg: 'IsoDep hook skipped (non-fatal): ' + String(e) });
        }

    }); // Java.perform
} else {
    send({ tag: 'warn', msg: 'Java not available — no hooks installed' });
}

send({ tag: 'info', msg: 'capture_c2_native.js v5 loaded — tap NFC card and hold 5+ seconds' });
