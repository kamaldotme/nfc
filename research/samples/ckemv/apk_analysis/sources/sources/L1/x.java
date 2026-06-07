package L1;

import a.AbstractC0059a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class x extends AbstractC0059a {
    public static int O(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map P(ArrayList arrayList) {
        u uVar = u.f623b;
        int size = arrayList.size();
        if (size == 0) {
            return uVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(O(arrayList.size()));
            Q(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        K1.c cVar = (K1.c) arrayList.get(0);
        X1.g.e(cVar, "pair");
        Map singletonMap = Collections.singletonMap(cVar.f600b, cVar.c);
        X1.g.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final void Q(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            K1.c cVar = (K1.c) it.next();
            linkedHashMap.put(cVar.f600b, cVar.c);
        }
    }

    public static final Map R(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        X1.g.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
