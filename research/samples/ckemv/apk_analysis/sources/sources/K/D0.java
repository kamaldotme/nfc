package k;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class D0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3558b;
    public final /* synthetic */ G0 c;

    public /* synthetic */ D0(G0 g02, int i3) {
        this.f3558b = i3;
        this.c = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G0 g02 = this.c;
        switch (this.f3558b) {
            case 0:
                C0311u0 c0311u0 = g02.f3570d;
                if (c0311u0 != null) {
                    c0311u0.setListSelectionHidden(true);
                    c0311u0.requestLayout();
                    return;
                }
                return;
            default:
                C0311u0 c0311u02 = g02.f3570d;
                if (c0311u02 != null) {
                    WeakHashMap weakHashMap = J.T.f402a;
                    if (!J.E.b(c0311u02) || g02.f3570d.getCount() <= g02.f3570d.getChildCount() || g02.f3570d.getChildCount() > g02.f3578n) {
                        return;
                    }
                    g02.f3568A.setInputMethodMode(2);
                    g02.i();
                    return;
                }
                return;
        }
    }
}
