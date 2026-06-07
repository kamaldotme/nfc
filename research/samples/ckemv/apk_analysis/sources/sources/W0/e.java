package w0;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import m0.A;
import v0.C0401a;
import v0.C0402b;
import v0.C0403c;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final n0.n f5150b;
    public final v0.l c;

    static {
        m0.r.b("EnqueueRunnable");
    }

    public e(n0.n nVar, v0.l lVar) {
        this.f5150b = nVar;
        this.c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(n0.n nVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        char c;
        nVar.getClass();
        String[] strArr = (String[]) n0.n.S(nVar).toArray(new String[0]);
        n0.s sVar = nVar.f4195e;
        sVar.f4208e.c.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z12 = strArr != null && strArr.length > 0;
        WorkDatabase workDatabase = sVar.f4209f;
        if (z12) {
            z4 = false;
            z5 = false;
            z3 = true;
            for (String str : strArr) {
                v0.o i3 = workDatabase.u().i(str);
                if (i3 == null) {
                    m0.r.a().getClass();
                    break;
                }
                int i4 = i3.f5092b;
                z3 &= i4 == 3;
                if (i4 == 4) {
                    z5 = true;
                } else if (i4 == 6) {
                    z4 = true;
                }
            }
        } else {
            z3 = true;
            z4 = false;
            z5 = false;
        }
        String str2 = nVar.f4196f;
        boolean z13 = !TextUtils.isEmpty(str2);
        if (z13 && !z12) {
            ArrayList j3 = workDatabase.u().j(str2);
            if (!j3.isEmpty()) {
                int i5 = nVar.g;
                if (i5 != 3 && i5 != 4) {
                    if (i5 == 2) {
                        Iterator it = j3.iterator();
                        while (it.hasNext()) {
                            int i6 = ((v0.n) it.next()).f5090b;
                            if (i6 != 1 && i6 != 2) {
                            }
                            z9 = true;
                            z8 = false;
                        }
                    }
                    new C0408c(sVar, str2).run();
                    v0.p u3 = workDatabase.u();
                    Iterator it2 = j3.iterator();
                    while (it2.hasNext()) {
                        u3.a(((v0.n) it2.next()).f5089a);
                    }
                    z6 = z13;
                    z7 = true;
                    boolean z14 = z7;
                    while (r9.hasNext()) {
                    }
                    z8 = z14;
                    z9 = true;
                    nVar.f4199k = z9;
                    return z8;
                }
                C0403c f3 = workDatabase.f();
                ArrayList arrayList = new ArrayList();
                Iterator it3 = j3.iterator();
                while (it3.hasNext()) {
                    v0.n nVar2 = (v0.n) it3.next();
                    String str3 = nVar2.f5089a;
                    f3.getClass();
                    Iterator it4 = it3;
                    boolean z15 = z13;
                    a0.j a3 = a0.j.a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                    if (str3 == null) {
                        a3.g(1);
                    } else {
                        a3.h(str3, 1);
                    }
                    WorkDatabase workDatabase2 = (WorkDatabase) f3.c;
                    workDatabase2.b();
                    Cursor n3 = workDatabase2.n(a3, null);
                    try {
                        if (n3.moveToFirst()) {
                            z10 = false;
                            if (n3.getInt(0) != 0) {
                                z11 = true;
                                if (z11) {
                                    int i7 = nVar2.f5090b;
                                    c = 3;
                                    z3 &= i7 == 3 ? true : z10;
                                    if (i7 == 4) {
                                        z5 = true;
                                    } else if (i7 == 6) {
                                        z4 = true;
                                    }
                                    arrayList.add(nVar2.f5089a);
                                } else {
                                    c = 3;
                                }
                                it3 = it4;
                                z13 = z15;
                            }
                        } else {
                            z10 = false;
                        }
                        z11 = z10;
                        if (z11) {
                        }
                        it3 = it4;
                        z13 = z15;
                    } finally {
                        n3.close();
                        a3.o();
                    }
                }
                z6 = z13;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (i5 == 4 && (z4 || z5)) {
                    v0.p u4 = workDatabase.u();
                    Iterator it5 = u4.j(str2).iterator();
                    while (it5.hasNext()) {
                        u4.a(((v0.n) it5.next()).f5089a);
                    }
                    z4 = false;
                    z5 = false;
                    arrayList2 = Collections.emptyList();
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z12 = strArr.length > 0;
                z7 = false;
                boolean z142 = z7;
                for (A a4 : nVar.h) {
                    v0.o oVar = a4.f3952b;
                    if (!z12 || z3) {
                        oVar.f5101n = currentTimeMillis;
                    } else if (z5) {
                        oVar.f5092b = 4;
                    } else if (z4) {
                        oVar.f5092b = 6;
                    } else {
                        oVar.f5092b = 5;
                    }
                    if (oVar.f5092b == 1) {
                        z142 = true;
                    }
                    v0.p u5 = workDatabase.u();
                    n0.s sVar2 = sVar;
                    X1.g.e(sVar.h, "schedulers");
                    WorkDatabase workDatabase3 = u5.f5111a;
                    workDatabase3.b();
                    workDatabase3.c();
                    try {
                        u5.f5112b.t(oVar);
                        workDatabase3.p();
                        workDatabase3.k();
                        UUID uuid = a4.f3951a;
                        if (z12) {
                            int length = strArr.length;
                            int i8 = 0;
                            while (i8 < length) {
                                long j4 = currentTimeMillis;
                                String str4 = strArr[i8];
                                String[] strArr2 = strArr;
                                String uuid2 = uuid.toString();
                                X1.g.d(uuid2, "id.toString()");
                                C0401a c0401a = new C0401a(uuid2, str4);
                                C0403c f4 = workDatabase.f();
                                WorkDatabase workDatabase4 = (WorkDatabase) f4.c;
                                workDatabase4.b();
                                workDatabase4.c();
                                try {
                                    ((C0402b) f4.f5067d).t(c0401a);
                                    workDatabase4.p();
                                    workDatabase4.k();
                                    i8++;
                                    strArr = strArr2;
                                    currentTimeMillis = j4;
                                } finally {
                                }
                            }
                        }
                        String[] strArr3 = strArr;
                        long j5 = currentTimeMillis;
                        v0.r v3 = workDatabase.v();
                        String uuid3 = uuid.toString();
                        X1.g.d(uuid3, "id.toString()");
                        v3.u(uuid3, a4.c);
                        if (z6) {
                            v0.l s3 = workDatabase.s();
                            String uuid4 = uuid.toString();
                            X1.g.d(uuid4, "id.toString()");
                            v0.k kVar = new v0.k(str2, uuid4);
                            WorkDatabase workDatabase5 = (WorkDatabase) s3.f5083d;
                            workDatabase5.b();
                            workDatabase5.c();
                            try {
                                ((C0402b) s3.f5084e).t(kVar);
                                workDatabase5.p();
                            } finally {
                            }
                        }
                        sVar = sVar2;
                        strArr = strArr3;
                        currentTimeMillis = j5;
                    } catch (Throwable th) {
                        workDatabase3.k();
                        throw th;
                    }
                }
                z8 = z142;
                z9 = true;
                nVar.f4199k = z9;
                return z8;
            }
        }
        z6 = z13;
        z7 = false;
        boolean z1422 = z7;
        while (r9.hasNext()) {
        }
        z8 = z1422;
        z9 = true;
        nVar.f4199k = z9;
        return z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v0.l lVar = this.c;
        n0.n nVar = this.f5150b;
        try {
            nVar.getClass();
            n0.s sVar = nVar.f4195e;
            if (n0.n.R(nVar, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + nVar + ")");
            }
            WorkDatabase workDatabase = sVar.f4209f;
            workDatabase.c();
            try {
                v0.f.l(workDatabase, sVar.f4208e, nVar);
                boolean a3 = a(nVar);
                workDatabase.p();
                if (a3) {
                    m.a(sVar.f4207d, RescheduleReceiver.class, true);
                    n0.l.b(sVar.f4208e, sVar.f4209f, sVar.h);
                }
                lVar.h(m0.x.f3987a);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            lVar.h(new m0.u(th));
        }
    }
}
