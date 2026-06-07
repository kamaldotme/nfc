package z2;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class s extends i {

    /* renamed from: f, reason: collision with root package name */
    public final transient byte[][] f5362f;
    public final transient int[] g;

    public s(byte[][] bArr, int[] iArr) {
        super(i.f5338e.f5339b);
        this.f5362f = bArr;
        this.g = iArr;
    }

    @Override // z2.i
    public final String a() {
        throw null;
    }

    @Override // z2.i
    public final i b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f5362f;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int[] iArr = this.g;
            int i5 = iArr[length + i3];
            int i6 = iArr[i3];
            messageDigest.update(bArr[i3], i5, i6 - i4);
            i3++;
            i4 = i6;
        }
        byte[] digest = messageDigest.digest();
        X1.g.b(digest);
        return new i(digest);
    }

    @Override // z2.i
    public final int c() {
        return this.g[this.f5362f.length - 1];
    }

    @Override // z2.i
    public final String d() {
        return new i(l()).d();
    }

    @Override // z2.i
    public final byte[] e() {
        return l();
    }

    @Override // z2.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.c() == c() && h(iVar, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // z2.i
    public final byte f(int i3) {
        byte[][] bArr = this.f5362f;
        int length = bArr.length - 1;
        int[] iArr = this.g;
        v0.f.m(iArr[length], i3, 1L);
        int b3 = A2.b.b(this, i3);
        return bArr[b3][(i3 - (b3 == 0 ? 0 : iArr[b3 - 1])) + iArr[bArr.length + b3]];
    }

    @Override // z2.i
    public final boolean g(int i3, byte[] bArr, int i4, int i5) {
        X1.g.e(bArr, "other");
        if (i3 < 0 || i3 > c() - i5 || i4 < 0 || i4 > bArr.length - i5) {
            return false;
        }
        int i6 = i5 + i3;
        int b3 = A2.b.b(this, i3);
        while (i3 < i6) {
            int[] iArr = this.g;
            int i7 = b3 == 0 ? 0 : iArr[b3 - 1];
            int i8 = iArr[b3] - i7;
            byte[][] bArr2 = this.f5362f;
            int i9 = iArr[bArr2.length + b3];
            int min = Math.min(i6, i8 + i7) - i3;
            if (!v0.f.j((i3 - i7) + i9, i4, min, bArr2[b3], bArr)) {
                return false;
            }
            i4 += min;
            i3 += min;
            b3++;
        }
        return true;
    }

    @Override // z2.i
    public final boolean h(i iVar, int i3) {
        X1.g.e(iVar, "other");
        if (c() - i3 < 0) {
            return false;
        }
        int b3 = A2.b.b(this, 0);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int[] iArr = this.g;
            int i6 = b3 == 0 ? 0 : iArr[b3 - 1];
            int i7 = iArr[b3] - i6;
            byte[][] bArr = this.f5362f;
            int i8 = iArr[bArr.length + b3];
            int min = Math.min(i3, i7 + i6) - i4;
            if (!iVar.g(i5, bArr[b3], (i4 - i6) + i8, min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b3++;
        }
        return true;
    }

    @Override // z2.i
    public final int hashCode() {
        int i3 = this.c;
        if (i3 != 0) {
            return i3;
        }
        byte[][] bArr = this.f5362f;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.g;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr2[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        this.c = i5;
        return i5;
    }

    @Override // z2.i
    public final i i() {
        return new i(l()).i();
    }

    @Override // z2.i
    public final void k(f fVar, int i3) {
        X1.g.e(fVar, "buffer");
        int b3 = A2.b.b(this, 0);
        int i4 = 0;
        while (i4 < i3) {
            int[] iArr = this.g;
            int i5 = b3 == 0 ? 0 : iArr[b3 - 1];
            int i6 = iArr[b3] - i5;
            byte[][] bArr = this.f5362f;
            int i7 = iArr[bArr.length + b3];
            int min = Math.min(i3, i6 + i5) - i4;
            int i8 = (i4 - i5) + i7;
            q qVar = new q(bArr[b3], i8, i8 + min, true);
            q qVar2 = fVar.f5337b;
            if (qVar2 == null) {
                qVar.g = qVar;
                qVar.f5359f = qVar;
                fVar.f5337b = qVar;
            } else {
                q qVar3 = qVar2.g;
                X1.g.b(qVar3);
                qVar3.b(qVar);
            }
            i4 += min;
            b3++;
        }
        fVar.c += i3;
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f5362f;
        int length = bArr2.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.g;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = i7 - i4;
            L1.j.R(i5, i6, i6 + i8, bArr2[i3], bArr);
            i5 += i8;
            i3++;
            i4 = i7;
        }
        return bArr;
    }

    @Override // z2.i
    public final String toString() {
        return new i(l()).toString();
    }
}
