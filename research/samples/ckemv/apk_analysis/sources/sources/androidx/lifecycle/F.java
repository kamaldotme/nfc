package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class F implements Application.ActivityLifecycleCallbacks {
    public static final E Companion = new Object();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        X1.g.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new F());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        X1.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        X1.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        X1.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        X1.g.e(activity, "activity");
        int i3 = G.c;
        I.a(activity, EnumC0095l.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        X1.g.e(activity, "activity");
        int i3 = G.c;
        I.a(activity, EnumC0095l.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        X1.g.e(activity, "activity");
        int i3 = G.c;
        I.a(activity, EnumC0095l.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        X1.g.e(activity, "activity");
        int i3 = G.c;
        I.a(activity, EnumC0095l.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        X1.g.e(activity, "activity");
        int i3 = G.c;
        I.a(activity, EnumC0095l.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        X1.g.e(activity, "activity");
        int i3 = G.c;
        I.a(activity, EnumC0095l.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        X1.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        X1.g.e(activity, "activity");
        X1.g.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        X1.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        X1.g.e(activity, "activity");
    }
}
