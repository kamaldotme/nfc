package q2;

import java.io.IOException;
import m2.q;
import m2.r;
import m2.s;
import t2.C0386a;
import t2.D;
import z2.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i f4436a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.b f4437b;
    public final f c;

    /* renamed from: d, reason: collision with root package name */
    public final r2.d f4438d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4439e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4440f;
    public final l g;

    public e(i iVar, m2.b bVar, f fVar, r2.d dVar) {
        X1.g.e(bVar, "eventListener");
        this.f4436a = iVar;
        this.f4437b = bVar;
        this.c = fVar;
        this.f4438d = dVar;
        this.g = dVar.g();
    }

    public final IOException a(boolean z3, boolean z4, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        m2.b bVar = this.f4437b;
        i iVar = this.f4436a;
        if (z4) {
            if (iOException != null) {
                bVar.getClass();
                X1.g.e(iVar, "call");
            } else {
                bVar.getClass();
                X1.g.e(iVar, "call");
            }
        }
        if (z3) {
            if (iOException != null) {
                bVar.getClass();
                X1.g.e(iVar, "call");
            } else {
                bVar.getClass();
                X1.g.e(iVar, "call");
            }
        }
        return iVar.f(this, z4, z3, iOException);
    }

    public final s b(r rVar) {
        r2.d dVar = this.f4438d;
        try {
            r.a("Content-Type", rVar);
            long c = dVar.c(rVar);
            return new s(c, new p(new d(this, dVar.a(rVar), c)), 1);
        } catch (IOException e3) {
            this.f4437b.getClass();
            X1.g.e(this.f4436a, "call");
            d(e3);
            throw e3;
        }
    }

    public final q c(boolean z3) {
        try {
            q f3 = this.f4438d.f(z3);
            if (f3 != null) {
                f3.f4109m = this;
            }
            return f3;
        } catch (IOException e3) {
            this.f4437b.getClass();
            X1.g.e(this.f4436a, "call");
            d(e3);
            throw e3;
        }
    }

    public final void d(IOException iOException) {
        this.f4440f = true;
        this.c.c(iOException);
        l g = this.f4438d.g();
        i iVar = this.f4436a;
        synchronized (g) {
            try {
                X1.g.e(iVar, "call");
                if (iOException instanceof D) {
                    if (((D) iOException).f4914b == 8) {
                        int i3 = g.f4477n + 1;
                        g.f4477n = i3;
                        if (i3 > 1) {
                            g.f4473j = true;
                            g.f4475l++;
                        }
                    } else if (((D) iOException).f4914b != 9 || !iVar.f4462q) {
                        g.f4473j = true;
                        g.f4475l++;
                    }
                } else if (g.g == null || (iOException instanceof C0386a)) {
                    g.f4473j = true;
                    if (g.f4476m == 0) {
                        l.d(iVar.f4450b, g.f4468b, iOException);
                        g.f4475l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
