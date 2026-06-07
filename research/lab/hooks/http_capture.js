// http_capture.js  (generic HTTP capture + host rewrite, Frida 16)
//
// Logs outbound HTTP(S) at common Java client entry points and (optionally)
// rewrites a target host to the lab mock. Reads LAB.mockUrl from the driver.
//
// This is a convenience for JVM/OkHttp/HttpURLConnection apps. Apps that do
// networking in native code (Rust/C) need a per-sample native hook instead.

'use strict';

var CFG = (typeof LAB !== 'undefined') ? LAB : {};
var MOCK = CFG.mockUrl || '';            // e.g. http://10.0.2.2:8771
var MOCK_HOST = MOCK ? MOCK.replace(/^https?:\/\//, '') : '';

function rewriteUrl(u) {
    if (!MOCK || typeof u !== 'string') return u;
    // Replace scheme+host[:port] with the mock origin, keep the path.
    var m = u.match(/^https?:\/\/[^\/]+(\/.*)?$/);
    if (!m) return u;
    var path = m[1] || '';
    var out = MOCK + path;
    send({ tag: 'rewrite', from: u, to: out });
    return out;
}

Java.perform(function () {
    // java.net.URL — the lowest common denominator.
    try {
        var URL = Java.use('java.net.URL');
        URL.$init.overload('java.lang.String').implementation = function (s) {
            send({ tag: 'http', via: 'URL', url: '' + s });
            return this.$init(rewriteUrl('' + s));
        };
    } catch (e) { send({ tag: 'http', skip: 'URL', why: '' + e }); }

    // OkHttp3 Request.Builder.url(String) — captures most modern Android HTTP.
    try {
        var Builder = Java.use('okhttp3.Request$Builder');
        var urlStr = Builder.url.overload('java.lang.String');
        urlStr.implementation = function (s) {
            send({ tag: 'http', via: 'okhttp', url: '' + s });
            return urlStr.call(this, rewriteUrl('' + s));
        };
    } catch (e) { send({ tag: 'http', skip: 'okhttp.Builder.url(String)', why: '' + e }); }

    // OkHttp response peek (status + url) without consuming the body.
    try {
        var RealCall = Java.use('okhttp3.internal.connection.RealCall');
        RealCall.execute.implementation = function () {
            var resp = this.execute();
            try { send({ tag: 'http-resp', code: resp.code(), url: '' + resp.request().url() }); } catch (e) {}
            return resp;
        };
    } catch (e) { /* okhttp internals vary by version — best effort */ }

    send({ tag: 'http', msg: 'http_capture installed (mock=' + (MOCK || 'none') + ')' });
});
