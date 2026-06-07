package o0;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import e2.K;
import e2.Q;
import f.C0150G;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import m0.C0329a;
import n0.g;
import n0.i;
import n0.m;
import r0.AbstractC0368c;
import r0.C0366a;
import r0.C0367b;
import r0.e;
import r0.k;
import v0.C0403c;
import v0.j;
import v0.o;
import v0.r;
import w0.n;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353c implements i, e, n0.c {

    /* renamed from: b, reason: collision with root package name */
    public final Context f4276b;

    /* renamed from: d, reason: collision with root package name */
    public final C0351a f4277d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4278e;
    public final g h;

    /* renamed from: i, reason: collision with root package name */
    public final C0403c f4280i;

    /* renamed from: j, reason: collision with root package name */
    public final C0329a f4281j;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f4283l;

    /* renamed from: m, reason: collision with root package name */
    public final C0150G f4284m;

    /* renamed from: n, reason: collision with root package name */
    public final v0.i f4285n;

    /* renamed from: o, reason: collision with root package name */
    public final C0354d f4286o;
    public final HashMap c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Object f4279f = new Object();
    public final r g = new r();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f4282k = new HashMap();

    static {
        m0.r.b("GreedyScheduler");
    }

    public C0353c(Context context, C0329a c0329a, v0.i iVar, g gVar, C0403c c0403c, v0.i iVar2) {
        this.f4276b = context;
        m0.r rVar = c0329a.c;
        C0150G c0150g = c0329a.f3957f;
        this.f4277d = new C0351a(this, c0150g, rVar);
        this.f4286o = new C0354d(c0150g, c0403c);
        this.f4285n = iVar2;
        this.f4284m = new C0150G(iVar);
        this.f4281j = c0329a;
        this.h = gVar;
        this.f4280i = c0403c;
    }

    @Override // n0.i
    public final void a(String str) {
        Runnable runnable;
        if (this.f4283l == null) {
            this.f4283l = Boolean.valueOf(n.a(this.f4276b, this.f4281j));
        }
        if (!this.f4283l.booleanValue()) {
            m0.r.a().getClass();
            return;
        }
        if (!this.f4278e) {
            this.h.a(this);
            this.f4278e = true;
        }
        m0.r.a().getClass();
        C0351a c0351a = this.f4277d;
        if (c0351a != null && (runnable = (Runnable) c0351a.f4273d.remove(str)) != null) {
            ((Handler) c0351a.f4272b.f2846b).removeCallbacks(runnable);
        }
        for (m mVar : this.g.z(str)) {
            this.f4286o.a(mVar);
            C0403c c0403c = this.f4280i;
            c0403c.getClass();
            c0403c.p(mVar, -512);
        }
    }

    @Override // n0.i
    public final boolean b() {
        return false;
    }

    @Override // r0.e
    public final void c(o oVar, AbstractC0368c abstractC0368c) {
        j k2 = u2.d.k(oVar);
        boolean z3 = abstractC0368c instanceof C0366a;
        C0403c c0403c = this.f4280i;
        C0354d c0354d = this.f4286o;
        r rVar = this.g;
        if (z3) {
            if (rVar.b(k2)) {
                return;
            }
            m0.r a3 = m0.r.a();
            k2.toString();
            a3.getClass();
            m D = rVar.D(k2);
            c0354d.b(D);
            ((v0.i) c0403c.f5067d).f(new G.m((g) c0403c.c, D, (m0.r) null));
            return;
        }
        m0.r a4 = m0.r.a();
        k2.toString();
        a4.getClass();
        m A3 = rVar.A(k2);
        if (A3 != null) {
            c0354d.a(A3);
            int i3 = ((C0367b) abstractC0368c).f4630a;
            c0403c.getClass();
            c0403c.p(A3, i3);
        }
    }

    @Override // n0.c
    public final void d(j jVar, boolean z3) {
        Q q3;
        m A3 = this.g.A(jVar);
        if (A3 != null) {
            this.f4286o.a(A3);
        }
        synchronized (this.f4279f) {
            q3 = (Q) this.c.remove(jVar);
        }
        if (q3 != null) {
            m0.r a3 = m0.r.a();
            Objects.toString(jVar);
            a3.getClass();
            q3.a(null);
        }
        if (z3) {
            return;
        }
        synchronized (this.f4279f) {
            this.f4282k.remove(jVar);
        }
    }

    @Override // n0.i
    public final void e(o... oVarArr) {
        long max;
        if (this.f4283l == null) {
            this.f4283l = Boolean.valueOf(n.a(this.f4276b, this.f4281j));
        }
        if (!this.f4283l.booleanValue()) {
            m0.r.a().getClass();
            return;
        }
        if (!this.f4278e) {
            this.h.a(this);
            this.f4278e = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int length = oVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            o oVar = oVarArr[i4];
            if (!this.g.b(u2.d.k(oVar))) {
                synchronized (this.f4279f) {
                    try {
                        j k2 = u2.d.k(oVar);
                        C0352b c0352b = (C0352b) this.f4282k.get(k2);
                        if (c0352b == null) {
                            int i5 = oVar.f5098k;
                            this.f4281j.c.getClass();
                            c0352b = new C0352b(i5, System.currentTimeMillis());
                            this.f4282k.put(k2, c0352b);
                        }
                        max = (Math.max((oVar.f5098k - c0352b.f4274a) - 5, i3) * 30000) + c0352b.f4275b;
                    } finally {
                    }
                }
                long max2 = Math.max(oVar.a(), max);
                this.f4281j.c.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (oVar.f5092b == 1) {
                    if (currentTimeMillis < max2) {
                        C0351a c0351a = this.f4277d;
                        if (c0351a != null) {
                            HashMap hashMap = c0351a.f4273d;
                            Runnable runnable = (Runnable) hashMap.remove(oVar.f5091a);
                            C0150G c0150g = c0351a.f4272b;
                            if (runnable != null) {
                                ((Handler) c0150g.f2846b).removeCallbacks(runnable);
                            }
                            D0.c cVar = new D0.c(c0351a, oVar, 8, false);
                            hashMap.put(oVar.f5091a, cVar);
                            c0351a.c.getClass();
                            ((Handler) c0150g.f2846b).postDelayed(cVar, max2 - System.currentTimeMillis());
                        }
                    } else if (oVar.b()) {
                        if (oVar.f5097j.c) {
                            m0.r a3 = m0.r.a();
                            oVar.toString();
                            a3.getClass();
                        } else if (!r6.h.isEmpty()) {
                            m0.r a4 = m0.r.a();
                            oVar.toString();
                            a4.getClass();
                        } else {
                            hashSet.add(oVar);
                            hashSet2.add(oVar.f5091a);
                        }
                    } else if (!this.g.b(u2.d.k(oVar))) {
                        m0.r.a().getClass();
                        r rVar = this.g;
                        rVar.getClass();
                        m D = rVar.D(u2.d.k(oVar));
                        this.f4286o.b(D);
                        C0403c c0403c = this.f4280i;
                        ((v0.i) c0403c.f5067d).f(new G.m((g) c0403c.c, D, (m0.r) null));
                    }
                }
            }
            i4++;
            i3 = 0;
        }
        synchronized (this.f4279f) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    m0.r.a().getClass();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        o oVar2 = (o) it.next();
                        j k3 = u2.d.k(oVar2);
                        if (!this.c.containsKey(k3)) {
                            this.c.put(k3, k.a(this.f4284m, oVar2, (K) this.f4285n.c, this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
