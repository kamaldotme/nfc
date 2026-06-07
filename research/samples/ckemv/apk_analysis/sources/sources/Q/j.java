package q;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements InterfaceC0358b {

    /* renamed from: a, reason: collision with root package name */
    public int f4405a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4406b = new int[16];
    public int[] c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f4407d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public float[] f4408e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f4409f = new int[16];
    public int[] g = new int[16];
    public int h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f4410i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final C0359c f4411j;

    /* renamed from: k, reason: collision with root package name */
    public final v0.i f4412k;

    public j(C0359c c0359c, v0.i iVar) {
        this.f4411j = c0359c;
        this.f4412k = iVar;
        clear();
    }

    @Override // q.InterfaceC0358b
    public final float a(int i3) {
        int i4 = this.h;
        int i5 = this.f4410i;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 == i3) {
                return this.f4408e[i5];
            }
            i5 = this.g[i5];
            if (i5 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // q.InterfaceC0358b
    public final i b(int i3) {
        int i4 = this.h;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f4410i;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 == i3 && i5 != -1) {
                return ((i[]) this.f4412k.f5078e)[this.f4407d[i5]];
            }
            i5 = this.g[i5];
            if (i5 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // q.InterfaceC0358b
    public final float c(i iVar, boolean z3) {
        int[] iArr;
        int i3;
        int n3 = n(iVar);
        if (n3 == -1) {
            return 0.0f;
        }
        int i4 = iVar.f4397b;
        int i5 = i4 % 16;
        int[] iArr2 = this.f4406b;
        int i6 = iArr2[i5];
        if (i6 != -1) {
            if (this.f4407d[i6] == i4) {
                int[] iArr3 = this.c;
                iArr2[i5] = iArr3[i6];
                iArr3[i6] = -1;
            } else {
                while (true) {
                    iArr = this.c;
                    i3 = iArr[i6];
                    if (i3 == -1 || this.f4407d[i3] == i4) {
                        break;
                    }
                    i6 = i3;
                }
                if (i3 != -1 && this.f4407d[i3] == i4) {
                    iArr[i6] = iArr[i3];
                    iArr[i3] = -1;
                }
            }
        }
        float f3 = this.f4408e[n3];
        if (this.f4410i == n3) {
            this.f4410i = this.g[n3];
        }
        this.f4407d[n3] = -1;
        int[] iArr4 = this.f4409f;
        int i7 = iArr4[n3];
        if (i7 != -1) {
            int[] iArr5 = this.g;
            iArr5[i7] = iArr5[n3];
        }
        int i8 = this.g[n3];
        if (i8 != -1) {
            iArr4[i8] = iArr4[n3];
        }
        this.h--;
        iVar.f4403k--;
        if (z3) {
            iVar.b(this.f4411j);
        }
        return f3;
    }

    @Override // q.InterfaceC0358b
    public final void clear() {
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            i b3 = b(i4);
            if (b3 != null) {
                b3.b(this.f4411j);
            }
        }
        for (int i5 = 0; i5 < this.f4405a; i5++) {
            this.f4407d[i5] = -1;
            this.c[i5] = -1;
        }
        for (int i6 = 0; i6 < 16; i6++) {
            this.f4406b[i6] = -1;
        }
        this.h = 0;
        this.f4410i = -1;
    }

    @Override // q.InterfaceC0358b
    public final boolean d(i iVar) {
        return n(iVar) != -1;
    }

    @Override // q.InterfaceC0358b
    public final void e(float f3) {
        int i3 = this.h;
        int i4 = this.f4410i;
        for (int i5 = 0; i5 < i3; i5++) {
            float[] fArr = this.f4408e;
            fArr[i4] = fArr[i4] / f3;
            i4 = this.g[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // q.InterfaceC0358b
    public final void f(i iVar, float f3, boolean z3) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int n3 = n(iVar);
            if (n3 == -1) {
                g(iVar, f3);
                return;
            }
            float[] fArr = this.f4408e;
            float f4 = fArr[n3] + f3;
            fArr[n3] = f4;
            if (f4 <= -0.001f || f4 >= 0.001f) {
                return;
            }
            fArr[n3] = 0.0f;
            c(iVar, z3);
        }
    }

    @Override // q.InterfaceC0358b
    public final void g(i iVar, float f3) {
        if (f3 > -0.001f && f3 < 0.001f) {
            c(iVar, true);
            return;
        }
        int i3 = 0;
        if (this.h == 0) {
            m(0, iVar, f3);
            l(iVar, 0);
            this.f4410i = 0;
            return;
        }
        int n3 = n(iVar);
        if (n3 != -1) {
            this.f4408e[n3] = f3;
            return;
        }
        int i4 = this.h + 1;
        int i5 = this.f4405a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f4407d = Arrays.copyOf(this.f4407d, i6);
            this.f4408e = Arrays.copyOf(this.f4408e, i6);
            this.f4409f = Arrays.copyOf(this.f4409f, i6);
            this.g = Arrays.copyOf(this.g, i6);
            this.c = Arrays.copyOf(this.c, i6);
            for (int i7 = this.f4405a; i7 < i6; i7++) {
                this.f4407d[i7] = -1;
                this.c[i7] = -1;
            }
            this.f4405a = i6;
        }
        int i8 = this.h;
        int i9 = this.f4410i;
        int i10 = -1;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = this.f4407d[i9];
            int i13 = iVar.f4397b;
            if (i12 == i13) {
                this.f4408e[i9] = f3;
                return;
            }
            if (i12 < i13) {
                i10 = i9;
            }
            i9 = this.g[i9];
            if (i9 == -1) {
                break;
            }
        }
        while (true) {
            if (i3 >= this.f4405a) {
                i3 = -1;
                break;
            } else if (this.f4407d[i3] == -1) {
                break;
            } else {
                i3++;
            }
        }
        m(i3, iVar, f3);
        if (i10 != -1) {
            this.f4409f[i3] = i10;
            int[] iArr = this.g;
            iArr[i3] = iArr[i10];
            iArr[i10] = i3;
        } else {
            this.f4409f[i3] = -1;
            if (this.h > 0) {
                this.g[i3] = this.f4410i;
                this.f4410i = i3;
            } else {
                this.g[i3] = -1;
            }
        }
        int i14 = this.g[i3];
        if (i14 != -1) {
            this.f4409f[i14] = i3;
        }
        l(iVar, i3);
    }

    @Override // q.InterfaceC0358b
    public final float h(i iVar) {
        int n3 = n(iVar);
        if (n3 != -1) {
            return this.f4408e[n3];
        }
        return 0.0f;
    }

    @Override // q.InterfaceC0358b
    public final float i(C0359c c0359c, boolean z3) {
        float h = h(c0359c.f4375a);
        c(c0359c.f4375a, z3);
        j jVar = (j) c0359c.f4377d;
        int i3 = jVar.h;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = jVar.f4407d[i5];
            if (i6 != -1) {
                f(((i[]) this.f4412k.f5078e)[i6], jVar.f4408e[i5] * h, z3);
                i4++;
            }
            i5++;
        }
        return h;
    }

    @Override // q.InterfaceC0358b
    public final void j() {
        int i3 = this.h;
        int i4 = this.f4410i;
        for (int i5 = 0; i5 < i3; i5++) {
            float[] fArr = this.f4408e;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.g[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // q.InterfaceC0358b
    public final int k() {
        return this.h;
    }

    public final void l(i iVar, int i3) {
        int[] iArr;
        int i4 = iVar.f4397b % 16;
        int[] iArr2 = this.f4406b;
        int i5 = iArr2[i4];
        if (i5 == -1) {
            iArr2[i4] = i3;
        } else {
            while (true) {
                iArr = this.c;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    break;
                } else {
                    i5 = i6;
                }
            }
            iArr[i5] = i3;
        }
        this.c[i3] = -1;
    }

    public final void m(int i3, i iVar, float f3) {
        this.f4407d[i3] = iVar.f4397b;
        this.f4408e[i3] = f3;
        this.f4409f[i3] = -1;
        this.g[i3] = -1;
        iVar.a(this.f4411j);
        iVar.f4403k++;
        this.h++;
    }

    public final int n(i iVar) {
        if (this.h == 0) {
            return -1;
        }
        int i3 = iVar.f4397b;
        int i4 = this.f4406b[i3 % 16];
        if (i4 == -1) {
            return -1;
        }
        if (this.f4407d[i4] == i3) {
            return i4;
        }
        do {
            i4 = this.c[i4];
            if (i4 == -1) {
                break;
            }
        } while (this.f4407d[i4] != i3);
        if (i4 != -1 && this.f4407d[i4] == i3) {
            return i4;
        }
        return -1;
    }

    public final String toString() {
        String str = hashCode() + " { ";
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            i b3 = b(i4);
            if (b3 != null) {
                String str2 = str + b3 + " = " + a(i4) + " ";
                int n3 = n(b3);
                String h = X.d.h(str2, "[p: ");
                int i5 = this.f4409f[n3];
                v0.i iVar = this.f4412k;
                String h3 = X.d.h(i5 != -1 ? h + ((i[]) iVar.f5078e)[this.f4407d[this.f4409f[n3]]] : X.d.h(h, "none"), ", n: ");
                str = X.d.h(this.g[n3] != -1 ? h3 + ((i[]) iVar.f5078e)[this.f4407d[this.g[n3]]] : X.d.h(h3, "none"), "]");
            }
        }
        return X.d.h(str, " }");
    }
}
