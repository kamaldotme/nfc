package u2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final List f5034a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5035b;
    public String c;

    public i(ArrayList arrayList) {
        this.f5034a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        X1.g.e(obj, "proxy");
        X1.g.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (X1.g.a(name, "supports") && X1.g.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (X1.g.a(name, "unsupported") && X1.g.a(Void.TYPE, returnType)) {
            this.f5035b = true;
            return null;
        }
        boolean a3 = X1.g.a(name, "protocols");
        List list = this.f5034a;
        if (a3 && objArr.length == 0) {
            return list;
        }
        if ((X1.g.a(name, "selectProtocol") || X1.g.a(name, "select")) && X1.g.a(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                X1.g.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj3 = list2.get(i3);
                        X1.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!list.contains(str)) {
                            if (i3 == size) {
                                break;
                            }
                            i3++;
                        } else {
                            this.c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!X1.g.a(name, "protocolSelected") && !X1.g.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        X1.g.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.c = (String) obj4;
        return null;
    }
}
