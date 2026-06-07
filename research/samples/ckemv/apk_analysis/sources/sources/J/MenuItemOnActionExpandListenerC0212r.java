package j;

import android.view.MenuItem;

/* renamed from: j.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0212r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0214t f3362b;

    public MenuItemOnActionExpandListenerC0212r(MenuItemC0214t menuItemC0214t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3362b = menuItemC0214t;
        this.f3361a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3361a.onMenuItemActionCollapse(this.f3362b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3361a.onMenuItemActionExpand(this.f3362b.g(menuItem));
    }
}
