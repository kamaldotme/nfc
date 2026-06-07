package k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: k.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0303q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3762a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f3763b;
    public static final Method c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3764d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f3762a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f3763b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f3764d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
