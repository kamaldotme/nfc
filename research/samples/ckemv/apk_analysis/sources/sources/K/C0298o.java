package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e.AbstractC0116a;
import java.util.WeakHashMap;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298o {

    /* renamed from: a, reason: collision with root package name */
    public final View f3749a;

    /* renamed from: d, reason: collision with root package name */
    public e1 f3751d;

    /* renamed from: e, reason: collision with root package name */
    public e1 f3752e;

    /* renamed from: f, reason: collision with root package name */
    public e1 f3753f;
    public int c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0308t f3750b = C0308t.a();

    public C0298o(View view) {
        this.f3749a = view;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, k.e1] */
    public final void a() {
        View view = this.f3749a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3751d != null) {
                if (this.f3753f == null) {
                    this.f3753f = new Object();
                }
                e1 e1Var = this.f3753f;
                e1Var.c = null;
                e1Var.f3682b = false;
                e1Var.f3683d = null;
                e1Var.f3681a = false;
                WeakHashMap weakHashMap = J.T.f402a;
                ColorStateList g = J.H.g(view);
                if (g != null) {
                    e1Var.f3682b = true;
                    e1Var.c = g;
                }
                PorterDuff.Mode h = J.H.h(view);
                if (h != null) {
                    e1Var.f3681a = true;
                    e1Var.f3683d = h;
                }
                if (e1Var.f3682b || e1Var.f3681a) {
                    C0308t.d(background, e1Var, view.getDrawableState());
                    return;
                }
            }
            e1 e1Var2 = this.f3752e;
            if (e1Var2 != null) {
                C0308t.d(background, e1Var2, view.getDrawableState());
                return;
            }
            e1 e1Var3 = this.f3751d;
            if (e1Var3 != null) {
                C0308t.d(background, e1Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        e1 e1Var = this.f3752e;
        if (e1Var != null) {
            return (ColorStateList) e1Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        e1 e1Var = this.f3752e;
        if (e1Var != null) {
            return (PorterDuff.Mode) e1Var.f3683d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i3) {
        ColorStateList h;
        View view = this.f3749a;
        Context context = view.getContext();
        int[] iArr = AbstractC0116a.f2687z;
        v0.m F2 = v0.m.F(context, attributeSet, iArr, i3, 0);
        TypedArray typedArray = (TypedArray) F2.f5087d;
        View view2 = this.f3749a;
        J.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) F2.f5087d, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                C0308t c0308t = this.f3750b;
                Context context2 = view.getContext();
                int i4 = this.c;
                synchronized (c0308t) {
                    h = c0308t.f3777a.h(context2, i4);
                }
                if (h != null) {
                    g(h);
                }
            }
            if (typedArray.hasValue(1)) {
                J.H.q(view, F2.q(1));
            }
            if (typedArray.hasValue(2)) {
                J.H.r(view, AbstractC0299o0.b(typedArray.getInt(2, -1), null));
            }
            F2.J();
        } catch (Throwable th) {
            F2.J();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i3) {
        ColorStateList colorStateList;
        this.c = i3;
        C0308t c0308t = this.f3750b;
        if (c0308t != null) {
            Context context = this.f3749a.getContext();
            synchronized (c0308t) {
                colorStateList = c0308t.f3777a.h(context, i3);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k.e1] */
    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3751d == null) {
                this.f3751d = new Object();
            }
            e1 e1Var = this.f3751d;
            e1Var.c = colorStateList;
            e1Var.f3682b = true;
        } else {
            this.f3751d = null;
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k.e1] */
    public final void h(ColorStateList colorStateList) {
        if (this.f3752e == null) {
            this.f3752e = new Object();
        }
        e1 e1Var = this.f3752e;
        e1Var.c = colorStateList;
        e1Var.f3682b = true;
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k.e1] */
    public final void i(PorterDuff.Mode mode) {
        if (this.f3752e == null) {
            this.f3752e = new Object();
        }
        e1 e1Var = this.f3752e;
        e1Var.f3683d = mode;
        e1Var.f3681a = true;
        a();
    }
}
