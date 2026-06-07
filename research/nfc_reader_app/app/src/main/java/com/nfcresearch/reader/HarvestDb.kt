package com.nfcresearch.reader

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

private const val VPS_HOST = "172.104.207.107"

class HarvestDb(context: Context) : SQLiteOpenHelper(context, "NfcHarvest.db", null, 11) {

    init {
        // Migrate from old database name if present and new one doesn't exist yet
        val oldFile = context.getDatabasePath("CkemvHarvest.db")
        val newFile = context.getDatabasePath("NfcHarvest.db")
        if (oldFile.exists() && !newFile.exists()) {
            oldFile.renameTo(newFile)
        }
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("""CREATE TABLE cards (
            id        INTEGER PRIMARY KEY AUTOINCREMENT,
            pan       TEXT,
            aid       TEXT,
            network   TEXT,
            raw_data  TEXT,
            timestamp INTEGER
        )""")
        db.execSQL("""CREATE TABLE transactions (
            id        INTEGER PRIMARY KEY AUTOINCREMENT,
            card_id   INTEGER,
            atc       TEXT,
            arqc      TEXT,
            time_ms   REAL,
            params    TEXT,
            cve_id    INTEGER,
            uploaded  INTEGER DEFAULT 0,
            FOREIGN KEY(card_id) REFERENCES cards(id)
        )""")
        db.execSQL("""CREATE TABLE stats (
            id           INTEGER PRIMARY KEY DEFAULT 1,
            total_scans  INTEGER DEFAULT 0,
            api_key      TEXT,
            server_ip    TEXT DEFAULT '$VPS_HOST'
        )""")
        db.execSQL("INSERT OR IGNORE INTO stats (id, total_scans, api_key, server_ip) VALUES (1, 0, NULL, '$VPS_HOST')")
        db.execSQL("""CREATE TABLE cves (
            id        INTEGER PRIMARY KEY,
            name      TEXT,
            amount    INTEGER,
            mc_tags   TEXT,
            visa_tags TEXT
        )""")
    }

    fun getServerIp(): String =
        readableDatabase.query("stats", arrayOf("server_ip"), "id=1",
            null, null, null, null).use {
            if (it.moveToFirst()) it.getString(0) ?: "127.0.0.1" else "127.0.0.1"
        }

    fun setServerIp(ip: String) {
        writableDatabase.execSQL("UPDATE stats SET server_ip=? WHERE id=1", arrayOf(ip))
    }

    override fun onUpgrade(db: SQLiteDatabase, old: Int, new: Int) {
        if (old < 8) {
            // Full recreate for versions before the 4-table schema
            db.execSQL("DROP TABLE IF EXISTS transactions")
            db.execSQL("DROP TABLE IF EXISTS cards")
            db.execSQL("DROP TABLE IF EXISTS cves")
            db.execSQL("DROP TABLE IF EXISTS stats")
            onCreate(db)
        } else if (old < 9) {
            try { db.execSQL("ALTER TABLE stats ADD COLUMN server_ip TEXT DEFAULT '127.0.0.1'") } catch (_: Exception) {}
        }
        // version 10: DB file renamed to NfcHarvest.db (handled in init block); no schema changes
        if (old < 11) {
            // Point existing installs at the VPS instead of localhost
            db.execSQL("UPDATE stats SET server_ip='$VPS_HOST' WHERE id=1 AND server_ip='127.0.0.1'")
        }
    }

    // ── API key ───────────────────────────────────────────────────────────────

    fun getApiKey(): String? =
        readableDatabase.query("stats", arrayOf("api_key"), "id=1",
            null, null, null, null).use {
            if (it.moveToFirst()) it.getString(0) else null
        }

    fun setApiKey(key: String) {
        writableDatabase.execSQL("UPDATE stats SET api_key=? WHERE id=1", arrayOf(key))
    }

    // ── Stats ─────────────────────────────────────────────────────────────────

    fun getTotalScans(): Int =
        readableDatabase.query("stats", arrayOf("total_scans"), "id=1",
            null, null, null, null).use {
            if (it.moveToFirst()) it.getInt(0) else 0
        }

    fun incrementTotalScans() {
        writableDatabase.execSQL("UPDATE stats SET total_scans = total_scans + 1 WHERE id=1")
    }

    // ── Cards + transactions ──────────────────────────────────────────────────

    fun insertCard(pan: String, aid: String, network: String, rawData: String): Long =
        writableDatabase.insert("cards", null, ContentValues().apply {
            put("pan", pan); put("aid", aid); put("network", network)
            put("raw_data", rawData); put("timestamp", System.currentTimeMillis())
        })

    fun insertTransaction(cardId: Long, atc: String, arqc: String,
                          timeMs: Double, params: String, cveId: Int) {
        writableDatabase.insert("transactions", null, ContentValues().apply {
            put("card_id", cardId); put("atc", atc); put("arqc", arqc)
            put("time_ms", timeMs); put("params", params); put("cve_id", cveId)
            put("uploaded", 0)
        })
    }

    data class PendingTx(
        val atc: String, val arqc: String, val timeMs: Double,
        val params: String, val cveId: Int
    )

    data class PendingCard(
        val id: Long, val pan: String, val aid: String,
        val network: String, val rawData: String,
        val transactions: List<PendingTx>
    )

    fun getPendingCards(): List<PendingCard> {
        // Clean up orphaned transactions (card row was deleted mid-harvest)
        writableDatabase.execSQL(
            "DELETE FROM transactions WHERE card_id NOT IN (SELECT id FROM cards)")
        val result = mutableListOf<PendingCard>()
        val db = readableDatabase
        db.query("cards", null,
            "id IN (SELECT DISTINCT card_id FROM transactions WHERE uploaded=0)",
            null, null, null, "timestamp ASC").use { c ->
            while (c.moveToNext()) {
                val cardId = c.getLong(c.getColumnIndexOrThrow("id"))
                val txs    = mutableListOf<PendingTx>()
                db.query("transactions", null,
                    "card_id=? AND uploaded=0", arrayOf(cardId.toString()),
                    null, null, null).use { t ->
                    while (t.moveToNext()) {
                        txs += PendingTx(
                            atc    = t.getString(t.getColumnIndexOrThrow("atc")),
                            arqc   = t.getString(t.getColumnIndexOrThrow("arqc")),
                            timeMs = t.getDouble(t.getColumnIndexOrThrow("time_ms")),
                            params = t.getString(t.getColumnIndexOrThrow("params")),
                            cveId  = t.getInt(t.getColumnIndexOrThrow("cve_id"))
                        )
                    }
                }
                result += PendingCard(
                    id           = cardId,
                    pan          = c.getString(c.getColumnIndexOrThrow("pan")),
                    aid          = c.getString(c.getColumnIndexOrThrow("aid")),
                    network      = c.getString(c.getColumnIndexOrThrow("network")),
                    rawData      = c.getString(c.getColumnIndexOrThrow("raw_data")),
                    transactions = txs
                )
            }
        }
        return result
    }

    fun clearAll() {
        writableDatabase.beginTransaction()
        try {
            writableDatabase.delete("transactions", null, null)
            writableDatabase.delete("cards", null, null)
            writableDatabase.execSQL("UPDATE stats SET total_scans=0 WHERE id=1")
            writableDatabase.setTransactionSuccessful()
        } finally {
            writableDatabase.endTransaction()
        }
    }

    fun deleteCard(cardId: Long) {
        writableDatabase.beginTransaction()
        try {
            writableDatabase.delete("transactions", "card_id=?", arrayOf(cardId.toString()))
            writableDatabase.delete("cards",        "id=?",      arrayOf(cardId.toString()))
            writableDatabase.setTransactionSuccessful()
        } finally {
            writableDatabase.endTransaction()
        }
    }

    // ── CVE configs ───────────────────────────────────────────────────────────

    data class CveRow(val id: Int, val name: String, val amount: Long,
                      val mcTags: String, val visaTags: String)

    fun getCves(): List<CveRow> {
        val result = mutableListOf<CveRow>()
        readableDatabase.query("cves", null, null, null, null, null, "id ASC").use {
            while (it.moveToNext()) {
                result += CveRow(
                    id       = it.getInt(it.getColumnIndexOrThrow("id")),
                    name     = it.getString(it.getColumnIndexOrThrow("name")),
                    amount   = it.getLong(it.getColumnIndexOrThrow("amount")),
                    mcTags   = it.getString(it.getColumnIndexOrThrow("mc_tags"))   ?: "{}",
                    visaTags = it.getString(it.getColumnIndexOrThrow("visa_tags")) ?: "{}"
                )
            }
        }
        return result
    }

    fun replaceCves(cves: List<CveRow>) {
        writableDatabase.beginTransaction()
        try {
            writableDatabase.delete("cves", null, null)
            for (c in cves) {
                writableDatabase.insert("cves", null, ContentValues().apply {
                    put("id", c.id); put("name", c.name); put("amount", c.amount)
                    put("mc_tags", c.mcTags); put("visa_tags", c.visaTags)
                })
            }
            writableDatabase.setTransactionSuccessful()
        } finally {
            writableDatabase.endTransaction()
        }
    }
}
