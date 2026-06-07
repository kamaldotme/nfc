package androidx.appcompat.widget;

import J.B;
import J.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import e.AbstractC0116a;
import java.util.WeakHashMap;
import k.C0272b;
import k.R0;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1529b;
    public View c;

    /* renamed from: d, reason: collision with root package name */
    public View f1530d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1531e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1532f;
    public Drawable g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1533i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1534j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0272b c0272b = new C0272b(this);
        WeakHashMap weakHashMap = T.f402a;
        B.q(this, c0272b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0116a.f2665a);
        boolean z3 = false;
        this.f1531e = obtainStyledAttributes.getDrawable(0);
        this.f1532f = obtainStyledAttributes.getDrawable(2);
        this.f1534j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.h = true;
            this.g = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.h ? !(this.f1531e != null || this.f1532f != null) : this.g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1531e;
        if (drawable != null && drawable.isStateful()) {
            this.f1531e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1532f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1532f.setState(getDrawableState());
        }
        Drawable drawable3 = this.g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1531e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1532f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = findViewById(R.id.action_bar);
        this.f1530d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1529b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        boolean z4;
        super.onLayout(z3, i3, i4, i5, i6);
        if (this.h) {
            Drawable drawable = this.g;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f1531e != null) {
                if (this.c.getVisibility() == 0) {
                    this.f1531e.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                } else {
                    View view = this.f1530d;
                    if (view == null || view.getVisibility() != 0) {
                        this.f1531e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1531e.setBounds(this.f1530d.getLeft(), this.f1530d.getTop(), this.f1530d.getRight(), this.f1530d.getBottom());
                    }
                }
                z4 = true;
            } else {
                z4 = false;
            }
            this.f1533i = false;
            if (!z4) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.c == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f1534j) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.c == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1531e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1531e);
        }
        this.f1531e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.c;
            if (view != null) {
                this.f1531e.setBounds(view.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.h ? !(this.f1531e != null || this.f1532f != null) : this.g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.g);
        }
        this.g = drawable;
        boolean z3 = this.h;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f1531e != null || this.f1532f != null) : this.g == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1532f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1532f);
        }
        this.f1532f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1533i && this.f1532f != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.h ? !(this.f1531e != null || this.f1532f != null) : this.g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(R0 r02) {
    }

    public void setTransitioning(boolean z3) {
        this.f1529b = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f1531e;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f1532f;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1531e;
        boolean z3 = this.h;
        return (drawable == drawable2 && !z3) || (drawable == this.f1532f && this.f1533i) || ((drawable == this.g && z3) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }
}
