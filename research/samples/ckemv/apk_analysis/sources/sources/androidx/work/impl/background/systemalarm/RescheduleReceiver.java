package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import m0.r;
import n0.s;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        r.b("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r a3 = r.a();
        Objects.toString(intent);
        a3.getClass();
        try {
            s p02 = s.p0(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (s.f4206p) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = p02.f4213l;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    p02.f4213l = goAsync;
                    if (p02.f4212k) {
                        goAsync.finish();
                        p02.f4213l = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
            r.a().getClass();
        }
    }
}
