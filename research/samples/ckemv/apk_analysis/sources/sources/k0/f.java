package k0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import n.C0342k;
import org.xmlpull.v1.XmlPullParser;
import z.AbstractC0452b;
import z.AbstractC0459i;
import z.AbstractC0464n;

/* loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* renamed from: d, reason: collision with root package name */
    public final Context f3832d;

    /* renamed from: e, reason: collision with root package name */
    public D0.a f3833e = null;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3834f = null;
    public final c g = new c(this);
    public final d c = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, k0.d] */
    public f(Context context) {
        this.f3832d = context;
    }

    @Override // k0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            return B.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.c;
        dVar.f3828a.draw(canvas);
        if (dVar.f3829b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3835b;
        return drawable != null ? B.a.a(drawable) : this.c.f3828a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.c.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3835b;
        return drawable != null ? B.b.c(drawable) : this.c.f3828a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3835b != null) {
            return new e(this.f3835b.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.c.f3828a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.c.f3828a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getOpacity() : this.c.f3828a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [n.b, n.k] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.c;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f3 = AbstractC0452b.f(resources, theme, attributeSet, a.f3824e);
                    int resourceId = f3.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = AbstractC0464n.f5302a;
                        pVar.f3835b = AbstractC0459i.a(resources, resourceId, theme);
                        new o(pVar.f3835b.getConstantState());
                        pVar.g = false;
                        pVar.setCallback(this.g);
                        p pVar2 = dVar.f3828a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f3828a = pVar;
                    }
                    f3.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f3825f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3832d;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f3828a.c.f3871b.f3869o.getOrDefault(string, null));
                            if (dVar.c == null) {
                                dVar.c = new ArrayList();
                                dVar.f3830d = new C0342k();
                            }
                            dVar.c.add(loadAnimator);
                            dVar.f3830d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f3829b == null) {
            dVar.f3829b = new AnimatorSet();
        }
        dVar.f3829b.playTogether(dVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3835b;
        return drawable != null ? B.a.d(drawable) : this.c.f3828a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3835b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.c.f3829b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.isStateful() : this.c.f3828a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.c.f3828a.setBounds(rect);
        }
    }

    @Override // k0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.setLevel(i3) : this.c.f3828a.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.setState(iArr) : this.c.f3828a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else {
            this.c.f3828a.setAlpha(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.a.e(drawable, z3);
        } else {
            this.c.f3828a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.c.f3828a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            u2.l.J(drawable, i3);
        } else {
            this.c.f3828a.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            u2.l.K(drawable, colorStateList);
        } else {
            this.c.f3828a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            u2.l.L(drawable, mode);
        } else {
            this.c.f3828a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.c.f3828a.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.c;
        if (dVar.f3829b.isStarted()) {
            return;
        }
        dVar.f3829b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.c.f3829b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
