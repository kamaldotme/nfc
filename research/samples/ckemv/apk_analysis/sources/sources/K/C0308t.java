package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308t {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3776b = PorterDuff.Mode.SRC_IN;
    public static C0308t c;

    /* renamed from: a, reason: collision with root package name */
    public O0 f3777a;

    public static synchronized C0308t a() {
        C0308t c0308t;
        synchronized (C0308t.class) {
            try {
                if (c == null) {
                    c();
                }
                c0308t = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0308t;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [k.t, java.lang.Object] */
    public static synchronized void c() {
        synchronized (C0308t.class) {
            if (c == null) {
                ?? obj = new Object();
                c = obj;
                obj.f3777a = O0.c();
                O0 o02 = c.f3777a;
                C0306s c0306s = new C0306s();
                synchronized (o02) {
                    o02.f3611e = c0306s;
                }
            }
        }
    }

    public static void d(Drawable drawable, e1 e1Var, int[] iArr) {
        PorterDuff.Mode mode = O0.f3607f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0299o0.f3754a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z3 = e1Var.f3682b;
            if (!z3 && !e1Var.f3681a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z3 ? (ColorStateList) e1Var.c : null;
            PorterDuff.Mode mode2 = e1Var.f3681a ? (PorterDuff.Mode) e1Var.f3683d : O0.f3607f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = O0.g(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public final synchronized Drawable b(Context context, int i3) {
        return this.f3777a.e(context, i3);
    }
}
