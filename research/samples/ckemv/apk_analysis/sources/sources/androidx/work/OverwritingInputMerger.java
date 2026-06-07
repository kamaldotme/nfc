package androidx.work;

import f.C0150G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.g;
import m0.j;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // m0.j
    public final g a(ArrayList arrayList) {
        C0150G c0150g = new C0150G(7);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f3973a);
            X1.g.d(unmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(unmodifiableMap);
        }
        c0150g.p(linkedHashMap);
        g gVar = new g((HashMap) c0150g.f2846b);
        g.b(gVar);
        return gVar;
    }
}
