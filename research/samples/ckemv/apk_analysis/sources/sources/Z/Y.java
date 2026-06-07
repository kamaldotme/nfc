package Z;

import J.C0004c;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Y extends C0004c {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1222d;

    /* renamed from: e, reason: collision with root package name */
    public final X f1223e;

    public Y(RecyclerView recyclerView) {
        this.f1222d = recyclerView;
        X x2 = this.f1223e;
        if (x2 != null) {
            this.f1223e = x2;
        } else {
            this.f1223e = new X(this);
        }
    }

    @Override // J.C0004c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f1222d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Q(accessibilityEvent);
        }
    }

    @Override // J.C0004c
    public final void d(View view, K.p pVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f413a;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f1222d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1159b;
        N n3 = recyclerView2.c;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f1159b.canScrollHorizontally(-1)) {
            pVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f1159b.canScrollVertically(1) || layoutManager.f1159b.canScrollHorizontally(1)) {
            pVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        T t3 = recyclerView2.f2122d0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.H(n3, t3), layoutManager.x(n3, t3), false, 0));
    }

    @Override // J.C0004c
    public final boolean g(View view, int i3, Bundle bundle) {
        int E2;
        int C2;
        if (super.g(view, i3, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1222d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1159b;
        N n3 = recyclerView2.c;
        if (i3 == 4096) {
            E2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f1169o - layoutManager.E()) - layoutManager.B() : 0;
            if (layoutManager.f1159b.canScrollHorizontally(1)) {
                C2 = (layoutManager.f1168n - layoutManager.C()) - layoutManager.D();
            }
            C2 = 0;
        } else if (i3 != 8192) {
            C2 = 0;
            E2 = 0;
        } else {
            E2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1169o - layoutManager.E()) - layoutManager.B()) : 0;
            if (layoutManager.f1159b.canScrollHorizontally(-1)) {
                C2 = -((layoutManager.f1168n - layoutManager.C()) - layoutManager.D());
            }
            C2 = 0;
        }
        if (E2 == 0 && C2 == 0) {
            return false;
        }
        layoutManager.f1159b.b0(C2, E2, true);
        return true;
    }
}
