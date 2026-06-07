package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import xyz.happify.ckemv.R;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0074k extends AbstractComponentCallbacksC0077n implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: S, reason: collision with root package name */
    public Handler f1928S;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1937b0;

    /* renamed from: d0, reason: collision with root package name */
    public Dialog f1939d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1940e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1941f0;

    /* renamed from: T, reason: collision with root package name */
    public final F0.h f1929T = new F0.h(10, this);

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0071h f1930U = new DialogInterfaceOnCancelListenerC0071h(this);

    /* renamed from: V, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0072i f1931V = new DialogInterfaceOnDismissListenerC0072i(this);

    /* renamed from: W, reason: collision with root package name */
    public int f1932W = 0;

    /* renamed from: X, reason: collision with root package name */
    public int f1933X = 0;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1934Y = true;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f1935Z = true;

    /* renamed from: a0, reason: collision with root package name */
    public int f1936a0 = -1;

    /* renamed from: c0, reason: collision with root package name */
    public final A.h f1938c0 = new A.h(23, this);

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1942g0 = false;

    public final void A(boolean z3, boolean z4) {
        if (this.f1941f0) {
            return;
        }
        this.f1941f0 = true;
        Dialog dialog = this.f1939d0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1939d0.dismiss();
            if (!z4) {
                if (Looper.myLooper() == this.f1928S.getLooper()) {
                    onDismiss(this.f1939d0);
                } else {
                    this.f1928S.post(this.f1929T);
                }
            }
        }
        this.f1940e0 = true;
        if (this.f1936a0 >= 0) {
            B j3 = j();
            int i3 = this.f1936a0;
            if (i3 < 0) {
                throw new IllegalArgumentException(X.d.f("Bad id: ", i3));
            }
            j3.u(new A(j3, i3), false);
            this.f1936a0 = -1;
            return;
        }
        C0064a c0064a = new C0064a(j());
        B b3 = this.f1983s;
        if (b3 != null && b3 != c0064a.f1898p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0064a.b(new H(3, this));
        if (z3) {
            c0064a.d(true);
        } else {
            c0064a.d(false);
        }
    }

    public Dialog B() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new Dialog(w(), this.f1933X);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final v0.f e() {
        return new C0073j(this, new C0075l(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void k(Context context) {
        super.k(context);
        this.f1966O.d(this.f1938c0);
        this.f1941f0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public void l(Bundle bundle) {
        super.l(bundle);
        this.f1928S = new Handler();
        this.f1935Z = this.f1988x == 0;
        if (bundle != null) {
            this.f1932W = bundle.getInt("android:style", 0);
            this.f1933X = bundle.getInt("android:theme", 0);
            this.f1934Y = bundle.getBoolean("android:cancelable", true);
            this.f1935Z = bundle.getBoolean("android:showsDialog", this.f1935Z);
            this.f1936a0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void n() {
        this.D = true;
        Dialog dialog = this.f1939d0;
        if (dialog != null) {
            this.f1940e0 = true;
            dialog.setOnDismissListener(null);
            this.f1939d0.dismiss();
            if (!this.f1941f0) {
                onDismiss(this.f1939d0);
            }
            this.f1939d0 = null;
            this.f1942g0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void o() {
        this.D = true;
        if (!this.f1941f0) {
            this.f1941f0 = true;
        }
        A.h hVar = this.f1938c0;
        androidx.lifecycle.y yVar = this.f1966O;
        yVar.getClass();
        androidx.lifecycle.y.a("removeObserver");
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) yVar.f2064b.b(hVar);
        if (xVar == null) {
            return;
        }
        xVar.d();
        xVar.c(false);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1940e0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        A(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater p(Bundle bundle) {
        Context h;
        LayoutInflater p3 = super.p(bundle);
        boolean z3 = this.f1935Z;
        if (!z3 || this.f1937b0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            return p3;
        }
        if (z3 && !this.f1942g0) {
            try {
                this.f1937b0 = true;
                Dialog B3 = B();
                this.f1939d0 = B3;
                if (this.f1935Z) {
                    int i3 = this.f1932W;
                    if (i3 != 1 && i3 != 2) {
                        if (i3 == 3) {
                            Window window = B3.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1939d0.setOwnerActivity((Activity) h);
                            }
                            this.f1939d0.setCancelable(this.f1934Y);
                            this.f1939d0.setOnCancelListener(this.f1930U);
                            this.f1939d0.setOnDismissListener(this.f1931V);
                            this.f1942g0 = true;
                        }
                    }
                    B3.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1939d0.setCancelable(this.f1934Y);
                    this.f1939d0.setOnCancelListener(this.f1930U);
                    this.f1939d0.setOnDismissListener(this.f1931V);
                    this.f1942g0 = true;
                } else {
                    this.f1939d0 = null;
                }
                this.f1937b0 = false;
            } catch (Throwable th) {
                this.f1937b0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.f1939d0;
        return dialog != null ? p3.cloneInContext(dialog.getContext()) : p3;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public void q(Bundle bundle) {
        Dialog dialog = this.f1939d0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i3 = this.f1932W;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i4 = this.f1933X;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z3 = this.f1934Y;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.f1935Z;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i5 = this.f1936a0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public void r() {
        this.D = true;
        Dialog dialog = this.f1939d0;
        if (dialog != null) {
            this.f1940e0 = false;
            dialog.show();
            View decorView = this.f1939d0.getWindow().getDecorView();
            X1.g.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public void s() {
        this.D = true;
        Dialog dialog = this.f1939d0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void t(Bundle bundle) {
        Bundle bundle2;
        this.D = true;
        if (this.f1939d0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1939d0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.u(layoutInflater, viewGroup, bundle);
        if (this.f1957F != null || this.f1939d0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1939d0.onRestoreInstanceState(bundle2);
    }
}
