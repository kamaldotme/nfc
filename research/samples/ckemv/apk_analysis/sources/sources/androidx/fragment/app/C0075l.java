package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075l extends v0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0077n f1943d;

    public C0075l(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        this.f1943d = abstractComponentCallbacksC0077n;
    }

    @Override // v0.f
    public final View C(int i3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.f1943d;
        View view = abstractComponentCallbacksC0077n.f1957F;
        if (view != null) {
            return view.findViewById(i3);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0077n + " does not have a view");
    }

    @Override // v0.f
    public final boolean F() {
        return this.f1943d.f1957F != null;
    }
}
