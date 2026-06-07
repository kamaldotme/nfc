package c0;

import X1.g;
import java.util.List;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2240a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2241b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2242d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2243e;

    public C0109b(String str, String str2, String str3, List list, List list2) {
        g.e(list, "columnNames");
        g.e(list2, "referenceColumnNames");
        this.f2240a = str;
        this.f2241b = str2;
        this.c = str3;
        this.f2242d = list;
        this.f2243e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0109b)) {
            return false;
        }
        C0109b c0109b = (C0109b) obj;
        if (g.a(this.f2240a, c0109b.f2240a) && g.a(this.f2241b, c0109b.f2241b) && g.a(this.c, c0109b.c) && g.a(this.f2242d, c0109b.f2242d)) {
            return g.a(this.f2243e, c0109b.f2243e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2243e.hashCode() + ((this.f2242d.hashCode() + ((this.c.hashCode() + ((this.f2241b.hashCode() + (this.f2240a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f2240a + "', onDelete='" + this.f2241b + " +', onUpdate='" + this.c + "', columnNames=" + this.f2242d + ", referenceColumnNames=" + this.f2243e + '}';
    }
}
