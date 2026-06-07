package q1;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.C0238h;
import j1.C0244n;
import p1.b;
import q.h;
import r.c;
import r.d;
import r.g;
import s.C0372b;
import t.p;
import v0.f;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363a {

    /* renamed from: a, reason: collision with root package name */
    public int f4419a;

    /* renamed from: b, reason: collision with root package name */
    public int f4420b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f4421d;

    /* renamed from: e, reason: collision with root package name */
    public int f4422e;

    /* renamed from: f, reason: collision with root package name */
    public int f4423f;
    public final Object g;

    public C0363a(b bVar, int i3, int i4, int i5) {
        this.g = bVar;
        int i6 = bVar.c;
        this.f4419a = i6;
        int i7 = bVar.f4328b;
        this.f4420b = i7;
        int i8 = i3 / 2;
        int i9 = i4 - i8;
        this.c = i9;
        int i10 = i4 + i8;
        this.f4421d = i10;
        int i11 = i5 - i8;
        this.f4423f = i11;
        int i12 = i5 + i8;
        this.f4422e = i12;
        if (i11 < 0 || i9 < 0 || i12 >= i6 || i10 >= i7) {
            throw C0238h.f3489d;
        }
    }

    public boolean a(int i3, int i4, int i5, boolean z3) {
        b bVar = (b) this.g;
        if (z3) {
            while (i3 <= i4) {
                if (bVar.b(i3, i5)) {
                    return true;
                }
                i3++;
            }
            return false;
        }
        while (i3 <= i4) {
            if (bVar.b(i5, i3)) {
                return true;
            }
            i3++;
        }
        return false;
    }

    public C0244n[] b() {
        int i3;
        int i4;
        int i5 = this.c;
        int i6 = this.f4421d;
        int i7 = this.f4423f;
        int i8 = this.f4422e;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = true;
        do {
            i3 = this.f4420b;
            if (!z8) {
                break;
            }
            boolean z9 = false;
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i6 < i3) {
                    z10 = a(i7, i8, i6, false);
                    if (z10) {
                        i6++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i6++;
                    }
                }
            }
            if (i6 >= i3) {
                break;
            }
            boolean z11 = true;
            while (true) {
                i4 = this.f4419a;
                if ((z11 || !z5) && i8 < i4) {
                    z11 = a(i5, i6, i8, true);
                    if (z11) {
                        i8++;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i8++;
                    }
                }
            }
            if (i8 >= i4) {
                break;
            }
            boolean z12 = true;
            while (true) {
                if ((z12 || !z6) && i5 >= 0) {
                    z12 = a(i7, i8, i5, false);
                    if (z12) {
                        i5--;
                        z6 = true;
                        z9 = true;
                    } else if (!z6) {
                        i5--;
                    }
                }
            }
            if (i5 < 0) {
                break;
            }
            z8 = z9;
            boolean z13 = true;
            while (true) {
                if ((z13 || !z7) && i7 >= 0) {
                    z13 = a(i5, i6, i7, true);
                    if (z13) {
                        i7--;
                        z8 = true;
                        z7 = true;
                    } else if (!z7) {
                        i7--;
                    }
                }
            }
        } while (i7 >= 0);
        z3 = true;
        if (z3) {
            throw C0238h.f3489d;
        }
        int i9 = i6 - i5;
        C0244n c0244n = null;
        C0244n c0244n2 = null;
        for (int i10 = 1; c0244n2 == null && i10 < i9; i10++) {
            c0244n2 = c(i5, i8 - i10, i5 + i10, i8);
        }
        if (c0244n2 == null) {
            throw C0238h.f3489d;
        }
        C0244n c0244n3 = null;
        for (int i11 = 1; c0244n3 == null && i11 < i9; i11++) {
            c0244n3 = c(i5, i7 + i11, i5 + i11, i7);
        }
        if (c0244n3 == null) {
            throw C0238h.f3489d;
        }
        C0244n c0244n4 = null;
        for (int i12 = 1; c0244n4 == null && i12 < i9; i12++) {
            c0244n4 = c(i6, i7 + i12, i6 - i12, i7);
        }
        if (c0244n4 == null) {
            throw C0238h.f3489d;
        }
        for (int i13 = 1; c0244n == null && i13 < i9; i13++) {
            c0244n = c(i6, i8 - i13, i6 - i13, i8);
        }
        if (c0244n == null) {
            throw C0238h.f3489d;
        }
        float f3 = i3 / 2.0f;
        float f4 = c0244n.f3505a;
        float f5 = c0244n2.f3505a;
        float f6 = c0244n4.f3505a;
        float f7 = c0244n3.f3505a;
        float f8 = c0244n.f3506b;
        float f9 = c0244n2.f3506b;
        float f10 = c0244n4.f3506b;
        float f11 = c0244n3.f3506b;
        return f4 < f3 ? new C0244n[]{new C0244n(f7 - 1.0f, f11 + 1.0f), new C0244n(f5 + 1.0f, f9 + 1.0f), new C0244n(f6 - 1.0f, f10 - 1.0f), new C0244n(f4 + 1.0f, f8 - 1.0f)} : new C0244n[]{new C0244n(f7 + 1.0f, f11 + 1.0f), new C0244n(f5 + 1.0f, f9 - 1.0f), new C0244n(f6 - 1.0f, f10 + 1.0f), new C0244n(f4 - 1.0f, f8 - 1.0f)};
    }

    public C0244n c(float f3, float f4, float f5, float f6) {
        int K2 = f.K(f.s(f3, f4, f5, f6));
        float f7 = K2;
        float f8 = (f5 - f3) / f7;
        float f9 = (f6 - f4) / f7;
        for (int i3 = 0; i3 < K2; i3++) {
            float f10 = i3;
            int K3 = f.K((f10 * f8) + f3);
            int K4 = f.K((f10 * f9) + f4);
            if (((b) this.g).b(K3, K4)) {
                return new C0244n(K3, K4);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(d dVar, C0372b c0372b) {
        int i3;
        boolean z3;
        int a3;
        int i4;
        int makeMeasureSpec;
        boolean z4;
        boolean z5;
        boolean z6;
        t.d dVar2;
        int measuredWidth;
        int measuredHeight;
        int i5;
        int max;
        int i6;
        int max2;
        int i7;
        int i8;
        int i9;
        int baseline;
        boolean z7;
        if (dVar == null) {
            return;
        }
        if (dVar.f4528V == 8) {
            c0372b.f4666e = 0;
            c0372b.f4667f = 0;
            c0372b.g = 0;
            return;
        }
        int i10 = c0372b.f4663a;
        int i11 = c0372b.f4664b;
        int i12 = c0372b.c;
        int i13 = c0372b.f4665d;
        int i14 = this.f4419a + this.f4420b;
        int i15 = this.c;
        View view = (View) dVar.f4527U;
        int a4 = h.a(i10);
        c cVar = dVar.f4558z;
        c cVar2 = dVar.f4556x;
        int[] iArr = dVar.g;
        if (a4 != 0) {
            if (a4 == 1) {
                i3 = ViewGroup.getChildMeasureSpec(this.f4422e, i15, -2);
                iArr[2] = -2;
            } else if (a4 == 2) {
                i3 = ViewGroup.getChildMeasureSpec(this.f4422e, i15, -2);
                boolean z8 = dVar.f4542j == 1;
                iArr[2] = 0;
                if (c0372b.f4669j) {
                    boolean z9 = (!z8 || iArr[3] == 0 || iArr[0] == dVar.l()) ? false : true;
                    if (!z8 || z9) {
                        i3 = View.MeasureSpec.makeMeasureSpec(dVar.l(), 1073741824);
                    }
                }
            } else if (a4 != 3) {
                i3 = 0;
            } else {
                int i16 = this.f4422e;
                int i17 = cVar2 != null ? cVar2.f4506e : 0;
                if (cVar != null) {
                    i17 += cVar.f4506e;
                }
                i3 = ViewGroup.getChildMeasureSpec(i16, i15 + i17, -1);
                iArr[2] = -1;
            }
            z3 = true;
            a3 = h.a(i11);
            if (a3 == 0) {
                if (a3 == 1) {
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4423f, i14, -2);
                    i4 = 3;
                    iArr[3] = -2;
                    makeMeasureSpec = childMeasureSpec;
                    z4 = true;
                } else if (a3 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4423f, i14, -2);
                    boolean z10 = dVar.f4543k == 1;
                    iArr[3] = 0;
                    if (c0372b.f4669j) {
                        boolean z11 = (!z10 || iArr[2] == 0 || iArr[1] == dVar.i()) ? false : true;
                        if (!z10 || z11) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.i(), 1073741824);
                            z4 = false;
                            i4 = 3;
                        }
                    }
                    z4 = true;
                    i4 = 3;
                } else if (a3 != 3) {
                    i4 = 3;
                    z4 = false;
                    makeMeasureSpec = 0;
                } else {
                    int i18 = this.f4423f;
                    int i19 = cVar2 != null ? dVar.f4557y.f4506e : 0;
                    if (cVar != null) {
                        i19 += dVar.f4508A.f4506e;
                    }
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i14 + i19, -1);
                    iArr[3] = -1;
                    makeMeasureSpec = childMeasureSpec2;
                    i4 = 3;
                }
                boolean z12 = i10 == i4;
                boolean z13 = i11 == i4;
                boolean z14 = i11 != 4 || i11 == 1;
                boolean z15 = i10 != 4 || i10 == 1;
                z5 = !z12 && dVar.f4518L > 0.0f;
                z6 = !z13 && dVar.f4518L > 0.0f;
                dVar2 = (t.d) view.getLayoutParams();
                if (c0372b.f4669j && z12 && dVar.f4542j == 0 && z13 && dVar.f4543k == 0) {
                    i9 = -1;
                    max = 0;
                    baseline = 0;
                    max2 = 0;
                } else {
                    if ((view instanceof p) || !(dVar instanceof g)) {
                        view.measure(i3, makeMeasureSpec);
                    } else {
                        ((p) view).h((g) dVar, i3, makeMeasureSpec);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    if (z3) {
                        i5 = 0;
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        i5 = 0;
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z4) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = i5;
                        iArr[3] = i5;
                    }
                    int i20 = dVar.f4545m;
                    max = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                    i6 = dVar.f4546n;
                    if (i6 > 0) {
                        max = Math.min(i6, max);
                    }
                    int i21 = dVar.f4548p;
                    max2 = i21 > 0 ? Math.max(i21, measuredHeight) : measuredHeight;
                    i7 = dVar.f4549q;
                    if (i7 > 0) {
                        max2 = Math.min(i7, max2);
                    }
                    if (!z5 && z14) {
                        max = (int) ((max2 * dVar.f4518L) + 0.5f);
                    } else if (z6 && z15) {
                        max2 = (int) ((max / dVar.f4518L) + 0.5f);
                    }
                    if (measuredWidth == max || measuredHeight != max2) {
                        if (measuredWidth != max) {
                            i8 = 1073741824;
                            i3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        } else {
                            i8 = 1073741824;
                        }
                        if (measuredHeight != max2) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, i8);
                        }
                        view.measure(i3, makeMeasureSpec);
                        int measuredWidth2 = view.getMeasuredWidth();
                        max2 = view.getMeasuredHeight();
                        max = measuredWidth2;
                        i9 = -1;
                        baseline = view.getBaseline();
                    } else {
                        baseline = baseline2;
                        i9 = -1;
                    }
                }
                z7 = baseline != i9;
                c0372b.f4668i = max == c0372b.c || max2 != c0372b.f4665d;
                if (dVar2.f4757X) {
                    z7 = true;
                }
                if (z7 && baseline != -1 && dVar.f4522P != baseline) {
                    c0372b.f4668i = true;
                }
                c0372b.f4666e = max;
                c0372b.f4667f = max2;
                c0372b.h = z7;
                c0372b.g = baseline;
            }
            i4 = 3;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            iArr[3] = i13;
            z4 = false;
            if (i10 == i4) {
            }
            if (i11 == i4) {
            }
            if (i11 != 4) {
            }
            if (i10 != 4) {
            }
            if (z12) {
            }
            if (z13) {
            }
            dVar2 = (t.d) view.getLayoutParams();
            if (c0372b.f4669j) {
            }
            if (view instanceof p) {
            }
            view.measure(i3, makeMeasureSpec);
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline22 = view.getBaseline();
            if (z3) {
            }
            if (z4) {
            }
            int i202 = dVar.f4545m;
            if (i202 > 0) {
            }
            i6 = dVar.f4546n;
            if (i6 > 0) {
            }
            int i212 = dVar.f4548p;
            if (i212 > 0) {
            }
            i7 = dVar.f4549q;
            if (i7 > 0) {
            }
            if (!z5) {
            }
            if (z6) {
                max2 = (int) ((max / dVar.f4518L) + 0.5f);
            }
            if (measuredWidth == max) {
            }
            if (measuredWidth != max) {
            }
            if (measuredHeight != max2) {
            }
            view.measure(i3, makeMeasureSpec);
            int measuredWidth22 = view.getMeasuredWidth();
            max2 = view.getMeasuredHeight();
            max = measuredWidth22;
            i9 = -1;
            baseline = view.getBaseline();
            if (baseline != i9) {
            }
            c0372b.f4668i = max == c0372b.c || max2 != c0372b.f4665d;
            if (dVar2.f4757X) {
            }
            if (z7) {
                c0372b.f4668i = true;
            }
            c0372b.f4666e = max;
            c0372b.f4667f = max2;
            c0372b.h = z7;
            c0372b.g = baseline;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        iArr[2] = i12;
        i3 = makeMeasureSpec2;
        z3 = false;
        a3 = h.a(i11);
        if (a3 == 0) {
        }
        z4 = false;
        if (i10 == i4) {
        }
        if (i11 == i4) {
        }
        if (i11 != 4) {
        }
        if (i10 != 4) {
        }
        if (z12) {
        }
        if (z13) {
        }
        dVar2 = (t.d) view.getLayoutParams();
        if (c0372b.f4669j) {
        }
        if (view instanceof p) {
        }
        view.measure(i3, makeMeasureSpec);
        measuredWidth = view.getMeasuredWidth();
        measuredHeight = view.getMeasuredHeight();
        int baseline222 = view.getBaseline();
        if (z3) {
        }
        if (z4) {
        }
        int i2022 = dVar.f4545m;
        if (i2022 > 0) {
        }
        i6 = dVar.f4546n;
        if (i6 > 0) {
        }
        int i2122 = dVar.f4548p;
        if (i2122 > 0) {
        }
        i7 = dVar.f4549q;
        if (i7 > 0) {
        }
        if (!z5) {
        }
        if (z6) {
        }
        if (measuredWidth == max) {
        }
        if (measuredWidth != max) {
        }
        if (measuredHeight != max2) {
        }
        view.measure(i3, makeMeasureSpec);
        int measuredWidth222 = view.getMeasuredWidth();
        max2 = view.getMeasuredHeight();
        max = measuredWidth222;
        i9 = -1;
        baseline = view.getBaseline();
        if (baseline != i9) {
        }
        c0372b.f4668i = max == c0372b.c || max2 != c0372b.f4665d;
        if (dVar2.f4757X) {
        }
        if (z7) {
        }
        c0372b.f4666e = max;
        c0372b.f4667f = max2;
        c0372b.h = z7;
        c0372b.g = baseline;
    }

    public C0363a(b bVar) {
        this(bVar, 10, bVar.f4328b / 2, bVar.c / 2);
    }

    public C0363a(ConstraintLayout constraintLayout) {
        this.g = constraintLayout;
    }
}
