package t2;

import f.C0150G;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.C0306s;

/* loaded from: classes.dex */
public final class r implements r2.d {
    public static final List g = n2.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = n2.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final q2.l f4978a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.f f4979b;
    public final q c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y f4980d;

    /* renamed from: e, reason: collision with root package name */
    public final m2.p f4981e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4982f;

    public r(m2.o oVar, q2.l lVar, r2.f fVar, q qVar) {
        X1.g.e(lVar, "connection");
        this.f4978a = lVar;
        this.f4979b = fVar;
        this.c = qVar;
        m2.p pVar = m2.p.H2_PRIOR_KNOWLEDGE;
        this.f4981e = oVar.f4087s.contains(pVar) ? pVar : m2.p.HTTP_2;
    }

    @Override // r2.d
    public final z2.v a(m2.r rVar) {
        y yVar = this.f4980d;
        X1.g.b(yVar);
        return yVar.f5004i;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0119 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:33:0x00d4, B:35:0x00db, B:36:0x00e4, B:38:0x00e8, B:40:0x00ff, B:42:0x0107, B:46:0x0113, B:48:0x0119, B:80:0x01ab, B:81:0x01b0), top: B:32:0x00d4, outer: #1 }] */
    @Override // r2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0306s c0306s) {
        int i3;
        y yVar;
        boolean z3;
        if (this.f4980d != null) {
            return;
        }
        boolean z4 = ((X0.o) c0306s.f3773e) != null;
        m2.j jVar = (m2.j) c0306s.f3772d;
        ArrayList arrayList = new ArrayList(jVar.size() + 4);
        arrayList.add(new C0387b(C0387b.f4917f, (String) c0306s.c));
        z2.i iVar = C0387b.g;
        m2.l lVar = (m2.l) c0306s.f3771b;
        X1.g.e(lVar, "url");
        String b3 = lVar.b();
        String d3 = lVar.d();
        if (d3 != null) {
            b3 = b3 + '?' + d3;
        }
        arrayList.add(new C0387b(iVar, b3));
        String a3 = ((m2.j) c0306s.f3772d).a("Host");
        if (a3 != null) {
            arrayList.add(new C0387b(C0387b.f4918i, a3));
        }
        arrayList.add(new C0387b(C0387b.h, lVar.f4062a));
        int size = jVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            String b4 = jVar.b(i4);
            Locale locale = Locale.US;
            X1.g.d(locale, "US");
            String lowerCase = b4.toLowerCase(locale);
            X1.g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(lowerCase) || (X1.g.a(lowerCase, "te") && X1.g.a(jVar.d(i4), "trailers"))) {
                arrayList.add(new C0387b(lowerCase, jVar.d(i4)));
            }
        }
        q qVar = this.c;
        qVar.getClass();
        boolean z5 = !z4;
        synchronized (qVar.f4977z) {
            synchronized (qVar) {
                try {
                    if (qVar.g > 1073741823) {
                        qVar.A(8);
                    }
                    if (qVar.h) {
                        throw new IOException();
                    }
                    i3 = qVar.g;
                    qVar.g = i3 + 2;
                    yVar = new y(i3, qVar, z5, false, null);
                    if (z4 && qVar.f4974w < qVar.f4975x && yVar.f5002e < yVar.f5003f) {
                        z3 = false;
                        if (yVar.h()) {
                            qVar.f4957d.put(Integer.valueOf(i3), yVar);
                        }
                    }
                    z3 = true;
                    if (yVar.h()) {
                    }
                } finally {
                }
            }
            z zVar = qVar.f4977z;
            synchronized (zVar) {
                if (zVar.f5013f) {
                    throw new IOException("closed");
                }
                zVar.g.d(arrayList);
                long j3 = zVar.f5011d.c;
                long min = Math.min(zVar.f5012e, j3);
                int i5 = j3 == min ? 4 : 0;
                if (z5) {
                    i5 |= 1;
                }
                zVar.i(i3, (int) min, 1, i5);
                zVar.f5010b.m(zVar.f5011d, min);
                if (j3 > min) {
                    zVar.I(i3, j3 - min);
                }
            }
        }
        if (z3) {
            qVar.f4977z.flush();
        }
        this.f4980d = yVar;
        if (this.f4982f) {
            y yVar2 = this.f4980d;
            X1.g.b(yVar2);
            yVar2.e(9);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f4980d;
        X1.g.b(yVar3);
        x xVar = yVar3.f5006k;
        long j4 = this.f4979b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j4, timeUnit);
        y yVar4 = this.f4980d;
        X1.g.b(yVar4);
        yVar4.f5007l.g(this.f4979b.h, timeUnit);
    }

    @Override // r2.d
    public final long c(m2.r rVar) {
        if (r2.e.a(rVar)) {
            return n2.b.j(rVar);
        }
        return 0L;
    }

    @Override // r2.d
    public final void cancel() {
        this.f4982f = true;
        y yVar = this.f4980d;
        if (yVar != null) {
            yVar.e(9);
        }
    }

    @Override // r2.d
    public final void d() {
        y yVar = this.f4980d;
        X1.g.b(yVar);
        yVar.f().close();
    }

    @Override // r2.d
    public final void e() {
        this.c.flush();
    }

    @Override // r2.d
    public final m2.q f(boolean z3) {
        m2.j jVar;
        y yVar = this.f4980d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f5006k.h();
            while (yVar.g.isEmpty() && yVar.f5008m == 0) {
                try {
                    yVar.k();
                } catch (Throwable th) {
                    yVar.f5006k.l();
                    throw th;
                }
            }
            yVar.f5006k.l();
            if (!(!yVar.g.isEmpty())) {
                IOException iOException = yVar.f5009n;
                if (iOException != null) {
                    throw iOException;
                }
                int i3 = yVar.f5008m;
                X.d.l(i3);
                throw new D(i3);
            }
            Object removeFirst = yVar.g.removeFirst();
            X1.g.d(removeFirst, "headersQueue.removeFirst()");
            jVar = (m2.j) removeFirst;
        }
        m2.p pVar = this.f4981e;
        X1.g.e(pVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = jVar.size();
        J1.l lVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            String b3 = jVar.b(i4);
            String d3 = jVar.d(i4);
            if (X1.g.a(b3, ":status")) {
                lVar = m0.z.Z("HTTP/1.1 " + d3);
            } else if (!h.contains(b3)) {
                X1.g.e(b3, "name");
                X1.g.e(d3, "value");
                arrayList.add(b3);
                arrayList.add(d2.d.n0(d3).toString());
            }
        }
        if (lVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        m2.q qVar = new m2.q();
        qVar.f4101b = pVar;
        qVar.c = lVar.f579b;
        String str = (String) lVar.f580d;
        X1.g.e(str, "message");
        qVar.f4102d = str;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0150G c0150g = new C0150G(9);
        ArrayList arrayList2 = (ArrayList) c0150g.f2846b;
        X1.g.e(arrayList2, "<this>");
        X1.g.e(strArr, "elements");
        arrayList2.addAll(L1.j.Q(strArr));
        qVar.f4104f = c0150g;
        if (z3 && qVar.c == 100) {
            return null;
        }
        return qVar;
    }

    @Override // r2.d
    public final q2.l g() {
        return this.f4978a;
    }

    @Override // r2.d
    public final z2.t h(C0306s c0306s, long j3) {
        y yVar = this.f4980d;
        X1.g.b(yVar);
        return yVar.f();
    }
}
