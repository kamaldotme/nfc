package i;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class h implements MenuItem.OnMenuItemClickListener {
    public static final Class[] c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f3137a;

    /* renamed from: b, reason: collision with root package name */
    public Method f3138b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f3138b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f3137a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
