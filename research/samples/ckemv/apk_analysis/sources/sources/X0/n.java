package X0;

import J.F;
import J.T;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import j.ViewOnKeyListenerC0193E;
import j.ViewOnKeyListenerC0201g;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1057b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i3, Object obj) {
        this.f1057b = i3;
        this.c = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.c;
        switch (this.f1057b) {
            case 0:
                p pVar = (p) obj;
                if (pVar.f1078v == null || (accessibilityManager = pVar.f1077u) == null) {
                    return;
                }
                WeakHashMap weakHashMap = T.f402a;
                if (J.E.b(pVar)) {
                    K.c.a(accessibilityManager, pVar.f1078v);
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = T.f402a;
                F.c(view2);
                return;
            case 2:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1057b) {
            case 0:
                p pVar = (p) this.c;
                K.d dVar = pVar.f1078v;
                if (dVar == null || (accessibilityManager = pVar.f1077u) == null) {
                    return;
                }
                K.c.b(accessibilityManager, dVar);
                return;
            case 1:
                return;
            case 2:
                ViewOnKeyListenerC0201g viewOnKeyListenerC0201g = (ViewOnKeyListenerC0201g) this.c;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0201g.f3298z;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0201g.f3298z = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0201g.f3298z.removeGlobalOnLayoutListener(viewOnKeyListenerC0201g.f3283k);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC0193E viewOnKeyListenerC0193E = (ViewOnKeyListenerC0193E) this.c;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0193E.f3247q;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0193E.f3247q = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0193E.f3247q.removeGlobalOnLayoutListener(viewOnKeyListenerC0193E.f3241k);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
