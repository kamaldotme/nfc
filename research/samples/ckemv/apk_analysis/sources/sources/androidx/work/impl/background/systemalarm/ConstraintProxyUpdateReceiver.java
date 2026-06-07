package androidx.work.impl.background.systemalarm;

import G.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import m0.r;
import n0.s;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2203a = 0;

    static {
        r.b("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            r.a().getClass();
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        s.p0(context).g.f(new m(intent, context, goAsync));
    }
}
