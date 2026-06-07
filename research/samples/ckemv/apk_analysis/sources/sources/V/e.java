package v;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f5059b;

    public e(CoordinatorLayout coordinatorLayout) {
        this.f5059b = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f5059b.o(0);
        return true;
    }
}
