package t0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import m0.r;

/* loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f4896a;

    public g(h hVar) {
        this.f4896a = hVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        X1.g.e(network, "network");
        X1.g.e(networkCapabilities, "capabilities");
        r a3 = r.a();
        int i3 = i.f4898a;
        networkCapabilities.toString();
        a3.getClass();
        h hVar = this.f4896a;
        hVar.b(i.a(hVar.f4897f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        X1.g.e(network, "network");
        r a3 = r.a();
        int i3 = i.f4898a;
        a3.getClass();
        h hVar = this.f4896a;
        hVar.b(i.a(hVar.f4897f));
    }
}
