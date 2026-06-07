package w0;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class k {
    public static final Network a(ConnectivityManager connectivityManager) {
        X1.g.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
