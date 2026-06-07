package G0;

import J.C;
import J.T;
import U0.g;
import U0.k;
import U0.v;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import u2.l;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f208a;

    /* renamed from: b, reason: collision with root package name */
    public k f209b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f210d;

    /* renamed from: e, reason: collision with root package name */
    public int f211e;

    /* renamed from: f, reason: collision with root package name */
    public int f212f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f213i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f214j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f215k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f216l;

    /* renamed from: m, reason: collision with root package name */
    public g f217m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f221q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f223s;

    /* renamed from: t, reason: collision with root package name */
    public int f224t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f218n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f219o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f220p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f222r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f208a = materialButton;
        this.f209b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f223s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f223s.getNumberOfLayers() > 2 ? (v) this.f223s.getDrawable(2) : (v) this.f223s.getDrawable(1);
    }

    public final g b(boolean z3) {
        RippleDrawable rippleDrawable = this.f223s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f223s.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f209b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i3, int i4) {
        WeakHashMap weakHashMap = T.f402a;
        MaterialButton materialButton = this.f208a;
        int f3 = C.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e3 = C.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.f211e;
        int i6 = this.f212f;
        this.f212f = i4;
        this.f211e = i3;
        if (!this.f219o) {
            e();
        }
        C.k(materialButton, f3, (paddingTop + i3) - i5, e3, (paddingBottom + i4) - i6);
    }

    public final void e() {
        g gVar = new g(this.f209b);
        MaterialButton materialButton = this.f208a;
        gVar.i(materialButton.getContext());
        B.b.h(gVar, this.f214j);
        PorterDuff.Mode mode = this.f213i;
        if (mode != null) {
            B.b.i(gVar, mode);
        }
        float f3 = this.h;
        ColorStateList colorStateList = this.f215k;
        gVar.f906b.f894k = f3;
        gVar.invalidateSelf();
        U0.f fVar = gVar.f906b;
        if (fVar.f889d != colorStateList) {
            fVar.f889d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f209b);
        gVar2.setTint(0);
        float f4 = this.h;
        int l3 = this.f218n ? l.l(materialButton, R.attr.colorSurface) : 0;
        gVar2.f906b.f894k = f4;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(l3);
        U0.f fVar2 = gVar2.f906b;
        if (fVar2.f889d != valueOf) {
            fVar2.f889d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f209b);
        this.f217m = gVar3;
        B.b.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(S0.a.a(this.f216l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.c, this.f211e, this.f210d, this.f212f), this.f217m);
        this.f223s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b3 = b(false);
        if (b3 != null) {
            b3.j(this.f224t);
            b3.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b3 = b(false);
        g b4 = b(true);
        if (b3 != null) {
            float f3 = this.h;
            ColorStateList colorStateList = this.f215k;
            b3.f906b.f894k = f3;
            b3.invalidateSelf();
            U0.f fVar = b3.f906b;
            if (fVar.f889d != colorStateList) {
                fVar.f889d = colorStateList;
                b3.onStateChange(b3.getState());
            }
            if (b4 != null) {
                float f4 = this.h;
                int l3 = this.f218n ? l.l(this.f208a, R.attr.colorSurface) : 0;
                b4.f906b.f894k = f4;
                b4.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(l3);
                U0.f fVar2 = b4.f906b;
                if (fVar2.f889d != valueOf) {
                    fVar2.f889d = valueOf;
                    b4.onStateChange(b4.getState());
                }
            }
        }
    }
}
