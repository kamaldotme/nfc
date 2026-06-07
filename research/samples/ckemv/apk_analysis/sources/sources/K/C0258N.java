package k;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import j.ViewTreeObserverOnGlobalLayoutListenerC0198d;

/* renamed from: k.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258N implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f3602b;
    public final /* synthetic */ C0259O c;

    public C0258N(C0259O c0259o, ViewTreeObserverOnGlobalLayoutListenerC0198d viewTreeObserverOnGlobalLayoutListenerC0198d) {
        this.c = c0259o;
        this.f3602b = viewTreeObserverOnGlobalLayoutListenerC0198d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.c.f3606H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3602b);
        }
    }
}
