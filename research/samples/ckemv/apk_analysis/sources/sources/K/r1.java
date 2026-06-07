package k;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3768a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3769b;

    static {
        f3769b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f3768a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        WeakHashMap weakHashMap = J.T.f402a;
        return J.C.d(view) == 1;
    }
}
