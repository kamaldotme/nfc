package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class p extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2433e = w.d(null).getMaximum(4);

    /* renamed from: f, reason: collision with root package name */
    public static final int f2434f = (w.d(null).getMaximum(7) + w.d(null).getMaximum(5)) - 1;

    /* renamed from: b, reason: collision with root package name */
    public final o f2435b;
    public c c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2436d;

    public p(o oVar, b bVar) {
        this.f2435b = oVar;
        this.f2436d = bVar;
        throw null;
    }

    public final int a() {
        int i3 = this.f2436d.f2381f;
        o oVar = this.f2435b;
        Calendar calendar = oVar.f2429b;
        int i4 = calendar.get(7);
        if (i3 <= 0) {
            i3 = calendar.getFirstDayOfWeek();
        }
        int i5 = i4 - i3;
        return i5 < 0 ? i5 + oVar.f2431e : i5;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i3) {
        if (i3 < a() || i3 > c()) {
            return null;
        }
        int a3 = (i3 - a()) + 1;
        Calendar b3 = w.b(this.f2435b.f2429b);
        b3.set(5, a3);
        return Long.valueOf(b3.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f2435b.f2432f) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f2434f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3 / this.f2435b.f2431e;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.c == null) {
            this.c = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a3 = i3 - a();
        if (a3 >= 0) {
            o oVar = this.f2435b;
            if (a3 < oVar.f2432f) {
                textView.setTag(oVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a3 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i3) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                w.c().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i3) == null) {
            textView.getContext();
            w.c().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
