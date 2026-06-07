package j;

import android.view.MenuItem;
import f.C0150G;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0199e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0200f f3271b;
    public final /* synthetic */ MenuItem c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MenuC0207m f3272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0150G f3273e;

    public RunnableC0199e(C0150G c0150g, C0200f c0200f, C0209o c0209o, MenuC0207m menuC0207m) {
        this.f3273e = c0150g;
        this.f3271b = c0200f;
        this.c = c0209o;
        this.f3272d = menuC0207m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0200f c0200f = this.f3271b;
        if (c0200f != null) {
            C0150G c0150g = this.f3273e;
            ((ViewOnKeyListenerC0201g) c0150g.f2846b).f3277B = true;
            c0200f.f3275b.c(false);
            ((ViewOnKeyListenerC0201g) c0150g.f2846b).f3277B = false;
        }
        MenuItem menuItem = this.c;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f3272d.q(menuItem, null, 4);
        }
    }
}
