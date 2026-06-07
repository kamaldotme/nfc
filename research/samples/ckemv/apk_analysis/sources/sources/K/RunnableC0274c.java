package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0274c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3670b;
    public final /* synthetic */ ActionBarOverlayLayout c;

    public /* synthetic */ RunnableC0274c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f3670b = i3;
        this.c = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3670b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1574x = actionBarOverlayLayout.f1557e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1575y);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1574x = actionBarOverlayLayout2.f1557e.animate().translationY(-actionBarOverlayLayout2.f1557e.getHeight()).setListener(actionBarOverlayLayout2.f1575y);
                return;
        }
    }
}
