package com.google.android.material.datepicker;

import J.C0024x;
import J.T;
import Z.W;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class r extends W {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f2438t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f2439u;

    public r(LinearLayout linearLayout, boolean z3) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2438t = textView;
        WeakHashMap weakHashMap = T.f402a;
        new C0024x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).g(textView, Boolean.TRUE);
        this.f2439u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z3) {
            return;
        }
        textView.setVisibility(8);
    }
}
