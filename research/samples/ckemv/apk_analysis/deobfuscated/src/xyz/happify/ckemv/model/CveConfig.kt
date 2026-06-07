// orig: xyz/happify/ckemv/CveConfig.java   (kept-name; field names pinned by Gson)
//
// A single "scenario" — one configurable EMV transaction the operator wants
// the harvester to play against every tapped card. The name "cve" is the
// operator's own jargon (NOT a real CVE-numbered vulnerability).
//
// `mastercard_tags` / `visa_tags` are TLV overlays applied to the terminal
// side of the GENERATE AC request — that's how the operator pre-programs
// amount / currency / country / terminal-capability inputs the chip will
// MAC over when producing its ARQC.

package xyz.happify.ckemv.model

data class CveConfig(
    val id: Int,                                  // stable scenario ID; echoed in HarvestedTx
    val name: String,                             // operator-side label
    val amount: Int,                              // starting amount (minor units)
    val mastercard_tags: Map<String, String>,    // EMV tag hex -> TLV value hex
    val visa_tags: Map<String, String>
)
