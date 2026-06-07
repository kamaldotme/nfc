package u0;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0394d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5023b;
    public final /* synthetic */ Notification c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f5025e;

    public RunnableC0394d(SystemForegroundService systemForegroundService, int i3, Notification notification, int i4) {
        this.f5025e = systemForegroundService;
        this.f5023b = i3;
        this.c = notification;
        this.f5024d = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.f5024d;
        Notification notification = this.c;
        int i5 = this.f5023b;
        SystemForegroundService systemForegroundService = this.f5025e;
        if (i3 >= 31) {
            AbstractC0396f.a(systemForegroundService, i5, notification, i4);
        } else if (i3 >= 29) {
            AbstractC0395e.a(systemForegroundService, i5, notification, i4);
        } else {
            systemForegroundService.startForeground(i5, notification);
        }
    }
}
