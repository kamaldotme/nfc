package z2;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name */
    public q f5337b;
    public long c;

    public final String A(long j3, Charset charset) {
        X1.g.e(charset, "charset");
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.c < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return "";
        }
        q qVar = this.f5337b;
        X1.g.b(qVar);
        int i3 = qVar.f5356b;
        if (i3 + j3 > qVar.c) {
            return new String(o(j3), charset);
        }
        int i4 = (int) j3;
        String str = new String(qVar.f5355a, i3, i4, charset);
        int i5 = qVar.f5356b + i4;
        qVar.f5356b = i5;
        this.c -= j3;
        if (i5 == qVar.c) {
            this.f5337b = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    @Override // z2.g
    public final /* bridge */ /* synthetic */ g B(int i3) {
        O(i3);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[EDGE_INSN: B:40:0x00a8->B:37:0x00a8 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Type inference failed for: r1v9, types: [z2.f, java.lang.Object] */
    @Override // z2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long C() {
        int i3;
        if (this.c == 0) {
            throw new EOFException();
        }
        int i4 = 0;
        boolean z3 = false;
        long j3 = 0;
        do {
            q qVar = this.f5337b;
            X1.g.b(qVar);
            int i5 = qVar.f5356b;
            int i6 = qVar.c;
            while (i5 < i6) {
                byte b3 = qVar.f5355a[i5];
                if (b3 >= 48 && b3 <= 57) {
                    i3 = b3 - 48;
                } else if (b3 >= 97 && b3 <= 102) {
                    i3 = b3 - 87;
                } else if (b3 >= 65 && b3 <= 70) {
                    i3 = b3 - 55;
                } else {
                    if (i4 == 0) {
                        char[] cArr = A2.b.f62a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b3 >> 4) & 15], cArr[b3 & 15]})));
                    }
                    z3 = true;
                    if (i5 != i6) {
                        this.f5337b = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f5356b = i5;
                    }
                    if (!z3) {
                        break;
                    }
                }
                if ((j3 & (-1152921504606846976L)) != 0) {
                    ?? obj = new Object();
                    obj.M(j3);
                    obj.L(b3);
                    throw new NumberFormatException("Number too large: ".concat(obj.A(obj.c, d2.a.f2653a)));
                }
                j3 = (j3 << 4) | i3;
                i5++;
                i4++;
            }
            if (i5 != i6) {
            }
            if (!z3) {
            }
        } while (this.f5337b != null);
        this.c -= i4;
        return j3;
    }

    public final i D(int i3) {
        if (i3 == 0) {
            return i.f5338e;
        }
        v0.f.m(this.c, 0L, i3);
        q qVar = this.f5337b;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            X1.g.b(qVar);
            int i7 = qVar.c;
            int i8 = qVar.f5356b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            qVar = qVar.f5359f;
        }
        byte[][] bArr = new byte[i6];
        int[] iArr = new int[i6 * 2];
        q qVar2 = this.f5337b;
        int i9 = 0;
        while (i4 < i3) {
            X1.g.b(qVar2);
            bArr[i9] = qVar2.f5355a;
            i4 += qVar2.c - qVar2.f5356b;
            iArr[i9] = Math.min(i4, i3);
            iArr[i9 + i6] = qVar2.f5356b;
            qVar2.f5357d = true;
            i9++;
            qVar2 = qVar2.f5359f;
        }
        return new s(bArr, iArr);
    }

    @Override // z2.h
    public final byte E() {
        if (this.c == 0) {
            throw new EOFException();
        }
        q qVar = this.f5337b;
        X1.g.b(qVar);
        int i3 = qVar.f5356b;
        int i4 = qVar.c;
        int i5 = i3 + 1;
        byte b3 = qVar.f5355a[i3];
        this.c--;
        if (i5 == i4) {
            this.f5337b = qVar.a();
            r.a(qVar);
        } else {
            qVar.f5356b = i5;
        }
        return b3;
    }

    @Override // z2.g
    public final /* bridge */ /* synthetic */ g F(i iVar) {
        J(iVar);
        return this;
    }

    public final q G(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        q qVar = this.f5337b;
        if (qVar == null) {
            q b3 = r.b();
            this.f5337b = b3;
            b3.g = b3;
            b3.f5359f = b3;
            return b3;
        }
        q qVar2 = qVar.g;
        X1.g.b(qVar2);
        if (qVar2.c + i3 <= 8192 && qVar2.f5358e) {
            return qVar2;
        }
        q b4 = r.b();
        qVar2.b(b4);
        return b4;
    }

    @Override // z2.h
    public final int H() {
        if (this.c < 4) {
            throw new EOFException();
        }
        q qVar = this.f5337b;
        X1.g.b(qVar);
        int i3 = qVar.f5356b;
        int i4 = qVar.c;
        if (i4 - i3 < 4) {
            return ((E() & 255) << 24) | ((E() & 255) << 16) | ((E() & 255) << 8) | (E() & 255);
        }
        byte[] bArr = qVar.f5355a;
        int i5 = i3 + 3;
        int i6 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
        int i7 = i3 + 4;
        int i8 = i6 | (bArr[i5] & 255);
        this.c -= 4;
        if (i7 == i4) {
            this.f5337b = qVar.a();
            r.a(qVar);
        } else {
            qVar.f5356b = i7;
        }
        return i8;
    }

    public final void I(int i3, int i4, byte[] bArr) {
        X1.g.e(bArr, "source");
        long j3 = i4;
        v0.f.m(bArr.length, i3, j3);
        int i5 = i4 + i3;
        while (i3 < i5) {
            q G2 = G(1);
            int min = Math.min(i5 - i3, 8192 - G2.c);
            int i6 = i3 + min;
            L1.j.R(G2.c, i3, i6, bArr, G2.f5355a);
            G2.c += min;
            i3 = i6;
        }
        this.c += j3;
    }

    public final void J(i iVar) {
        X1.g.e(iVar, "byteString");
        iVar.k(this, iVar.c());
    }

    public final long K(v vVar) {
        X1.g.e(vVar, "source");
        long j3 = 0;
        while (true) {
            long z3 = ((f) vVar).z(this, 8192L);
            if (z3 == -1) {
                return j3;
            }
            j3 += z3;
        }
    }

    public final void L(int i3) {
        q G2 = G(1);
        int i4 = G2.c;
        G2.c = i4 + 1;
        G2.f5355a[i4] = (byte) i3;
        this.c++;
    }

    public final void M(long j3) {
        if (j3 == 0) {
            L(48);
            return;
        }
        long j4 = (j3 >>> 1) | j3;
        long j5 = j4 | (j4 >>> 2);
        long j6 = j5 | (j5 >>> 4);
        long j7 = j6 | (j6 >>> 8);
        long j8 = j7 | (j7 >>> 16);
        long j9 = j8 | (j8 >>> 32);
        long j10 = j9 - ((j9 >>> 1) & 6148914691236517205L);
        long j11 = ((j10 >>> 2) & 3689348814741910323L) + (j10 & 3689348814741910323L);
        long j12 = ((j11 >>> 4) + j11) & 1085102592571150095L;
        long j13 = j12 + (j12 >>> 8);
        long j14 = j13 + (j13 >>> 16);
        int i3 = (int) ((((j14 & 63) + ((j14 >>> 32) & 63)) + 3) / 4);
        q G2 = G(i3);
        int i4 = G2.c;
        for (int i5 = (i4 + i3) - 1; i5 >= i4; i5--) {
            G2.f5355a[i5] = A2.a.f61a[(int) (15 & j3)];
            j3 >>>= 4;
        }
        G2.c += i3;
        this.c += i3;
    }

    public final void N(int i3) {
        q G2 = G(4);
        int i4 = G2.c;
        byte[] bArr = G2.f5355a;
        bArr[i4] = (byte) ((i3 >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i3 >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i3 >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i3 & 255);
        G2.c = i4 + 4;
        this.c += 4;
    }

    public final void O(int i3) {
        q G2 = G(2);
        int i4 = G2.c;
        byte[] bArr = G2.f5355a;
        bArr[i4] = (byte) ((i3 >>> 8) & 255);
        bArr[i4 + 1] = (byte) (i3 & 255);
        G2.c = i4 + 2;
        this.c += 2;
    }

    public final void P(int i3, int i4, String str) {
        char charAt;
        X1.g.e(str, "string");
        if (i3 < 0) {
            throw new IllegalArgumentException(X.d.f("beginIndex < 0: ", i3).toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i4 + " < " + i3).toString());
        }
        if (i4 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i4 + " > " + str.length()).toString());
        }
        while (i3 < i4) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < 128) {
                q G2 = G(1);
                int i5 = G2.c - i3;
                int min = Math.min(i4, 8192 - i5);
                int i6 = i3 + 1;
                byte[] bArr = G2.f5355a;
                bArr[i3 + i5] = (byte) charAt2;
                while (true) {
                    i3 = i6;
                    if (i3 >= min || (charAt = str.charAt(i3)) >= 128) {
                        break;
                    }
                    i6 = i3 + 1;
                    bArr[i3 + i5] = (byte) charAt;
                }
                int i7 = G2.c;
                int i8 = (i5 + i3) - i7;
                G2.c = i7 + i8;
                this.c += i8;
            } else {
                if (charAt2 < 2048) {
                    q G3 = G(2);
                    int i9 = G3.c;
                    byte[] bArr2 = G3.f5355a;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    G3.c = i9 + 2;
                    this.c += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q G4 = G(3);
                    int i10 = G4.c;
                    byte[] bArr3 = G4.f5355a;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    G4.c = i10 + 3;
                    this.c += 3;
                } else {
                    int i11 = i3 + 1;
                    char charAt3 = i11 < i4 ? str.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        L(63);
                        i3 = i11;
                    } else {
                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q G5 = G(4);
                        int i13 = G5.c;
                        byte[] bArr4 = G5.f5355a;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        G5.c = i13 + 4;
                        this.c += 4;
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
    }

    public final void Q(String str) {
        X1.g.e(str, "string");
        P(0, str.length(), str);
    }

    public final void R(int i3) {
        String str;
        int i4 = 0;
        if (i3 < 128) {
            L(i3);
            return;
        }
        if (i3 < 2048) {
            q G2 = G(2);
            int i5 = G2.c;
            byte[] bArr = G2.f5355a;
            bArr[i5] = (byte) ((i3 >> 6) | 192);
            bArr[1 + i5] = (byte) ((i3 & 63) | 128);
            G2.c = i5 + 2;
            this.c += 2;
            return;
        }
        if (55296 <= i3 && i3 < 57344) {
            L(63);
            return;
        }
        if (i3 < 65536) {
            q G3 = G(3);
            int i6 = G3.c;
            byte[] bArr2 = G3.f5355a;
            bArr2[i6] = (byte) ((i3 >> 12) | 224);
            bArr2[1 + i6] = (byte) (((i3 >> 6) & 63) | 128);
            bArr2[2 + i6] = (byte) ((i3 & 63) | 128);
            G3.c = i6 + 3;
            this.c += 3;
            return;
        }
        if (i3 <= 1114111) {
            q G4 = G(4);
            int i7 = G4.c;
            byte[] bArr3 = G4.f5355a;
            bArr3[i7] = (byte) ((i3 >> 18) | 240);
            bArr3[1 + i7] = (byte) (((i3 >> 12) & 63) | 128);
            bArr3[2 + i7] = (byte) (((i3 >> 6) & 63) | 128);
            bArr3[3 + i7] = (byte) ((i3 & 63) | 128);
            G4.c = i7 + 4;
            this.c += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i3 != 0) {
            char[] cArr = A2.b.f62a;
            char[] cArr2 = {cArr[(i3 >> 28) & 15], cArr[(i3 >> 24) & 15], cArr[(i3 >> 20) & 15], cArr[(i3 >> 16) & 15], cArr[(i3 >> 12) & 15], cArr[(i3 >> 8) & 15], cArr[(i3 >> 4) & 15], cArr[i3 & 15]};
            while (i4 < 8 && cArr2[i4] == '0') {
                i4++;
            }
            if (i4 < 0) {
                throw new IndexOutOfBoundsException(X.d.g("startIndex: ", i4, ", endIndex: 8, size: 8"));
            }
            if (i4 > 8) {
                throw new IllegalArgumentException(X.d.g("startIndex: ", i4, " > endIndex: 8"));
            }
            str = new String(cArr2, i4, 8 - i4);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(f fVar, long j3, long j4) {
        X1.g.e(fVar, "out");
        v0.f.m(this.c, j3, j4);
        if (j4 == 0) {
            return;
        }
        fVar.c += j4;
        q qVar = this.f5337b;
        while (true) {
            X1.g.b(qVar);
            long j5 = qVar.c - qVar.f5356b;
            if (j3 < j5) {
                break;
            }
            j3 -= j5;
            qVar = qVar.f5359f;
        }
        while (j4 > 0) {
            X1.g.b(qVar);
            q c = qVar.c();
            int i3 = c.f5356b + ((int) j3);
            c.f5356b = i3;
            c.c = Math.min(i3 + ((int) j4), c.c);
            q qVar2 = fVar.f5337b;
            if (qVar2 == null) {
                c.g = c;
                c.f5359f = c;
                fVar.f5337b = c;
            } else {
                q qVar3 = qVar2.g;
                X1.g.b(qVar3);
                qVar3.b(c);
            }
            j4 -= c.c - c.f5356b;
            qVar = qVar.f5359f;
            j3 = 0;
        }
    }

    public final byte b(long j3) {
        v0.f.m(this.c, j3, 1L);
        q qVar = this.f5337b;
        if (qVar == null) {
            X1.g.b(null);
            throw null;
        }
        long j4 = this.c;
        if (j4 - j3 < j3) {
            while (j4 > j3) {
                qVar = qVar.g;
                X1.g.b(qVar);
                j4 -= qVar.c - qVar.f5356b;
            }
            return qVar.f5355a[(int) ((qVar.f5356b + j3) - j4)];
        }
        long j5 = 0;
        while (true) {
            int i3 = qVar.c;
            int i4 = qVar.f5356b;
            long j6 = (i3 - i4) + j5;
            if (j6 > j3) {
                return qVar.f5355a[(int) ((i4 + j3) - j5)];
            }
            qVar = qVar.f5359f;
            X1.g.b(qVar);
            j5 = j6;
        }
    }

    @Override // z2.v
    public final x c() {
        return x.f5364d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z2.f, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.c != 0) {
            q qVar = this.f5337b;
            X1.g.b(qVar);
            q c = qVar.c();
            obj.f5337b = c;
            c.g = c;
            c.f5359f = c;
            for (q qVar2 = qVar.f5359f; qVar2 != qVar; qVar2 = qVar2.f5359f) {
                q qVar3 = c.g;
                X1.g.b(qVar3);
                X1.g.b(qVar2);
                qVar3.b(qVar2.c());
            }
            obj.c = this.c;
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, z2.t
    public final void close() {
    }

    @Override // z2.g
    public final g d(byte[] bArr) {
        X1.g.e(bArr, "source");
        I(0, bArr.length, bArr);
        return this;
    }

    @Override // z2.g
    public final /* bridge */ /* synthetic */ g e(int i3) {
        N(i3);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j3 = this.c;
                f fVar = (f) obj;
                if (j3 == fVar.c) {
                    if (j3 != 0) {
                        q qVar = this.f5337b;
                        X1.g.b(qVar);
                        q qVar2 = fVar.f5337b;
                        X1.g.b(qVar2);
                        int i3 = qVar.f5356b;
                        int i4 = qVar2.f5356b;
                        long j4 = 0;
                        while (j4 < this.c) {
                            long min = Math.min(qVar.c - i3, qVar2.c - i4);
                            long j5 = 0;
                            while (j5 < min) {
                                int i5 = i3 + 1;
                                byte b3 = qVar.f5355a[i3];
                                int i6 = i4 + 1;
                                if (b3 == qVar2.f5355a[i4]) {
                                    j5++;
                                    i4 = i6;
                                    i3 = i5;
                                }
                            }
                            if (i3 == qVar.c) {
                                q qVar3 = qVar.f5359f;
                                X1.g.b(qVar3);
                                i3 = qVar3.f5356b;
                                qVar = qVar3;
                            }
                            if (i4 == qVar2.c) {
                                qVar2 = qVar2.f5359f;
                                X1.g.b(qVar2);
                                i4 = qVar2.f5356b;
                            }
                            j4 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // z2.g, z2.t, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        q qVar = this.f5337b;
        if (qVar == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i4 = qVar.c;
            for (int i5 = qVar.f5356b; i5 < i4; i5++) {
                i3 = (i3 * 31) + qVar.f5355a[i5];
            }
            qVar = qVar.f5359f;
            X1.g.b(qVar);
        } while (qVar != this.f5337b);
        return i3;
    }

    public final long i(byte b3, long j3, long j4) {
        q qVar;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.c + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.c;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (qVar = this.f5337b) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                qVar = qVar.g;
                X1.g.b(qVar);
                j6 -= qVar.c - qVar.f5356b;
            }
            while (j6 < j4) {
                int min = (int) Math.min(qVar.c, (qVar.f5356b + j4) - j6);
                for (int i3 = (int) ((qVar.f5356b + j3) - j6); i3 < min; i3++) {
                    if (qVar.f5355a[i3] == b3) {
                        return (i3 - qVar.f5356b) + j6;
                    }
                }
                j6 += qVar.c - qVar.f5356b;
                qVar = qVar.f5359f;
                X1.g.b(qVar);
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j7 = (qVar.c - qVar.f5356b) + j5;
            if (j7 > j3) {
                break;
            }
            qVar = qVar.f5359f;
            X1.g.b(qVar);
            j5 = j7;
        }
        while (j5 < j4) {
            int min2 = (int) Math.min(qVar.c, (qVar.f5356b + j4) - j5);
            for (int i4 = (int) ((qVar.f5356b + j3) - j5); i4 < min2; i4++) {
                if (qVar.f5355a[i4] == b3) {
                    return (i4 - qVar.f5356b) + j5;
                }
            }
            j5 += qVar.c - qVar.f5356b;
            qVar = qVar.f5359f;
            X1.g.b(qVar);
            j3 = j5;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // z2.h
    public final String j() {
        return r(Long.MAX_VALUE);
    }

    @Override // z2.g
    public final /* bridge */ /* synthetic */ g k(long j3) {
        M(j3);
        return this;
    }

    @Override // z2.t
    public final void m(f fVar, long j3) {
        q b3;
        X1.g.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        v0.f.m(fVar.c, 0L, j3);
        while (j3 > 0) {
            q qVar = fVar.f5337b;
            X1.g.b(qVar);
            int i3 = qVar.c;
            q qVar2 = fVar.f5337b;
            X1.g.b(qVar2);
            long j4 = i3 - qVar2.f5356b;
            int i4 = 0;
            if (j3 < j4) {
                q qVar3 = this.f5337b;
                q qVar4 = qVar3 != null ? qVar3.g : null;
                if (qVar4 != null && qVar4.f5358e) {
                    if ((qVar4.c + j3) - (qVar4.f5357d ? 0 : qVar4.f5356b) <= 8192) {
                        q qVar5 = fVar.f5337b;
                        X1.g.b(qVar5);
                        qVar5.d(qVar4, (int) j3);
                        fVar.c -= j3;
                        this.c += j3;
                        return;
                    }
                }
                q qVar6 = fVar.f5337b;
                X1.g.b(qVar6);
                int i5 = (int) j3;
                if (i5 <= 0 || i5 > qVar6.c - qVar6.f5356b) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i5 >= 1024) {
                    b3 = qVar6.c();
                } else {
                    b3 = r.b();
                    int i6 = qVar6.f5356b;
                    L1.j.R(0, i6, i6 + i5, qVar6.f5355a, b3.f5355a);
                }
                b3.c = b3.f5356b + i5;
                qVar6.f5356b += i5;
                q qVar7 = qVar6.g;
                X1.g.b(qVar7);
                qVar7.b(b3);
                fVar.f5337b = b3;
            }
            q qVar8 = fVar.f5337b;
            X1.g.b(qVar8);
            long j5 = qVar8.c - qVar8.f5356b;
            fVar.f5337b = qVar8.a();
            q qVar9 = this.f5337b;
            if (qVar9 == null) {
                this.f5337b = qVar8;
                qVar8.g = qVar8;
                qVar8.f5359f = qVar8;
            } else {
                q qVar10 = qVar9.g;
                X1.g.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                X1.g.b(qVar11);
                if (qVar11.f5358e) {
                    int i7 = qVar8.c - qVar8.f5356b;
                    q qVar12 = qVar8.g;
                    X1.g.b(qVar12);
                    int i8 = 8192 - qVar12.c;
                    q qVar13 = qVar8.g;
                    X1.g.b(qVar13);
                    if (!qVar13.f5357d) {
                        q qVar14 = qVar8.g;
                        X1.g.b(qVar14);
                        i4 = qVar14.f5356b;
                    }
                    if (i7 <= i8 + i4) {
                        q qVar15 = qVar8.g;
                        X1.g.b(qVar15);
                        qVar8.d(qVar15, i7);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.c -= j5;
            this.c += j5;
            j3 -= j5;
        }
    }

    @Override // z2.h
    public final void n(long j3) {
        if (this.c < j3) {
            throw new EOFException();
        }
    }

    public final byte[] o(long j3) {
        int min;
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.c < j3) {
            throw new EOFException();
        }
        int i3 = (int) j3;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i3 - i4;
            v0.f.m(i3, i4, i5);
            q qVar = this.f5337b;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i5, qVar.c - qVar.f5356b);
                int i6 = qVar.f5356b;
                L1.j.R(i4, i6, i6 + min, qVar.f5355a, bArr);
                int i7 = qVar.f5356b + min;
                qVar.f5356b = i7;
                this.c -= min;
                if (i7 == qVar.c) {
                    this.f5337b = qVar.a();
                    r.a(qVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i4 += min;
        }
        return bArr;
    }

    @Override // z2.h
    public final i p(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.c < j3) {
            throw new EOFException();
        }
        if (j3 < 4096) {
            return new i(o(j3));
        }
        i D = D((int) j3);
        u(j3);
        return D;
    }

    @Override // z2.g
    public final /* bridge */ /* synthetic */ g q(String str) {
        Q(str);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [z2.f, java.lang.Object] */
    @Override // z2.h
    public final String r(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j3).toString());
        }
        long j4 = j3 != Long.MAX_VALUE ? j3 + 1 : Long.MAX_VALUE;
        long i3 = i((byte) 10, 0L, j4);
        if (i3 != -1) {
            return A2.a.a(this, i3);
        }
        if (j4 < this.c && b(j4 - 1) == 13 && b(j4) == 10) {
            return A2.a.a(this, j4);
        }
        ?? obj = new Object();
        a(obj, 0L, Math.min(32, this.c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.c, j3) + " content=" + obj.p(obj.c).d() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        X1.g.e(byteBuffer, "sink");
        q qVar = this.f5337b;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.c - qVar.f5356b);
        byteBuffer.put(qVar.f5355a, qVar.f5356b, min);
        int i3 = qVar.f5356b + min;
        qVar.f5356b = i3;
        this.c -= min;
        if (i3 == qVar.c) {
            this.f5337b = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    @Override // z2.h
    public final f t() {
        return this;
    }

    public final String toString() {
        long j3 = this.c;
        if (j3 <= 2147483647L) {
            return D((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.c).toString());
    }

    @Override // z2.h
    public final void u(long j3) {
        while (j3 > 0) {
            q qVar = this.f5337b;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j3, qVar.c - qVar.f5356b);
            long j4 = min;
            this.c -= j4;
            j3 -= j4;
            int i3 = qVar.f5356b + min;
            qVar.f5356b = i3;
            if (i3 == qVar.c) {
                this.f5337b = qVar.a();
                r.a(qVar);
            }
        }
    }

    @Override // z2.h
    public final boolean v() {
        return this.c == 0;
    }

    @Override // z2.g
    public final /* bridge */ /* synthetic */ g w(int i3) {
        L(i3);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X1.g.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i3 = remaining;
        while (i3 > 0) {
            q G2 = G(1);
            int min = Math.min(i3, 8192 - G2.c);
            byteBuffer.get(G2.f5355a, G2.c, min);
            i3 -= min;
            G2.c += min;
        }
        this.c += remaining;
        return remaining;
    }

    @Override // z2.h
    public final short y() {
        if (this.c < 2) {
            throw new EOFException();
        }
        q qVar = this.f5337b;
        X1.g.b(qVar);
        int i3 = qVar.f5356b;
        int i4 = qVar.c;
        if (i4 - i3 < 2) {
            return (short) (((E() & 255) << 8) | (E() & 255));
        }
        int i5 = i3 + 1;
        byte[] bArr = qVar.f5355a;
        int i6 = (bArr[i3] & 255) << 8;
        int i7 = i3 + 2;
        int i8 = (bArr[i5] & 255) | i6;
        this.c -= 2;
        if (i7 == i4) {
            this.f5337b = qVar.a();
            r.a(qVar);
        } else {
            qVar.f5356b = i7;
        }
        return (short) i8;
    }

    @Override // z2.v
    public final long z(f fVar, long j3) {
        X1.g.e(fVar, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        long j4 = this.c;
        if (j4 == 0) {
            return -1L;
        }
        if (j3 > j4) {
            j3 = j4;
        }
        fVar.m(this, j3);
        return j3;
    }
}
