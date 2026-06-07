package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class B extends AbstractC0089f {
    final /* synthetic */ D this$0;

    public B(D d3) {
        this.this$0 = d3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        X1.g.e(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        X1.g.e(activity, "activity");
        D d3 = this.this$0;
        int i3 = d3.f2014b + 1;
        d3.f2014b = i3;
        if (i3 == 1 && d3.f2016e) {
            d3.g.d(EnumC0095l.ON_START);
            d3.f2016e = false;
        }
    }
}
