package x1;

import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0243m;
import java.util.EnumMap;
import p1.C0356a;

/* renamed from: x1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441i {
    public static final int[] c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5237a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f5238b;

    public C0441i(int i3) {
        switch (i3) {
            case 1:
                this.f5237a = new int[4];
                this.f5238b = new StringBuilder();
                return;
            default:
                this.f5237a = new int[4];
                this.f5238b = new StringBuilder();
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        if (r1.equals("99991") == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0242l a(int i3, C0356a c0356a, int[] iArr) {
        String str;
        String str2;
        EnumMap enumMap;
        StringBuilder sb = this.f5238b;
        sb.setLength(0);
        int[] iArr2 = this.f5237a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        char c3 = 2;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i4 = c0356a.c;
        int i5 = iArr[1];
        int i6 = 0;
        for (int i7 = 0; i7 < 5 && i5 < i4; i7++) {
            int j3 = AbstractC0443k.j(c0356a, iArr2, i5, AbstractC0443k.g);
            sb.append((char) ((j3 % 10) + 48));
            for (int i8 : iArr2) {
                i5 += i8;
            }
            if (j3 >= 10) {
                i6 |= 1 << (4 - i7);
            }
            if (i7 != 4) {
                i5 = c0356a.c(c0356a.b(i5));
            }
        }
        if (sb.length() != 5) {
            throw C0238h.f3489d;
        }
        for (int i9 = 0; i9 < 10; i9++) {
            if (i6 == c[i9]) {
                String sb2 = sb.toString();
                int length = sb2.length();
                int i10 = 0;
                for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
                    i10 += sb2.charAt(i11) - '0';
                }
                int i12 = i10 * 3;
                for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
                    i12 += sb2.charAt(i13) - '0';
                }
                if ((i12 * 3) % 10 != i9) {
                    throw C0238h.f3489d;
                }
                String sb3 = sb.toString();
                if (sb3.length() == 5) {
                    char charAt = sb3.charAt(0);
                    if (charAt == '0') {
                        str = "£";
                    } else if (charAt != '5') {
                        str = "";
                        if (charAt == '9') {
                            switch (sb3.hashCode()) {
                                case 54118329:
                                    if (sb3.equals("90000")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 54395376:
                                    if (sb3.equals("99990")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 54395377:
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    str2 = null;
                                    break;
                                case 1:
                                    str2 = "Used";
                                    break;
                                case 2:
                                    str2 = "0.00";
                                    break;
                            }
                            if (str2 != null) {
                                enumMap = new EnumMap(EnumC0243m.class);
                                enumMap.put((EnumMap) EnumC0243m.f3500f, (EnumC0243m) str2);
                                float f3 = i3;
                                C0242l c0242l = new C0242l(sb3, null, new C0244n[]{new C0244n((iArr[0] + iArr[1]) / 2.0f, f3), new C0244n(i5, f3)}, EnumC0231a.f3472r);
                                if (enumMap != null) {
                                    c0242l.a(enumMap);
                                }
                                return c0242l;
                            }
                        }
                    } else {
                        str = "$";
                    }
                    int parseInt = Integer.parseInt(sb3.substring(1));
                    String valueOf = String.valueOf(parseInt / 100);
                    int i14 = parseInt % 100;
                    str2 = str + valueOf + '.' + (i14 < 10 ? "0".concat(String.valueOf(i14)) : String.valueOf(i14));
                    if (str2 != null) {
                    }
                }
                enumMap = null;
                float f32 = i3;
                C0242l c0242l2 = new C0242l(sb3, null, new C0244n[]{new C0244n((iArr[0] + iArr[1]) / 2.0f, f32), new C0244n(i5, f32)}, EnumC0231a.f3472r);
                if (enumMap != null) {
                }
                return c0242l2;
            }
        }
        throw C0238h.f3489d;
    }
}
