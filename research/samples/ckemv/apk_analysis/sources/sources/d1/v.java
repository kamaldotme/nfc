package d1;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class v extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f2651b;

    public v(Method method) {
        this.f2651b = method;
    }

    @Override // d1.x
    public final Object a(Class cls) {
        String a3 = androidx.activity.l.a(cls);
        if (a3 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a3));
        }
        return this.f2651b.invoke(null, cls, Object.class);
    }
}
