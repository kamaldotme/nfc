package d1;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f2649b;
    public final /* synthetic */ Object c;

    public t(Method method, Object obj) {
        this.f2649b = method;
        this.c = obj;
    }

    @Override // d1.x
    public final Object a(Class cls) {
        String a3 = androidx.activity.l.a(cls);
        if (a3 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a3));
        }
        return this.f2649b.invoke(this.c, cls);
    }
}
