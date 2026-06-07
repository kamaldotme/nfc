package xyz.happify.ckemv

class EmvKernel private constructor() {
    companion object {
        val INSTANCE = EmvKernel()
        init { System.loadLibrary("ckemv_android") }
    }
    external fun initialize(isContactless: Boolean, params: String)
    external fun getNextCommand(): String
    external fun processResponse(apduHex: String): String
    external fun getStatus(): String
    external fun getPan(): String
    external fun getArqc(): String
    external fun getAtc(): String
    external fun getAid(): String
    external fun getRawData(): String
    external fun getTxParameters(): String
}
