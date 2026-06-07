package k;

import a.AbstractC0059a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import e.AbstractC0116a;
import j.ViewTreeObserverOnGlobalLayoutListenerC0198d;

/* renamed from: k.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262S extends Spinner {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f3618j = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    public final C0298o f3619b;
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public final C0252H f3620d;

    /* renamed from: e, reason: collision with root package name */
    public SpinnerAdapter f3621e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3622f;
    public final InterfaceC0261Q g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f3623i;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r7 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0262S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.happify.ckemv.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f3623i = new Rect();
        c1.a(this, getContext());
        int[] iArr = AbstractC0116a.f2683v;
        v0.m F2 = v0.m.F(context, attributeSet, iArr, xyz.happify.ckemv.R.attr.spinnerStyle, 0);
        this.f3619b = new C0298o(this);
        TypedArray typedArray2 = (TypedArray) F2.f5087d;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.c = new i.e(context, resourceId);
        } else {
            this.c = context;
        }
        int i3 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f3618j, xyz.happify.ckemv.R.attr.spinnerStyle, 0);
        } catch (Exception unused) {
            typedArray = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (typedArray.hasValue(0)) {
                i3 = typedArray.getInt(0, 0);
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            typedArray3 = typedArray;
            if (typedArray3 != null) {
                typedArray3.recycle();
            }
            throw th;
        }
        typedArray.recycle();
        if (i3 == 0) {
            DialogInterfaceOnClickListenerC0256L dialogInterfaceOnClickListenerC0256L = new DialogInterfaceOnClickListenerC0256L(this);
            this.g = dialogInterfaceOnClickListenerC0256L;
            dialogInterfaceOnClickListenerC0256L.f3594d = typedArray2.getString(2);
        } else if (i3 == 1) {
            C0259O c0259o = new C0259O(this, this.c, attributeSet);
            v0.m F3 = v0.m.F(this.c, attributeSet, iArr, xyz.happify.ckemv.R.attr.spinnerStyle, 0);
            this.h = ((TypedArray) F3.f5087d).getLayoutDimension(3, -2);
            c0259o.l(F3.r(1));
            c0259o.D = typedArray2.getString(2);
            F3.J();
            this.g = c0259o;
            this.f3620d = new C0252H(this, this, c0259o);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(xyz.happify.ckemv.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        F2.J();
        this.f3622f = true;
        SpinnerAdapter spinnerAdapter = this.f3621e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f3621e = null;
        }
        this.f3619b.d(attributeSet, xyz.happify.ckemv.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i4 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i4 = Math.max(i4, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i4;
        }
        Rect rect = this.f3623i;
        drawable.getPadding(rect);
        return i4 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0298o c0298o = this.f3619b;
        if (c0298o != null) {
            c0298o.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0261Q interfaceC0261Q = this.g;
        return interfaceC0261Q != null ? interfaceC0261Q.e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0261Q interfaceC0261Q = this.g;
        return interfaceC0261Q != null ? interfaceC0261Q.k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.g != null ? this.h : super.getDropDownWidth();
    }

    public final InterfaceC0261Q getInternalPopup() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0261Q interfaceC0261Q = this.g;
        return interfaceC0261Q != null ? interfaceC0261Q.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0261Q interfaceC0261Q = this.g;
        return interfaceC0261Q != null ? interfaceC0261Q.a() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.f3619b;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.f3619b;
        if (c0298o != null) {
            return c0298o.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0261Q interfaceC0261Q = this.g;
        if (interfaceC0261Q == null || !interfaceC0261Q.b()) {
            return;
        }
        interfaceC0261Q.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.g == null || View.MeasureSpec.getMode(i3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0260P c0260p = (C0260P) parcelable;
        super.onRestoreInstanceState(c0260p.getSuperState());
        if (!c0260p.f3612b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0198d(2, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, k.P] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        InterfaceC0261Q interfaceC0261Q = this.g;
        baseSavedState.f3612b = interfaceC0261Q != null && interfaceC0261Q.b();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0252H c0252h = this.f3620d;
        if (c0252h == null || !c0252h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0261Q interfaceC0261Q = this.g;
        if (interfaceC0261Q == null) {
            return super.performClick();
        }
        if (interfaceC0261Q.b()) {
            return true;
        }
        this.g.g(AbstractC0254J.b(this), AbstractC0254J.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0298o c0298o = this.f3619b;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.f3619b;
        if (c0298o != null) {
            c0298o.f(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i3) {
        InterfaceC0261Q interfaceC0261Q = this.g;
        if (interfaceC0261Q == null) {
            super.setDropDownHorizontalOffset(i3);
        } else {
            interfaceC0261Q.p(i3);
            interfaceC0261Q.c(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i3) {
        InterfaceC0261Q interfaceC0261Q = this.g;
        if (interfaceC0261Q != null) {
            interfaceC0261Q.m(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i3) {
        if (this.g != null) {
            this.h = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0261Q interfaceC0261Q = this.g;
        if (interfaceC0261Q != null) {
            interfaceC0261Q.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(AbstractC0059a.s(getPopupContext(), i3));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0261Q interfaceC0261Q = this.g;
        if (interfaceC0261Q != null) {
            interfaceC0261Q.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0298o c0298o = this.f3619b;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.f3619b;
        if (c0298o != null) {
            c0298o.i(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, java.lang.Object, k.M] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3622f) {
            this.f3621e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0261Q interfaceC0261Q = this.g;
        if (interfaceC0261Q != 0) {
            Context context = this.c;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f3600b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0255K.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0261Q.o(obj);
        }
    }
}
