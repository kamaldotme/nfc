package u0;

import android.app.Notification;
import android.app.Service;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0395e {
    public static void a(Service service, int i3, Notification notification, int i4) {
        service.startForeground(i3, notification, i4);
    }
}
