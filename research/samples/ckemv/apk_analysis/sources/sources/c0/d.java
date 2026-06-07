package c0;

import X1.g;
import d2.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2247a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2248b;
    public final List c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2249d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z3, List list, List list2) {
        g.e(list, "columns");
        g.e(list2, "orders");
        this.f2247a = str;
        this.f2248b = z3;
        this.c = list;
        this.f2249d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                list2.add("ASC");
            }
        }
        this.f2249d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2248b != dVar.f2248b || !g.a(this.c, dVar.c) || !g.a(this.f2249d, dVar.f2249d)) {
            return false;
        }
        String str = this.f2247a;
        boolean V2 = l.V(str, "index_", false);
        String str2 = dVar.f2247a;
        return V2 ? l.V(str2, "index_", false) : g.a(str, str2);
    }

    public final int hashCode() {
        String str = this.f2247a;
        return this.f2249d.hashCode() + ((this.c.hashCode() + ((((l.V(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f2248b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f2247a + "', unique=" + this.f2248b + ", columns=" + this.c + ", orders=" + this.f2249d + "'}";
    }
}
