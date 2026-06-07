package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import f.C0157e;
import i.AbstractC0184b;
import j.C0209o;
import k.i1;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2394b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i3, Object obj) {
        this.f2394b = i3;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2394b) {
            case 0:
                k kVar = (k) this.c;
                int i3 = kVar.f2398W;
                if (i3 == 2) {
                    kVar.B(1);
                    return;
                } else {
                    if (i3 == 1) {
                        kVar.B(2);
                        return;
                    }
                    return;
                }
            case 1:
                C0157e c0157e = (C0157e) this.c;
                Button button = c0157e.f2887f;
                c0157e.f2902w.obtainMessage(1, c0157e.f2884b).sendToTarget();
                return;
            case 2:
                ((AbstractC0184b) this.c).a();
                return;
            default:
                i1 i1Var = ((Toolbar) this.c).f1649L;
                C0209o c0209o = i1Var == null ? null : i1Var.c;
                if (c0209o != null) {
                    c0209o.collapseActionView();
                    return;
                }
                return;
        }
    }
}
