package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import j.InterfaceC0192D;

/* renamed from: k.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0317x0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final float f3798b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3799d;

    /* renamed from: e, reason: collision with root package name */
    public final View f3800e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0315w0 f3801f;
    public RunnableC0315w0 g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f3802i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3803j = new int[2];

    public AbstractViewOnTouchListenerC0317x0(View view) {
        this.f3800e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3798b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.c = tapTimeout;
        this.f3799d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0315w0 runnableC0315w0 = this.g;
        View view = this.f3800e;
        if (runnableC0315w0 != null) {
            view.removeCallbacks(runnableC0315w0);
        }
        RunnableC0315w0 runnableC0315w02 = this.f3801f;
        if (runnableC0315w02 != null) {
            view.removeCallbacks(runnableC0315w02);
        }
    }

    public abstract InterfaceC0192D b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0192D b3 = b();
        if (b3 == null || !b3.b()) {
            return true;
        }
        b3.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        C0311u0 f3;
        boolean z4 = this.h;
        View view2 = this.f3800e;
        if (z4) {
            InterfaceC0192D b3 = b();
            if (b3 != null && b3.b() && (f3 = b3.f()) != null && f3.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f3803j;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f3.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b4 = f3.b(obtainNoHistory, this.f3802i);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b4) {
                }
            }
            if (d()) {
                z3 = false;
            }
            z3 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f3802i);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y3 = motionEvent.getY(findPointerIndex);
                                float f4 = this.f3798b;
                                float f5 = -f4;
                                if (x2 < f5 || y3 < f5 || x2 >= (view2.getRight() - view2.getLeft()) + f4 || y3 >= (view2.getBottom() - view2.getTop()) + f4) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z3 = true;
                                        if (z3) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f3802i = motionEvent.getPointerId(0);
                    if (this.f3801f == null) {
                        this.f3801f = new RunnableC0315w0(this, 0);
                    }
                    view2.postDelayed(this.f3801f, this.c);
                    if (this.g == null) {
                        this.g = new RunnableC0315w0(this, 1);
                    }
                    view2.postDelayed(this.g, this.f3799d);
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        this.h = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.f3802i = -1;
        RunnableC0315w0 runnableC0315w0 = this.f3801f;
        if (runnableC0315w0 != null) {
            this.f3800e.removeCallbacks(runnableC0315w0);
        }
    }
}
