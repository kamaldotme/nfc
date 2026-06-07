package X0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import k.C0296n;
import k.G0;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class w extends C0296n {

    /* renamed from: f, reason: collision with root package name */
    public final G0 f1116f;
    public final AccessibilityManager g;
    public final Rect h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1117i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1118j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1119k;

    /* renamed from: l, reason: collision with root package name */
    public int f1120l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f1121m;

    public w(Context context, AttributeSet attributeSet) {
        super(Z0.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.h = new Rect();
        Context context2 = getContext();
        TypedArray f3 = O0.k.f(context2, attributeSet, A0.a.h, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f3.hasValue(0) && f3.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1117i = f3.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f1118j = f3.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f3.hasValue(2)) {
            this.f1119k = ColorStateList.valueOf(f3.getColor(2, 0));
        }
        this.f1120l = f3.getColor(4, 0);
        this.f1121m = u2.l.m(context2, f3, 5);
        this.g = (AccessibilityManager) context2.getSystemService("accessibility");
        G0 g02 = new G0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f1116f = g02;
        g02.f3590z = true;
        g02.f3568A.setFocusable(true);
        g02.f3580p = this;
        g02.f3568A.setInputMethodMode(2);
        g02.o(getAdapter());
        g02.f3581q = new u(0, this);
        if (f3.hasValue(6)) {
            setSimpleItems(f3.getResourceId(6, 0));
        }
        f3.recycle();
    }

    public static void a(w wVar, Object obj) {
        wVar.setText(wVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f1116f.dismiss();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1119k;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b3 = b();
        return (b3 == null || !b3.f2489F) ? super.getHint() : b3.getHint();
    }

    public float getPopupElevation() {
        return this.f1118j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1120l;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1121m;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b3 = b();
        if (b3 != null && b3.f2489F && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1116f.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b3 = b();
            int i5 = 0;
            if (adapter != null && b3 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                G0 g02 = this.f1116f;
                int min = Math.min(adapter.getCount(), Math.max(0, !g02.f3568A.isShowing() ? -1 : g02.f3570d.getSelectedItemPosition()) + 15);
                View view = null;
                int i6 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i5) {
                        view = null;
                        i5 = itemViewType;
                    }
                    view = adapter.getView(max, view, b3);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i6 = Math.max(i6, view.getMeasuredWidth());
                }
                Drawable background = g02.f3568A.getBackground();
                if (background != null) {
                    Rect rect = this.h;
                    background.getPadding(rect);
                    i6 += rect.left + rect.right;
                }
                i5 = b3.getEndIconView().getMeasuredWidth() + i6;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i5), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z3);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t3) {
        super.setAdapter(t3);
        this.f1116f.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        G0 g02 = this.f1116f;
        if (g02 != null) {
            g02.l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i3) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i3));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1119k = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof U0.g) {
            ((U0.g) dropDownBackground).k(this.f1119k);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1116f.f3582r = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i3) {
        super.setRawInputType(i3);
        TextInputLayout b3 = b();
        if (b3 != null) {
            b3.s();
        }
    }

    public void setSimpleItemSelectedColor(int i3) {
        this.f1120l = i3;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1121m = colorStateList;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i3) {
        setSimpleItems(getResources().getStringArray(i3));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f1116f.i();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new v(this, getContext(), this.f1117i, strArr));
    }
}
