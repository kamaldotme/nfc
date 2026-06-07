package C1;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f133a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i3;
        for (int i4 = 0; i4 < 2787; i4++) {
            int i5 = B1.a.f73b[i4];
            int i6 = i5 & 1;
            int i7 = 0;
            while (i7 < 8) {
                float f3 = 0.0f;
                while (true) {
                    i3 = i5 & 1;
                    if (i3 == i6) {
                        f3 += 1.0f;
                        i5 >>= 1;
                    }
                }
                f133a[i4][7 - i7] = f3 / 17.0f;
                i7++;
                i6 = i3;
            }
        }
    }
}
