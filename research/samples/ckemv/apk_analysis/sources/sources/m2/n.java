package m2;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f4068d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f4069a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4070b;

    public n(String str, String[] strArr) {
        this.f4069a = str;
        this.f4070b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && X1.g.a(((n) obj).f4069a, this.f4069a);
    }

    public final int hashCode() {
        return this.f4069a.hashCode();
    }

    public final String toString() {
        return this.f4069a;
    }
}
