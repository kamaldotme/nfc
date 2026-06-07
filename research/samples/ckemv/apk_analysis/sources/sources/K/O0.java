package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n.AbstractC0335d;
import n.C0336e;
import n.C0337f;
import n.C0343l;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class O0 {
    public static O0 g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f3608a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3609b = new WeakHashMap(0);
    public TypedValue c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3610d;

    /* renamed from: e, reason: collision with root package name */
    public C0306s f3611e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f3607f = PorterDuff.Mode.SRC_IN;
    public static final N0 h = new C0337f(6);

    public static synchronized O0 c() {
        O0 o02;
        synchronized (O0.class) {
            try {
                if (g == null) {
                    g = new O0();
                }
                o02 = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o02;
    }

    public static synchronized PorterDuffColorFilter g(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (O0.class) {
            N0 n02 = h;
            n02.getClass();
            int i4 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) n02.a(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0336e c0336e = (C0336e) this.f3609b.get(context);
                if (c0336e == null) {
                    c0336e = new C0336e();
                    this.f3609b.put(context, c0336e);
                }
                c0336e.e(j3, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i3) {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d3 = d(context, j3);
        if (d3 != null) {
            return d3;
        }
        LayerDrawable layerDrawable = null;
        if (this.f3611e != null) {
            if (i3 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i3 == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0306s.c(this, context, R.dimen.abc_star_big);
            } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0306s.c(this, context, R.dimen.abc_star_medium);
            } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0306s.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j3, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j3) {
        C0336e c0336e = (C0336e) this.f3609b.get(context);
        if (c0336e == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0336e.d(j3, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b3 = AbstractC0335d.b(c0336e.c, c0336e.f4143e, j3);
            if (b3 >= 0) {
                Object[] objArr = c0336e.f4142d;
                Object obj = objArr[b3];
                Object obj2 = C0336e.f4140f;
                if (obj != obj2) {
                    objArr[b3] = obj2;
                    c0336e.f4141b = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i3) {
        return f(context, i3, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        B.b.i(r0, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable f(Context context, int i3, boolean z3) {
        Drawable b3;
        if (!this.f3610d) {
            this.f3610d = true;
            Drawable e3 = e(context, R.drawable.abc_vector_test);
            if (e3 == null || (!(e3 instanceof k0.p) && !"android.graphics.drawable.VectorDrawable".equals(e3.getClass().getName()))) {
                this.f3610d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        b3 = b(context, i3);
        if (b3 == null) {
            b3 = y.c.b(context, i3);
        }
        if (b3 != null) {
            ColorStateList h3 = h(context, i3);
            PorterDuff.Mode mode = null;
            if (h3 != null) {
                int[] iArr = AbstractC0299o0.f3754a;
                b3 = b3.mutate();
                B.b.h(b3, h3);
                if (this.f3611e != null && i3 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            } else {
                if (this.f3611e != null) {
                    if (i3 == R.drawable.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) b3;
                        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                        int c = c1.c(context, R.attr.colorControlNormal);
                        PorterDuff.Mode mode2 = C0308t.f3776b;
                        C0306s.f(findDrawableByLayerId, c, mode2);
                        C0306s.f(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), c1.c(context, R.attr.colorControlNormal), mode2);
                        C0306s.f(layerDrawable.findDrawableByLayerId(android.R.id.progress), c1.c(context, R.attr.colorControlActivated), mode2);
                    } else if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                        LayerDrawable layerDrawable2 = (LayerDrawable) b3;
                        Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                        int b4 = c1.b(context, R.attr.colorControlNormal);
                        PorterDuff.Mode mode3 = C0308t.f3776b;
                        C0306s.f(findDrawableByLayerId2, b4, mode3);
                        C0306s.f(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), c1.c(context, R.attr.colorControlActivated), mode3);
                        C0306s.f(layerDrawable2.findDrawableByLayerId(android.R.id.progress), c1.c(context, R.attr.colorControlActivated), mode3);
                    }
                }
                if (!i(context, i3, b3) && z3) {
                    b3 = null;
                }
            }
        }
        if (b3 != null) {
            AbstractC0299o0.a(b3);
        }
        return b3;
    }

    public final synchronized ColorStateList h(Context context, int i3) {
        ColorStateList colorStateList;
        C0343l c0343l;
        WeakHashMap weakHashMap = this.f3608a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c0343l = (C0343l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0343l.c(i3, null);
        if (colorStateList == null) {
            C0306s c0306s = this.f3611e;
            if (c0306s != null) {
                colorStateList2 = c0306s.d(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f3608a == null) {
                    this.f3608a = new WeakHashMap();
                }
                C0343l c0343l2 = (C0343l) this.f3608a.get(context);
                if (c0343l2 == null) {
                    c0343l2 = new C0343l();
                    this.f3608a.put(context, c0343l2);
                }
                c0343l2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Context context, int i3, Drawable drawable) {
        int i4;
        boolean z3;
        int round;
        PorterDuffColorFilter g3;
        C0306s c0306s = this.f3611e;
        if (c0306s == null) {
            return false;
        }
        PorterDuff.Mode mode = C0308t.f3776b;
        if (C0306s.a((int[]) c0306s.f3771b, i3)) {
            i4 = R.attr.colorControlNormal;
        } else if (C0306s.a((int[]) c0306s.f3772d, i3)) {
            i4 = R.attr.colorControlActivated;
        } else {
            if (C0306s.a((int[]) c0306s.f3773e, i3)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else {
                if (i3 == R.drawable.abc_list_divider_mtrl_alpha) {
                    z3 = true;
                    round = Math.round(40.8f);
                    i4 = 16842800;
                    if (!z3) {
                        return false;
                    }
                    int[] iArr = AbstractC0299o0.f3754a;
                    Drawable mutate = drawable.mutate();
                    int c = c1.c(context, i4);
                    synchronized (C0308t.class) {
                        g3 = g(c, mode);
                    }
                    mutate.setColorFilter(g3);
                    if (round != -1) {
                        mutate.setAlpha(round);
                    }
                    return true;
                }
                if (i3 != R.drawable.abc_dialog_material_background) {
                    i4 = 0;
                    z3 = false;
                    round = -1;
                    if (!z3) {
                    }
                }
            }
            i4 = 16842801;
        }
        z3 = true;
        round = -1;
        if (!z3) {
        }
    }
}
