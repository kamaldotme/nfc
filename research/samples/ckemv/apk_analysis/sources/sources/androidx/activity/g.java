package androidx.activity;

import I1.x;
import a.AbstractC0059a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import f.AbstractActivityC0159g;
import x.AbstractC0411a;
import x.AbstractC0414d;

/* loaded from: classes.dex */
public final class g extends androidx.activity.result.g {
    public final /* synthetic */ k h;

    public g(AbstractActivityC0159g abstractActivityC0159g) {
        this.h = abstractActivityC0159g;
    }

    @Override // androidx.activity.result.g
    public final void b(int i3, AbstractC0059a abstractC0059a, x xVar) {
        Bundle bundle;
        k kVar = this.h;
        K.r w3 = abstractC0059a.w(kVar, xVar);
        if (w3 != null) {
            new Handler(Looper.getMainLooper()).post(new F0.b(this, i3, w3, 1));
            return;
        }
        Intent n3 = abstractC0059a.n(kVar, xVar);
        if (n3.getExtras() != null && n3.getExtras().getClassLoader() == null) {
            n3.setExtrasClassLoader(kVar.getClassLoader());
        }
        if (n3.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = n3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            n3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(n3.getAction())) {
            String[] stringArrayExtra = n3.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0414d.d(kVar, stringArrayExtra, i3);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(n3.getAction())) {
            AbstractC0411a.b(kVar, n3, i3, bundle);
            return;
        }
        androidx.activity.result.i iVar = (androidx.activity.result.i) n3.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            AbstractC0411a.c(kVar, iVar.f1492b, i3, iVar.c, iVar.f1493d, iVar.f1494e, 0, bundle);
        } catch (IntentSender.SendIntentException e3) {
            new Handler(Looper.getMainLooper()).post(new F0.b(this, i3, e3, 2));
        }
    }
}
