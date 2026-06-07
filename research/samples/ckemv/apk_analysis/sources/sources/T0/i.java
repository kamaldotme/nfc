package t0;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import m0.r;
import r0.C0369d;
import w0.k;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4898a = 0;

    static {
        X1.g.d(r.b("NetworkStateTracker"), "tagWithPrefix(\"NetworkStateTracker\")");
    }

    public static final C0369d a(ConnectivityManager connectivityManager) {
        boolean z3;
        NetworkCapabilities a3;
        X1.g.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z4 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a3 = w0.j.a(connectivityManager, k.a(connectivityManager));
        } catch (SecurityException unused) {
            r.a().getClass();
        }
        if (a3 != null) {
            z3 = w0.j.b(a3, 16);
            return new C0369d(z4, z3, E.a.a(connectivityManager), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z3 = false;
        return new C0369d(z4, z3, E.a.a(connectivityManager), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
