package com.google.android.material.timepicker;

import J.B;
import J.T;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import u2.l;
import xyz.happify.ckemv.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: b, reason: collision with root package name */
    public final ValueAnimator f2569b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2570d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2571e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2572f;
    public final Paint g;
    public final RectF h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2573i;

    /* renamed from: j, reason: collision with root package name */
    public float f2574j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2575k;

    /* renamed from: l, reason: collision with root package name */
    public double f2576l;

    /* renamed from: m, reason: collision with root package name */
    public int f2577m;

    /* renamed from: n, reason: collision with root package name */
    public int f2578n;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f2569b = new ValueAnimator();
        this.f2570d = new ArrayList();
        Paint paint = new Paint();
        this.g = paint;
        this.h = new RectF();
        this.f2578n = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.f24d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        l.G(context, R.attr.motionDurationLong2, 200);
        l.H(context, R.attr.motionEasingEmphasizedInterpolator, B0.a.f64b);
        this.f2577m = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2571e = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2573i = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2572f = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = T.f402a;
        B.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i3) {
        return i3 == 2 ? Math.round(this.f2577m * 0.66f) : this.f2577m;
    }

    public final void b(float f3) {
        ValueAnimator valueAnimator = this.f2569b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f3);
    }

    public final void c(float f3) {
        float f4 = f3 % 360.0f;
        this.f2574j = f4;
        this.f2576l = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a3 = a(this.f2578n);
        float cos = (((float) Math.cos(this.f2576l)) * a3) + width;
        float sin = (a3 * ((float) Math.sin(this.f2576l))) + height;
        float f5 = this.f2571e;
        this.h.set(cos - f5, sin - f5, cos + f5, sin + f5);
        Iterator it = this.f2570d.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f2560G - f4) > 0.001f) {
                clockFaceView.f2560G = f4;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f3 = width;
        float a3 = a(this.f2578n);
        float cos = (((float) Math.cos(this.f2576l)) * a3) + f3;
        float f4 = height;
        float sin = (a3 * ((float) Math.sin(this.f2576l))) + f4;
        Paint paint = this.g;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f2571e, paint);
        double sin2 = Math.sin(this.f2576l);
        paint.setStrokeWidth(this.f2573i);
        canvas.drawLine(f3, f4, width + ((int) (Math.cos(this.f2576l) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f3, f4, this.f2572f, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (this.f2569b.isRunning()) {
            return;
        }
        b(this.f2574j);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked == 0) {
            this.f2575k = false;
            z3 = true;
            z4 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z4 = this.f2575k;
            if (this.c) {
                this.f2578n = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y3 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z3 = false;
        } else {
            z4 = false;
            z3 = false;
        }
        boolean z6 = this.f2575k;
        int degrees = (int) Math.toDegrees(Math.atan2(y3 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i3 = degrees + 90;
        if (i3 < 0) {
            i3 = degrees + 450;
        }
        float f3 = i3;
        boolean z7 = this.f2574j != f3;
        if (!z3 || !z7) {
            if (z7 || z4) {
                b(f3);
            }
            this.f2575k = z6 | z5;
            return true;
        }
        z5 = true;
        this.f2575k = z6 | z5;
        return true;
    }
}
