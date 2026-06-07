package Z;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1258a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f1259b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f1260d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f1261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1262f;

    public e0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f1262f = staggeredGridLayoutManager;
        this.f1261e = i3;
    }

    public final void a() {
        View view = (View) this.f1258a.get(r0.size() - 1);
        b0 b0Var = (b0) view.getLayoutParams();
        this.c = this.f1262f.f2169r.b(view);
        b0Var.getClass();
    }

    public final void b() {
        this.f1258a.clear();
        this.f1259b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.f1260d = 0;
    }

    public final int c() {
        return this.f1262f.f2174w ? e(r1.size() - 1, -1) : e(0, this.f1258a.size());
    }

    public final int d() {
        return this.f1262f.f2174w ? e(0, this.f1258a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i3, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1262f;
        int k2 = staggeredGridLayoutManager.f2169r.k();
        int g = staggeredGridLayoutManager.f2169r.g();
        int i5 = i4 > i3 ? 1 : -1;
        while (i3 != i4) {
            View view = (View) this.f1258a.get(i3);
            int e3 = staggeredGridLayoutManager.f2169r.e(view);
            int b3 = staggeredGridLayoutManager.f2169r.b(view);
            boolean z3 = e3 <= g;
            boolean z4 = b3 >= k2;
            if (z3 && z4 && (e3 < k2 || b3 > g)) {
                return H.F(view);
            }
            i3 += i5;
        }
        return -1;
    }

    public final int f(int i3) {
        int i4 = this.c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f1258a.size() == 0) {
            return i3;
        }
        a();
        return this.c;
    }

    public final View g(int i3, int i4) {
        ArrayList arrayList = this.f1258a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1262f;
        View view = null;
        if (i4 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2174w && H.F(view2) >= i3) || ((!staggeredGridLayoutManager.f2174w && H.F(view2) <= i3) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i5 = 0;
            while (i5 < size2) {
                View view3 = (View) arrayList.get(i5);
                if ((staggeredGridLayoutManager.f2174w && H.F(view3) <= i3) || ((!staggeredGridLayoutManager.f2174w && H.F(view3) >= i3) || !view3.hasFocusable())) {
                    break;
                }
                i5++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i3) {
        int i4 = this.f1259b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f1258a.size() == 0) {
            return i3;
        }
        View view = (View) this.f1258a.get(0);
        b0 b0Var = (b0) view.getLayoutParams();
        this.f1259b = this.f1262f.f2169r.e(view);
        b0Var.getClass();
        return this.f1259b;
    }
}
