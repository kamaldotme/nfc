package J;

import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f437a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f438b;
    public static final Field c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f439d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f437a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f438b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            c = declaredField3;
            declaredField3.setAccessible(true);
            f439d = true;
        } catch (ReflectiveOperationException e3) {
            e3.getMessage();
        }
    }
}
