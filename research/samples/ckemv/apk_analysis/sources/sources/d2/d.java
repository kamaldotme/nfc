package d2;

import a2.C0062a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean W(CharSequence charSequence, char c) {
        return b0(charSequence, c, 0, false, 2) >= 0;
    }

    public static boolean X(CharSequence charSequence, String str) {
        X1.g.e(charSequence, "<this>");
        return c0(charSequence, str, 0, false, 2) >= 0;
    }

    public static final int Y(CharSequence charSequence) {
        X1.g.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Z(CharSequence charSequence, String str, int i3, boolean z3) {
        X1.g.e(charSequence, "<this>");
        X1.g.e(str, "string");
        return (z3 || !(charSequence instanceof String)) ? a0(charSequence, str, i3, charSequence.length(), z3, false) : ((String) charSequence).indexOf(str, i3);
    }

    public static final int a0(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z3, boolean z4) {
        C0062a c0062a;
        if (z4) {
            int Y2 = Y(charSequence);
            if (i3 > Y2) {
                i3 = Y2;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c0062a = new C0062a(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c0062a = new C0062a(i3, i4, 1);
        }
        boolean z5 = charSequence instanceof String;
        int i5 = c0062a.f1425d;
        int i6 = c0062a.c;
        int i7 = c0062a.f1424b;
        if (z5 && (charSequence2 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                while (!l.S(0, i7, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z3)) {
                    if (i7 != i6) {
                        i7 += i5;
                    }
                }
                return i7;
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            while (!g0(charSequence2, 0, charSequence, i7, charSequence2.length(), z3)) {
                if (i7 != i6) {
                    i7 += i5;
                }
            }
            return i7;
        }
        return -1;
    }

    public static int b0(CharSequence charSequence, char c, int i3, boolean z3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        X1.g.e(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? d0(charSequence, new char[]{c}, i3, z3) : ((String) charSequence).indexOf(c, i3);
    }

    public static /* synthetic */ int c0(CharSequence charSequence, String str, int i3, boolean z3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return Z(charSequence, str, i3, z3);
    }

    public static final int d0(CharSequence charSequence, char[] cArr, int i3, boolean z3) {
        int i4;
        X1.g.e(charSequence, "<this>");
        X1.g.e(cArr, "chars");
        boolean z4 = true;
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(L1.j.X(cArr), i3);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        C0062a c0062a = new C0062a(i3, Y(charSequence), 1);
        int i5 = c0062a.c;
        int i6 = c0062a.f1425d;
        if (i6 <= 0 ? i3 < i5 : i3 > i5) {
            z4 = false;
        }
        if (!z4) {
            i3 = i5;
        }
        while (z4) {
            if (i3 != i5) {
                i4 = i3 + i6;
            } else {
                if (!z4) {
                    throw new NoSuchElementException();
                }
                i4 = i3;
                z4 = false;
            }
            char charAt = charSequence.charAt(i3);
            for (char c : cArr) {
                if (v0.f.u(c, charAt, z3)) {
                    return i3;
                }
            }
            i3 = i4;
        }
        return -1;
    }

    public static int e0(CharSequence charSequence, char c, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = Y(charSequence);
        }
        X1.g.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i3);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(L1.j.X(cArr), i3);
        }
        int Y2 = Y(charSequence);
        if (i3 > Y2) {
            i3 = Y2;
        }
        while (-1 < i3) {
            if (v0.f.u(cArr[0], charSequence.charAt(i3), false)) {
                return i3;
            }
            i3--;
        }
        return -1;
    }

    public static final List f0(CharSequence charSequence) {
        X1.g.e(charSequence, "<this>");
        i0(0);
        return c2.d.Q(new c2.h(new c(charSequence, 0, 0, new m(L1.j.Q(new String[]{"\r\n", "\n", "\r"}), false, 1)), new L1.a(1, charSequence)));
    }

    public static final boolean g0(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5, boolean z3) {
        X1.g.e(charSequence, "<this>");
        X1.g.e(charSequence2, "other");
        if (i4 < 0 || i3 < 0 || i3 > charSequence.length() - i5 || i4 > charSequence2.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!v0.f.u(charSequence.charAt(i3 + i6), charSequence2.charAt(i4 + i6), z3)) {
                return false;
            }
        }
        return true;
    }

    public static String h0(String str, String str2) {
        if (!l.V(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        X1.g.d(substring, "substring(...)");
        return substring;
    }

    public static final void i0(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(X.d.f("Limit must be non-negative, but was ", i3).toString());
        }
    }

    public static List j0(CharSequence charSequence, char[] cArr) {
        X1.g.e(charSequence, "<this>");
        if (cArr.length != 1) {
            i0(0);
            c<a2.c> cVar = new c(charSequence, 0, 0, new m(cArr, false, 0));
            ArrayList arrayList = new ArrayList(L1.m.S(new c2.f(cVar)));
            for (a2.c cVar2 : cVar) {
                X1.g.e(cVar2, "range");
                arrayList.add(charSequence.subSequence(cVar2.f1424b, cVar2.c + 1).toString());
            }
            return arrayList;
        }
        String valueOf = String.valueOf(cArr[0]);
        i0(0);
        int Z2 = Z(charSequence, valueOf, 0, false);
        if (Z2 == -1) {
            return v0.f.B(charSequence.toString());
        }
        ArrayList arrayList2 = new ArrayList(10);
        int i3 = 0;
        do {
            arrayList2.add(charSequence.subSequence(i3, Z2).toString());
            i3 = valueOf.length() + Z2;
            Z2 = Z(charSequence, valueOf, i3, false);
        } while (Z2 != -1);
        arrayList2.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList2;
    }

    public static String k0(String str, String str2) {
        X1.g.e(str2, "delimiter");
        int c02 = c0(str, str2, 0, false, 6);
        if (c02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + c02, str.length());
        X1.g.d(substring, "substring(...)");
        return substring;
    }

    public static String l0(String str) {
        X1.g.e(str, "<this>");
        X1.g.e(str, "missingDelimiterValue");
        int e02 = e0(str, '.', 0, 6);
        if (e02 == -1) {
            return str;
        }
        String substring = str.substring(e02 + 1, str.length());
        X1.g.d(substring, "substring(...)");
        return substring;
    }

    public static String m0(String str, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(X.d.g("Requested character count ", i3, " is less than zero.").toString());
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        String substring = str.substring(0, i3);
        X1.g.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence n0(CharSequence charSequence) {
        X1.g.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            boolean A3 = v0.f.A(charSequence.charAt(!z3 ? i3 : length));
            if (z3) {
                if (!A3) {
                    break;
                }
                length--;
            } else if (A3) {
                i3++;
            } else {
                z3 = true;
            }
        }
        return charSequence.subSequence(i3, length + 1);
    }
}
