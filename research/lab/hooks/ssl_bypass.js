// ssl_bypass.js  (generic Java/TLS pinning bypass, Frida 16 — global Java bridge)
//
// Universal best-effort defeat of TLS validation + certificate pinning on the
// Java/Kotlin side so an analyst proxy (mitmproxy) can read HTTPS. Covers the
// common stacks: default SSLContext TrustManager, Conscrypt TrustManagerImpl,
// OkHttp CertificatePinner, HostnameVerifier, and Android Network Security Config.
//
// NOTE: Apps whose TLS lives in a native library (e.g. Rust rustls/BoringSSL)
// are NOT covered here — those need a per-sample native hook (see the sample's
// own hooks/ + the offset from its symbol table). This file handles the JVM side.

'use strict';

function tryHook(label, fn) {
    try { fn(); send({ tag: 'ssl', ok: label }); }
    catch (e) { send({ tag: 'ssl', skip: label, why: '' + e }); }
}

Java.perform(function () {
    // 1) Replace the default TrustManager with an all-trusting one.
    tryHook('SSLContext.init', function () {
        var X509TrustManager = Java.use('javax.net.ssl.X509TrustManager');
        var SSLContext = Java.use('javax.net.ssl.SSLContext');
        var TrustManager = Java.registerClass({
            name: 'com.lab.TrustAll',
            implements: [X509TrustManager],
            methods: {
                checkClientTrusted: function () {},
                checkServerTrusted: function () {},
                getAcceptedIssuers: function () { return []; }
            }
        });
        var tms = [TrustManager.$new()];
        var init = SSLContext.init.overload(
            '[Ljavax.net.ssl.KeyManager;', '[Ljavax.net.ssl.TrustManager;', 'java.security.SecureRandom');
        init.implementation = function (km, tm, sr) { init.call(this, km, tms, sr); };
    });

    // 2) Conscrypt TrustManagerImpl.verifyChain / checkTrusted — return the chain.
    tryHook('Conscrypt TrustManagerImpl', function () {
        var TMI = Java.use('com.android.org.conscrypt.TrustManagerImpl');
        if (TMI.verifyChain) {
            TMI.verifyChain.implementation = function (certs, host, clientAuth, ocsp, tlsData) { return certs; };
        }
        if (TMI.checkTrustedRecursive) {
            // older signature variant — best-effort
            try { TMI.checkTrustedRecursive.implementation = function () { return Java.use('java.util.ArrayList').$new(); }; } catch (e) {}
        }
    });

    // 3) OkHttp3 CertificatePinner.check (multiple overloads) — no-op.
    tryHook('OkHttp CertificatePinner', function () {
        var CP = Java.use('okhttp3.CertificatePinner');
        CP.check.overloads.forEach(function (ov) {
            ov.implementation = function () { return; };
        });
    });

    // 4) HostnameVerifier — always pass.
    tryHook('HostnameVerifier', function () {
        var HV = Java.use('javax.net.ssl.HttpsURLConnection');
        var AllowAll = Java.registerClass({
            name: 'com.lab.AllowAllHosts',
            implements: [Java.use('javax.net.ssl.HostnameVerifier')],
            methods: { verify: function (h, s) { return true; } }
        });
        HV.setDefaultHostnameVerifier(AllowAll.$new());
    });

    // 5) TrustManagerFactory.getTrustManagers — leave default but harmless hook
    //    placeholder for visibility.
    send({ tag: 'ssl', msg: 'ssl_bypass installed (JVM side)' });
});
