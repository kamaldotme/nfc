package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0081s implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f2002b;
    public final /* synthetic */ LayoutInflaterFactory2C0082t c;

    public ViewOnAttachStateChangeListenerC0081s(LayoutInflaterFactory2C0082t layoutInflaterFactory2C0082t, G g) {
        this.c = layoutInflaterFactory2C0082t;
        this.f2002b = g;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        G g = this.f2002b;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
        g.k();
        C0070g.g((ViewGroup) abstractComponentCallbacksC0077n.f1957F.getParent(), this.c.f2003b.C()).f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
