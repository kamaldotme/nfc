package com.google.android.material.datepicker;

import Z.E;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h extends E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2391a;

    public h(k kVar) {
        this.f2391a = kVar;
        w.d(null);
        w.d(null);
    }

    @Override // Z.E
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2391a.getClass();
            throw null;
        }
    }
}
