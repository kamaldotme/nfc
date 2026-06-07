package J;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: J.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003b0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f412a;

    public C0003b0(View view) {
        this.f412a = new WeakReference(view);
    }

    public final void a(float f3) {
        View view = (View) this.f412a.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
    }

    public final void b() {
        View view = (View) this.f412a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j3) {
        View view = (View) this.f412a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
    }

    public final void d(c0 c0Var) {
        View view = (View) this.f412a.get();
        if (view != null) {
            if (c0Var != null) {
                view.animate().setListener(new Z(c0Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f3) {
        View view = (View) this.f412a.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
    }
}
