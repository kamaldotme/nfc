package y1;

import x1.AbstractC0440h;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0446a extends AbstractC0440h {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5259b;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f5261e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5262f;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5258a = new int[4];
    public final float[] c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f5260d = new float[4];

    public AbstractC0446a() {
        int[] iArr = new int[8];
        this.f5259b = iArr;
        this.f5261e = new int[iArr.length / 2];
        this.f5262f = new int[iArr.length / 2];
    }

    public static void i(int[] iArr, float[] fArr) {
        int i3 = 0;
        float f3 = fArr[0];
        for (int i4 = 1; i4 < iArr.length; i4++) {
            float f4 = fArr[i4];
            if (f4 < f3) {
                i3 = i4;
                f3 = f4;
            }
        }
        iArr[i3] = iArr[i3] - 1;
    }

    public static void j(int[] iArr, float[] fArr) {
        int i3 = 0;
        float f3 = fArr[0];
        for (int i4 = 1; i4 < iArr.length; i4++) {
            float f4 = fArr[i4];
            if (f4 > f3) {
                i3 = i4;
                f3 = f4;
            }
        }
        iArr[i3] = iArr[i3] + 1;
    }

    public static boolean k(int[] iArr) {
        float f3 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f3 >= 0.7916667f && f3 <= 0.89285713f) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 : iArr) {
                if (i5 > i4) {
                    i4 = i5;
                }
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i4 < i3 * 10) {
                return true;
            }
        }
        return false;
    }
}
