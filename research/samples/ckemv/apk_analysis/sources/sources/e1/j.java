package e1;

import b1.w;
import b1.x;
import i1.C0186a;
import i1.C0187b;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: b, reason: collision with root package name */
    public static final i f2709b = new i(new j());

    /* renamed from: a, reason: collision with root package name */
    public final w f2710a = w.c;

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        int W2 = c0186a.W();
        int a3 = q.h.a(W2);
        if (a3 == 5 || a3 == 6) {
            return this.f2710a.a(c0186a);
        }
        if (a3 == 8) {
            c0186a.S();
            return null;
        }
        throw new RuntimeException("Expecting number, got: " + X.d.x(W2) + "; at path " + c0186a.I(false));
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        c0187b.P((Number) obj);
    }
}
