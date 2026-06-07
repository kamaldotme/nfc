package com.google.android.material.timepicker;

import J.C0004c;
import K.j;
import K.o;
import K.p;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class c extends C0004c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2583d;

    public c(ClockFaceView clockFaceView) {
        this.f2583d = clockFaceView;
    }

    @Override // J.C0004c
    public final void d(View view, p pVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f413a;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2583d.f2566x.get(intValue - 1));
        }
        pVar.h(o.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        pVar.b(j.f585e);
    }

    @Override // J.C0004c
    public final boolean g(View view, int i3, Bundle bundle) {
        if (i3 != 16) {
            return super.g(view, i3, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2583d;
        view.getHitRect(clockFaceView.f2563u);
        float centerX = clockFaceView.f2563u.centerX();
        float centerY = clockFaceView.f2563u.centerY();
        clockFaceView.f2562t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2562t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
