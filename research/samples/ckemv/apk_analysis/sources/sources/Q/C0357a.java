package q;

import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357a implements InterfaceC0358b {

    /* renamed from: b, reason: collision with root package name */
    public final C0359c f4369b;
    public final v0.i c;

    /* renamed from: a, reason: collision with root package name */
    public int f4368a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4370d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f4371e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f4372f = new int[8];
    public float[] g = new float[8];
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f4373i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4374j = false;

    public C0357a(C0359c c0359c, v0.i iVar) {
        this.f4369b = c0359c;
        this.c = iVar;
    }

    @Override // q.InterfaceC0358b
    public final float a(int i3) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f4368a; i5++) {
            if (i5 == i3) {
                return this.g[i4];
            }
            i4 = this.f4372f[i4];
        }
        return 0.0f;
    }

    @Override // q.InterfaceC0358b
    public final i b(int i3) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f4368a; i5++) {
            if (i5 == i3) {
                return ((i[]) this.c.f5078e)[this.f4371e[i4]];
            }
            i4 = this.f4372f[i4];
        }
        return null;
    }

    @Override // q.InterfaceC0358b
    public final float c(i iVar, boolean z3) {
        int i3 = this.h;
        if (i3 == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i5 = -1;
        while (i3 != -1 && i4 < this.f4368a) {
            if (this.f4371e[i3] == iVar.f4397b) {
                if (i3 == this.h) {
                    this.h = this.f4372f[i3];
                } else {
                    int[] iArr = this.f4372f;
                    iArr[i5] = iArr[i3];
                }
                if (z3) {
                    iVar.b(this.f4369b);
                }
                iVar.f4403k--;
                this.f4368a--;
                this.f4371e[i3] = -1;
                if (this.f4374j) {
                    this.f4373i = i3;
                }
                return this.g[i3];
            }
            i4++;
            i5 = i3;
            i3 = this.f4372f[i3];
        }
        return 0.0f;
    }

    @Override // q.InterfaceC0358b
    public final void clear() {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f4368a; i4++) {
            i iVar = ((i[]) this.c.f5078e)[this.f4371e[i3]];
            if (iVar != null) {
                iVar.b(this.f4369b);
            }
            i3 = this.f4372f[i3];
        }
        this.h = -1;
        this.f4373i = -1;
        this.f4374j = false;
        this.f4368a = 0;
    }

    @Override // q.InterfaceC0358b
    public final boolean d(i iVar) {
        int i3 = this.h;
        if (i3 == -1) {
            return false;
        }
        for (int i4 = 0; i3 != -1 && i4 < this.f4368a; i4++) {
            if (this.f4371e[i3] == iVar.f4397b) {
                return true;
            }
            i3 = this.f4372f[i3];
        }
        return false;
    }

    @Override // q.InterfaceC0358b
    public final void e(float f3) {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f4368a; i4++) {
            float[] fArr = this.g;
            fArr[i3] = fArr[i3] / f3;
            i3 = this.f4372f[i3];
        }
    }

    @Override // q.InterfaceC0358b
    public final void f(i iVar, float f3, boolean z3) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i3 = this.h;
            C0359c c0359c = this.f4369b;
            if (i3 == -1) {
                this.h = 0;
                this.g[0] = f3;
                this.f4371e[0] = iVar.f4397b;
                this.f4372f[0] = -1;
                iVar.f4403k++;
                iVar.a(c0359c);
                this.f4368a++;
                if (this.f4374j) {
                    return;
                }
                int i4 = this.f4373i + 1;
                this.f4373i = i4;
                int[] iArr = this.f4371e;
                if (i4 >= iArr.length) {
                    this.f4374j = true;
                    this.f4373i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i6 = 0; i3 != -1 && i6 < this.f4368a; i6++) {
                int i7 = this.f4371e[i3];
                int i8 = iVar.f4397b;
                if (i7 == i8) {
                    float[] fArr = this.g;
                    float f4 = fArr[i3] + f3;
                    if (f4 > -0.001f && f4 < 0.001f) {
                        f4 = 0.0f;
                    }
                    fArr[i3] = f4;
                    if (f4 == 0.0f) {
                        if (i3 == this.h) {
                            this.h = this.f4372f[i3];
                        } else {
                            int[] iArr2 = this.f4372f;
                            iArr2[i5] = iArr2[i3];
                        }
                        if (z3) {
                            iVar.b(c0359c);
                        }
                        if (this.f4374j) {
                            this.f4373i = i3;
                        }
                        iVar.f4403k--;
                        this.f4368a--;
                        return;
                    }
                    return;
                }
                if (i7 < i8) {
                    i5 = i3;
                }
                i3 = this.f4372f[i3];
            }
            int i9 = this.f4373i;
            int i10 = i9 + 1;
            if (this.f4374j) {
                int[] iArr3 = this.f4371e;
                if (iArr3[i9] != -1) {
                    i9 = iArr3.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr4 = this.f4371e;
            if (i9 >= iArr4.length && this.f4368a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f4371e;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        i9 = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f4371e;
            if (i9 >= iArr6.length) {
                i9 = iArr6.length;
                int i12 = this.f4370d * 2;
                this.f4370d = i12;
                this.f4374j = false;
                this.f4373i = i9 - 1;
                this.g = Arrays.copyOf(this.g, i12);
                this.f4371e = Arrays.copyOf(this.f4371e, this.f4370d);
                this.f4372f = Arrays.copyOf(this.f4372f, this.f4370d);
            }
            this.f4371e[i9] = iVar.f4397b;
            this.g[i9] = f3;
            if (i5 != -1) {
                int[] iArr7 = this.f4372f;
                iArr7[i9] = iArr7[i5];
                iArr7[i5] = i9;
            } else {
                this.f4372f[i9] = this.h;
                this.h = i9;
            }
            iVar.f4403k++;
            iVar.a(c0359c);
            this.f4368a++;
            if (!this.f4374j) {
                this.f4373i++;
            }
            int i13 = this.f4373i;
            int[] iArr8 = this.f4371e;
            if (i13 >= iArr8.length) {
                this.f4374j = true;
                this.f4373i = iArr8.length - 1;
            }
        }
    }

    @Override // q.InterfaceC0358b
    public final void g(i iVar, float f3) {
        if (f3 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i3 = this.h;
        C0359c c0359c = this.f4369b;
        if (i3 == -1) {
            this.h = 0;
            this.g[0] = f3;
            this.f4371e[0] = iVar.f4397b;
            this.f4372f[0] = -1;
            iVar.f4403k++;
            iVar.a(c0359c);
            this.f4368a++;
            if (this.f4374j) {
                return;
            }
            int i4 = this.f4373i + 1;
            this.f4373i = i4;
            int[] iArr = this.f4371e;
            if (i4 >= iArr.length) {
                this.f4374j = true;
                this.f4373i = iArr.length - 1;
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i6 = 0; i3 != -1 && i6 < this.f4368a; i6++) {
            int i7 = this.f4371e[i3];
            int i8 = iVar.f4397b;
            if (i7 == i8) {
                this.g[i3] = f3;
                return;
            }
            if (i7 < i8) {
                i5 = i3;
            }
            i3 = this.f4372f[i3];
        }
        int i9 = this.f4373i;
        int i10 = i9 + 1;
        if (this.f4374j) {
            int[] iArr2 = this.f4371e;
            if (iArr2[i9] != -1) {
                i9 = iArr2.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr3 = this.f4371e;
        if (i9 >= iArr3.length && this.f4368a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f4371e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    i9 = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f4371e;
        if (i9 >= iArr5.length) {
            i9 = iArr5.length;
            int i12 = this.f4370d * 2;
            this.f4370d = i12;
            this.f4374j = false;
            this.f4373i = i9 - 1;
            this.g = Arrays.copyOf(this.g, i12);
            this.f4371e = Arrays.copyOf(this.f4371e, this.f4370d);
            this.f4372f = Arrays.copyOf(this.f4372f, this.f4370d);
        }
        this.f4371e[i9] = iVar.f4397b;
        this.g[i9] = f3;
        if (i5 != -1) {
            int[] iArr6 = this.f4372f;
            iArr6[i9] = iArr6[i5];
            iArr6[i5] = i9;
        } else {
            this.f4372f[i9] = this.h;
            this.h = i9;
        }
        iVar.f4403k++;
        iVar.a(c0359c);
        int i13 = this.f4368a + 1;
        this.f4368a = i13;
        if (!this.f4374j) {
            this.f4373i++;
        }
        int[] iArr7 = this.f4371e;
        if (i13 >= iArr7.length) {
            this.f4374j = true;
        }
        if (this.f4373i >= iArr7.length) {
            this.f4374j = true;
            this.f4373i = iArr7.length - 1;
        }
    }

    @Override // q.InterfaceC0358b
    public final float h(i iVar) {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f4368a; i4++) {
            if (this.f4371e[i3] == iVar.f4397b) {
                return this.g[i3];
            }
            i3 = this.f4372f[i3];
        }
        return 0.0f;
    }

    @Override // q.InterfaceC0358b
    public final float i(C0359c c0359c, boolean z3) {
        float h = h(c0359c.f4375a);
        c(c0359c.f4375a, z3);
        InterfaceC0358b interfaceC0358b = c0359c.f4377d;
        int k2 = interfaceC0358b.k();
        for (int i3 = 0; i3 < k2; i3++) {
            i b3 = interfaceC0358b.b(i3);
            f(b3, interfaceC0358b.h(b3) * h, z3);
        }
        return h;
    }

    @Override // q.InterfaceC0358b
    public final void j() {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f4368a; i4++) {
            float[] fArr = this.g;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f4372f[i3];
        }
    }

    @Override // q.InterfaceC0358b
    public final int k() {
        return this.f4368a;
    }

    public final String toString() {
        int i3 = this.h;
        String str = "";
        for (int i4 = 0; i3 != -1 && i4 < this.f4368a; i4++) {
            str = (X.d.h(str, " -> ") + this.g[i3] + " : ") + ((i[]) this.c.f5078e)[this.f4371e[i3]];
            i3 = this.f4372f[i3];
        }
        return str;
    }
}
