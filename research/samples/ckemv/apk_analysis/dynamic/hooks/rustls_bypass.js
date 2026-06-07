// rustls_bypass.js
//
// Force <rustls::webpki::server_verifier::WebPkiServerVerifier as
// rustls::verify::ServerCertVerifier>::verify_server_cert  to behave as if
// the chain validated successfully, so traffic from libckemv_reporter.so
// can be intercepted by mitmproxy (whose CA is NOT in the bundled rustls
// root store baked into the .so).
//
// Symbol (from apk_analysis/reporter_symtab.txt line 1471):
//   _ZN108_$LT$rustls..webpki..server_verifier..WebPkiServerVerifier$u20$as$u20$rustls..verify..ServerCertVerifier$GT$18verify_server_cert17hf3bbdbdce8cee7d7E
//   offset 0x162ee4, size 1208 in libckemv_reporter.so
//
// Strategy: hook the function with Interceptor and on entry log args; on
// leave inspect the return value. Once we know the success ABI from a real
// chain that validates against the bundled CA store, we replace the return
// in failing calls. For first run we only TRACE — we do not replace yet.
//
// NOTE: Both libckemv_reporter.so and libckemv_android.so are arm64-v8a.
// On the x86_64 emulator they're transparently translated by
// libndk_translation. The .so addresses we see from Frida are the
// post-translation virtual addresses; the offsets within the module remain
// the same as the ELF.

'use strict';

const REPORTER_LIB = 'libckemv_reporter.so';
const VERIFY_OFFSET = 0x162ee4;   // verify_server_cert
const CHAIN_IMPL_OFFSET = 0x163dcc; // verify_server_cert_signed_by_trust_anchor_impl

function attachReporterHooks() {
    const mod = Process.findModuleByName(REPORTER_LIB);
    if (!mod) {
        console.log(`[rustls] ${REPORTER_LIB} not yet loaded; will retry on next dlopen`);
        return false;
    }
    console.log(`[rustls] ${REPORTER_LIB} loaded at ${mod.base} (${mod.size} bytes)`);

    const verifyAddr = mod.base.add(VERIFY_OFFSET);
    const chainAddr  = mod.base.add(CHAIN_IMPL_OFFSET);
    console.log(`[rustls] verify_server_cert  @ ${verifyAddr}`);
    console.log(`[rustls] chain_impl          @ ${chainAddr}`);

    Interceptor.attach(verifyAddr, {
        onEnter(args) {
            this.tag = 'verify_server_cert';
            console.log(`[rustls] >> ${this.tag} self=${args[0]} end_entity=${args[1]} intermediates_ptr=${args[2]}`);
        },
        onLeave(retval) {
            // Rust Result<ServerCertVerified, rustls::Error> — empirical ABI
            // is logged here. If the first arg is a sret pointer (common for
            // larger return types) the actual result struct will be at *args[0].
            console.log(`[rustls] << ${this.tag} retval=${retval}`);
            // TODO: once observed, replace failing returns with the success
            // discriminant — leave commented until the ABI is confirmed:
            // retval.replace(ptr(0));
        }
    });

    Interceptor.attach(chainAddr, {
        onEnter(args) { this.t = Date.now(); },
        onLeave(retval) {
            console.log(`[rustls] chain_impl returned ${retval} after ${Date.now() - this.t}ms`);
        }
    });
    return true;
}

// Reporter library may load lazily when the Reporter JNI class is first used.
// Hook the dynamic loader so we attach the moment it appears.
if (!attachReporterHooks()) {
    const dlopenHooks = ['dlopen', 'android_dlopen_ext'];
    dlopenHooks.forEach(symName => {
        const sym = Module.findExportByName(null, symName);
        if (!sym) return;
        Interceptor.attach(sym, {
            onEnter(args) {
                const path = args[0].readUtf8String();
                if (path && path.indexOf(REPORTER_LIB) !== -1) this.targeted = true;
            },
            onLeave(retval) {
                if (this.targeted && !retval.isNull()) {
                    console.log(`[rustls] ${REPORTER_LIB} loaded via ${symName}; attaching`);
                    attachReporterHooks();
                }
            }
        });
    });
}
