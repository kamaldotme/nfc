package j;

import android.view.MenuItem;

/* renamed from: j.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0213s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0214t f3364b;

    public MenuItemOnMenuItemClickListenerC0213s(MenuItemC0214t menuItemC0214t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3364b = menuItemC0214t;
        this.f3363a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3363a.onMenuItemClick(this.f3364b.g(menuItem));
    }
}
