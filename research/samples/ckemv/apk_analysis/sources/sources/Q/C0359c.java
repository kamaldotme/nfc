package q;

import java.util.ArrayList;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0359c {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0358b f4377d;

    /* renamed from: a, reason: collision with root package name */
    public i f4375a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f4376b = 0.0f;
    public ArrayList c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4378e = false;

    public C0359c(v0.i iVar) {
        this.f4377d = new C0357a(this, iVar);
    }

    public final void a(C0361e c0361e, int i3) {
        this.f4377d.g(c0361e.i(i3), 1.0f);
        this.f4377d.g(c0361e.i(i3), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i3) {
        boolean z3;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            } else {
                z3 = false;
            }
            this.f4376b = i3;
            if (z3) {
                this.f4377d.g(iVar, 1.0f);
                this.f4377d.g(iVar2, -1.0f);
                this.f4377d.g(iVar3, -1.0f);
                return;
            }
        }
        this.f4377d.g(iVar, -1.0f);
        this.f4377d.g(iVar2, 1.0f);
        this.f4377d.g(iVar3, 1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i3) {
        boolean z3;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            } else {
                z3 = false;
            }
            this.f4376b = i3;
            if (z3) {
                this.f4377d.g(iVar, 1.0f);
                this.f4377d.g(iVar2, -1.0f);
                this.f4377d.g(iVar3, 1.0f);
                return;
            }
        }
        this.f4377d.g(iVar, -1.0f);
        this.f4377d.g(iVar2, 1.0f);
        this.f4377d.g(iVar3, -1.0f);
    }

    public i d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final i e(boolean[] zArr, i iVar) {
        int i3;
        int k2 = this.f4377d.k();
        i iVar2 = null;
        float f3 = 0.0f;
        for (int i4 = 0; i4 < k2; i4++) {
            float a3 = this.f4377d.a(i4);
            if (a3 < 0.0f) {
                i b3 = this.f4377d.b(i4);
                if ((zArr == null || !zArr[b3.f4397b]) && b3 != iVar && (((i3 = b3.f4404l) == 3 || i3 == 4) && a3 < f3)) {
                    f3 = a3;
                    iVar2 = b3;
                }
            }
        }
        return iVar2;
    }

    public final void f(i iVar) {
        i iVar2 = this.f4375a;
        if (iVar2 != null) {
            this.f4377d.g(iVar2, -1.0f);
            this.f4375a = null;
        }
        float c = this.f4377d.c(iVar, true) * (-1.0f);
        this.f4375a = iVar;
        if (c == 1.0f) {
            return;
        }
        this.f4376b /= c;
        this.f4377d.e(c);
    }

    public final void g(i iVar, boolean z3) {
        if (iVar.f4400f) {
            float h = this.f4377d.h(iVar);
            this.f4376b = (iVar.f4399e * h) + this.f4376b;
            this.f4377d.c(iVar, z3);
            if (z3) {
                iVar.b(this);
            }
        }
    }

    public void h(C0359c c0359c, boolean z3) {
        float i3 = this.f4377d.i(c0359c, z3);
        this.f4376b = (c0359c.f4376b * i3) + this.f4376b;
        if (z3) {
            c0359c.f4375a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z3;
        String h = X.d.h(this.f4375a == null ? "0" : "" + this.f4375a, " = ");
        if (this.f4376b != 0.0f) {
            h = h + this.f4376b;
            z3 = true;
        } else {
            z3 = false;
        }
        int k2 = this.f4377d.k();
        for (int i3 = 0; i3 < k2; i3++) {
            i b3 = this.f4377d.b(i3);
            if (b3 != null) {
                float a3 = this.f4377d.a(i3);
                if (a3 != 0.0f) {
                    String iVar = b3.toString();
                    if (!z3) {
                        if (a3 < 0.0f) {
                            h = X.d.h(h, "- ");
                            a3 *= -1.0f;
                        }
                        h = a3 == 1.0f ? X.d.h(h, iVar) : h + a3 + " " + iVar;
                        z3 = true;
                    } else if (a3 > 0.0f) {
                        h = X.d.h(h, " + ");
                        if (a3 == 1.0f) {
                        }
                        z3 = true;
                    } else {
                        h = X.d.h(h, " - ");
                        a3 *= -1.0f;
                        if (a3 == 1.0f) {
                        }
                        z3 = true;
                    }
                }
            }
        }
        return !z3 ? X.d.h(h, "0.0") : h;
    }
}
