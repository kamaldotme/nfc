package Z;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: Z.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1371a;

    public /* synthetic */ C0057y(RecyclerView recyclerView) {
        this.f1371a = recyclerView;
    }

    public void a(C0034a c0034a) {
        int i3 = c0034a.f1226a;
        RecyclerView recyclerView = this.f1371a;
        if (i3 == 1) {
            recyclerView.f2136m.T(c0034a.f1227b, c0034a.f1228d);
            return;
        }
        if (i3 == 2) {
            recyclerView.f2136m.W(c0034a.f1227b, c0034a.f1228d);
        } else if (i3 == 4) {
            recyclerView.f2136m.X(c0034a.f1227b, c0034a.f1228d);
        } else {
            if (i3 != 8) {
                return;
            }
            recyclerView.f2136m.V(c0034a.f1227b, c0034a.f1228d);
        }
    }

    public W b(int i3) {
        RecyclerView recyclerView = this.f1371a;
        int x2 = recyclerView.f2125f.x();
        int i4 = 0;
        W w3 = null;
        while (true) {
            if (i4 >= x2) {
                break;
            }
            W I2 = RecyclerView.I(recyclerView.f2125f.w(i4));
            if (I2 != null && !I2.j() && I2.c == i3) {
                if (!recyclerView.f2125f.B(I2.f1205a)) {
                    w3 = I2;
                    break;
                }
                w3 = I2;
            }
            i4++;
        }
        if (w3 == null || recyclerView.f2125f.B(w3.f1205a)) {
            return null;
        }
        return w3;
    }

    public void c(int i3, int i4, Object obj) {
        int i5;
        int i6;
        RecyclerView recyclerView = this.f1371a;
        int x2 = recyclerView.f2125f.x();
        int i7 = i4 + i3;
        for (int i8 = 0; i8 < x2; i8++) {
            View w3 = recyclerView.f2125f.w(i8);
            W I2 = RecyclerView.I(w3);
            if (I2 != null && !I2.q() && (i6 = I2.c) >= i3 && i6 < i7) {
                I2.b(2);
                I2.a(obj);
                ((I) w3.getLayoutParams()).c = true;
            }
        }
        N n3 = recyclerView.c;
        ArrayList arrayList = n3.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            W w4 = (W) arrayList.get(size);
            if (w4 != null && (i5 = w4.c) >= i3 && i5 < i7) {
                w4.b(2);
                n3.e(size);
            }
        }
        recyclerView.f2128h0 = true;
    }

    public void d(int i3, int i4) {
        RecyclerView recyclerView = this.f1371a;
        int x2 = recyclerView.f2125f.x();
        for (int i5 = 0; i5 < x2; i5++) {
            W I2 = RecyclerView.I(recyclerView.f2125f.w(i5));
            if (I2 != null && !I2.q() && I2.c >= i3) {
                I2.n(i4, false);
                recyclerView.f2122d0.f1193f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            W w3 = (W) arrayList.get(i6);
            if (w3 != null && w3.c >= i3) {
                w3.n(i4, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2127g0 = true;
    }

    public void e(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        RecyclerView recyclerView = this.f1371a;
        int x2 = recyclerView.f2125f.x();
        int i12 = -1;
        if (i3 < i4) {
            i6 = i3;
            i5 = i4;
            i7 = -1;
        } else {
            i5 = i3;
            i6 = i4;
            i7 = 1;
        }
        for (int i13 = 0; i13 < x2; i13++) {
            W I2 = RecyclerView.I(recyclerView.f2125f.w(i13));
            if (I2 != null && (i11 = I2.c) >= i6 && i11 <= i5) {
                if (i11 == i3) {
                    I2.n(i4 - i3, false);
                } else {
                    I2.n(i7, false);
                }
                recyclerView.f2122d0.f1193f = true;
            }
        }
        N n3 = recyclerView.c;
        n3.getClass();
        if (i3 < i4) {
            i9 = i3;
            i8 = i4;
        } else {
            i8 = i3;
            i9 = i4;
            i12 = 1;
        }
        ArrayList arrayList = n3.c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            W w3 = (W) arrayList.get(i14);
            if (w3 != null && (i10 = w3.c) >= i9 && i10 <= i8) {
                if (i10 == i3) {
                    w3.n(i4 - i3, false);
                } else {
                    w3.n(i12, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2127g0 = true;
    }

    public void f(W w3, A1.i iVar, A1.i iVar2) {
        RecyclerView recyclerView = this.f1371a;
        recyclerView.getClass();
        w3.p(false);
        C0042i c0042i = (C0042i) recyclerView.f2102I;
        if (iVar != null) {
            c0042i.getClass();
            int i3 = iVar.f51b;
            int i4 = iVar2.f51b;
            if (i3 != i4 || iVar.c != iVar2.c) {
                if (!c0042i.g(w3, i3, iVar.c, i4, iVar2.c)) {
                    return;
                }
                recyclerView.S();
            }
        }
        c0042i.l(w3);
        w3.f1205a.setAlpha(0.0f);
        c0042i.f1280i.add(w3);
        recyclerView.S();
    }

    public void g(W w3, A1.i iVar, A1.i iVar2) {
        RecyclerView recyclerView = this.f1371a;
        recyclerView.c.j(w3);
        recyclerView.f(w3);
        w3.p(false);
        C0042i c0042i = (C0042i) recyclerView.f2102I;
        c0042i.getClass();
        int i3 = iVar.f51b;
        int i4 = iVar.c;
        View view = w3.f1205a;
        int left = iVar2 == null ? view.getLeft() : iVar2.f51b;
        int top = iVar2 == null ? view.getTop() : iVar2.c;
        if (w3.j() || (i3 == left && i4 == top)) {
            c0042i.l(w3);
            c0042i.h.add(w3);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!c0042i.g(w3, i3, i4, left, top)) {
                return;
            }
        }
        recyclerView.S();
    }

    public void h(int i3) {
        RecyclerView recyclerView = this.f1371a;
        View childAt = recyclerView.getChildAt(i3);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i3);
    }
}
