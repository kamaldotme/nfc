package w0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public abstract class j {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        X1.g.e(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i3) {
        X1.g.e(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i3);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        X1.g.e(connectivityManager, "<this>");
        X1.g.e(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
