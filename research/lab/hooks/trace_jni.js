// trace_jni.js  (generic, Frida 16 — global Java bridge)
//
// Traces Java/Kotlin methods for ANY sample. Reads config from the `LAB` object
// the driver prepends:
//   LAB.package        e.g. "com.evil.app"  (enumerate loaded classes w/ this prefix)
//   LAB.traceClasses   explicit FQNs to trace (takes priority over prefix scan)
//   LAB.extraPrefixes  extra class-name prefixes to include (e.g. R8 "B2.")
//
// Also intercepts art::JNI::RegisterNatives (when the symbol is resolvable) to
// map each Java `native` method to its .so implementation address.

'use strict';

var CFG = (typeof LAB !== 'undefined') ? LAB : {};
var PKG = CFG.package || '';
var EXPLICIT = CFG.traceClasses || [];
var PREFIXES = [PKG].concat(CFG.extraPrefixes || []).filter(Boolean);
var MAX_BYTES = 64;

function hexBytes(byteArr, max) {
    if (!byteArr) return '<null>';
    try {
        var arr = Java.array('byte', byteArr);
        var n = Math.min(arr.length, max || MAX_BYTES);
        var out = '';
        for (var i = 0; i < n; i++) {
            var b = arr[i] & 0xff;
            out += (b < 16 ? '0' : '') + b.toString(16);
        }
        if (arr.length > n) out += '...(+' + (arr.length - n) + 'B)';
        return out;
    } catch (e) { return '<bytes>'; }
}

function summarize(a) {
    if (a === null || a === undefined) return '' + a;
    if (typeof a === 'string' || typeof a === 'number' || typeof a === 'boolean') return JSON.stringify(a);
    try {
        if (a.$className === '[B') return '[B ' + hexBytes(a);
        return a.toString();
    } catch (e) { return '<obj>'; }
}

function hookClass(name) {
    var klass;
    try { klass = Java.use(name); } catch (e) { return 0; }
    var methods;
    try { methods = klass.class.getDeclaredMethods(); } catch (e) { return 0; }
    var count = 0;
    methods.forEach(function (m) {
        var mname = m.getName();
        var overloads;
        try { overloads = klass[mname].overloads || [klass[mname]]; } catch (e) { return; }
        overloads.forEach(function (ov) {
            try {
                ov.implementation = function () {
                    var args = [].slice.call(arguments).map(summarize).join(', ');
                    var ret = ov.apply(this, arguments);
                    send({ tag: 'jni', cls: name, method: mname, args: args, ret: summarize(ret) });
                    return ret;
                };
                count++;
            } catch (e) { /* abstract/synthetic */ }
        });
    });
    if (count) send({ tag: 'trace', msg: 'hooked ' + count + ' methods on ' + name });
    return count;
}

function matchesPrefix(cn) {
    for (var i = 0; i < PREFIXES.length; i++) {
        if (cn.indexOf(PREFIXES[i]) === 0) return true;
    }
    return false;
}

function hookRegisterNatives() {
    try {
        var sym = DebugSymbol.fromName('art::JNI::RegisterNatives');
        if (!sym || sym.address.isNull()) {
            send({ tag: 'trace', msg: 'RegisterNatives symbol not resolvable (stripped libart) — skipping' });
            return;
        }
        Interceptor.attach(sym.address, {
            onEnter: function (args) {
                var methods = args[2], count = args[3].toInt32();
                for (var i = 0; i < count; i++) {
                    var e = methods.add(i * Process.pointerSize * 3);
                    send({
                        tag: 'registernatives',
                        name: e.readPointer().readUtf8String(),
                        sig: e.add(Process.pointerSize).readPointer().readUtf8String(),
                        fn: '' + e.add(Process.pointerSize * 2).readPointer()
                    });
                }
            }
        });
        send({ tag: 'trace', msg: 'RegisterNatives hooked' });
    } catch (e) { send({ tag: 'trace', msg: 'RegisterNatives hook failed: ' + e }); }
}

Java.perform(function () {
    var total = 0;
    if (EXPLICIT.length) {
        EXPLICIT.forEach(function (c) { total += hookClass(c); });
    } else if (PREFIXES.length) {
        var seen = {};
        Java.enumerateLoadedClassesSync().forEach(function (cn) {
            if (!seen[cn] && matchesPrefix(cn) && cn.indexOf('$') === -1) {
                seen[cn] = 1;
                total += hookClass(cn);
            }
        });
    } else {
        send({ tag: 'trace', msg: 'no LAB.package / traceClasses given — nothing to trace' });
    }
    hookRegisterNatives();
    send({ tag: 'trace', msg: 'trace_jni ready (' + total + ' methods across prefixes ' + JSON.stringify(PREFIXES) + ')' });
});
