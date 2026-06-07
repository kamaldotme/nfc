package x;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f5182a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f5183b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5184d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5185e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5186f = false;

    public C0415e(Activity activity) {
        this.f5183b = activity;
        this.c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f5183b == activity) {
            this.f5183b = null;
            this.f5185e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f5185e || this.f5186f || this.f5184d) {
            return;
        }
        Object obj = this.f5182a;
        try {
            Object obj2 = AbstractC0416f.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.c) {
                AbstractC0416f.g.postAtFrontOfQueue(new D0.c(AbstractC0416f.f5188b.get(activity), 14, obj2));
                this.f5186f = true;
                this.f5182a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f5183b == activity) {
            this.f5184d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
