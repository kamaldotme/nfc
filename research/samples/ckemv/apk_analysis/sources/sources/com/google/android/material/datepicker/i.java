package com.google.android.material.datepicker;

import Z.H;
import Z.K;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f2392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2393b;
    public final /* synthetic */ k c;

    public i(k kVar, s sVar, MaterialButton materialButton) {
        this.c = kVar;
        this.f2392a = sVar;
        this.f2393b = materialButton;
    }

    @Override // Z.K
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 0) {
            recyclerView.announceForAccessibility(this.f2393b.getText());
        }
    }

    @Override // Z.K
    public final void b(RecyclerView recyclerView, int i3, int i4) {
        int H02;
        k kVar = this.c;
        if (i3 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f2401Z.getLayoutManager();
            View J02 = linearLayoutManager.J0(0, linearLayoutManager.v(), false);
            H02 = J02 == null ? -1 : H.F(J02);
        } else {
            H02 = ((LinearLayoutManager) kVar.f2401Z.getLayoutManager()).H0();
        }
        s sVar = this.f2392a;
        Calendar b3 = w.b(sVar.c.f2378b.f2429b);
        b3.add(2, H02);
        kVar.f2397V = new o(b3);
        Calendar b4 = w.b(sVar.c.f2378b.f2429b);
        b4.add(2, H02);
        b4.set(5, 1);
        Calendar b5 = w.b(b4);
        b5.get(2);
        b5.get(1);
        b5.getMaximum(7);
        b5.getActualMaximum(5);
        b5.getTimeInMillis();
        this.f2393b.setText(w.a("yMMMM", Locale.getDefault()).format(new Date(b5.getTimeInMillis())));
    }
}
