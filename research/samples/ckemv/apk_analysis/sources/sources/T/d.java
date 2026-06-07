package t;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public float f4735A;

    /* renamed from: B, reason: collision with root package name */
    public String f4736B;

    /* renamed from: C, reason: collision with root package name */
    public int f4737C;
    public float D;

    /* renamed from: E, reason: collision with root package name */
    public float f4738E;

    /* renamed from: F, reason: collision with root package name */
    public int f4739F;

    /* renamed from: G, reason: collision with root package name */
    public int f4740G;

    /* renamed from: H, reason: collision with root package name */
    public int f4741H;

    /* renamed from: I, reason: collision with root package name */
    public int f4742I;

    /* renamed from: J, reason: collision with root package name */
    public int f4743J;

    /* renamed from: K, reason: collision with root package name */
    public int f4744K;

    /* renamed from: L, reason: collision with root package name */
    public int f4745L;

    /* renamed from: M, reason: collision with root package name */
    public int f4746M;

    /* renamed from: N, reason: collision with root package name */
    public float f4747N;

    /* renamed from: O, reason: collision with root package name */
    public float f4748O;

    /* renamed from: P, reason: collision with root package name */
    public int f4749P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4750Q;

    /* renamed from: R, reason: collision with root package name */
    public int f4751R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f4752S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4753T;

    /* renamed from: U, reason: collision with root package name */
    public String f4754U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4755V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4756W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4757X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f4758Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f4759Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4760a;

    /* renamed from: a0, reason: collision with root package name */
    public int f4761a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4762b;

    /* renamed from: b0, reason: collision with root package name */
    public int f4763b0;
    public float c;

    /* renamed from: c0, reason: collision with root package name */
    public int f4764c0;

    /* renamed from: d, reason: collision with root package name */
    public int f4765d;

    /* renamed from: d0, reason: collision with root package name */
    public int f4766d0;

    /* renamed from: e, reason: collision with root package name */
    public int f4767e;

    /* renamed from: e0, reason: collision with root package name */
    public int f4768e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4769f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4770f0;
    public int g;

    /* renamed from: g0, reason: collision with root package name */
    public float f4771g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4772h0;

    /* renamed from: i, reason: collision with root package name */
    public int f4773i;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4774j;

    /* renamed from: j0, reason: collision with root package name */
    public float f4775j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4776k;

    /* renamed from: k0, reason: collision with root package name */
    public r.d f4777k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4778l;

    /* renamed from: m, reason: collision with root package name */
    public int f4779m;

    /* renamed from: n, reason: collision with root package name */
    public int f4780n;

    /* renamed from: o, reason: collision with root package name */
    public float f4781o;

    /* renamed from: p, reason: collision with root package name */
    public int f4782p;

    /* renamed from: q, reason: collision with root package name */
    public int f4783q;

    /* renamed from: r, reason: collision with root package name */
    public int f4784r;

    /* renamed from: s, reason: collision with root package name */
    public int f4785s;

    /* renamed from: t, reason: collision with root package name */
    public int f4786t;

    /* renamed from: u, reason: collision with root package name */
    public int f4787u;

    /* renamed from: v, reason: collision with root package name */
    public int f4788v;

    /* renamed from: w, reason: collision with root package name */
    public int f4789w;

    /* renamed from: x, reason: collision with root package name */
    public int f4790x;

    /* renamed from: y, reason: collision with root package name */
    public int f4791y;

    /* renamed from: z, reason: collision with root package name */
    public float f4792z;

    public final void a() {
        this.f4758Y = false;
        this.f4755V = true;
        this.f4756W = true;
        int i3 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i3 == -2 && this.f4752S) {
            this.f4755V = false;
            if (this.f4741H == 0) {
                this.f4741H = 1;
            }
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i4 == -2 && this.f4753T) {
            this.f4756W = false;
            if (this.f4742I == 0) {
                this.f4742I = 1;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f4755V = false;
            if (i3 == 0 && this.f4741H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4752S = true;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f4756W = false;
            if (i4 == 0 && this.f4742I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4753T = true;
            }
        }
        if (this.c == -1.0f && this.f4760a == -1 && this.f4762b == -1) {
            return;
        }
        this.f4758Y = true;
        this.f4755V = true;
        this.f4756W = true;
        if (!(this.f4777k0 instanceof r.h)) {
            this.f4777k0 = new r.h();
        }
        ((r.h) this.f4777k0).B(this.f4751R);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i9 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i3);
        boolean z3 = false;
        boolean z4 = 1 == getLayoutDirection();
        this.f4764c0 = -1;
        this.f4766d0 = -1;
        this.f4761a0 = -1;
        this.f4763b0 = -1;
        this.f4768e0 = this.f4786t;
        this.f4770f0 = this.f4788v;
        float f3 = this.f4792z;
        this.f4771g0 = f3;
        int i10 = this.f4760a;
        this.f4772h0 = i10;
        int i11 = this.f4762b;
        this.i0 = i11;
        float f4 = this.c;
        this.f4775j0 = f4;
        if (z4) {
            int i12 = this.f4782p;
            if (i12 != -1) {
                this.f4764c0 = i12;
            } else {
                int i13 = this.f4783q;
                if (i13 != -1) {
                    this.f4766d0 = i13;
                }
                i4 = this.f4784r;
                if (i4 != -1) {
                    this.f4763b0 = i4;
                    z3 = true;
                }
                i5 = this.f4785s;
                if (i5 != -1) {
                    this.f4761a0 = i5;
                    z3 = true;
                }
                i6 = this.f4790x;
                if (i6 != -1) {
                    this.f4770f0 = i6;
                }
                i7 = this.f4791y;
                if (i7 != -1) {
                    this.f4768e0 = i7;
                }
                if (z3) {
                    this.f4771g0 = 1.0f - f3;
                }
                if (this.f4758Y && this.f4751R == 1) {
                    if (f4 == -1.0f) {
                        this.f4775j0 = 1.0f - f4;
                        this.f4772h0 = -1;
                        this.i0 = -1;
                    } else if (i10 != -1) {
                        this.i0 = i10;
                        this.f4772h0 = -1;
                        this.f4775j0 = -1.0f;
                    } else if (i11 != -1) {
                        this.f4772h0 = i11;
                        this.i0 = -1;
                        this.f4775j0 = -1.0f;
                    }
                }
            }
            z3 = true;
            i4 = this.f4784r;
            if (i4 != -1) {
            }
            i5 = this.f4785s;
            if (i5 != -1) {
            }
            i6 = this.f4790x;
            if (i6 != -1) {
            }
            i7 = this.f4791y;
            if (i7 != -1) {
            }
            if (z3) {
            }
            if (this.f4758Y) {
                if (f4 == -1.0f) {
                }
            }
        } else {
            int i14 = this.f4782p;
            if (i14 != -1) {
                this.f4763b0 = i14;
            }
            int i15 = this.f4783q;
            if (i15 != -1) {
                this.f4761a0 = i15;
            }
            int i16 = this.f4784r;
            if (i16 != -1) {
                this.f4764c0 = i16;
            }
            int i17 = this.f4785s;
            if (i17 != -1) {
                this.f4766d0 = i17;
            }
            int i18 = this.f4790x;
            if (i18 != -1) {
                this.f4768e0 = i18;
            }
            int i19 = this.f4791y;
            if (i19 != -1) {
                this.f4770f0 = i19;
            }
        }
        if (this.f4784r == -1 && this.f4785s == -1 && this.f4783q == -1 && this.f4782p == -1) {
            int i20 = this.f4769f;
            if (i20 != -1) {
                this.f4764c0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                }
            } else {
                int i21 = this.g;
                if (i21 != -1) {
                    this.f4766d0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                    }
                }
            }
            int i22 = this.f4765d;
            if (i22 != -1) {
                this.f4761a0 = i22;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
                return;
            }
            int i23 = this.f4767e;
            if (i23 != -1) {
                this.f4763b0 = i23;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
            }
        }
    }
}
