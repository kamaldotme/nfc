package J;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class n0 extends q0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f444e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f445f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;

    /* renamed from: d, reason: collision with root package name */
    public A.d f446d;

    public n0() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f445f) {
            try {
                f444e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f445f = true;
        }
        Field field = f444e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // J.q0
    public y0 b() {
        a();
        y0 g3 = y0.g(null, this.c);
        A.d[] dVarArr = this.f448b;
        w0 w0Var = g3.f470a;
        w0Var.o(dVarArr);
        w0Var.q(this.f446d);
        return g3;
    }

    @Override // J.q0
    public void e(A.d dVar) {
        this.f446d = dVar;
    }

    @Override // J.q0
    public void g(A.d dVar) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(dVar.f2a, dVar.f3b, dVar.c, dVar.f4d);
        }
    }

    public n0(y0 y0Var) {
        super(y0Var);
        this.c = y0Var.f();
    }
}
