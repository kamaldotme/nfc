package m2;

import f.C0150G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import m0.z;

/* loaded from: classes.dex */
public final class j implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4054b;

    public j(String[] strArr) {
        this.f4054b = strArr;
    }

    public final String a(String str) {
        X1.g.e(str, "name");
        String[] strArr = this.f4054b;
        int length = strArr.length - 2;
        int I2 = z.I(length, 0, -2);
        if (I2 <= length) {
            while (!d2.l.Q(str, strArr[length])) {
                if (length != I2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i3) {
        return this.f4054b[i3 * 2];
    }

    public final C0150G c() {
        C0150G c0150g = new C0150G(9);
        ArrayList arrayList = (ArrayList) c0150g.f2846b;
        X1.g.e(arrayList, "<this>");
        String[] strArr = this.f4054b;
        X1.g.e(strArr, "elements");
        arrayList.addAll(L1.j.Q(strArr));
        return c0150g;
    }

    public final String d(int i3) {
        return this.f4054b[(i3 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Arrays.equals(this.f4054b, ((j) obj).f4054b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4054b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        K1.c[] cVarArr = new K1.c[size];
        for (int i3 = 0; i3 < size; i3++) {
            cVarArr[i3] = new K1.c(b(i3), d(i3));
        }
        return new L1.b(cVarArr);
    }

    public final int size() {
        return this.f4054b.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            String b3 = b(i3);
            String d3 = d(i3);
            sb.append(b3);
            sb.append(": ");
            if (n2.b.p(b3)) {
                d3 = "██";
            }
            sb.append(d3);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        X1.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
