package p0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;
import m0.r;

/* loaded from: classes.dex */
public abstract class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4302a = 0;

    static {
        r.b("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r a3 = r.a();
        Objects.toString(intent);
        a3.getClass();
        int i3 = c.g;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
