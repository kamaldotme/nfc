package B2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xyz.happify.ckemv.CardRecord;
import xyz.happify.ckemv.CveConfig;
import xyz.happify.ckemv.HarvestedTx;

/* loaded from: classes.dex */
public final class a extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, "CkemvHarvest.db", (SQLiteDatabase.CursorFactory) null, 8);
        X1.g.e(context, "context");
    }

    public final void A(List list) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("cves", null, null);
            b1.l lVar = new b1.l();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CveConfig cveConfig = (CveConfig) it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Integer.valueOf(cveConfig.getId()));
                contentValues.put("name", cveConfig.getName());
                contentValues.put("amount", Integer.valueOf(cveConfig.getAmount()));
                contentValues.put("mc_tags", lVar.f(cveConfig.getMastercard_tags()));
                contentValues.put("visa_tags", lVar.f(cveConfig.getVisa_tags()));
                writableDatabase.insert("cves", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public final void a(long j3) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.delete("transactions", "card_id = ?", new String[]{String.valueOf(j3)});
        writableDatabase.delete("cards", "id = ?", new String[]{String.valueOf(j3)});
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        r3 = (java.util.Map) r2.c(r5, com.google.gson.reflect.TypeToken.get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        r8 = r1.getInt(r1.getColumnIndexOrThrow("id"));
        r9 = r1.getString(r1.getColumnIndexOrThrow("name"));
        X1.g.d(r9, "getString(...)");
        r0.add(new xyz.happify.ckemv.CveConfig(r8, r9, r1.getInt(r1.getColumnIndexOrThrow("amount")), r11, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (r1.moveToNext() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r3 = r1.getString(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0019, code lost:
    
        if (r1.moveToFirst() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001b, code lost:
    
        r3 = r1.getColumnIndexOrThrow("mc_tags");
        r5 = "{}";
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r1.isNull(r3) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        r3 = "{}";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        r4 = r1.getColumnIndexOrThrow("visa_tags");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (r1.isNull(r4) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        r5 = r1.getString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r4 = new xyz.happify.ckemv.DatabaseHelper$getAllCves$type$1().getType();
        r3 = (java.util.Map) r2.c(r3, com.google.gson.reflect.TypeToken.get(r4));
        r6 = L1.u.f623b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM cves", null);
        b1.l lVar = new b1.l();
    }

    public final String i() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT api_key FROM stats WHERE id = 1", null);
        String string = rawQuery.moveToFirst() ? rawQuery.getString(0) : null;
        rawQuery.close();
        return string;
    }

    public final long o(CardRecord cardRecord) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("pan", cardRecord.getPan());
        contentValues.put("aid", cardRecord.getAid());
        contentValues.put("network", cardRecord.getNetwork());
        contentValues.put("raw_data", cardRecord.getRawData());
        long insert = writableDatabase.insert("cards", null, contentValues);
        if (insert != -1) {
            for (HarvestedTx harvestedTx : cardRecord.getTxs()) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("card_id", Long.valueOf(insert));
                contentValues2.put("atc", harvestedTx.getAtc());
                contentValues2.put("arqc", harvestedTx.getArqc());
                contentValues2.put("time_ms", Double.valueOf(harvestedTx.getTimeMs()));
                contentValues2.put("params", harvestedTx.getParams());
                contentValues2.put("cve_id", Integer.valueOf(harvestedTx.getCve_id()));
                writableDatabase.insert("transactions", null, contentValues2);
            }
        }
        return insert;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        X1.g.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("\n            CREATE TABLE cards (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                pan TEXT,\n                aid TEXT,\n                network TEXT,\n                raw_data TEXT,\n                timestamp DATETIME DEFAULT CURRENT_TIMESTAMP\n            )\n        ");
        sQLiteDatabase.execSQL("\n            CREATE TABLE transactions (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                card_id INTEGER,\n                atc TEXT,\n                arqc TEXT,\n                time_ms REAL,\n                params TEXT,\n                cve_id INTEGER,\n                FOREIGN KEY(card_id) REFERENCES cards(id)\n            )\n        ");
        sQLiteDatabase.execSQL("\n            CREATE TABLE stats (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                total_scans INTEGER DEFAULT 0,\n                api_key TEXT\n            )\n        ");
        sQLiteDatabase.execSQL("\n            CREATE TABLE cves (\n                id INTEGER PRIMARY KEY,\n                name TEXT,\n                amount INTEGER,\n                mc_tags TEXT,\n                visa_tags TEXT\n            )\n        ");
        sQLiteDatabase.execSQL("INSERT INTO stats (total_scans, api_key) VALUES (0, NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        X1.g.e(sQLiteDatabase, "db");
        if (i3 < 8) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS transactions");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cards");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS stats");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS terminals");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cves");
            onCreate(sQLiteDatabase);
        }
    }
}
