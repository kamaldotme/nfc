package F;

import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f155b = new h(new i(g.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final i f156a;

    public h(i iVar) {
        this.f156a = iVar;
    }

    public static h a(String str) {
        if (str == null || str.isEmpty()) {
            return f155b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i3 = 0; i3 < length; i3++) {
            localeArr[i3] = f.a(split[i3]);
        }
        return new h(new i(g.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f156a.equals(((h) obj).f156a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f156a.hashCode();
    }

    public final String toString() {
        return this.f156a.toString();
    }
}
