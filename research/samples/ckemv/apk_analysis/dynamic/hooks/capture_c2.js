// capture_c2.js  (Frida 16 — global Java bridge)
//
// Captures the CKEMV C2 wire protocol at the JNI boundary and redirects the
// malware's own traffic to the analyst-controlled local mock.
//
// Runtime class names (from 02_RENAME_MAP.json):
//   xyz.happify.ckemv.Reporter   — KEPT name, root pkg (NOT jni.Reporter)
//       fetchCves(apiKey, baseUrl)            -> GET  {baseUrl}/me
//       fetchReport(apiKey, baseUrl)          -> GET  {baseUrl}/report
//       uploadHarvestData(json, apiKey, base) -> POST {baseUrl}/harvest
//   xyz.happify.ckemv.EmvKernel   — KEPT name, root pkg (the ARQC engine)
//
// Strategy:
//   * Log every Reporter call's args (json/apiKey/baseUrl) + return value.
//   * Rewrite any baseUrl containing "tqqemv.xyz" to MOCK_URL so the app's
//     loops talk to the mock. The on-device /system/etc/hosts sinkhole is the
//     second layer that guarantees the real C2 is never reached.
//   * Expose rpc.exports so the driver can invoke the native client on demand.

'use strict';

var MOCK_URL = 'http://127.0.0.1:8771'; // real device: adb reverse tcp:8771 tcp:8771
var REAL_HOST = 'tqqemv.xyz';

function rewrite(url) {
    if (typeof url === 'string' && url.indexOf(REAL_HOST) !== -1) {
        send({ tag: 'rewrite', from: url, to: MOCK_URL });
        return MOCK_URL;
    }
    return url;
}

function hookReporter() {
    var R;
    try { R = Java.use('xyz.happify.ckemv.Reporter'); }
    catch (e) { send({ tag: 'error', where: 'use Reporter', msg: '' + e }); return false; }

    R.fetchCves.implementation = function (apiKey, baseUrl) {
        send({ tag: 'req', method: 'fetchCves', endpoint: '/me', apiKey: apiKey, baseUrl: baseUrl });
        var ret = this.fetchCves(apiKey, rewrite(baseUrl));
        send({ tag: 'resp', method: 'fetchCves', value: '' + ret });
        return ret;
    };

    R.fetchReport.implementation = function (apiKey, baseUrl) {
        send({ tag: 'req', method: 'fetchReport', endpoint: '/report', apiKey: apiKey, baseUrl: baseUrl });
        var ret = this.fetchReport(apiKey, rewrite(baseUrl));
        send({ tag: 'resp', method: 'fetchReport', value: '' + ret });
        return ret;
    };

    R.uploadHarvestData.implementation = function (json, apiKey, baseUrl) {
        send({ tag: 'req', method: 'uploadHarvestData', endpoint: '/harvest',
               apiKey: apiKey, baseUrl: baseUrl, body: '' + json });
        var ret = this.uploadHarvestData(json, apiKey, rewrite(baseUrl));
        send({ tag: 'resp', method: 'uploadHarvestData', value: '' + ret });
        return ret;
    };

    send({ tag: 'info', msg: 'Reporter hooked (fetchCves/fetchReport/uploadHarvestData)' });
    return true;
}

function hookEmvKernel() {
    var K;
    try { K = Java.use('xyz.happify.ckemv.EmvKernel'); }
    catch (e) { send({ tag: 'info', msg: 'EmvKernel not loaded yet: ' + e }); return false; }
    ['getArqc', 'getAtc', 'getPan', 'getAid', 'getStatus', 'getNextCommand',
     'getRawData', 'getTxParameters'].forEach(function (m) {
        if (!K[m]) return;
        K[m].overloads.forEach(function (ov) {
            ov.implementation = function () {
                var ret = ov.apply(this, arguments);
                if (m === 'getArqc' || m === 'getPan' || m === 'getAtc')
                    send({ tag: 'emv', method: m, value: '' + ret });
                return ret;
            };
        });
    });
    send({ tag: 'info', msg: 'EmvKernel hooked' });
    return true;
}

function reporterInstance() {
    var R = Java.use('xyz.happify.ckemv.Reporter');
    try { return R.INSTANCE.value; } catch (e) { return R.$new(); }
}

rpc.exports = {
    // Drive the native C2 client directly against the mock.
    fetchcves: function (apiKey, baseUrl) {
        var out = null;
        Java.perform(function () { out = '' + reporterInstance().fetchCves(apiKey, baseUrl || MOCK_URL); });
        return out;
    },
    fetchreport: function (apiKey, baseUrl) {
        var out = null;
        Java.perform(function () { out = '' + reporterInstance().fetchReport(apiKey, baseUrl || MOCK_URL); });
        return out;
    },
    upload: function (json, apiKey, baseUrl) {
        var out = null;
        Java.perform(function () { out = '' + reporterInstance().uploadHarvestData(json, apiKey, baseUrl || MOCK_URL); });
        return out;
    },
};

Java.perform(function () {
    hookReporter();
    hookEmvKernel();
    send({ tag: 'info', msg: 'capture_c2.js ready (MOCK_URL=' + MOCK_URL + ')' });
});
