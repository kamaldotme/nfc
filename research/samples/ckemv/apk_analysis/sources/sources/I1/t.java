package I1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f376a;

    /* renamed from: b, reason: collision with root package name */
    public int f377b;
    public int c;

    public t(int i3, int i4, byte[] bArr) {
        this.f376a = bArr;
        this.f377b = i3;
        this.c = i4;
    }

    public int a() {
        return ((this.f376a.length - this.f377b) * 8) - this.c;
    }

    public int b(int i3) {
        if (i3 <= 0 || i3 > 32 || i3 > a()) {
            throw new IllegalArgumentException(String.valueOf(i3));
        }
        int i4 = this.c;
        int i5 = 0;
        byte[] bArr = this.f376a;
        if (i4 > 0) {
            int i6 = 8 - i4;
            int min = Math.min(i3, i6);
            int i7 = i6 - min;
            int i8 = this.f377b;
            int i9 = (((255 >> (8 - min)) << i7) & bArr[i8]) >> i7;
            i3 -= min;
            int i10 = this.c + min;
            this.c = i10;
            if (i10 == 8) {
                this.c = 0;
                this.f377b = i8 + 1;
            }
            i5 = i9;
        }
        if (i3 <= 0) {
            return i5;
        }
        while (i3 >= 8) {
            int i11 = i5 << 8;
            int i12 = this.f377b;
            int i13 = i11 | (bArr[i12] & 255);
            this.f377b = i12 + 1;
            i3 -= 8;
            i5 = i13;
        }
        if (i3 <= 0) {
            return i5;
        }
        int i14 = 8 - i3;
        int i15 = (i5 << i3) | ((bArr[this.f377b] & ((255 >> i14) << i14)) >> i14);
        this.c += i3;
        return i15;
    }

    public t(byte[] bArr) {
        this.f376a = bArr;
    }
}
