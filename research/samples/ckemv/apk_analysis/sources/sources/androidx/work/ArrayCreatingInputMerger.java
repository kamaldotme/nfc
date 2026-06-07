package androidx.work;

import f.C0150G;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m0.g;
import m0.j;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends j {
    @Override // m0.j
    public final g a(ArrayList arrayList) {
        Object newInstance;
        C0150G c0150g = new C0150G(7);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f3973a);
            X1.g.d(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(str);
                X1.g.d(str, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (X1.g.a(cls2, cls)) {
                        X1.g.d(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        X1.g.b(componentType);
                        Object newInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newInstance2, 0, length);
                        System.arraycopy(value, 0, newInstance2, length, length2);
                        X1.g.d(newInstance2, "newArray");
                        value = newInstance2;
                        X1.g.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    } else {
                        if (!X1.g.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newInstance, 0, length3);
                        Array.set(newInstance, length3, value);
                        X1.g.d(newInstance, "newArray");
                        value = newInstance;
                        X1.g.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    }
                } else if (cls.isArray()) {
                    X1.g.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                } else {
                    newInstance = Array.newInstance(cls, 1);
                    Array.set(newInstance, 0, value);
                    X1.g.d(newInstance, "newArray");
                    value = newInstance;
                    X1.g.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        c0150g.p(hashMap);
        g gVar = new g((HashMap) c0150g.f2846b);
        g.b(gVar);
        return gVar;
    }
}
