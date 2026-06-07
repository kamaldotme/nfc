package f;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class r extends A1.f {
    public final /* synthetic */ int c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f2928d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, v0.m mVar) {
        super(vVar);
        this.f2928d = vVar;
        this.f2929e = mVar;
    }

    @Override // A1.f
    public final IntentFilter e() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, f.D] */
    @Override // A1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f() {
        Location location;
        long j3;
        boolean z3;
        switch (this.c) {
            case 0:
                return ((PowerManager) this.f2929e).isPowerSaveMode() ? 2 : 1;
            default:
                v0.m mVar = (v0.m) this.f2929e;
                C0148E c0148e = (C0148E) mVar.f5088e;
                if (c0148e.f2843b > System.currentTimeMillis()) {
                    z3 = c0148e.f2842a;
                } else {
                    Context context = (Context) mVar.c;
                    int b3 = y.f.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location2 = null;
                    LocationManager locationManager = (LocationManager) mVar.f5087d;
                    if (b3 == 0) {
                        if (locationManager.isProviderEnabled("network")) {
                            location = locationManager.getLastKnownLocation("network");
                            if (y.f.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                try {
                                    if (locationManager.isProviderEnabled("gps")) {
                                        location2 = locationManager.getLastKnownLocation("gps");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (location2 != null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                                location = location2;
                            }
                            if (location != null) {
                                int i3 = Calendar.getInstance().get(11);
                                return (i3 < 6 || i3 >= 22) ? 2 : 1;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            if (C0147D.f2839d == null) {
                                C0147D.f2839d = new Object();
                            }
                            C0147D c0147d = C0147D.f2839d;
                            c0147d.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                            c0147d.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                            boolean z4 = c0147d.c == 1;
                            long j4 = c0147d.f2841b;
                            long j5 = c0147d.f2840a;
                            c0147d.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                            long j6 = c0147d.f2841b;
                            if (j4 == -1 || j5 == -1) {
                                j3 = currentTimeMillis + 43200000;
                            } else {
                                if (currentTimeMillis <= j5) {
                                    j6 = currentTimeMillis > j4 ? j5 : j4;
                                }
                                j3 = j6 + 60000;
                            }
                            c0148e.f2842a = z4;
                            c0148e.f2843b = j3;
                            z3 = z4;
                        }
                    }
                    location = null;
                    if (y.f.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    }
                    if (location2 != null) {
                    }
                    location = location2;
                    if (location != null) {
                    }
                }
                if (!z3) {
                    return 1;
                }
                break;
        }
    }

    @Override // A1.f
    public final void i() {
        switch (this.c) {
            case 0:
                this.f2928d.m(true, true);
                return;
            default:
                this.f2928d.m(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, Context context) {
        super(vVar);
        this.f2928d = vVar;
        this.f2929e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
