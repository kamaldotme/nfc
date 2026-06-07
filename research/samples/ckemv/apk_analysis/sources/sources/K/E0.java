package k;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class E0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f3559a;

    public E0(G0 g02) {
        this.f3559a = g02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        if (i3 == 1) {
            G0 g02 = this.f3559a;
            if (g02.f3568A.getInputMethodMode() == 2 || g02.f3568A.getContentView() == null) {
                return;
            }
            Handler handler = g02.f3587w;
            D0 d02 = g02.f3583s;
            handler.removeCallbacks(d02);
            d02.run();
        }
    }
}
