package G1;

import I1.t;
import f.C0150G;
import j1.C0232b;
import j1.C0234d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r1.C0370a;
import t1.AbstractC0385a;
import v0.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0150G f238a;

    public d(int i3) {
        switch (i3) {
            case 1:
                this.f238a = new C0150G(C0370a.f4645m);
                return;
            case 2:
                this.f238a = new C0150G(C0370a.f4647o);
                return;
            default:
                this.f238a = new C0150G(C0370a.f4644l);
                return;
        }
    }

    public void a(byte[] bArr, int i3, int i4, int i5, int i6) {
        int i7 = i4 + i5;
        int i8 = i6 == 0 ? 1 : 2;
        int[] iArr = new int[i7 / i8];
        for (int i9 = 0; i9 < i7; i9++) {
            if (i6 == 0 || i9 % 2 == i6 - 1) {
                iArr[i9 / i8] = bArr[i9 + i3] & 255;
            }
        }
        try {
            this.f238a.n(iArr, i5 / i8);
            for (int i10 = 0; i10 < i4; i10++) {
                if (i6 == 0 || i10 % 2 == i6 - 1) {
                    bArr[i10 + i3] = (byte) iArr[i10 / i8];
                }
            }
        } catch (r1.b unused) {
            throw C0232b.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0345, code lost:
    
        throw j1.C0234d.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1.d b(a aVar, Map map) {
        int i3;
        int i4;
        int b3;
        g gVar;
        i iVar;
        int b4;
        char c;
        boolean z3 = true;
        i d3 = aVar.d();
        int i5 = aVar.c().f240a;
        f c3 = aVar.c();
        i d4 = aVar.d();
        int i6 = q.h.b(8)[c3.f241b];
        p1.b bVar = (p1.b) aVar.f233b;
        int i7 = bVar.c;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (e.a(i6, i9, i10)) {
                    bVar.a(i10, i9);
                }
            }
        }
        int i11 = d4.f253a * 4;
        int i12 = i11 + 17;
        p1.b bVar2 = new p1.b(i12, i12);
        bVar2.g(0, 0, 9, 9);
        int i13 = i11 + 9;
        bVar2.g(i13, 0, 8, 9);
        bVar2.g(0, i13, 9, 8);
        int[] iArr = d4.f254b;
        int length = iArr.length;
        int i14 = 0;
        while (true) {
            i3 = 2;
            if (i14 >= length) {
                break;
            }
            int i15 = iArr[i14] - 2;
            while (i8 < length) {
                if ((i14 != 0 || (i8 != 0 && i8 != length - 1)) && (i14 != length - 1 || i8 != 0)) {
                    bVar2.g(iArr[i8] - 2, i15, 5, 5);
                }
                i8++;
            }
            i14++;
            i8 = 0;
        }
        int i16 = 6;
        bVar2.g(6, 9, 1, i11);
        bVar2.g(9, 6, i11, 1);
        if (d4.f253a > 6) {
            int i17 = i11 + 6;
            bVar2.g(i17, 0, 3, 6);
            bVar2.g(0, i17, 6, 3);
        }
        int i18 = d4.f255d;
        byte[] bArr = new byte[i18];
        int i19 = i7 - 1;
        boolean z4 = true;
        int i20 = i19;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i20 > 0) {
            if (i20 == i16) {
                i20--;
            }
            int i24 = 0;
            while (i24 < i7) {
                int i25 = z4 ? i19 - i24 : i24;
                int i26 = 0;
                while (i26 < i3) {
                    int i27 = i20 - i26;
                    if (!bVar2.b(i27, i25)) {
                        i22++;
                        int i28 = i23 << 1;
                        int i29 = bVar.b(i27, i25) ? i28 | 1 : i28;
                        if (i22 == 8) {
                            bArr[i21] = (byte) i29;
                            i21++;
                            i22 = 0;
                            i23 = 0;
                        } else {
                            i23 = i29;
                        }
                    }
                    i26++;
                    i3 = 2;
                }
                i24++;
                z3 = true;
                i3 = 2;
            }
            z4 = !z4;
            i20 -= 2;
            i16 = 6;
            z3 = true;
            i3 = 2;
        }
        if (i21 != i18) {
            throw C0234d.a();
        }
        if (i18 != d3.f255d) {
            throw new IllegalArgumentException();
        }
        F0.e eVar = d3.c[q.h.a(i5)];
        A1.i[] iVarArr = (A1.i[]) eVar.c;
        int i30 = 0;
        for (A1.i iVar2 : iVarArr) {
            i30 += iVar2.f51b;
        }
        b[] bVarArr = new b[i30];
        int length2 = iVarArr.length;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            i4 = eVar.f166b;
            if (i32 >= length2) {
                break;
            }
            A1.i iVar3 = iVarArr[i32];
            int i33 = 0;
            while (i33 < iVar3.f51b) {
                int i34 = iVar3.c;
                bVarArr[i31] = new b(i34, new byte[i4 + i34]);
                i33++;
                i31++;
            }
            i32++;
        }
        int length3 = bVarArr[0].f236b.length;
        int i35 = i30 - 1;
        while (i35 >= 0 && bVarArr[i35].f236b.length != length3) {
            i35--;
        }
        int i36 = i35 + 1;
        int i37 = length3 - i4;
        int i38 = 0;
        int i39 = 0;
        while (i38 < i37) {
            int i40 = i39;
            int i41 = 0;
            while (i41 < i31) {
                bVarArr[i41].f236b[i38] = bArr[i40];
                i41++;
                i40++;
            }
            i38++;
            i39 = i40;
        }
        int i42 = i36;
        while (i42 < i31) {
            bVarArr[i42].f236b[i37] = bArr[i39];
            i42++;
            i39++;
        }
        int length4 = bVarArr[0].f236b.length;
        while (i37 < length4) {
            int i43 = i39;
            int i44 = 0;
            while (i44 < i31) {
                bVarArr[i44].f236b[i44 < i36 ? i37 : i37 + 1] = bArr[i43];
                i44++;
                i43++;
            }
            i37++;
            i39 = i43;
        }
        int i45 = 0;
        for (int i46 = 0; i46 < i30; i46++) {
            i45 += bVarArr[i46].f235a;
        }
        byte[] bArr2 = new byte[i45];
        int i47 = 0;
        int i48 = 0;
        while (i47 < i30) {
            b bVar3 = bVarArr[i47];
            byte[] bArr3 = bVar3.f236b;
            int i49 = bVar3.f235a;
            int length5 = bArr3.length;
            int[] iArr2 = new int[length5];
            for (int i50 = 0; i50 < length5; i50++) {
                iArr2[i50] = bArr3[i50] & 255;
            }
            try {
                this.f238a.n(iArr2, bArr3.length - i49);
                for (int i51 = 0; i51 < i49; i51++) {
                    bArr3[i51] = (byte) iArr2[i51];
                }
                int i52 = i48;
                int i53 = 0;
                while (i53 < i49) {
                    bArr2[i52] = bArr3[i53];
                    i53++;
                    i52++;
                }
                i47++;
                i48 = i52;
            } catch (r1.b unused) {
                throw C0232b.a();
            }
        }
        char[] cArr = c.f237a;
        t tVar = new t(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i54 = -1;
        int i55 = -1;
        boolean z5 = false;
        p1.c cVar = null;
        while (true) {
            try {
                int a3 = tVar.a();
                g gVar2 = g.TERMINATOR;
                if (a3 < 4 || (b3 = tVar.b(4)) == 0) {
                    gVar = gVar2;
                } else if (b3 == 1) {
                    gVar = g.NUMERIC;
                } else if (b3 == 2) {
                    gVar = g.ALPHANUMERIC;
                } else if (b3 == 3) {
                    gVar = g.STRUCTURED_APPEND;
                } else if (b3 == 4) {
                    gVar = g.BYTE;
                } else if (b3 == 5) {
                    gVar = g.FNC1_FIRST_POSITION;
                } else if (b3 == 7) {
                    gVar = g.ECI;
                } else if (b3 == 8) {
                    gVar = g.KANJI;
                } else if (b3 == 9) {
                    gVar = g.FNC1_SECOND_POSITION;
                } else {
                    if (b3 != 13) {
                        throw new IllegalArgumentException();
                    }
                    gVar = g.HANZI;
                }
                int[] iArr3 = gVar.f250b;
                int ordinal = gVar.ordinal();
                if (ordinal == 0) {
                    iVar = d3;
                } else if (ordinal == 3) {
                    iVar = d3;
                    if (tVar.a() < 16) {
                        throw C0234d.a();
                    }
                    i54 = tVar.b(8);
                    i55 = tVar.b(8);
                } else {
                    if (ordinal == 5) {
                        iVar = d3;
                        int b5 = tVar.b(8);
                        if ((b5 & 128) == 0) {
                            b4 = b5 & 127;
                        } else if ((b5 & 192) == 128) {
                            b4 = ((b5 & 63) << 8) | tVar.b(8);
                        } else {
                            if ((b5 & 224) != 192) {
                                throw C0234d.a();
                            }
                            b4 = ((b5 & 31) << 16) | tVar.b(16);
                            HashMap hashMap = p1.c.f4331d;
                            if (b4 < 0 || b4 >= 900) {
                                break;
                            }
                            cVar = (p1.c) p1.c.f4331d.get(Integer.valueOf(b4));
                            if (cVar == null) {
                                throw C0234d.a();
                            }
                        }
                        HashMap hashMap2 = p1.c.f4331d;
                        if (b4 < 0) {
                            break;
                        }
                        break;
                    }
                    if (ordinal == 7 || ordinal == 8) {
                        iVar = d3;
                        z5 = true;
                    } else {
                        int i56 = d3.f253a;
                        iVar = d3;
                        if (ordinal != 9) {
                            int b6 = tVar.b(iArr3[i56 <= 9 ? (char) 0 : i56 <= 26 ? (char) 1 : (char) 2]);
                            int ordinal2 = gVar.ordinal();
                            if (ordinal2 == 1) {
                                c = 6;
                                c.e(tVar, sb, b6);
                            } else if (ordinal2 == 2) {
                                c = 6;
                                c.a(tVar, sb, b6, z5);
                            } else if (ordinal2 != 4) {
                                c = 6;
                                if (ordinal2 != 6) {
                                    throw C0234d.a();
                                }
                                c.d(tVar, sb, b6);
                            } else {
                                c = 6;
                                c.b(tVar, sb, b6, cVar, arrayList, map);
                            }
                        } else {
                            int b7 = tVar.b(4);
                            int b8 = tVar.b(iArr3[i56 <= 9 ? (char) 0 : i56 <= 26 ? (char) 1 : (char) 2]);
                            if (b7 == 1) {
                                c.c(tVar, sb, b8);
                            }
                        }
                    }
                }
                if (gVar == gVar2) {
                    return new p1.d(bArr2, sb.toString(), arrayList.isEmpty() ? null : arrayList, e.j(i5), i54, i55);
                }
                d3 = iVar;
            } catch (IllegalArgumentException unused2) {
                throw C0234d.a();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0689, code lost:
    
        if (r3.length() <= 0) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x068b, code lost:
    
        r2.append((java.lang.CharSequence) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x068e, code lost:
    
        r2 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0699, code lost:
    
        if (r4.isEmpty() == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x069b, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x069f, code lost:
    
        return new p1.d(r0, r2, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03a0, code lost:
    
        throw j1.C0234d.a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:149:0x0390. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[LOOP:15: B:115:0x035d->B:147:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1.d c(p1.b bVar) {
        p1.b bVar2;
        p1.b bVar3;
        int i3;
        int i4;
        int b3;
        int i5;
        int i6;
        int b4;
        int b5;
        m mVar = new m(bVar);
        t1.b bVar4 = (t1.b) mVar.f5088e;
        int i7 = bVar4.g;
        byte[] bArr = new byte[i7];
        p1.b bVar5 = (p1.b) mVar.c;
        int i8 = bVar5.c;
        int i9 = 0;
        int i10 = 0;
        boolean z3 = false;
        int i11 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i12 = 4;
        while (true) {
            int i13 = bVar5.f4328b;
            if (i12 == i8 && i10 == 0 && !z3) {
                int i14 = i11 + 1;
                int i15 = i8 - 1;
                int i16 = (mVar.H(i15, i9, i8, i13) ? 1 : 0) << 1;
                if (mVar.H(i15, 1, i8, i13)) {
                    i16 |= 1;
                }
                int i17 = i16 << 1;
                if (mVar.H(i15, 2, i8, i13)) {
                    i17 |= 1;
                }
                int i18 = i17 << 1;
                bVar2 = bVar5;
                if (mVar.H(0, i13 - 2, i8, i13)) {
                    i18 |= 1;
                }
                int i19 = i18 << 1;
                int i20 = i13 - 1;
                if (mVar.H(0, i20, i8, i13)) {
                    i19 |= 1;
                }
                int i21 = i19 << 1;
                if (mVar.H(1, i20, i8, i13)) {
                    i21 |= 1;
                }
                int i22 = i21 << 1;
                if (mVar.H(2, i20, i8, i13)) {
                    i22 |= 1;
                }
                int i23 = i22 << 1;
                if (mVar.H(3, i20, i8, i13)) {
                    i23 |= 1;
                }
                bArr[i11] = (byte) i23;
                i12 -= 2;
                i10 += 2;
                i11 = i14;
                z3 = true;
            } else {
                bVar2 = bVar5;
                int i24 = i8 - 2;
                if (i12 == i24 && i10 == 0 && (i13 & 3) != 0 && !z4) {
                    int i25 = i11 + 1;
                    int i26 = (mVar.H(i8 + (-3), 0, i8, i13) ? 1 : 0) << 1;
                    if (mVar.H(i24, 0, i8, i13)) {
                        i26 |= 1;
                    }
                    int i27 = i26 << 1;
                    if (mVar.H(i8 - 1, 0, i8, i13)) {
                        i27 |= 1;
                    }
                    int i28 = i27 << 1;
                    if (mVar.H(0, i13 - 4, i8, i13)) {
                        i28 |= 1;
                    }
                    int i29 = i28 << 1;
                    if (mVar.H(0, i13 - 3, i8, i13)) {
                        i29 |= 1;
                    }
                    int i30 = i29 << 1;
                    if (mVar.H(0, i13 - 2, i8, i13)) {
                        i30 |= 1;
                    }
                    int i31 = i30 << 1;
                    int i32 = i13 - 1;
                    if (mVar.H(0, i32, i8, i13)) {
                        i31 |= 1;
                    }
                    int i33 = i31 << 1;
                    if (mVar.H(1, i32, i8, i13)) {
                        i33 |= 1;
                    }
                    bArr[i11] = (byte) i33;
                    i12 -= 2;
                    i10 += 2;
                    i11 = i25;
                    z4 = true;
                } else if (i12 == i8 + 4 && i10 == 2 && (i13 & 7) == 0 && !z5) {
                    int i34 = i11 + 1;
                    int i35 = i8 - 1;
                    int i36 = (mVar.H(i35, 0, i8, i13) ? 1 : 0) << 1;
                    int i37 = i13 - 1;
                    if (mVar.H(i35, i37, i8, i13)) {
                        i36 |= 1;
                    }
                    int i38 = i36 << 1;
                    int i39 = i13 - 3;
                    if (mVar.H(0, i39, i8, i13)) {
                        i38 |= 1;
                    }
                    int i40 = i38 << 1;
                    int i41 = i13 - 2;
                    boolean z7 = z3;
                    if (mVar.H(0, i41, i8, i13)) {
                        i40 |= 1;
                    }
                    boolean z8 = z4;
                    int i42 = i40 << 1;
                    if (mVar.H(0, i37, i8, i13)) {
                        i42 |= 1;
                    }
                    int i43 = i42 << 1;
                    if (mVar.H(1, i39, i8, i13)) {
                        i43 |= 1;
                    }
                    int i44 = i43 << 1;
                    if (mVar.H(1, i41, i8, i13)) {
                        i44 |= 1;
                    }
                    int i45 = i44 << 1;
                    if (mVar.H(1, i37, i8, i13)) {
                        i45 |= 1;
                    }
                    bArr[i11] = (byte) i45;
                    i12 -= 2;
                    i10 += 2;
                    i11 = i34;
                    z3 = z7;
                    z4 = z8;
                    z5 = true;
                } else {
                    boolean z9 = z3;
                    boolean z10 = z4;
                    if (i12 == i24 && i10 == 0 && (i13 & 7) == 4 && !z6) {
                        int i46 = i11 + 1;
                        int i47 = (mVar.H(i8 + (-3), 0, i8, i13) ? 1 : 0) << 1;
                        if (mVar.H(i24, 0, i8, i13)) {
                            i47 |= 1;
                        }
                        int i48 = i47 << 1;
                        if (mVar.H(i8 - 1, 0, i8, i13)) {
                            i48 |= 1;
                        }
                        int i49 = i48 << 1;
                        if (mVar.H(0, i13 - 2, i8, i13)) {
                            i49 |= 1;
                        }
                        int i50 = i49 << 1;
                        int i51 = i13 - 1;
                        if (mVar.H(0, i51, i8, i13)) {
                            i50 |= 1;
                        }
                        int i52 = i50 << 1;
                        if (mVar.H(1, i51, i8, i13)) {
                            i52 |= 1;
                        }
                        int i53 = i52 << 1;
                        if (mVar.H(2, i51, i8, i13)) {
                            i53 |= 1;
                        }
                        int i54 = i53 << 1;
                        if (mVar.H(3, i51, i8, i13)) {
                            i54 |= 1;
                        }
                        bArr[i11] = (byte) i54;
                        i12 -= 2;
                        i10 += 2;
                        i11 = i46;
                        z3 = z9;
                        z4 = z10;
                        z6 = true;
                    } else {
                        while (true) {
                            bVar3 = (p1.b) mVar.f5087d;
                            if (i12 < i8 && i10 >= 0 && !bVar3.b(i10, i12)) {
                                bArr[i11] = (byte) mVar.I(i12, i10, i8, i13);
                                i11++;
                            }
                            int i55 = i12 - 2;
                            int i56 = i10 + 2;
                            if (i55 < 0 || i56 >= i13) {
                                break;
                            }
                            i12 = i55;
                            i10 = i56;
                        }
                        int i57 = i12 - 1;
                        int i58 = i10 + 5;
                        while (true) {
                            if (i57 >= 0 && i58 < i13 && !bVar3.b(i58, i57)) {
                                bArr[i11] = (byte) mVar.I(i57, i58, i8, i13);
                                i11++;
                            }
                            int i59 = i57 + 2;
                            int i60 = i58 - 2;
                            if (i59 >= i8 || i60 < 0) {
                                break;
                            }
                            i57 = i59;
                            i58 = i60;
                        }
                        i12 = i57 + 5;
                        i10 = i58 - 1;
                        z3 = z9;
                        z4 = z10;
                    }
                }
            }
            if (i12 >= i8 && i10 >= i13) {
                break;
            }
            i9 = 0;
            bVar5 = bVar2;
        }
        if (i11 != bVar4.g) {
            throw C0234d.a();
        }
        F0.e eVar = bVar4.f4908f;
        A1.i[] iVarArr = (A1.i[]) eVar.c;
        int i61 = 0;
        for (A1.i iVar : iVarArr) {
            i61 += iVar.f51b;
        }
        b[] bVarArr = new b[i61];
        int length = iVarArr.length;
        int i62 = 0;
        int i63 = 0;
        while (true) {
            i3 = eVar.f166b;
            if (i62 >= length) {
                break;
            }
            A1.i iVar2 = iVarArr[i62];
            int i64 = 0;
            while (i64 < iVar2.f51b) {
                int i65 = iVar2.c;
                bVarArr[i63] = new b(i65, new byte[i3 + i65]);
                i64++;
                i63++;
                eVar = eVar;
            }
            i62++;
        }
        int length2 = bVarArr[0].f236b.length - i3;
        int i66 = length2 - 1;
        int i67 = 0;
        for (int i68 = 0; i68 < i66; i68++) {
            int i69 = 0;
            while (i69 < i63) {
                bVarArr[i69].f236b[i68] = bArr[i67];
                i69++;
                i67++;
            }
        }
        boolean z11 = bVar4.f4904a == 24;
        int i70 = 8;
        int i71 = z11 ? 8 : i63;
        int i72 = 0;
        while (i72 < i71) {
            bVarArr[i72].f236b[i66] = bArr[i67];
            i72++;
            i67++;
        }
        int length3 = bVarArr[0].f236b.length;
        while (true) {
            i4 = 7;
            if (length2 >= length3) {
                break;
            }
            int i73 = 0;
            while (i73 < i63) {
                int i74 = z11 ? (i73 + 8) % i63 : i73;
                bVarArr[i74].f236b[(!z11 || i74 <= 7) ? length2 : length2 - 1] = bArr[i67];
                i73++;
                i67++;
            }
            length2++;
        }
        if (i67 != i7) {
            throw new IllegalArgumentException();
        }
        int i75 = 0;
        for (int i76 = 0; i76 < i61; i76++) {
            i75 += bVarArr[i76].f235a;
        }
        byte[] bArr2 = new byte[i75];
        for (int i77 = 0; i77 < i61; i77++) {
            b bVar6 = bVarArr[i77];
            byte[] bArr3 = bVar6.f236b;
            int i78 = bVar6.f235a;
            int length4 = bArr3.length;
            int[] iArr = new int[length4];
            for (int i79 = 0; i79 < length4; i79++) {
                iArr[i79] = bArr3[i79] & 255;
            }
            try {
                this.f238a.n(iArr, bArr3.length - i78);
                for (int i80 = 0; i80 < i78; i80++) {
                    bArr3[i80] = (byte) iArr[i80];
                }
                for (int i81 = 0; i81 < i78; i81++) {
                    bArr2[(i81 * i61) + i77] = bArr3[i81];
                }
            } catch (r1.b unused) {
                throw C0232b.a();
            }
        }
        t tVar = new t(bArr2);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        int i82 = 2;
        while (true) {
            int i83 = 6;
            if (i82 == 2) {
                boolean z12 = false;
                while (true) {
                    int b6 = tVar.b(i70);
                    if (b6 == 0) {
                        throw C0234d.a();
                    }
                    if (b6 <= 128) {
                        if (z12) {
                            b6 += 128;
                        }
                        sb.append((char) (b6 - 1));
                        i83 = 2;
                    } else if (b6 == 129) {
                        i83 = 1;
                    } else {
                        if (b6 > 229) {
                            switch (b6) {
                                case 230:
                                    i83 = 3;
                                    break;
                                case 231:
                                    i83 = i4;
                                    break;
                                case 232:
                                    sb.append((char) 29);
                                    if (tVar.a() <= 0) {
                                        i83 = 2;
                                        break;
                                    }
                                case 233:
                                case 234:
                                case 241:
                                    break;
                                case 235:
                                    z12 = true;
                                    if (tVar.a() <= 0) {
                                    }
                                    break;
                                case 236:
                                    sb.append("[)>\u001e05\u001d");
                                    sb2.insert(0, "\u001e\u0004");
                                    if (tVar.a() <= 0) {
                                    }
                                    break;
                                case 237:
                                    sb.append("[)>\u001e06\u001d");
                                    sb2.insert(0, "\u001e\u0004");
                                    if (tVar.a() <= 0) {
                                    }
                                    break;
                                case 238:
                                    i83 = 5;
                                    break;
                                case 239:
                                    i83 = 4;
                                    break;
                                case 240:
                                    break;
                                default:
                                    if (b6 != 254 || tVar.a() != 0) {
                                    }
                                    break;
                            }
                        } else {
                            int i84 = b6 - 130;
                            if (i84 < 10) {
                                sb.append('0');
                            }
                            sb.append(i84);
                        }
                        if (tVar.a() <= 0) {
                        }
                    }
                }
                i82 = i83;
                i6 = 1;
            } else {
                int a3 = q.h.a(i82);
                if (a3 == 2) {
                    int i85 = 3;
                    int[] iArr2 = new int[3];
                    boolean z13 = false;
                    int i86 = 0;
                    while (tVar.a() != 8 && (b3 = tVar.b(8)) != 254) {
                        AbstractC0385a.a(b3, tVar.b(8), iArr2);
                        int i87 = i86;
                        boolean z14 = z13;
                        int i88 = 0;
                        while (i88 < i85) {
                            int i89 = iArr2[i88];
                            if (i87 != 0) {
                                if (i87 != 1) {
                                    if (i87 == 2) {
                                        if (i89 < 27) {
                                            char c = AbstractC0385a.f4901b[i89];
                                            if (z14) {
                                                sb.append((char) (c + 128));
                                                z14 = false;
                                            } else {
                                                sb.append(c);
                                            }
                                        } else if (i89 == 27) {
                                            sb.append((char) 29);
                                        } else {
                                            if (i89 != 30) {
                                                throw C0234d.a();
                                            }
                                            z14 = true;
                                        }
                                        i87 = 0;
                                    } else {
                                        if (i87 != i85) {
                                            throw C0234d.a();
                                        }
                                        if (z14) {
                                            sb.append((char) (i89 + 224));
                                            z14 = false;
                                            i87 = 0;
                                        } else {
                                            sb.append((char) (i89 + 96));
                                            i87 = 0;
                                        }
                                    }
                                } else if (z14) {
                                    sb.append((char) (i89 + 128));
                                    z14 = false;
                                    i87 = 0;
                                } else {
                                    sb.append((char) i89);
                                    i87 = 0;
                                }
                            } else if (i89 < i85) {
                                i87 = i89 + 1;
                            } else {
                                if (i89 >= 40) {
                                    throw C0234d.a();
                                }
                                char c3 = AbstractC0385a.f4900a[i89];
                                if (z14) {
                                    sb.append((char) (c3 + 128));
                                    z14 = false;
                                } else {
                                    sb.append(c3);
                                }
                            }
                            i88++;
                            i85 = 3;
                        }
                        i5 = 2;
                        if (tVar.a() <= 0) {
                            i82 = i5;
                            i6 = 1;
                        } else {
                            z13 = z14;
                            i86 = i87;
                            i85 = 3;
                        }
                    }
                } else if (a3 == 3) {
                    int i90 = 3;
                    int[] iArr3 = new int[3];
                    boolean z15 = false;
                    int i91 = 0;
                    for (int i92 = 254; tVar.a() != i70 && (b4 = tVar.b(i70)) != i92; i92 = 254) {
                        AbstractC0385a.a(b4, tVar.b(i70), iArr3);
                        int i93 = i91;
                        int i94 = 0;
                        while (i94 < i90) {
                            int i95 = iArr3[i94];
                            if (i93 != 0) {
                                if (i93 != 1) {
                                    if (i93 == 2) {
                                        if (i95 < 27) {
                                            char c4 = AbstractC0385a.f4902d[i95];
                                            if (z15) {
                                                sb.append((char) (c4 + 128));
                                                z15 = false;
                                            } else {
                                                sb.append(c4);
                                            }
                                        } else if (i95 == 27) {
                                            sb.append((char) 29);
                                        } else {
                                            if (i95 != 30) {
                                                throw C0234d.a();
                                            }
                                            z15 = true;
                                        }
                                        i93 = 0;
                                    } else {
                                        if (i93 != i90) {
                                            throw C0234d.a();
                                        }
                                        if (i95 >= 32) {
                                            throw C0234d.a();
                                        }
                                        char c5 = AbstractC0385a.f4903e[i95];
                                        if (z15) {
                                            sb.append((char) (c5 + 128));
                                            z15 = false;
                                            i93 = 0;
                                        } else {
                                            sb.append(c5);
                                            i93 = 0;
                                        }
                                    }
                                } else if (z15) {
                                    sb.append((char) (i95 + 128));
                                    z15 = false;
                                    i93 = 0;
                                } else {
                                    sb.append((char) i95);
                                    i93 = 0;
                                }
                            } else if (i95 < i90) {
                                i93 = i95 + 1;
                            } else {
                                if (i95 >= 40) {
                                    throw C0234d.a();
                                }
                                char c6 = AbstractC0385a.c[i95];
                                if (z15) {
                                    sb.append((char) (c6 + 128));
                                    z15 = false;
                                } else {
                                    sb.append(c6);
                                }
                            }
                            i94++;
                            i90 = 3;
                        }
                        if (tVar.a() > 0) {
                            i91 = i93;
                            i90 = 3;
                            i70 = 8;
                        }
                    }
                } else if (a3 != 4) {
                    if (a3 != 5) {
                        if (a3 != 6) {
                            throw C0234d.a();
                        }
                        int i96 = tVar.f377b;
                        int i97 = i96 + 2;
                        int b7 = AbstractC0385a.b(tVar.b(i70), i96 + 1);
                        if (b7 == 0) {
                            b7 = tVar.a() / 8;
                        } else if (b7 >= 250) {
                            b7 = ((b7 - 249) * 250) + AbstractC0385a.b(tVar.b(i70), i97);
                            i97 = i96 + 3;
                        }
                        if (b7 < 0) {
                            throw C0234d.a();
                        }
                        byte[] bArr4 = new byte[b7];
                        int i98 = 0;
                        while (i98 < b7) {
                            if (tVar.a() < i70) {
                                throw C0234d.a();
                            }
                            bArr4[i98] = (byte) AbstractC0385a.b(tVar.b(i70), i97);
                            i98++;
                            i97++;
                        }
                        arrayList.add(bArr4);
                        try {
                            sb.append(new String(bArr4, "ISO8859_1"));
                        } catch (UnsupportedEncodingException e3) {
                            throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e3)));
                        }
                    }
                    while (true) {
                        if (tVar.a() > 16) {
                            int i99 = 0;
                            while (true) {
                                if (i99 < 4) {
                                    int b8 = tVar.b(6);
                                    if (b8 == 31) {
                                        int i100 = 8 - tVar.c;
                                        if (i100 != i70) {
                                            tVar.b(i100);
                                        }
                                    } else {
                                        if ((b8 & 32) == 0) {
                                            b8 |= 64;
                                        }
                                        sb.append((char) b8);
                                        i99++;
                                    }
                                } else if (tVar.a() <= 0) {
                                }
                            }
                        }
                    }
                } else {
                    int i101 = 3;
                    int[] iArr4 = new int[3];
                    while (tVar.a() != i70 && (b5 = tVar.b(i70)) != 254) {
                        AbstractC0385a.a(b5, tVar.b(i70), iArr4);
                        int i102 = 0;
                        while (i102 < i101) {
                            int i103 = iArr4[i102];
                            if (i103 == 0) {
                                sb.append('\r');
                            } else if (i103 == 1) {
                                sb.append('*');
                            } else if (i103 == 2) {
                                sb.append('>');
                            } else if (i103 == i101) {
                                sb.append(' ');
                            } else if (i103 < 14) {
                                sb.append((char) (i103 + 44));
                            } else {
                                if (i103 >= 40) {
                                    throw C0234d.a();
                                }
                                sb.append((char) (i103 + 51));
                            }
                            i102++;
                            i101 = 3;
                        }
                        if (tVar.a() > 0) {
                            i101 = 3;
                        }
                    }
                }
                i5 = 2;
                i82 = i5;
                i6 = 1;
            }
            if (i82 != i6 && tVar.a() > 0) {
                i70 = 8;
                i4 = 7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: b | d -> 0x0052, TryCatch #0 {b | d -> 0x0052, blocks: (B:10:0x0011, B:11:0x0022, B:13:0x002a, B:14:0x002d, B:16:0x0031, B:18:0x003b, B:20:0x0041, B:25:0x0046), top: B:9:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1.d d(p1.b bVar, Map map) {
        C0232b c0232b;
        int i3;
        p1.b bVar2;
        a aVar = new a(bVar);
        try {
            return b(aVar, map);
        } catch (C0232b e3) {
            c0232b = e3;
            e = null;
            try {
                aVar.e();
                aVar.c = null;
                aVar.f234d = null;
                aVar.f232a = true;
                aVar.d();
                aVar.c();
                i3 = 0;
                while (true) {
                    bVar2 = (p1.b) aVar.f233b;
                    if (i3 < bVar2.f4328b) {
                        p1.d b3 = b(aVar, map);
                        b3.f4338e = new Object();
                        return b3;
                    }
                    int i4 = i3 + 1;
                    for (int i5 = i4; i5 < bVar2.c; i5++) {
                        if (bVar2.b(i3, i5) != bVar2.b(i5, i3)) {
                            bVar2.a(i5, i3);
                            bVar2.a(i3, i5);
                        }
                    }
                    i3 = i4;
                }
            } catch (C0232b | C0234d unused) {
                if (e != null) {
                    throw e;
                }
                throw c0232b;
            }
        } catch (C0234d e4) {
            e = e4;
            c0232b = null;
            aVar.e();
            aVar.c = null;
            aVar.f234d = null;
            aVar.f232a = true;
            aVar.d();
            aVar.c();
            i3 = 0;
            while (true) {
                bVar2 = (p1.b) aVar.f233b;
                if (i3 < bVar2.f4328b) {
                }
                i3 = i4;
            }
        }
    }
}
