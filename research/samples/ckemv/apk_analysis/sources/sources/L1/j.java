package L1;

import a.AbstractC0059a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class j extends u2.l {
    public static List Q(Object[] objArr) {
        X1.g.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        X1.g.d(asList, "asList(...)");
        return asList;
    }

    public static void R(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        X1.g.e(bArr, "<this>");
        X1.g.e(bArr2, "destination");
        System.arraycopy(bArr, i4, bArr2, i3, i5 - i4);
    }

    public static void S(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        X1.g.e(objArr, "<this>");
        X1.g.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static void T(Object[] objArr, d1.f fVar, int i3, int i4) {
        X1.g.e(objArr, "<this>");
        Arrays.fill(objArr, i3, i4, fVar);
    }

    public static ArrayList V(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String W(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) ", ");
            }
            AbstractC0059a.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        X1.g.d(sb2, "toString(...)");
        return sb2;
    }

    public static char X(char[] cArr) {
        X1.g.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
