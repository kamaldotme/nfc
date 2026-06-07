package j;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195a implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f3255a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f3256b;
    public Intent c;

    /* renamed from: d, reason: collision with root package name */
    public char f3257d;

    /* renamed from: f, reason: collision with root package name */
    public char f3259f;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f3260i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3261j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3262k;

    /* renamed from: e, reason: collision with root package name */
    public int f3258e = 4096;
    public int g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3263l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f3264m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3265n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3266o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f3267p = 16;

    public C0195a(Context context, CharSequence charSequence) {
        this.f3260i = context;
        this.f3255a = charSequence;
    }

    @Override // C.a
    public final ActionProviderVisibilityListenerC0210p a() {
        return null;
    }

    @Override // C.a
    public final C.a b(ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f3265n || this.f3266o) {
                this.h = drawable;
                Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.f3265n) {
                    B.b.h(mutate, this.f3263l);
                }
                if (this.f3266o) {
                    B.b.i(this.h, this.f3264m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // C.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3259f;
    }

    @Override // C.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3261j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // C.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3263l;
    }

    @Override // C.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3264m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // C.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3258e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3257d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3255a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3256b;
        return charSequence != null ? charSequence : this.f3255a;
    }

    @Override // C.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3262k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3267p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3267p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3267p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3267p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f3259f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f3267p = (z3 ? 1 : 0) | (this.f3267p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f3267p = (z3 ? 2 : 0) | (this.f3267p & (-3));
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final C.a setContentDescription(CharSequence charSequence) {
        this.f3261j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f3267p = (z3 ? 16 : 0) | (this.f3267p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3263l = colorStateList;
        this.f3265n = true;
        c();
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3264m = mode;
        this.f3266o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f3257d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c3) {
        this.f3257d = c;
        this.f3259f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3255a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3256b = charSequence;
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final C.a setTooltipText(CharSequence charSequence) {
        this.f3262k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.f3267p = (this.f3267p & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i3) {
        this.f3259f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3261j = charSequence;
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i3) {
        this.f3257d = c;
        this.f3258e = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        this.f3255a = this.f3260i.getResources().getString(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3262k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.h = y.c.b(this.f3260i, i3);
        c();
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c3, int i3, int i4) {
        this.f3257d = c;
        this.f3258e = KeyEvent.normalizeMetaState(i3);
        this.f3259f = Character.toLowerCase(c3);
        this.g = KeyEvent.normalizeMetaState(i4);
        return this;
    }
}
