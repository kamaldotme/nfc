package G1;

import j1.C0234d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f232a;

    /* renamed from: b, reason: collision with root package name */
    public final Cloneable f233b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f234d;

    public a(p1.b bVar) {
        int i3 = bVar.c;
        if (i3 >= 21 && (i3 & 3) == 1) {
            this.f233b = bVar;
            return;
        }
        throw C0234d.a();
    }

    public int a(int i3, int i4, int i5) {
        boolean z3 = this.f232a;
        p1.b bVar = (p1.b) this.f233b;
        return z3 ? bVar.b(i4, i3) : bVar.b(i3, i4) ? (i5 << 1) | 1 : i5 << 1;
    }

    public int[] b() {
        synchronized (this) {
            try {
                if (!this.f232a) {
                    return null;
                }
                long[] jArr = (long[]) this.f233b;
                int length = jArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    int i6 = 1;
                    boolean z3 = jArr[i3] > 0;
                    boolean[] zArr = (boolean[]) this.c;
                    if (z3 != zArr[i4]) {
                        int[] iArr = (int[]) this.f234d;
                        if (!z3) {
                            i6 = 2;
                        }
                        iArr[i4] = i6;
                    } else {
                        ((int[]) this.f234d)[i4] = 0;
                    }
                    zArr[i4] = z3;
                    i3++;
                    i4 = i5;
                }
                this.f232a = false;
                return (int[]) ((int[]) this.f234d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public f c() {
        f fVar = (f) this.f234d;
        if (fVar != null) {
            return fVar;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 6; i5++) {
            i4 = a(i5, 8, i4);
        }
        int a3 = a(8, 7, a(8, 8, a(7, 8, i4)));
        for (int i6 = 5; i6 >= 0; i6--) {
            a3 = a(8, i6, a3);
        }
        int i7 = ((p1.b) this.f233b).c;
        int i8 = i7 - 7;
        for (int i9 = i7 - 1; i9 >= i8; i9--) {
            i3 = a(8, i9, i3);
        }
        for (int i10 = i7 - 8; i10 < i7; i10++) {
            i3 = a(i10, 8, i3);
        }
        f a4 = f.a(a3, i3);
        if (a4 == null) {
            a4 = f.a(a3 ^ 21522, i3 ^ 21522);
        }
        this.f234d = a4;
        if (a4 != null) {
            return a4;
        }
        throw C0234d.a();
    }

    public i d() {
        i iVar = (i) this.c;
        if (iVar != null) {
            return iVar;
        }
        int i3 = ((p1.b) this.f233b).c;
        int i4 = (i3 - 17) / 4;
        if (i4 <= 6) {
            return i.c(i4);
        }
        int i5 = i3 - 11;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 5; i8 >= 0; i8--) {
            for (int i9 = i3 - 9; i9 >= i5; i9--) {
                i7 = a(i9, i8, i7);
            }
        }
        i b3 = i.b(i7);
        if (b3 != null && (b3.f253a * 4) + 17 == i3) {
            this.c = b3;
            return b3;
        }
        for (int i10 = 5; i10 >= 0; i10--) {
            for (int i11 = i3 - 9; i11 >= i5; i11--) {
                i6 = a(i10, i11, i6);
            }
        }
        i b4 = i.b(i6);
        if (b4 == null || (b4.f253a * 4) + 17 != i3) {
            throw C0234d.a();
        }
        this.c = b4;
        return b4;
    }

    public void e() {
        if (((f) this.f234d) == null) {
            return;
        }
        int i3 = q.h.b(8)[((f) this.f234d).f241b];
        p1.b bVar = (p1.b) this.f233b;
        int i4 = bVar.c;
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                if (e.a(i3, i5, i6)) {
                    bVar.a(i6, i5);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [long[], java.lang.Cloneable] */
    public a(int i3) {
        this.f233b = new long[i3];
        this.c = new boolean[i3];
        this.f234d = new int[i3];
    }
}
