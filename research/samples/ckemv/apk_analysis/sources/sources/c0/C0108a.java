package c0;

import X1.g;
import java.util.Locale;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2235a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2236b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2237d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2239f;
    public final int g;

    public C0108a(String str, String str2, boolean z3, int i3, String str3, int i4) {
        this.f2235a = str;
        this.f2236b = str2;
        this.c = z3;
        this.f2237d = i3;
        this.f2238e = str3;
        this.f2239f = i4;
        Locale locale = Locale.US;
        g.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        g.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.g = d2.d.X(upperCase, "INT") ? 3 : (d2.d.X(upperCase, "CHAR") || d2.d.X(upperCase, "CLOB") || d2.d.X(upperCase, "TEXT")) ? 2 : d2.d.X(upperCase, "BLOB") ? 5 : (d2.d.X(upperCase, "REAL") || d2.d.X(upperCase, "FLOA") || d2.d.X(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0108a)) {
            return false;
        }
        C0108a c0108a = (C0108a) obj;
        if (this.f2237d != c0108a.f2237d) {
            return false;
        }
        if (!g.a(this.f2235a, c0108a.f2235a) || this.c != c0108a.c) {
            return false;
        }
        int i3 = c0108a.f2239f;
        String str = c0108a.f2238e;
        String str2 = this.f2238e;
        int i4 = this.f2239f;
        if (i4 == 1 && i3 == 2 && str2 != null && !u2.d.j(str2, str)) {
            return false;
        }
        if (i4 != 2 || i3 != 1 || str == null || u2.d.j(str, str2)) {
            return (i4 == 0 || i4 != i3 || (str2 == null ? str == null : u2.d.j(str2, str))) && this.g == c0108a.g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2235a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.f2237d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f2235a);
        sb.append("', type='");
        sb.append(this.f2236b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f2237d);
        sb.append(", defaultValue='");
        String str = this.f2238e;
        if (str == null) {
            str = "undefined";
        }
        return X.d.j(sb, str, "'}");
    }
}
