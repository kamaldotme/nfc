package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final U0.e f2382a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.e f2383b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(u2.d.B(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, A0.a.f29k);
        U0.e.a(context, obtainStyledAttributes.getResourceId(4, 0));
        U0.e.a(context, obtainStyledAttributes.getResourceId(2, 0));
        U0.e.a(context, obtainStyledAttributes.getResourceId(3, 0));
        U0.e.a(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList m3 = u2.l.m(context, obtainStyledAttributes, 7);
        this.f2382a = U0.e.a(context, obtainStyledAttributes.getResourceId(9, 0));
        U0.e.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2383b = U0.e.a(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(m3.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
