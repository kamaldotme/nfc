package Z;

import J.C0004c;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X extends C0004c {

    /* renamed from: d, reason: collision with root package name */
    public final Y f1220d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f1221e = new WeakHashMap();

    public X(Y y3) {
        this.f1220d = y3;
    }

    @Override // J.C0004c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0004c c0004c = (C0004c) this.f1221e.get(view);
        return c0004c != null ? c0004c.a(view, accessibilityEvent) : this.f413a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // J.C0004c
    public final K.r b(View view) {
        C0004c c0004c = (C0004c) this.f1221e.get(view);
        return c0004c != null ? c0004c.b(view) : super.b(view);
    }

    @Override // J.C0004c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0004c c0004c = (C0004c) this.f1221e.get(view);
        if (c0004c != null) {
            c0004c.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // J.C0004c
    public final void d(View view, K.p pVar) {
        Y y3 = this.f1220d;
        boolean K2 = y3.f1222d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f413a;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
        if (!K2) {
            RecyclerView recyclerView = y3.f1222d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().S(view, pVar);
                C0004c c0004c = (C0004c) this.f1221e.get(view);
                if (c0004c != null) {
                    c0004c.d(view, pVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // J.C0004c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0004c c0004c = (C0004c) this.f1221e.get(view);
        if (c0004c != null) {
            c0004c.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // J.C0004c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0004c c0004c = (C0004c) this.f1221e.get(viewGroup);
        return c0004c != null ? c0004c.f(viewGroup, view, accessibilityEvent) : this.f413a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // J.C0004c
    public final boolean g(View view, int i3, Bundle bundle) {
        Y y3 = this.f1220d;
        if (!y3.f1222d.K()) {
            RecyclerView recyclerView = y3.f1222d;
            if (recyclerView.getLayoutManager() != null) {
                C0004c c0004c = (C0004c) this.f1221e.get(view);
                if (c0004c != null) {
                    if (c0004c.g(view, i3, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i3, bundle)) {
                    return true;
                }
                N n3 = recyclerView.getLayoutManager().f1159b.c;
                return false;
            }
        }
        return super.g(view, i3, bundle);
    }

    @Override // J.C0004c
    public final void h(View view, int i3) {
        C0004c c0004c = (C0004c) this.f1221e.get(view);
        if (c0004c != null) {
            c0004c.h(view, i3);
        } else {
            super.h(view, i3);
        }
    }

    @Override // J.C0004c
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0004c c0004c = (C0004c) this.f1221e.get(view);
        if (c0004c != null) {
            c0004c.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
