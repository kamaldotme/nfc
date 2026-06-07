package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class n<S> extends t {

    /* renamed from: T, reason: collision with root package name */
    public int f2427T;

    /* renamed from: U, reason: collision with root package name */
    public b f2428U;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.f2427T = bundle.getInt("THEME_RES_ID_KEY");
        X.d.m(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f2428U = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final View m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.f2427T));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void q(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2427T);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2428U);
    }
}
