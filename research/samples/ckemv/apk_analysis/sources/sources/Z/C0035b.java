package Z;

import f.C0150G;

/* renamed from: Z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1234a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f1235b = 0;
    public Object c;

    public C0035b(z2.h hVar) {
        this.c = hVar;
    }

    public void a(int i3) {
        if (i3 < 64) {
            this.f1235b &= ~(1 << i3);
            return;
        }
        C0035b c0035b = (C0035b) this.c;
        if (c0035b != null) {
            c0035b.a(i3 - 64);
        }
    }

    public int b(int i3) {
        C0035b c0035b = (C0035b) this.c;
        if (c0035b == null) {
            return i3 >= 64 ? Long.bitCount(this.f1235b) : Long.bitCount(this.f1235b & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.f1235b & ((1 << i3) - 1));
        }
        return Long.bitCount(this.f1235b) + c0035b.b(i3 - 64);
    }

    public void c() {
        if (((C0035b) this.c) == null) {
            this.c = new C0035b();
        }
    }

    public boolean d(int i3) {
        if (i3 < 64) {
            return (this.f1235b & (1 << i3)) != 0;
        }
        c();
        return ((C0035b) this.c).d(i3 - 64);
    }

    public void e(int i3, boolean z3) {
        if (i3 >= 64) {
            c();
            ((C0035b) this.c).e(i3 - 64, z3);
            return;
        }
        long j3 = this.f1235b;
        boolean z4 = (Long.MIN_VALUE & j3) != 0;
        long j4 = (1 << i3) - 1;
        this.f1235b = ((j3 & (~j4)) << 1) | (j3 & j4);
        if (z3) {
            i(i3);
        } else {
            a(i3);
        }
        if (z4 || ((C0035b) this.c) != null) {
            c();
            ((C0035b) this.c).e(0, z4);
        }
    }

    public m2.j f() {
        C0150G c0150g = new C0150G(9);
        while (true) {
            String r3 = ((z2.h) this.c).r(this.f1235b);
            this.f1235b -= r3.length();
            if (r3.length() == 0) {
                return c0150g.l();
            }
            int b02 = d2.d.b0(r3, ':', 1, false, 4);
            if (b02 != -1) {
                String substring = r3.substring(0, b02);
                X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = r3.substring(b02 + 1);
                X1.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                c0150g.i(substring, substring2);
            } else if (r3.charAt(0) == ':') {
                String substring3 = r3.substring(1);
                X1.g.d(substring3, "this as java.lang.String).substring(startIndex)");
                c0150g.i("", substring3);
            } else {
                c0150g.i("", r3);
            }
        }
    }

    public boolean g(int i3) {
        if (i3 >= 64) {
            c();
            return ((C0035b) this.c).g(i3 - 64);
        }
        long j3 = 1 << i3;
        long j4 = this.f1235b;
        boolean z3 = (j4 & j3) != 0;
        long j5 = j4 & (~j3);
        this.f1235b = j5;
        long j6 = j3 - 1;
        this.f1235b = (j5 & j6) | Long.rotateRight((~j6) & j5, 1);
        C0035b c0035b = (C0035b) this.c;
        if (c0035b != null) {
            if (c0035b.d(0)) {
                i(63);
            }
            ((C0035b) this.c).g(0);
        }
        return z3;
    }

    public void h() {
        this.f1235b = 0L;
        C0035b c0035b = (C0035b) this.c;
        if (c0035b != null) {
            c0035b.h();
        }
    }

    public void i(int i3) {
        if (i3 < 64) {
            this.f1235b |= 1 << i3;
        } else {
            c();
            ((C0035b) this.c).i(i3 - 64);
        }
    }

    public String toString() {
        switch (this.f1234a) {
            case 0:
                if (((C0035b) this.c) == null) {
                    return Long.toBinaryString(this.f1235b);
                }
                return ((C0035b) this.c).toString() + "xx" + Long.toBinaryString(this.f1235b);
            default:
                return super.toString();
        }
    }

    public C0035b() {
    }
}
