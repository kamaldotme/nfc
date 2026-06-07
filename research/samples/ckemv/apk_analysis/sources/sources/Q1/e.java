package Q1;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Method f823a;

    /* renamed from: b, reason: collision with root package name */
    public Method f824b;
    public Method c;

    public /* synthetic */ e(Method method, Method method2, Method method3) {
        this.f823a = method;
        this.f824b = method2;
        this.c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
