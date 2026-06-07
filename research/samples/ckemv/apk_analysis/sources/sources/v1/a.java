package v1;

import G1.d;
import j1.C0234d;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0243m;
import j1.InterfaceC0240j;
import java.text.DecimalFormat;
import java.util.Map;
import p1.b;
import v0.e;
import w1.AbstractC0410a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0240j {

    /* renamed from: b, reason: collision with root package name */
    public static final C0244n[] f5125b = new C0244n[0];

    /* renamed from: a, reason: collision with root package name */
    public final d f5126a = new d(2);

    @Override // j1.InterfaceC0240j
    public final C0242l a(e eVar, Map map) {
        byte[] bArr;
        String valueOf;
        b e3 = eVar.e();
        int i3 = e3.f4328b;
        int i4 = e3.c;
        int i5 = -1;
        int i6 = -1;
        int i7 = i4;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            while (true) {
                int i10 = e3.f4329d;
                if (i9 < i10) {
                    int i11 = e3.f4330e[(i10 * i8) + i9];
                    if (i11 != 0) {
                        if (i8 < i7) {
                            i7 = i8;
                        }
                        if (i8 > i5) {
                            i5 = i8;
                        }
                        int i12 = i9 << 5;
                        if (i12 < i3) {
                            int i13 = 0;
                            while ((i11 << (31 - i13)) == 0) {
                                i13++;
                            }
                            int i14 = i12 + i13;
                            if (i14 < i3) {
                                i3 = i14;
                            }
                        }
                        if (i12 + 31 > i6) {
                            int i15 = 31;
                            while ((i11 >>> i15) == 0) {
                                i15--;
                            }
                            int i16 = i12 + i15;
                            if (i16 > i6) {
                                i6 = i16;
                            }
                        }
                    }
                    i9++;
                }
            }
        }
        int[] iArr = (i6 < i3 || i5 < i7) ? null : new int[]{i3, i7, (i6 - i3) + 1, (i5 - i7) + 1};
        if (iArr == null) {
            throw C0238h.f3489d;
        }
        int i17 = iArr[0];
        int i18 = iArr[1];
        int i19 = iArr[2];
        int i20 = iArr[3];
        int i21 = (30 + 31) / 32;
        int[] iArr2 = new int[i21 * 33];
        int i22 = 0;
        for (int i23 = 33; i22 < i23; i23 = 33) {
            int i24 = (((i20 / 2) + (i22 * i20)) / i23) + i18;
            for (int i25 = 0; i25 < 30; i25++) {
                if (e3.b((((((i22 & 1) * i19) / 2) + ((i19 / 2) + (i25 * i19))) / 30) + i17, i24)) {
                    int i26 = (i25 / 32) + (i22 * i21);
                    iArr2[i26] = iArr2[i26] | (1 << (i25 & 31));
                }
            }
            i22++;
        }
        d dVar = this.f5126a;
        dVar.getClass();
        byte[] bArr2 = new byte[144];
        for (int i27 = 0; i27 < 33; i27++) {
            int[] iArr3 = AbstractC0410a.f5179a[i27];
            for (int i28 = 0; i28 < 30; i28++) {
                int i29 = iArr3[i28];
                if (i29 >= 0) {
                    if (((iArr2[(i28 / 32) + (i27 * i21)] >>> (i28 & 31)) & 1) != 0) {
                        int i30 = i29 / 6;
                        bArr2[i30] = (byte) (bArr2[i30] | ((byte) (1 << (5 - (i29 % 6)))));
                    }
                }
            }
        }
        dVar.a(bArr2, 0, 10, 10, 0);
        int i31 = bArr2[0] & 15;
        if (i31 == 2 || i31 == 3 || i31 == 4) {
            dVar.a(bArr2, 20, 84, 40, 1);
            dVar.a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i31 != 5) {
                throw C0234d.a();
            }
            dVar.a(bArr2, 20, 68, 56, 1);
            dVar.a(bArr2, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArr2, 0, bArr, 0, 10);
        System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
        StringBuilder sb = new StringBuilder(144);
        if (i31 == 2 || i31 == 3) {
            if (i31 == 2) {
                valueOf = new DecimalFormat("0000000000".substring(0, AbstractC0410a.a(bArr, new byte[]{39, 40, 41, 42, 31, 32}))).format(AbstractC0410a.a(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
            } else {
                String[] strArr = AbstractC0410a.f5180b;
                valueOf = String.valueOf(new char[]{strArr[0].charAt(AbstractC0410a.a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(AbstractC0410a.a(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(AbstractC0410a.a(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(AbstractC0410a.a(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(AbstractC0410a.a(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(AbstractC0410a.a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(AbstractC0410a.a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
            String format2 = decimalFormat.format(AbstractC0410a.a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
            sb.append(AbstractC0410a.b(10, 84, bArr));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, valueOf + (char) 29 + format + (char) 29 + format2 + (char) 29);
            } else {
                sb.insert(0, valueOf + (char) 29 + format + (char) 29 + format2 + (char) 29);
            }
        } else if (i31 == 4) {
            sb.append(AbstractC0410a.b(1, 93, bArr));
        } else if (i31 == 5) {
            sb.append(AbstractC0410a.b(1, 77, bArr));
        }
        String sb2 = sb.toString();
        String valueOf2 = String.valueOf(i31);
        C0242l c0242l = new C0242l(sb2, bArr, f5125b, EnumC0231a.f3465k);
        if (valueOf2 != null) {
            c0242l.b(EnumC0243m.f3498d, valueOf2);
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
