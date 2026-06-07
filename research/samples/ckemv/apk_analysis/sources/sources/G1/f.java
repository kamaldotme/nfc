package G1;

/* loaded from: classes.dex */
public final class f {
    public static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a, reason: collision with root package name */
    public final int f240a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f241b;

    public f(int i3) {
        int i4 = (i3 >> 3) & 3;
        if (i4 < 0 || i4 >= 4) {
            throw new IllegalArgumentException();
        }
        this.f240a = e.f239a[i4];
        this.f241b = (byte) (i3 & 7);
    }

    public static f a(int i3, int i4) {
        int bitCount;
        int[][] iArr = c;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = 0; i7 < 32; i7++) {
            int[] iArr2 = iArr[i7];
            int i8 = iArr2[0];
            if (i8 == i3 || i8 == i4) {
                return new f(iArr2[1]);
            }
            int bitCount2 = Integer.bitCount(i3 ^ i8);
            if (bitCount2 < i5) {
                i6 = iArr2[1];
                i5 = bitCount2;
            }
            if (i3 != i4 && (bitCount = Integer.bitCount(i8 ^ i4)) < i5) {
                i6 = iArr2[1];
                i5 = bitCount;
            }
        }
        if (i5 <= 3) {
            return new f(i6);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f240a == fVar.f240a && this.f241b == fVar.f241b;
    }

    public final int hashCode() {
        return (q.h.a(this.f240a) << 3) | this.f241b;
    }
}
