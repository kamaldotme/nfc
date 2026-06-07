package com.google.android.material.datepicker;

import Z.AbstractC0058z;
import Z.I;
import Z.W;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class s extends AbstractC0058z {
    public final b c;

    /* renamed from: d, reason: collision with root package name */
    public final A.h f2440d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2441e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, A.h hVar) {
        o oVar = bVar.f2378b;
        o oVar2 = bVar.f2380e;
        if (oVar.f2429b.compareTo(oVar2.f2429b) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f2429b.compareTo(bVar.c.f2429b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2441e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.f2433e) + (m.E(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.c = bVar;
        this.f2440d = hVar;
        if (this.f1372a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1373b = true;
    }

    @Override // Z.AbstractC0058z
    public final int a() {
        return this.c.h;
    }

    @Override // Z.AbstractC0058z
    public final long b(int i3) {
        Calendar b3 = w.b(this.c.f2378b.f2429b);
        b3.add(2, i3);
        return new o(b3).f2429b.getTimeInMillis();
    }

    @Override // Z.AbstractC0058z
    public final void c(W w3, int i3) {
        r rVar = (r) w3;
        b bVar = this.c;
        Calendar b3 = w.b(bVar.f2378b.f2429b);
        b3.add(2, i3);
        o oVar = new o(b3);
        rVar.f2438t.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f2439u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f2435b)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // Z.AbstractC0058z
    public final W d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (!m.E(recyclerView.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new I(-1, this.f2441e));
        return new r(linearLayout, true);
    }
}
