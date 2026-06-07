package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f2385b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2386d;

    public e() {
        Calendar d3 = w.d(null);
        this.f2385b = d3;
        this.c = d3.getMaximum(7);
        this.f2386d = d3.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        int i4 = this.c;
        if (i3 >= i4) {
            return null;
        }
        int i5 = i3 + this.f2386d;
        if (i5 > i4) {
            i5 -= i4;
        }
        return Integer.valueOf(i5);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i4 = i3 + this.f2386d;
        int i5 = this.c;
        if (i4 > i5) {
            i4 -= i5;
        }
        Calendar calendar = this.f2385b;
        calendar.set(7, i4);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i3) {
        Calendar d3 = w.d(null);
        this.f2385b = d3;
        this.c = d3.getMaximum(7);
        this.f2386d = i3;
    }
}
