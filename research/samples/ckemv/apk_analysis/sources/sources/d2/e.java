package d2;

import a.AbstractC0059a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends AbstractC0059a {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r9 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String O(String str) {
        X1.g.e(str, "<this>");
        if (!(!l.R("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List f02 = d.f0(str);
        int length = str.length();
        f02.size();
        int Q2 = L1.l.Q(f02);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : f02) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            String str3 = null;
            if ((i3 != 0 && i3 != Q2) || !l.R(str2)) {
                int length2 = str2.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i5 = -1;
                        break;
                    }
                    if (!v0.f.A(str2.charAt(i5))) {
                        break;
                    }
                    i5++;
                }
                if (i5 != -1 && l.U(str2, "|", i5, false)) {
                    str3 = str2.substring(i5 + 1);
                    X1.g.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList.add(str2);
            }
            i3 = i4;
        }
        StringBuilder sb = new StringBuilder(length);
        L1.k.V(arrayList, sb);
        String sb2 = sb.toString();
        X1.g.d(sb2, "toString(...)");
        return sb2;
    }
}
