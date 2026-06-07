package xyz.happify.ckemv

/**
 * One attack scenario the operator wants run against every tapped card.
 *
 * "CVE" here is the operator's jargon — it does NOT mean a real CVE-numbered
 * vulnerability. Think "configurable EMV transaction template."
 *
 * - [amount] is the starting amount in minor currency units (pence / cents).
 *   The runtime decrements it per inner iteration in [NfcTapHandler]:
 *   `amount = (amount * 95 / 100) - rand(1..100)`, looped 20 times.
 * - [mastercard_tags] and [visa_tags] are TLV overlay maps (keys = EMV tag
 *   hex like "9F02", values = TLV value hex). Whichever map is non-empty
 *   for the tapped card's scheme is merged into the per-iteration JSON
 *   before being passed to the native EMV kernel.
 */
data class CveConfig(
    val id: Int,
    val name: String,
    val amount: Int,
    val mastercard_tags: Map<String, String>,
    val visa_tags: Map<String, String>,
)
