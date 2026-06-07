package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: j.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0194F extends MenuC0207m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0209o f3253A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0207m f3254z;

    public SubMenuC0194F(Context context, MenuC0207m menuC0207m, C0209o c0209o) {
        super(context);
        this.f3254z = menuC0207m;
        this.f3253A = c0209o;
    }

    @Override // j.MenuC0207m
    public final boolean d(C0209o c0209o) {
        return this.f3254z.d(c0209o);
    }

    @Override // j.MenuC0207m
    public final boolean e(MenuC0207m menuC0207m, MenuItem menuItem) {
        return super.e(menuC0207m, menuItem) || this.f3254z.e(menuC0207m, menuItem);
    }

    @Override // j.MenuC0207m
    public final boolean f(C0209o c0209o) {
        return this.f3254z.f(c0209o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3253A;
    }

    @Override // j.MenuC0207m
    public final String j() {
        C0209o c0209o = this.f3253A;
        int i3 = c0209o != null ? c0209o.f3335a : 0;
        if (i3 == 0) {
            return null;
        }
        return X.d.f("android:menu:actionviewstates:", i3);
    }

    @Override // j.MenuC0207m
    public final MenuC0207m k() {
        return this.f3254z.k();
    }

    @Override // j.MenuC0207m
    public final boolean m() {
        return this.f3254z.m();
    }

    @Override // j.MenuC0207m
    public final boolean n() {
        return this.f3254z.n();
    }

    @Override // j.MenuC0207m
    public final boolean o() {
        return this.f3254z.o();
    }

    @Override // j.MenuC0207m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f3254z.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3253A.setIcon(drawable);
        return this;
    }

    @Override // j.MenuC0207m, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f3254z.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        u(0, null, i3, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        u(i3, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f3253A.setIcon(i3);
        return this;
    }
}
