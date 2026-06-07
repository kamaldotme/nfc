package com.google.android.material.datepicker;

import Z.AbstractC0058z;
import Z.W;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class y extends AbstractC0058z {
    public final k c;

    public y(k kVar) {
        this.c = kVar;
    }

    @Override // Z.AbstractC0058z
    public final int a() {
        return this.c.f2396U.g;
    }

    @Override // Z.AbstractC0058z
    public final void c(W w3, int i3) {
        k kVar = this.c;
        int i4 = kVar.f2396U.f2378b.f2430d + i3;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i4));
        TextView textView = ((x) w3).f2444t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(w.c().get(1) == i4 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i4)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i4)));
        c cVar = kVar.f2399X;
        if (w.c().get(1) == i4) {
            U0.e eVar = cVar.f2383b;
        } else {
            U0.e eVar2 = cVar.f2382a;
        }
        throw null;
    }

    @Override // Z.AbstractC0058z
    public final W d(RecyclerView recyclerView) {
        return new x((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
