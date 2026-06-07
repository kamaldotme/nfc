package d1;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f2647b;

    public q(Method method) {
        this.f2647b = method;
    }

    @Override // d1.s
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f2647b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e3) {
            throw new RuntimeException("Failed invoking canAccess", e3);
        }
    }
}
