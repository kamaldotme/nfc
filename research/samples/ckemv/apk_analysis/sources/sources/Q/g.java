package q;

import O0.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends C0359c {

    /* renamed from: f, reason: collision with root package name */
    public i[] f4393f;
    public i[] g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public f f4394i;

    @Override // q.C0359c
    public final i d(boolean[] zArr) {
        int i3 = -1;
        for (int i4 = 0; i4 < this.h; i4++) {
            i[] iVarArr = this.f4393f;
            i iVar = iVarArr[i4];
            if (!zArr[iVar.f4397b]) {
                f fVar = this.f4394i;
                fVar.f4392b = iVar;
                int i5 = 8;
                if (i3 == -1) {
                    while (i5 >= 0) {
                        float f3 = fVar.f4392b.h[i5];
                        if (f3 <= 0.0f) {
                            if (f3 < 0.0f) {
                                i3 = i4;
                                break;
                            }
                            i5--;
                        }
                    }
                } else {
                    i iVar2 = iVarArr[i3];
                    while (true) {
                        if (i5 >= 0) {
                            float f4 = iVar2.h[i5];
                            float f5 = fVar.f4392b.h[i5];
                            if (f5 == f4) {
                                i5--;
                            } else if (f5 >= f4) {
                            }
                        }
                    }
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        return this.f4393f[i3];
    }

    @Override // q.C0359c
    public final void h(C0359c c0359c, boolean z3) {
        i iVar = c0359c.f4375a;
        if (iVar == null) {
            return;
        }
        InterfaceC0358b interfaceC0358b = c0359c.f4377d;
        int k2 = interfaceC0358b.k();
        for (int i3 = 0; i3 < k2; i3++) {
            i b3 = interfaceC0358b.b(i3);
            float a3 = interfaceC0358b.a(i3);
            f fVar = this.f4394i;
            fVar.f4392b = b3;
            boolean z4 = b3.f4396a;
            float[] fArr = iVar.h;
            if (z4) {
                boolean z5 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = fVar.f4392b.h;
                    float f3 = (fArr[i4] * a3) + fArr2[i4];
                    fArr2[i4] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        fVar.f4392b.h[i4] = 0.0f;
                    } else {
                        z5 = false;
                    }
                }
                if (z5) {
                    fVar.c.j(fVar.f4392b);
                }
            } else {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f4 = fArr[i5];
                    if (f4 != 0.0f) {
                        float f5 = f4 * a3;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        fVar.f4392b.h[i5] = f5;
                    } else {
                        fVar.f4392b.h[i5] = 0.0f;
                    }
                }
                i(b3);
            }
            this.f4376b = (c0359c.f4376b * a3) + this.f4376b;
        }
        j(iVar);
    }

    public final void i(i iVar) {
        int i3;
        int i4 = this.h + 1;
        i[] iVarArr = this.f4393f;
        if (i4 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f4393f = iVarArr2;
            this.g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f4393f;
        int i5 = this.h;
        iVarArr3[i5] = iVar;
        int i6 = i5 + 1;
        this.h = i6;
        if (i6 > 1 && iVarArr3[i5].f4397b > iVar.f4397b) {
            int i7 = 0;
            while (true) {
                i3 = this.h;
                if (i7 >= i3) {
                    break;
                }
                this.g[i7] = this.f4393f[i7];
                i7++;
            }
            Arrays.sort(this.g, 0, i3, new l(3));
            for (int i8 = 0; i8 < this.h; i8++) {
                this.f4393f[i8] = this.g[i8];
            }
        }
        iVar.f4396a = true;
        iVar.a(this);
    }

    public final void j(i iVar) {
        int i3 = 0;
        while (i3 < this.h) {
            if (this.f4393f[i3] == iVar) {
                while (true) {
                    int i4 = this.h;
                    if (i3 >= i4 - 1) {
                        this.h = i4 - 1;
                        iVar.f4396a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f4393f;
                        int i5 = i3 + 1;
                        iVarArr[i3] = iVarArr[i5];
                        i3 = i5;
                    }
                }
            } else {
                i3++;
            }
        }
    }

    @Override // q.C0359c
    public final String toString() {
        String str = " goal -> (" + this.f4376b + ") : ";
        for (int i3 = 0; i3 < this.h; i3++) {
            i iVar = this.f4393f[i3];
            f fVar = this.f4394i;
            fVar.f4392b = iVar;
            str = str + fVar + " ";
        }
        return str;
    }
}
