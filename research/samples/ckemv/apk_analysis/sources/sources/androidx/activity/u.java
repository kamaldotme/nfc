package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.B;
import androidx.lifecycle.EnumC0096m;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1497a;

    /* renamed from: b, reason: collision with root package name */
    public final L1.i f1498b = new L1.i();
    public androidx.fragment.app.v c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f1499d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1500e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1501f;
    public boolean g;

    public u(Runnable runnable) {
        this.f1497a = runnable;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f1499d = i3 >= 34 ? r.f1473a.a(new m(this, 0), new m(this, 1), new n(this, 0), new n(this, 1)) : p.f1469a.a(new n(this, 2));
        }
    }

    public final void a(androidx.lifecycle.r rVar, androidx.fragment.app.v vVar) {
        X1.g.e(vVar, "onBackPressedCallback");
        androidx.lifecycle.t d3 = rVar.d();
        if (d3.c == EnumC0096m.f2044b) {
            return;
        }
        vVar.f2006b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, d3, vVar));
        d();
        vVar.c = new t(0, this, u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object obj;
        L1.i iVar = this.f1498b;
        ListIterator listIterator = iVar.listIterator(iVar.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((androidx.fragment.app.v) obj).f2005a) {
                    break;
                }
            }
        }
        androidx.fragment.app.v vVar = (androidx.fragment.app.v) obj;
        this.c = null;
        if (vVar == null) {
            Runnable runnable = this.f1497a;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        B b3 = vVar.f2007d;
        b3.w(true);
        if (b3.h.f2005a) {
            b3.J();
        } else {
            b3.g.b();
        }
    }

    public final void c(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1500e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1499d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        p pVar = p.f1469a;
        if (z3 && !this.f1501f) {
            pVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1501f = true;
        } else {
            if (z3 || !this.f1501f) {
                return;
            }
            pVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1501f = false;
        }
    }

    public final void d() {
        boolean z3 = this.g;
        L1.i iVar = this.f1498b;
        boolean z4 = false;
        if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
            Iterator it = iVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.fragment.app.v) it.next()).f2005a) {
                    z4 = true;
                    break;
                }
            }
        }
        this.g = z4;
        if (z4 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z4);
    }
}
