package c2;

import L1.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d extends e {
    public static List Q(c cVar) {
        Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return t.f622b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return v0.f.B(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
