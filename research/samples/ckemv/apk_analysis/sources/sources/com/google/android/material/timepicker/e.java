package com.google.android.material.timepicker;

import B2.u;
import J.B;
import J.C;
import J.T;
import U0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public final u f2584q;

    /* renamed from: r, reason: collision with root package name */
    public int f2585r;

    /* renamed from: s, reason: collision with root package name */
    public final U0.g f2586s;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        U0.g gVar = new U0.g();
        this.f2586s = gVar;
        U0.h hVar = new U0.h(0.5f);
        j e3 = gVar.f906b.f887a.e();
        e3.f929e = hVar;
        e3.f930f = hVar;
        e3.g = hVar;
        e3.h = hVar;
        gVar.setShapeAppearanceModel(e3.a());
        this.f2586s.k(ColorStateList.valueOf(-1));
        U0.g gVar2 = this.f2586s;
        WeakHashMap weakHashMap = T.f402a;
        B.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.f37s, R.attr.materialClockStyle, 0);
        this.f2585r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2584q = new u(11, this);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = T.f402a;
            view.setId(C.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            u uVar = this.f2584q;
            handler.removeCallbacks(uVar);
            handler.post(uVar);
        }
    }

    public abstract void f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            u uVar = this.f2584q;
            handler.removeCallbacks(uVar);
            handler.post(uVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i3) {
        this.f2586s.k(ColorStateList.valueOf(i3));
    }
}
