package xyz.happify.ckemv

/**
 * JNI bridge to `libckemv_android.so` (Rust EMV state machine, ~1 MB).
 *
 * Drives one card through one transaction at a time.
 * Typical usage:
 *
 *   EmvKernel.initialize(isContactless = true, paramsJson = "...")
 *   while (EmvKernel.getStatus() == "InProgress") {
 *       val hexApdu = EmvKernel.getNextCommand()
 *       val responseHex = isoDep.transceive(hexApdu.hexToBytes()).toHex()
 *       EmvKernel.processResponse(responseHex)
 *   }
 *   val pan = EmvKernel.getPan()
 *   val arqc = EmvKernel.getArqc()
 *   ...
 *
 * The `RegisterNatives` wiring inside `JNI_OnLoad` hides the handler
 * symbols from `.dynsym` (only `JNI_OnLoad` is exported), and the JNI
 * signature strings are XOR-obfuscated in .rodata via the `obfstr`
 * Rust crate. See `CKEMV_NATIVE_FUNCTIONS_REPORT.md` for the full
 * native-side analysis.
 */
object EmvKernel {

    init {
        System.loadLibrary("ckemv_android")
    }

    external fun initialize(isContactless: Boolean, paramsJson: String)
    external fun getNextCommand(): String
    external fun processResponse(hexResponse: String): String
    external fun getStatus(): String       // "InProgress" | "Completed" | "Failed" | "NotInitialized"
    external fun getPan(): String
    external fun getAtc(): String
    external fun getArqc(): String
    external fun getAid(): String
    external fun getTxParameters(): String
    external fun getRawData(): String
}
