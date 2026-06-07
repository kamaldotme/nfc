package I0;

import O0.k;
import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.C0302q;
import k0.e;
import k0.f;
import u2.l;
import v0.m;
import xyz.happify.ckemv.R;
import z.AbstractC0459i;
import z.AbstractC0464n;

/* loaded from: classes.dex */
public final class d extends C0302q {

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f301f;
    public final LinkedHashSet g;
    public ColorStateList h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f302i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f303j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f304k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f305l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f306m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f307n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f308o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f309p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f310q;

    /* renamed from: r, reason: collision with root package name */
    public PorterDuff.Mode f311r;

    /* renamed from: s, reason: collision with root package name */
    public int f312s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f313t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f314u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f315v;

    /* renamed from: w, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f316w;

    /* renamed from: x, reason: collision with root package name */
    public final f f317x;

    /* renamed from: y, reason: collision with root package name */
    public final a f318y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f300z = {R.attr.state_indeterminate};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f297A = {R.attr.state_error};

    /* renamed from: B, reason: collision with root package name */
    public static final int[][] f298B = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: C, reason: collision with root package name */
    public static final int f299C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public d(Context context, AttributeSet attributeSet) {
        super(Z0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f301f = new LinkedHashSet();
        this.g = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC0464n.f5302a;
        Drawable a3 = AbstractC0459i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f3835b = a3;
        a3.setCallback(fVar.g);
        new e(fVar.f3835b.getConstantState());
        this.f317x = fVar;
        this.f318y = new a(this);
        Context context3 = getContext();
        this.f306m = N.c.a(this);
        this.f309p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = A0.a.f31m;
        k.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        k.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        m mVar = new m(context3, obtainStyledAttributes);
        this.f307n = mVar.r(2);
        if (this.f306m != null && u2.d.A(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f299C && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f306m = AbstractC0059a.s(context3, R.drawable.mtrl_checkbox_button);
                this.f308o = true;
                if (this.f307n == null) {
                    this.f307n = AbstractC0059a.s(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f310q = l.n(context3, mVar, 3);
        this.f311r = k.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f302i = obtainStyledAttributes.getBoolean(10, false);
        this.f303j = obtainStyledAttributes.getBoolean(6, true);
        this.f304k = obtainStyledAttributes.getBoolean(9, false);
        this.f305l = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        mVar.J();
        a();
    }

    private String getButtonStateDescription() {
        int i3 = this.f312s;
        return i3 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i3 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.h == null) {
            int l3 = l.l(this, R.attr.colorControlActivated);
            int l4 = l.l(this, R.attr.colorError);
            int l5 = l.l(this, R.attr.colorSurface);
            int l6 = l.l(this, R.attr.colorOnSurface);
            this.h = new ColorStateList(f298B, new int[]{l.z(l5, l4, 1.0f), l.z(l5, l3, 1.0f), l.z(l5, l6, 0.54f), l.z(l5, l6, 0.38f), l.z(l5, l6, 0.38f)});
        }
        return this.h;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f309p;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        D0.a aVar;
        Drawable drawable = this.f306m;
        ColorStateList colorStateList3 = this.f309p;
        PorterDuff.Mode b3 = N.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b3 != null) {
                B.b.i(drawable, b3);
            }
        }
        this.f306m = drawable;
        Drawable drawable2 = this.f307n;
        ColorStateList colorStateList4 = this.f310q;
        PorterDuff.Mode mode = this.f311r;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                B.b.i(drawable2, mode);
            }
        }
        this.f307n = drawable2;
        if (this.f308o) {
            f fVar = this.f317x;
            if (fVar != null) {
                Drawable drawable3 = fVar.f3835b;
                a aVar2 = this.f318y;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar2.f293a == null) {
                        aVar2.f293a = new k0.b(aVar2);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar2.f293a);
                }
                ArrayList arrayList = fVar.f3834f;
                k0.d dVar = fVar.c;
                if (arrayList != null && aVar2 != null) {
                    arrayList.remove(aVar2);
                    if (fVar.f3834f.size() == 0 && (aVar = fVar.f3833e) != null) {
                        dVar.f3829b.removeListener(aVar);
                        fVar.f3833e = null;
                    }
                }
                Drawable drawable4 = fVar.f3835b;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar2.f293a == null) {
                        aVar2.f293a = new k0.b(aVar2);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar2.f293a);
                } else if (aVar2 != null) {
                    if (fVar.f3834f == null) {
                        fVar.f3834f = new ArrayList();
                    }
                    if (!fVar.f3834f.contains(aVar2)) {
                        fVar.f3834f.add(aVar2);
                        if (fVar.f3833e == null) {
                            fVar.f3833e = new D0.a(4, fVar);
                        }
                        dVar.f3829b.addListener(fVar.f3833e);
                    }
                }
            }
            Drawable drawable5 = this.f306m;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f306m).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f306m;
        if (drawable6 != null && (colorStateList2 = this.f309p) != null) {
            B.b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f307n;
        if (drawable7 != null && (colorStateList = this.f310q) != null) {
            B.b.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f306m;
        Drawable drawable9 = this.f307n;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f3 = intrinsicWidth / intrinsicHeight;
                if (f3 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f3);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f3 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f306m;
    }

    public Drawable getButtonIconDrawable() {
        return this.f307n;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f310q;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f311r;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f309p;
    }

    public int getCheckedState() {
        return this.f312s;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f305l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f312s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f302i && this.f309p == null && this.f310q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f300z);
        }
        if (this.f304k) {
            View.mergeDrawableStates(onCreateDrawableState, f297A);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i5 = onCreateDrawableState[i4];
            if (i5 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i5 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i4] = 16842912;
                break;
            }
            i4++;
        }
        this.f313t = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a3;
        if (!this.f303j || !TextUtils.isEmpty(getText()) || (a3 = N.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a3.getIntrinsicWidth()) / 2) * (k.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a3.getBounds();
            B.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f304k) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f305l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setCheckedState(cVar.f296b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, I0.c] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f296b = getCheckedState();
        return baseSavedState;
    }

    @Override // k.C0302q, android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(AbstractC0059a.s(getContext(), i3));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f307n = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i3) {
        setButtonIconDrawable(AbstractC0059a.s(getContext(), i3));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f310q == colorStateList) {
            return;
        }
        this.f310q = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f311r == mode) {
            return;
        }
        this.f311r = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f309p == colorStateList) {
            return;
        }
        this.f309p = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.f303j = z3;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedState(z3 ? 1 : 0);
    }

    public void setCheckedState(int i3) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f312s != i3) {
            this.f312s = i3;
            super.setChecked(i3 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f315v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f314u) {
                return;
            }
            this.f314u = true;
            LinkedHashSet linkedHashSet = this.g;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    X.d.q(it.next());
                    throw null;
                }
            }
            if (this.f312s != 2 && (onCheckedChangeListener = this.f316w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f314u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f305l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i3) {
        setErrorAccessibilityLabel(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setErrorShown(boolean z3) {
        if (this.f304k == z3) {
            return;
        }
        this.f304k = z3;
        refreshDrawableState();
        Iterator it = this.f301f.iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f316w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f315v = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f302i = z3;
        if (z3) {
            N.b.c(this, getMaterialThemeColorsTintList());
        } else {
            N.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // k.C0302q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f306m = drawable;
        this.f308o = false;
        a();
    }
}
