package w0;

import java.util.Set;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final n0.g f5159b;
    public final n0.m c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5160d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5161e;

    public o(n0.g gVar, n0.m mVar, boolean z3, int i3) {
        X1.g.e(gVar, "processor");
        X1.g.e(mVar, "token");
        this.f5159b = gVar;
        this.c = mVar;
        this.f5160d = z3;
        this.f5161e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0.u b3;
        if (this.f5160d) {
            n0.g gVar = this.f5159b;
            n0.m mVar = this.c;
            int i3 = this.f5161e;
            gVar.getClass();
            String str = mVar.f4194a.f5079a;
            synchronized (gVar.f4185k) {
                b3 = gVar.b(str);
            }
            n0.g.d(b3, i3);
        } else {
            n0.g gVar2 = this.f5159b;
            n0.m mVar2 = this.c;
            int i4 = this.f5161e;
            gVar2.getClass();
            String str2 = mVar2.f4194a.f5079a;
            synchronized (gVar2.f4185k) {
                try {
                    if (gVar2.f4182f.get(str2) != null) {
                        m0.r.a().getClass();
                    } else {
                        Set set = (Set) gVar2.h.get(str2);
                        if (set != null && set.contains(mVar2)) {
                            n0.g.d(gVar2.b(str2), i4);
                        }
                    }
                } finally {
                }
            }
        }
        m0.r a3 = m0.r.a();
        m0.r.b("StopWorkRunnable");
        String str3 = this.c.f4194a.f5079a;
        a3.getClass();
    }
}
