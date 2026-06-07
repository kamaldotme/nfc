package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public c f3948b;
    public c c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f3949d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f3950e = 0;

    public c a(Object obj) {
        c cVar = this.f3948b;
        while (cVar != null && !cVar.f3943a.equals(obj)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a3 = a(obj);
        if (a3 == null) {
            return null;
        }
        this.f3950e--;
        WeakHashMap weakHashMap = this.f3949d;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a3);
            }
        }
        c cVar = a3.f3945d;
        if (cVar != null) {
            cVar.c = a3.c;
        } else {
            this.f3948b = a3.c;
        }
        c cVar2 = a3.c;
        if (cVar2 != null) {
            cVar2.f3945d = cVar;
        } else {
            this.c = cVar;
        }
        a3.c = null;
        a3.f3945d = null;
        return a3.f3944b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((m.C0328b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3950e != fVar.f3950e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            C0328b c0328b = (C0328b) it;
            if (!c0328b.hasNext()) {
                break;
            }
            C0328b c0328b2 = (C0328b) it2;
            if (!c0328b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0328b.next();
            Object next = c0328b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C0328b c0328b = (C0328b) it;
            if (!c0328b.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) c0328b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0328b c0328b = new C0328b(this.f3948b, this.c, 0);
        this.f3949d.put(c0328b, Boolean.FALSE);
        return c0328b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0328b c0328b = (C0328b) it;
            if (!c0328b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0328b.next()).toString());
            if (c0328b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
