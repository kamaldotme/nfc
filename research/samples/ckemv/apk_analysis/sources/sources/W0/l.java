package w0;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class l {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        X1.g.e(connectivityManager, "<this>");
        X1.g.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
