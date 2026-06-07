package A1;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import androidx.fragment.app.T;
import f.s;
import f.v;
import j.MenuItemC0214t;
import java.util.HashSet;
import n.C0342k;
import p1.C0356a;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public Object f46a;

    /* renamed from: b, reason: collision with root package name */
    public Object f47b;

    public f(Context context) {
        this.f46a = context;
    }

    public void c() {
        s sVar = (s) this.f46a;
        if (sVar != null) {
            try {
                ((v) this.f47b).f2983l.unregisterReceiver(sVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f46a = null;
        }
    }

    public void d() {
        T t3 = (T) this.f46a;
        HashSet hashSet = t3.f1884e;
        if (hashSet.remove((F.d) this.f47b) && hashSet.isEmpty()) {
            t3.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof C.a)) {
            return menuItem;
        }
        C.a aVar = (C.a) menuItem;
        if (((C0342k) this.f47b) == null) {
            this.f47b = new C0342k();
        }
        MenuItem menuItem2 = (MenuItem) ((C0342k) this.f47b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0214t menuItemC0214t = new MenuItemC0214t((Context) this.f46a, aVar);
        ((C0342k) this.f47b).put(aVar, menuItemC0214t);
        return menuItemC0214t;
    }

    public boolean h() {
        T t3 = (T) this.f46a;
        int c = X.d.c(t3.c.f1957F);
        int i3 = t3.f1881a;
        return c == i3 || !(c == 2 || i3 == 2);
    }

    public abstract void i();

    public abstract String j();

    public void k() {
        c();
        IntentFilter e3 = e();
        if (e3.countActions() == 0) {
            return;
        }
        if (((s) this.f46a) == null) {
            this.f46a = new s(0, this);
        }
        ((v) this.f47b).f2983l.registerReceiver((s) this.f46a, e3);
    }

    public f(C0356a c0356a) {
        this.f46a = c0356a;
        this.f47b = new v0.m(c0356a);
    }

    public f(T t3, F.d dVar) {
        this.f46a = t3;
        this.f47b = dVar;
    }

    public f(v vVar) {
        this.f47b = vVar;
    }
}
