package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0099p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final v0.r f1855a;

    /* renamed from: b, reason: collision with root package name */
    public final v0.m f1856b;
    public final AbstractComponentCallbacksC0077n c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1857d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1858e = -1;

    public G(v0.r rVar, v0.m mVar, AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        this.f1855a = rVar;
        this.f1856b = mVar;
        this.c = abstractComponentCallbacksC0077n;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        Bundle bundle = abstractComponentCallbacksC0077n.c;
        abstractComponentCallbacksC0077n.f1985u.I();
        abstractComponentCallbacksC0077n.f1969b = 3;
        abstractComponentCallbacksC0077n.D = true;
        if (Log.isLoggable("FragmentManager", 3)) {
            abstractComponentCallbacksC0077n.toString();
        }
        View view = abstractComponentCallbacksC0077n.f1957F;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0077n.c;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0077n.f1970d;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0077n.f1970d = null;
            }
            if (abstractComponentCallbacksC0077n.f1957F != null) {
                abstractComponentCallbacksC0077n.f1965N.f1877d.d(abstractComponentCallbacksC0077n.f1971e);
                abstractComponentCallbacksC0077n.f1971e = null;
            }
            abstractComponentCallbacksC0077n.D = false;
            abstractComponentCallbacksC0077n.t(bundle2);
            if (!abstractComponentCallbacksC0077n.D) {
                throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0077n + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0077n.f1957F != null) {
                abstractComponentCallbacksC0077n.f1965N.e(EnumC0095l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0077n.c = null;
        B b3 = abstractComponentCallbacksC0077n.f1985u;
        b3.f1830y = false;
        b3.f1831z = false;
        b3.f1807F.h = false;
        b3.s(4);
        this.f1855a.c(false);
    }

    public final void b() {
        View view;
        View view2;
        v0.m mVar = this.f1856b;
        mVar.getClass();
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        ViewGroup viewGroup = abstractComponentCallbacksC0077n.f1956E;
        int i3 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) mVar.c;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0077n);
            int i4 = indexOf - 1;
            while (true) {
                if (i4 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = (AbstractComponentCallbacksC0077n) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0077n2.f1956E == viewGroup && (view = abstractComponentCallbacksC0077n2.f1957F) != null) {
                            i3 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n3 = (AbstractComponentCallbacksC0077n) arrayList.get(i4);
                    if (abstractComponentCallbacksC0077n3.f1956E == viewGroup && (view2 = abstractComponentCallbacksC0077n3.f1957F) != null) {
                        i3 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i4--;
                }
            }
        }
        abstractComponentCallbacksC0077n.f1956E.addView(abstractComponentCallbacksC0077n.f1957F, i3);
    }

    public final void c() {
        G g;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = abstractComponentCallbacksC0077n.h;
        v0.m mVar = this.f1856b;
        if (abstractComponentCallbacksC0077n2 != null) {
            g = (G) ((HashMap) mVar.f5087d).get(abstractComponentCallbacksC0077n2.f1972f);
            if (g == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0077n + " declared target fragment " + abstractComponentCallbacksC0077n.h + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0077n.f1973i = abstractComponentCallbacksC0077n.h.f1972f;
            abstractComponentCallbacksC0077n.h = null;
        } else {
            String str = abstractComponentCallbacksC0077n.f1973i;
            if (str != null) {
                g = (G) ((HashMap) mVar.f5087d).get(str);
                if (g == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC0077n);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(X.d.j(sb, abstractComponentCallbacksC0077n.f1973i, " that does not belong to this FragmentManager!"));
                }
            } else {
                g = null;
            }
        }
        if (g != null) {
            g.k();
        }
        B b3 = abstractComponentCallbacksC0077n.f1983s;
        abstractComponentCallbacksC0077n.f1984t = b3.f1819n;
        abstractComponentCallbacksC0077n.f1986v = b3.f1821p;
        v0.r rVar = this.f1855a;
        rVar.j(false);
        ArrayList arrayList = abstractComponentCallbacksC0077n.f1968Q;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            throw null;
        }
        arrayList.clear();
        abstractComponentCallbacksC0077n.f1985u.b(abstractComponentCallbacksC0077n.f1984t, abstractComponentCallbacksC0077n.e(), abstractComponentCallbacksC0077n);
        abstractComponentCallbacksC0077n.f1969b = 0;
        abstractComponentCallbacksC0077n.D = false;
        abstractComponentCallbacksC0077n.k(abstractComponentCallbacksC0077n.f1984t.f1996e);
        if (!abstractComponentCallbacksC0077n.D) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0077n + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0077n.f1983s.f1817l.iterator();
        while (it2.hasNext()) {
            ((E) it2.next()).f();
        }
        B b4 = abstractComponentCallbacksC0077n.f1985u;
        b4.f1830y = false;
        b4.f1831z = false;
        b4.f1807F.h = false;
        b4.s(0);
        rVar.d(false);
    }

    public final int d() {
        T t3;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (abstractComponentCallbacksC0077n.f1983s == null) {
            return abstractComponentCallbacksC0077n.f1969b;
        }
        int i3 = this.f1858e;
        int ordinal = abstractComponentCallbacksC0077n.f1963L.ordinal();
        if (ordinal == 1) {
            i3 = Math.min(i3, 0);
        } else if (ordinal == 2) {
            i3 = Math.min(i3, 1);
        } else if (ordinal == 3) {
            i3 = Math.min(i3, 5);
        } else if (ordinal != 4) {
            i3 = Math.min(i3, -1);
        }
        if (abstractComponentCallbacksC0077n.f1978n) {
            if (abstractComponentCallbacksC0077n.f1979o) {
                i3 = Math.max(this.f1858e, 2);
                View view = abstractComponentCallbacksC0077n.f1957F;
                if (view != null && view.getParent() == null) {
                    i3 = Math.min(i3, 2);
                }
            } else {
                i3 = this.f1858e < 4 ? Math.min(i3, abstractComponentCallbacksC0077n.f1969b) : Math.min(i3, 1);
            }
        }
        if (!abstractComponentCallbacksC0077n.f1976l) {
            i3 = Math.min(i3, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0077n.f1956E;
        if (viewGroup != null) {
            C0070g g = C0070g.g(viewGroup, abstractComponentCallbacksC0077n.j().C());
            g.getClass();
            T e3 = g.e(abstractComponentCallbacksC0077n);
            r6 = e3 != null ? e3.f1882b : 0;
            Iterator it = g.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = (T) it.next();
                if (t3.c.equals(abstractComponentCallbacksC0077n) && !t3.f1885f) {
                    break;
                }
            }
            if (t3 != null && (r6 == 0 || r6 == 1)) {
                r6 = t3.f1882b;
            }
        }
        if (r6 == 2) {
            i3 = Math.min(i3, 6);
        } else if (r6 == 3) {
            i3 = Math.max(i3, 3);
        } else if (abstractComponentCallbacksC0077n.f1977m) {
            i3 = abstractComponentCallbacksC0077n.f1982r > 0 ? Math.min(i3, 1) : Math.min(i3, -1);
        }
        if (abstractComponentCallbacksC0077n.f1958G && abstractComponentCallbacksC0077n.f1969b < 5) {
            i3 = Math.min(i3, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        return i3;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        final AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        if (abstractComponentCallbacksC0077n.f1962K) {
            Bundle bundle = abstractComponentCallbacksC0077n.c;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0077n.f1985u.N(parcelable);
                B b3 = abstractComponentCallbacksC0077n.f1985u;
                b3.f1830y = false;
                b3.f1831z = false;
                b3.f1807F.h = false;
                b3.s(1);
            }
            abstractComponentCallbacksC0077n.f1969b = 1;
            return;
        }
        v0.r rVar = this.f1855a;
        rVar.k(false);
        Bundle bundle2 = abstractComponentCallbacksC0077n.c;
        abstractComponentCallbacksC0077n.f1985u.I();
        abstractComponentCallbacksC0077n.f1969b = 1;
        abstractComponentCallbacksC0077n.D = false;
        abstractComponentCallbacksC0077n.f1964M.a(new InterfaceC0099p() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.InterfaceC0099p
            public final void b(androidx.lifecycle.r rVar2, EnumC0095l enumC0095l) {
                View view;
                if (enumC0095l != EnumC0095l.ON_STOP || (view = AbstractComponentCallbacksC0077n.this.f1957F) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0077n.f1967P.d(bundle2);
        abstractComponentCallbacksC0077n.l(bundle2);
        abstractComponentCallbacksC0077n.f1962K = true;
        if (abstractComponentCallbacksC0077n.D) {
            abstractComponentCallbacksC0077n.f1964M.d(EnumC0095l.ON_CREATE);
            rVar.e(false);
        } else {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0077n + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (abstractComponentCallbacksC0077n.f1978n) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        LayoutInflater p3 = abstractComponentCallbacksC0077n.p(abstractComponentCallbacksC0077n.c);
        ViewGroup viewGroup = abstractComponentCallbacksC0077n.f1956E;
        if (viewGroup == null) {
            int i3 = abstractComponentCallbacksC0077n.f1988x;
            if (i3 == 0) {
                viewGroup = null;
            } else {
                if (i3 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0077n + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0077n.f1983s.f1820o.C(i3);
                if (viewGroup == null && !abstractComponentCallbacksC0077n.f1980p) {
                    try {
                        str = abstractComponentCallbacksC0077n.w().getResources().getResourceName(abstractComponentCallbacksC0077n.f1988x);
                    } catch (Resources.NotFoundException unused) {
                        str = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0077n.f1988x) + " (" + str + ") for fragment " + abstractComponentCallbacksC0077n);
                }
            }
        }
        abstractComponentCallbacksC0077n.f1956E = viewGroup;
        abstractComponentCallbacksC0077n.u(p3, viewGroup, abstractComponentCallbacksC0077n.c);
        View view = abstractComponentCallbacksC0077n.f1957F;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0077n.f1957F.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0077n);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0077n.f1990z) {
                abstractComponentCallbacksC0077n.f1957F.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0077n.f1957F;
            WeakHashMap weakHashMap = J.T.f402a;
            if (J.E.b(view2)) {
                J.F.c(abstractComponentCallbacksC0077n.f1957F);
            } else {
                View view3 = abstractComponentCallbacksC0077n.f1957F;
                view3.addOnAttachStateChangeListener(new X0.n(1, view3));
            }
            abstractComponentCallbacksC0077n.f1985u.s(2);
            this.f1855a.p(false);
            int visibility = abstractComponentCallbacksC0077n.f1957F.getVisibility();
            abstractComponentCallbacksC0077n.f().f1950j = abstractComponentCallbacksC0077n.f1957F.getAlpha();
            if (abstractComponentCallbacksC0077n.f1956E != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0077n.f1957F.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0077n.f().f1951k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        findFocus.toString();
                        Objects.toString(abstractComponentCallbacksC0077n);
                    }
                }
                abstractComponentCallbacksC0077n.f1957F.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0077n.f1969b = 2;
    }

    public final void g() {
        boolean z3;
        AbstractComponentCallbacksC0077n k2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        boolean z4 = abstractComponentCallbacksC0077n.f1977m && abstractComponentCallbacksC0077n.f1982r <= 0;
        v0.m mVar = this.f1856b;
        if (!z4) {
            D d3 = (D) mVar.f5088e;
            if (d3.c.containsKey(abstractComponentCallbacksC0077n.f1972f) && d3.f1840f && !d3.g) {
                String str = abstractComponentCallbacksC0077n.f1973i;
                if (str != null && (k2 = mVar.k(str)) != null && k2.f1954B) {
                    abstractComponentCallbacksC0077n.h = k2;
                }
                abstractComponentCallbacksC0077n.f1969b = 0;
                return;
            }
        }
        C0080q c0080q = abstractComponentCallbacksC0077n.f1984t;
        if (c0080q instanceof androidx.lifecycle.P) {
            z3 = ((D) mVar.f5088e).g;
        } else {
            z3 = c0080q.f1996e instanceof Activity ? !((Activity) r7).isChangingConfigurations() : true;
        }
        if (z4 || z3) {
            D d4 = (D) mVar.f5088e;
            if (Log.isLoggable("FragmentManager", 3)) {
                d4.getClass();
                Objects.toString(abstractComponentCallbacksC0077n);
            }
            HashMap hashMap = d4.f1838d;
            D d5 = (D) hashMap.get(abstractComponentCallbacksC0077n.f1972f);
            if (d5 != null) {
                d5.a();
                hashMap.remove(abstractComponentCallbacksC0077n.f1972f);
            }
            HashMap hashMap2 = d4.f1839e;
            androidx.lifecycle.O o3 = (androidx.lifecycle.O) hashMap2.get(abstractComponentCallbacksC0077n.f1972f);
            if (o3 != null) {
                o3.a();
                hashMap2.remove(abstractComponentCallbacksC0077n.f1972f);
            }
        }
        abstractComponentCallbacksC0077n.f1985u.k();
        abstractComponentCallbacksC0077n.f1964M.d(EnumC0095l.ON_DESTROY);
        abstractComponentCallbacksC0077n.f1969b = 0;
        abstractComponentCallbacksC0077n.f1962K = false;
        abstractComponentCallbacksC0077n.D = true;
        this.f1855a.g(false);
        Iterator it = mVar.m().iterator();
        while (it.hasNext()) {
            G g = (G) it.next();
            if (g != null) {
                String str2 = abstractComponentCallbacksC0077n.f1972f;
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = g.c;
                if (str2.equals(abstractComponentCallbacksC0077n2.f1973i)) {
                    abstractComponentCallbacksC0077n2.h = abstractComponentCallbacksC0077n;
                    abstractComponentCallbacksC0077n2.f1973i = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0077n.f1973i;
        if (str3 != null) {
            abstractComponentCallbacksC0077n.h = mVar.k(str3);
        }
        mVar.D(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0077n.f1956E;
        if (viewGroup != null && (view = abstractComponentCallbacksC0077n.f1957F) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0077n.v();
        this.f1855a.q(false);
        abstractComponentCallbacksC0077n.f1956E = null;
        abstractComponentCallbacksC0077n.f1957F = null;
        abstractComponentCallbacksC0077n.f1965N = null;
        abstractComponentCallbacksC0077n.f1966O.e(null);
        abstractComponentCallbacksC0077n.f1979o = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        abstractComponentCallbacksC0077n.f1969b = -1;
        abstractComponentCallbacksC0077n.D = false;
        abstractComponentCallbacksC0077n.o();
        if (!abstractComponentCallbacksC0077n.D) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0077n + " did not call through to super.onDetach()");
        }
        B b3 = abstractComponentCallbacksC0077n.f1985u;
        if (!b3.f1803A) {
            b3.k();
            abstractComponentCallbacksC0077n.f1985u = new B();
        }
        this.f1855a.h(false);
        abstractComponentCallbacksC0077n.f1969b = -1;
        abstractComponentCallbacksC0077n.f1984t = null;
        abstractComponentCallbacksC0077n.f1986v = null;
        abstractComponentCallbacksC0077n.f1983s = null;
        if (!abstractComponentCallbacksC0077n.f1977m || abstractComponentCallbacksC0077n.f1982r > 0) {
            D d3 = (D) this.f1856b.f5088e;
            if (d3.c.containsKey(abstractComponentCallbacksC0077n.f1972f) && d3.f1840f && !d3.g) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        abstractComponentCallbacksC0077n.f1964M = new androidx.lifecycle.t(abstractComponentCallbacksC0077n);
        abstractComponentCallbacksC0077n.f1967P = new androidx.activity.l(abstractComponentCallbacksC0077n);
        abstractComponentCallbacksC0077n.f1972f = UUID.randomUUID().toString();
        abstractComponentCallbacksC0077n.f1976l = false;
        abstractComponentCallbacksC0077n.f1977m = false;
        abstractComponentCallbacksC0077n.f1978n = false;
        abstractComponentCallbacksC0077n.f1979o = false;
        abstractComponentCallbacksC0077n.f1980p = false;
        abstractComponentCallbacksC0077n.f1982r = 0;
        abstractComponentCallbacksC0077n.f1983s = null;
        abstractComponentCallbacksC0077n.f1985u = new B();
        abstractComponentCallbacksC0077n.f1984t = null;
        abstractComponentCallbacksC0077n.f1987w = 0;
        abstractComponentCallbacksC0077n.f1988x = 0;
        abstractComponentCallbacksC0077n.f1989y = null;
        abstractComponentCallbacksC0077n.f1990z = false;
        abstractComponentCallbacksC0077n.f1953A = false;
    }

    public final void j() {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (abstractComponentCallbacksC0077n.f1978n && abstractComponentCallbacksC0077n.f1979o && !abstractComponentCallbacksC0077n.f1981q) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC0077n);
            }
            abstractComponentCallbacksC0077n.u(abstractComponentCallbacksC0077n.p(abstractComponentCallbacksC0077n.c), null, abstractComponentCallbacksC0077n.c);
            View view = abstractComponentCallbacksC0077n.f1957F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0077n.f1957F.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0077n);
                if (abstractComponentCallbacksC0077n.f1990z) {
                    abstractComponentCallbacksC0077n.f1957F.setVisibility(8);
                }
                abstractComponentCallbacksC0077n.f1985u.s(2);
                this.f1855a.p(false);
                abstractComponentCallbacksC0077n.f1969b = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z3 = this.f1857d;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (z3) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC0077n);
                return;
            }
            return;
        }
        try {
            this.f1857d = true;
            while (true) {
                int d3 = d();
                int i3 = abstractComponentCallbacksC0077n.f1969b;
                if (d3 == i3) {
                    if (abstractComponentCallbacksC0077n.f1961J) {
                        if (abstractComponentCallbacksC0077n.f1957F != null && (viewGroup = abstractComponentCallbacksC0077n.f1956E) != null) {
                            C0070g g = C0070g.g(viewGroup, abstractComponentCallbacksC0077n.j().C());
                            if (abstractComponentCallbacksC0077n.f1990z) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    g.getClass();
                                    Objects.toString(abstractComponentCallbacksC0077n);
                                }
                                g.b(3, 1, this);
                            } else {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    g.getClass();
                                    Objects.toString(abstractComponentCallbacksC0077n);
                                }
                                g.b(2, 1, this);
                            }
                        }
                        B b3 = abstractComponentCallbacksC0077n.f1983s;
                        if (b3 != null && abstractComponentCallbacksC0077n.f1976l && B.E(abstractComponentCallbacksC0077n)) {
                            b3.f1829x = true;
                        }
                        abstractComponentCallbacksC0077n.f1961J = false;
                    }
                    this.f1857d = false;
                    return;
                }
                if (d3 <= i3) {
                    switch (i3 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0077n.f1969b = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0077n.f1979o = false;
                            abstractComponentCallbacksC0077n.f1969b = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(abstractComponentCallbacksC0077n);
                            }
                            if (abstractComponentCallbacksC0077n.f1957F != null && abstractComponentCallbacksC0077n.f1970d == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0077n.f1957F != null && (viewGroup3 = abstractComponentCallbacksC0077n.f1956E) != null) {
                                C0070g g3 = C0070g.g(viewGroup3, abstractComponentCallbacksC0077n.j().C());
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    g3.getClass();
                                    Objects.toString(abstractComponentCallbacksC0077n);
                                }
                                g3.b(1, 3, this);
                            }
                            abstractComponentCallbacksC0077n.f1969b = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0077n.f1969b = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i3 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0077n.f1957F != null && (viewGroup2 = abstractComponentCallbacksC0077n.f1956E) != null) {
                                C0070g g4 = C0070g.g(viewGroup2, abstractComponentCallbacksC0077n.j().C());
                                int b4 = X.d.b(abstractComponentCallbacksC0077n.f1957F.getVisibility());
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    g4.getClass();
                                    Objects.toString(abstractComponentCallbacksC0077n);
                                }
                                g4.b(b4, 2, this);
                            }
                            abstractComponentCallbacksC0077n.f1969b = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0077n.f1969b = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f1857d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        abstractComponentCallbacksC0077n.f1985u.s(5);
        if (abstractComponentCallbacksC0077n.f1957F != null) {
            abstractComponentCallbacksC0077n.f1965N.e(EnumC0095l.ON_PAUSE);
        }
        abstractComponentCallbacksC0077n.f1964M.d(EnumC0095l.ON_PAUSE);
        abstractComponentCallbacksC0077n.f1969b = 6;
        abstractComponentCallbacksC0077n.D = true;
        this.f1855a.i(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        Bundle bundle = abstractComponentCallbacksC0077n.c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0077n.f1970d = abstractComponentCallbacksC0077n.c.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0077n.f1971e = abstractComponentCallbacksC0077n.c.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0077n.c.getString("android:target_state");
        abstractComponentCallbacksC0077n.f1973i = string;
        if (string != null) {
            abstractComponentCallbacksC0077n.f1974j = abstractComponentCallbacksC0077n.c.getInt("android:target_req_state", 0);
        }
        boolean z3 = abstractComponentCallbacksC0077n.c.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0077n.f1959H = z3;
        if (z3) {
            return;
        }
        abstractComponentCallbacksC0077n.f1958G = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        C0076m c0076m = abstractComponentCallbacksC0077n.f1960I;
        View view = c0076m == null ? null : c0076m.f1951k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0077n.f1957F) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0077n.f1957F) {
                    }
                }
            }
            view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
                Objects.toString(abstractComponentCallbacksC0077n);
                Objects.toString(abstractComponentCallbacksC0077n.f1957F.findFocus());
            }
        }
        abstractComponentCallbacksC0077n.f().f1951k = null;
        abstractComponentCallbacksC0077n.f1985u.I();
        abstractComponentCallbacksC0077n.f1985u.w(true);
        abstractComponentCallbacksC0077n.f1969b = 7;
        abstractComponentCallbacksC0077n.D = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0077n.f1964M;
        EnumC0095l enumC0095l = EnumC0095l.ON_RESUME;
        tVar.d(enumC0095l);
        if (abstractComponentCallbacksC0077n.f1957F != null) {
            abstractComponentCallbacksC0077n.f1965N.c.d(enumC0095l);
        }
        B b3 = abstractComponentCallbacksC0077n.f1985u;
        b3.f1830y = false;
        b3.f1831z = false;
        b3.f1807F.h = false;
        b3.s(7);
        this.f1855a.l(false);
        abstractComponentCallbacksC0077n.c = null;
        abstractComponentCallbacksC0077n.f1970d = null;
        abstractComponentCallbacksC0077n.f1971e = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (abstractComponentCallbacksC0077n.f1957F == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0077n.f1957F.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0077n.f1970d = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0077n.f1965N.f1877d.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0077n.f1971e = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        abstractComponentCallbacksC0077n.f1985u.I();
        abstractComponentCallbacksC0077n.f1985u.w(true);
        abstractComponentCallbacksC0077n.f1969b = 5;
        abstractComponentCallbacksC0077n.D = false;
        abstractComponentCallbacksC0077n.r();
        if (!abstractComponentCallbacksC0077n.D) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0077n + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0077n.f1964M;
        EnumC0095l enumC0095l = EnumC0095l.ON_START;
        tVar.d(enumC0095l);
        if (abstractComponentCallbacksC0077n.f1957F != null) {
            abstractComponentCallbacksC0077n.f1965N.c.d(enumC0095l);
        }
        B b3 = abstractComponentCallbacksC0077n.f1985u;
        b3.f1830y = false;
        b3.f1831z = false;
        b3.f1807F.h = false;
        b3.s(5);
        this.f1855a.n(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.c;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        B b3 = abstractComponentCallbacksC0077n.f1985u;
        b3.f1831z = true;
        b3.f1807F.h = true;
        b3.s(4);
        if (abstractComponentCallbacksC0077n.f1957F != null) {
            abstractComponentCallbacksC0077n.f1965N.e(EnumC0095l.ON_STOP);
        }
        abstractComponentCallbacksC0077n.f1964M.d(EnumC0095l.ON_STOP);
        abstractComponentCallbacksC0077n.f1969b = 4;
        abstractComponentCallbacksC0077n.D = false;
        abstractComponentCallbacksC0077n.s();
        if (abstractComponentCallbacksC0077n.D) {
            this.f1855a.o(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0077n + " did not call through to super.onStop()");
    }

    public G(v0.r rVar, v0.m mVar, ClassLoader classLoader, w wVar, F f3) {
        this.f1855a = rVar;
        this.f1856b = mVar;
        AbstractComponentCallbacksC0077n a3 = wVar.a(f3.f1841b);
        this.c = a3;
        Bundle bundle = f3.f1847k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a3.z(bundle);
        a3.f1972f = f3.c;
        a3.f1978n = f3.f1842d;
        a3.f1980p = true;
        a3.f1987w = f3.f1843e;
        a3.f1988x = f3.f1844f;
        a3.f1989y = f3.g;
        a3.f1954B = f3.h;
        a3.f1977m = f3.f1845i;
        a3.f1953A = f3.f1846j;
        a3.f1990z = f3.f1848l;
        a3.f1963L = EnumC0096m.values()[f3.f1849m];
        Bundle bundle2 = f3.f1850n;
        if (bundle2 != null) {
            a3.c = bundle2;
        } else {
            a3.c = new Bundle();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(a3);
        }
    }

    public G(v0.r rVar, v0.m mVar, AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n, F f3) {
        this.f1855a = rVar;
        this.f1856b = mVar;
        this.c = abstractComponentCallbacksC0077n;
        abstractComponentCallbacksC0077n.f1970d = null;
        abstractComponentCallbacksC0077n.f1971e = null;
        abstractComponentCallbacksC0077n.f1982r = 0;
        abstractComponentCallbacksC0077n.f1979o = false;
        abstractComponentCallbacksC0077n.f1976l = false;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = abstractComponentCallbacksC0077n.h;
        abstractComponentCallbacksC0077n.f1973i = abstractComponentCallbacksC0077n2 != null ? abstractComponentCallbacksC0077n2.f1972f : null;
        abstractComponentCallbacksC0077n.h = null;
        Bundle bundle = f3.f1850n;
        if (bundle != null) {
            abstractComponentCallbacksC0077n.c = bundle;
        } else {
            abstractComponentCallbacksC0077n.c = new Bundle();
        }
    }
}
