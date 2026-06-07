package X0;

import J.AbstractC0013l;
import J.T;
import a.AbstractC0059a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k.C0275c0;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f1061b;
    public final FrameLayout c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1062d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1063e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1064f;
    public View.OnLongClickListener g;
    public final CheckableImageButton h;

    /* renamed from: i, reason: collision with root package name */
    public final o f1065i;

    /* renamed from: j, reason: collision with root package name */
    public int f1066j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f1067k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1068l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f1069m;

    /* renamed from: n, reason: collision with root package name */
    public int f1070n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f1071o;

    /* renamed from: p, reason: collision with root package name */
    public View.OnLongClickListener f1072p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1073q;

    /* renamed from: r, reason: collision with root package name */
    public final C0275c0 f1074r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1075s;

    /* renamed from: t, reason: collision with root package name */
    public EditText f1076t;

    /* renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f1077u;

    /* renamed from: v, reason: collision with root package name */
    public K.d f1078v;

    /* renamed from: w, reason: collision with root package name */
    public final l f1079w;

    public p(TextInputLayout textInputLayout, v0.m mVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i3 = 0;
        this.f1066j = 0;
        this.f1067k = new LinkedHashSet();
        this.f1079w = new l(this);
        m mVar2 = new m(this);
        this.f1077u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1061b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a3 = a(this, from, R.id.text_input_error_icon);
        this.f1062d = a3;
        CheckableImageButton a4 = a(frameLayout, from, R.id.text_input_end_icon);
        this.h = a4;
        this.f1065i = new o(this, mVar);
        C0275c0 c0275c0 = new C0275c0(getContext(), null);
        this.f1074r = c0275c0;
        TypedArray typedArray = (TypedArray) mVar.f5087d;
        if (typedArray.hasValue(38)) {
            this.f1063e = u2.l.n(getContext(), mVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f1064f = O0.k.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(mVar.r(37));
        }
        a3.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = T.f402a;
        J.B.s(a3, 2);
        a3.setClickable(false);
        a3.setPressable(false);
        a3.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f1068l = u2.l.n(getContext(), mVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1069m = O0.k.g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a4.getContentDescription() != (text = typedArray.getText(27))) {
                a4.setContentDescription(text);
            }
            a4.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f1068l = u2.l.n(getContext(), mVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f1069m = O0.k.g(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a4.getContentDescription() != text2) {
                a4.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1070n) {
            this.f1070n = dimensionPixelSize;
            a4.setMinimumWidth(dimensionPixelSize);
            a4.setMinimumHeight(dimensionPixelSize);
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType o3 = v0.f.o(typedArray.getInt(31, -1));
            this.f1071o = o3;
            a4.setScaleType(o3);
            a3.setScaleType(o3);
        }
        c0275c0.setVisibility(8);
        c0275c0.setId(R.id.textinput_suffix_text);
        c0275c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        J.E.f(c0275c0, 1);
        c0275c0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0275c0.setTextColor(mVar.q(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f1073q = TextUtils.isEmpty(text3) ? null : text3;
        c0275c0.setText(text3);
        n();
        frameLayout.addView(a4);
        addView(c0275c0);
        addView(frameLayout);
        addView(a3);
        textInputLayout.f2516f0.add(mVar2);
        if (textInputLayout.f2513e != null) {
            mVar2.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n(i3, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i3) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i3);
        if (u2.l.x(getContext())) {
            AbstractC0013l.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q fVar;
        int i3 = this.f1066j;
        o oVar = this.f1065i;
        SparseArray sparseArray = (SparseArray) oVar.c;
        q qVar = (q) sparseArray.get(i3);
        if (qVar == null) {
            p pVar = (p) oVar.f1060d;
            if (i3 == -1) {
                fVar = new f(pVar, 0);
            } else if (i3 == 0) {
                fVar = new f(pVar, 1);
            } else if (i3 == 1) {
                qVar = new x(pVar, oVar.f1059b);
                sparseArray.append(i3, qVar);
            } else if (i3 == 2) {
                fVar = new C0033e(pVar);
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException(X.d.f("Invalid end icon mode: ", i3));
                }
                fVar = new k(pVar);
            }
            qVar = fVar;
            sparseArray.append(i3, qVar);
        }
        return qVar;
    }

    public final int c() {
        int c;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.h;
            c = AbstractC0013l.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            c = 0;
        }
        WeakHashMap weakHashMap = T.f402a;
        return J.C.e(this.f1074r) + J.C.e(this) + c;
    }

    public final boolean d() {
        return this.c.getVisibility() == 0 && this.h.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f1062d.getVisibility() == 0;
    }

    public final void f(boolean z3) {
        boolean z4;
        boolean isActivated;
        boolean z5;
        q b3 = b();
        boolean k2 = b3.k();
        CheckableImageButton checkableImageButton = this.h;
        boolean z6 = true;
        if (!k2 || (z5 = checkableImageButton.f2446e) == b3.l()) {
            z4 = false;
        } else {
            checkableImageButton.setChecked(!z5);
            z4 = true;
        }
        if (!(b3 instanceof k) || (isActivated = checkableImageButton.isActivated()) == b3.j()) {
            z6 = z4;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z3 || z6) {
            v0.f.J(this.f1061b, checkableImageButton, this.f1068l);
        }
    }

    public final void g(int i3) {
        if (this.f1066j == i3) {
            return;
        }
        q b3 = b();
        K.d dVar = this.f1078v;
        AccessibilityManager accessibilityManager = this.f1077u;
        if (dVar != null && accessibilityManager != null) {
            K.c.b(accessibilityManager, dVar);
        }
        this.f1078v = null;
        b3.s();
        this.f1066j = i3;
        Iterator it = this.f1067k.iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            throw null;
        }
        h(i3 != 0);
        q b4 = b();
        int i4 = this.f1065i.f1058a;
        if (i4 == 0) {
            i4 = b4.d();
        }
        Drawable s3 = i4 != 0 ? AbstractC0059a.s(getContext(), i4) : null;
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(s3);
        TextInputLayout textInputLayout = this.f1061b;
        if (s3 != null) {
            v0.f.i(textInputLayout, checkableImageButton, this.f1068l, this.f1069m);
            v0.f.J(textInputLayout, checkableImageButton, this.f1068l);
        }
        int c = b4.c();
        CharSequence text = c != 0 ? getResources().getText(c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b4.k());
        if (!b4.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i3);
        }
        b4.r();
        K.d h = b4.h();
        this.f1078v = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = T.f402a;
            if (J.E.b(this)) {
                K.c.a(accessibilityManager, this.f1078v);
            }
        }
        View.OnClickListener f3 = b4.f();
        View.OnLongClickListener onLongClickListener = this.f1072p;
        checkableImageButton.setOnClickListener(f3);
        v0.f.L(checkableImageButton, onLongClickListener);
        EditText editText = this.f1076t;
        if (editText != null) {
            b4.m(editText);
            j(b4);
        }
        v0.f.i(textInputLayout, checkableImageButton, this.f1068l, this.f1069m);
        f(true);
    }

    public final void h(boolean z3) {
        if (d() != z3) {
            this.h.setVisibility(z3 ? 0 : 8);
            k();
            m();
            this.f1061b.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1062d;
        checkableImageButton.setImageDrawable(drawable);
        l();
        v0.f.i(this.f1061b, checkableImageButton, this.f1063e, this.f1064f);
    }

    public final void j(q qVar) {
        if (this.f1076t == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f1076t.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.h.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.c.setVisibility((this.h.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f1073q == null || this.f1075s) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f1062d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1061b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2522k.f1103q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f1066j != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i3;
        TextInputLayout textInputLayout = this.f1061b;
        if (textInputLayout.f2513e == null) {
            return;
        }
        if (d() || e()) {
            i3 = 0;
        } else {
            EditText editText = textInputLayout.f2513e;
            WeakHashMap weakHashMap = T.f402a;
            i3 = J.C.e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2513e.getPaddingTop();
        int paddingBottom = textInputLayout.f2513e.getPaddingBottom();
        WeakHashMap weakHashMap2 = T.f402a;
        J.C.k(this.f1074r, dimensionPixelSize, paddingTop, i3, paddingBottom);
    }

    public final void n() {
        C0275c0 c0275c0 = this.f1074r;
        int visibility = c0275c0.getVisibility();
        int i3 = (this.f1073q == null || this.f1075s) ? 8 : 0;
        if (visibility != i3) {
            b().p(i3 == 0);
        }
        k();
        c0275c0.setVisibility(i3);
        this.f1061b.q();
    }
}
