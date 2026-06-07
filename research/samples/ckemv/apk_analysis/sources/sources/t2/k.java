package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends p2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f4942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4943f = false;
    public final /* synthetic */ C g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, l lVar, C c) {
        super(true, str);
        this.f4942e = lVar;
        this.g = c;
    }

    @Override // p2.a
    public final long a() {
        long a3;
        int i3;
        y[] yVarArr;
        l lVar = this.f4942e;
        boolean z3 = this.f4943f;
        C c = this.g;
        lVar.getClass();
        X1.g.e(c, "settings");
        X1.j jVar = new X1.j(0);
        q qVar = lVar.c;
        synchronized (qVar.f4977z) {
            synchronized (qVar) {
                try {
                    C c3 = qVar.f4971t;
                    if (!z3) {
                        C c4 = new C();
                        c4.b(c3);
                        c4.b(c);
                        c = c4;
                    }
                    jVar.c = c;
                    a3 = c.a() - c3.a();
                    if (a3 != 0 && !qVar.f4957d.isEmpty()) {
                        yVarArr = (y[]) qVar.f4957d.values().toArray(new y[0]);
                        C c5 = (C) jVar.c;
                        X1.g.e(c5, "<set-?>");
                        qVar.f4971t = c5;
                        qVar.f4963l.c(new i(qVar.f4958e + " onSettings", qVar, jVar, 0), 0L);
                    }
                    yVarArr = null;
                    C c52 = (C) jVar.c;
                    X1.g.e(c52, "<set-?>");
                    qVar.f4971t = c52;
                    qVar.f4963l.c(new i(qVar.f4958e + " onSettings", qVar, jVar, 0), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                qVar.f4977z.a((C) jVar.c);
            } catch (IOException e3) {
                qVar.a(2, 2, e3);
            }
        }
        if (yVarArr == null) {
            return -1L;
        }
        for (y yVar : yVarArr) {
            synchronized (yVar) {
                yVar.f5003f += a3;
                if (a3 > 0) {
                    yVar.notifyAll();
                }
            }
        }
        return -1L;
    }
}
