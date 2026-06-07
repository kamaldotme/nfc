package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final N f2021a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2022b = new Object();
    public static final N c = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0095l enumC0095l) {
        X1.g.e(activity, "activity");
        X1.g.e(enumC0095l, "event");
        if (activity instanceof r) {
            t d3 = ((r) activity).d();
            if (d3 instanceof t) {
                d3.d(enumC0095l);
            }
        }
    }

    public static void b(Activity activity) {
        X1.g.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            F.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new F());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
