package p1;

import java.util.Arrays;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356a implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public int[] f4327b;
    public int c;

    public C0356a(int i3) {
        this.c = i3;
        this.f4327b = new int[(i3 + 31) / 32];
    }

    public final boolean a(int i3) {
        return ((1 << (i3 & 31)) & this.f4327b[i3 / 32]) != 0;
    }

    public final int b(int i3) {
        int i4 = this.c;
        if (i3 >= i4) {
            return i4;
        }
        int i5 = i3 / 32;
        int i6 = (-(1 << (i3 & 31))) & this.f4327b[i5];
        while (i6 == 0) {
            i5++;
            int[] iArr = this.f4327b;
            if (i5 == iArr.length) {
                return i4;
            }
            i6 = iArr[i5];
        }
        return Math.min(Integer.numberOfTrailingZeros(i6) + (i5 << 5), i4);
    }

    public final int c(int i3) {
        int i4 = this.c;
        if (i3 >= i4) {
            return i4;
        }
        int i5 = i3 / 32;
        int i6 = (-(1 << (i3 & 31))) & (~this.f4327b[i5]);
        while (i6 == 0) {
            i5++;
            int[] iArr = this.f4327b;
            if (i5 == iArr.length) {
                return i4;
            }
            i6 = ~iArr[i5];
        }
        return Math.min(Integer.numberOfTrailingZeros(i6) + (i5 << 5), i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p1.a, java.lang.Object] */
    public final Object clone() {
        int[] iArr = (int[]) this.f4327b.clone();
        ?? obj = new Object();
        obj.f4327b = iArr;
        obj.c = this.c;
        return obj;
    }

    public final boolean d(int i3, int i4) {
        if (i4 < i3 || i3 < 0 || i4 > this.c) {
            throw new IllegalArgumentException();
        }
        if (i4 == i3) {
            return true;
        }
        int i5 = i4 - 1;
        int i6 = i3 / 32;
        int i7 = i5 / 32;
        int i8 = i6;
        while (i8 <= i7) {
            if ((((2 << (i8 >= i7 ? 31 & i5 : 31)) - (1 << (i8 > i6 ? 0 : i3 & 31))) & this.f4327b[i8]) != 0) {
                return false;
            }
            i8++;
        }
        return true;
    }

    public final void e() {
        int i3;
        int[] iArr = new int[this.f4327b.length];
        int i4 = this.c;
        int i5 = (i4 - 1) / 32;
        int i6 = i5 + 1;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            long j3 = this.f4327b[i7];
            long j4 = ((j3 & 1431655765) << 1) | ((j3 >> 1) & 1431655765);
            long j5 = ((j4 & 858993459) << 2) | ((j4 >> 2) & 858993459);
            long j6 = ((j5 & 252645135) << 4) | ((j5 >> 4) & 252645135);
            long j7 = ((j6 & 16711935) << 8) | ((j6 >> 8) & 16711935);
            iArr[i5 - i7] = (int) (((j7 & 65535) << 16) | ((j7 >> 16) & 65535));
            i7++;
        }
        int i8 = i6 << 5;
        if (i4 != i8) {
            int i9 = i8 - i4;
            int i10 = iArr[0] >>> i9;
            for (i3 = 1; i3 < i6; i3++) {
                int i11 = iArr[i3];
                iArr[i3 - 1] = i10 | (i11 << (32 - i9));
                i10 = i11 >>> i9;
            }
            iArr[i5] = i10;
        }
        this.f4327b = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0356a)) {
            return false;
        }
        C0356a c0356a = (C0356a) obj;
        return this.c == c0356a.c && Arrays.equals(this.f4327b, c0356a.f4327b);
    }

    public final void f(int i3) {
        int[] iArr = this.f4327b;
        int i4 = i3 / 32;
        iArr[i4] = (1 << (i3 & 31)) | iArr[i4];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4327b) + (this.c * 31);
    }

    public final String toString() {
        int i3 = this.c;
        StringBuilder sb = new StringBuilder((i3 / 8) + i3 + 1);
        for (int i4 = 0; i4 < i3; i4++) {
            if ((i4 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(a(i4) ? 'X' : '.');
        }
        return sb.toString();
    }
}
