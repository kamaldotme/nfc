package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import n.C0342k;

/* renamed from: j.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0191C extends A1.f implements Menu {
    public final MenuC0207m c;

    public MenuC0191C(Context context, MenuC0207m menuC0207m) {
        super(context);
        if (menuC0207m == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.c = menuC0207m;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.c.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.c.addIntentOptions(i3, i4, i5, componentName, intentArr, intent, i6, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                menuItemArr[i7] = g(menuItemArr2[i7]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.c.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0342k c0342k = (C0342k) this.f47b;
        if (c0342k != null) {
            c0342k.clear();
        }
        this.c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        return g(this.c.findItem(i3));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return g(this.c.getItem(i3));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i3, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return this.c.performIdentifierAction(i3, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        return this.c.performShortcut(i3, keyEvent, i4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        if (((C0342k) this.f47b) != null) {
            int i4 = 0;
            while (true) {
                C0342k c0342k = (C0342k) this.f47b;
                if (i4 >= c0342k.f4160d) {
                    break;
                }
                if (((C.a) c0342k.h(i4)).getGroupId() == i3) {
                    ((C0342k) this.f47b).i(i4);
                    i4--;
                }
                i4++;
            }
        }
        this.c.removeGroup(i3);
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        if (((C0342k) this.f47b) != null) {
            int i4 = 0;
            while (true) {
                C0342k c0342k = (C0342k) this.f47b;
                if (i4 >= c0342k.f4160d) {
                    break;
                }
                if (((C.a) c0342k.h(i4)).getItemId() == i3) {
                    ((C0342k) this.f47b).i(i4);
                    break;
                }
                i4++;
            }
        }
        this.c.removeItem(i3);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        this.c.setGroupCheckable(i3, z3, z4);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z3) {
        this.c.setGroupEnabled(i3, z3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z3) {
        this.c.setGroupVisible(i3, z3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.c.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return g(this.c.add(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return this.c.addSubMenu(i3);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return g(this.c.add(i3, i4, i5, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        return this.c.addSubMenu(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return g(this.c.add(i3, i4, i5, i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return this.c.addSubMenu(i3, i4, i5, i6);
    }
}
