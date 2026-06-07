package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: k.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0315w0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3795b;
    public final /* synthetic */ AbstractViewOnTouchListenerC0317x0 c;

    public /* synthetic */ RunnableC0315w0(AbstractViewOnTouchListenerC0317x0 abstractViewOnTouchListenerC0317x0, int i3) {
        this.f3795b = i3;
        this.c = abstractViewOnTouchListenerC0317x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3795b) {
            case 0:
                ViewParent parent = this.c.f3800e.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC0317x0 abstractViewOnTouchListenerC0317x0 = this.c;
                abstractViewOnTouchListenerC0317x0.a();
                View view = abstractViewOnTouchListenerC0317x0.f3800e;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0317x0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0317x0.h = true;
                    return;
                }
                return;
        }
    }
}
