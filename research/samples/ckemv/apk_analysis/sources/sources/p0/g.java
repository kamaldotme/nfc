package p0;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e2.K;
import e2.U;
import f.C0150G;
import f.ExecutorC0145B;
import java.util.Objects;
import m0.r;
import n0.m;
import r0.AbstractC0368c;
import r0.C0366a;
import r0.k;
import v0.o;
import w0.p;
import w0.v;
import w0.w;
import w0.x;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public final class g implements r0.e, v {

    /* renamed from: b, reason: collision with root package name */
    public final Context f4307b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final v0.j f4308d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4309e;

    /* renamed from: f, reason: collision with root package name */
    public final C0150G f4310f;
    public final Object g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final ExecutorC0145B f4311i;

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorC0445a f4312j;

    /* renamed from: k, reason: collision with root package name */
    public PowerManager.WakeLock f4313k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4314l;

    /* renamed from: m, reason: collision with root package name */
    public final m f4315m;

    /* renamed from: n, reason: collision with root package name */
    public final K f4316n;

    /* renamed from: o, reason: collision with root package name */
    public volatile U f4317o;

    static {
        r.b("DelayMetCommandHandler");
    }

    public g(Context context, int i3, j jVar, m mVar) {
        this.f4307b = context;
        this.c = i3;
        this.f4309e = jVar;
        this.f4308d = mVar.f4194a;
        this.f4315m = mVar;
        v0.i iVar = jVar.f4323f.f4214m;
        v0.i iVar2 = jVar.c;
        this.f4311i = (ExecutorC0145B) iVar2.f5076b;
        this.f4312j = (ExecutorC0445a) iVar2.f5078e;
        this.f4316n = (K) iVar2.c;
        this.f4310f = new C0150G(iVar);
        this.f4314l = false;
        this.h = 0;
        this.g = new Object();
    }

    public static void a(g gVar) {
        v0.j jVar = gVar.f4308d;
        String str = jVar.f5079a;
        if (gVar.h >= 2) {
            r.a().getClass();
            return;
        }
        gVar.h = 2;
        r.a().getClass();
        Context context = gVar.f4307b;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.c(intent, jVar);
        j jVar2 = gVar.f4309e;
        int i3 = gVar.c;
        F0.b bVar = new F0.b(jVar2, intent, i3, 4);
        ExecutorC0445a executorC0445a = gVar.f4312j;
        executorC0445a.execute(bVar);
        if (!jVar2.f4322e.e(jVar.f5079a)) {
            r.a().getClass();
            return;
        }
        r.a().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.c(intent2, jVar);
        executorC0445a.execute(new F0.b(jVar2, intent2, i3, 4));
    }

    public static void b(g gVar) {
        if (gVar.h != 0) {
            r a3 = r.a();
            Objects.toString(gVar.f4308d);
            a3.getClass();
            return;
        }
        gVar.h = 1;
        r a4 = r.a();
        Objects.toString(gVar.f4308d);
        a4.getClass();
        if (!gVar.f4309e.f4322e.h(gVar.f4315m, null)) {
            gVar.d();
            return;
        }
        x xVar = gVar.f4309e.f4321d;
        v0.j jVar = gVar.f4308d;
        synchronized (xVar.f5178d) {
            r a5 = r.a();
            Objects.toString(jVar);
            a5.getClass();
            xVar.a(jVar);
            w wVar = new w(xVar, jVar);
            xVar.f5177b.put(jVar, wVar);
            xVar.c.put(jVar, gVar);
            ((Handler) xVar.f5176a.f2846b).postDelayed(wVar, 600000L);
        }
    }

    @Override // r0.e
    public final void c(o oVar, AbstractC0368c abstractC0368c) {
        boolean z3 = abstractC0368c instanceof C0366a;
        ExecutorC0145B executorC0145B = this.f4311i;
        if (z3) {
            executorC0145B.execute(new f(this, 1));
        } else {
            executorC0145B.execute(new f(this, 0));
        }
    }

    public final void d() {
        synchronized (this.g) {
            try {
                if (this.f4317o != null) {
                    this.f4317o.a(null);
                }
                this.f4309e.f4321d.a(this.f4308d);
                PowerManager.WakeLock wakeLock = this.f4313k;
                if (wakeLock != null && wakeLock.isHeld()) {
                    r a3 = r.a();
                    Objects.toString(this.f4313k);
                    Objects.toString(this.f4308d);
                    a3.getClass();
                    this.f4313k.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        String str = this.f4308d.f5079a;
        this.f4313k = p.a(this.f4307b, str + " (" + this.c + ")");
        r a3 = r.a();
        Objects.toString(this.f4313k);
        a3.getClass();
        this.f4313k.acquire();
        o i3 = this.f4309e.f4323f.f4209f.u().i(str);
        if (i3 == null) {
            this.f4311i.execute(new f(this, 0));
            return;
        }
        boolean b3 = i3.b();
        this.f4314l = b3;
        if (b3) {
            this.f4317o = k.a(this.f4310f, i3, this.f4316n, this);
        } else {
            r.a().getClass();
            this.f4311i.execute(new f(this, 1));
        }
    }

    public final void f(boolean z3) {
        r a3 = r.a();
        v0.j jVar = this.f4308d;
        Objects.toString(jVar);
        a3.getClass();
        d();
        int i3 = this.c;
        j jVar2 = this.f4309e;
        ExecutorC0445a executorC0445a = this.f4312j;
        Context context = this.f4307b;
        if (z3) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.c(intent, jVar);
            executorC0445a.execute(new F0.b(jVar2, intent, i3, 4));
        }
        if (this.f4314l) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executorC0445a.execute(new F0.b(jVar2, intent2, i3, 4));
        }
    }
}
