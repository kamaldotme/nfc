package xyz.happify.ckemv

/**
 * One successful ARQC capture inside a [CardRecord].
 *
 * - [atc] = EMV tag 9F36 (Application Transaction Counter, 2 bytes)
 * - [arqc] = EMV tag 9F26 (Authorization Request Cryptogram, 8-byte MAC)
 * - [timeMs] = wall-clock duration of this specific tap iteration (ms)
 * - [params] = JSON of the CDOL1 fields fed into the chip for this iter
 *              (amount, date, country, currency, UN, etc.)
 * - [cve_id] = the [CveConfig.id] that produced this iteration
 */
data class HarvestedTx(
    val atc: String,
    val arqc: String,
    val timeMs: Double,
    val params: String,
    val cve_id: Int,
)
