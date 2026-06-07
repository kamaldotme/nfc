package f;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import i.AbstractC0184b;
import i.InterfaceC0183a;
import j.InterfaceC0205k;
import j.MenuC0207m;
import java.lang.ref.WeakReference;
import k.C0288j;
import v0.C0403c;

/* renamed from: f.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151H extends AbstractC0184b implements InterfaceC0205k {

    /* renamed from: d, reason: collision with root package name */
    public final Context f2847d;

    /* renamed from: e, reason: collision with root package name */
    public final MenuC0207m f2848e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0183a f2849f;
    public WeakReference g;
    public final /* synthetic */ C0152I h;

    public C0151H(C0152I c0152i, Context context, C0403c c0403c) {
        this.h = c0152i;
        this.f2847d = context;
        this.f2849f = c0403c;
        MenuC0207m menuC0207m = new MenuC0207m(context);
        menuC0207m.f3317l = 1;
        this.f2848e = menuC0207m;
        menuC0207m.f3312e = this;
    }

    @Override // i.AbstractC0184b
    public final void a() {
        C0152I c0152i = this.h;
        if (c0152i.f2857i != this) {
            return;
        }
        boolean z3 = c0152i.f2864p;
        boolean z4 = c0152i.f2865q;
        if (z3 || z4) {
            c0152i.f2858j = this;
            c0152i.f2859k = this.f2849f;
        } else {
            this.f2849f.d(this);
        }
        this.f2849f = null;
        c0152i.H(false);
        ActionBarContextView actionBarContextView = c0152i.f2856f;
        if (actionBarContextView.f1542l == null) {
            actionBarContextView.e();
        }
        c0152i.c.setHideOnContentScrollEnabled(c0152i.f2870v);
        c0152i.f2857i = null;
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
        return this.f2848e;
    }

    @Override // i.AbstractC0184b
    public final MenuInflater d() {
        return new i.j(this.f2847d);
    }

    @Override // j.InterfaceC0205k
    public final void e(MenuC0207m menuC0207m) {
        if (this.f2849f == null) {
            return;
        }
        i();
        C0288j c0288j = this.h.f2856f.f1537e;
        if (c0288j != null) {
            c0288j.l();
        }
    }

    @Override // i.AbstractC0184b
    public final CharSequence f() {
        return this.h.f2856f.getSubtitle();
    }

    @Override // j.InterfaceC0205k
    public final boolean g(MenuC0207m menuC0207m, MenuItem menuItem) {
        InterfaceC0183a interfaceC0183a = this.f2849f;
        if (interfaceC0183a != null) {
            return interfaceC0183a.a(this, menuItem);
        }
        return false;
    }

    @Override // i.AbstractC0184b
    public final CharSequence h() {
        return this.h.f2856f.getTitle();
    }

    @Override // i.AbstractC0184b
    public final void i() {
        if (this.h.f2857i != this) {
            return;
        }
        MenuC0207m menuC0207m = this.f2848e;
        menuC0207m.w();
        try {
            this.f2849f.b(this, menuC0207m);
        } finally {
            menuC0207m.v();
        }
    }

    @Override // i.AbstractC0184b
    public final boolean j() {
        return this.h.f2856f.f1550t;
    }

    @Override // i.AbstractC0184b
    public final void k(View view) {
        this.h.f2856f.setCustomView(view);
        this.g = new WeakReference(view);
    }

    @Override // i.AbstractC0184b
    public final void l(int i3) {
        m(this.h.f2852a.getResources().getString(i3));
    }

    @Override // i.AbstractC0184b
    public final void m(CharSequence charSequence) {
        this.h.f2856f.setSubtitle(charSequence);
    }

    @Override // i.AbstractC0184b
    public final void n(int i3) {
        o(this.h.f2852a.getResources().getString(i3));
    }

    @Override // i.AbstractC0184b
    public final void o(CharSequence charSequence) {
        this.h.f2856f.setTitle(charSequence);
    }

    @Override // i.AbstractC0184b
    public final void p(boolean z3) {
        this.c = z3;
        this.h.f2856f.setTitleOptional(z3);
    }
}
