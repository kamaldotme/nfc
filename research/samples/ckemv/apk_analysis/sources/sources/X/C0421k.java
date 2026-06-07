package x;

import android.app.Activity;
import android.app.NotificationManager;
import java.util.HashSet;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421k {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f5192a;

    static {
        new HashSet();
    }

    public C0421k(Activity activity) {
        this.f5192a = (NotificationManager) activity.getSystemService("notification");
    }
}
