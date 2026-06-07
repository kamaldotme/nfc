// orig: xyz/happify/ckemv/HarvestedTx.java   (kept-name; field names pinned by Gson)
//
// One successful execution of one scenario against the card. NfcTapHandler
// produces up to 20 of these per scheme per tap (8 + 8 + 4 across three
// day-offset values).

package xyz.happify.ckemv.model

data class HarvestedTx(
    val atc:    String,    // EMV tag 9F36 — Application Transaction Counter (chip-incremented per tx)
    val arqc:   String,    // EMV tag 9F26 — the cryptogram. THIS is the prize.
    val timeMs: Double,    // wall-clock duration of the kernel session (operator telemetry)
    val params: String,    // JSON of terminal-side inputs actually used (so C2 can audit/replay)
    val cve_id: Int        // back-pointer to the CveConfig.id that produced this tx
)
