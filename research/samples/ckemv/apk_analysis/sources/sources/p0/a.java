package p0;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i3, long j3, PendingIntent pendingIntent) {
        alarmManager.setExact(i3, j3, pendingIntent);
    }
}
