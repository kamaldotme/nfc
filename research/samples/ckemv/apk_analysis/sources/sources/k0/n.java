package k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3870a;

    /* renamed from: b, reason: collision with root package name */
    public m f3871b;
    public ColorStateList c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f3872d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3873e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3874f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public int f3875i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3876j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3877k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3878l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3870a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
