package C0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v.AbstractC0397a;

/* loaded from: classes.dex */
public abstract class a extends AbstractC0397a {

    /* renamed from: a, reason: collision with root package name */
    public b f108a;

    /* renamed from: b, reason: collision with root package name */
    public int f109b = 0;

    public a() {
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, C0.b] */
    @Override // v.AbstractC0397a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        r(coordinatorLayout, view, i3);
        if (this.f108a == null) {
            ?? obj = new Object();
            obj.f112d = view;
            this.f108a = obj;
        }
        b bVar = this.f108a;
        View view2 = (View) bVar.f112d;
        bVar.f110a = view2.getTop();
        bVar.f111b = view2.getLeft();
        this.f108a.b();
        int i4 = this.f109b;
        if (i4 == 0) {
            return true;
        }
        b bVar2 = this.f108a;
        if (bVar2.c != i4) {
            bVar2.c = i4;
            bVar2.b();
        }
        this.f109b = 0;
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i3) {
        coordinatorLayout.p(view, i3);
    }

    public a(int i3) {
    }
}
