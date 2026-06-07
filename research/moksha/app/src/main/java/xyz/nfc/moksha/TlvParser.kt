package xyz.nfc.moksha

/**
 * Minimal BER-TLV parser for EMV data.
 * EMV records are encoded as nested tag-length-value structures.
 */
object TlvParser {

    data class TlvNode(
        val tag: Int,
        val value: ByteArray,
        val children: List<TlvNode> = emptyList()
    ) {
        fun tagHex() = tag.toString(16).uppercase().padStart(if (tag > 0xFF) 4 else 2, '0')
        fun valueHex() = value.joinToString("") { "%02X".format(it) }
    }

    /** Parse a flat list of TLV nodes from [data] starting at [offset]. */
    fun parse(data: ByteArray, offset: Int = 0, limit: Int = data.size): List<TlvNode> {
        val nodes = mutableListOf<TlvNode>()
        var i = offset
        while (i < limit) {
            if (data[i] == 0x00.toByte() || data[i] == 0xFF.toByte()) { i++; continue }

            // Tag: 1 or 2 bytes
            val tag: Int
            val isConstructed: Boolean
            if ((data[i].toInt() and 0x1F) == 0x1F) {
                // Two-byte tag
                tag = ((data[i].toInt() and 0xFF) shl 8) or (data[i + 1].toInt() and 0xFF)
                isConstructed = (data[i].toInt() and 0x20) != 0
                i += 2
            } else {
                tag = data[i].toInt() and 0xFF
                isConstructed = (data[i].toInt() and 0x20) != 0
                i += 1
            }

            if (i >= limit) break

            // Length: 1 or 2 bytes
            val len: Int
            if ((data[i].toInt() and 0xFF) == 0x81) {
                len = data[i + 1].toInt() and 0xFF; i += 2
            } else if ((data[i].toInt() and 0xFF) == 0x82) {
                len = ((data[i + 1].toInt() and 0xFF) shl 8) or (data[i + 2].toInt() and 0xFF); i += 3
            } else {
                len = data[i].toInt() and 0xFF; i += 1
            }

            if (i + len > limit) break
            val value = data.copyOfRange(i, i + len)

            val children = if (isConstructed) parse(value) else emptyList()
            nodes.add(TlvNode(tag, value, children))
            i += len
        }
        return nodes
    }

    /** Find first node with [tag] (searches recursively). */
    fun find(nodes: List<TlvNode>, tag: Int): TlvNode? {
        for (n in nodes) {
            if (n.tag == tag) return n
            val found = find(n.children, tag)
            if (found != null) return found
        }
        return null
    }

    /** Find all nodes with [tag] (flat result, recursive search). */
    fun findAll(nodes: List<TlvNode>, tag: Int): List<TlvNode> {
        val result = mutableListOf<TlvNode>()
        for (n in nodes) {
            if (n.tag == tag) result.add(n)
            result.addAll(findAll(n.children, tag))
        }
        return result
    }

    /**
     * Parse CDOL (Card Risk Management DOL) — a list of (tag, length) pairs.
     * Returns list of Pair(tag, length) in order, which defines the layout
     * of the data field in the GENERATE AC command.
     *
     * This is how we find WHERE the UN (tag 9F37) sits in the GENERATE AC data.
     */
    fun parseDol(dol: ByteArray): List<Pair<Int, Int>> {
        val fields = mutableListOf<Pair<Int, Int>>()
        var i = 0
        while (i < dol.size) {
            val tag: Int
            if ((dol[i].toInt() and 0x1F) == 0x1F) {
                tag = ((dol[i].toInt() and 0xFF) shl 8) or (dol[i + 1].toInt() and 0xFF)
                i += 2
            } else {
                tag = dol[i].toInt() and 0xFF
                i += 1
            }
            val len = dol[i].toInt() and 0xFF
            i += 1
            fields.add(Pair(tag, len))
        }
        return fields
    }

    /**
     * Given CDOL field list and a target tag, returns (byteOffset, byteLength)
     * within the GENERATE AC data buffer where that tag's value lives.
     * Returns null if tag not found in CDOL.
     */
    fun dolFieldOffset(dolFields: List<Pair<Int, Int>>, targetTag: Int): Pair<Int, Int>? {
        var offset = 0
        for ((tag, len) in dolFields) {
            if (tag == targetTag) return Pair(offset, len)
            offset += len
        }
        return null
    }

    fun ByteArray.toHex() = joinToString("") { "%02X".format(it) }
    fun String.fromHex(): ByteArray {
        val s = replace(" ", "")
        return ByteArray(s.length / 2) { i ->
            s.substring(i * 2, i * 2 + 2).toInt(16).toByte()
        }
    }
}
