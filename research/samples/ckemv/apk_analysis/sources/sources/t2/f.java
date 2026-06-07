package t2;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final z2.i f4934a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f4935b;
    public static final String[] c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f4936d;

    static {
        z2.i iVar = z2.i.f5338e;
        f4934a = d1.e.i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f4935b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i3 = 0; i3 < 256; i3++) {
            String binaryString = Integer.toBinaryString(i3);
            X1.g.d(binaryString, "toBinaryString(it)");
            String replace = n2.b.h("%8s", binaryString).replace(' ', '0');
            X1.g.d(replace, "replace(...)");
            strArr[i3] = replace;
        }
        f4936d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = X.d.j(new StringBuilder(), strArr2[i4], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            int i7 = iArr[0];
            String[] strArr3 = c;
            int i8 = i7 | i6;
            strArr3[i8] = strArr3[i7] + '|' + strArr3[i6];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i7]);
            sb.append('|');
            strArr3[i8 | 8] = X.d.j(sb, strArr3[i6], "|PADDED");
        }
        int length = c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr4 = c;
            if (strArr4[i9] == null) {
                strArr4[i9] = f4936d[i9];
            }
        }
    }

    public static String a(int i3, int i4, int i5, int i6, boolean z3) {
        String str;
        String str2;
        String[] strArr = f4935b;
        String h = i5 < strArr.length ? strArr[i5] : n2.b.h("0x%02x", Integer.valueOf(i5));
        if (i6 == 0) {
            str = "";
        } else {
            String[] strArr2 = f4936d;
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4 || i5 == 6) {
                    str = i6 == 1 ? "ACK" : strArr2[i6];
                } else if (i5 != 7 && i5 != 8) {
                    String[] strArr3 = c;
                    if (i6 < strArr3.length) {
                        str2 = strArr3[i6];
                        X1.g.b(str2);
                    } else {
                        str2 = strArr2[i6];
                    }
                    str = (i5 != 5 || (i6 & 4) == 0) ? (i5 != 0 || (i6 & 32) == 0) ? str2 : d2.l.T(str2, "PRIORITY", "COMPRESSED") : d2.l.T(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i6];
        }
        return n2.b.h("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i3), Integer.valueOf(i4), h, str);
    }
}
