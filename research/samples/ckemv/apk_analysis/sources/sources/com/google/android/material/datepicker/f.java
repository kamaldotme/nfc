package com.google.android.material.datepicker;

import Z.H;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2387b;
    public final /* synthetic */ s c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2388d;

    public /* synthetic */ f(k kVar, s sVar, int i3) {
        this.f2387b = i3;
        this.f2388d = kVar;
        this.c = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2387b) {
            case 0:
                k kVar = this.f2388d;
                int H02 = ((LinearLayoutManager) kVar.f2401Z.getLayoutManager()).H0() - 1;
                if (H02 >= 0) {
                    Calendar b3 = w.b(this.c.c.f2378b.f2429b);
                    b3.add(2, H02);
                    kVar.A(new o(b3));
                    return;
                }
                return;
            default:
                k kVar2 = this.f2388d;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f2401Z.getLayoutManager();
                View J02 = linearLayoutManager.J0(0, linearLayoutManager.v(), false);
                int F2 = (J02 == null ? -1 : H.F(J02)) + 1;
                if (F2 < kVar2.f2401Z.getAdapter().a()) {
                    Calendar b4 = w.b(this.c.c.f2378b.f2429b);
                    b4.add(2, F2);
                    kVar2.A(new o(b4));
                    return;
                }
                return;
        }
    }
}
