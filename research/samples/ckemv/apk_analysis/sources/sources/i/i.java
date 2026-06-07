package i;

import J.AbstractC0014m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.ActionProviderVisibilityListenerC0210p;
import j.C0209o;
import j.MenuItemC0214t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f3139A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3140B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ j f3142E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f3143a;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f3148i;

    /* renamed from: j, reason: collision with root package name */
    public int f3149j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3150k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3151l;

    /* renamed from: m, reason: collision with root package name */
    public int f3152m;

    /* renamed from: n, reason: collision with root package name */
    public char f3153n;

    /* renamed from: o, reason: collision with root package name */
    public int f3154o;

    /* renamed from: p, reason: collision with root package name */
    public char f3155p;

    /* renamed from: q, reason: collision with root package name */
    public int f3156q;

    /* renamed from: r, reason: collision with root package name */
    public int f3157r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3158s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3159t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3160u;

    /* renamed from: v, reason: collision with root package name */
    public int f3161v;

    /* renamed from: w, reason: collision with root package name */
    public int f3162w;

    /* renamed from: x, reason: collision with root package name */
    public String f3163x;

    /* renamed from: y, reason: collision with root package name */
    public String f3164y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0210p f3165z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f3141C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3144b = 0;
    public int c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3145d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3146e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3147f = true;
    public boolean g = true;

    public i(j jVar, Menu menu) {
        this.f3142E = jVar;
        this.f3143a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3142E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [i.h, android.view.MenuItem$OnMenuItemClickListener, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f3158s).setVisible(this.f3159t).setEnabled(this.f3160u).setCheckable(this.f3157r >= 1).setTitleCondensed(this.f3151l).setIcon(this.f3152m);
        int i3 = this.f3161v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f3164y;
        j jVar = this.f3142E;
        if (str != null) {
            if (jVar.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jVar.f3170d == null) {
                jVar.f3170d = j.a(jVar.c);
            }
            Object obj = jVar.f3170d;
            String str2 = this.f3164y;
            ?? obj2 = new Object();
            obj2.f3137a = obj;
            Class<?> cls = obj.getClass();
            try {
                obj2.f3138b = cls.getMethod(str2, h.c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f3157r >= 2) {
            if (menuItem instanceof C0209o) {
                C0209o c0209o = (C0209o) menuItem;
                c0209o.f3355x = (c0209o.f3355x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0214t) {
                MenuItemC0214t menuItemC0214t = (MenuItemC0214t) menuItem;
                try {
                    Method method = menuItemC0214t.f3365d;
                    C.a aVar = menuItemC0214t.c;
                    if (method == null) {
                        menuItemC0214t.f3365d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0214t.f3365d.invoke(aVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.f3163x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, j.f3166e, jVar.f3168a));
            z3 = true;
        }
        int i4 = this.f3162w;
        if (i4 > 0 && !z3) {
            menuItem.setActionView(i4);
        }
        ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p = this.f3165z;
        if (actionProviderVisibilityListenerC0210p != null && (menuItem instanceof C.a)) {
            ((C.a) menuItem).b(actionProviderVisibilityListenerC0210p);
        }
        CharSequence charSequence = this.f3139A;
        boolean z4 = menuItem instanceof C.a;
        if (z4) {
            ((C.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0014m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3140B;
        if (z4) {
            ((C.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0014m.m(menuItem, charSequence2);
        }
        char c = this.f3153n;
        int i5 = this.f3154o;
        if (z4) {
            ((C.a) menuItem).setAlphabeticShortcut(c, i5);
        } else {
            AbstractC0014m.g(menuItem, c, i5);
        }
        char c3 = this.f3155p;
        int i6 = this.f3156q;
        if (z4) {
            ((C.a) menuItem).setNumericShortcut(c3, i6);
        } else {
            AbstractC0014m.k(menuItem, c3, i6);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z4) {
                ((C.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0014m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3141C;
        if (colorStateList != null) {
            if (z4) {
                ((C.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0014m.i(menuItem, colorStateList);
            }
        }
    }
}
