package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import m0.r;
import m0.t;
import n0.n;
import n0.s;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        r.b("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        r.a().getClass();
        try {
            s p02 = s.p0(context);
            List singletonList = Collections.singletonList((t) new m0.s(0, DiagnosticsWorker.class).b());
            if (singletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new n(p02, null, 2, singletonList).Q();
        } catch (IllegalStateException unused) {
            r.a().getClass();
        }
    }
}
