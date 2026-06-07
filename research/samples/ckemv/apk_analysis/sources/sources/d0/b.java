package D0;

import J.B;
import J.C;
import J.T;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import m0.z;

/* loaded from: classes.dex */
public final class b extends z {

    /* renamed from: d, reason: collision with root package name */
    public int f137d;

    /* renamed from: e, reason: collision with root package name */
    public int f138e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f139f;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f139f = swipeDismissBehavior;
    }

    @Override // m0.z
    public final int M(View view) {
        return view.getWidth();
    }

    @Override // m0.z
    public final void V(View view, int i3) {
        this.f138e = i3;
        this.f137d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f139f;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // m0.z
    public final void W(int i3) {
        this.f139f.getClass();
    }

    @Override // m0.z
    public final void X(View view, int i3, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f139f;
        float f3 = width * swipeDismissBehavior.f2279f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i3 - this.f137d);
        if (abs <= f3) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f3) / (width2 - f3))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f137d) >= java.lang.Math.round(r9.getWidth() * r3.f2278e)) goto L27;
     */
    @Override // m0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(View view, float f3, float f4) {
        int i3;
        this.f138e = -1;
        int width = view.getWidth();
        boolean z3 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f139f;
        if (f3 != 0.0f) {
            WeakHashMap weakHashMap = T.f402a;
            boolean z4 = C.d(view) == 1;
            int i4 = swipeDismissBehavior.f2277d;
            if (i4 != 2) {
                if (i4 == 0) {
                    i3 = this.f137d;
                    z3 = false;
                } else {
                    i3 = this.f137d;
                    z3 = false;
                }
            }
            if (f3 >= 0.0f) {
                int left = view.getLeft();
                int i5 = this.f137d;
                if (left >= i5) {
                    i3 = i5 + width;
                }
            }
            i3 = this.f137d - width;
        }
        if (swipeDismissBehavior.f2275a.n(i3, view.getTop())) {
            c cVar = new c(swipeDismissBehavior, view, z3);
            WeakHashMap weakHashMap2 = T.f402a;
            B.m(view, cVar);
        }
    }

    @Override // m0.z
    public final int l(View view, int i3) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = T.f402a;
        boolean z3 = C.d(view) == 1;
        int i4 = this.f139f.f2277d;
        if (i4 == 0) {
            if (z3) {
                width = this.f137d - view.getWidth();
                width2 = this.f137d;
            } else {
                width = this.f137d;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i4 != 1) {
            width = this.f137d - view.getWidth();
            width2 = view.getWidth() + this.f137d;
        } else if (z3) {
            width = this.f137d;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f137d - view.getWidth();
            width2 = this.f137d;
        }
        return Math.min(Math.max(width, i3), width2);
    }

    @Override // m0.z
    public final int m(View view, int i3) {
        return view.getTop();
    }

    @Override // m0.z
    public final boolean n0(View view, int i3) {
        int i4 = this.f138e;
        return (i4 == -1 || i4 == i3) && this.f139f.r(view);
    }
}
