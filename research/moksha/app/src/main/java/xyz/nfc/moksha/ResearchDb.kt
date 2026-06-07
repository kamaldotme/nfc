package xyz.nfc.moksha

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * SQLite storage for:
 *   • Observed terminal UNs (from HCE mode)
 *   • Pre-harvested ARQC bundles with their injected UNs (from card reader mode)
 */
class ResearchDb(context: Context) :
    SQLiteOpenHelper(context, "moksha_research.db", null, 2) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("""
            CREATE TABLE observed_uns (
                id        INTEGER PRIMARY KEY AUTOINCREMENT,
                un_hex    TEXT NOT NULL,
                un_int    INTEGER NOT NULL,
                aid       TEXT,
                ts        INTEGER NOT NULL
            )
        """)
        db.execSQL("""
            CREATE TABLE harvested_arqcs (
                id        INTEGER PRIMARY KEY AUTOINCREMENT,
                pan       TEXT NOT NULL,
                aid       TEXT,
                atc_hex   TEXT NOT NULL,
                atc_dec   INTEGER NOT NULL,
                un_hex    TEXT NOT NULL,
                arqc_hex  TEXT NOT NULL,
                ts        INTEGER NOT NULL,
                note      TEXT
            )
        """)
    }

    override fun onUpgrade(db: SQLiteDatabase, o: Int, n: Int) {
        db.execSQL("DROP TABLE IF EXISTS observed_uns")
        db.execSQL("DROP TABLE IF EXISTS harvested_arqcs")
        onCreate(db)
    }

    // ── UN Observer ───────────────────────────────────────────────────

    fun insertObservedUn(unHex: String, unInt: Long, aid: String, ts: Long) {
        writableDatabase.insert("observed_uns", null, ContentValues().apply {
            put("un_hex", unHex); put("un_int", unInt)
            put("aid", aid);      put("ts", ts)
        })
    }

    fun getObservedUns(): List<UnAnalyzer.ObservedUn> {
        val result = mutableListOf<UnAnalyzer.ObservedUn>()
        readableDatabase.rawQuery(
            "SELECT un_hex, un_int, ts, aid FROM observed_uns ORDER BY ts ASC", null
        ).use { c ->
            while (c.moveToNext()) result.add(
                UnAnalyzer.ObservedUn(
                    unHex       = c.getString(0),
                    unLong      = c.getLong(1),
                    timestampMs = c.getLong(2),
                    aid         = c.getString(3) ?: ""
                )
            )
        }
        return result
    }

    fun clearObservedUns() = writableDatabase.delete("observed_uns", null, null)

    // ── Harvested ARQCs ───────────────────────────────────────────────

    fun insertHarvest(r: HarvestRecord): Long =
        writableDatabase.insert("harvested_arqcs", null, ContentValues().apply {
            put("pan", r.pan);         put("aid", r.aid)
            put("atc_hex", r.atcHex); put("atc_dec", r.atcDec)
            put("un_hex", r.unHex);    put("arqc_hex", r.arqcHex)
            put("ts", r.timestamp);    put("note", r.note)
        })

    fun getHarvests(): List<HarvestRecord> {
        val result = mutableListOf<HarvestRecord>()
        readableDatabase.rawQuery(
            "SELECT id,pan,aid,atc_hex,atc_dec,un_hex,arqc_hex,ts,note " +
            "FROM harvested_arqcs ORDER BY ts DESC", null
        ).use { c ->
            while (c.moveToNext()) result.add(
                HarvestRecord(
                    id        = c.getLong(0),
                    pan       = c.getString(1),
                    aid       = c.getString(2) ?: "",
                    atcHex    = c.getString(3),
                    atcDec    = c.getInt(4),
                    unHex     = c.getString(5),
                    arqcHex   = c.getString(6),
                    timestamp = c.getLong(7),
                    note      = c.getString(8) ?: ""
                )
            )
        }
        return result
    }

    fun clearHarvests() = writableDatabase.delete("harvested_arqcs", null, null)
}
