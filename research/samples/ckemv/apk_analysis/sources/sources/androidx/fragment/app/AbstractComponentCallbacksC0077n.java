package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0091h;
import f.AbstractActivityC0159g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import n.C0343l;
import xyz.happify.ckemv.R;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0077n implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0091h, d0.e {

    /* renamed from: R, reason: collision with root package name */
    public static final Object f1952R = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1953A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1954B;
    public boolean D;

    /* renamed from: E, reason: collision with root package name */
    public ViewGroup f1956E;

    /* renamed from: F, reason: collision with root package name */
    public View f1957F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1958G;

    /* renamed from: I, reason: collision with root package name */
    public C0076m f1960I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1961J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1962K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1964M;

    /* renamed from: N, reason: collision with root package name */
    public P f1965N;

    /* renamed from: P, reason: collision with root package name */
    public androidx.activity.l f1967P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1968Q;
    public Bundle c;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f1970d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f1971e;
    public Bundle g;
    public AbstractComponentCallbacksC0077n h;

    /* renamed from: j, reason: collision with root package name */
    public int f1974j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1976l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1977m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1978n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1979o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1980p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1981q;

    /* renamed from: r, reason: collision with root package name */
    public int f1982r;

    /* renamed from: s, reason: collision with root package name */
    public B f1983s;

    /* renamed from: t, reason: collision with root package name */
    public C0080q f1984t;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0077n f1986v;

    /* renamed from: w, reason: collision with root package name */
    public int f1987w;

    /* renamed from: x, reason: collision with root package name */
    public int f1988x;

    /* renamed from: y, reason: collision with root package name */
    public String f1989y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1990z;

    /* renamed from: b, reason: collision with root package name */
    public int f1969b = -1;

    /* renamed from: f, reason: collision with root package name */
    public String f1972f = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    public String f1973i = null;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f1975k = null;

    /* renamed from: u, reason: collision with root package name */
    public B f1985u = new B();

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1955C = true;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1959H = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0096m f1963L = EnumC0096m.f2047f;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.y f1966O = new androidx.lifecycle.y();

    public AbstractComponentCallbacksC0077n() {
        new AtomicInteger();
        this.f1968Q = new ArrayList();
        this.f1964M = new androidx.lifecycle.t(this);
        this.f1967P = new androidx.activity.l(this);
    }

    @Override // d0.e
    public final d0.d b() {
        return (d0.d) this.f1967P.f1464d;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f1983s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1983s.f1807F.f1839e;
        androidx.lifecycle.O o3 = (androidx.lifecycle.O) hashMap.get(this.f1972f);
        if (o3 != null) {
            return o3;
        }
        androidx.lifecycle.O o4 = new androidx.lifecycle.O();
        hashMap.put(this.f1972f, o4);
        return o4;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1964M;
    }

    public v0.f e() {
        return new C0075l(this);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.m, java.lang.Object] */
    public final C0076m f() {
        if (this.f1960I == null) {
            ?? obj = new Object();
            Object obj2 = f1952R;
            obj.g = obj2;
            obj.h = obj2;
            obj.f1949i = obj2;
            obj.f1950j = 1.0f;
            obj.f1951k = null;
            this.f1960I = obj;
        }
        return this.f1960I;
    }

    public final B g() {
        if (this.f1984t != null) {
            return this.f1985u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0080q c0080q = this.f1984t;
        if (c0080q == null) {
            return null;
        }
        return c0080q.f1996e;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final int i() {
        EnumC0096m enumC0096m = this.f1963L;
        return (enumC0096m == EnumC0096m.c || this.f1986v == null) ? enumC0096m.ordinal() : Math.min(enumC0096m.ordinal(), this.f1986v.i());
    }

    public final B j() {
        B b3 = this.f1983s;
        if (b3 != null) {
            return b3;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void k(Context context) {
        this.D = true;
        C0080q c0080q = this.f1984t;
        if ((c0080q == null ? null : c0080q.f1995d) != null) {
            this.D = true;
        }
    }

    public void l(Bundle bundle) {
        Parcelable parcelable;
        this.D = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1985u.N(parcelable);
            B b3 = this.f1985u;
            b3.f1830y = false;
            b3.f1831z = false;
            b3.f1807F.h = false;
            b3.s(1);
        }
        B b4 = this.f1985u;
        if (b4.f1818m >= 1) {
            return;
        }
        b4.f1830y = false;
        b4.f1831z = false;
        b4.f1807F.h = false;
        b4.s(1);
    }

    public View m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void n() {
        this.D = true;
    }

    public void o() {
        this.D = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.D = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0080q c0080q = this.f1984t;
        AbstractActivityC0159g abstractActivityC0159g = c0080q == null ? null : (AbstractActivityC0159g) c0080q.f1995d;
        if (abstractActivityC0159g != null) {
            abstractActivityC0159g.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.D = true;
    }

    public LayoutInflater p(Bundle bundle) {
        C0080q c0080q = this.f1984t;
        if (c0080q == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0159g abstractActivityC0159g = c0080q.h;
        LayoutInflater cloneInContext = abstractActivityC0159g.getLayoutInflater().cloneInContext(abstractActivityC0159g);
        cloneInContext.setFactory2(this.f1985u.f1813f);
        return cloneInContext;
    }

    public abstract void q(Bundle bundle);

    public void r() {
        this.D = true;
    }

    public void s() {
        this.D = true;
    }

    public void t(Bundle bundle) {
        this.D = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1972f);
        if (this.f1987w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1987w));
        }
        if (this.f1989y != null) {
            sb.append(" tag=");
            sb.append(this.f1989y);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1985u.I();
        this.f1981q = true;
        this.f1965N = new P(c());
        View m3 = m(layoutInflater, viewGroup);
        this.f1957F = m3;
        if (m3 == null) {
            if (this.f1965N.c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1965N = null;
            return;
        }
        this.f1965N.f();
        View view = this.f1957F;
        P p3 = this.f1965N;
        X1.g.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, p3);
        View view2 = this.f1957F;
        P p4 = this.f1965N;
        X1.g.e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, p4);
        View view3 = this.f1957F;
        P p5 = this.f1965N;
        X1.g.e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, p5);
        this.f1966O.e(this.f1965N);
    }

    public final void v() {
        this.f1985u.s(1);
        if (this.f1957F != null) {
            P p3 = this.f1965N;
            p3.f();
            if (p3.c.c.compareTo(EnumC0096m.f2045d) >= 0) {
                this.f1965N.e(EnumC0095l.ON_DESTROY);
            }
        }
        this.f1969b = 1;
        this.D = false;
        n();
        if (!this.D) {
            throw new AndroidRuntimeException("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        C0343l c0343l = ((W.a) new v0.e(this, c()).c).c;
        if (c0343l.f4163d <= 0) {
            this.f1981q = false;
        } else {
            X.d.q(c0343l.c[0]);
            throw null;
        }
    }

    public final Context w() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View x() {
        View view = this.f1957F;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void y(int i3, int i4, int i5, int i6) {
        if (this.f1960I == null && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        f().f1945b = i3;
        f().c = i4;
        f().f1946d = i5;
        f().f1947e = i6;
    }

    public final void z(Bundle bundle) {
        B b3 = this.f1983s;
        if (b3 != null && (b3.f1830y || b3.f1831z)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.g = bundle;
    }
}
