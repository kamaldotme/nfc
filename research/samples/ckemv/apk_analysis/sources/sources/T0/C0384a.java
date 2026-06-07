package t0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f.s;
import m0.r;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384a extends e {

    /* renamed from: f, reason: collision with root package name */
    public final s f4887f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384a(Context context, v0.i iVar, int i3) {
        super(context, iVar);
        this.g = i3;
        X1.g.e(iVar, "taskExecutor");
        this.f4887f = new s(2, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L21;
     */
    @Override // t0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        Context context = this.f4892b;
        switch (this.g) {
            case 0:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    return Boolean.valueOf(intExtra == 2 || intExtra == 5);
                }
                r a3 = r.a();
                int i3 = b.f4888a;
                a3.getClass();
                return Boolean.FALSE;
            case 1:
                Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 != null) {
                    return Boolean.valueOf(registerReceiver2.getIntExtra("status", -1) == 1 || ((float) registerReceiver2.getIntExtra("level", -1)) / ((float) registerReceiver2.getIntExtra("scale", -1)) > 0.15f);
                }
                r a4 = r.a();
                int i4 = c.f4889a;
                a4.getClass();
                return Boolean.FALSE;
            default:
                Intent registerReceiver3 = context.registerReceiver(null, e());
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (hashCode == -730838620) {
                            break;
                        }
                    }
                    return Boolean.valueOf(r3);
                }
                r3 = true;
                return Boolean.valueOf(r3);
        }
    }

    @Override // t0.e
    public final void c() {
        r a3 = r.a();
        int i3 = d.f4890a;
        a3.getClass();
        this.f4892b.registerReceiver(this.f4887f, e());
    }

    @Override // t0.e
    public final void d() {
        r a3 = r.a();
        int i3 = d.f4890a;
        a3.getClass();
        this.f4892b.unregisterReceiver(this.f4887f);
    }

    public final IntentFilter e() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    public final void f(Intent intent) {
        int i3 = this.g;
        X1.g.e(intent, "intent");
        switch (i3) {
            case 0:
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                r a3 = r.a();
                int i4 = b.f4888a;
                a3.getClass();
                switch (action.hashCode()) {
                    case -1886648615:
                        if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            b(Boolean.FALSE);
                            return;
                        }
                        return;
                    case -54942926:
                        if (action.equals("android.os.action.DISCHARGING")) {
                            b(Boolean.FALSE);
                            return;
                        }
                        return;
                    case 948344062:
                        if (action.equals("android.os.action.CHARGING")) {
                            b(Boolean.TRUE);
                            return;
                        }
                        return;
                    case 1019184907:
                        if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                            b(Boolean.TRUE);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 1:
                if (intent.getAction() == null) {
                    return;
                }
                r a4 = r.a();
                int i5 = c.f4889a;
                intent.getAction();
                a4.getClass();
                String action2 = intent.getAction();
                if (action2 != null) {
                    int hashCode = action2.hashCode();
                    if (hashCode == -1980154005) {
                        if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                            b(Boolean.TRUE);
                            return;
                        }
                        return;
                    } else {
                        if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                            b(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                if (intent.getAction() == null) {
                    return;
                }
                r a5 = r.a();
                int i6 = j.f4899a;
                intent.getAction();
                a5.getClass();
                String action3 = intent.getAction();
                if (action3 != null) {
                    int hashCode2 = action3.hashCode();
                    if (hashCode2 == -1181163412) {
                        if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            b(Boolean.FALSE);
                            return;
                        }
                        return;
                    } else {
                        if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            b(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}
