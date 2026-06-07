package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2582b;

    public b(ClockFaceView clockFaceView) {
        this.f2582b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2582b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2562t.f2571e) - clockFaceView.f2556B;
        if (height != clockFaceView.f2585r) {
            clockFaceView.f2585r = height;
            clockFaceView.f();
            int i3 = clockFaceView.f2585r;
            ClockHandView clockHandView = clockFaceView.f2562t;
            clockHandView.f2577m = i3;
            clockHandView.invalidate();
        }
        return true;
    }
}
