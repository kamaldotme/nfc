package xyz.happify.ckemv

/**
 * In-memory record built by [NfcTapHandler] after a tap.
 * Persisted into the SQLite `cards` + `transactions` tables by
 * [DatabaseHelper.insertCardAndTransactions], then re-hydrated for upload
 * by [UploadLoop].
 */
data class CardRecord(
    val pan: String,
    val aid: String,
    val network: String,        // "Visa", "Mastercard", or "Unknown"
    val rawData: String,        // JSON-encoded TLV bag from EmvKernel.getRawData()
    val txs: List<HarvestedTx>, // up to 20 per scenario per tap
)
