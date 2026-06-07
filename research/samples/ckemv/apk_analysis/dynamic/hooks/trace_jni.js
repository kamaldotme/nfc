// trace_jni.js
//
// Trace every method on the Java JNI bridge classes (EmvKernel, Reporter)
// and the NfcTapHandler harvest loop. Plus log all JNI RegisterNatives so
// we know exactly which native-side function backs each Java declared
// method. Together this gives us a play-by-play of Kotlin → native ↔ C2.
//
// Targets pulled from apk_analysis/deobfuscated/README.md:
//   xyz.happify.ckemv.jni.EmvKernel        — JNI into libckemv_android.so
//   xyz.happify.ckemv.jni.Reporter         — JNI into libckemv_reporter.so
//   xyz.happify.ckemv.nfc.NfcTapHandler    — IsoDep frame ingestion
//   xyz.happify.ckemv.net.UploadLoop       — periodic flush
//   xyz.happify.ckemv.net.ConfigUpdateLoop — periodic config fetch
//   xyz.happify.ckemv.net.PostTapUploader  — per-tap upload
//   xyz.happify.ckemv.update.ApkSideloader — secondary payload
//   xyz.happify.ckemv.SyncWorker           — WorkManager entry point

'use strict';

const PKG = 'xyz.happify.ckemv';
const TRACE_CLASSES = [
    `${PKG}.jni.EmvKernel`,
    `${PKG}.jni.Reporter`,
    `${PKG}.nfc.NfcTapHandler`,
    `${PKG}.net.UploadLoop`,
    `${PKG}.net.ConfigUpdateLoop`,
    `${PKG}.net.PostTapUploader`,
    `${PKG}.update.ApkSideloader`,
    `${PKG}.SyncWorker`,
    `${PKG}.MainActivity`,
];

function hexBytes(byteArr, max) {
    if (!byteArr) return '<null>';
    const arr = Java.array('byte', byteArr);
    const n = Math.min(arr.length, max || 64);
    let out = '';
    for (let i = 0; i < n; i++) {
        let b = arr[i] & 0xff;
        out += (b < 16 ? '0' : '') + b.toString(16);
    }
    if (arr.length > n) out += `…(+${arr.length - n}B)`;
    return out;
}

function summarizeArg(a) {
    if (a === null || a === undefined) return '' + a;
    if (typeof a === 'string') return JSON.stringify(a);
    if (typeof a === 'number' || typeof a === 'boolean') return '' + a;
    try {
        // Likely a Java object — call toString()
        return a.toString();
    } catch (e) { return '<unprintable>'; }
}

function hookClass(name) {
    let klass;
    try { klass = Java.use(name); }
    catch (e) { console.log(`[trace] class not found: ${name}`); return; }

    const methods = klass.class.getDeclaredMethods();
    methods.forEach(m => {
        const mname = m.getName();
        const overloads = klass[mname].overloads || [klass[mname]];
        overloads.forEach(ov => {
            try {
                ov.implementation = function () {
                    const args = [].slice.call(arguments).map(summarizeArg).join(', ');
                    console.log(`[jni] -> ${name}.${mname}(${args})`);
                    const ret = ov.apply(this, arguments);
                    console.log(`[jni] <- ${name}.${mname} = ${summarizeArg(ret)}`);
                    return ret;
                };
            } catch (e) { /* abstract/synthetic — skip */ }
        });
    });
    console.log(`[trace] hooked ${methods.length} methods on ${name}`);
}

// RegisterNatives interceptor — surfaces the binding between Java declared
// `native` methods and their .so addresses, which we need for native-side
// Interceptor.attach later.
function hookRegisterNatives() {
    const reg = Module.findExportByName(null, 'JNI_OnLoad');  // not strictly needed
    const jniEnvFns = Process.findModuleByName('libart.so');
    if (!jniEnvFns) return;
    const sym = DebugSymbol.fromName('art::JNI::RegisterNatives');
    if (!sym || sym.address.isNull()) {
        console.log('[trace] RegisterNatives symbol not resolvable on this device — skipping');
        return;
    }
    Interceptor.attach(sym.address, {
        onEnter(args) {
            // args: env, jclass, JNINativeMethod*, count
            const klass = args[1];
            const methods = args[2];
            const count = args[3].toInt32();
            console.log(`[jni] RegisterNatives count=${count}`);
            for (let i = 0; i < count; i++) {
                const entry = methods.add(i * Process.pointerSize * 3);
                const name = entry.readPointer().readUtf8String();
                const sig  = entry.add(Process.pointerSize).readPointer().readUtf8String();
                const fnPtr = entry.add(Process.pointerSize * 2).readPointer();
                console.log(`[jni]   ${name}${sig}  ->  ${fnPtr}`);
            }
        }
    });
}

Java.perform(function () {
    TRACE_CLASSES.forEach(hookClass);
    try { hookRegisterNatives(); } catch (e) { console.log(`[trace] RegisterNatives hook failed: ${e}`); }
    console.log('[trace] all Java hooks installed.');
});
