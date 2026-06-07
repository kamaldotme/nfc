package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2437b;
    public final /* synthetic */ s c;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.c = sVar;
        this.f2437b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        MaterialCalendarGridView materialCalendarGridView = this.f2437b;
        p a3 = materialCalendarGridView.a();
        if (i3 < a3.a() || i3 > a3.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i3).longValue() >= ((k) this.c.f2440d.c).f2396U.f2379d.f2384b) {
            throw null;
        }
    }
}
