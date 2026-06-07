package n;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336e implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f4140f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4141b = false;
    public long[] c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4142d;

    /* renamed from: e, reason: collision with root package name */
    public int f4143e;

    public C0336e() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.c = new long[i6];
        this.f4142d = new Object[i6];
    }

    public final void a() {
        int i3 = this.f4143e;
        Object[] objArr = this.f4142d;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f4143e = 0;
        this.f4141b = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0336e clone() {
        try {
            C0336e c0336e = (C0336e) super.clone();
            c0336e.c = (long[]) this.c.clone();
            c0336e.f4142d = (Object[]) this.f4142d.clone();
            return c0336e;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final void c() {
        int i3 = this.f4143e;
        long[] jArr = this.c;
        Object[] objArr = this.f4142d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f4140f) {
                if (i5 != i4) {
                    jArr[i4] = jArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f4141b = false;
        this.f4143e = i4;
    }

    public final Object d(long j3, Long l3) {
        Object obj;
        int b3 = AbstractC0335d.b(this.c, this.f4143e, j3);
        return (b3 < 0 || (obj = this.f4142d[b3]) == f4140f) ? l3 : obj;
    }

    public final void e(long j3, Object obj) {
        int b3 = AbstractC0335d.b(this.c, this.f4143e, j3);
        if (b3 >= 0) {
            this.f4142d[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.f4143e;
        if (i3 < i4) {
            Object[] objArr = this.f4142d;
            if (objArr[i3] == f4140f) {
                this.c[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f4141b && i4 >= this.c.length) {
            c();
            i3 = ~AbstractC0335d.b(this.c, this.f4143e, j3);
        }
        int i5 = this.f4143e;
        if (i5 >= this.c.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArr = new long[i9];
            Object[] objArr2 = new Object[i9];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4142d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.f4142d = objArr2;
        }
        int i10 = this.f4143e - i3;
        if (i10 != 0) {
            long[] jArr3 = this.c;
            int i11 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i11, i10);
            Object[] objArr4 = this.f4142d;
            System.arraycopy(objArr4, i3, objArr4, i11, this.f4143e - i3);
        }
        this.c[i3] = j3;
        this.f4142d[i3] = obj;
        this.f4143e++;
    }

    public final int f() {
        if (this.f4141b) {
            c();
        }
        return this.f4143e;
    }

    public final Object g(int i3) {
        if (this.f4141b) {
            c();
        }
        return this.f4142d[i3];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4143e * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f4143e; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.f4141b) {
                c();
            }
            sb.append(this.c[i3]);
            sb.append('=');
            Object g = g(i3);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
