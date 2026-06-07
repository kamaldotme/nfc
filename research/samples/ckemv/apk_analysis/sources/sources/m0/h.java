package m0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3974a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3975b;
    public final Notification c;

    public h(int i3, Notification notification, int i4) {
        this.f3974a = i3;
        this.c = notification;
        this.f3975b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3974a == hVar.f3974a && this.f3975b == hVar.f3975b) {
            return this.c.equals(hVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f3974a * 31) + this.f3975b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f3974a + ", mForegroundServiceType=" + this.f3975b + ", mNotification=" + this.c + '}';
    }
}
