package f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import t0.C0384a;

/* loaded from: classes.dex */
public final class s extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2931b;

    public /* synthetic */ s(int i3, Object obj) {
        this.f2930a = i3;
        this.f2931b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2930a) {
            case 0:
                ((A1.f) this.f2931b).i();
                return;
            case 1:
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    ((n1.f) this.f2931b).f4242d.post(new J1.e(this, intent.getIntExtra("plugged", -1) <= 0, 3));
                    return;
                }
                return;
            default:
                X1.g.e(context, "context");
                X1.g.e(intent, "intent");
                ((C0384a) this.f2931b).f(intent);
                return;
        }
    }
}
