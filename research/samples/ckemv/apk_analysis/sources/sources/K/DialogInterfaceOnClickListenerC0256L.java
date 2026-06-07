package k;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import f.C0154b;
import f.DialogC0158f;

/* renamed from: k.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0256L implements InterfaceC0261Q, DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public DialogC0158f f3593b;
    public ListAdapter c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f3594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0262S f3595e;

    public DialogInterfaceOnClickListenerC0256L(C0262S c0262s) {
        this.f3595e = c0262s;
    }

    @Override // k.InterfaceC0261Q
    public final CharSequence a() {
        return this.f3594d;
    }

    @Override // k.InterfaceC0261Q
    public final boolean b() {
        DialogC0158f dialogC0158f = this.f3593b;
        if (dialogC0158f != null) {
            return dialogC0158f.isShowing();
        }
        return false;
    }

    @Override // k.InterfaceC0261Q
    public final void c(int i3) {
    }

    @Override // k.InterfaceC0261Q
    public final void dismiss() {
        DialogC0158f dialogC0158f = this.f3593b;
        if (dialogC0158f != null) {
            dialogC0158f.dismiss();
            this.f3593b = null;
        }
    }

    @Override // k.InterfaceC0261Q
    public final int e() {
        return 0;
    }

    @Override // k.InterfaceC0261Q
    public final void g(int i3, int i4) {
        if (this.c == null) {
            return;
        }
        C0262S c0262s = this.f3595e;
        F0.e eVar = new F0.e(c0262s.getPopupContext());
        CharSequence charSequence = this.f3594d;
        C0154b c0154b = (C0154b) eVar.c;
        if (charSequence != null) {
            c0154b.f2877d = charSequence;
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = c0262s.getSelectedItemPosition();
        c0154b.g = listAdapter;
        c0154b.h = this;
        c0154b.f2881j = selectedItemPosition;
        c0154b.f2880i = true;
        DialogC0158f a3 = eVar.a();
        this.f3593b = a3;
        AlertController$RecycleListView alertController$RecycleListView = a3.g.f2886e;
        AbstractC0254J.d(alertController$RecycleListView, i3);
        AbstractC0254J.c(alertController$RecycleListView, i4);
        this.f3593b.show();
    }

    @Override // k.InterfaceC0261Q
    public final void h(CharSequence charSequence) {
        this.f3594d = charSequence;
    }

    @Override // k.InterfaceC0261Q
    public final int k() {
        return 0;
    }

    @Override // k.InterfaceC0261Q
    public final void l(Drawable drawable) {
    }

    @Override // k.InterfaceC0261Q
    public final void m(int i3) {
    }

    @Override // k.InterfaceC0261Q
    public final Drawable n() {
        return null;
    }

    @Override // k.InterfaceC0261Q
    public final void o(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        C0262S c0262s = this.f3595e;
        c0262s.setSelection(i3);
        if (c0262s.getOnItemClickListener() != null) {
            c0262s.performItemClick(null, i3, this.c.getItemId(i3));
        }
        dismiss();
    }

    @Override // k.InterfaceC0261Q
    public final void p(int i3) {
    }
}
