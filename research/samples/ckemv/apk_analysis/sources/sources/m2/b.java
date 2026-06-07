package m2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4003a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final b f4004b = new Object();
    public static final b c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final b f4005d = new Object();

    public static final f a(b bVar, String str) {
        f fVar = new f(str);
        f.f4020d.put(str, fVar);
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [z2.f] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r9v1, types: [z2.f, java.lang.Object] */
    public static String b(String str, int i3, int i4, String str2, boolean z3, boolean z4, boolean z5, boolean z6, int i5) {
        int i6 = (i5 & 1) != 0 ? 0 : i3;
        int length = (i5 & 2) != 0 ? str.length() : i4;
        boolean z7 = (i5 & 8) != 0 ? false : z3;
        boolean z8 = (i5 & 16) != 0 ? false : z4;
        boolean z9 = (i5 & 32) != 0 ? false : z5;
        boolean z10 = (i5 & 64) == 0 ? z6 : false;
        X1.g.e(str, "<this>");
        int i7 = i6;
        while (i7 < length) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 32;
            int i9 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z10) || d2.d.W(str2, (char) codePointAt) || ((codePointAt == 37 && (!z7 || (z8 && !d(i7, length, str)))) || (codePointAt == 43 && z9)))) {
                ?? obj = new Object();
                obj.P(i6, i7, str);
                ?? r22 = 0;
                while (i7 < length) {
                    int codePointAt2 = str.codePointAt(i7);
                    if (!z7 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z9) {
                            obj.Q(z7 ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i9 && !z10) || d2.d.W(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z7 || (z8 && !d(i7, length, str)))))) {
                            if (r22 == 0) {
                                r22 = new Object();
                            }
                            r22.R(codePointAt2);
                            while (!r22.v()) {
                                byte E2 = r22.E();
                                obj.L(37);
                                char[] cArr = l.f4061j;
                                obj.L(cArr[((E2 & 255) >> 4) & 15]);
                                obj.L(cArr[E2 & 15]);
                            }
                        } else {
                            obj.R(codePointAt2);
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    i8 = 32;
                    i9 = 128;
                    r22 = r22;
                }
                return obj.A(obj.c, d2.a.f2653a);
            }
            i7 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i6, length);
        X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(int i3, int i4, String str) {
        int i5 = i3 + 2;
        return i5 < i4 && str.charAt(i3) == '%' && n2.b.q(str.charAt(i3 + 1)) != -1 && n2.b.q(str.charAt(i5)) != -1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [z2.f, java.lang.Object] */
    public static String f(String str, int i3, int i4, boolean z3, int i5) {
        int i6;
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        X1.g.e(str, "<this>");
        int i7 = i3;
        while (i7 < i4) {
            char charAt = str.charAt(i7);
            if (charAt == '%' || (charAt == '+' && z3)) {
                ?? obj = new Object();
                obj.P(i3, i7, str);
                while (i7 < i4) {
                    int codePointAt = str.codePointAt(i7);
                    if (codePointAt != 37 || (i6 = i7 + 2) >= i4) {
                        if (codePointAt == 43 && z3) {
                            obj.L(32);
                            i7++;
                        }
                        obj.R(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    } else {
                        int q3 = n2.b.q(str.charAt(i7 + 1));
                        int q4 = n2.b.q(str.charAt(i6));
                        if (q3 != -1 && q4 != -1) {
                            obj.L((q3 << 4) + q4);
                            i7 = Character.charCount(codePointAt) + i6;
                        }
                        obj.R(codePointAt);
                        i7 += Character.charCount(codePointAt);
                    }
                }
                return obj.A(obj.c, d2.a.f2653a);
            }
            i7++;
        }
        String substring = str.substring(i3, i4);
        X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 <= str.length()) {
            int b02 = d2.d.b0(str, '&', i3, false, 4);
            if (b02 == -1) {
                b02 = str.length();
            }
            int b03 = d2.d.b0(str, '=', i3, false, 4);
            if (b03 == -1 || b03 > b02) {
                String substring = str.substring(i3, b02);
                X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i3, b03);
                X1.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(b03 + 1, b02);
                X1.g.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i3 = b02 + 1;
        }
        return arrayList;
    }

    public synchronized f c(String str) {
        f fVar;
        String str2;
        try {
            X1.g.e(str, "javaName");
            LinkedHashMap linkedHashMap = f.f4020d;
            fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                if (d2.l.V(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    X1.g.d(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (d2.l.V(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    X1.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                fVar = (f) linkedHashMap.get(str2);
                if (fVar == null) {
                    fVar = new f(str);
                }
                linkedHashMap.put(str, fVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fVar;
    }

    public List e(String str) {
        X1.g.e(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            X1.g.d(allByName, "getAllByName(hostname)");
            int length = allByName.length;
            return length != 0 ? length != 1 ? new ArrayList(new L1.h(allByName, false)) : v0.f.B(allByName[0]) : L1.t.f622b;
        } catch (NullPointerException e3) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e3);
            throw unknownHostException;
        }
    }
}
