package X0;

import J.T;
import J.Y;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f1043e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1044f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewOnClickListenerC0029a f1045i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0030b f1046j;

    /* renamed from: k, reason: collision with root package name */
    public final B2.b f1047k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1048l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1049m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1050n;

    /* renamed from: o, reason: collision with root package name */
    public long f1051o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1052p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1053q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1054r;

    public k(p pVar) {
        super(pVar);
        int i3 = 1;
        this.f1045i = new ViewOnClickListenerC0029a(i3, this);
        this.f1046j = new ViewOnFocusChangeListenerC0030b(this, i3);
        this.f1047k = new B2.b(this);
        this.f1051o = Long.MAX_VALUE;
        this.f1044f = u2.l.G(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f1043e = u2.l.G(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = u2.l.H(pVar.getContext(), R.attr.motionEasingLinearInterpolator, B0.a.f63a);
    }

    @Override // X0.q
    public final void a() {
        if (this.f1052p.isTouchExplorationEnabled() && u2.l.w(this.h) && !this.f1082d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new B2.u(6, this));
    }

    @Override // X0.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // X0.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // X0.q
    public final View.OnFocusChangeListener e() {
        return this.f1046j;
    }

    @Override // X0.q
    public final View.OnClickListener f() {
        return this.f1045i;
    }

    @Override // X0.q
    public final K.d h() {
        return this.f1047k;
    }

    @Override // X0.q
    public final boolean i(int i3) {
        return i3 != 0;
    }

    @Override // X0.q
    public final boolean j() {
        return this.f1048l;
    }

    @Override // X0.q
    public final boolean l() {
        return this.f1050n;
    }

    @Override // X0.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = k.this;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f1051o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f1049m = false;
                    }
                    kVar.u();
                    kVar.f1049m = true;
                    kVar.f1051o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: X0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f1049m = true;
                kVar.f1051o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1080a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!u2.l.w(editText) && this.f1052p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = T.f402a;
            J.B.s(this.f1082d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // X0.q
    public final void n(K.p pVar) {
        boolean w3 = u2.l.w(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
        if (!w3) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // X0.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1052p.isEnabled() || u2.l.w(this.h)) {
            return;
        }
        boolean z3 = accessibilityEvent.getEventType() == 32768 && this.f1050n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z3) {
            u();
            this.f1049m = true;
            this.f1051o = System.currentTimeMillis();
        }
    }

    @Override // X0.q
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1044f);
        ofFloat.addUpdateListener(new Y(this));
        this.f1054r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f1043e);
        ofFloat2.addUpdateListener(new Y(this));
        this.f1053q = ofFloat2;
        ofFloat2.addListener(new D0.a(1, this));
        this.f1052p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // X0.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z3) {
        if (this.f1050n != z3) {
            this.f1050n = z3;
            this.f1054r.cancel();
            this.f1053q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1051o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1049m = false;
        }
        if (this.f1049m) {
            this.f1049m = false;
            return;
        }
        t(!this.f1050n);
        if (!this.f1050n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
