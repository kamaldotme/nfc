package t2;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388c {
    public final z2.p c;

    /* renamed from: f, reason: collision with root package name */
    public int f4925f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public int f4921a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4922b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0387b[] f4923d = new C0387b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f4924e = 7;

    public C0388c(t tVar) {
        this.c = new z2.p(tVar);
    }

    public final int a(int i3) {
        int i4;
        int i5 = 0;
        if (i3 > 0) {
            int length = this.f4923d.length;
            while (true) {
                length--;
                i4 = this.f4924e;
                if (length < i4 || i3 <= 0) {
                    break;
                }
                C0387b c0387b = this.f4923d[length];
                X1.g.b(c0387b);
                int i6 = c0387b.c;
                i3 -= i6;
                this.g -= i6;
                this.f4925f--;
                i5++;
            }
            C0387b[] c0387bArr = this.f4923d;
            System.arraycopy(c0387bArr, i4 + 1, c0387bArr, i4 + 1 + i5, this.f4925f);
            this.f4924e += i5;
        }
        return i5;
    }

    public final z2.i b(int i3) {
        if (i3 >= 0) {
            C0387b[] c0387bArr = e.f4932a;
            if (i3 <= c0387bArr.length - 1) {
                return c0387bArr[i3].f4919a;
            }
        }
        int length = this.f4924e + 1 + (i3 - e.f4932a.length);
        if (length >= 0) {
            C0387b[] c0387bArr2 = this.f4923d;
            if (length < c0387bArr2.length) {
                C0387b c0387b = c0387bArr2[length];
                X1.g.b(c0387b);
                return c0387b.f4919a;
            }
        }
        throw new IOException("Header index too large " + (i3 + 1));
    }

    public final void c(C0387b c0387b) {
        this.f4922b.add(c0387b);
        int i3 = this.f4921a;
        int i4 = c0387b.c;
        if (i4 > i3) {
            L1.j.T(r7, null, 0, this.f4923d.length);
            this.f4924e = this.f4923d.length - 1;
            this.f4925f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i4) - i3);
        int i5 = this.f4925f + 1;
        C0387b[] c0387bArr = this.f4923d;
        if (i5 > c0387bArr.length) {
            C0387b[] c0387bArr2 = new C0387b[c0387bArr.length * 2];
            System.arraycopy(c0387bArr, 0, c0387bArr2, c0387bArr.length, c0387bArr.length);
            this.f4924e = this.f4923d.length - 1;
            this.f4923d = c0387bArr2;
        }
        int i6 = this.f4924e;
        this.f4924e = i6 - 1;
        this.f4923d[i6] = c0387b;
        this.f4925f++;
        this.g += i4;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [z2.f, java.lang.Object] */
    public final z2.i d() {
        int i3;
        z2.p pVar = this.c;
        byte E2 = pVar.E();
        byte[] bArr = n2.b.f4249a;
        int i4 = E2 & 255;
        int i5 = 0;
        boolean z3 = (E2 & 128) == 128;
        long e3 = e(i4, 127);
        if (!z3) {
            return pVar.p(e3);
        }
        ?? obj = new Object();
        int[] iArr = A.f4909a;
        X1.g.e(pVar, "source");
        com.google.android.material.datepicker.l lVar = A.c;
        com.google.android.material.datepicker.l lVar2 = lVar;
        int i6 = 0;
        for (long j3 = 0; j3 < e3; j3++) {
            byte E3 = pVar.E();
            byte[] bArr2 = n2.b.f4249a;
            i5 = (i5 << 8) | (E3 & 255);
            i6 += 8;
            while (i6 >= 8) {
                com.google.android.material.datepicker.l[] lVarArr = (com.google.android.material.datepicker.l[]) lVar2.f2407d;
                X1.g.b(lVarArr);
                lVar2 = lVarArr[(i5 >>> (i6 - 8)) & 255];
                X1.g.b(lVar2);
                if (((com.google.android.material.datepicker.l[]) lVar2.f2407d) == null) {
                    obj.L(lVar2.f2406b);
                    i6 -= lVar2.c;
                    lVar2 = lVar;
                } else {
                    i6 -= 8;
                }
            }
        }
        while (i6 > 0) {
            com.google.android.material.datepicker.l[] lVarArr2 = (com.google.android.material.datepicker.l[]) lVar2.f2407d;
            X1.g.b(lVarArr2);
            com.google.android.material.datepicker.l lVar3 = lVarArr2[(i5 << (8 - i6)) & 255];
            X1.g.b(lVar3);
            if (((com.google.android.material.datepicker.l[]) lVar3.f2407d) != null || (i3 = lVar3.c) > i6) {
                break;
            }
            obj.L(lVar3.f2406b);
            i6 -= i3;
            lVar2 = lVar;
        }
        return obj.p(obj.c);
    }

    public final int e(int i3, int i4) {
        int i5 = i3 & i4;
        if (i5 < i4) {
            return i5;
        }
        int i6 = 0;
        while (true) {
            byte E2 = this.c.E();
            byte[] bArr = n2.b.f4249a;
            int i7 = E2 & 255;
            if ((E2 & 128) == 0) {
                return i4 + (i7 << i6);
            }
            i4 += (E2 & Byte.MAX_VALUE) << i6;
            i6 += 7;
        }
    }
}
