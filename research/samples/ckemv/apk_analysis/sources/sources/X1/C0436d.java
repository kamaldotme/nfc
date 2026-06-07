package x1;

import j1.C0232b;
import j1.C0238h;
import j1.C0242l;
import java.util.Arrays;
import java.util.Map;
import p1.C0356a;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436d extends AbstractC0440h {
    public static final char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5222d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5223e;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f5224a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5225b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f5222d = iArr;
        f5223e = iArr[47];
    }

    public static void i(StringBuilder sb, int i3, int i4) {
        int i5 = 0;
        int i6 = 1;
        for (int i7 = i3 - 1; i7 >= 0; i7--) {
            i5 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(sb.charAt(i7)) * i6;
            i6++;
            if (i6 > i4) {
                i6 = 1;
            }
        }
        if (sb.charAt(i3) != c[i5 % 47]) {
            throw C0232b.a();
        }
    }

    public static int j(int[] iArr) {
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int length = iArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int round = Math.round((iArr[i6] * 9.0f) / i3);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i6 & 1) == 0) {
                for (int i7 = 0; i7 < round; i7++) {
                    i5 = (i5 << 1) | 1;
                }
            } else {
                i5 <<= round;
            }
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x012d, code lost:
    
        r5 = '`';
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0132, code lost:
    
        if (r6 < 'X') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0134, code lost:
    
        if (r6 > 'Z') goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0136, code lost:
    
        r5 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013d, code lost:
    
        throw j1.C0234d.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x013e, code lost:
    
        if (r6 < 'A') goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0140, code lost:
    
        if (r6 > 'Z') goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0142, code lost:
    
        r6 = r6 - '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x014d, code lost:
    
        throw j1.C0234d.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0152, code lost:
    
        throw j1.C0234d.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0153, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0159, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0181, code lost:
    
        return new j1.C0242l(r2.toString(), null, new j1.C0244n[]{new j1.C0244n((r15[1] + r15[0]) / 2.0f, r13), new j1.C0244n((r7 / 2.0f) + r1, r13)}, j1.EnumC0231a.f3461e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0184, code lost:
    
        throw j1.C0238h.f3489d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0187, code lost:
    
        throw j1.C0238h.f3489d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r4 = x1.C0436d.c[r5];
        r3.append(r4);
        r5 = r2.length;
        r6 = 0;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r6 >= r5) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r7 = r7 + r2[r6];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r5 = r14.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r4 != '*') goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r3.deleteCharAt(r3.length() - 1);
        r4 = r2.length;
        r6 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r6 >= r4) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        r7 = r7 + r2[r6];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        if (r5 == r14.c) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        if (r14.a(r5) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r3.length() < 2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        r14 = r3.length();
        i(r3, r14 - 2, 20);
        i(r3, r14 - 1, 15);
        r3.setLength(r3.length() - 2);
        r14 = r3.length();
        r2 = new java.lang.StringBuilder(r14);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        if (r4 >= r14) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        r5 = r3.charAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r5 < 'a') goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r5 > 'd') goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
    
        if (r4 >= (r14 - 1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        r4 = r4 + 1;
        r6 = r3.charAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
    
        switch(r5) {
            case 97: goto L90;
            case 98: goto L57;
            case 99: goto L50;
            case 100: goto L44;
            default: goto L43;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d3, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0145, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        if (r6 < 'A') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:
    
        if (r6 > 'Z') goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        r6 = r6 + ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        r5 = (char) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e3, code lost:
    
        throw j1.C0234d.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e4, code lost:
    
        if (r6 < 'A') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e6, code lost:
    
        if (r6 > 'O') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e8, code lost:
    
        r6 = r6 - ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00eb, code lost:
    
        if (r6 != 'Z') goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ed, code lost:
    
        r5 = ':';
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f4, code lost:
    
        throw j1.C0234d.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f5, code lost:
    
        if (r6 < 'A') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f9, code lost:
    
        if (r6 > 'E') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fb, code lost:
    
        r6 = r6 - '&';
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0100, code lost:
    
        if (r6 < 'F') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0104, code lost:
    
        if (r6 > 'J') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0106, code lost:
    
        r6 = r6 - 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        if (r6 < 'K') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010d, code lost:
    
        if (r6 > 'O') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010f, code lost:
    
        r6 = r6 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0114, code lost:
    
        if (r6 < 'P') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0118, code lost:
    
        if (r6 > 'T') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011a, code lost:
    
        r6 = r6 + '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x011f, code lost:
    
        if (r6 != 'U') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0124, code lost:
    
        if (r6 != 'V') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0126, code lost:
    
        r5 = '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012b, code lost:
    
        if (r6 != 'W') goto L84;
     */
    @Override // x1.AbstractC0440h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0242l d(int i3, C0356a c0356a, Map map) {
        int b3;
        int i4 = c0356a.c;
        int b4 = c0356a.b(0);
        int[] iArr = this.f5225b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        boolean z3 = false;
        int i5 = 0;
        int i6 = b4;
        while (b4 < i4) {
            if (c0356a.a(b4) != z3) {
                iArr[i5] = iArr[i5] + 1;
            } else {
                if (i5 != length - 1) {
                    i5++;
                } else if (j(iArr) == f5223e) {
                    int b5 = c0356a.b(new int[]{i6, b4}[1]);
                    Arrays.fill(iArr, 0);
                    StringBuilder sb = this.f5224a;
                    sb.setLength(0);
                    while (true) {
                        AbstractC0440h.g(b5, c0356a, iArr);
                        int j3 = j(iArr);
                        if (j3 < 0) {
                            throw C0238h.f3489d;
                        }
                        int i7 = 0;
                        while (true) {
                            int[] iArr2 = f5222d;
                            if (i7 >= iArr2.length) {
                                throw C0238h.f3489d;
                            }
                            if (iArr2[i7] == j3) {
                                break;
                            }
                            i7++;
                        }
                        b5 = b3;
                    }
                } else {
                    i6 += iArr[0] + iArr[1];
                    int i8 = i5 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i8);
                    iArr[i8] = 0;
                    iArr[i5] = 0;
                    i5--;
                }
                iArr[i5] = 1;
                z3 = !z3;
            }
            b4++;
        }
        throw C0238h.f3489d;
    }
}
