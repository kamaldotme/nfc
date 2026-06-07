package C;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import j.ActionProviderVisibilityListenerC0210p;

/* loaded from: classes.dex */
public interface a extends MenuItem {
    ActionProviderVisibilityListenerC0210p a();

    a b(ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i3);

    @Override // android.view.MenuItem
    a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i3);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c3, int i3, int i4);

    @Override // android.view.MenuItem
    a setTooltipText(CharSequence charSequence);
}
