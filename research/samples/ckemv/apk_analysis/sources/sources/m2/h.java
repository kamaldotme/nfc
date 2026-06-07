package m2;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f4041j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f4042k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f4043l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f4044m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f4045a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4046b;
    public final long c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4047d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4048e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4049f;
    public final boolean g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4050i;

    public h(String str, String str2, long j3, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f4045a = str;
        this.f4046b = str2;
        this.c = j3;
        this.f4047d = str3;
        this.f4048e = str4;
        this.f4049f = z3;
        this.g = z4;
        this.h = z5;
        this.f4050i = z6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (X1.g.a(hVar.f4045a, this.f4045a) && X1.g.a(hVar.f4046b, this.f4046b) && hVar.c == this.c && X1.g.a(hVar.f4047d, this.f4047d) && X1.g.a(hVar.f4048e, this.f4048e) && hVar.f4049f == this.f4049f && hVar.g == this.g && hVar.h == this.h && hVar.f4050i == this.f4050i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4050i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.g) + ((Boolean.hashCode(this.f4049f) + ((this.f4048e.hashCode() + ((this.f4047d.hashCode() + ((Long.hashCode(this.c) + ((this.f4046b.hashCode() + ((this.f4045a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4045a);
        sb.append('=');
        sb.append(this.f4046b);
        if (this.h) {
            long j3 = this.c;
            if (j3 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) r2.c.f4656a.get()).format(new Date(j3));
                X1.g.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f4050i) {
            sb.append("; domain=");
            sb.append(this.f4047d);
        }
        sb.append("; path=");
        sb.append(this.f4048e);
        if (this.f4049f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X1.g.d(sb2, "toString()");
        return sb2;
    }
}
