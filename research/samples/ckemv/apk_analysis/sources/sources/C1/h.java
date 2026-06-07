package C1;

import j1.C0232b;
import j1.C0234d;
import j1.C0244n;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final A.h f134a = new A.h(2);

    public static c a(f fVar) {
        int i3;
        int[] iArr;
        int i4;
        C0244n c0244n;
        C0244n c0244n2;
        C0244n c0244n3;
        C0244n c0244n4;
        if (fVar == null) {
            return null;
        }
        a r3 = fVar.r();
        a[] aVarArr = (a[]) fVar.f5067d;
        boolean z3 = fVar.f132e;
        c cVar = (c) fVar.c;
        if (r3 == null) {
            iArr = null;
        } else {
            C0244n c0244n5 = z3 ? cVar.f120b : cVar.f121d;
            C0244n c0244n6 = z3 ? cVar.c : cVar.f122e;
            int i5 = fVar.i((int) c0244n5.f3506b);
            int i6 = fVar.i((int) c0244n6.f3506b);
            int i7 = 0;
            int i8 = 1;
            int i9 = -1;
            while (true) {
                i3 = r3.f117f;
                if (i5 >= i6) {
                    break;
                }
                a aVar = aVarArr[i5];
                if (aVar != null) {
                    aVar.c();
                    int i10 = aVar.f117f;
                    int i11 = i10 - i9;
                    if (i11 == 0) {
                        i7++;
                    } else if (i11 == 1) {
                        i8 = Math.max(i8, i7);
                        i9 = aVar.f117f;
                        i7 = 1;
                    } else if (i10 >= i3) {
                        aVarArr[i5] = null;
                    } else {
                        i7 = 1;
                        i9 = i10;
                    }
                }
                i5++;
            }
            iArr = new int[i3];
            for (a aVar2 : aVarArr) {
                if (aVar2 != null && (i4 = aVar2.f117f) < i3) {
                    iArr[i4] = iArr[i4] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        int i12 = -1;
        for (int i13 : iArr) {
            i12 = Math.max(i12, i13);
        }
        int i14 = 0;
        for (int i15 : iArr) {
            i14 += i12 - i15;
            if (i15 > 0) {
                break;
            }
        }
        for (int i16 = 0; i14 > 0 && aVarArr[i16] == null; i16++) {
            i14--;
        }
        int i17 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i18 = iArr[length];
            i17 += i12 - i18;
            if (i18 > 0) {
                break;
            }
        }
        for (int length2 = aVarArr.length - 1; i17 > 0 && aVarArr[length2] == null; length2--) {
            i17--;
        }
        C0244n c0244n7 = cVar.f120b;
        C0244n c0244n8 = cVar.f121d;
        if (i14 > 0) {
            C0244n c0244n9 = z3 ? c0244n7 : c0244n8;
            C0244n c0244n10 = new C0244n(c0244n9.f3505a, ((int) c0244n9.f3506b) - i14 >= 0 ? r6 : 0);
            if (z3) {
                c0244n2 = c0244n8;
                c0244n = c0244n10;
            } else {
                c0244n = c0244n7;
                c0244n2 = c0244n10;
            }
        } else {
            c0244n = c0244n7;
            c0244n2 = c0244n8;
        }
        C0244n c0244n11 = cVar.c;
        C0244n c0244n12 = cVar.f122e;
        if (i17 > 0) {
            C0244n c0244n13 = z3 ? c0244n11 : c0244n12;
            int i19 = ((int) c0244n13.f3506b) + i17;
            int i20 = cVar.f119a.c;
            if (i19 >= i20) {
                i19 = i20 - 1;
            }
            C0244n c0244n14 = new C0244n(c0244n13.f3505a, i19);
            if (z3) {
                c0244n4 = c0244n12;
                c0244n3 = c0244n14;
            } else {
                c0244n3 = c0244n11;
                c0244n4 = c0244n14;
            }
        } else {
            c0244n3 = c0244n11;
            c0244n4 = c0244n12;
        }
        return new c(cVar.f119a, c0244n, c0244n3, c0244n2, c0244n4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x03f2, code lost:
    
        throw j1.C0234d.a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:195:0x02e7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:196:0x02ea. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:298:0x044a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0456 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, B1.c] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p1.d b(int[] iArr, int i3, int[] iArr2) {
        int[] iArr3;
        D1.a aVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        D1.a aVar2;
        v0.e eVar;
        v0.e eVar2;
        v0.e eVar3;
        int i10;
        if (iArr.length == 0) {
            throw C0234d.a();
        }
        int i11 = 1 << (i3 + 1);
        if (iArr2.length > (i11 / 2) + 3 || i11 < 0 || i11 > 512) {
            throw C0232b.a();
        }
        A.h hVar = f134a;
        hVar.getClass();
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        int i12 = 0;
        if (length <= 1 || iArr[0] != 0) {
            iArr3 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr3 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr3 = iArr4;
            }
        }
        int[] iArr5 = new int[i11];
        int i15 = i11;
        boolean z3 = false;
        while (true) {
            aVar = (D1.a) hVar.c;
            if (i15 <= 0) {
                break;
            }
            int i16 = aVar.f143a[i15];
            if (i16 == 0) {
                i10 = iArr3[iArr3.length - 1];
            } else if (i16 == 1) {
                int length2 = iArr3.length;
                int i17 = i12;
                for (int i18 = i17; i18 < length2; i18++) {
                    i17 = aVar.a(i17, iArr3[i18]);
                }
                i10 = i17;
            } else {
                int i19 = iArr3[i12];
                int length3 = iArr3.length;
                for (int i20 = 1; i20 < length3; i20++) {
                    i19 = aVar.a(aVar.c(i16, i19), iArr3[i20]);
                }
                i10 = i19;
            }
            iArr5[i11 - i15] = i10;
            if (i10 != 0) {
                z3 = true;
            }
            i15--;
            i12 = 0;
        }
        if (z3) {
            v0.e eVar4 = aVar.f145d;
            for (int i21 : iArr2) {
                eVar4 = eVar4.m(new v0.e(aVar, new int[]{(929 - aVar.f143a[(iArr.length - 1) - i21]) % 929, 1}));
            }
            v0.e eVar5 = new v0.e(aVar, iArr5);
            if (i11 < 0) {
                throw new IllegalArgumentException();
            }
            int[] iArr6 = new int[i11 + 1];
            iArr6[0] = 1;
            v0.e eVar6 = new v0.e(aVar, iArr6);
            if (eVar6.h() >= eVar5.h()) {
                eVar6 = eVar5;
                eVar5 = eVar6;
            }
            v0.e eVar7 = aVar.c;
            v0.e eVar8 = aVar.f145d;
            v0.e eVar9 = eVar7;
            while (true) {
                v0.e eVar10 = eVar6;
                eVar6 = eVar5;
                eVar5 = eVar10;
                if (eVar5.h() < i11 / 2) {
                    int g = eVar8.g(0);
                    if (g == 0) {
                        throw C0232b.a();
                    }
                    int b3 = aVar.b(g);
                    v0.e[] eVarArr = {eVar8.l(b3), eVar5.l(b3)};
                    v0.e eVar11 = eVarArr[0];
                    v0.e eVar12 = eVarArr[1];
                    int h = eVar11.h();
                    int[] iArr7 = new int[h];
                    int i22 = 1;
                    int i23 = 0;
                    for (int i24 = 929; i22 < i24 && i23 < h; i24 = 929) {
                        if (eVar11.d(i22) == 0) {
                            iArr7[i23] = aVar.b(i22);
                            i23++;
                        }
                        i22++;
                    }
                    if (i23 != h) {
                        throw C0232b.a();
                    }
                    int h3 = eVar11.h();
                    int[] iArr8 = new int[h3];
                    for (int i25 = 1; i25 <= h3; i25++) {
                        iArr8[h3 - i25] = aVar.c(i25, eVar11.g(i25));
                    }
                    if (h3 == 0) {
                        throw new IllegalArgumentException();
                    }
                    if (h3 > 1 && iArr8[0] == 0) {
                        int i26 = 1;
                        while (i26 < h3 && iArr8[i26] == 0) {
                            i26++;
                        }
                        if (i26 == h3) {
                            iArr8 = new int[]{0};
                        } else {
                            int i27 = h3 - i26;
                            int[] iArr9 = new int[i27];
                            System.arraycopy(iArr8, i26, iArr9, 0, i27);
                            iArr8 = iArr9;
                        }
                    }
                    int[] iArr10 = new int[h];
                    int i28 = 0;
                    while (i28 < h) {
                        int b4 = aVar.b(iArr7[i28]);
                        int d3 = (929 - eVar12.d(b4)) % 929;
                        if (b4 == 0) {
                            i7 = 1;
                            i9 = iArr8[iArr8.length - 1];
                        } else {
                            i7 = 1;
                            if (b4 == 1) {
                                i8 = 0;
                                for (int i29 : iArr8) {
                                    i8 = aVar.a(i8, i29);
                                }
                            } else {
                                i8 = iArr8[0];
                                int length4 = iArr8.length;
                                for (int i30 = 1; i30 < length4; i30++) {
                                    i8 = aVar.a(aVar.c(b4, i8), iArr8[i30]);
                                }
                            }
                            i9 = i8;
                        }
                        iArr10[i28] = aVar.c(d3, aVar.b(i9));
                        i28 += i7;
                    }
                    int i31 = 1;
                    int i32 = 0;
                    while (i32 < h) {
                        int length5 = iArr.length - i31;
                        int i33 = iArr7[i32];
                        if (i33 == 0) {
                            throw new IllegalArgumentException();
                        }
                        int i34 = length5 - aVar.f144b[i33];
                        if (i34 < 0) {
                            throw C0232b.a();
                        }
                        iArr[i34] = ((iArr[i34] + 929) - iArr10[i32]) % 929;
                        i32++;
                        i31 = 1;
                    }
                } else {
                    if (eVar5.k()) {
                        throw C0232b.a();
                    }
                    int b5 = aVar.b(eVar5.g(eVar5.h()));
                    v0.e eVar13 = eVar7;
                    while (eVar6.h() >= eVar5.h() && !eVar6.k()) {
                        int h4 = eVar6.h() - eVar5.h();
                        int c = aVar.c(eVar6.g(eVar6.h()), b5);
                        if (h4 < 0) {
                            throw new IllegalArgumentException();
                        }
                        if (c == 0) {
                            eVar = eVar7;
                        } else {
                            int[] iArr11 = new int[h4 + 1];
                            iArr11[0] = c;
                            eVar = new v0.e(aVar, iArr11);
                        }
                        eVar13 = eVar13.a(eVar);
                        if (h4 < 0) {
                            throw new IllegalArgumentException();
                        }
                        D1.a aVar3 = (D1.a) eVar5.f5071b;
                        if (c == 0) {
                            eVar3 = aVar3.c;
                            eVar2 = eVar7;
                        } else {
                            int[] iArr12 = (int[]) eVar5.c;
                            int length6 = iArr12.length;
                            int[] iArr13 = new int[h4 + length6];
                            int i35 = 0;
                            while (i35 < length6) {
                                iArr13[i35] = aVar3.c(iArr12[i35], c);
                                i35++;
                                eVar7 = eVar7;
                            }
                            eVar2 = eVar7;
                            eVar3 = new v0.e(aVar3, iArr13);
                        }
                        eVar6 = eVar6.q(eVar3);
                        eVar7 = eVar2;
                    }
                    v0.e eVar14 = eVar7;
                    v0.e q3 = eVar13.m(eVar8).q(eVar9);
                    int[] iArr14 = (int[]) q3.c;
                    int length7 = iArr14.length;
                    int[] iArr15 = new int[length7];
                    int i36 = 0;
                    while (true) {
                        aVar2 = (D1.a) q3.f5071b;
                        if (i36 < length7) {
                            int i37 = iArr14[i36];
                            aVar2.getClass();
                            iArr15[i36] = (929 - i37) % 929;
                            i36++;
                        }
                    }
                    eVar7 = eVar14;
                    eVar9 = eVar8;
                    eVar8 = new v0.e(aVar2, iArr15);
                }
            }
        }
        if (iArr.length < 4) {
            throw C0234d.a();
        }
        int i38 = iArr[0];
        if (i38 > iArr.length) {
            throw C0234d.a();
        }
        if (i38 == 0) {
            if (i11 >= iArr.length) {
                throw C0234d.a();
            }
            iArr[0] = iArr.length - i11;
        }
        String valueOf = String.valueOf(i3);
        char[] cArr = d.f125a;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i39 = iArr[1];
        ?? obj = new Object();
        char c3 = 0;
        int i40 = 2;
        while (true) {
            int i41 = iArr[c3];
            if (i40 >= i41) {
                if (sb.length() == 0) {
                    throw C0234d.a();
                }
                p1.d dVar = new p1.d(null, sb.toString(), null, valueOf);
                dVar.f4338e = obj;
                return dVar;
            }
            if (i39 != 913) {
                switch (i39) {
                    case 900:
                        i4 = d.c(iArr, i40, sb);
                        break;
                    case 901:
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i42 = 928;
                        long j3 = 900;
                        if (i39 == 901) {
                            int[] iArr16 = new int[6];
                            int i43 = i40 + 1;
                            int i44 = iArr[i40];
                            long j4 = 0;
                            int i45 = 0;
                            int i46 = 0;
                            boolean z4 = false;
                            while (true) {
                                i5 = iArr[i45];
                                if (i43 < i5 && !z4) {
                                    int i47 = i46 + 1;
                                    iArr16[i46] = i44;
                                    j4 = (j4 * 900) + i44;
                                    int i48 = i43 + 1;
                                    i44 = iArr[i43];
                                    if (i44 != 928) {
                                        switch (i44) {
                                            case 900:
                                            case 901:
                                            case 902:
                                                break;
                                            default:
                                                switch (i44) {
                                                    case 922:
                                                    case 923:
                                                    case 924:
                                                        break;
                                                    default:
                                                        if (i47 % 5 != 0 || i47 <= 0) {
                                                            i43 = i48;
                                                            i45 = 0;
                                                            i46 = i47;
                                                            break;
                                                        } else {
                                                            for (int i49 = i45; i49 < 6; i49++) {
                                                                byteArrayOutputStream.write((byte) (j4 >> ((5 - i49) * 8)));
                                                            }
                                                            i43 = i48;
                                                            j4 = 0;
                                                            i45 = 0;
                                                            i46 = 0;
                                                            break;
                                                        }
                                                        break;
                                                }
                                        }
                                    }
                                    i46 = i47;
                                    i45 = 0;
                                    z4 = true;
                                }
                            }
                            if (i43 != i5 || i44 >= 900) {
                                i6 = 1;
                            } else {
                                i6 = 1;
                                iArr16[i46] = i44;
                                i46++;
                            }
                            for (int i50 = 0; i50 < i46; i50 += i6) {
                                byteArrayOutputStream.write((byte) iArr16[i50]);
                            }
                            i40 = i43;
                        } else if (i39 == 924) {
                            long j5 = 0;
                            boolean z5 = false;
                            int i51 = 0;
                            while (i40 < iArr[0] && !z5) {
                                int i52 = i40 + 1;
                                int i53 = iArr[i40];
                                if (i53 < 900) {
                                    i51++;
                                    j5 = (j5 * j3) + i53;
                                } else {
                                    if (i53 != i42) {
                                        switch (i53) {
                                            default:
                                                switch (i53) {
                                                }
                                            case 900:
                                            case 901:
                                            case 902:
                                                z5 = true;
                                                break;
                                        }
                                        if (i51 % 5 != 0 && i51 > 0) {
                                            for (int i54 = 0; i54 < 6; i54++) {
                                                byteArrayOutputStream.write((byte) (j5 >> ((5 - i54) * 8)));
                                            }
                                            j5 = 0;
                                            i51 = 0;
                                        }
                                        i42 = 928;
                                        j3 = 900;
                                    }
                                    z5 = true;
                                    if (i51 % 5 != 0) {
                                    }
                                    i42 = 928;
                                    j3 = 900;
                                }
                                i40 = i52;
                                if (i51 % 5 != 0) {
                                }
                                i42 = 928;
                                j3 = 900;
                            }
                        }
                        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
                        i4 = i40;
                        break;
                    case 902:
                        i4 = d.b(iArr, i40, sb);
                        break;
                    default:
                        switch (i39) {
                            case 922:
                            case 923:
                                throw C0234d.a();
                            case 924:
                                break;
                            case 925:
                                i4 = i40 + 1;
                                break;
                            case 926:
                                i4 = i40 + 2;
                                break;
                            case 927:
                                i4 = i40 + 1;
                                int i55 = iArr[i40];
                                HashMap hashMap = p1.c.f4331d;
                                if (i55 >= 0 && i55 < 900) {
                                    charset = Charset.forName(((p1.c) p1.c.f4331d.get(Integer.valueOf(i55))).name());
                                    break;
                                }
                                break;
                            case 928:
                                if (i40 + 2 > i41) {
                                    throw C0234d.a();
                                }
                                int[] iArr17 = new int[2];
                                int i56 = 0;
                                while (i56 < 2) {
                                    iArr17[i56] = iArr[i40];
                                    i56++;
                                    i40++;
                                }
                                ?? r8 = 1;
                                Integer.parseInt(d.a(iArr17, 2));
                                i4 = d.c(iArr, i40, new StringBuilder());
                                int i57 = iArr[i4] == 923 ? i4 + 1 : -1;
                                while (i4 < iArr[0]) {
                                    int i58 = iArr[i4];
                                    if (i58 == 922) {
                                        i4 += r8;
                                        obj.f75a = r8;
                                    } else {
                                        if (i58 != 923) {
                                            throw C0234d.a();
                                        }
                                        switch (iArr[i4 + 1]) {
                                            case 0:
                                                i4 = d.c(iArr, i4 + 2, new StringBuilder());
                                                break;
                                            case 1:
                                                StringBuilder sb2 = new StringBuilder();
                                                i4 = d.b(iArr, i4 + 2, sb2);
                                                Integer.parseInt(sb2.toString());
                                                break;
                                            case 2:
                                                StringBuilder sb3 = new StringBuilder();
                                                i4 = d.b(iArr, i4 + 2, sb3);
                                                Long.parseLong(sb3.toString());
                                                break;
                                            case 3:
                                                i4 = d.c(iArr, i4 + 2, new StringBuilder());
                                                break;
                                            case 4:
                                                i4 = d.c(iArr, i4 + 2, new StringBuilder());
                                                break;
                                            case 5:
                                                StringBuilder sb4 = new StringBuilder();
                                                i4 = d.b(iArr, i4 + 2, sb4);
                                                Long.parseLong(sb4.toString());
                                                break;
                                            case 6:
                                                StringBuilder sb5 = new StringBuilder();
                                                i4 = d.b(iArr, i4 + 2, sb5);
                                                Integer.parseInt(sb5.toString());
                                                break;
                                            default:
                                                throw C0234d.a();
                                        }
                                    }
                                    r8 = 1;
                                }
                                if (i57 != -1) {
                                    int i59 = i4 - i57;
                                    if (obj.f75a) {
                                        i59--;
                                    }
                                    Arrays.copyOfRange(iArr, i57, i59 + i57);
                                }
                                break;
                            default:
                                i4 = d.c(iArr, i40 - 1, sb);
                                break;
                        }
                }
            } else {
                i4 = i40 + 1;
                sb.append((char) iArr[i40]);
            }
            if (i4 >= iArr.length) {
                throw C0234d.a();
            }
            i40 = i4 + 1;
            i39 = iArr[i4];
            c3 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0031, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0031, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0031, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[EDGE_INSN: B:31:0x005b->B:32:0x005b BREAK  A[LOOP:2: B:19:0x0042->B:27:0x0042], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a c(p1.b bVar, int i3, int i4, boolean z3, int i5, int i6, int i7, int i8) {
        int i9;
        int i10 = i3;
        int i11 = z3 ? -1 : 1;
        boolean z4 = z3;
        int i12 = i5;
        int i13 = 0;
        loop0: while (true) {
            if (i13 >= 2) {
                break;
            }
            while (true) {
                if (!z4) {
                    if (i12 >= i4) {
                        break;
                    }
                    if (z4 != bVar.b(i12, i6)) {
                        break;
                    }
                } else {
                    if (i12 < i10) {
                        break;
                    }
                    if (z4 != bVar.b(i12, i6)) {
                        if (Math.abs(i5 - i12) > 2) {
                            i12 = i5;
                            break loop0;
                        }
                        i12 += i11;
                    }
                }
            }
            i11 = -i11;
            z4 = !z4;
            i13++;
        }
        int[] iArr = new int[8];
        int i14 = z3 ? 1 : -1;
        boolean z5 = z3;
        int i15 = i12;
        int i16 = 0;
        while (true) {
            if (z3) {
                if (i15 >= i4) {
                    break;
                }
                if (i16 < 8) {
                    break;
                }
                if (bVar.b(i15, i6) == z5) {
                    iArr[i16] = iArr[i16] + 1;
                    i15 += i14;
                } else {
                    i16++;
                    z5 = !z5;
                }
            } else {
                if (i15 < i10) {
                    break;
                }
                if (i16 < 8) {
                }
            }
        }
        if (i16 != 8) {
            if (z3) {
                i10 = i4;
            }
            if (i15 != i10 || i16 != 7) {
                iArr = null;
            }
        }
        if (iArr == null) {
            return null;
        }
        int O2 = v0.f.O(iArr);
        if (z3) {
            i9 = i12 + O2;
        } else {
            for (int i17 = 0; i17 < iArr.length / 2; i17++) {
                int i18 = iArr[i17];
                iArr[i17] = iArr[(iArr.length - 1) - i17];
                iArr[(iArr.length - 1) - i17] = i18;
            }
            int i19 = i12;
            i12 -= O2;
            i9 = i19;
        }
        if (i7 - 2 > O2 || O2 > i8 + 2) {
            return null;
        }
        float[][] fArr = g.f133a;
        float O3 = v0.f.O(iArr);
        int[] iArr2 = new int[8];
        int i20 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < 17; i22++) {
            float f3 = ((i22 * O3) / 17.0f) + (O3 / 34.0f);
            int i23 = iArr[i21] + i20;
            if (i23 <= f3) {
                i21++;
                i20 = i23;
            }
            iArr2[i21] = iArr2[i21] + 1;
        }
        long j3 = 0;
        for (int i24 = 0; i24 < 8; i24++) {
            for (int i25 = 0; i25 < iArr2[i24]; i25++) {
                j3 = (j3 << 1) | (i24 % 2 == 0 ? 1 : 0);
            }
        }
        int i26 = (int) j3;
        int[] iArr3 = B1.a.f73b;
        int binarySearch = Arrays.binarySearch(iArr3, i26 & 262143);
        int[] iArr4 = B1.a.c;
        if (binarySearch < 0 || (iArr4[binarySearch] - 1) % 929 == -1) {
            i26 = -1;
        }
        if (i26 == -1) {
            int O4 = v0.f.O(iArr);
            float[] fArr2 = new float[8];
            if (O4 > 1) {
                for (int i27 = 0; i27 < 8; i27++) {
                    fArr2[i27] = iArr[i27] / O4;
                }
            }
            float f4 = Float.MAX_VALUE;
            i26 = -1;
            int i28 = 0;
            while (true) {
                float[][] fArr3 = g.f133a;
                if (i28 >= fArr3.length) {
                    break;
                }
                float[] fArr4 = fArr3[i28];
                float f5 = 0.0f;
                for (int i29 = 0; i29 < 8; i29++) {
                    float f6 = fArr4[i29] - fArr2[i29];
                    f5 = (f6 * f6) + f5;
                    if (f5 >= f4) {
                        break;
                    }
                }
                if (f5 < f4) {
                    i26 = iArr3[i28];
                    f4 = f5;
                }
                i28++;
            }
        }
        int binarySearch2 = Arrays.binarySearch(iArr3, i26 & 262143);
        int i30 = binarySearch2 < 0 ? -1 : (iArr4[binarySearch2] - 1) % 929;
        if (i30 == -1) {
            return null;
        }
        int[] iArr5 = new int[8];
        int i31 = 7;
        int i32 = 0;
        while (true) {
            int i33 = i26 & 1;
            if (i33 != i32) {
                i31--;
                if (i31 < 0) {
                    return new a(i12, i9, ((((iArr5[0] - iArr5[2]) + iArr5[4]) - iArr5[6]) + 9) % 9, i30, 1);
                }
                i32 = i33;
            }
            iArr5[i31] = iArr5[i31] + 1;
            i26 >>= 1;
        }
    }

    public static f d(p1.b bVar, c cVar, C0244n c0244n, boolean z3, int i3, int i4) {
        f fVar = new f(cVar, z3);
        int i5 = 0;
        while (i5 < 2) {
            int i6 = i5 == 0 ? 1 : -1;
            int i7 = (int) c0244n.f3505a;
            for (int i8 = (int) c0244n.f3506b; i8 <= cVar.f124i && i8 >= cVar.h; i8 += i6) {
                a c = c(bVar, 0, bVar.f4328b, z3, i7, i8, i3, i4);
                if (c != null) {
                    ((a[]) fVar.f5067d)[fVar.i(i8)] = c;
                    i7 = z3 ? c.f114b : c.c;
                }
            }
            i5++;
        }
        return fVar;
    }
}
