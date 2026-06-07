package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.InterfaceC0205k;
import j.MenuC0207m;
import java.lang.ref.WeakReference;
import k.C0288j;

/* loaded from: classes.dex */
public final class f extends AbstractC0184b implements InterfaceC0205k {

    /* renamed from: d, reason: collision with root package name */
    public Context f3131d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContextView f3132e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0183a f3133f;
    public WeakReference g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public MenuC0207m f3134i;

    @Override // i.AbstractC0184b
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f3133f.d(this);
    }

    @Override // i.AbstractC0184b
    public final View b() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.AbstractC0184b
    public final MenuC0207m c() {
        return this.f3134i;
    }

    @Override // i.AbstractC0184b
    public final MenuInflater d() {
        return new j(this.f3132e.getContext());
    }

    @Override // j.InterfaceC0205k
    public final void e(MenuC0207m menuC0207m) {
        i();
        C0288j c0288j = this.f3132e.f1537e;
        if (c0288j != null) {
            c0288j.l();
        }
    }

    @Override // i.AbstractC0184b
    public final CharSequence f() {
        return this.f3132e.getSubtitle();
    }

    @Override // j.InterfaceC0205k
    public final boolean g(MenuC0207m menuC0207m, MenuItem menuItem) {
        return this.f3133f.a(this, menuItem);
    }

    @Override // i.AbstractC0184b
    public final CharSequence h() {
        return this.f3132e.getTitle();
    }

    @Override // i.AbstractC0184b
    public final void i() {
        this.f3133f.b(this, this.f3134i);
    }

    @Override // i.AbstractC0184b
    public final boolean j() {
        return this.f3132e.f1550t;
    }

    @Override // i.AbstractC0184b
    public final void k(View view) {
        this.f3132e.setCustomView(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // i.AbstractC0184b
    public final void l(int i3) {
        m(this.f3131d.getString(i3));
    }

    @Override // i.AbstractC0184b
    public final void m(CharSequence charSequence) {
        this.f3132e.setSubtitle(charSequence);
    }

    @Override // i.AbstractC0184b
    public final void n(int i3) {
        o(this.f3131d.getString(i3));
    }

    @Override // i.AbstractC0184b
    public final void o(CharSequence charSequence) {
        this.f3132e.setTitle(charSequence);
    }

    @Override // i.AbstractC0184b
    public final void p(boolean z3) {
        this.c = z3;
        this.f3132e.setTitleOptional(z3);
    }
}
