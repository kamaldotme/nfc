// orig: xyz/happify/ckemv/EmvKernel.java
//   kept-name (loaded by System.loadLibrary, JNI binds methods by FQN)
//
// Thin JNI bridge into libckemv_android.so — a 1.08 MB Rust EMV state machine.
// Every method is `external`/`native`; nothing happens on the JVM side.
//
// Driver pattern (see NfcTapHandler):
//     EmvKernel.initialize(true, scenarioJson)
//     while (EmvKernel.getStatus() == "InProgress") {
//         val apdu = EmvKernel.getNextCommand()
//         if (apdu.isNotEmpty()) {
//             val resp = isoDep.transceive(hexToBytes(apdu))
//             EmvKernel.processResponse(bytesToHex(resp))
//         }
//     }
//     val arqc = EmvKernel.getArqc()

package xyz.happify.ckemv.jni

object EmvKernel {
    init { System.loadLibrary("ckemv_android") }

    /** Spin up a fresh state machine. `isContactless` is hardwired to true.
     *  `paramsJson` is the flattened scenario (mastercard_tags or visa_tags
     *  merged with runtime overrides for 9A and 9F02). */
    external fun initialize(isContactless: Boolean, paramsJson: String)

    /** "InProgress" while the kernel still wants APDUs, otherwise "Done"/"Error". */
    external fun getStatus(): String

    /** Next APDU as hex, or empty string for "nothing yet". */
    external fun getNextCommand(): String

    /** Feed the chip's reply back. Return value is unused — state mutation
     *  happens inside the Rust object backing this singleton. */
    external fun processResponse(responseHex: String): String

    external fun getPan():           String   // EMV tag 5A / 57 Track-2
    external fun getAid():           String   // selected Application Identifier
    external fun getAtc():           String   // EMV tag 9F36
    external fun getArqc():          String   // EMV tag 9F26 — the prize
    external fun getTxParameters():  String   // JSON: terminal-side inputs used
    external fun getRawData():       String   // JSON: TLV bag of everything seen
}
