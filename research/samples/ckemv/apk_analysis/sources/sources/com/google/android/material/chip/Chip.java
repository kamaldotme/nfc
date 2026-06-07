package com.google.android.material.chip;

import H.i;
import H.j;
import J.B;
import J.C;
import J.H;
import J.T;
import J0.b;
import J0.c;
import J0.d;
import J0.e;
import J0.f;
import O0.k;
import U0.v;
import Z0.a;
import a.AbstractC0059a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0302q;
import u2.l;

/* loaded from: classes.dex */
public class Chip extends C0302q implements e, v, Checkable {

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f2356x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2357y = {R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f2358z = {R.attr.state_checkable};

    /* renamed from: f, reason: collision with root package name */
    public f f2359f;
    public InsetDrawable g;
    public RippleDrawable h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f2360i;

    /* renamed from: j, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f2361j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2362k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2363l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2364m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2365n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2366o;

    /* renamed from: p, reason: collision with root package name */
    public int f2367p;

    /* renamed from: q, reason: collision with root package name */
    public int f2368q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2369r;

    /* renamed from: s, reason: collision with root package name */
    public final d f2370s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2371t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f2372u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f2373v;

    /* renamed from: w, reason: collision with root package name */
    public final b f2374w;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, xyz.happify.ckemv.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f2372u = new Rect();
        this.f2373v = new RectF();
        this.f2374w = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = A0.a.f23b;
        TypedArray f3 = k.f(fVar.f520f0, attributeSet, iArr, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f495G0 = f3.hasValue(37);
        Context context3 = fVar.f520f0;
        ColorStateList m3 = l.m(context3, f3, 24);
        if (fVar.f538y != m3) {
            fVar.f538y = m3;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList m4 = l.m(context3, f3, 11);
        if (fVar.f540z != m4) {
            fVar.f540z = m4;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = f3.getDimension(19, 0.0f);
        if (fVar.f483A != dimension) {
            fVar.f483A = dimension;
            fVar.invalidateSelf();
            fVar.v();
        }
        if (f3.hasValue(12)) {
            fVar.B(f3.getDimension(12, 0.0f));
        }
        fVar.G(l.m(context3, f3, 22));
        fVar.H(f3.getDimension(23, 0.0f));
        fVar.Q(l.m(context3, f3, 36));
        String text = f3.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f492F, text)) {
            fVar.f492F = text;
            fVar.f525l0.f769d = true;
            fVar.invalidateSelf();
            fVar.v();
        }
        R0.d dVar = (!f3.hasValue(0) || (resourceId3 = f3.getResourceId(0, 0)) == 0) ? null : new R0.d(context3, resourceId3);
        dVar.f842k = f3.getDimension(1, dVar.f842k);
        fVar.R(dVar);
        int i3 = f3.getInt(3, 0);
        if (i3 == 1) {
            fVar.f489D0 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            fVar.f489D0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            fVar.f489D0 = TextUtils.TruncateAt.END;
        }
        fVar.F(f3.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.F(f3.getBoolean(15, false));
        }
        fVar.C(l.p(context3, f3, 14));
        if (f3.hasValue(17)) {
            fVar.E(l.m(context3, f3, 17));
        }
        fVar.D(f3.getDimension(16, -1.0f));
        fVar.N(f3.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.N(f3.getBoolean(26, false));
        }
        fVar.I(l.p(context3, f3, 25));
        fVar.M(l.m(context3, f3, 30));
        fVar.K(f3.getDimension(28, 0.0f));
        fVar.x(f3.getBoolean(6, false));
        fVar.A(f3.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.A(f3.getBoolean(8, false));
        }
        fVar.y(l.p(context3, f3, 7));
        if (f3.hasValue(9)) {
            fVar.z(l.m(context3, f3, 9));
        }
        fVar.f510V = (!f3.hasValue(39) || (resourceId2 = f3.getResourceId(39, 0)) == 0) ? null : B0.b.a(context3, resourceId2);
        fVar.f511W = (!f3.hasValue(33) || (resourceId = f3.getResourceId(33, 0)) == 0) ? null : B0.b.a(context3, resourceId);
        float dimension2 = f3.getDimension(21, 0.0f);
        if (fVar.f512X != dimension2) {
            fVar.f512X = dimension2;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.P(f3.getDimension(35, 0.0f));
        fVar.O(f3.getDimension(34, 0.0f));
        float dimension3 = f3.getDimension(41, 0.0f);
        if (fVar.f515a0 != dimension3) {
            fVar.f515a0 = dimension3;
            fVar.invalidateSelf();
            fVar.v();
        }
        float dimension4 = f3.getDimension(40, 0.0f);
        if (fVar.f516b0 != dimension4) {
            fVar.f516b0 = dimension4;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.L(f3.getDimension(29, 0.0f));
        fVar.J(f3.getDimension(27, 0.0f));
        float dimension5 = f3.getDimension(13, 0.0f);
        if (fVar.f519e0 != dimension5) {
            fVar.f519e0 = dimension5;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.f493F0 = f3.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f3.recycle();
        k.a(context2, attributeSet, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2366o = obtainStyledAttributes.getBoolean(32, false);
        this.f2368q = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.j(H.i(this));
        k.a(context2, attributeSet, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f2370s = new d(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f2362k);
        setText(fVar.f492F);
        setEllipsize(fVar.f489D0);
        h();
        if (!this.f2359f.f491E0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f2366o) {
            setMinHeight(this.f2368q);
        }
        this.f2367p = C.d(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: J0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f2361j;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2373v;
        rectF.setEmpty();
        if (c() && this.f2360i != null) {
            f fVar = this.f2359f;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.U()) {
                float f3 = fVar.f519e0 + fVar.f518d0 + fVar.f504P + fVar.f517c0 + fVar.f516b0;
                if (B.c.a(fVar) == 0) {
                    float f4 = bounds.right;
                    rectF.right = f4;
                    rectF.left = f4 - f3;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i3 = (int) closeIconTouchBounds.left;
        int i4 = (int) closeIconTouchBounds.top;
        int i5 = (int) closeIconTouchBounds.right;
        int i6 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2372u;
        rect.set(i3, i4, i5, i6);
        return rect;
    }

    private R0.d getTextAppearance() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f525l0.f771f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f2364m != z3) {
            this.f2364m = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f2363l != z3) {
            this.f2363l = z3;
            refreshDrawableState();
        }
    }

    public final void b(int i3) {
        this.f2368q = i3;
        if (!this.f2366o) {
            InsetDrawable insetDrawable = this.g;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i3 - ((int) this.f2359f.f483A));
        int max2 = Math.max(0, i3 - this.f2359f.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.g;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i4 = max2 > 0 ? max2 / 2 : 0;
        int i5 = max > 0 ? max / 2 : 0;
        if (this.g != null) {
            Rect rect = new Rect();
            this.g.getPadding(rect);
            if (rect.top == i5 && rect.bottom == i5 && rect.left == i4 && rect.right == i4) {
                f();
                return;
            }
        }
        if (getMinHeight() != i3) {
            setMinHeight(i3);
        }
        if (getMinWidth() != i3) {
            setMinWidth(i3);
        }
        this.g = new InsetDrawable((Drawable) this.f2359f, i4, i5, i4, i5);
        f();
    }

    public final boolean c() {
        f fVar = this.f2359f;
        if (fVar != null) {
            Object obj = fVar.f501M;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof B.e) {
                ((B.f) ((B.e) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        f fVar = this.f2359f;
        return fVar != null && fVar.f506R;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i3;
        if (!this.f2371t) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f2370s;
        AccessibilityManager accessibilityManager = dVar.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y3 = motionEvent.getY();
                Chip chip = dVar.f480q;
                int i4 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y3)) ? 1 : 0;
                int i5 = dVar.f795m;
                if (i5 != i4) {
                    dVar.f795m = i4;
                    dVar.q(i4, 128);
                    dVar.q(i5, 256);
                }
                if (i4 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i3 = dVar.f795m) != Integer.MIN_VALUE) {
                if (i3 == Integer.MIN_VALUE) {
                    return true;
                }
                dVar.f795m = Integer.MIN_VALUE;
                dVar.q(Integer.MIN_VALUE, 128);
                dVar.q(i3, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r7 == false) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0025. Please report as an issue. */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean m3;
        if (!this.f2371t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f2370s;
        dVar.getClass();
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 0;
                int i4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i4 = 33;
                                } else if (keyCode == 21) {
                                    i4 = 17;
                                } else if (keyCode != 22) {
                                    i4 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                m3 = false;
                                while (i3 < repeatCount && dVar.m(i4, null)) {
                                    i3++;
                                    m3 = true;
                                }
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = dVar.f794l;
                    if (i5 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f480q;
                        if (i5 == 0) {
                            chip.performClick();
                        } else if (i5 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f2360i;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                i3 = 1;
                            }
                            if (chip.f2371t) {
                                chip.f2370s.q(1, 1);
                            }
                        }
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                m3 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                m3 = dVar.m(1, null);
            }
            if (dVar.f794l != Integer.MIN_VALUE) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    @Override // k.C0302q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f2359f;
        if (fVar == null || !f.u(fVar.f501M)) {
            return;
        }
        f fVar2 = this.f2359f;
        ?? isEnabled = isEnabled();
        int i3 = isEnabled;
        if (this.f2365n) {
            i3 = isEnabled + 1;
        }
        int i4 = i3;
        if (this.f2364m) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (this.f2363l) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (isChecked()) {
            i6 = i5 + 1;
        }
        int[] iArr = new int[i6];
        int i7 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i7 = 1;
        }
        if (this.f2365n) {
            iArr[i7] = 16842908;
            i7++;
        }
        if (this.f2364m) {
            iArr[i7] = 16843623;
            i7++;
        }
        if (this.f2363l) {
            iArr[i7] = 16842919;
            i7++;
        }
        if (isChecked()) {
            iArr[i7] = 16842913;
        }
        if (Arrays.equals(fVar2.f541z0, iArr)) {
            return;
        }
        fVar2.f541z0 = iArr;
        if (fVar2.U() && fVar2.w(fVar2.getState(), iArr)) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (!c() || (fVar = this.f2359f) == null || !fVar.f500L || this.f2360i == null) {
            T.l(this, null);
            this.f2371t = false;
        } else {
            T.l(this, this.f2370s);
            this.f2371t = true;
        }
    }

    public final void f() {
        this.h = new RippleDrawable(S0.a.a(this.f2359f.f490E), getBackgroundDrawable(), null);
        f fVar = this.f2359f;
        if (fVar.f484A0) {
            fVar.f484A0 = false;
            fVar.f486B0 = null;
            fVar.onStateChange(fVar.getState());
        }
        RippleDrawable rippleDrawable = this.h;
        WeakHashMap weakHashMap = T.f402a;
        B.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f2359f) == null) {
            return;
        }
        int r3 = (int) (fVar.r() + fVar.f519e0 + fVar.f516b0);
        f fVar2 = this.f2359f;
        int q3 = (int) (fVar2.q() + fVar2.f512X + fVar2.f515a0);
        if (this.g != null) {
            Rect rect = new Rect();
            this.g.getPadding(rect);
            q3 += rect.left;
            r3 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = T.f402a;
        C.k(this, q3, paddingTop, r3, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2369r)) {
            return this.f2369r;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.g;
        return insetDrawable == null ? this.f2359f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f508T;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f509U;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f540z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return Math.max(0.0f, fVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2359f;
    }

    public float getChipEndPadding() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f519e0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f2359f;
        if (fVar == null || (drawable = fVar.f496H) == 0) {
            return null;
        }
        if (!(drawable instanceof B.e)) {
            return drawable;
        }
        ((B.f) ((B.e) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f498J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f497I;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f483A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f512X;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f487C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f2359f;
        if (fVar == null || (drawable = fVar.f501M) == 0) {
            return null;
        }
        if (!(drawable instanceof B.e)) {
            return drawable;
        }
        ((B.f) ((B.e) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f505Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f518d0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f504P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f517c0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f503O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f489D0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2371t) {
            d dVar = this.f2370s;
            if (dVar.f794l == 1 || dVar.f793k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public B0.b getHideMotionSpec() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f511W;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f514Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f513Y;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f490E;
        }
        return null;
    }

    public U0.k getShapeAppearanceModel() {
        return this.f2359f.f906b.f887a;
    }

    public B0.b getShowMotionSpec() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f510V;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f516b0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f2359f;
        if (fVar != null) {
            return fVar.f515a0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f2359f;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        R0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f2374w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v0.f.M(this, this.f2359f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2357y);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f2358z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        super.onFocusChanged(z3, i3, rect);
        if (this.f2371t) {
            d dVar = this.f2370s;
            int i4 = dVar.f794l;
            if (i4 != Integer.MIN_VALUE) {
                dVar.j(i4);
            }
            if (z3) {
                dVar.m(i3, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i3) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i3);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        if (this.f2367p != i3) {
            this.f2367p = i3;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2363l) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                    }
                }
                if (!super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else if (this.f2363l) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f2360i;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f2371t) {
                    this.f2370s.q(1, 1);
                }
                z3 = true;
                setCloseIconPressed(false);
            }
            z3 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
            }
            if (!super.onTouchEvent(motionEvent)) {
            }
        }
        return true;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2369r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.h) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
    }

    @Override // k.C0302q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.h) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // k.C0302q, android.view.View
    public void setBackgroundResource(int i3) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.x(z3);
        }
    }

    public void setCheckableResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.x(fVar.f520f0.getResources().getBoolean(i3));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        f fVar = this.f2359f;
        if (fVar == null) {
            this.f2362k = z3;
        } else if (fVar.f506R) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i3) {
        setCheckedIconVisible(i3);
    }

    public void setCheckedIconResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.y(AbstractC0059a.s(fVar.f520f0, i3));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.z(y.f.c(fVar.f520f0, i3));
        }
    }

    public void setCheckedIconVisible(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.A(fVar.f520f0.getResources().getBoolean(i3));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f2359f;
        if (fVar == null || fVar.f540z == colorStateList) {
            return;
        }
        fVar.f540z = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i3) {
        ColorStateList c;
        f fVar = this.f2359f;
        if (fVar == null || fVar.f540z == (c = y.f.c(fVar.f520f0, i3))) {
            return;
        }
        fVar.f540z = c;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.B(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.B(fVar.f520f0.getResources().getDimension(i3));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f2359f;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f488C0 = new WeakReference(null);
            }
            this.f2359f = fVar;
            fVar.f491E0 = false;
            fVar.f488C0 = new WeakReference(this);
            b(this.f2368q);
        }
    }

    public void setChipEndPadding(float f3) {
        f fVar = this.f2359f;
        if (fVar == null || fVar.f519e0 == f3) {
            return;
        }
        fVar.f519e0 = f3;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setChipEndPaddingResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            float dimension = fVar.f520f0.getResources().getDimension(i3);
            if (fVar.f519e0 != dimension) {
                fVar.f519e0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i3) {
        setChipIconVisible(i3);
    }

    public void setChipIconResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.C(AbstractC0059a.s(fVar.f520f0, i3));
        }
    }

    public void setChipIconSize(float f3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.D(f3);
        }
    }

    public void setChipIconSizeResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.D(fVar.f520f0.getResources().getDimension(i3));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.E(y.f.c(fVar.f520f0, i3));
        }
    }

    public void setChipIconVisible(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.F(fVar.f520f0.getResources().getBoolean(i3));
        }
    }

    public void setChipMinHeight(float f3) {
        f fVar = this.f2359f;
        if (fVar == null || fVar.f483A == f3) {
            return;
        }
        fVar.f483A = f3;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setChipMinHeightResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            float dimension = fVar.f520f0.getResources().getDimension(i3);
            if (fVar.f483A != dimension) {
                fVar.f483A = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        f fVar = this.f2359f;
        if (fVar == null || fVar.f512X == f3) {
            return;
        }
        fVar.f512X = f3;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setChipStartPaddingResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            float dimension = fVar.f520f0.getResources().getDimension(i3);
            if (fVar.f512X != dimension) {
                fVar.f512X = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.G(y.f.c(fVar.f520f0, i3));
        }
    }

    public void setChipStrokeWidth(float f3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.H(f3);
        }
    }

    public void setChipStrokeWidthResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.H(fVar.f520f0.getResources().getDimension(i3));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i3) {
        setText(getResources().getString(i3));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f2359f;
        if (fVar == null || fVar.f505Q == charSequence) {
            return;
        }
        String str = H.b.f260d;
        Locale locale = Locale.getDefault();
        int i3 = j.f272a;
        H.b bVar = i.a(locale) == 1 ? H.b.g : H.b.f262f;
        fVar.f505Q = bVar.c(charSequence, bVar.c);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i3) {
        setCloseIconVisible(i3);
    }

    public void setCloseIconEndPadding(float f3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.J(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.J(fVar.f520f0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.I(AbstractC0059a.s(fVar.f520f0, i3));
        }
        e();
    }

    public void setCloseIconSize(float f3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.K(f3);
        }
    }

    public void setCloseIconSizeResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.K(fVar.f520f0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.L(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.L(fVar.f520f0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.M(y.f.c(fVar.f520f0, i3));
        }
    }

    public void setCloseIconVisible(int i3) {
        setCloseIconVisible(getResources().getBoolean(i3));
    }

    @Override // k.C0302q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // k.C0302q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, i4, i5, i6);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i3, i4, i5, i6);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.j(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2359f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.f489D0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f2366o = z3;
        b(this.f2368q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i3) {
        if (i3 != 8388627) {
            return;
        }
        super.setGravity(i3);
    }

    public void setHideMotionSpec(B0.b bVar) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.f511W = bVar;
        }
    }

    public void setHideMotionSpecResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.f511W = B0.b.a(fVar.f520f0, i3);
        }
    }

    public void setIconEndPadding(float f3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.O(f3);
        }
    }

    public void setIconEndPaddingResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.O(fVar.f520f0.getResources().getDimension(i3));
        }
    }

    public void setIconStartPadding(float f3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.P(f3);
        }
    }

    public void setIconStartPaddingResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.P(fVar.f520f0.getResources().getDimension(i3));
        }
    }

    public void setInternalOnCheckedChangeListener(O0.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i3) {
        if (this.f2359f == null) {
            return;
        }
        super.setLayoutDirection(i3);
    }

    @Override // android.widget.TextView
    public void setLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i3) {
        super.setMaxWidth(i3);
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.f493F0 = i3;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i3);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2361j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2360i = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.Q(colorStateList);
        }
        if (this.f2359f.f484A0) {
            return;
        }
        f();
    }

    public void setRippleColorResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.Q(y.f.c(fVar.f520f0, i3));
            if (this.f2359f.f484A0) {
                return;
            }
            f();
        }
    }

    @Override // U0.v
    public void setShapeAppearanceModel(U0.k kVar) {
        this.f2359f.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(B0.b bVar) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.f510V = bVar;
        }
    }

    public void setShowMotionSpecResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.f510V = B0.b.a(fVar.f520f0, i3);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z3) {
        if (!z3) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z3);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f2359f;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f491E0 ? null : charSequence, bufferType);
        f fVar2 = this.f2359f;
        if (fVar2 == null || TextUtils.equals(fVar2.f492F, charSequence)) {
            return;
        }
        fVar2.f492F = charSequence;
        fVar2.f525l0.f769d = true;
        fVar2.invalidateSelf();
        fVar2.v();
    }

    public void setTextAppearance(R0.d dVar) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.R(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i3) {
        setTextAppearance(getContext(), i3);
    }

    public void setTextEndPadding(float f3) {
        f fVar = this.f2359f;
        if (fVar == null || fVar.f516b0 == f3) {
            return;
        }
        fVar.f516b0 = f3;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setTextEndPaddingResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            float dimension = fVar.f520f0.getResources().getDimension(i3);
            if (fVar.f516b0 != dimension) {
                fVar.f516b0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        super.setTextSize(i3, f3);
        f fVar = this.f2359f;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i3, f3, getResources().getDisplayMetrics());
            O0.i iVar = fVar.f525l0;
            R0.d dVar = iVar.f771f;
            if (dVar != null) {
                dVar.f842k = applyDimension;
                iVar.f767a.setTextSize(applyDimension);
                fVar.v();
                fVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f3) {
        f fVar = this.f2359f;
        if (fVar == null || fVar.f515a0 == f3) {
            return;
        }
        fVar.f515a0 = f3;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setTextStartPaddingResource(int i3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            float dimension = fVar.f520f0.getResources().getDimension(i3);
            if (fVar.f515a0 != dimension) {
                fVar.f515a0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.N(z3);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.A(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.F(z3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.R(new R0.d(fVar.f520f0, i3));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i3) {
        super.setTextAppearance(i3);
        f fVar = this.f2359f;
        if (fVar != null) {
            fVar.R(new R0.d(fVar.f520f0, i3));
        }
        h();
    }
}
