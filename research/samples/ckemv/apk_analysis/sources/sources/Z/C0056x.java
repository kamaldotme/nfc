package Z;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Z.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056x extends J {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f1368a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f1369b = new Z(this);
    public C0054v c;

    /* renamed from: d, reason: collision with root package name */
    public C0054v f1370d;

    public static int b(View view, AbstractC0055w abstractC0055w) {
        return ((abstractC0055w.c(view) / 2) + abstractC0055w.e(view)) - ((abstractC0055w.l() / 2) + abstractC0055w.k());
    }

    public static View c(H h, AbstractC0055w abstractC0055w) {
        int v3 = h.v();
        View view = null;
        if (v3 == 0) {
            return null;
        }
        int l3 = (abstractC0055w.l() / 2) + abstractC0055w.k();
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < v3; i4++) {
            View u3 = h.u(i4);
            int abs = Math.abs(((abstractC0055w.c(u3) / 2) + abstractC0055w.e(u3)) - l3);
            if (abs < i3) {
                view = u3;
                i3 = abs;
            }
        }
        return view;
    }

    public final int[] a(H h, View view) {
        int[] iArr = new int[2];
        if (h.d()) {
            iArr[0] = b(view, d(h));
        } else {
            iArr[0] = 0;
        }
        if (h.e()) {
            iArr[1] = b(view, e(h));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final AbstractC0055w d(H h) {
        C0054v c0054v = this.f1370d;
        if (c0054v == null || ((H) c0054v.f1367b) != h) {
            this.f1370d = new C0054v(h, 0);
        }
        return this.f1370d;
    }

    public final AbstractC0055w e(H h) {
        C0054v c0054v = this.c;
        if (c0054v == null || ((H) c0054v.f1367b) != h) {
            this.c = new C0054v(h, 1);
        }
        return this.c;
    }

    public final void f() {
        H layoutManager;
        RecyclerView recyclerView = this.f1368a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c == null) {
            return;
        }
        int[] a3 = a(layoutManager, c);
        int i3 = a3[0];
        if (i3 == 0 && a3[1] == 0) {
            return;
        }
        this.f1368a.b0(i3, a3[1], false);
    }
}
