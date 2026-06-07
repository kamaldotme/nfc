package A2;

import X1.g;
import z2.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f61a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(d2.a.f2653a);
        g.d(bytes, "this as java.lang.String).getBytes(charset)");
        f61a = bytes;
    }

    public static final String a(f fVar, long j3) {
        g.e(fVar, "<this>");
        if (j3 > 0) {
            long j4 = j3 - 1;
            if (fVar.b(j4) == 13) {
                String A3 = fVar.A(j4, d2.a.f2653a);
                fVar.u(2L);
                return A3;
            }
        }
        String A4 = fVar.A(j3, d2.a.f2653a);
        fVar.u(1L);
        return A4;
    }
}
