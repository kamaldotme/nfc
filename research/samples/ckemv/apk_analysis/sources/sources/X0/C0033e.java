package X0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import xyz.happify.ckemv.R;

/* renamed from: X0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f1030e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1031f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f1032i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0029a f1033j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0030b f1034k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1035l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1036m;

    public C0033e(p pVar) {
        super(pVar);
        this.f1033j = new ViewOnClickListenerC0029a(0, this);
        this.f1034k = new ViewOnFocusChangeListenerC0030b(this, 0);
        this.f1030e = u2.l.G(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f1031f = u2.l.G(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = u2.l.H(pVar.getContext(), R.attr.motionEasingLinearInterpolator, B0.a.f63a);
        this.h = u2.l.H(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, B0.a.f65d);
    }

    @Override // X0.q
    public final void a() {
        if (this.f1081b.f1073q != null) {
            return;
        }
        t(u());
    }

    @Override // X0.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // X0.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // X0.q
    public final View.OnFocusChangeListener e() {
        return this.f1034k;
    }

    @Override // X0.q
    public final View.OnClickListener f() {
        return this.f1033j;
    }

    @Override // X0.q
    public final View.OnFocusChangeListener g() {
        return this.f1034k;
    }

    @Override // X0.q
    public final void m(EditText editText) {
        this.f1032i = editText;
        this.f1080a.setEndIconVisible(u());
    }

    @Override // X0.q
    public final void p(boolean z3) {
        if (this.f1081b.f1073q == null) {
            return;
        }
        t(z3);
    }

    @Override // X0.q
    public final void r() {
        final int i3 = 1;
        final int i4 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f1031f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0033e f1027b;

            {
                this.f1027b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0033e c0033e = this.f1027b;
                        c0033e.getClass();
                        c0033e.f1082d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        C0033e c0033e2 = this.f1027b;
                        c0033e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0033e2.f1082d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i5 = this.f1030e;
        ofFloat2.setDuration(i5);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0033e f1027b;

            {
                this.f1027b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        C0033e c0033e = this.f1027b;
                        c0033e.getClass();
                        c0033e.f1082d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        C0033e c0033e2 = this.f1027b;
                        c0033e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0033e2.f1082d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1035l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1035l.addListener(new C0032d(this, i4));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i5);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0033e f1027b;

            {
                this.f1027b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        C0033e c0033e = this.f1027b;
                        c0033e.getClass();
                        c0033e.f1082d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        C0033e c0033e2 = this.f1027b;
                        c0033e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0033e2.f1082d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f1036m = ofFloat3;
        ofFloat3.addListener(new C0032d(this, i3));
    }

    @Override // X0.q
    public final void s() {
        EditText editText = this.f1032i;
        if (editText != null) {
            editText.post(new B2.u(5, this));
        }
    }

    public final void t(boolean z3) {
        boolean z4 = this.f1081b.d() == z3;
        if (z3 && !this.f1035l.isRunning()) {
            this.f1036m.cancel();
            this.f1035l.start();
            if (z4) {
                this.f1035l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f1035l.cancel();
        this.f1036m.start();
        if (z4) {
            this.f1036m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f1032i;
        return editText != null && (editText.hasFocus() || this.f1082d.hasFocus()) && this.f1032i.getText().length() > 0;
    }
}
