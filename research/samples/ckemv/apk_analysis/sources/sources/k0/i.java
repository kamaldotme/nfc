package k0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: e, reason: collision with root package name */
    public J1.l f3836e;

    /* renamed from: f, reason: collision with root package name */
    public float f3837f;
    public J1.l g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f3838i;

    /* renamed from: j, reason: collision with root package name */
    public float f3839j;

    /* renamed from: k, reason: collision with root package name */
    public float f3840k;

    /* renamed from: l, reason: collision with root package name */
    public float f3841l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Cap f3842m;

    /* renamed from: n, reason: collision with root package name */
    public Paint.Join f3843n;

    /* renamed from: o, reason: collision with root package name */
    public float f3844o;

    @Override // k0.k
    public final boolean a() {
        return this.g.d() || this.f3836e.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // k0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z3;
        J1.l lVar;
        J1.l lVar2 = this.g;
        boolean z4 = false;
        if (lVar2.d()) {
            ColorStateList colorStateList = (ColorStateList) lVar2.f580d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != lVar2.f579b) {
                lVar2.f579b = colorForState;
                z3 = true;
                lVar = this.f3836e;
                if (lVar.d()) {
                    ColorStateList colorStateList2 = (ColorStateList) lVar.f580d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != lVar.f579b) {
                        lVar.f579b = colorForState2;
                        z4 = true;
                    }
                }
                return z3 | z4;
            }
        }
        z3 = false;
        lVar = this.f3836e;
        if (lVar.d()) {
        }
        return z3 | z4;
    }

    public float getFillAlpha() {
        return this.f3838i;
    }

    public int getFillColor() {
        return this.g.f579b;
    }

    public float getStrokeAlpha() {
        return this.h;
    }

    public int getStrokeColor() {
        return this.f3836e.f579b;
    }

    public float getStrokeWidth() {
        return this.f3837f;
    }

    public float getTrimPathEnd() {
        return this.f3840k;
    }

    public float getTrimPathOffset() {
        return this.f3841l;
    }

    public float getTrimPathStart() {
        return this.f3839j;
    }

    public void setFillAlpha(float f3) {
        this.f3838i = f3;
    }

    public void setFillColor(int i3) {
        this.g.f579b = i3;
    }

    public void setStrokeAlpha(float f3) {
        this.h = f3;
    }

    public void setStrokeColor(int i3) {
        this.f3836e.f579b = i3;
    }

    public void setStrokeWidth(float f3) {
        this.f3837f = f3;
    }

    public void setTrimPathEnd(float f3) {
        this.f3840k = f3;
    }

    public void setTrimPathOffset(float f3) {
        this.f3841l = f3;
    }

    public void setTrimPathStart(float f3) {
        this.f3839j = f3;
    }
}
