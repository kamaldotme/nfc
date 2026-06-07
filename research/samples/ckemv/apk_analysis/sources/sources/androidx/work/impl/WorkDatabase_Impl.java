package androidx.work.impl;

import X1.g;
import a0.b;
import a0.f;
import android.content.Context;
import e0.C0117a;
import e0.c;
import f.C0150G;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n0.d;
import n0.q;
import v0.C0402b;
import v0.C0403c;
import v0.e;
import v0.h;
import v0.i;
import v0.l;
import v0.m;
import v0.p;
import v0.r;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k, reason: collision with root package name */
    public volatile p f2196k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0403c f2197l;

    /* renamed from: m, reason: collision with root package name */
    public volatile r f2198m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i f2199n;

    /* renamed from: o, reason: collision with root package name */
    public volatile l f2200o;

    /* renamed from: p, reason: collision with root package name */
    public volatile m f2201p;

    /* renamed from: q, reason: collision with root package name */
    public volatile e f2202q;

    @Override // androidx.work.impl.WorkDatabase
    public final f d() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c e(b bVar) {
        J1.l lVar = new J1.l(bVar, new C0150G(this));
        Context context = bVar.f1377a;
        g.e(context, "context");
        return bVar.c.c(new C0117a(context, bVar.f1378b, lVar, false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0403c f() {
        C0403c c0403c;
        if (this.f2197l != null) {
            return this.f2197l;
        }
        synchronized (this) {
            try {
                if (this.f2197l == null) {
                    this.f2197l = new C0403c(this);
                }
                c0403c = this.f2197l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0403c;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(LinkedHashMap linkedHashMap) {
        int i3 = 13;
        int i4 = 17;
        int i5 = 18;
        return Arrays.asList(new d(i3, 14, 10), new q(0), new d(16, i4, 11), new d(i4, i5, 12), new d(i5, 19, i3), new q(1));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(p.class, Collections.emptyList());
        hashMap.put(C0403c.class, Collections.emptyList());
        hashMap.put(r.class, Collections.emptyList());
        hashMap.put(i.class, Collections.emptyList());
        hashMap.put(l.class, Collections.emptyList());
        hashMap.put(m.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(v0.f.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e m() {
        e eVar;
        if (this.f2202q != null) {
            return this.f2202q;
        }
        synchronized (this) {
            try {
                if (this.f2202q == null) {
                    this.f2202q = new e(this);
                }
                eVar = this.f2202q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [v0.i, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final i q() {
        i iVar;
        if (this.f2199n != null) {
            return this.f2199n;
        }
        synchronized (this) {
            try {
                if (this.f2199n == null) {
                    ?? obj = new Object();
                    obj.f5076b = this;
                    obj.c = new C0402b(this, 2);
                    obj.f5077d = new h(this, 0);
                    obj.f5078e = new h(this, 1);
                    this.f2199n = obj;
                }
                iVar = this.f2199n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l s() {
        l lVar;
        if (this.f2200o != null) {
            return this.f2200o;
        }
        synchronized (this) {
            try {
                if (this.f2200o == null) {
                    this.f2200o = new l(this);
                }
                lVar = this.f2200o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m t() {
        m mVar;
        if (this.f2201p != null) {
            return this.f2201p;
        }
        synchronized (this) {
            try {
                if (this.f2201p == null) {
                    this.f2201p = new m(this);
                }
                mVar = this.f2201p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p u() {
        p pVar;
        if (this.f2196k != null) {
            return this.f2196k;
        }
        synchronized (this) {
            try {
                if (this.f2196k == null) {
                    this.f2196k = new p(this);
                }
                pVar = this.f2196k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [v0.r, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final r v() {
        r rVar;
        if (this.f2198m != null) {
            return this.f2198m;
        }
        synchronized (this) {
            try {
                if (this.f2198m == null) {
                    ?? obj = new Object();
                    obj.f5124b = this;
                    obj.c = new C0402b(this, 6);
                    new h(this, 20);
                    this.f2198m = obj;
                }
                rVar = this.f2198m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
