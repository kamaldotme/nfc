package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class A {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        X1.g.e(activity, "activity");
        X1.g.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
