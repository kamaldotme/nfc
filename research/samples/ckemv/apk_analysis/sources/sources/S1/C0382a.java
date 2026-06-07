package s1;

import G1.d;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0233c;
import j1.EnumC0243m;
import j1.InterfaceC0240j;
import java.util.List;
import java.util.Map;
import p1.b;
import p1.f;
import q1.C0363a;
import v0.C0403c;
import v0.e;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382a implements InterfaceC0240j {

    /* renamed from: b, reason: collision with root package name */
    public static final C0244n[] f4707b = new C0244n[0];

    /* renamed from: a, reason: collision with root package name */
    public final d f4708a = new d(1);

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0187, code lost:
    
        if ((r1.q(r12, r11) + r1.q(r13, r11)) > (r1.q(r12, r3) + r1.q(r13, r3))) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b3  */
    @Override // j1.InterfaceC0240j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0242l a(e eVar, Map map) {
        char c;
        p1.d c3;
        C0244n[] c0244nArr;
        int i3;
        d dVar = this.f4708a;
        if (map == null || !map.containsKey(EnumC0233c.c)) {
            b e3 = eVar.e();
            C0403c c0403c = new C0403c(e3);
            C0244n[] b3 = ((C0363a) c0403c.f5067d).b();
            C0244n c0244n = b3[0];
            C0244n c0244n2 = b3[1];
            C0244n c0244n3 = b3[3];
            C0244n c0244n4 = b3[2];
            int q3 = c0403c.q(c0244n, c0244n2);
            int q4 = c0403c.q(c0244n2, c0244n3);
            int q5 = c0403c.q(c0244n3, c0244n4);
            int q6 = c0403c.q(c0244n4, c0244n);
            C0244n[] c0244nArr2 = {c0244n4, c0244n, c0244n2, c0244n3};
            if (q3 > q4) {
                c0244nArr2[0] = c0244n;
                c0244nArr2[1] = c0244n2;
                c0244nArr2[2] = c0244n3;
                c0244nArr2[3] = c0244n4;
                q3 = q4;
            }
            if (q3 > q5) {
                c0244nArr2[0] = c0244n2;
                c0244nArr2[1] = c0244n3;
                c0244nArr2[2] = c0244n4;
                c0244nArr2[3] = c0244n;
            } else {
                q5 = q3;
            }
            if (q5 > q6) {
                c0244nArr2[0] = c0244n3;
                c0244nArr2[1] = c0244n4;
                c0244nArr2[2] = c0244n;
                c0244nArr2[3] = c0244n2;
            }
            C0244n c0244n5 = c0244nArr2[0];
            C0244n c0244n6 = c0244nArr2[1];
            C0244n c0244n7 = c0244nArr2[2];
            C0244n c0244n8 = c0244nArr2[3];
            int q7 = (c0403c.q(c0244n5, c0244n8) + 1) << 2;
            if (c0403c.q(C0403c.o(c0244n6, c0244n7, q7), c0244n5) < c0403c.q(C0403c.o(c0244n7, c0244n6, q7), c0244n8)) {
                c0244nArr2[0] = c0244n5;
                c0244nArr2[1] = c0244n6;
                c0244nArr2[2] = c0244n7;
                c = 3;
                c0244nArr2[3] = c0244n8;
            } else {
                c = 3;
                c0244nArr2[0] = c0244n6;
                c0244nArr2[1] = c0244n7;
                c0244nArr2[2] = c0244n8;
                c0244nArr2[3] = c0244n5;
            }
            C0244n c0244n9 = c0244nArr2[0];
            C0244n c0244n10 = c0244nArr2[1];
            C0244n c0244n11 = c0244nArr2[2];
            C0244n c0244n12 = c0244nArr2[c];
            int q8 = c0403c.q(c0244n9, c0244n12);
            C0244n o3 = C0403c.o(c0244n9, c0244n10, (c0403c.q(c0244n10, c0244n12) + 1) << 2);
            C0244n o4 = C0403c.o(c0244n11, c0244n10, (q8 + 1) << 2);
            int q9 = c0403c.q(o3, c0244n12);
            int q10 = c0403c.q(o4, c0244n12);
            float f3 = c0244n11.f3505a;
            float f4 = c0244n10.f3505a;
            float f5 = q9 + 1;
            float f6 = c0244n12.f3505a;
            float f7 = c0244n11.f3506b;
            float f8 = c0244n10.f3506b;
            float f9 = c0244n12.f3506b;
            C0244n c0244n13 = new C0244n(((f3 - f4) / f5) + f6, ((f7 - f8) / f5) + f9);
            float f10 = c0244n9.f3505a - f4;
            float f11 = q10 + 1;
            C0244n c0244n14 = new C0244n((f10 / f11) + f6, ((c0244n9.f3506b - f8) / f11) + f9);
            if (c0403c.j(c0244n13)) {
                if (c0403c.j(c0244n14)) {
                }
                c0244nArr2[3] = c0244n13;
                if (c0244n13 == null) {
                }
            } else {
                if (!c0403c.j(c0244n14)) {
                    c0244n13 = null;
                    c0244nArr2[3] = c0244n13;
                    if (c0244n13 == null) {
                        throw C0238h.f3489d;
                    }
                    C0244n c0244n15 = c0244nArr2[0];
                    C0244n c0244n16 = c0244nArr2[1];
                    C0244n c0244n17 = c0244nArr2[2];
                    int q11 = c0403c.q(c0244n15, c0244n13) + 1;
                    C0244n o5 = C0403c.o(c0244n15, c0244n16, (c0403c.q(c0244n17, c0244n13) + 1) << 2);
                    C0244n o6 = C0403c.o(c0244n17, c0244n16, q11 << 2);
                    int q12 = c0403c.q(o5, c0244n13);
                    int i4 = q12 + 1;
                    int q13 = c0403c.q(o6, c0244n13);
                    int i5 = q13 + 1;
                    if ((i4 & 1) == 1) {
                        i4 = q12 + 2;
                    }
                    if ((i5 & 1) == 1) {
                        i5 = q13 + 2;
                    }
                    float f12 = (((c0244n15.f3505a + c0244n16.f3505a) + c0244n17.f3505a) + c0244n13.f3505a) / 4.0f;
                    float f13 = (((c0244n15.f3506b + c0244n16.f3506b) + c0244n17.f3506b) + c0244n13.f3506b) / 4.0f;
                    C0244n m3 = C0403c.m(c0244n15, f12, f13);
                    C0244n m4 = C0403c.m(c0244n16, f12, f13);
                    C0244n m5 = C0403c.m(c0244n17, f12, f13);
                    C0244n m6 = C0403c.m(c0244n13, f12, f13);
                    int i6 = i5 << 2;
                    int i7 = i4 << 2;
                    C0244n[] c0244nArr3 = {C0403c.o(C0403c.o(m3, m4, i6), m6, i7), C0403c.o(C0403c.o(m4, m3, i6), m5, i7), C0403c.o(C0403c.o(m5, m6, i6), m4, i7), C0403c.o(C0403c.o(m6, m5, i6), m3, i7)};
                    C0244n c0244n18 = c0244nArr3[0];
                    C0244n c0244n19 = c0244nArr3[1];
                    C0244n c0244n20 = c0244nArr3[2];
                    C0244n c0244n21 = c0244nArr3[3];
                    int q14 = c0403c.q(c0244n18, c0244n21);
                    int i8 = q14 + 1;
                    int q15 = c0403c.q(c0244n20, c0244n21);
                    int i9 = q15 + 1;
                    if ((i8 & 1) == 1) {
                        i8 = q14 + 2;
                    }
                    if ((i9 & 1) == 1) {
                        i9 = q15 + 2;
                    }
                    if (i8 * 4 < i9 * 7 && i9 * 4 < i8 * 7) {
                        i8 = Math.max(i8, i9);
                        i9 = i8;
                    }
                    float f14 = i8 - 0.5f;
                    float f15 = i9 - 0.5f;
                    c3 = dVar.c(u2.d.C(e3, i8, i9, f.a(0.5f, 0.5f, f14, 0.5f, f14, f15, 0.5f, f15, c0244n18.f3505a, c0244n18.f3506b, c0244n21.f3505a, c0244n21.f3506b, c0244n20.f3505a, c0244n20.f3506b, c0244n19.f3505a, c0244n19.f3506b)));
                    c0244nArr = new C0244n[]{c0244n18, c0244n19, c0244n20, c0244n21};
                }
                c0244n13 = c0244n14;
                c0244nArr2[3] = c0244n13;
                if (c0244n13 == null) {
                }
            }
        } else {
            b e4 = eVar.e();
            int[] e5 = e4.e();
            int[] c4 = e4.c();
            if (e5 == null || c4 == null) {
                throw C0238h.f3489d;
            }
            int i10 = e5[0];
            int i11 = e5[1];
            while (true) {
                i3 = e4.f4328b;
                if (i10 >= i3 || !e4.b(i10, i11)) {
                    break;
                }
                i10++;
            }
            if (i10 == i3) {
                throw C0238h.f3489d;
            }
            int i12 = e5[0];
            int i13 = i10 - i12;
            if (i13 == 0) {
                throw C0238h.f3489d;
            }
            int i14 = e5[1];
            int i15 = c4[1];
            int i16 = ((c4[0] - i12) + 1) / i13;
            int i17 = ((i15 - i14) + 1) / i13;
            if (i16 <= 0 || i17 <= 0) {
                throw C0238h.f3489d;
            }
            int i18 = i13 / 2;
            int i19 = i14 + i18;
            int i20 = i12 + i18;
            b bVar = new b(i16, i17);
            for (int i21 = 0; i21 < i17; i21++) {
                int i22 = (i21 * i13) + i19;
                for (int i23 = 0; i23 < i16; i23++) {
                    if (e4.b((i23 * i13) + i20, i22)) {
                        bVar.f(i23, i21);
                    }
                }
            }
            c3 = dVar.c(bVar);
            c0244nArr = f4707b;
        }
        C0242l c0242l = new C0242l(c3.f4336b, c3.f4335a, c0244nArr, EnumC0231a.g);
        List list = c3.c;
        if (list != null) {
            c0242l.b(EnumC0243m.c, list);
        }
        String str = c3.f4337d;
        if (str != null) {
            c0242l.b(EnumC0243m.f3498d, str);
        }
        return c0242l;
    }

    @Override // j1.InterfaceC0240j
    public final C0242l b(e eVar) {
        return a(eVar, null);
    }

    @Override // j1.InterfaceC0240j
    public final void c() {
    }
}
