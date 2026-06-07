package j1;

/* renamed from: j1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0236f {

    /* renamed from: a, reason: collision with root package name */
    public final int f3485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3486b;

    public AbstractC0236f(int i3, int i4) {
        this.f3485a = i3;
        this.f3486b = i4;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i3, byte[] bArr);

    public boolean c() {
        return false;
    }

    public AbstractC0236f d() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i3 = this.f3485a;
        byte[] bArr = new byte[i3];
        int i4 = this.f3486b;
        StringBuilder sb = new StringBuilder((i3 + 1) * i4);
        for (int i5 = 0; i5 < i4; i5++) {
            bArr = b(i5, bArr);
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = bArr[i6] & 255;
                sb.append(i7 < 64 ? '#' : i7 < 128 ? '+' : i7 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
