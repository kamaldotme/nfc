package Q0;

import N.b;
import android.R;
import android.content.res.ColorStateList;
import k.C0247C;
import u2.l;

/* loaded from: classes.dex */
public final class a extends C0247C {
    public static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f819f;
    public boolean g;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f819f == null) {
            int l3 = l.l(this, xyz.happify.ckemv.R.attr.colorControlActivated);
            int l4 = l.l(this, xyz.happify.ckemv.R.attr.colorOnSurface);
            int l5 = l.l(this, xyz.happify.ckemv.R.attr.colorSurface);
            this.f819f = new ColorStateList(h, new int[]{l.z(l5, l3, 1.0f), l.z(l5, l4, 0.54f), l.z(l5, l4, 0.38f), l.z(l5, l4, 0.38f)});
        }
        return this.f819f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.g = z3;
        if (z3) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
