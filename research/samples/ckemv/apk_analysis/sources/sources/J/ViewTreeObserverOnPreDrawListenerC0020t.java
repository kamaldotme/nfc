package J;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: J.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0020t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f457b;
    public ViewTreeObserver c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f458d;

    public ViewTreeObserverOnPreDrawListenerC0020t(View view, Runnable runnable) {
        this.f457b = view;
        this.c = view.getViewTreeObserver();
        this.f458d = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0020t viewTreeObserverOnPreDrawListenerC0020t = new ViewTreeObserverOnPreDrawListenerC0020t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0020t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0020t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.c.isAlive();
        View view = this.f457b;
        if (isAlive) {
            this.c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f458d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.c.isAlive();
        View view2 = this.f457b;
        if (isAlive) {
            this.c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
