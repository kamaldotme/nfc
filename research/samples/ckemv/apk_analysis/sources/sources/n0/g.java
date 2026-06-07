package n0;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import f.ExecutorC0145B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import m0.C0329a;
import u0.C0393c;
import u0.InterfaceC0391a;
import x0.C0422a;
import x0.C0432k;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0391a {

    /* renamed from: b, reason: collision with root package name */
    public final Context f4179b;
    public final C0329a c;

    /* renamed from: d, reason: collision with root package name */
    public final v0.i f4180d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f4181e;
    public final HashMap g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4182f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f4183i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4184j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f4178a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4185k = new Object();
    public final HashMap h = new HashMap();

    static {
        m0.r.b("Processor");
    }

    public g(Context context, C0329a c0329a, v0.i iVar, WorkDatabase workDatabase) {
        this.f4179b = context;
        this.c = c0329a;
        this.f4180d = iVar;
        this.f4181e = workDatabase;
    }

    public static boolean d(u uVar, int i3) {
        if (uVar == null) {
            m0.r.a().getClass();
            return false;
        }
        uVar.f4234r = i3;
        uVar.h();
        uVar.f4233q.cancel(true);
        if (uVar.f4223e == null || !(uVar.f4233q.f5210a instanceof C0422a)) {
            Objects.toString(uVar.f4222d);
            m0.r.a().getClass();
        } else {
            uVar.f4223e.e(i3);
        }
        m0.r.a().getClass();
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f4185k) {
            this.f4184j.add(cVar);
        }
    }

    public final u b(String str) {
        u uVar = (u) this.f4182f.remove(str);
        boolean z3 = uVar != null;
        if (!z3) {
            uVar = (u) this.g.remove(str);
        }
        this.h.remove(str);
        if (z3) {
            synchronized (this.f4185k) {
                try {
                    if (!(true ^ this.f4182f.isEmpty())) {
                        Context context = this.f4179b;
                        int i3 = C0393c.f5016k;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f4179b.startService(intent);
                        } catch (Throwable unused) {
                            m0.r.a().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.f4178a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f4178a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return uVar;
    }

    public final u c(String str) {
        u uVar = (u) this.f4182f.get(str);
        return uVar == null ? (u) this.g.get(str) : uVar;
    }

    public final boolean e(String str) {
        boolean z3;
        synchronized (this.f4185k) {
            z3 = c(str) != null;
        }
        return z3;
    }

    public final void f(c cVar) {
        synchronized (this.f4185k) {
            this.f4184j.remove(cVar);
        }
    }

    public final void g(String str, m0.h hVar) {
        synchronized (this.f4185k) {
            try {
                m0.r.a().getClass();
                u uVar = (u) this.g.remove(str);
                if (uVar != null) {
                    if (this.f4178a == null) {
                        PowerManager.WakeLock a3 = w0.p.a(this.f4179b, "ProcessorForegroundLck");
                        this.f4178a = a3;
                        a3.acquire();
                    }
                    this.f4182f.put(str, uVar);
                    y.e.b(this.f4179b, C0393c.b(this.f4179b, u2.d.k(uVar.f4222d), hVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(m mVar, m0.r rVar) {
        final v0.j jVar = mVar.f4194a;
        final String str = jVar.f5079a;
        final ArrayList arrayList = new ArrayList();
        v0.o oVar = (v0.o) this.f4181e.o(new Callable() { // from class: n0.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = g.this.f4181e;
                v0.r v3 = workDatabase.v();
                String str2 = str;
                arrayList.addAll(v3.t(str2));
                return workDatabase.u().i(str2);
            }
        });
        if (oVar == null) {
            m0.r a3 = m0.r.a();
            jVar.toString();
            a3.getClass();
            ((ExecutorC0445a) this.f4180d.f5078e).execute(new Runnable() { // from class: n0.f

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f4177d = false;

                @Override // java.lang.Runnable
                public final void run() {
                    g gVar = g.this;
                    v0.j jVar2 = jVar;
                    boolean z3 = this.f4177d;
                    synchronized (gVar.f4185k) {
                        try {
                            Iterator it = gVar.f4184j.iterator();
                            while (it.hasNext()) {
                                ((c) it.next()).d(jVar2, z3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            return false;
        }
        synchronized (this.f4185k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.h.get(str);
                    if (((m) set.iterator().next()).f4194a.f5080b == jVar.f5080b) {
                        set.add(mVar);
                        m0.r a4 = m0.r.a();
                        jVar.toString();
                        a4.getClass();
                    } else {
                        ((ExecutorC0445a) this.f4180d.f5078e).execute(new Runnable() { // from class: n0.f

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ boolean f4177d = false;

                            @Override // java.lang.Runnable
                            public final void run() {
                                g gVar = g.this;
                                v0.j jVar2 = jVar;
                                boolean z3 = this.f4177d;
                                synchronized (gVar.f4185k) {
                                    try {
                                        Iterator it = gVar.f4184j.iterator();
                                        while (it.hasNext()) {
                                            ((c) it.next()).d(jVar2, z3);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    }
                    return false;
                }
                if (oVar.f5107t != jVar.f5080b) {
                    ((ExecutorC0445a) this.f4180d.f5078e).execute(new Runnable() { // from class: n0.f

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ boolean f4177d = false;

                        @Override // java.lang.Runnable
                        public final void run() {
                            g gVar = g.this;
                            v0.j jVar2 = jVar;
                            boolean z3 = this.f4177d;
                            synchronized (gVar.f4185k) {
                                try {
                                    Iterator it = gVar.f4184j.iterator();
                                    while (it.hasNext()) {
                                        ((c) it.next()).d(jVar2, z3);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                    return false;
                }
                u uVar = new u(new t(this.f4179b, this.c, this.f4180d, this, this.f4181e, oVar, arrayList));
                C0432k c0432k = uVar.f4232p;
                c0432k.a(new androidx.emoji2.text.k(this, c0432k, uVar, 1), (ExecutorC0445a) this.f4180d.f5078e);
                this.g.put(str, uVar);
                HashSet hashSet = new HashSet();
                hashSet.add(mVar);
                this.h.put(str, hashSet);
                ((ExecutorC0145B) this.f4180d.f5076b).execute(uVar);
                m0.r a5 = m0.r.a();
                jVar.toString();
                a5.getClass();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
