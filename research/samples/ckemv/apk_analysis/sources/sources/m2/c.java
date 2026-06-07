package m2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f4006n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4007a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4008b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4009d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4010e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4011f;
    public final boolean g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4012i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4013j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4014k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4015l;

    /* renamed from: m, reason: collision with root package name */
    public String f4016m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        X1.g.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z3, boolean z4, int i3, int i4, boolean z5, boolean z6, boolean z7, int i5, int i6, boolean z8, boolean z9, boolean z10, String str) {
        this.f4007a = z3;
        this.f4008b = z4;
        this.c = i3;
        this.f4009d = i4;
        this.f4010e = z5;
        this.f4011f = z6;
        this.g = z7;
        this.h = i5;
        this.f4012i = i6;
        this.f4013j = z8;
        this.f4014k = z9;
        this.f4015l = z10;
        this.f4016m = str;
    }

    public final String toString() {
        String str = this.f4016m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4007a) {
            sb.append("no-cache, ");
        }
        if (this.f4008b) {
            sb.append("no-store, ");
        }
        int i3 = this.c;
        if (i3 != -1) {
            sb.append("max-age=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f4009d;
        if (i4 != -1) {
            sb.append("s-maxage=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f4010e) {
            sb.append("private, ");
        }
        if (this.f4011f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i5 = this.h;
        if (i5 != -1) {
            sb.append("max-stale=");
            sb.append(i5);
            sb.append(", ");
        }
        int i6 = this.f4012i;
        if (i6 != -1) {
            sb.append("min-fresh=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f4013j) {
            sb.append("only-if-cached, ");
        }
        if (this.f4014k) {
            sb.append("no-transform, ");
        }
        if (this.f4015l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        X1.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f4016m = sb2;
        return sb2;
    }
}
