package com.google.android.material.datepicker;

import Z.C0053u;
import Z.T;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f2389E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ k f2390F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i3, int i4) {
        super(i3);
        this.f2390F = kVar;
        this.f2389E = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final void u0(RecyclerView recyclerView, int i3) {
        C0053u c0053u = new C0053u(recyclerView.getContext());
        c0053u.f1353a = i3;
        v0(c0053u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void x0(T t3, int[] iArr) {
        int i3 = this.f2389E;
        k kVar = this.f2390F;
        if (i3 == 0) {
            iArr[0] = kVar.f2401Z.getWidth();
            iArr[1] = kVar.f2401Z.getWidth();
        } else {
            iArr[0] = kVar.f2401Z.getHeight();
            iArr[1] = kVar.f2401Z.getHeight();
        }
    }
}
