package A2;

import X1.g;
import z2.s;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f62a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final int b(s sVar, int i3) {
        int i4;
        g.e(sVar, "<this>");
        int i5 = i3 + 1;
        int length = sVar.f5362f.length;
        int[] iArr = sVar.g;
        g.e(iArr, "<this>");
        int i6 = length - 1;
        int i7 = 0;
        while (true) {
            if (i7 <= i6) {
                i4 = (i7 + i6) >>> 1;
                int i8 = iArr[i4];
                if (i8 >= i5) {
                    if (i8 <= i5) {
                        break;
                    }
                    i6 = i4 - 1;
                } else {
                    i7 = i4 + 1;
                }
            } else {
                i4 = (-i7) - 1;
                break;
            }
        }
        return i4 >= 0 ? i4 : ~i4;
    }
}
