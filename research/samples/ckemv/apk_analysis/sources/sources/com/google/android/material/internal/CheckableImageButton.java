package com.google.android.material.internal;

import G0.e;
import J.T;
import O0.a;
import P.b;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import k.C0316x;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0316x implements Checkable {
    public static final int[] h = {R.attr.state_checked};

    /* renamed from: e, reason: collision with root package name */
    public boolean f2446e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2447f;
    public boolean g;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.happify.ckemv.R.attr.imageButtonStyle);
        this.f2447f = true;
        this.g = true;
        T.l(this, new e(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2446e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        return this.f2446e ? View.mergeDrawableStates(super.onCreateDrawableState(i3 + 1), h) : super.onCreateDrawableState(i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f783b);
        setChecked(aVar.f695d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [O0.a, android.os.Parcelable, P.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f695d = this.f2446e;
        return bVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f2447f != z3) {
            this.f2447f = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.f2447f || this.f2446e == z3) {
            return;
        }
        this.f2446e = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z3) {
        this.g = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.g) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2446e);
    }
}
