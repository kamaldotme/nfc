package X0;

import J.T;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0275c0;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1088A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f1089B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1090a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1091b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f1092d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1093e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1094f;
    public final Context g;
    public final TextInputLayout h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1095i;

    /* renamed from: j, reason: collision with root package name */
    public int f1096j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f1097k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f1098l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1099m;

    /* renamed from: n, reason: collision with root package name */
    public int f1100n;

    /* renamed from: o, reason: collision with root package name */
    public int f1101o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1102p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1103q;

    /* renamed from: r, reason: collision with root package name */
    public C0275c0 f1104r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1105s;

    /* renamed from: t, reason: collision with root package name */
    public int f1106t;

    /* renamed from: u, reason: collision with root package name */
    public int f1107u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1108v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1109w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1110x;

    /* renamed from: y, reason: collision with root package name */
    public C0275c0 f1111y;

    /* renamed from: z, reason: collision with root package name */
    public int f1112z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.f1099m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1090a = u2.l.G(context, R.attr.motionDurationShort4, 217);
        this.f1091b = u2.l.G(context, R.attr.motionDurationMedium4, 167);
        this.c = u2.l.G(context, R.attr.motionDurationShort4, 167);
        this.f1092d = u2.l.H(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, B0.a.f65d);
        LinearInterpolator linearInterpolator = B0.a.f63a;
        this.f1093e = u2.l.H(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1094f = u2.l.H(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i3) {
        if (this.f1095i == null && this.f1097k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1095i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1095i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1097k = new FrameLayout(context);
            this.f1095i.addView(this.f1097k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i3 == 0 || i3 == 1) {
            this.f1097k.setVisibility(0);
            this.f1097k.addView(textView);
        } else {
            this.f1095i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1095i.setVisibility(0);
        this.f1096j++;
    }

    public final void b() {
        if (this.f1095i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean x2 = u2.l.x(context);
                LinearLayout linearLayout = this.f1095i;
                WeakHashMap weakHashMap = T.f402a;
                int f3 = J.C.f(editText);
                if (x2) {
                    f3 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (x2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int e3 = J.C.e(editText);
                if (x2) {
                    e3 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                J.C.k(linearLayout, f3, dimensionPixelSize, e3, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f1098l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, TextView textView, int i3, int i4, int i5) {
        if (textView == null || !z3) {
            return;
        }
        if (i3 == i5 || i3 == i4) {
            boolean z4 = i5 == i3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z4 ? 1.0f : 0.0f);
            int i6 = this.c;
            ofFloat.setDuration(z4 ? this.f1091b : i6);
            ofFloat.setInterpolator(z4 ? this.f1093e : this.f1094f);
            if (i3 == i5 && i4 != 0) {
                ofFloat.setStartDelay(i6);
            }
            arrayList.add(ofFloat);
            if (i5 != i3 || i4 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f1099m, 0.0f);
            ofFloat2.setDuration(this.f1090a);
            ofFloat2.setInterpolator(this.f1092d);
            ofFloat2.setStartDelay(i6);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i3) {
        if (i3 == 1) {
            return this.f1104r;
        }
        if (i3 != 2) {
            return null;
        }
        return this.f1111y;
    }

    public final void f() {
        this.f1102p = null;
        c();
        if (this.f1100n == 1) {
            if (!this.f1110x || TextUtils.isEmpty(this.f1109w)) {
                this.f1101o = 0;
            } else {
                this.f1101o = 2;
            }
        }
        i(this.f1100n, this.f1101o, h(this.f1104r, ""));
    }

    public final void g(TextView textView, int i3) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1095i;
        if (linearLayout == null) {
            return;
        }
        if ((i3 == 0 || i3 == 1) && (frameLayout = this.f1097k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i4 = this.f1096j - 1;
        this.f1096j = i4;
        LinearLayout linearLayout2 = this.f1095i;
        if (i4 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f402a;
        TextInputLayout textInputLayout = this.h;
        return J.E.c(textInputLayout) && textInputLayout.isEnabled() && !(this.f1101o == this.f1100n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i3, int i4, boolean z3) {
        TextView e3;
        TextView e4;
        if (i3 == i4) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1098l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f1110x, this.f1111y, 2, i3, i4);
            d(arrayList, this.f1103q, this.f1104r, 1, i3, i4);
            v0.f.I(animatorSet, arrayList);
            animatorSet.addListener(new r(this, i4, e(i3), i3, e(i4)));
            animatorSet.start();
        } else if (i3 != i4) {
            if (i4 != 0 && (e4 = e(i4)) != null) {
                e4.setVisibility(0);
                e4.setAlpha(1.0f);
            }
            if (i3 != 0 && (e3 = e(i3)) != null) {
                e3.setVisibility(4);
                if (i3 == 1) {
                    e3.setText((CharSequence) null);
                }
            }
            this.f1100n = i4;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z3, false);
        textInputLayout.x();
    }
}
