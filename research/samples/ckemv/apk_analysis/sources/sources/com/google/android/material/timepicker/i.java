package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f2590b;

    public i(GestureDetector gestureDetector) {
        this.f2590b = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2590b.onTouchEvent(motionEvent);
        }
        return false;
    }
}
