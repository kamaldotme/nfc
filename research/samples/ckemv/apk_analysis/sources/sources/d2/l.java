package d2;

import a2.C0062a;
import a2.C0063b;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static boolean P(String str, String str2) {
        X1.g.e(str, "<this>");
        X1.g.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean Q(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static boolean R(String str) {
        X1.g.e(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        Iterable c0062a = new C0062a(0, str.length() - 1, 1);
        if ((c0062a instanceof Collection) && ((Collection) c0062a).isEmpty()) {
            return true;
        }
        Iterator it = c0062a.iterator();
        while (((C0063b) it).c) {
            if (!v0.f.A(str.charAt(((C0063b) it).a()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean S(int i3, int i4, int i5, String str, String str2, boolean z3) {
        X1.g.e(str, "<this>");
        X1.g.e(str2, "other");
        return !z3 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z3, i3, str2, i4, i5);
    }

    public static String T(String str, String str2, String str3) {
        X1.g.e(str, "<this>");
        int Z2 = d.Z(str, str2, 0, false);
        if (Z2 < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, Z2);
            sb.append(str3);
            i4 = Z2 + length;
            if (Z2 >= str.length()) {
                break;
            }
            Z2 = d.Z(str, str2, Z2 + i3, false);
        } while (Z2 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        X1.g.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean U(String str, String str2, int i3, boolean z3) {
        X1.g.e(str, "<this>");
        return !z3 ? str.startsWith(str2, i3) : S(i3, 0, str2.length(), str, str2, z3);
    }

    public static boolean V(String str, String str2, boolean z3) {
        X1.g.e(str, "<this>");
        X1.g.e(str2, "prefix");
        return !z3 ? str.startsWith(str2) : S(0, 0, str2.length(), str, str2, z3);
    }
}
