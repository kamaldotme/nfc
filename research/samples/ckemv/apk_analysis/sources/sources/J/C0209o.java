package j;

import a.AbstractC0059a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import f.C0150G;
import java.util.ArrayList;

/* renamed from: j.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209o implements C.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0210p f3332A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3333B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3336b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3337d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3338e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3339f;
    public Intent g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f3341j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3343l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0207m f3345n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0194F f3346o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3347p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3348q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3349r;

    /* renamed from: y, reason: collision with root package name */
    public int f3356y;

    /* renamed from: z, reason: collision with root package name */
    public View f3357z;

    /* renamed from: i, reason: collision with root package name */
    public int f3340i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f3342k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f3344m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3350s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3351t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3352u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3353v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3354w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3355x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3334C = false;

    public C0209o(MenuC0207m menuC0207m, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        this.f3345n = menuC0207m;
        this.f3335a = i4;
        this.f3336b = i3;
        this.c = i5;
        this.f3337d = i6;
        this.f3338e = charSequence;
        this.f3356y = i7;
    }

    public static void c(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // C.a
    public final ActionProviderVisibilityListenerC0210p a() {
        return this.f3332A;
    }

    @Override // C.a
    public final C.a b(ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p) {
        this.f3357z = null;
        this.f3332A = actionProviderVisibilityListenerC0210p;
        this.f3345n.p(true);
        ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p2 = this.f3332A;
        if (actionProviderVisibilityListenerC0210p2 != null) {
            actionProviderVisibilityListenerC0210p2.d(new C0150G(this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3356y & 8) == 0) {
            return false;
        }
        if (this.f3357z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3333B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3345n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3354w && (this.f3352u || this.f3353v)) {
            drawable = drawable.mutate();
            if (this.f3352u) {
                B.b.h(drawable, this.f3350s);
            }
            if (this.f3353v) {
                B.b.i(drawable, this.f3351t);
            }
            this.f3354w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p;
        if ((this.f3356y & 8) == 0) {
            return false;
        }
        if (this.f3357z == null && (actionProviderVisibilityListenerC0210p = this.f3332A) != null) {
            this.f3357z = actionProviderVisibilityListenerC0210p.b(this);
        }
        return this.f3357z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3333B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3345n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f3355x & 32) == 32;
    }

    public final void g(boolean z3) {
        if (z3) {
            this.f3355x |= 32;
        } else {
            this.f3355x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3357z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p = this.f3332A;
        if (actionProviderVisibilityListenerC0210p == null) {
            return null;
        }
        View b3 = actionProviderVisibilityListenerC0210p.b(this);
        this.f3357z = b3;
        return b3;
    }

    @Override // C.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3342k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3341j;
    }

    @Override // C.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3348q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3336b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3343l;
        if (drawable != null) {
            return d(drawable);
        }
        int i3 = this.f3344m;
        if (i3 == 0) {
            return null;
        }
        Drawable s3 = AbstractC0059a.s(this.f3345n.f3309a, i3);
        this.f3344m = 0;
        this.f3343l = s3;
        return d(s3);
    }

    @Override // C.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3350s;
    }

    @Override // C.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3351t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3335a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // C.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3340i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3346o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3338e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3339f;
        return charSequence != null ? charSequence : this.f3338e;
    }

    @Override // C.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3349r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3346o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3334C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3355x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3355x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3355x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p = this.f3332A;
        return (actionProviderVisibilityListenerC0210p == null || !actionProviderVisibilityListenerC0210p.c()) ? (this.f3355x & 8) == 0 : (this.f3355x & 8) == 0 && this.f3332A.a();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f3357z = view;
        this.f3332A = null;
        if (view != null && view.getId() == -1 && (i3 = this.f3335a) > 0) {
            view.setId(i3);
        }
        MenuC0207m menuC0207m = this.f3345n;
        menuC0207m.f3316k = true;
        menuC0207m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f3341j == c) {
            return this;
        }
        this.f3341j = Character.toLowerCase(c);
        this.f3345n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i3 = this.f3355x;
        int i4 = (z3 ? 1 : 0) | (i3 & (-2));
        this.f3355x = i4;
        if (i3 != i4) {
            this.f3345n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i3 = this.f3355x;
        if ((i3 & 4) != 0) {
            MenuC0207m menuC0207m = this.f3345n;
            menuC0207m.getClass();
            ArrayList arrayList = menuC0207m.f3313f;
            int size = arrayList.size();
            menuC0207m.w();
            for (int i4 = 0; i4 < size; i4++) {
                C0209o c0209o = (C0209o) arrayList.get(i4);
                if (c0209o.f3336b == this.f3336b && (c0209o.f3355x & 4) != 0 && c0209o.isCheckable()) {
                    boolean z4 = c0209o == this;
                    int i5 = c0209o.f3355x;
                    int i6 = (z4 ? 2 : 0) | (i5 & (-3));
                    c0209o.f3355x = i6;
                    if (i5 != i6) {
                        c0209o.f3345n.p(false);
                    }
                }
            }
            menuC0207m.v();
        } else {
            int i7 = (i3 & (-3)) | (z3 ? 2 : 0);
            this.f3355x = i7;
            if (i3 != i7) {
                this.f3345n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f3355x |= 16;
        } else {
            this.f3355x &= -17;
        }
        this.f3345n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3344m = 0;
        this.f3343l = drawable;
        this.f3354w = true;
        this.f3345n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3350s = colorStateList;
        this.f3352u = true;
        this.f3354w = true;
        this.f3345n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3351t = mode;
        this.f3353v = true;
        this.f3354w = true;
        this.f3345n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.f3345n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3333B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3347p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c3) {
        this.h = c;
        this.f3341j = Character.toLowerCase(c3);
        this.f3345n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3356y = i3;
        MenuC0207m menuC0207m = this.f3345n;
        menuC0207m.f3316k = true;
        menuC0207m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3338e = charSequence;
        this.f3345n.p(false);
        SubMenuC0194F subMenuC0194F = this.f3346o;
        if (subMenuC0194F != null) {
            subMenuC0194F.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3339f = charSequence;
        this.f3345n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i3 = this.f3355x;
        int i4 = (z3 ? 0 : 8) | (i3 & (-9));
        this.f3355x = i4;
        if (i3 != i4) {
            MenuC0207m menuC0207m = this.f3345n;
            menuC0207m.h = true;
            menuC0207m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3338e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // C.a, android.view.MenuItem
    public final C.a setContentDescription(CharSequence charSequence) {
        this.f3348q = charSequence;
        this.f3345n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final C.a setTooltipText(CharSequence charSequence) {
        this.f3349r = charSequence;
        this.f3345n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i3) {
        if (this.f3341j == c && this.f3342k == i3) {
            return this;
        }
        this.f3341j = Character.toLowerCase(c);
        this.f3342k = KeyEvent.normalizeMetaState(i3);
        this.f3345n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i3) {
        if (this.h == c && this.f3340i == i3) {
            return this;
        }
        this.h = c;
        this.f3340i = KeyEvent.normalizeMetaState(i3);
        this.f3345n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c3, int i3, int i4) {
        this.h = c;
        this.f3340i = KeyEvent.normalizeMetaState(i3);
        this.f3341j = Character.toLowerCase(c3);
        this.f3342k = KeyEvent.normalizeMetaState(i4);
        this.f3345n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f3343l = null;
        this.f3344m = i3;
        this.f3354w = true;
        this.f3345n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f3345n.f3309a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.f3345n.f3309a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f3357z = inflate;
        this.f3332A = null;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f3335a) > 0) {
            inflate.setId(i4);
        }
        MenuC0207m menuC0207m = this.f3345n;
        menuC0207m.f3316k = true;
        menuC0207m.p(true);
        return this;
    }
}
