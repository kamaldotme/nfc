package d1;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f2650b;
    public final /* synthetic */ int c;

    public u(int i3, Method method) {
        this.f2650b = method;
        this.c = i3;
    }

    @Override // d1.x
    public final Object a(Class cls) {
        String a3 = androidx.activity.l.a(cls);
        if (a3 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a3));
        }
        return this.f2650b.invoke(null, cls, Integer.valueOf(this.c));
    }
}
