package j;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import f.C0150G;

/* renamed from: j.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0210p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActionProvider f3358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0214t f3359b;
    public C0150G c;

    public ActionProviderVisibilityListenerC0210p(MenuItemC0214t menuItemC0214t, ActionProvider actionProvider) {
        this.f3359b = menuItemC0214t;
        this.f3358a = actionProvider;
    }

    public final boolean a() {
        return this.f3358a.isVisible();
    }

    public final View b(MenuItem menuItem) {
        return this.f3358a.onCreateActionView(menuItem);
    }

    public final boolean c() {
        return this.f3358a.overridesItemVisibility();
    }

    public final void d(C0150G c0150g) {
        this.c = c0150g;
        this.f3358a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        C0150G c0150g = this.c;
        if (c0150g != null) {
            MenuC0207m menuC0207m = ((C0209o) c0150g.f2846b).f3345n;
            menuC0207m.h = true;
            menuC0207m.p(true);
        }
    }
}
