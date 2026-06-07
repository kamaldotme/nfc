package G;

import J.h0;
import J.l0;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.C0070g;
import androidx.fragment.app.T;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import m0.r;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f204b = 0;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f205d;

    /* renamed from: e, reason: collision with root package name */
    public Object f206e;

    public /* synthetic */ m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f204b) {
            case 0:
                try {
                    obj = ((Callable) this.c).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f206e).post(new D0.c((g) this.f205d, 2, obj));
                return;
            case 1:
                h0.h((View) this.c, (v0.e) this.f205d);
                ((ValueAnimator) this.f206e).start();
                return;
            case 2:
                List list = (List) this.c;
                T t3 = (T) this.f205d;
                if (list.contains(t3)) {
                    list.remove(t3);
                    ((C0070g) this.f206e).getClass();
                    X.d.a(t3.c.f1957F, t3.f1881a);
                    return;
                }
                return;
            case 3:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f206e;
                Context context = (Context) this.f205d;
                Intent intent = (Intent) this.c;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    r a3 = r.a();
                    int i3 = ConstraintProxyUpdateReceiver.f2203a;
                    a3.getClass();
                    w0.m.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    w0.m.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    w0.m.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    w0.m.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            default:
                ((n0.g) this.c).h((n0.m) this.f205d, (r) this.f206e);
                return;
        }
    }

    public m(n0.g gVar, n0.m mVar, r rVar) {
        X1.g.e(gVar, "processor");
        this.c = gVar;
        this.f205d = mVar;
        this.f206e = rVar;
    }

    public m(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.f205d = context;
        this.f206e = pendingResult;
    }

    public m(C0070g c0070g, ArrayList arrayList, T t3) {
        this.f206e = c0070g;
        this.c = arrayList;
        this.f205d = t3;
    }

    public m(View view, l0 l0Var, v0.e eVar, ValueAnimator valueAnimator) {
        this.c = view;
        this.f205d = eVar;
        this.f206e = valueAnimator;
    }
}
