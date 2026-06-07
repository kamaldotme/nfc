package m1;

import A1.i;
import f.C0150G;
import j1.C0238h;
import j1.C0244n;
import k1.C0322a;
import p1.b;
import q1.C0363a;
import r1.C0370a;
import u2.d;
import v0.f;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331a {
    public static final int[] g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    public final b f3991a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3992b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f3993d;

    /* renamed from: e, reason: collision with root package name */
    public int f3994e;

    /* renamed from: f, reason: collision with root package name */
    public int f3995f;

    public C0331a(b bVar) {
        this.f3991a = bVar;
    }

    public static C0244n[] b(C0244n[] c0244nArr, int i3, int i4) {
        float f3 = i4 / (i3 * 2.0f);
        C0244n c0244n = c0244nArr[0];
        float f4 = c0244n.f3505a;
        C0244n c0244n2 = c0244nArr[2];
        float f5 = c0244n2.f3505a;
        float f6 = f4 - f5;
        float f7 = c0244n.f3506b;
        float f8 = c0244n2.f3506b;
        float f9 = f7 - f8;
        float f10 = (f4 + f5) / 2.0f;
        float f11 = (f7 + f8) / 2.0f;
        float f12 = f6 * f3;
        float f13 = f9 * f3;
        C0244n c0244n3 = new C0244n(f10 + f12, f11 + f13);
        C0244n c0244n4 = new C0244n(f10 - f12, f11 - f13);
        C0244n c0244n5 = c0244nArr[1];
        float f14 = c0244n5.f3505a;
        C0244n c0244n6 = c0244nArr[3];
        float f15 = c0244n6.f3505a;
        float f16 = f14 - f15;
        float f17 = c0244n5.f3506b;
        float f18 = c0244n6.f3506b;
        float f19 = f17 - f18;
        float f20 = (f14 + f15) / 2.0f;
        float f21 = (f17 + f18) / 2.0f;
        float f22 = f16 * f3;
        float f23 = f3 * f19;
        return new C0244n[]{c0244n3, new C0244n(f20 + f22, f21 + f23), c0244n4, new C0244n(f20 - f22, f21 - f23)};
    }

    public final C0322a a(boolean z3) {
        C0244n b3;
        C0244n c0244n;
        C0244n c0244n2;
        C0244n c0244n3;
        C0244n b4;
        C0244n b5;
        C0244n c0244n4;
        C0244n c0244n5;
        int i3;
        int i4;
        int i5;
        int i6;
        b bVar;
        i iVar;
        int i7;
        int i8;
        long j3;
        int i9;
        i iVar2;
        i iVar3;
        i iVar4;
        b bVar2 = this.f3991a;
        int i10 = -1;
        int i11 = 2;
        int i12 = 1;
        try {
            C0244n[] b6 = new C0363a(bVar2).b();
            c0244n2 = b6[0];
            c0244n3 = b6[1];
            c0244n = b6[2];
            b3 = b6[3];
        } catch (C0238h unused) {
            int i13 = bVar2.f4328b / 2;
            int i14 = bVar2.c / 2;
            int i15 = i13 + 7;
            int i16 = i14 - 7;
            C0244n b7 = e(new i(i15, i16, 4), false, 1, -1).b();
            int i17 = i14 + 7;
            C0244n b8 = e(new i(i15, i17, 4), false, 1, 1).b();
            int i18 = i13 - 7;
            C0244n b9 = e(new i(i18, i17, 4), false, -1, 1).b();
            b3 = e(new i(i18, i16, 4), false, -1, -1).b();
            c0244n = b9;
            c0244n2 = b7;
            c0244n3 = b8;
        }
        int K2 = f.K((((c0244n2.f3505a + b3.f3505a) + c0244n3.f3505a) + c0244n.f3505a) / 4.0f);
        int K3 = f.K((((c0244n2.f3506b + b3.f3506b) + c0244n3.f3506b) + c0244n.f3506b) / 4.0f);
        try {
            C0244n[] b10 = new C0363a(bVar2, 15, K2, K3).b();
            c0244n5 = b10[0];
            c0244n4 = b10[1];
            b4 = b10[2];
            b5 = b10[3];
        } catch (C0238h unused2) {
            int i19 = K2 + 7;
            int i20 = K3 - 7;
            C0244n b11 = e(new i(i19, i20, 4), false, 1, -1).b();
            int i21 = K3 + 7;
            C0244n b12 = e(new i(i19, i21, 4), false, 1, 1).b();
            int i22 = K2 - 7;
            b4 = e(new i(i22, i21, 4), false, -1, 1).b();
            b5 = e(new i(i22, i20, 4), false, -1, -1).b();
            c0244n4 = b12;
            c0244n5 = b11;
        }
        i iVar5 = new i(f.K((((c0244n5.f3505a + b5.f3505a) + c0244n4.f3505a) + b4.f3505a) / 4.0f), f.K((((c0244n5.f3506b + b5.f3506b) + c0244n4.f3506b) + b4.f3506b) / 4.0f), 4);
        this.f3994e = 1;
        boolean z4 = true;
        i iVar6 = iVar5;
        i iVar7 = iVar6;
        i iVar8 = iVar7;
        while (true) {
            int i23 = this.f3994e;
            i3 = iVar8.f51b;
            i4 = iVar8.c;
            i5 = iVar5.f51b;
            i6 = iVar5.c;
            if (i23 >= 9) {
                bVar = bVar2;
                iVar = iVar7;
                break;
            }
            i e3 = e(iVar5, z4, i12, i10);
            i e4 = e(iVar6, z4, i12, i12);
            i e5 = e(iVar7, z4, i10, i12);
            i e6 = e(iVar8, z4, i10, i10);
            if (this.f3994e > i11) {
                int i24 = e6.f51b;
                int i25 = e6.c;
                int i26 = e3.f51b;
                iVar3 = e6;
                int i27 = e3.c;
                iVar2 = e3;
                bVar = bVar2;
                iVar = iVar7;
                double t3 = (f.t(i24, i25, i26, i27) * this.f3994e) / (f.t(i3, i4, i5, i6) * (this.f3994e + 2));
                if (t3 < 0.75d || t3 > 1.25d) {
                    break;
                }
                i iVar9 = new i(i26 - 3, i27 + 3, 4);
                i iVar10 = new i(e4.f51b - 3, e4.c - 3, 4);
                iVar4 = e4;
                i iVar11 = new i(e5.f51b + 3, e5.c - 3, 4);
                i iVar12 = new i(i24 + 3, i25 + 3, 4);
                int c = c(iVar12, iVar9);
                if (c == 0 || c(iVar9, iVar10) != c || c(iVar10, iVar11) != c || c(iVar11, iVar12) != c) {
                    break;
                }
            } else {
                bVar = bVar2;
                iVar2 = e3;
                iVar3 = e6;
                iVar4 = e4;
            }
            z4 = !z4;
            this.f3994e++;
            iVar7 = e5;
            iVar8 = iVar3;
            iVar5 = iVar2;
            bVar2 = bVar;
            iVar6 = iVar4;
            i10 = -1;
            i11 = 2;
            i12 = 1;
        }
        int i28 = this.f3994e;
        if (i28 != 5 && i28 != 7) {
            throw C0238h.f3489d;
        }
        this.f3992b = i28 == 5;
        i iVar13 = iVar;
        int i29 = i28 * 2;
        C0244n[] b13 = b(new C0244n[]{new C0244n(i5 + 0.5f, i6 - 0.5f), new C0244n(iVar6.f51b + 0.5f, iVar6.c + 0.5f), new C0244n(iVar13.f51b - 0.5f, iVar13.c + 0.5f), new C0244n(i3 - 0.5f, i4 - 0.5f)}, i29 - 3, i29);
        if (z3) {
            C0244n c0244n6 = b13[0];
            b13[0] = b13[2];
            b13[2] = c0244n6;
        }
        if (!g(b13[0]) || !g(b13[1]) || !g(b13[2]) || !g(b13[3])) {
            throw C0238h.f3489d;
        }
        int i30 = this.f3994e * 2;
        int[] iArr = {h(b13[0], b13[1], i30), h(b13[1], b13[2], i30), h(b13[2], b13[3], i30), h(b13[3], b13[0], i30)};
        int i31 = 0;
        for (int i32 = 0; i32 < 4; i32++) {
            int i33 = iArr[i32];
            i31 = (i31 << 3) + ((i33 >> (i30 - 2)) << 1) + (i33 & 1);
        }
        int i34 = ((i31 & 1) << 11) + (i31 >> 1);
        for (int i35 = 0; i35 < 4; i35++) {
            if (Integer.bitCount(g[i35] ^ i34) <= 2) {
                this.f3995f = i35;
                long j4 = 0;
                int i36 = 0;
                while (true) {
                    i7 = 10;
                    if (i36 >= 4) {
                        break;
                    }
                    int i37 = iArr[(this.f3995f + i36) % 4];
                    if (this.f3992b) {
                        j3 = j4 << 7;
                        i9 = (i37 >> 1) & 127;
                    } else {
                        j3 = j4 << 10;
                        i9 = ((i37 >> 2) & 992) + ((i37 >> 1) & 31);
                    }
                    j4 = j3 + i9;
                    i36++;
                }
                if (this.f3992b) {
                    i7 = 7;
                    i8 = 2;
                } else {
                    i8 = 4;
                }
                int i38 = i7 - i8;
                int[] iArr2 = new int[i7];
                for (int i39 = i7 - 1; i39 >= 0; i39--) {
                    iArr2[i39] = ((int) j4) & 15;
                    j4 >>= 4;
                }
                try {
                    new C0150G(C0370a.f4643k).n(iArr2, i38);
                    int i40 = 0;
                    for (int i41 = 0; i41 < i8; i41++) {
                        i40 = (i40 << 4) + iArr2[i41];
                    }
                    if (this.f3992b) {
                        this.c = (i40 >> 6) + 1;
                        this.f3993d = (i40 & 63) + 1;
                    } else {
                        this.c = (i40 >> 11) + 1;
                        this.f3993d = (i40 & 2047) + 1;
                    }
                    int i42 = this.f3995f;
                    C0244n c0244n7 = b13[i42 % 4];
                    C0244n c0244n8 = b13[(i42 + 1) % 4];
                    C0244n c0244n9 = b13[(i42 + 2) % 4];
                    C0244n c0244n10 = b13[(i42 + 3) % 4];
                    int d3 = d();
                    float f3 = d3 / 2.0f;
                    float f4 = this.f3994e;
                    float f5 = f3 - f4;
                    float f6 = f3 + f4;
                    return new C0322a(d.C(bVar, d3, d3, p1.f.a(f5, f5, f6, f5, f6, f6, f5, f6, c0244n7.f3505a, c0244n7.f3506b, c0244n8.f3505a, c0244n8.f3506b, c0244n9.f3505a, c0244n9.f3506b, c0244n10.f3505a, c0244n10.f3506b)), b(b13, this.f3994e * 2, d()), this.f3992b, this.f3993d, this.c);
                } catch (r1.b unused3) {
                    throw C0238h.f3489d;
                }
            }
        }
        throw C0238h.f3489d;
    }

    public final int c(i iVar, i iVar2) {
        int i3 = iVar.f51b;
        int i4 = iVar.c;
        float t3 = f.t(i3, i4, iVar2.f51b, iVar2.c);
        float f3 = (r1 - i3) / t3;
        float f4 = (r13 - i4) / t3;
        float f5 = i3;
        float f6 = i4;
        b bVar = this.f3991a;
        boolean b3 = bVar.b(i3, i4);
        int ceil = (int) Math.ceil(t3);
        int i5 = 0;
        for (int i6 = 0; i6 < ceil; i6++) {
            f5 += f3;
            f6 += f4;
            if (bVar.b(f.K(f5), f.K(f6)) != b3) {
                i5++;
            }
        }
        float f7 = i5 / t3;
        if (f7 <= 0.1f || f7 >= 0.9f) {
            return (f7 <= 0.1f) == b3 ? 1 : -1;
        }
        return 0;
    }

    public final int d() {
        if (this.f3992b) {
            return (this.c * 4) + 11;
        }
        int i3 = this.c;
        if (i3 <= 4) {
            return (i3 * 4) + 15;
        }
        return ((((i3 - 4) / 8) + 1) * 2) + (i3 * 4) + 15;
    }

    public final i e(i iVar, boolean z3, int i3, int i4) {
        b bVar;
        int i5 = iVar.f51b + i3;
        int i6 = iVar.c;
        while (true) {
            i6 += i4;
            boolean f3 = f(i5, i6);
            bVar = this.f3991a;
            if (!f3 || bVar.b(i5, i6) != z3) {
                break;
            }
            i5 += i3;
        }
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        while (f(i7, i8) && bVar.b(i7, i8) == z3) {
            i7 += i3;
        }
        int i9 = i7 - i3;
        while (f(i9, i8) && bVar.b(i9, i8) == z3) {
            i8 += i4;
        }
        return new i(i9, i8 - i4, 4);
    }

    public final boolean f(int i3, int i4) {
        if (i3 < 0) {
            return false;
        }
        b bVar = this.f3991a;
        return i3 < bVar.f4328b && i4 > 0 && i4 < bVar.c;
    }

    public final boolean g(C0244n c0244n) {
        return f(f.K(c0244n.f3505a), f.K(c0244n.f3506b));
    }

    public final int h(C0244n c0244n, C0244n c0244n2, int i3) {
        float f3 = c0244n.f3505a;
        float f4 = c0244n2.f3505a;
        float f5 = c0244n.f3506b;
        float f6 = c0244n2.f3506b;
        float s3 = f.s(f3, f5, f4, f6);
        float f7 = s3 / i3;
        float f8 = c0244n2.f3505a;
        float f9 = c0244n.f3505a;
        float f10 = ((f8 - f9) * f7) / s3;
        float f11 = ((f6 - f5) * f7) / s3;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            float f12 = i5;
            if (this.f3991a.b(f.K((f12 * f10) + f9), f.K((f12 * f11) + f5))) {
                i4 |= 1 << ((i3 - i5) - 1);
            }
        }
        return i4;
    }
}
