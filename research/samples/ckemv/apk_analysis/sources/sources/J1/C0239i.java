package j1;

/* renamed from: j1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239i extends AbstractC0236f {
    public final byte[] c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3490d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3491e;

    public C0239i(byte[] bArr, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 > i3 || i6 > i4) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = bArr;
        this.f3490d = i3;
        this.f3491e = i4;
    }

    @Override // j1.AbstractC0236f
    public final byte[] a() {
        int i3 = this.f3490d;
        byte[] bArr = this.c;
        int i4 = this.f3485a;
        int i5 = this.f3486b;
        if (i4 == i3 && i5 == this.f3491e) {
            return bArr;
        }
        int i6 = i4 * i5;
        byte[] bArr2 = new byte[i6];
        if (i4 == i3) {
            System.arraycopy(bArr, 0, bArr2, 0, i6);
            return bArr2;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            System.arraycopy(bArr, i7, bArr2, i8 * i4, i4);
            i7 += i3;
        }
        return bArr2;
    }

    @Override // j1.AbstractC0236f
    public final byte[] b(int i3, byte[] bArr) {
        if (i3 < 0 || i3 >= this.f3486b) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i3)));
        }
        int i4 = this.f3485a;
        if (bArr == null || bArr.length < i4) {
            bArr = new byte[i4];
        }
        System.arraycopy(this.c, i3 * this.f3490d, bArr, 0, i4);
        return bArr;
    }
}
