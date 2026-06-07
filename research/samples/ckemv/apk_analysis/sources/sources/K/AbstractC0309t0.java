package k;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: k.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0309t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f3778a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
        f3778a = field;
    }
}
