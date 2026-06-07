package com.google.android.material.timepicker;

import J.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.k;
import u2.l;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final float[] f2555A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2556B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2557C;
    public final int D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2558E;

    /* renamed from: F, reason: collision with root package name */
    public final String[] f2559F;

    /* renamed from: G, reason: collision with root package name */
    public float f2560G;

    /* renamed from: H, reason: collision with root package name */
    public final ColorStateList f2561H;

    /* renamed from: t, reason: collision with root package name */
    public final ClockHandView f2562t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f2563u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f2564v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2565w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f2566x;

    /* renamed from: y, reason: collision with root package name */
    public final c f2567y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f2568z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2563u = new Rect();
        this.f2564v = new RectF();
        this.f2565w = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2566x = sparseArray;
        this.f2555A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.c, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m3 = l.m(context, obtainStyledAttributes, 1);
        this.f2561H = m3;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2562t = clockHandView;
        this.f2556B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = m3.getColorForState(new int[]{android.R.attr.state_selected}, m3.getDefaultColor());
        this.f2568z = new int[]{colorForState, colorForState, m3.getDefaultColor()};
        clockHandView.f2570d.add(this);
        int defaultColor = y.f.c(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m4 = l.m(context, obtainStyledAttributes, 0);
        setBackgroundColor(m4 != null ? m4.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2567y = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2559F = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < Math.max(this.f2559F.length, size); i3++) {
            TextView textView = (TextView) sparseArray.get(i3);
            if (i3 >= this.f2559F.length) {
                removeView(textView);
                sparseArray.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.f2559F[i3]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i3));
                int i4 = (i3 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i4));
                z3 = i4 > 1 ? true : z3;
                T.l(textView, this.f2567y);
                textView.setTextColor(this.f2561H);
            }
        }
        ClockHandView clockHandView2 = this.f2562t;
        if (clockHandView2.c && !z3) {
            clockHandView2.f2578n = 1;
        }
        clockHandView2.c = z3;
        clockHandView2.invalidate();
        this.f2557C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2558E = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void f() {
        k kVar = new k();
        kVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!hashMap.containsKey(i4)) {
                    hashMap.put(i4, new ArrayList());
                }
                ((List) hashMap.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2585r * 0.66f) : this.f2585r;
            Iterator it = list.iterator();
            float f3 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = kVar.c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new t.f());
                }
                t.g gVar = ((t.f) hashMap2.get(Integer.valueOf(id))).f4799d;
                gVar.f4855w = R.id.circle_center;
                gVar.f4856x = round;
                gVar.f4857y = f3;
                f3 += 360.0f / list.size();
            }
        }
        kVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f2566x;
            if (i5 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i5)).setVisibility(0);
            i5++;
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2562t.h;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i3 = 0;
        while (true) {
            sparseArray = this.f2566x;
            int size = sparseArray.size();
            rectF = this.f2564v;
            rect = this.f2563u;
            if (i3 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i3);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f3) {
                    textView = textView2;
                    f3 = height;
                }
            }
            i3++;
        }
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            TextView textView3 = (TextView) sparseArray.get(i4);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2565w);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2568z, this.f2555A, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2559F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f2558E / Math.max(Math.max(this.f2557C / displayMetrics.heightPixels, this.D / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
