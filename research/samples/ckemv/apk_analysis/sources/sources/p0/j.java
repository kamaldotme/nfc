package p0;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import m0.C0329a;
import m0.r;
import n0.s;
import v0.C0403c;
import w0.p;
import w0.x;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public final class j implements n0.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f4319l = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4320b;
    public final v0.i c;

    /* renamed from: d, reason: collision with root package name */
    public final x f4321d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.g f4322e;

    /* renamed from: f, reason: collision with root package name */
    public final s f4323f;
    public final c g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public Intent f4324i;

    /* renamed from: j, reason: collision with root package name */
    public i f4325j;

    /* renamed from: k, reason: collision with root package name */
    public final C0403c f4326k;

    static {
        r.b("SystemAlarmDispatcher");
    }

    public j(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4320b = applicationContext;
        v0.r rVar = new v0.r();
        s p02 = s.p0(context);
        this.f4323f = p02;
        C0329a c0329a = p02.f4208e;
        this.g = new c(applicationContext, c0329a.c, rVar);
        this.f4321d = new x(c0329a.f3957f);
        n0.g gVar = p02.f4210i;
        this.f4322e = gVar;
        v0.i iVar = p02.g;
        this.c = iVar;
        this.f4326k = new C0403c(gVar, iVar);
        gVar.a(this);
        this.h = new ArrayList();
        this.f4324i = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i3) {
        r a3 = r.a();
        Objects.toString(intent);
        a3.getClass();
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            r.a().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.h) {
                try {
                    Iterator it = this.h.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i3);
        synchronized (this.h) {
            try {
                boolean z3 = !this.h.isEmpty();
                this.h.add(intent);
                if (!z3) {
                    c();
                }
            } finally {
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock a3 = p.a(this.f4320b, "ProcessCommand");
        try {
            a3.acquire();
            this.f4323f.g.f(new h(this, 0));
        } finally {
            a3.release();
        }
    }

    @Override // n0.c
    public final void d(v0.j jVar, boolean z3) {
        ExecutorC0445a executorC0445a = (ExecutorC0445a) this.c.f5078e;
        int i3 = c.g;
        Intent intent = new Intent(this.f4320b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        c.c(intent, jVar);
        executorC0445a.execute(new F0.b(this, intent, 0, 4));
    }
}
