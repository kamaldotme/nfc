// log_nfc.js
//
// Capture every NFC IsoDep frame the malware sees and every byte it sends
// back. The emulator has no NFC hardware, so these hooks will fire only
// when we synthetically inject APDUs via Frida (see Phase E3 in the PLAN).
// They still install cleanly on a no-NFC device — they just stay quiet.

'use strict';

Java.perform(function () {
    function safeHook(className, methodName, label) {
        try {
            const klass = Java.use(className);
            const overloads = klass[methodName].overloads;
            overloads.forEach(ov => {
                ov.implementation = function () {
                    const argSummary = [].slice.call(arguments).map(a => {
                        if (a === null) return 'null';
                        if (typeof a === 'object' && a.length !== undefined) {
                            try {
                                const arr = Java.array('byte', a);
                                let s = '';
                                for (let i = 0; i < Math.min(arr.length, 128); i++) {
                                    const b = arr[i] & 0xff;
                                    s += (b < 16 ? '0' : '') + b.toString(16);
                                }
                                return `<${arr.length}B: ${s}${arr.length > 128 ? '…' : ''}>`;
                            } catch (e) { return '<obj>'; }
                        }
                        return '' + a;
                    }).join(', ');
                    console.log(`[nfc] -> ${label} ${methodName}(${argSummary})`);
                    const ret = ov.apply(this, arguments);
                    if (ret !== undefined && ret !== null && typeof ret === 'object' && ret.length !== undefined) {
                        try {
                            const arr = Java.array('byte', ret);
                            let s = '';
                            for (let i = 0; i < Math.min(arr.length, 128); i++) {
                                const b = arr[i] & 0xff;
                                s += (b < 16 ? '0' : '') + b.toString(16);
                            }
                            console.log(`[nfc] <- ${label} ${methodName} = <${arr.length}B: ${s}${arr.length > 128 ? '…' : ''}>`);
                        } catch (e) { console.log(`[nfc] <- ${label} ${methodName} = <obj>`); }
                    } else {
                        console.log(`[nfc] <- ${label} ${methodName} = ${ret}`);
                    }
                    return ret;
                };
            });
            console.log(`[nfc] hooked ${className}.${methodName}`);
        } catch (e) {
            console.log(`[nfc] could not hook ${className}.${methodName}: ${e}`);
        }
    }

    // Stock Android NFC plumbing — anything the malware reads from a card
    // surfaces here even before its own classes process it.
    safeHook('android.nfc.tech.IsoDep', 'transceive', 'IsoDep');
    safeHook('android.nfc.tech.IsoDep', 'connect', 'IsoDep');
    safeHook('android.nfc.tech.IsoDep', 'close', 'IsoDep');
    safeHook('android.nfc.NfcAdapter', 'enableReaderMode', 'NfcAdapter');

    // The malware's NFC entry point (deobfuscated name).
    safeHook('xyz.happify.ckemv.nfc.NfcTapHandler', 'onTagDiscovered', 'NfcTapHandler');
});
