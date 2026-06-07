package j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import f.DialogC0158f;

/* renamed from: j.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0208n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0219y {

    /* renamed from: b, reason: collision with root package name */
    public MenuC0207m f3330b;
    public DialogC0158f c;

    /* renamed from: d, reason: collision with root package name */
    public C0203i f3331d;

    @Override // j.InterfaceC0219y
    public final void a(MenuC0207m menuC0207m, boolean z3) {
        DialogC0158f dialogC0158f;
        if ((z3 || menuC0207m == this.f3330b) && (dialogC0158f = this.c) != null) {
            dialogC0158f.dismiss();
        }
    }

    @Override // j.InterfaceC0219y
    public final boolean b(MenuC0207m menuC0207m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        C0203i c0203i = this.f3331d;
        if (c0203i.g == null) {
            c0203i.g = new C0202h(c0203i);
        }
        this.f3330b.q(c0203i.g.getItem(i3), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3331d.a(this.f3330b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        MenuC0207m menuC0207m = this.f3330b;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                menuC0207m.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return menuC0207m.performShortcut(i3, keyEvent, 0);
    }
}
