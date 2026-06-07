package X0;

import J.AbstractC0013l;
import J.T;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import k.C0275c0;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class y extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f1124b;
    public final C0275c0 c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1125d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f1126e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f1127f;
    public PorterDuff.Mode g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView.ScaleType f1128i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f1129j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1130k;

    public y(TextInputLayout textInputLayout, v0.m mVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1124b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1126e = checkableImageButton;
        C0275c0 c0275c0 = new C0275c0(getContext(), null);
        this.c = c0275c0;
        if (u2.l.x(getContext())) {
            AbstractC0013l.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f1129j;
        checkableImageButton.setOnClickListener(null);
        v0.f.L(checkableImageButton, onLongClickListener);
        this.f1129j = null;
        checkableImageButton.setOnLongClickListener(null);
        v0.f.L(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) mVar.f5087d;
        if (typedArray.hasValue(69)) {
            this.f1127f = u2.l.n(getContext(), mVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.g = O0.k.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(mVar.r(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.h) {
            this.h = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType o3 = v0.f.o(typedArray.getInt(68, -1));
            this.f1128i = o3;
            checkableImageButton.setScaleType(o3);
        }
        c0275c0.setVisibility(8);
        c0275c0.setId(R.id.textinput_prefix_text);
        c0275c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = T.f402a;
        J.E.f(c0275c0, 1);
        c0275c0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0275c0.setTextColor(mVar.q(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1125d = TextUtils.isEmpty(text2) ? null : text2;
        c0275c0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0275c0);
    }

    public final int a() {
        int i3;
        CheckableImageButton checkableImageButton = this.f1126e;
        if (checkableImageButton.getVisibility() == 0) {
            i3 = AbstractC0013l.b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        WeakHashMap weakHashMap = T.f402a;
        return J.C.f(this.c) + J.C.f(this) + i3;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1126e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1127f;
            PorterDuff.Mode mode = this.g;
            TextInputLayout textInputLayout = this.f1124b;
            v0.f.i(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            v0.f.J(textInputLayout, checkableImageButton, this.f1127f);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f1129j;
        checkableImageButton.setOnClickListener(null);
        v0.f.L(checkableImageButton, onLongClickListener);
        this.f1129j = null;
        checkableImageButton.setOnLongClickListener(null);
        v0.f.L(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z3) {
        CheckableImageButton checkableImageButton = this.f1126e;
        if ((checkableImageButton.getVisibility() == 0) != z3) {
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int f3;
        EditText editText = this.f1124b.f2513e;
        if (editText == null) {
            return;
        }
        if (this.f1126e.getVisibility() == 0) {
            f3 = 0;
        } else {
            WeakHashMap weakHashMap = T.f402a;
            f3 = J.C.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = T.f402a;
        J.C.k(this.c, f3, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i3 = (this.f1125d == null || this.f1130k) ? 8 : 0;
        setVisibility((this.f1126e.getVisibility() == 0 || i3 == 0) ? 0 : 8);
        this.c.setVisibility(i3);
        this.f1124b.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        d();
    }
}
