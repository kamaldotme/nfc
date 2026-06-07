package u0;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import e2.Q;
import f.C0150G;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.h;
import m0.r;
import n0.g;
import n0.m;
import n0.s;
import r0.AbstractC0368c;
import r0.C0367b;
import v0.i;
import v0.j;
import v0.o;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393c implements r0.e, n0.c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f5016k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final s f5017b;
    public final i c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5018d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public j f5019e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5020f;
    public final HashMap g;
    public final HashMap h;

    /* renamed from: i, reason: collision with root package name */
    public final C0150G f5021i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0392b f5022j;

    static {
        r.b("SystemFgDispatcher");
    }

    public C0393c(Context context) {
        s p02 = s.p0(context);
        this.f5017b = p02;
        this.c = p02.g;
        this.f5019e = null;
        this.f5020f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.f5021i = new C0150G(p02.f4214m);
        p02.f4210i.a(this);
    }

    public static Intent a(Context context, j jVar, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f3974a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f3975b);
        intent.putExtra("KEY_NOTIFICATION", hVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f5079a);
        intent.putExtra("KEY_GENERATION", jVar.f5080b);
        return intent;
    }

    public static Intent b(Context context, j jVar, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f5079a);
        intent.putExtra("KEY_GENERATION", jVar.f5080b);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f3974a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f3975b);
        intent.putExtra("KEY_NOTIFICATION", hVar.c);
        return intent;
    }

    @Override // r0.e
    public final void c(o oVar, AbstractC0368c abstractC0368c) {
        if (abstractC0368c instanceof C0367b) {
            String str = oVar.f5091a;
            r.a().getClass();
            j k2 = u2.d.k(oVar);
            s sVar = this.f5017b;
            sVar.getClass();
            m mVar = new m(k2);
            g gVar = sVar.f4210i;
            X1.g.e(gVar, "processor");
            sVar.g.f(new w0.o(gVar, mVar, true, -512));
        }
    }

    @Override // n0.c
    public final void d(j jVar, boolean z3) {
        Map.Entry entry;
        synchronized (this.f5018d) {
            try {
                Q q3 = ((o) this.g.remove(jVar)) != null ? (Q) this.h.remove(jVar) : null;
                if (q3 != null) {
                    q3.a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f5020f.remove(jVar);
        if (jVar.equals(this.f5019e)) {
            if (this.f5020f.size() > 0) {
                Iterator it = this.f5020f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f5019e = (j) entry.getKey();
                if (this.f5022j != null) {
                    h hVar2 = (h) entry.getValue();
                    InterfaceC0392b interfaceC0392b = this.f5022j;
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0392b;
                    systemForegroundService.c.post(new RunnableC0394d(systemForegroundService, hVar2.f3974a, hVar2.c, hVar2.f3975b));
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f5022j;
                    systemForegroundService2.c.post(new G.a(hVar2.f3974a, 3, systemForegroundService2));
                }
            } else {
                this.f5019e = null;
            }
        }
        InterfaceC0392b interfaceC0392b2 = this.f5022j;
        if (hVar == null || interfaceC0392b2 == null) {
            return;
        }
        r a3 = r.a();
        jVar.toString();
        a3.getClass();
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0392b2;
        systemForegroundService3.c.post(new G.a(hVar.f3974a, 3, systemForegroundService3));
    }

    public final void e(Intent intent) {
        int i3 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        j jVar = new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        r.a().getClass();
        if (notification == null || this.f5022j == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f5020f;
        linkedHashMap.put(jVar, hVar);
        if (this.f5019e == null) {
            this.f5019e = jVar;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.f5022j;
            systemForegroundService.c.post(new RunnableC0394d(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f5022j;
        systemForegroundService2.c.post(new F0.b(systemForegroundService2, intExtra, notification, 5));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i3 |= ((h) ((Map.Entry) it.next()).getValue()).f3975b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f5019e);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f5022j;
            systemForegroundService3.c.post(new RunnableC0394d(systemForegroundService3, hVar2.f3974a, hVar2.c, i3));
        }
    }

    public final void f() {
        this.f5022j = null;
        synchronized (this.f5018d) {
            try {
                Iterator it = this.h.values().iterator();
                while (it.hasNext()) {
                    ((Q) it.next()).a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5017b.f4210i.f(this);
    }
}
