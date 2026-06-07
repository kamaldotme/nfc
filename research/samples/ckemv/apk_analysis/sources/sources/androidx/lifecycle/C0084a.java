package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2036a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f2037b;

    public C0084a(HashMap hashMap) {
        this.f2037b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0095l enumC0095l = (EnumC0095l) entry.getValue();
            List list = (List) this.f2036a.get(enumC0095l);
            if (list == null) {
                list = new ArrayList();
                this.f2036a.put(enumC0095l, list);
            }
            list.add((C0085b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, EnumC0095l enumC0095l, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0085b c0085b = (C0085b) list.get(size);
                c0085b.getClass();
                try {
                    int i3 = c0085b.f2038a;
                    Method method = c0085b.f2039b;
                    if (i3 == 0) {
                        method.invoke(obj, null);
                    } else if (i3 == 1) {
                        method.invoke(obj, rVar);
                    } else if (i3 == 2) {
                        method.invoke(obj, rVar, enumC0095l);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
