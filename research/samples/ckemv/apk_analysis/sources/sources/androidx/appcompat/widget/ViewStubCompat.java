package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.AbstractC0116a;
import java.lang.ref.WeakReference;
import k.q1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f1677b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f1678d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f1679e;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1677b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0116a.f2664A, 0, 0);
        this.c = obtainStyledAttributes.getResourceId(2, -1);
        this.f1677b = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1677b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1679e;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1677b, viewGroup, false);
        int i3 = this.c;
        if (i3 != -1) {
            inflate.setId(i3);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1678d = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1679e;
    }

    public int getLayoutResource() {
        return this.f1677b;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.c = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1679e = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f1677b = i3;
    }

    public void setOnInflateListener(q1 q1Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        WeakReference weakReference = this.f1678d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i3);
            return;
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            a();
        }
    }
}
