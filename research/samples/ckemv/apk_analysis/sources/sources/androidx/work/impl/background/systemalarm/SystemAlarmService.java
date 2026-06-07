package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.u;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.r;
import p0.i;
import p0.j;
import w0.p;
import w0.q;

/* loaded from: classes.dex */
public class SystemAlarmService extends u implements i {
    public j c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2204d;

    static {
        r.b("SystemAlarmService");
    }

    public final void a() {
        this.f2204d = true;
        r.a().getClass();
        int i3 = p.f5162a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (q.f5163a) {
            linkedHashMap.putAll(q.f5164b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                r.a().getClass();
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.c = jVar;
        if (jVar.f4325j != null) {
            r.a().getClass();
        } else {
            jVar.f4325j = this;
        }
        this.f2204d = false;
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2204d = true;
        j jVar = this.c;
        jVar.getClass();
        r.a().getClass();
        jVar.f4322e.f(jVar);
        jVar.f4325j = null;
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i4) {
        super.onStartCommand(intent, i3, i4);
        if (this.f2204d) {
            r.a().getClass();
            j jVar = this.c;
            jVar.getClass();
            r.a().getClass();
            jVar.f4322e.f(jVar);
            jVar.f4325j = null;
            j jVar2 = new j(this);
            this.c = jVar2;
            if (jVar2.f4325j != null) {
                r.a().getClass();
            } else {
                jVar2.f4325j = this;
            }
            this.f2204d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.c.a(intent, i4);
        return 3;
    }
}
