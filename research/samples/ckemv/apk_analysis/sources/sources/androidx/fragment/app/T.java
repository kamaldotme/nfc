package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f1881a;

    /* renamed from: b, reason: collision with root package name */
    public int f1882b;
    public final AbstractComponentCallbacksC0077n c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1883d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1884e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1885f;
    public boolean g;
    public final G h;

    public T(int i3, int i4, G g, F.d dVar) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
        this.f1883d = new ArrayList();
        this.f1884e = new HashSet();
        this.f1885f = false;
        this.g = false;
        this.f1881a = i3;
        this.f1882b = i4;
        this.c = abstractComponentCallbacksC0077n;
        dVar.b(new A.h(25, this));
        this.h = g;
    }

    public final void a() {
        if (this.f1885f) {
            return;
        }
        this.f1885f = true;
        HashSet hashSet = this.f1884e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((F.d) it.next()).a();
        }
    }

    public final void b() {
        if (!this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.g = true;
            Iterator it = this.f1883d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i3, int i4) {
        int a3 = q.h.a(i4);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (a3 == 0) {
            if (this.f1881a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC0077n);
                }
                this.f1881a = i3;
                return;
            }
            return;
        }
        if (a3 != 1) {
            if (a3 != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC0077n);
            }
            this.f1881a = 1;
            this.f1882b = 3;
            return;
        }
        if (this.f1881a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC0077n);
            }
            this.f1881a = 2;
            this.f1882b = 2;
        }
    }

    public final void d() {
        if (this.f1882b == 2) {
            G g = this.h;
            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
            View findFocus = abstractComponentCallbacksC0077n.f1957F.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC0077n.f().f1951k = findFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    findFocus.toString();
                    abstractComponentCallbacksC0077n.toString();
                }
            }
            View x2 = this.c.x();
            if (x2.getParent() == null) {
                g.b();
                x2.setAlpha(0.0f);
            }
            if (x2.getAlpha() == 0.0f && x2.getVisibility() == 0) {
                x2.setVisibility(4);
            }
            C0076m c0076m = abstractComponentCallbacksC0077n.f1960I;
            x2.setAlpha(c0076m == null ? 1.0f : c0076m.f1950j);
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + X.d.v(this.f1881a) + "} {mLifecycleImpact = " + X.d.u(this.f1882b) + "} {mFragment = " + this.c + "}";
    }
}
