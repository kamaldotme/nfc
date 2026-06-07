package k;

import android.view.View;
import j.InterfaceC0205k;
import j.MenuC0207m;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0284h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final C0280f f3688b;
    public final /* synthetic */ C0288j c;

    public RunnableC0284h(C0288j c0288j, C0280f c0280f) {
        this.c = c0288j;
        this.f3688b = c0280f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0205k interfaceC0205k;
        C0288j c0288j = this.c;
        MenuC0207m menuC0207m = c0288j.f3693d;
        if (menuC0207m != null && (interfaceC0205k = menuC0207m.f3312e) != null) {
            interfaceC0205k.e(menuC0207m);
        }
        View view = (View) c0288j.f3696i;
        if (view != null && view.getWindowToken() != null) {
            C0280f c0280f = this.f3688b;
            if (!c0280f.b()) {
                if (c0280f.f3372f != null) {
                    c0280f.d(0, 0, false, false);
                }
            }
            c0288j.f3707t = c0280f;
        }
        c0288j.f3709v = null;
    }
}
