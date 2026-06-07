package p1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public final int f4328b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4329d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f4330e;

    public b(int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            this.f4328b = i3;
            this.c = i4;
            int i5 = (i3 + 31) / 32;
            this.f4329d = i5;
            this.f4330e = new int[i5 * i4];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final void a(int i3, int i4) {
        int i5 = (i3 / 32) + (i4 * this.f4329d);
        int[] iArr = this.f4330e;
        iArr[i5] = (1 << (i3 & 31)) ^ iArr[i5];
    }

    public final boolean b(int i3, int i4) {
        return ((this.f4330e[(i3 / 32) + (i4 * this.f4329d)] >>> (i3 & 31)) & 1) != 0;
    }

    public final int[] c() {
        int[] iArr = this.f4330e;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i3 = this.f4329d;
        int i4 = length / i3;
        int i5 = (length % i3) << 5;
        int i6 = iArr[length];
        int i7 = 31;
        while ((i6 >>> i7) == 0) {
            i7--;
        }
        return new int[]{i5 + i7, i4};
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f4330e.clone();
        return new b(this.f4328b, this.c, this.f4329d, iArr);
    }

    public final C0356a d(C0356a c0356a, int i3) {
        int i4 = c0356a.c;
        int i5 = this.f4328b;
        if (i4 < i5) {
            c0356a = new C0356a(i5);
        } else {
            int length = c0356a.f4327b.length;
            for (int i6 = 0; i6 < length; i6++) {
                c0356a.f4327b[i6] = 0;
            }
        }
        int i7 = this.f4329d;
        int i8 = i3 * i7;
        for (int i9 = 0; i9 < i7; i9++) {
            c0356a.f4327b[(i9 << 5) / 32] = this.f4330e[i8 + i9];
        }
        return c0356a;
    }

    public final int[] e() {
        int[] iArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            iArr = this.f4330e;
            if (i4 >= iArr.length || iArr[i4] != 0) {
                break;
            }
            i4++;
        }
        if (i4 == iArr.length) {
            return null;
        }
        int i5 = this.f4329d;
        int i6 = i4 / i5;
        int i7 = (i4 % i5) << 5;
        while ((iArr[i4] << (31 - i3)) == 0) {
            i3++;
        }
        return new int[]{i7 + i3, i6};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4328b == bVar.f4328b && this.c == bVar.c && this.f4329d == bVar.f4329d && Arrays.equals(this.f4330e, bVar.f4330e);
    }

    public final void f(int i3, int i4) {
        int i5 = (i3 / 32) + (i4 * this.f4329d);
        int[] iArr = this.f4330e;
        iArr[i5] = (1 << (i3 & 31)) | iArr[i5];
    }

    public final void g(int i3, int i4, int i5, int i6) {
        if (i4 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i6 <= 0 || i5 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i7 = i5 + i3;
        int i8 = i6 + i4;
        if (i8 > this.c || i7 > this.f4328b) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i4 < i8) {
            int i9 = this.f4329d * i4;
            for (int i10 = i3; i10 < i7; i10++) {
                int i11 = (i10 / 32) + i9;
                int[] iArr = this.f4330e;
                iArr[i11] = iArr[i11] | (1 << (i10 & 31));
            }
            i4++;
        }
    }

    public final int hashCode() {
        int i3 = this.f4328b;
        return Arrays.hashCode(this.f4330e) + (((((((i3 * 31) + i3) * 31) + this.c) * 31) + this.f4329d) * 31);
    }

    public final String toString() {
        int i3 = this.f4328b;
        int i4 = this.c;
        StringBuilder sb = new StringBuilder((i3 + 1) * i4);
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                sb.append(b(i6, i5) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public b(int i3, int i4, int i5, int[] iArr) {
        this.f4328b = i3;
        this.c = i4;
        this.f4329d = i5;
        this.f4330e = iArr;
    }
}
