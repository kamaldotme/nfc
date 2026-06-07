package t2;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389d {

    /* renamed from: b, reason: collision with root package name */
    public final z2.f f4927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4928d;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f4931i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4926a = true;
    public int c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f4929e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0387b[] f4930f = new C0387b[8];
    public int g = 7;

    public C0389d(z2.f fVar) {
        this.f4927b = fVar;
    }

    public final void a(int i3) {
        int i4;
        if (i3 > 0) {
            int length = this.f4930f.length - 1;
            int i5 = 0;
            while (true) {
                i4 = this.g;
                if (length < i4 || i3 <= 0) {
                    break;
                }
                C0387b c0387b = this.f4930f[length];
                X1.g.b(c0387b);
                i3 -= c0387b.c;
                int i6 = this.f4931i;
                C0387b c0387b2 = this.f4930f[length];
                X1.g.b(c0387b2);
                this.f4931i = i6 - c0387b2.c;
                this.h--;
                i5++;
                length--;
            }
            C0387b[] c0387bArr = this.f4930f;
            int i7 = i4 + 1;
            System.arraycopy(c0387bArr, i7, c0387bArr, i7 + i5, this.h);
            C0387b[] c0387bArr2 = this.f4930f;
            int i8 = this.g + 1;
            Arrays.fill(c0387bArr2, i8, i8 + i5, (Object) null);
            this.g += i5;
        }
    }

    public final void b(C0387b c0387b) {
        int i3 = this.f4929e;
        int i4 = c0387b.c;
        if (i4 > i3) {
            L1.j.T(r7, null, 0, this.f4930f.length);
            this.g = this.f4930f.length - 1;
            this.h = 0;
            this.f4931i = 0;
            return;
        }
        a((this.f4931i + i4) - i3);
        int i5 = this.h + 1;
        C0387b[] c0387bArr = this.f4930f;
        if (i5 > c0387bArr.length) {
            C0387b[] c0387bArr2 = new C0387b[c0387bArr.length * 2];
            System.arraycopy(c0387bArr, 0, c0387bArr2, c0387bArr.length, c0387bArr.length);
            this.g = this.f4930f.length - 1;
            this.f4930f = c0387bArr2;
        }
        int i6 = this.g;
        this.g = i6 - 1;
        this.f4930f[i6] = c0387b;
        this.h++;
        this.f4931i += i4;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [z2.f, java.lang.Object] */
    public final void c(z2.i iVar) {
        X1.g.e(iVar, "data");
        boolean z3 = this.f4926a;
        z2.f fVar = this.f4927b;
        if (z3) {
            int[] iArr = A.f4909a;
            int c = iVar.c();
            long j3 = 0;
            for (int i3 = 0; i3 < c; i3++) {
                byte f3 = iVar.f(i3);
                byte[] bArr = n2.b.f4249a;
                j3 += A.f4910b[f3 & 255];
            }
            if (((int) ((j3 + 7) >> 3)) < iVar.c()) {
                ?? obj = new Object();
                int[] iArr2 = A.f4909a;
                int c3 = iVar.c();
                long j4 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < c3; i5++) {
                    byte f4 = iVar.f(i5);
                    byte[] bArr2 = n2.b.f4249a;
                    int i6 = f4 & 255;
                    int i7 = A.f4909a[i6];
                    byte b3 = A.f4910b[i6];
                    j4 = (j4 << b3) | i7;
                    i4 += b3;
                    while (i4 >= 8) {
                        i4 -= 8;
                        obj.L((int) (j4 >> i4));
                    }
                }
                if (i4 > 0) {
                    obj.L((int) ((255 >>> i4) | (j4 << (8 - i4))));
                }
                z2.i p3 = obj.p(obj.c);
                e(p3.c(), 127, 128);
                fVar.J(p3);
                return;
            }
        }
        e(iVar.c(), 127, 0);
        fVar.J(iVar);
    }

    public final void d(ArrayList arrayList) {
        int i3;
        int i4;
        if (this.f4928d) {
            int i5 = this.c;
            if (i5 < this.f4929e) {
                e(i5, 31, 32);
            }
            this.f4928d = false;
            this.c = Integer.MAX_VALUE;
            e(this.f4929e, 31, 32);
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0387b c0387b = (C0387b) arrayList.get(i6);
            z2.i i7 = c0387b.f4919a.i();
            Integer num = (Integer) e.f4933b.get(i7);
            z2.i iVar = c0387b.f4920b;
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (2 <= i4 && i4 < 8) {
                    C0387b[] c0387bArr = e.f4932a;
                    if (X1.g.a(c0387bArr[intValue].f4920b, iVar)) {
                        i3 = i4;
                    } else if (X1.g.a(c0387bArr[i4].f4920b, iVar)) {
                        i4 = intValue + 2;
                        i3 = i4;
                    }
                }
                i3 = i4;
                i4 = -1;
            } else {
                i3 = -1;
                i4 = -1;
            }
            if (i4 == -1) {
                int i8 = this.g + 1;
                int length = this.f4930f.length;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    C0387b c0387b2 = this.f4930f[i8];
                    X1.g.b(c0387b2);
                    if (X1.g.a(c0387b2.f4919a, i7)) {
                        C0387b c0387b3 = this.f4930f[i8];
                        X1.g.b(c0387b3);
                        if (X1.g.a(c0387b3.f4920b, iVar)) {
                            i4 = e.f4932a.length + (i8 - this.g);
                            break;
                        } else if (i3 == -1) {
                            i3 = (i8 - this.g) + e.f4932a.length;
                        }
                    }
                    i8++;
                }
            }
            if (i4 != -1) {
                e(i4, 127, 128);
            } else if (i3 == -1) {
                this.f4927b.L(64);
                c(i7);
                c(iVar);
                b(c0387b);
            } else {
                z2.i iVar2 = C0387b.f4915d;
                i7.getClass();
                X1.g.e(iVar2, "prefix");
                if (!i7.h(iVar2, iVar2.c()) || X1.g.a(C0387b.f4918i, i7)) {
                    e(i3, 63, 64);
                    c(iVar);
                    b(c0387b);
                } else {
                    e(i3, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i3, int i4, int i5) {
        z2.f fVar = this.f4927b;
        if (i3 < i4) {
            fVar.L(i3 | i5);
            return;
        }
        fVar.L(i5 | i4);
        int i6 = i3 - i4;
        while (i6 >= 128) {
            fVar.L(128 | (i6 & 127));
            i6 >>>= 7;
        }
        fVar.L(i6);
    }
}
