package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class C extends AbstractC0089f {
    final /* synthetic */ D this$0;

    public C(D d3) {
        this.this$0 = d3;
    }

    @Override // androidx.lifecycle.AbstractC0089f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        X1.g.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = G.c;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            X1.g.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((G) findFragmentByTag).f2020b = this.this$0.f2018i;
        }
    }

    @Override // androidx.lifecycle.AbstractC0089f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        X1.g.e(activity, "activity");
        D d3 = this.this$0;
        int i3 = d3.c - 1;
        d3.c = i3;
        if (i3 == 0) {
            Handler handler = d3.f2017f;
            X1.g.b(handler);
            handler.postDelayed(d3.h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        X1.g.e(activity, "activity");
        A.a(activity, new B(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0089f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        X1.g.e(activity, "activity");
        D d3 = this.this$0;
        int i3 = d3.f2014b - 1;
        d3.f2014b = i3;
        if (i3 == 0 && d3.f2015d) {
            d3.g.d(EnumC0095l.ON_STOP);
            d3.f2016e = true;
        }
    }
}
