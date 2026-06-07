package xyz.nfc.moksha

import kotlin.math.abs

/**
 * Analyzes a sequence of Unpredictable Numbers (UNs) observed from POS terminals
 * to detect predictable generation patterns.
 *
 * If UNs are predictable, an attacker can pre-harvest ARQC cryptograms using
 * predicted future UNs, then replay them when the terminal generates that UN.
 */
object UnAnalyzer {

    enum class UnPattern {
        SEQUENTIAL,      // UN = prev + 1 (counter)
        TIMESTAMP,       // UN = lower 32 bits of unix timestamp
        FIXED,           // UN never changes (0x00000000, 0xDEADBEEF, etc.)
        LCG,             // Linear congruential generator (weak PRNG)
        UNKNOWN          // Cannot determine pattern — appears random
    }

    data class AnalysisResult(
        val pattern: UnPattern,
        val confidence: Float,       // 0.0–1.0
        val predictedNext: List<Long>,   // predicted next UN values
        val description: String,
        val attackWindow: Int,           // how many pre-harvested ARQCs cover the prediction
        val riskLevel: String            // CRITICAL / HIGH / LOW / NONE
    )

    data class ObservedUn(
        val unHex: String,
        val unLong: Long,
        val timestampMs: Long,
        val aid: String
    )

    /** Analyse a list of observed UNs and return the detected pattern. */
    fun analyze(observations: List<ObservedUn>): AnalysisResult {
        if (observations.size < 2) {
            return AnalysisResult(
                UnPattern.UNKNOWN, 0f, emptyList(),
                "Need at least 2 observations", 0, "NONE"
            )
        }

        val values = observations.map { it.unLong }

        // Test each pattern in order of confidence
        checkFixed(values)?.let { return it }
        checkSequential(values)?.let { return it }
        checkTimestamp(observations)?.let { return it }
        checkLcg(values)?.let { return it }

        return AnalysisResult(
            UnPattern.UNKNOWN, 0.1f, emptyList(),
            "No predictable pattern detected — terminal appears to use a CSPRNG.\n" +
            "However, with ${observations.size} samples the window may not be sufficient.",
            0, "LOW"
        )
    }

    // ── Pattern detectors ────────────────────────────────────────────────

    private fun checkFixed(values: List<Long>): AnalysisResult? {
        val first = values[0]
        if (values.all { it == first }) {
            return AnalysisResult(
                UnPattern.FIXED, 1.0f,
                listOf(first),  // it'll be the same value next time too
                "FIXED UN detected: terminal always uses 0x${first.toHex8()}.\n" +
                "Pre-play success rate: 100%. Any ARQC harvested with this UN is valid forever.",
                100, "CRITICAL"
            )
        }
        return null
    }

    private fun checkSequential(values: List<Long>): AnalysisResult? {
        val diffs = (1 until values.size).map { values[it] - values[it - 1] }
        val uniformDiff = diffs[0]
        val isSequential = diffs.all { it == uniformDiff } && (uniformDiff == 1L || uniformDiff == -1L)
        if (!isSequential) {
            // Check if most diffs are 1 (small gaps due to other card taps)
            val oneCount = diffs.count { it == 1L || it == -1L }
            if (oneCount.toFloat() / diffs.size < 0.8f) return null
        }

        val next = (1..20).map { values.last() + (it * uniformDiff) }
        return AnalysisResult(
            UnPattern.SEQUENTIAL, 0.95f, next,
            "SEQUENTIAL UN detected: terminal increments UN by ${uniformDiff} each transaction.\n" +
            "Next 20 predicted UNs: ${next.take(5).joinToString { "0x${it.toHex8()}" }} ...\n" +
            "Pre-play: harvest ARQCs using those predicted UNs → replay one when terminal uses it.",
            20, "CRITICAL"
        )
    }

    private fun checkTimestamp(observations: List<ObservedUn>): AnalysisResult? {
        // Check if UN ≈ unix_timestamp_seconds (lower 32 bits)
        val matches = observations.count { obs ->
            val tsSeconds = (obs.timestampMs / 1000L) and 0xFFFFFFFFL
            abs(obs.unLong - tsSeconds) < 5   // within 5 seconds
        }
        val conf = matches.toFloat() / observations.size
        if (conf < 0.7f) return null

        // Predict: attacker knows the approximate time of the next transaction
        val nowSec = (System.currentTimeMillis() / 1000L) and 0xFFFFFFFFL
        val predictedWindow = (0..30).map { nowSec + it }   // +0..+30 seconds window

        return AnalysisResult(
            UnPattern.TIMESTAMP, conf,
            predictedWindow,
            "TIMESTAMP-based UN detected (confidence=${(conf*100).toInt()}%).\n" +
            "Terminal uses unix_timestamp mod 2³² as UN.\n" +
            "Attacker knows approximate time of next transaction → harvest ARQC with ±30 UN values.\n" +
            "Success probability per attempt: ~1/30 per harvested ARQC.",
            30, "HIGH"
        )
    }

    private fun checkLcg(values: List<Long>): AnalysisResult? {
        // Try to fit a Linear Congruential Generator: next = (a * current + c) mod m
        // where m = 2^32. Brute-force common multipliers from Knuth / glibc.
        val commonMultipliers = listOf(
            1664525L, 22695477L, 6364136223846793005L and 0xFFFFFFFFL,
            214013L, 134775813L
        )
        for (a in commonMultipliers) {
            // Infer c from first two values: c = (v1 - a*v0) mod 2^32
            val c = (values[1] - a * values[0]) and 0xFFFFFFFFL
            // Validate on remaining values
            var valid = true
            var cur = values[0]
            for (i in 1 until values.size) {
                cur = (a * cur + c) and 0xFFFFFFFFL
                if (cur != values[i]) { valid = false; break }
            }
            if (valid) {
                val next = mutableListOf<Long>()
                cur = values.last()
                repeat(20) { cur = (a * cur + c) and 0xFFFFFFFFL; next.add(cur) }
                return AnalysisResult(
                    UnPattern.LCG, 0.90f, next,
                    "LCG (Linear Congruential Generator) detected: a=$a, c=$c.\n" +
                    "Terminal uses a weak PRNG — all future UNs are fully predictable.\n" +
                    "Next 20 UNs: ${next.take(5).joinToString { "0x${it.toHex8()}" }} ...",
                    20, "CRITICAL"
                )
            }
        }
        return null
    }

    // ── Helpers ──────────────────────────────────────────────────────────

    private fun Long.toHex8() = toString(16).uppercase().padStart(8, '0')

    /** How many of our pre-harvested (UN→ARQC) pairs cover the predicted UNs. */
    fun matchCount(predicted: List<Long>, harvested: List<HarvestRecord>): List<HarvestRecord> {
        val harvestedUns = harvested.associateBy { it.unHex.uppercase() }
        return predicted
            .map { it.toString(16).uppercase().padStart(8, '0') }
            .mapNotNull { harvestedUns[it] }
    }
}
