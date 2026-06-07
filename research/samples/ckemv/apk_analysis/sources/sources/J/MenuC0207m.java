package j;

import J.V;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: j.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0207m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3308y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f3309a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f3310b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3311d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0205k f3312e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3313f;
    public final ArrayList g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3314i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3315j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3316k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3318m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3319n;

    /* renamed from: o, reason: collision with root package name */
    public View f3320o;

    /* renamed from: v, reason: collision with root package name */
    public C0209o f3327v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3329x;

    /* renamed from: l, reason: collision with root package name */
    public int f3317l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3321p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3322q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3323r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3324s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3325t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f3326u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f3328w = false;

    public MenuC0207m(Context context) {
        Resources resources;
        int identifier;
        boolean z3 = false;
        this.f3309a = context;
        Resources resources2 = context.getResources();
        this.f3310b = resources2;
        this.f3313f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.f3314i = new ArrayList();
        this.f3315j = new ArrayList();
        this.f3316k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : V.b(viewConfiguration)) {
                z3 = true;
            }
        }
        this.f3311d = z3;
    }

    public final C0209o a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (f3308y[i7] << 16) | (65535 & i5);
        C0209o c0209o = new C0209o(this, i3, i4, i5, i8, charSequence, this.f3317l);
        ArrayList arrayList = this.f3313f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((C0209o) arrayList.get(size)).f3337d <= i8) {
                i6 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i6, c0209o);
        p(true);
        return c0209o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f3309a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0209o a3 = a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = a3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC0220z interfaceC0220z, Context context) {
        this.f3326u.add(new WeakReference(interfaceC0220z));
        interfaceC0220z.e(context, this);
        this.f3316k = true;
    }

    public final void c(boolean z3) {
        if (this.f3324s) {
            return;
        }
        this.f3324s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3326u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0220z interfaceC0220z = (InterfaceC0220z) weakReference.get();
            if (interfaceC0220z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0220z.a(this, z3);
            }
        }
        this.f3324s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0209o c0209o = this.f3327v;
        if (c0209o != null) {
            d(c0209o);
        }
        this.f3313f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3319n = null;
        this.f3318m = null;
        this.f3320o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0209o c0209o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3326u;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3327v == c0209o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0220z interfaceC0220z = (InterfaceC0220z) weakReference.get();
                if (interfaceC0220z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = interfaceC0220z.d(c0209o);
                    if (z3) {
                        break;
                    }
                }
            }
            v();
            if (z3) {
                this.f3327v = null;
            }
        }
        return z3;
    }

    public boolean e(MenuC0207m menuC0207m, MenuItem menuItem) {
        InterfaceC0205k interfaceC0205k = this.f3312e;
        return interfaceC0205k != null && interfaceC0205k.g(menuC0207m, menuItem);
    }

    public boolean f(C0209o c0209o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3326u;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0220z interfaceC0220z = (InterfaceC0220z) weakReference.get();
            if (interfaceC0220z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = interfaceC0220z.k(c0209o);
                if (z3) {
                    break;
                }
            }
        }
        v();
        if (z3) {
            this.f3327v = c0209o;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f3313f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0209o c0209o = (C0209o) arrayList.get(i4);
            if (c0209o.f3335a == i3) {
                return c0209o;
            }
            if (c0209o.hasSubMenu() && (findItem = c0209o.f3346o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0209o g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3325t;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0209o) arrayList.get(0);
        }
        boolean n3 = n();
        for (int i4 = 0; i4 < size; i4++) {
            C0209o c0209o = (C0209o) arrayList.get(i4);
            char c = n3 ? c0209o.f3341j : c0209o.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n3 && c == '\b' && i3 == 67))) {
                return c0209o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f3313f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        int i4;
        boolean n3 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList2 = this.f3313f;
            int size = arrayList2.size();
            for (0; i4 < size; i4 + 1) {
                C0209o c0209o = (C0209o) arrayList2.get(i4);
                if (c0209o.hasSubMenu()) {
                    c0209o.f3346o.h(arrayList, i3, keyEvent);
                }
                char c = n3 ? c0209o.f3341j : c0209o.h;
                if ((modifiers & 69647) == ((n3 ? c0209o.f3342k : c0209o.f3340i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (n3 && c == '\b') {
                            i4 = i3 != 67 ? i4 + 1 : 0;
                        }
                    }
                    if (c0209o.isEnabled()) {
                        arrayList.add(c0209o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3329x) {
            return true;
        }
        ArrayList arrayList = this.f3313f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C0209o) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l3 = l();
        if (this.f3316k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3326u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0220z interfaceC0220z = (InterfaceC0220z) weakReference.get();
                if (interfaceC0220z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= interfaceC0220z.g();
                }
            }
            ArrayList arrayList = this.f3314i;
            ArrayList arrayList2 = this.f3315j;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = l3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0209o c0209o = (C0209o) l3.get(i3);
                    if (c0209o.f()) {
                        arrayList.add(c0209o);
                    } else {
                        arrayList2.add(c0209o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3316k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0207m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z3 = this.h;
        ArrayList arrayList = this.g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3313f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0209o c0209o = (C0209o) arrayList2.get(i3);
            if (c0209o.isVisible()) {
                arrayList.add(c0209o);
            }
        }
        this.h = false;
        this.f3316k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3328w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f3311d;
    }

    public final void p(boolean z3) {
        if (this.f3321p) {
            this.f3322q = true;
            if (z3) {
                this.f3323r = true;
                return;
            }
            return;
        }
        if (z3) {
            this.h = true;
            this.f3316k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3326u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0220z interfaceC0220z = (InterfaceC0220z) weakReference.get();
            if (interfaceC0220z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0220z.c();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return q(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        C0209o g = g(i3, keyEvent);
        boolean q3 = g != null ? q(g, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return q3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, InterfaceC0220z interfaceC0220z, int i3) {
        boolean z3;
        C0209o c0209o = (C0209o) menuItem;
        if (c0209o == null || !c0209o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0209o.f3347p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0209o)) {
            MenuC0207m menuC0207m = c0209o.f3345n;
            if (!menuC0207m.e(menuC0207m, c0209o)) {
                Intent intent = c0209o.g;
                if (intent != null) {
                    try {
                        menuC0207m.f3309a.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p = c0209o.f3332A;
                if (actionProviderVisibilityListenerC0210p == null || !actionProviderVisibilityListenerC0210p.f3358a.onPerformDefaultAction()) {
                    z3 = false;
                    ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p2 = c0209o.f3332A;
                    boolean z4 = actionProviderVisibilityListenerC0210p2 == null && actionProviderVisibilityListenerC0210p2.f3358a.hasSubMenu();
                    if (!c0209o.e()) {
                        z3 |= c0209o.expandActionView();
                        if (z3) {
                            c(true);
                        }
                    } else if (c0209o.hasSubMenu() || z4) {
                        if ((i3 & 4) == 0) {
                            c(false);
                        }
                        if (!c0209o.hasSubMenu()) {
                            SubMenuC0194F subMenuC0194F = new SubMenuC0194F(this.f3309a, this, c0209o);
                            c0209o.f3346o = subMenuC0194F;
                            subMenuC0194F.setHeaderTitle(c0209o.f3338e);
                        }
                        SubMenuC0194F subMenuC0194F2 = c0209o.f3346o;
                        if (z4) {
                            actionProviderVisibilityListenerC0210p2.f3359b.getClass();
                            actionProviderVisibilityListenerC0210p2.f3358a.onPrepareSubMenu(subMenuC0194F2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f3326u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0220z != null ? interfaceC0220z.j(subMenuC0194F2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0220z interfaceC0220z2 = (InterfaceC0220z) weakReference.get();
                                if (interfaceC0220z2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0220z2.j(subMenuC0194F2);
                                }
                            }
                        }
                        z3 |= r0;
                        if (!z3) {
                            c(true);
                        }
                    } else if ((i3 & 1) == 0) {
                        c(true);
                    }
                    return z3;
                }
            }
        }
        z3 = true;
        ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p22 = c0209o.f3332A;
        if (actionProviderVisibilityListenerC0210p22 == null) {
        }
        if (!c0209o.e()) {
        }
        return z3;
    }

    public final void r(InterfaceC0220z interfaceC0220z) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3326u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0220z interfaceC0220z2 = (InterfaceC0220z) weakReference.get();
            if (interfaceC0220z2 == null || interfaceC0220z2 == interfaceC0220z) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f3313f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((C0209o) arrayList.get(i5)).f3336b == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((C0209o) arrayList.get(i5)).f3336b != i3) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f3313f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f3313f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C0209o) arrayList.get(i4)).f3335a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f3313f;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f3313f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0194F) item.getSubMenu()).s(bundle);
            }
        }
        int i4 = bundle.getInt("android:menu:expandedactionview");
        if (i4 <= 0 || (findItem = findItem(i4)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        ArrayList arrayList = this.f3313f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0209o c0209o = (C0209o) arrayList.get(i4);
            if (c0209o.f3336b == i3) {
                c0209o.f3355x = (c0209o.f3355x & (-5)) | (z4 ? 4 : 0);
                c0209o.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f3328w = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z3) {
        ArrayList arrayList = this.f3313f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0209o c0209o = (C0209o) arrayList.get(i4);
            if (c0209o.f3336b == i3) {
                c0209o.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z3) {
        ArrayList arrayList = this.f3313f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C0209o c0209o = (C0209o) arrayList.get(i4);
            if (c0209o.f3336b == i3) {
                int i5 = c0209o.f3355x;
                int i6 = (i5 & (-9)) | (z3 ? 0 : 8);
                c0209o.f3355x = i6;
                if (i5 != i6) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.c = z3;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3313f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f3313f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0194F) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i3, CharSequence charSequence, int i4, Drawable drawable, View view) {
        if (view != null) {
            this.f3320o = view;
            this.f3318m = null;
            this.f3319n = null;
        } else {
            if (i3 > 0) {
                this.f3318m = this.f3310b.getText(i3);
            } else if (charSequence != null) {
                this.f3318m = charSequence;
            }
            if (i4 > 0) {
                this.f3319n = y.c.b(this.f3309a, i4);
            } else if (drawable != null) {
                this.f3319n = drawable;
            }
            this.f3320o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3321p = false;
        if (this.f3322q) {
            this.f3322q = false;
            p(this.f3323r);
        }
    }

    public final void w() {
        if (this.f3321p) {
            return;
        }
        this.f3321p = true;
        this.f3322q = false;
        this.f3323r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f3310b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f3310b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        C0209o a3 = a(i3, i4, i5, charSequence);
        SubMenuC0194F subMenuC0194F = new SubMenuC0194F(this.f3309a, this, a3);
        a3.f3346o = subMenuC0194F;
        subMenuC0194F.setHeaderTitle(a3.f3338e);
        return subMenuC0194F;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f3310b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f3310b.getString(i6));
    }
}
