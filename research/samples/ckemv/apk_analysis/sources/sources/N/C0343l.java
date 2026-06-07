package n;

/* renamed from: n.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343l implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f4161e = new Object();

    /* renamed from: b, reason: collision with root package name */
    public int[] f4162b;
    public Object[] c;

    /* renamed from: d, reason: collision with root package name */
    public int f4163d;

    public C0343l() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f4162b = new int[i6];
        this.c = new Object[i6];
    }

    public final void a(int i3, Object obj) {
        int i4 = this.f4163d;
        if (i4 != 0 && i3 <= this.f4162b[i4 - 1]) {
            d(i3, obj);
            return;
        }
        if (i4 >= this.f4162b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr = new Object[i8];
            int[] iArr2 = this.f4162b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f4162b = iArr;
            this.c = objArr;
        }
        this.f4162b[i4] = i3;
        this.c[i4] = obj;
        this.f4163d = i4 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0343l clone() {
        try {
            C0343l c0343l = (C0343l) super.clone();
            c0343l.f4162b = (int[]) this.f4162b.clone();
            c0343l.c = (Object[]) this.c.clone();
            return c0343l;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final Object c(int i3, Integer num) {
        Object obj;
        int a3 = AbstractC0335d.a(this.f4163d, i3, this.f4162b);
        return (a3 < 0 || (obj = this.c[a3]) == f4161e) ? num : obj;
    }

    public final void d(int i3, Object obj) {
        int a3 = AbstractC0335d.a(this.f4163d, i3, this.f4162b);
        if (a3 >= 0) {
            this.c[a3] = obj;
            return;
        }
        int i4 = ~a3;
        int i5 = this.f4163d;
        if (i4 < i5) {
            Object[] objArr = this.c;
            if (objArr[i4] == f4161e) {
                this.f4162b[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f4162b.length) {
            int i6 = (i5 + 1) * 4;
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
            int i9 = i6 / 4;
            int[] iArr = new int[i9];
            Object[] objArr2 = new Object[i9];
            int[] iArr2 = this.f4162b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4162b = iArr;
            this.c = objArr2;
        }
        int i10 = this.f4163d - i4;
        if (i10 != 0) {
            int[] iArr3 = this.f4162b;
            int i11 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i11, i10);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i4, objArr4, i11, this.f4163d - i4);
        }
        this.f4162b[i4] = i3;
        this.c[i4] = obj;
        this.f4163d++;
    }

    public final String toString() {
        int i3 = this.f4163d;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f4163d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4162b[i4]);
            sb.append('=');
            Object obj = this.c[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
