package j1;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235e extends AbstractC0236f {
    public final AbstractC0236f c;

    public C0235e(AbstractC0236f abstractC0236f) {
        super(abstractC0236f.f3485a, abstractC0236f.f3486b);
        this.c = abstractC0236f;
    }

    @Override // j1.AbstractC0236f
    public final byte[] a() {
        byte[] a3 = this.c.a();
        int i3 = this.f3485a * this.f3486b;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) (255 - (a3[i4] & 255));
        }
        return bArr;
    }

    @Override // j1.AbstractC0236f
    public final byte[] b(int i3, byte[] bArr) {
        byte[] b3 = this.c.b(i3, bArr);
        for (int i4 = 0; i4 < this.f3485a; i4++) {
            b3[i4] = (byte) (255 - (b3[i4] & 255));
        }
        return b3;
    }

    @Override // j1.AbstractC0236f
    public final boolean c() {
        return this.c.c();
    }

    @Override // j1.AbstractC0236f
    public final AbstractC0236f d() {
        return new C0235e(this.c.d());
    }
}
