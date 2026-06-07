package androidx.work.impl.foreground;

import D0.c;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.u;
import java.util.Objects;
import java.util.UUID;
import m0.r;
import n0.s;
import u0.C0393c;
import u0.InterfaceC0392b;
import w0.C0407b;

/* loaded from: classes.dex */
public class SystemForegroundService extends u implements InterfaceC0392b {
    public static final /* synthetic */ int g = 0;
    public Handler c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2209d;

    /* renamed from: e, reason: collision with root package name */
    public C0393c f2210e;

    /* renamed from: f, reason: collision with root package name */
    public NotificationManager f2211f;

    static {
        r.b("SystemFgService");
    }

    public final void a() {
        this.c = new Handler(Looper.getMainLooper());
        this.f2211f = (NotificationManager) getApplicationContext().getSystemService("notification");
        C0393c c0393c = new C0393c(getApplicationContext());
        this.f2210e = c0393c;
        if (c0393c.f5022j != null) {
            r.a().getClass();
        } else {
            c0393c.f5022j = this;
        }
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2210e.f();
    }

    @Override // androidx.lifecycle.u, android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i4) {
        super.onStartCommand(intent, i3, i4);
        if (this.f2209d) {
            r.a().getClass();
            this.f2210e.f();
            a();
            this.f2209d = false;
        }
        if (intent == null) {
            return 3;
        }
        C0393c c0393c = this.f2210e;
        c0393c.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            r a3 = r.a();
            Objects.toString(intent);
            a3.getClass();
            c0393c.c.f(new c(c0393c, intent.getStringExtra("KEY_WORKSPEC_ID"), 9, false));
            c0393c.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c0393c.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            r.a().getClass();
            InterfaceC0392b interfaceC0392b = c0393c.f5022j;
            if (interfaceC0392b == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0392b;
            systemForegroundService.f2209d = true;
            r.a().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        r a4 = r.a();
        Objects.toString(intent);
        a4.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID fromString = UUID.fromString(stringExtra);
        s sVar = c0393c.f5017b;
        sVar.getClass();
        sVar.g.f(new C0407b(sVar, fromString));
        return 3;
    }
}
