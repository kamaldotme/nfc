package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import e.AbstractC0116a;
import j.AbstractC0197c;
import j.C0196b;
import j.C0209o;
import j.InterfaceC0189A;
import j.InterfaceC0206l;
import j.MenuC0207m;
import k.C0275c0;
import k.InterfaceC0290k;
import k.o1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0275c0 implements InterfaceC0189A, View.OnClickListener, InterfaceC0290k {

    /* renamed from: i, reason: collision with root package name */
    public C0209o f1503i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1504j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f1505k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0206l f1506l;

    /* renamed from: m, reason: collision with root package name */
    public C0196b f1507m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0197c f1508n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1509o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1510p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1511q;

    /* renamed from: r, reason: collision with root package name */
    public int f1512r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1513s;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1509o = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0116a.c, 0, 0);
        this.f1511q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1513s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1512r = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0290k
    public final boolean a() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f1503i.getIcon() == null;
    }

    @Override // k.InterfaceC0290k
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // j.InterfaceC0189A
    public final void c(C0209o c0209o) {
        this.f1503i = c0209o;
        setIcon(c0209o.getIcon());
        setTitle(c0209o.getTitleCondensed());
        setId(c0209o.f3335a);
        setVisibility(c0209o.isVisible() ? 0 : 8);
        setEnabled(c0209o.isEnabled());
        if (c0209o.hasSubMenu() && this.f1507m == null) {
            this.f1507m = new C0196b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.InterfaceC0189A
    public C0209o getItemData() {
        return this.f1503i;
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        return i3 >= 480 || (i3 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void n() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f1504j);
        if (this.f1505k != null && ((this.f1503i.f3356y & 4) != 4 || (!this.f1509o && !this.f1510p))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f1504j : null);
        CharSequence charSequence = this.f1503i.f3348q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f1503i.f3338e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1503i.f3349r;
        if (TextUtils.isEmpty(charSequence2)) {
            o1.a(this, z5 ? null : this.f1503i.f3338e);
        } else {
            o1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0206l interfaceC0206l = this.f1506l;
        if (interfaceC0206l != null) {
            interfaceC0206l.d(this.f1503i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1509o = m();
        n();
    }

    @Override // k.C0275c0, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z3 = !TextUtils.isEmpty(getText());
        if (z3 && (i5 = this.f1512r) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f1511q;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (z3 || this.f1505k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1505k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0196b c0196b;
        if (this.f1503i.hasSubMenu() && (c0196b = this.f1507m) != null && c0196b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f1510p != z3) {
            this.f1510p = z3;
            C0209o c0209o = this.f1503i;
            if (c0209o != null) {
                MenuC0207m menuC0207m = c0209o.f3345n;
                menuC0207m.f3316k = true;
                menuC0207m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1505k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f1513s;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(InterfaceC0206l interfaceC0206l) {
        this.f1506l = interfaceC0206l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f1512r = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(AbstractC0197c abstractC0197c) {
        this.f1508n = abstractC0197c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1504j = charSequence;
        n();
    }
}
