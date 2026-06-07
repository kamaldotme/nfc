package androidx.work.impl;

import L1.t;
import L1.u;
import L1.v;
import X1.g;
import a0.b;
import a0.f;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import e0.c;
import f0.C0167c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v0.C0403c;
import v0.e;
import v0.i;
import v0.l;
import v0.m;
import v0.p;
import v0.r;

/* loaded from: classes.dex */
public abstract class WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0167c f2189a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f2190b;
    public c c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2192e;

    /* renamed from: f, reason: collision with root package name */
    public List f2193f;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f2195j;

    /* renamed from: d, reason: collision with root package name */
    public final f f2191d = d();
    public final LinkedHashMap g = new LinkedHashMap();
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f2194i = new ThreadLocal();

    public WorkDatabase() {
        g.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f2195j = new LinkedHashMap();
    }

    public static Object r(Class cls, c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof a0.c) {
            return r(cls, ((a0.c) cVar).a());
        }
        return null;
    }

    public final void a() {
        if (this.f2192e) {
            return;
        }
        if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public final void b() {
        if (!h().s().G() && this.f2194i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        C0167c s3 = h().s();
        this.f2191d.c(s3);
        if (s3.I()) {
            s3.b();
        } else {
            s3.a();
        }
    }

    public abstract f d();

    public abstract c e(b bVar);

    public abstract C0403c f();

    public List g(LinkedHashMap linkedHashMap) {
        g.e(linkedHashMap, "autoMigrationSpecs");
        return t.f622b;
    }

    public final c h() {
        c cVar = this.c;
        if (cVar != null) {
            return cVar;
        }
        g.h("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return v.f624b;
    }

    public Map j() {
        return u.f623b;
    }

    public final void k() {
        h().s().o();
        if (h().s().G()) {
            return;
        }
        f fVar = this.f2191d;
        if (fVar.f1393e.compareAndSet(false, true)) {
            Executor executor = fVar.f1390a.f2190b;
            if (executor != null) {
                executor.execute(fVar.f1398l);
            } else {
                g.h("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final boolean l() {
        C0167c c0167c = this.f2189a;
        return g.a(c0167c != null ? Boolean.valueOf(c0167c.isOpen()) : null, Boolean.TRUE);
    }

    public abstract e m();

    public final Cursor n(e0.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? h().s().K(eVar, cancellationSignal) : h().s().J(eVar);
    }

    public final Object o(Callable callable) {
        c();
        try {
            Object call = callable.call();
            p();
            return call;
        } finally {
            k();
        }
    }

    public final void p() {
        h().s().M();
    }

    public abstract i q();

    public abstract l s();

    public abstract m t();

    public abstract p u();

    public abstract r v();
}
