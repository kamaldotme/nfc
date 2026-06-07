package com.google.android.material.textfield;

import F0.c;
import J.AbstractC0013l;
import J.B;
import J.E;
import J.J;
import J.T;
import O0.b;
import U0.e;
import U0.g;
import U0.j;
import U0.k;
import X0.A;
import X0.C;
import X0.D;
import X0.h;
import X0.p;
import X0.s;
import X0.t;
import X0.w;
import X0.y;
import X0.z;
import Z0.a;
import a.AbstractC0059a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import j0.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0299o0;
import k.C0275c0;
import k.C0308t;
import k.O0;
import u2.l;
import v0.m;
import y.d;
import y.f;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: B0, reason: collision with root package name */
    public static final int[][] f2483B0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2484A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f2485A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2486B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2487C;
    public boolean D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f2488E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2489F;

    /* renamed from: G, reason: collision with root package name */
    public g f2490G;

    /* renamed from: H, reason: collision with root package name */
    public g f2491H;

    /* renamed from: I, reason: collision with root package name */
    public StateListDrawable f2492I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2493J;

    /* renamed from: K, reason: collision with root package name */
    public g f2494K;

    /* renamed from: L, reason: collision with root package name */
    public g f2495L;

    /* renamed from: M, reason: collision with root package name */
    public k f2496M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2497N;

    /* renamed from: O, reason: collision with root package name */
    public final int f2498O;

    /* renamed from: P, reason: collision with root package name */
    public int f2499P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2500Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2501R;

    /* renamed from: S, reason: collision with root package name */
    public int f2502S;

    /* renamed from: T, reason: collision with root package name */
    public int f2503T;

    /* renamed from: U, reason: collision with root package name */
    public int f2504U;

    /* renamed from: V, reason: collision with root package name */
    public int f2505V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2506W;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f2507a0;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f2508b;

    /* renamed from: b0, reason: collision with root package name */
    public final RectF f2509b0;
    public final y c;

    /* renamed from: c0, reason: collision with root package name */
    public Typeface f2510c0;

    /* renamed from: d, reason: collision with root package name */
    public final p f2511d;

    /* renamed from: d0, reason: collision with root package name */
    public ColorDrawable f2512d0;

    /* renamed from: e, reason: collision with root package name */
    public EditText f2513e;

    /* renamed from: e0, reason: collision with root package name */
    public int f2514e0;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2515f;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet f2516f0;
    public int g;

    /* renamed from: g0, reason: collision with root package name */
    public ColorDrawable f2517g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f2518h0;

    /* renamed from: i, reason: collision with root package name */
    public int f2519i;
    public Drawable i0;

    /* renamed from: j, reason: collision with root package name */
    public int f2520j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2521j0;

    /* renamed from: k, reason: collision with root package name */
    public final t f2522k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f2523k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2524l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2525l0;

    /* renamed from: m, reason: collision with root package name */
    public int f2526m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2527m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2528n;

    /* renamed from: n0, reason: collision with root package name */
    public int f2529n0;

    /* renamed from: o, reason: collision with root package name */
    public D f2530o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f2531o0;

    /* renamed from: p, reason: collision with root package name */
    public C0275c0 f2532p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2533p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2534q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2535q0;

    /* renamed from: r, reason: collision with root package name */
    public int f2536r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2537r0;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2538s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2539s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2540t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2541t0;

    /* renamed from: u, reason: collision with root package name */
    public C0275c0 f2542u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2543u0;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f2544v;

    /* renamed from: v0, reason: collision with root package name */
    public final b f2545v0;

    /* renamed from: w, reason: collision with root package name */
    public int f2546w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2547w0;

    /* renamed from: x, reason: collision with root package name */
    public i f2548x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2549x0;

    /* renamed from: y, reason: collision with root package name */
    public i f2550y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2551y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2552z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2553z0;

    /* JADX WARN: Type inference failed for: r1v3, types: [X0.D, java.lang.Object] */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, xyz.happify.ckemv.R.attr.textInputStyle, xyz.happify.ckemv.R.style.Widget_Design_TextInputLayout), attributeSet, xyz.happify.ckemv.R.attr.textInputStyle);
        this.g = -1;
        this.h = -1;
        this.f2519i = -1;
        this.f2520j = -1;
        this.f2522k = new t(this);
        this.f2530o = new Object();
        this.f2506W = new Rect();
        this.f2507a0 = new Rect();
        this.f2509b0 = new RectF();
        this.f2516f0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f2545v0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2508b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = B0.a.f63a;
        bVar.f711Q = linearInterpolator;
        bVar.h(false);
        bVar.f710P = linearInterpolator;
        bVar.h(false);
        if (bVar.g != 8388659) {
            bVar.g = 8388659;
            bVar.h(false);
        }
        int[] iArr = A0.a.f44z;
        O0.k.a(context2, attributeSet, xyz.happify.ckemv.R.attr.textInputStyle, xyz.happify.ckemv.R.style.Widget_Design_TextInputLayout);
        O0.k.b(context2, attributeSet, iArr, xyz.happify.ckemv.R.attr.textInputStyle, xyz.happify.ckemv.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, xyz.happify.ckemv.R.attr.textInputStyle, xyz.happify.ckemv.R.style.Widget_Design_TextInputLayout);
        m mVar = new m(context2, obtainStyledAttributes);
        y yVar = new y(this, mVar);
        this.c = yVar;
        this.D = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2549x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2547w0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f2496M = k.b(context2, attributeSet, xyz.happify.ckemv.R.attr.textInputStyle, xyz.happify.ckemv.R.style.Widget_Design_TextInputLayout).a();
        this.f2498O = context2.getResources().getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2500Q = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2502S = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2503T = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2501R = this.f2502S;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e3 = this.f2496M.e();
        if (dimension >= 0.0f) {
            e3.f929e = new U0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e3.f930f = new U0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e3.g = new U0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e3.h = new U0.a(dimension4);
        }
        this.f2496M = e3.a();
        ColorStateList n3 = l.n(context2, mVar, 7);
        if (n3 != null) {
            int defaultColor = n3.getDefaultColor();
            this.f2533p0 = defaultColor;
            this.f2505V = defaultColor;
            if (n3.isStateful()) {
                this.f2535q0 = n3.getColorForState(new int[]{-16842910}, -1);
                this.f2537r0 = n3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2539s0 = n3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2537r0 = this.f2533p0;
                ColorStateList c = f.c(context2, xyz.happify.ckemv.R.color.mtrl_filled_background_color);
                this.f2535q0 = c.getColorForState(new int[]{-16842910}, -1);
                this.f2539s0 = c.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2505V = 0;
            this.f2533p0 = 0;
            this.f2535q0 = 0;
            this.f2537r0 = 0;
            this.f2539s0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList q3 = mVar.q(1);
            this.f2523k0 = q3;
            this.f2521j0 = q3;
        }
        ColorStateList n4 = l.n(context2, mVar, 14);
        this.f2529n0 = obtainStyledAttributes.getColor(14, 0);
        this.f2525l0 = d.a(context2, xyz.happify.ckemv.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2541t0 = d.a(context2, xyz.happify.ckemv.R.color.mtrl_textinput_disabled_color);
        this.f2527m0 = d.a(context2, xyz.happify.ckemv.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (n4 != null) {
            setBoxStrokeColorStateList(n4);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(l.n(context2, mVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2486B = mVar.q(24);
        this.f2487C = mVar.q(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i3 = obtainStyledAttributes.getInt(34, 1);
        boolean z3 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z4 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z5 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f2536r = obtainStyledAttributes.getResourceId(22, 0);
        this.f2534q = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.f2534q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2536r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(mVar.q(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(mVar.q(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(mVar.q(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(mVar.q(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(mVar.q(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(mVar.q(58));
        }
        p pVar = new p(this, mVar);
        this.f2511d = pVar;
        boolean z6 = obtainStyledAttributes.getBoolean(0, true);
        mVar.J();
        B.s(this, 2);
        J.m(this, 1);
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f2513e;
        if (!(editText instanceof AutoCompleteTextView) || l.w(editText)) {
            return this.f2490G;
        }
        int l3 = l.l(this.f2513e, xyz.happify.ckemv.R.attr.colorControlHighlight);
        int i3 = this.f2499P;
        int[][] iArr = f2483B0;
        if (i3 != 2) {
            if (i3 != 1) {
                return null;
            }
            g gVar = this.f2490G;
            int i4 = this.f2505V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{l.z(l3, i4, 0.1f), i4}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f2490G;
        TypedValue B3 = u2.d.B(context, xyz.happify.ckemv.R.attr.colorSurface, "TextInputLayout");
        int i5 = B3.resourceId;
        int a3 = i5 != 0 ? d.a(context, i5) : B3.data;
        g gVar3 = new g(gVar2.f906b.f887a);
        int z3 = l.z(l3, a3, 0.1f);
        gVar3.k(new ColorStateList(iArr, new int[]{z3, 0}));
        gVar3.setTint(a3);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{z3, a3});
        g gVar4 = new g(gVar2.f906b.f887a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2492I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2492I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2492I.addState(new int[0], f(false));
        }
        return this.f2492I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2491H == null) {
            this.f2491H = f(true);
        }
        return this.f2491H;
    }

    public static void k(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z3);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2513e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z3 = editText instanceof TextInputEditText;
        }
        this.f2513e = editText;
        int i3 = this.g;
        if (i3 != -1) {
            setMinEms(i3);
        } else {
            setMinWidth(this.f2519i);
        }
        int i4 = this.h;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f2520j);
        }
        this.f2493J = false;
        i();
        setTextInputAccessibilityDelegate(new C(this));
        Typeface typeface = this.f2513e.getTypeface();
        b bVar = this.f2545v0;
        bVar.m(typeface);
        float textSize = this.f2513e.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        int i5 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2513e.getLetterSpacing();
        if (bVar.f717W != letterSpacing) {
            bVar.f717W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f2513e.getGravity();
        int i6 = (gravity & (-113)) | 48;
        if (bVar.g != i6) {
            bVar.g = i6;
            bVar.h(false);
        }
        if (bVar.f730f != gravity) {
            bVar.f730f = gravity;
            bVar.h(false);
        }
        this.f2513e.addTextChangedListener(new A(this, 0));
        if (this.f2521j0 == null) {
            this.f2521j0 = this.f2513e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.f2488E)) {
                CharSequence hint = this.f2513e.getHint();
                this.f2515f = hint;
                setHint(hint);
                this.f2513e.setHint((CharSequence) null);
            }
            this.f2489F = true;
        }
        if (i5 >= 29) {
            p();
        }
        if (this.f2532p != null) {
            n(this.f2513e.getText());
        }
        r();
        this.f2522k.b();
        this.c.bringToFront();
        p pVar = this.f2511d;
        pVar.bringToFront();
        Iterator it = this.f2516f0.iterator();
        while (it.hasNext()) {
            ((X0.m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2488E)) {
            return;
        }
        this.f2488E = charSequence;
        b bVar = this.f2545v0;
        if (charSequence == null || !TextUtils.equals(bVar.f696A, charSequence)) {
            bVar.f696A = charSequence;
            bVar.f697B = null;
            Bitmap bitmap = bVar.f699E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f699E = null;
            }
            bVar.h(false);
        }
        if (this.f2543u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f2540t == z3) {
            return;
        }
        if (z3) {
            C0275c0 c0275c0 = this.f2542u;
            if (c0275c0 != null) {
                this.f2508b.addView(c0275c0);
                this.f2542u.setVisibility(0);
            }
        } else {
            C0275c0 c0275c02 = this.f2542u;
            if (c0275c02 != null) {
                c0275c02.setVisibility(8);
            }
            this.f2542u = null;
        }
        this.f2540t = z3;
    }

    public final void a(float f3) {
        int i3 = 1;
        b bVar = this.f2545v0;
        if (bVar.f723b == f3) {
            return;
        }
        if (this.f2551y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2551y0 = valueAnimator;
            valueAnimator.setInterpolator(l.H(getContext(), xyz.happify.ckemv.R.attr.motionEasingEmphasizedInterpolator, B0.a.f64b));
            this.f2551y0.setDuration(l.G(getContext(), xyz.happify.ckemv.R.attr.motionDurationMedium4, 167));
            this.f2551y0.addUpdateListener(new c(i3, this));
        }
        this.f2551y0.setFloatValues(bVar.f723b, f3);
        this.f2551y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i3, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2508b;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i3;
        int i4;
        g gVar = this.f2490G;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f906b.f887a;
        k kVar2 = this.f2496M;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2499P == 2 && (i3 = this.f2501R) > -1 && (i4 = this.f2504U) != 0) {
            g gVar2 = this.f2490G;
            gVar2.f906b.f894k = i3;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i4);
            U0.f fVar = gVar2.f906b;
            if (fVar.f889d != valueOf) {
                fVar.f889d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i5 = this.f2505V;
        if (this.f2499P == 1) {
            i5 = A.a.b(this.f2505V, l.k(getContext(), xyz.happify.ckemv.R.attr.colorSurface, 0));
        }
        this.f2505V = i5;
        this.f2490G.k(ColorStateList.valueOf(i5));
        g gVar3 = this.f2494K;
        if (gVar3 != null && this.f2495L != null) {
            if (this.f2501R > -1 && this.f2504U != 0) {
                gVar3.k(this.f2513e.isFocused() ? ColorStateList.valueOf(this.f2525l0) : ColorStateList.valueOf(this.f2504U));
                this.f2495L.k(ColorStateList.valueOf(this.f2504U));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d3;
        if (!this.D) {
            return 0;
        }
        int i3 = this.f2499P;
        b bVar = this.f2545v0;
        if (i3 == 0) {
            d3 = bVar.d();
        } else {
            if (i3 != 2) {
                return 0;
            }
            d3 = bVar.d() / 2.0f;
        }
        return (int) d3;
    }

    public final i d() {
        i iVar = new i();
        iVar.f3424d = l.G(getContext(), xyz.happify.ckemv.R.attr.motionDurationShort2, 87);
        iVar.f3425e = l.H(getContext(), xyz.happify.ckemv.R.attr.motionEasingLinearInterpolator, B0.a.f63a);
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i3) {
        EditText editText = this.f2513e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i3);
            return;
        }
        if (this.f2515f != null) {
            boolean z3 = this.f2489F;
            this.f2489F = false;
            CharSequence hint = editText.getHint();
            this.f2513e.setHint(this.f2515f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i3);
                return;
            } finally {
                this.f2513e.setHint(hint);
                this.f2489F = z3;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i3);
        onProvideAutofillVirtualStructure(viewStructure, i3);
        FrameLayout frameLayout = this.f2508b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i3);
            if (childAt == this.f2513e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2485A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2485A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i3;
        super.draw(canvas);
        boolean z3 = this.D;
        b bVar = this.f2545v0;
        if (z3) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f697B != null) {
                RectF rectF = bVar.f728e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f708N;
                    textPaint.setTextSize(bVar.f701G);
                    float f3 = bVar.f739p;
                    float f4 = bVar.f740q;
                    float f5 = bVar.f700F;
                    if (f5 != 1.0f) {
                        canvas.scale(f5, f5, f3, f4);
                    }
                    if (bVar.f727d0 <= 1 || bVar.f698C) {
                        canvas.translate(f3, f4);
                        bVar.f719Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f739p - bVar.f719Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f4);
                        float f6 = alpha;
                        textPaint.setAlpha((int) (bVar.f724b0 * f6));
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 31) {
                            float f7 = bVar.f702H;
                            float f8 = bVar.f703I;
                            float f9 = bVar.f704J;
                            int i5 = bVar.f705K;
                            textPaint.setShadowLayer(f7, f8, f9, A.a.d(i5, (textPaint.getAlpha() * Color.alpha(i5)) / 255));
                        }
                        bVar.f719Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f722a0 * f6));
                        if (i4 >= 31) {
                            float f10 = bVar.f702H;
                            float f11 = bVar.f703I;
                            float f12 = bVar.f704J;
                            int i6 = bVar.f705K;
                            textPaint.setShadowLayer(f10, f11, f12, A.a.d(i6, (Color.alpha(i6) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f719Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f725c0;
                        float f13 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, textPaint);
                        if (i4 >= 31) {
                            textPaint.setShadowLayer(bVar.f702H, bVar.f703I, bVar.f704J, bVar.f705K);
                        }
                        String trim = bVar.f725c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i3 = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i3 = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f719Y.getLineEnd(i3), str.length()), 0.0f, f13, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f2495L == null || (gVar = this.f2494K) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f2513e.isFocused()) {
            Rect bounds = this.f2495L.getBounds();
            Rect bounds2 = this.f2494K.getBounds();
            float f14 = bVar.f723b;
            int centerX = bounds2.centerX();
            bounds.left = B0.a.c(centerX, bounds2.left, f14);
            bounds.right = B0.a.c(centerX, bounds2.right, f14);
            this.f2495L.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z3;
        ColorStateList colorStateList;
        if (this.f2553z0) {
            return;
        }
        this.f2553z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f2545v0;
        if (bVar != null) {
            bVar.f706L = drawableState;
            ColorStateList colorStateList2 = bVar.f734k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f733j) != null && colorStateList.isStateful())) {
                bVar.h(false);
                z3 = true;
                if (this.f2513e != null) {
                    WeakHashMap weakHashMap = T.f402a;
                    u(E.c(this) && isEnabled(), false);
                }
                r();
                x();
                if (z3) {
                    invalidate();
                }
                this.f2553z0 = false;
            }
        }
        z3 = false;
        if (this.f2513e != null) {
        }
        r();
        x();
        if (z3) {
        }
        this.f2553z0 = false;
    }

    public final boolean e() {
        return this.D && !TextUtils.isEmpty(this.f2488E) && (this.f2490G instanceof h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, U0.k] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, u2.l] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, u2.l] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, u2.l] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u2.l] */
    public final g f(boolean z3) {
        int i3 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.mtrl_shape_corner_size_small_component);
        float f3 = z3 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2513e;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        e eVar = new e(i3);
        e eVar2 = new e(i3);
        e eVar3 = new e(i3);
        e eVar4 = new e(i3);
        U0.a aVar = new U0.a(f3);
        U0.a aVar2 = new U0.a(f3);
        U0.a aVar3 = new U0.a(dimensionPixelOffset);
        U0.a aVar4 = new U0.a(dimensionPixelOffset);
        ?? obj5 = new Object();
        obj5.f935a = obj;
        obj5.f936b = obj2;
        obj5.c = obj3;
        obj5.f937d = obj4;
        obj5.f938e = aVar;
        obj5.f939f = aVar2;
        obj5.g = aVar4;
        obj5.h = aVar3;
        obj5.f940i = eVar;
        obj5.f941j = eVar2;
        obj5.f942k = eVar3;
        obj5.f943l = eVar4;
        EditText editText2 = this.f2513e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f905x;
            TypedValue B3 = u2.d.B(context, xyz.happify.ckemv.R.attr.colorSurface, g.class.getSimpleName());
            int i4 = B3.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i4 != 0 ? d.a(context, i4) : B3.data);
        }
        g gVar = new g();
        gVar.i(context);
        gVar.k(dropDownBackgroundTintList);
        gVar.j(popupElevation);
        gVar.setShapeAppearanceModel(obj5);
        U0.f fVar = gVar.f906b;
        if (fVar.h == null) {
            fVar.h = new Rect();
        }
        gVar.f906b.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i3, boolean z3) {
        return ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f2513e.getCompoundPaddingLeft() : this.f2511d.c() : this.c.a()) + i3;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2513e;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i3 = this.f2499P;
        if (i3 == 1 || i3 == 2) {
            return this.f2490G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2505V;
    }

    public int getBoxBackgroundMode() {
        return this.f2499P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2500Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e3 = O0.k.e(this);
        RectF rectF = this.f2509b0;
        return e3 ? this.f2496M.h.a(rectF) : this.f2496M.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e3 = O0.k.e(this);
        RectF rectF = this.f2509b0;
        return e3 ? this.f2496M.g.a(rectF) : this.f2496M.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e3 = O0.k.e(this);
        RectF rectF = this.f2509b0;
        return e3 ? this.f2496M.f938e.a(rectF) : this.f2496M.f939f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e3 = O0.k.e(this);
        RectF rectF = this.f2509b0;
        return e3 ? this.f2496M.f939f.a(rectF) : this.f2496M.f938e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2529n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2531o0;
    }

    public int getBoxStrokeWidth() {
        return this.f2502S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2503T;
    }

    public int getCounterMaxLength() {
        return this.f2526m;
    }

    public CharSequence getCounterOverflowDescription() {
        C0275c0 c0275c0;
        if (this.f2524l && this.f2528n && (c0275c0 = this.f2532p) != null) {
            return c0275c0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2484A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2552z;
    }

    public ColorStateList getCursorColor() {
        return this.f2486B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2487C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2521j0;
    }

    public EditText getEditText() {
        return this.f2513e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2511d.h.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2511d.h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2511d.f1070n;
    }

    public int getEndIconMode() {
        return this.f2511d.f1066j;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2511d.f1071o;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2511d.h;
    }

    public CharSequence getError() {
        t tVar = this.f2522k;
        if (tVar.f1103q) {
            return tVar.f1102p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2522k.f1106t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2522k.f1105s;
    }

    public int getErrorCurrentTextColors() {
        C0275c0 c0275c0 = this.f2522k.f1104r;
        if (c0275c0 != null) {
            return c0275c0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2511d.f1062d.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f2522k;
        if (tVar.f1110x) {
            return tVar.f1109w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0275c0 c0275c0 = this.f2522k.f1111y;
        if (c0275c0 != null) {
            return c0275c0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.f2488E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2545v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f2545v0;
        return bVar.e(bVar.f734k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2523k0;
    }

    public D getLengthCounter() {
        return this.f2530o;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.f2520j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.f2519i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2511d.h.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2511d.h.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2540t) {
            return this.f2538s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2546w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2544v;
    }

    public CharSequence getPrefixText() {
        return this.c.f1125d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.c.c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.c.c;
    }

    public k getShapeAppearanceModel() {
        return this.f2496M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.c.f1126e.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.c.f1126e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.c.h;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.c.f1128i;
    }

    public CharSequence getSuffixText() {
        return this.f2511d.f1073q;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2511d.f1074r.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2511d.f1074r;
    }

    public Typeface getTypeface() {
        return this.f2510c0;
    }

    public final int h(int i3, boolean z3) {
        return i3 - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f2513e.getCompoundPaddingRight() : this.c.a() : this.f2511d.c());
    }

    public final void i() {
        int i3 = this.f2499P;
        if (i3 == 0) {
            this.f2490G = null;
            this.f2494K = null;
            this.f2495L = null;
        } else if (i3 == 1) {
            this.f2490G = new g(this.f2496M);
            this.f2494K = new g();
            this.f2495L = new g();
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException(this.f2499P + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.D || (this.f2490G instanceof h)) {
                this.f2490G = new g(this.f2496M);
            } else {
                k kVar = this.f2496M;
                int i4 = h.f1039z;
                if (kVar == null) {
                    kVar = new k();
                }
                this.f2490G = new h(new X0.g(kVar, new RectF()));
            }
            this.f2494K = null;
            this.f2495L = null;
        }
        s();
        x();
        if (this.f2499P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2500Q = getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (l.x(getContext())) {
                this.f2500Q = getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2513e != null && this.f2499P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2513e;
                WeakHashMap weakHashMap = T.f402a;
                J.C.k(editText, J.C.f(editText), getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.material_filled_edittext_font_2_0_padding_top), J.C.e(this.f2513e), getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (l.x(getContext())) {
                EditText editText2 = this.f2513e;
                WeakHashMap weakHashMap2 = T.f402a;
                J.C.k(editText2, J.C.f(editText2), getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.material_filled_edittext_font_1_3_padding_top), J.C.e(this.f2513e), getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2499P != 0) {
            t();
        }
        EditText editText3 = this.f2513e;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i5 = this.f2499P;
                if (i5 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i5 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f3;
        float f4;
        float f5;
        RectF rectF;
        float f6;
        int i3;
        int i4;
        if (e()) {
            int width = this.f2513e.getWidth();
            int gravity = this.f2513e.getGravity();
            b bVar = this.f2545v0;
            boolean b3 = bVar.b(bVar.f696A);
            bVar.f698C = b3;
            Rect rect = bVar.f726d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b3) {
                        i4 = rect.left;
                        f5 = i4;
                    } else {
                        f3 = rect.right;
                        f4 = bVar.f720Z;
                    }
                } else if (b3) {
                    f3 = rect.right;
                    f4 = bVar.f720Z;
                } else {
                    i4 = rect.left;
                    f5 = i4;
                }
                float max = Math.max(f5, rect.left);
                rectF = this.f2509b0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f6 = (width / 2.0f) + (bVar.f720Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f698C) {
                        f6 = max + bVar.f720Z;
                    } else {
                        i3 = rect.right;
                        f6 = i3;
                    }
                } else if (bVar.f698C) {
                    i3 = rect.right;
                    f6 = i3;
                } else {
                    f6 = bVar.f720Z + max;
                }
                rectF.right = Math.min(f6, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f7 = rectF.left;
                float f8 = this.f2498O;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2501R);
                h hVar = (h) this.f2490G;
                hVar.getClass();
                hVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f3 = width / 2.0f;
            f4 = bVar.f720Z / 2.0f;
            f5 = f3 - f4;
            float max2 = Math.max(f5, rect.left);
            rectF = this.f2509b0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f6 = (width / 2.0f) + (bVar.f720Z / 2.0f);
            rectF.right = Math.min(f6, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(TextView textView, int i3) {
        try {
            textView.setTextAppearance(i3);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(xyz.happify.ckemv.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(d.a(getContext(), xyz.happify.ckemv.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f2522k;
        return (tVar.f1101o != 1 || tVar.f1104r == null || TextUtils.isEmpty(tVar.f1102p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((z) this.f2530o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z3 = this.f2528n;
        int i3 = this.f2526m;
        String str = null;
        if (i3 == -1) {
            this.f2532p.setText(String.valueOf(length));
            this.f2532p.setContentDescription(null);
            this.f2528n = false;
        } else {
            this.f2528n = length > i3;
            Context context = getContext();
            this.f2532p.setContentDescription(context.getString(this.f2528n ? xyz.happify.ckemv.R.string.character_counter_overflowed_content_description : xyz.happify.ckemv.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2526m)));
            if (z3 != this.f2528n) {
                o();
            }
            String str2 = H.b.f260d;
            Locale locale = Locale.getDefault();
            int i4 = H.j.f272a;
            H.b bVar = H.i.a(locale) == 1 ? H.b.g : H.b.f262f;
            C0275c0 c0275c0 = this.f2532p;
            String string = getContext().getString(xyz.happify.ckemv.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2526m));
            if (string == null) {
                bVar.getClass();
            } else {
                str = bVar.c(string, bVar.c).toString();
            }
            c0275c0.setText(str);
        }
        if (this.f2513e == null || z3 == this.f2528n) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0275c0 c0275c0 = this.f2532p;
        if (c0275c0 != null) {
            l(c0275c0, this.f2528n ? this.f2534q : this.f2536r);
            if (!this.f2528n && (colorStateList2 = this.f2552z) != null) {
                this.f2532p.setTextColor(colorStateList2);
            }
            if (!this.f2528n || (colorStateList = this.f2484A) == null) {
                return;
            }
            this.f2532p.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2545v0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        EditText editText = this.f2513e;
        if (editText != null) {
            ThreadLocal threadLocal = O0.c.f750a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2506W;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = O0.c.f750a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            O0.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = O0.c.f751b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2494K;
            if (gVar != null) {
                int i7 = rect.bottom;
                gVar.setBounds(rect.left, i7 - this.f2502S, rect.right, i7);
            }
            g gVar2 = this.f2495L;
            if (gVar2 != null) {
                int i8 = rect.bottom;
                gVar2.setBounds(rect.left, i8 - this.f2503T, rect.right, i8);
            }
            if (this.D) {
                float textSize = this.f2513e.getTextSize();
                b bVar = this.f2545v0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f2513e.getGravity();
                int i9 = (gravity & (-113)) | 48;
                if (bVar.g != i9) {
                    bVar.g = i9;
                    bVar.h(false);
                }
                if (bVar.f730f != gravity) {
                    bVar.f730f = gravity;
                    bVar.h(false);
                }
                if (this.f2513e == null) {
                    throw new IllegalStateException();
                }
                boolean e3 = O0.k.e(this);
                int i10 = rect.bottom;
                Rect rect2 = this.f2507a0;
                rect2.bottom = i10;
                int i11 = this.f2499P;
                if (i11 == 1) {
                    rect2.left = g(rect.left, e3);
                    rect2.top = rect.top + this.f2500Q;
                    rect2.right = h(rect.right, e3);
                } else if (i11 != 2) {
                    rect2.left = g(rect.left, e3);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e3);
                } else {
                    rect2.left = this.f2513e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f2513e.getPaddingRight();
                }
                int i12 = rect2.left;
                int i13 = rect2.top;
                int i14 = rect2.right;
                int i15 = rect2.bottom;
                Rect rect3 = bVar.f726d;
                if (rect3.left != i12 || rect3.top != i13 || rect3.right != i14 || rect3.bottom != i15) {
                    rect3.set(i12, i13, i14, i15);
                    bVar.f707M = true;
                }
                if (this.f2513e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f709O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.f744u);
                textPaint.setLetterSpacing(bVar.f717W);
                float f3 = -textPaint.ascent();
                rect2.left = this.f2513e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2499P != 1 || this.f2513e.getMinLines() > 1) ? rect.top + this.f2513e.getCompoundPaddingTop() : (int) (rect.centerY() - (f3 / 2.0f));
                rect2.right = rect.right - this.f2513e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2499P != 1 || this.f2513e.getMinLines() > 1) ? rect.bottom - this.f2513e.getCompoundPaddingBottom() : (int) (rect2.top + f3);
                rect2.bottom = compoundPaddingBottom;
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                Rect rect4 = bVar.c;
                if (rect4.left != i16 || rect4.top != i17 || rect4.right != i18 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i16, i17, i18, compoundPaddingBottom);
                    bVar.f707M = true;
                }
                bVar.h(false);
                if (!e() || this.f2543u0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        EditText editText;
        int max;
        super.onMeasure(i3, i4);
        EditText editText2 = this.f2513e;
        p pVar = this.f2511d;
        boolean z3 = false;
        if (editText2 != null && this.f2513e.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.c.getMeasuredHeight()))) {
            this.f2513e.setMinimumHeight(max);
            z3 = true;
        }
        boolean q3 = q();
        if (z3 || q3) {
            this.f2513e.post(new X0.B(this, 1));
        }
        if (this.f2542u != null && (editText = this.f2513e) != null) {
            this.f2542u.setGravity(editText.getGravity());
            this.f2542u.setPadding(this.f2513e.getCompoundPaddingLeft(), this.f2513e.getCompoundPaddingTop(), this.f2513e.getCompoundPaddingRight(), this.f2513e.getCompoundPaddingBottom());
        }
        pVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof X0.E)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        X0.E e3 = (X0.E) parcelable;
        super.onRestoreInstanceState(e3.f783b);
        setError(e3.f1021d);
        if (e3.f1022e) {
            post(new X0.B(this, 0));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, U0.k] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        boolean z3 = i3 == 1;
        if (z3 != this.f2497N) {
            U0.c cVar = this.f2496M.f938e;
            RectF rectF = this.f2509b0;
            float a3 = cVar.a(rectF);
            float a4 = this.f2496M.f939f.a(rectF);
            float a5 = this.f2496M.h.a(rectF);
            float a6 = this.f2496M.g.a(rectF);
            k kVar = this.f2496M;
            l lVar = kVar.f935a;
            l lVar2 = kVar.f936b;
            l lVar3 = kVar.f937d;
            l lVar4 = kVar.c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(lVar2);
            j.b(lVar);
            j.b(lVar4);
            j.b(lVar3);
            U0.a aVar = new U0.a(a4);
            U0.a aVar2 = new U0.a(a3);
            U0.a aVar3 = new U0.a(a6);
            U0.a aVar4 = new U0.a(a5);
            ?? obj = new Object();
            obj.f935a = lVar2;
            obj.f936b = lVar;
            obj.c = lVar3;
            obj.f937d = lVar4;
            obj.f938e = aVar;
            obj.f939f = aVar2;
            obj.g = aVar4;
            obj.h = aVar3;
            obj.f940i = eVar;
            obj.f941j = eVar2;
            obj.f942k = eVar3;
            obj.f943l = eVar4;
            this.f2497N = z3;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, P.b, X0.E] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new P.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f1021d = getError();
        }
        p pVar = this.f2511d;
        bVar.f1022e = pVar.f1066j != 0 && pVar.h.f2446e;
        return bVar;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2486B;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue z3 = u2.d.z(context, xyz.happify.ckemv.R.attr.colorControlActivated);
            if (z3 != null) {
                int i3 = z3.resourceId;
                if (i3 != 0) {
                    colorStateList2 = f.c(context, i3);
                } else {
                    int i4 = z3.data;
                    if (i4 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i4);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f2513e;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f2513e.getTextCursorDrawable();
            if ((m() || (this.f2532p != null && this.f2528n)) && (colorStateList = this.f2487C) != null) {
                colorStateList2 = colorStateList;
            }
            B.b.h(textCursorDrawable2, colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        boolean z3;
        p pVar;
        Drawable[] a3;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f2513e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z4 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            y yVar = this.c;
            if (yVar.getMeasuredWidth() > 0) {
                int measuredWidth = yVar.getMeasuredWidth() - this.f2513e.getPaddingLeft();
                if (this.f2512d0 == null || this.f2514e0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f2512d0 = colorDrawable3;
                    this.f2514e0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] a4 = N.p.a(this.f2513e);
                Drawable drawable2 = a4[0];
                ColorDrawable colorDrawable4 = this.f2512d0;
                if (drawable2 != colorDrawable4) {
                    N.p.e(this.f2513e, colorDrawable4, a4[1], a4[2], a4[3]);
                    z3 = true;
                    pVar = this.f2511d;
                    if ((!pVar.e() || ((pVar.f1066j != 0 && pVar.d()) || pVar.f1073q != null)) && pVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = pVar.f1074r.getMeasuredWidth() - this.f2513e.getPaddingRight();
                        if (!pVar.e()) {
                            checkableImageButton = pVar.f1062d;
                        } else if (pVar.f1066j != 0 && pVar.d()) {
                            checkableImageButton = pVar.h;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = AbstractC0013l.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        a3 = N.p.a(this.f2513e);
                        colorDrawable = this.f2517g0;
                        if (colorDrawable != null || this.f2518h0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2517g0 = colorDrawable5;
                                this.f2518h0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = a3[2];
                            colorDrawable2 = this.f2517g0;
                            if (drawable == colorDrawable2) {
                                this.i0 = drawable;
                                N.p.e(this.f2513e, a3[0], a3[1], colorDrawable2, a3[3]);
                            } else {
                                z4 = z3;
                            }
                        } else {
                            this.f2518h0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            N.p.e(this.f2513e, a3[0], a3[1], this.f2517g0, a3[3]);
                        }
                    } else {
                        if (this.f2517g0 == null) {
                            return z3;
                        }
                        Drawable[] a5 = N.p.a(this.f2513e);
                        if (a5[2] == this.f2517g0) {
                            N.p.e(this.f2513e, a5[0], a5[1], this.i0, a5[3]);
                        } else {
                            z4 = z3;
                        }
                        this.f2517g0 = null;
                    }
                    return z4;
                }
                z3 = false;
                pVar = this.f2511d;
                if (pVar.e()) {
                }
                int measuredWidth22 = pVar.f1074r.getMeasuredWidth() - this.f2513e.getPaddingRight();
                if (!pVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                a3 = N.p.a(this.f2513e);
                colorDrawable = this.f2517g0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = a3[2];
                colorDrawable2 = this.f2517g0;
                if (drawable == colorDrawable2) {
                }
                return z4;
            }
        }
        if (this.f2512d0 != null) {
            Drawable[] a6 = N.p.a(this.f2513e);
            N.p.e(this.f2513e, null, a6[1], a6[2], a6[3]);
            this.f2512d0 = null;
            z3 = true;
            pVar = this.f2511d;
            if (pVar.e()) {
            }
            int measuredWidth222 = pVar.f1074r.getMeasuredWidth() - this.f2513e.getPaddingRight();
            if (!pVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            a3 = N.p.a(this.f2513e);
            colorDrawable = this.f2517g0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = a3[2];
            colorDrawable2 = this.f2517g0;
            if (drawable == colorDrawable2) {
            }
            return z4;
        }
        z3 = false;
        pVar = this.f2511d;
        if (pVar.e()) {
        }
        int measuredWidth2222 = pVar.f1074r.getMeasuredWidth() - this.f2513e.getPaddingRight();
        if (!pVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        a3 = N.p.a(this.f2513e);
        colorDrawable = this.f2517g0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = a3[2];
        colorDrawable2 = this.f2517g0;
        if (drawable == colorDrawable2) {
        }
        return z4;
    }

    public final void r() {
        Drawable background;
        C0275c0 c0275c0;
        PorterDuffColorFilter g;
        PorterDuffColorFilter g3;
        EditText editText = this.f2513e;
        if (editText == null || this.f2499P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0299o0.f3754a;
        Drawable mutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C0308t.f3776b;
            synchronized (C0308t.class) {
                g3 = O0.g(errorCurrentTextColors, mode);
            }
            mutate.setColorFilter(g3);
            return;
        }
        if (!this.f2528n || (c0275c0 = this.f2532p) == null) {
            mutate.clearColorFilter();
            this.f2513e.refreshDrawableState();
            return;
        }
        int currentTextColor = c0275c0.getCurrentTextColor();
        PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
        PorterDuff.Mode mode4 = C0308t.f3776b;
        synchronized (C0308t.class) {
            g = O0.g(currentTextColor, mode3);
        }
        mutate.setColorFilter(g);
    }

    public final void s() {
        EditText editText = this.f2513e;
        if (editText == null || this.f2490G == null) {
            return;
        }
        if ((this.f2493J || editText.getBackground() == null) && this.f2499P != 0) {
            EditText editText2 = this.f2513e;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap weakHashMap = T.f402a;
            B.q(editText2, editTextBoxBackground);
            this.f2493J = true;
        }
    }

    public void setBoxBackgroundColor(int i3) {
        if (this.f2505V != i3) {
            this.f2505V = i3;
            this.f2533p0 = i3;
            this.f2537r0 = i3;
            this.f2539s0 = i3;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i3) {
        setBoxBackgroundColor(d.a(getContext(), i3));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2533p0 = defaultColor;
        this.f2505V = defaultColor;
        this.f2535q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2537r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2539s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i3) {
        if (i3 == this.f2499P) {
            return;
        }
        this.f2499P = i3;
        if (this.f2513e != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i3) {
        this.f2500Q = i3;
    }

    public void setBoxCornerFamily(int i3) {
        j e3 = this.f2496M.e();
        U0.c cVar = this.f2496M.f938e;
        l p3 = v0.f.p(i3);
        e3.f926a = p3;
        j.b(p3);
        e3.f929e = cVar;
        U0.c cVar2 = this.f2496M.f939f;
        l p4 = v0.f.p(i3);
        e3.f927b = p4;
        j.b(p4);
        e3.f930f = cVar2;
        U0.c cVar3 = this.f2496M.h;
        l p5 = v0.f.p(i3);
        e3.f928d = p5;
        j.b(p5);
        e3.h = cVar3;
        U0.c cVar4 = this.f2496M.g;
        l p6 = v0.f.p(i3);
        e3.c = p6;
        j.b(p6);
        e3.g = cVar4;
        this.f2496M = e3.a();
        b();
    }

    public void setBoxStrokeColor(int i3) {
        if (this.f2529n0 != i3) {
            this.f2529n0 = i3;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2525l0 = colorStateList.getDefaultColor();
            this.f2541t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2527m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2529n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2529n0 != colorStateList.getDefaultColor()) {
            this.f2529n0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2531o0 != colorStateList) {
            this.f2531o0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i3) {
        this.f2502S = i3;
        x();
    }

    public void setBoxStrokeWidthFocused(int i3) {
        this.f2503T = i3;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i3) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i3));
    }

    public void setBoxStrokeWidthResource(int i3) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i3));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f2524l != z3) {
            t tVar = this.f2522k;
            if (z3) {
                C0275c0 c0275c0 = new C0275c0(getContext(), null);
                this.f2532p = c0275c0;
                c0275c0.setId(xyz.happify.ckemv.R.id.textinput_counter);
                Typeface typeface = this.f2510c0;
                if (typeface != null) {
                    this.f2532p.setTypeface(typeface);
                }
                this.f2532p.setMaxLines(1);
                tVar.a(this.f2532p, 2);
                AbstractC0013l.h((ViewGroup.MarginLayoutParams) this.f2532p.getLayoutParams(), getResources().getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2532p != null) {
                    EditText editText = this.f2513e;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f2532p, 2);
                this.f2532p = null;
            }
            this.f2524l = z3;
        }
    }

    public void setCounterMaxLength(int i3) {
        if (this.f2526m != i3) {
            if (i3 > 0) {
                this.f2526m = i3;
            } else {
                this.f2526m = -1;
            }
            if (!this.f2524l || this.f2532p == null) {
                return;
            }
            EditText editText = this.f2513e;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i3) {
        if (this.f2534q != i3) {
            this.f2534q = i3;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2484A != colorStateList) {
            this.f2484A = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i3) {
        if (this.f2536r != i3) {
            this.f2536r = i3;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2552z != colorStateList) {
            this.f2552z = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2486B != colorStateList) {
            this.f2486B = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2487C != colorStateList) {
            this.f2487C = colorStateList;
            if (m() || (this.f2532p != null && this.f2528n)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2521j0 = colorStateList;
        this.f2523k0 = colorStateList;
        if (this.f2513e != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        k(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f2511d.h.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f2511d.h.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i3) {
        p pVar = this.f2511d;
        CharSequence text = i3 != 0 ? pVar.getResources().getText(i3) : null;
        CheckableImageButton checkableImageButton = pVar.h;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i3) {
        p pVar = this.f2511d;
        Drawable s3 = i3 != 0 ? AbstractC0059a.s(pVar.getContext(), i3) : null;
        CheckableImageButton checkableImageButton = pVar.h;
        checkableImageButton.setImageDrawable(s3);
        if (s3 != null) {
            ColorStateList colorStateList = pVar.f1068l;
            PorterDuff.Mode mode = pVar.f1069m;
            TextInputLayout textInputLayout = pVar.f1061b;
            v0.f.i(textInputLayout, checkableImageButton, colorStateList, mode);
            v0.f.J(textInputLayout, checkableImageButton, pVar.f1068l);
        }
    }

    public void setEndIconMinSize(int i3) {
        p pVar = this.f2511d;
        if (i3 < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i3 != pVar.f1070n) {
            pVar.f1070n = i3;
            CheckableImageButton checkableImageButton = pVar.h;
            checkableImageButton.setMinimumWidth(i3);
            checkableImageButton.setMinimumHeight(i3);
            CheckableImageButton checkableImageButton2 = pVar.f1062d;
            checkableImageButton2.setMinimumWidth(i3);
            checkableImageButton2.setMinimumHeight(i3);
        }
    }

    public void setEndIconMode(int i3) {
        this.f2511d.g(i3);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2511d;
        View.OnLongClickListener onLongClickListener = pVar.f1072p;
        CheckableImageButton checkableImageButton = pVar.h;
        checkableImageButton.setOnClickListener(onClickListener);
        v0.f.L(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2511d;
        pVar.f1072p = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        v0.f.L(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f2511d;
        pVar.f1071o = scaleType;
        pVar.h.setScaleType(scaleType);
        pVar.f1062d.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2511d;
        if (pVar.f1068l != colorStateList) {
            pVar.f1068l = colorStateList;
            v0.f.i(pVar.f1061b, pVar.h, colorStateList, pVar.f1069m);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2511d;
        if (pVar.f1069m != mode) {
            pVar.f1069m = mode;
            v0.f.i(pVar.f1061b, pVar.h, pVar.f1068l, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.f2511d.h(z3);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f2522k;
        if (!tVar.f1103q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.f1102p = charSequence;
        tVar.f1104r.setText(charSequence);
        int i3 = tVar.f1100n;
        if (i3 != 1) {
            tVar.f1101o = 1;
        }
        tVar.i(i3, tVar.f1101o, tVar.h(tVar.f1104r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i3) {
        t tVar = this.f2522k;
        tVar.f1106t = i3;
        C0275c0 c0275c0 = tVar.f1104r;
        if (c0275c0 != null) {
            WeakHashMap weakHashMap = T.f402a;
            E.f(c0275c0, i3);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f2522k;
        tVar.f1105s = charSequence;
        C0275c0 c0275c0 = tVar.f1104r;
        if (c0275c0 != null) {
            c0275c0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        t tVar = this.f2522k;
        if (tVar.f1103q == z3) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.h;
        if (z3) {
            C0275c0 c0275c0 = new C0275c0(tVar.g, null);
            tVar.f1104r = c0275c0;
            c0275c0.setId(xyz.happify.ckemv.R.id.textinput_error);
            tVar.f1104r.setTextAlignment(5);
            Typeface typeface = tVar.f1089B;
            if (typeface != null) {
                tVar.f1104r.setTypeface(typeface);
            }
            int i3 = tVar.f1107u;
            tVar.f1107u = i3;
            C0275c0 c0275c02 = tVar.f1104r;
            if (c0275c02 != null) {
                textInputLayout.l(c0275c02, i3);
            }
            ColorStateList colorStateList = tVar.f1108v;
            tVar.f1108v = colorStateList;
            C0275c0 c0275c03 = tVar.f1104r;
            if (c0275c03 != null && colorStateList != null) {
                c0275c03.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f1105s;
            tVar.f1105s = charSequence;
            C0275c0 c0275c04 = tVar.f1104r;
            if (c0275c04 != null) {
                c0275c04.setContentDescription(charSequence);
            }
            int i4 = tVar.f1106t;
            tVar.f1106t = i4;
            C0275c0 c0275c05 = tVar.f1104r;
            if (c0275c05 != null) {
                WeakHashMap weakHashMap = T.f402a;
                E.f(c0275c05, i4);
            }
            tVar.f1104r.setVisibility(4);
            tVar.a(tVar.f1104r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f1104r, 0);
            tVar.f1104r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f1103q = z3;
    }

    public void setErrorIconDrawable(int i3) {
        p pVar = this.f2511d;
        pVar.i(i3 != 0 ? AbstractC0059a.s(pVar.getContext(), i3) : null);
        v0.f.J(pVar.f1061b, pVar.f1062d, pVar.f1063e);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2511d;
        CheckableImageButton checkableImageButton = pVar.f1062d;
        View.OnLongClickListener onLongClickListener = pVar.g;
        checkableImageButton.setOnClickListener(onClickListener);
        v0.f.L(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2511d;
        pVar.g = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f1062d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        v0.f.L(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2511d;
        if (pVar.f1063e != colorStateList) {
            pVar.f1063e = colorStateList;
            v0.f.i(pVar.f1061b, pVar.f1062d, colorStateList, pVar.f1064f);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2511d;
        if (pVar.f1064f != mode) {
            pVar.f1064f = mode;
            v0.f.i(pVar.f1061b, pVar.f1062d, pVar.f1063e, mode);
        }
    }

    public void setErrorTextAppearance(int i3) {
        t tVar = this.f2522k;
        tVar.f1107u = i3;
        C0275c0 c0275c0 = tVar.f1104r;
        if (c0275c0 != null) {
            tVar.h.l(c0275c0, i3);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f2522k;
        tVar.f1108v = colorStateList;
        C0275c0 c0275c0 = tVar.f1104r;
        if (c0275c0 == null || colorStateList == null) {
            return;
        }
        c0275c0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f2547w0 != z3) {
            this.f2547w0 = z3;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f2522k;
        if (isEmpty) {
            if (tVar.f1110x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f1110x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f1109w = charSequence;
        tVar.f1111y.setText(charSequence);
        int i3 = tVar.f1100n;
        if (i3 != 2) {
            tVar.f1101o = 2;
        }
        tVar.i(i3, tVar.f1101o, tVar.h(tVar.f1111y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f2522k;
        tVar.f1088A = colorStateList;
        C0275c0 c0275c0 = tVar.f1111y;
        if (c0275c0 == null || colorStateList == null) {
            return;
        }
        c0275c0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        t tVar = this.f2522k;
        if (tVar.f1110x == z3) {
            return;
        }
        tVar.c();
        if (z3) {
            C0275c0 c0275c0 = new C0275c0(tVar.g, null);
            tVar.f1111y = c0275c0;
            c0275c0.setId(xyz.happify.ckemv.R.id.textinput_helper_text);
            tVar.f1111y.setTextAlignment(5);
            Typeface typeface = tVar.f1089B;
            if (typeface != null) {
                tVar.f1111y.setTypeface(typeface);
            }
            tVar.f1111y.setVisibility(4);
            E.f(tVar.f1111y, 1);
            int i3 = tVar.f1112z;
            tVar.f1112z = i3;
            C0275c0 c0275c02 = tVar.f1111y;
            if (c0275c02 != null) {
                c0275c02.setTextAppearance(i3);
            }
            ColorStateList colorStateList = tVar.f1088A;
            tVar.f1088A = colorStateList;
            C0275c0 c0275c03 = tVar.f1111y;
            if (c0275c03 != null && colorStateList != null) {
                c0275c03.setTextColor(colorStateList);
            }
            tVar.a(tVar.f1111y, 1);
            tVar.f1111y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i4 = tVar.f1100n;
            if (i4 == 2) {
                tVar.f1101o = 0;
            }
            tVar.i(i4, tVar.f1101o, tVar.h(tVar.f1111y, ""));
            tVar.g(tVar.f1111y, 1);
            tVar.f1111y = null;
            TextInputLayout textInputLayout = tVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f1110x = z3;
    }

    public void setHelperTextTextAppearance(int i3) {
        t tVar = this.f2522k;
        tVar.f1112z = i3;
        C0275c0 c0275c0 = tVar.f1111y;
        if (c0275c0 != null) {
            c0275c0.setTextAppearance(i3);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f2549x0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.D) {
            this.D = z3;
            if (z3) {
                CharSequence hint = this.f2513e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2488E)) {
                        setHint(hint);
                    }
                    this.f2513e.setHint((CharSequence) null);
                }
                this.f2489F = true;
            } else {
                this.f2489F = false;
                if (!TextUtils.isEmpty(this.f2488E) && TextUtils.isEmpty(this.f2513e.getHint())) {
                    this.f2513e.setHint(this.f2488E);
                }
                setHintInternal(null);
            }
            if (this.f2513e != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i3) {
        b bVar = this.f2545v0;
        View view = bVar.f721a;
        R0.d dVar = new R0.d(view.getContext(), i3);
        ColorStateList colorStateList = dVar.f841j;
        if (colorStateList != null) {
            bVar.f734k = colorStateList;
        }
        float f3 = dVar.f842k;
        if (f3 != 0.0f) {
            bVar.f732i = f3;
        }
        ColorStateList colorStateList2 = dVar.f835a;
        if (colorStateList2 != null) {
            bVar.f715U = colorStateList2;
        }
        bVar.f713S = dVar.f838e;
        bVar.f714T = dVar.f839f;
        bVar.f712R = dVar.g;
        bVar.f716V = dVar.f840i;
        R0.a aVar = bVar.f748y;
        if (aVar != null) {
            aVar.f830f = true;
        }
        A.h hVar = new A.h(14, bVar);
        dVar.a();
        bVar.f748y = new R0.a(hVar, dVar.f845n);
        dVar.c(view.getContext(), bVar.f748y);
        bVar.h(false);
        this.f2523k0 = bVar.f734k;
        if (this.f2513e != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2523k0 != colorStateList) {
            if (this.f2521j0 == null) {
                b bVar = this.f2545v0;
                if (bVar.f734k != colorStateList) {
                    bVar.f734k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2523k0 = colorStateList;
            if (this.f2513e != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(D d3) {
        this.f2530o = d3;
    }

    public void setMaxEms(int i3) {
        this.h = i3;
        EditText editText = this.f2513e;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMaxEms(i3);
    }

    public void setMaxWidth(int i3) {
        this.f2520j = i3;
        EditText editText = this.f2513e;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMaxWidth(i3);
    }

    public void setMaxWidthResource(int i3) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    public void setMinEms(int i3) {
        this.g = i3;
        EditText editText = this.f2513e;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMinEms(i3);
    }

    public void setMinWidth(int i3) {
        this.f2519i = i3;
        EditText editText = this.f2513e;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMinWidth(i3);
    }

    public void setMinWidthResource(int i3) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i3) {
        p pVar = this.f2511d;
        pVar.h.setContentDescription(i3 != 0 ? pVar.getResources().getText(i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i3) {
        p pVar = this.f2511d;
        pVar.h.setImageDrawable(i3 != 0 ? AbstractC0059a.s(pVar.getContext(), i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        p pVar = this.f2511d;
        if (z3 && pVar.f1066j != 1) {
            pVar.g(1);
        } else if (z3) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.f2511d;
        pVar.f1068l = colorStateList;
        v0.f.i(pVar.f1061b, pVar.h, colorStateList, pVar.f1069m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2511d;
        pVar.f1069m = mode;
        v0.f.i(pVar.f1061b, pVar.h, pVar.f1068l, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2542u == null) {
            C0275c0 c0275c0 = new C0275c0(getContext(), null);
            this.f2542u = c0275c0;
            c0275c0.setId(xyz.happify.ckemv.R.id.textinput_placeholder);
            B.s(this.f2542u, 2);
            i d3 = d();
            this.f2548x = d3;
            d3.c = 67L;
            this.f2550y = d();
            setPlaceholderTextAppearance(this.f2546w);
            setPlaceholderTextColor(this.f2544v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2540t) {
                setPlaceholderTextEnabled(true);
            }
            this.f2538s = charSequence;
        }
        EditText editText = this.f2513e;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i3) {
        this.f2546w = i3;
        C0275c0 c0275c0 = this.f2542u;
        if (c0275c0 != null) {
            c0275c0.setTextAppearance(i3);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2544v != colorStateList) {
            this.f2544v = colorStateList;
            C0275c0 c0275c0 = this.f2542u;
            if (c0275c0 == null || colorStateList == null) {
                return;
            }
            c0275c0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.c;
        yVar.getClass();
        yVar.f1125d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.c.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i3) {
        this.c.c.setTextAppearance(i3);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.c.c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f2490G;
        if (gVar == null || gVar.f906b.f887a == kVar) {
            return;
        }
        this.f2496M = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z3) {
        this.c.f1126e.setCheckable(z3);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.f1126e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i3) {
        setStartIconDrawable(i3 != 0 ? AbstractC0059a.s(getContext(), i3) : null);
    }

    public void setStartIconMinSize(int i3) {
        y yVar = this.c;
        if (i3 < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i3 != yVar.h) {
            yVar.h = i3;
            CheckableImageButton checkableImageButton = yVar.f1126e;
            checkableImageButton.setMinimumWidth(i3);
            checkableImageButton.setMinimumHeight(i3);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.c;
        View.OnLongClickListener onLongClickListener = yVar.f1129j;
        CheckableImageButton checkableImageButton = yVar.f1126e;
        checkableImageButton.setOnClickListener(onClickListener);
        v0.f.L(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.c;
        yVar.f1129j = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.f1126e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        v0.f.L(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.c;
        yVar.f1128i = scaleType;
        yVar.f1126e.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.c;
        if (yVar.f1127f != colorStateList) {
            yVar.f1127f = colorStateList;
            v0.f.i(yVar.f1124b, yVar.f1126e, colorStateList, yVar.g);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.c;
        if (yVar.g != mode) {
            yVar.g = mode;
            v0.f.i(yVar.f1124b, yVar.f1126e, yVar.f1127f, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.c.c(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f2511d;
        pVar.getClass();
        pVar.f1073q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f1074r.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i3) {
        this.f2511d.f1074r.setTextAppearance(i3);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2511d.f1074r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C c) {
        EditText editText = this.f2513e;
        if (editText != null) {
            T.l(editText, c);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2510c0) {
            this.f2510c0 = typeface;
            this.f2545v0.m(typeface);
            t tVar = this.f2522k;
            if (typeface != tVar.f1089B) {
                tVar.f1089B = typeface;
                C0275c0 c0275c0 = tVar.f1104r;
                if (c0275c0 != null) {
                    c0275c0.setTypeface(typeface);
                }
                C0275c0 c0275c02 = tVar.f1111y;
                if (c0275c02 != null) {
                    c0275c02.setTypeface(typeface);
                }
            }
            C0275c0 c0275c03 = this.f2532p;
            if (c0275c03 != null) {
                c0275c03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2499P != 1) {
            FrameLayout frameLayout = this.f2508b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c = c();
            if (c != layoutParams.topMargin) {
                layoutParams.topMargin = c;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z3, boolean z4) {
        ColorStateList colorStateList;
        C0275c0 c0275c0;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2513e;
        boolean z5 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2513e;
        boolean z6 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2521j0;
        b bVar = this.f2545v0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2521j0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2541t0) : this.f2541t0));
        } else if (m()) {
            C0275c0 c0275c02 = this.f2522k.f1104r;
            bVar.i(c0275c02 != null ? c0275c02.getTextColors() : null);
        } else if (this.f2528n && (c0275c0 = this.f2532p) != null) {
            bVar.i(c0275c0.getTextColors());
        } else if (z6 && (colorStateList = this.f2523k0) != null && bVar.f734k != colorStateList) {
            bVar.f734k = colorStateList;
            bVar.h(false);
        }
        p pVar = this.f2511d;
        y yVar = this.c;
        if (z5 || !this.f2547w0 || (isEnabled() && z6)) {
            if (z4 || this.f2543u0) {
                ValueAnimator valueAnimator = this.f2551y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2551y0.cancel();
                }
                if (z3 && this.f2549x0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f2543u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f2513e;
                v(editText3 != null ? editText3.getText() : null);
                yVar.f1130k = false;
                yVar.e();
                pVar.f1075s = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z4 || !this.f2543u0) {
            ValueAnimator valueAnimator2 = this.f2551y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2551y0.cancel();
            }
            if (z3 && this.f2549x0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && (!((h) this.f2490G).f1040y.f1038v.isEmpty()) && e()) {
                ((h) this.f2490G).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2543u0 = true;
            C0275c0 c0275c03 = this.f2542u;
            if (c0275c03 != null && this.f2540t) {
                c0275c03.setText((CharSequence) null);
                j0.s.a(this.f2508b, this.f2550y);
                this.f2542u.setVisibility(4);
            }
            yVar.f1130k = true;
            yVar.e();
            pVar.f1075s = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((z) this.f2530o).getClass();
        FrameLayout frameLayout = this.f2508b;
        if ((editable != null && editable.length() != 0) || this.f2543u0) {
            C0275c0 c0275c0 = this.f2542u;
            if (c0275c0 == null || !this.f2540t) {
                return;
            }
            c0275c0.setText((CharSequence) null);
            j0.s.a(frameLayout, this.f2550y);
            this.f2542u.setVisibility(4);
            return;
        }
        if (this.f2542u == null || !this.f2540t || TextUtils.isEmpty(this.f2538s)) {
            return;
        }
        this.f2542u.setText(this.f2538s);
        j0.s.a(frameLayout, this.f2548x);
        this.f2542u.setVisibility(0);
        this.f2542u.bringToFront();
        announceForAccessibility(this.f2538s);
    }

    public final void w(boolean z3, boolean z4) {
        int defaultColor = this.f2531o0.getDefaultColor();
        int colorForState = this.f2531o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2531o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.f2504U = colorForState2;
        } else if (z4) {
            this.f2504U = colorForState;
        } else {
            this.f2504U = defaultColor;
        }
    }

    public final void x() {
        C0275c0 c0275c0;
        EditText editText;
        EditText editText2;
        if (this.f2490G == null || this.f2499P == 0) {
            return;
        }
        boolean z3 = false;
        boolean z4 = isFocused() || ((editText2 = this.f2513e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2513e) != null && editText.isHovered())) {
            z3 = true;
        }
        if (!isEnabled()) {
            this.f2504U = this.f2541t0;
        } else if (m()) {
            if (this.f2531o0 != null) {
                w(z4, z3);
            } else {
                this.f2504U = getErrorCurrentTextColors();
            }
        } else if (!this.f2528n || (c0275c0 = this.f2532p) == null) {
            if (z4) {
                this.f2504U = this.f2529n0;
            } else if (z3) {
                this.f2504U = this.f2527m0;
            } else {
                this.f2504U = this.f2525l0;
            }
        } else if (this.f2531o0 != null) {
            w(z4, z3);
        } else {
            this.f2504U = c0275c0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        p pVar = this.f2511d;
        pVar.l();
        CheckableImageButton checkableImageButton = pVar.f1062d;
        ColorStateList colorStateList = pVar.f1063e;
        TextInputLayout textInputLayout = pVar.f1061b;
        v0.f.J(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f1068l;
        CheckableImageButton checkableImageButton2 = pVar.h;
        v0.f.J(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof X0.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                v0.f.i(textInputLayout, checkableImageButton2, pVar.f1068l, pVar.f1069m);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                B.b.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        y yVar = this.c;
        v0.f.J(yVar.f1124b, yVar.f1126e, yVar.f1127f);
        if (this.f2499P == 2) {
            int i3 = this.f2501R;
            if (z4 && isEnabled()) {
                this.f2501R = this.f2503T;
            } else {
                this.f2501R = this.f2502S;
            }
            if (this.f2501R != i3 && e() && !this.f2543u0) {
                if (e()) {
                    ((h) this.f2490G).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f2499P == 1) {
            if (!isEnabled()) {
                this.f2505V = this.f2535q0;
            } else if (z3 && !z4) {
                this.f2505V = this.f2539s0;
            } else if (z4) {
                this.f2505V = this.f2537r0;
            } else {
                this.f2505V = this.f2533p0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.c.b(drawable);
    }

    public void setHint(int i3) {
        setHint(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setStartIconContentDescription(int i3) {
        setStartIconContentDescription(i3 != 0 ? getResources().getText(i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2511d.h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2511d.h.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2511d.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2511d.h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f2511d;
        CheckableImageButton checkableImageButton = pVar.h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f1068l;
            PorterDuff.Mode mode = pVar.f1069m;
            TextInputLayout textInputLayout = pVar.f1061b;
            v0.f.i(textInputLayout, checkableImageButton, colorStateList, mode);
            v0.f.J(textInputLayout, checkableImageButton, pVar.f1068l);
        }
    }
}
