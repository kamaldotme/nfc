package k;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class F0 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f3561b;

    public F0(G0 g02) {
        this.f3561b = g02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0245A c0245a;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        G0 g02 = this.f3561b;
        if (action == 0 && (c0245a = g02.f3568A) != null && c0245a.isShowing() && x2 >= 0 && x2 < g02.f3568A.getWidth() && y3 >= 0 && y3 < g02.f3568A.getHeight()) {
            g02.f3587w.postDelayed(g02.f3583s, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        g02.f3587w.removeCallbacks(g02.f3583s);
        return false;
    }
}
