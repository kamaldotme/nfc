package com.google.android.material.datepicker;

import J.T;
import Z.C0056x;
import Z.Z;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k<S> extends t {

    /* renamed from: T, reason: collision with root package name */
    public int f2395T;

    /* renamed from: U, reason: collision with root package name */
    public b f2396U;

    /* renamed from: V, reason: collision with root package name */
    public o f2397V;

    /* renamed from: W, reason: collision with root package name */
    public int f2398W;

    /* renamed from: X, reason: collision with root package name */
    public c f2399X;

    /* renamed from: Y, reason: collision with root package name */
    public RecyclerView f2400Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f2401Z;

    /* renamed from: a0, reason: collision with root package name */
    public View f2402a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f2403b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f2404c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f2405d0;

    public final void A(o oVar) {
        s sVar = (s) this.f2401Z.getAdapter();
        int d3 = sVar.c.f2378b.d(oVar);
        int d4 = d3 - sVar.c.f2378b.d(this.f2397V);
        boolean z3 = Math.abs(d4) > 3;
        boolean z4 = d4 > 0;
        this.f2397V = oVar;
        if (z3 && z4) {
            this.f2401Z.a0(d3 - 3);
            this.f2401Z.post(new G.a(d3, 2, this));
        } else if (!z3) {
            this.f2401Z.post(new G.a(d3, 2, this));
        } else {
            this.f2401Z.a0(d3 + 3);
            this.f2401Z.post(new G.a(d3, 2, this));
        }
    }

    public final void B(int i3) {
        this.f2398W = i3;
        if (i3 == 2) {
            this.f2400Y.getLayoutManager().k0(this.f2397V.f2430d - ((y) this.f2400Y.getAdapter()).c.f2396U.f2378b.f2430d);
            this.f2404c0.setVisibility(0);
            this.f2405d0.setVisibility(8);
            this.f2402a0.setVisibility(8);
            this.f2403b0.setVisibility(8);
            return;
        }
        if (i3 == 1) {
            this.f2404c0.setVisibility(8);
            this.f2405d0.setVisibility(0);
            this.f2402a0.setVisibility(0);
            this.f2403b0.setVisibility(0);
            A(this.f2397V);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.f2395T = bundle.getInt("THEME_RES_ID_KEY");
        X.d.m(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f2396U = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        X.d.m(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f2397V = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final View m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i3;
        int i4;
        C0056x c0056x;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f2395T);
        this.f2399X = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f2396U.f2378b;
        if (m.E(contextThemeWrapper, R.attr.windowFullscreen)) {
            i3 = xyz.happify.ckemv.R.layout.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i3 = xyz.happify.ckemv.R.layout.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        Resources resources = w().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(xyz.happify.ckemv.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(xyz.happify.ckemv.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = p.f2433e;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(xyz.happify.ckemv.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(xyz.happify.ckemv.R.id.mtrl_calendar_days_of_week);
        T.l(gridView, new N.i(1));
        int i6 = this.f2396U.f2381f;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new e(i6) : new e()));
        gridView.setNumColumns(oVar.f2431e);
        gridView.setEnabled(false);
        this.f2401Z = (RecyclerView) inflate.findViewById(xyz.happify.ckemv.R.id.mtrl_calendar_months);
        h();
        this.f2401Z.setLayoutManager(new g(this, i4, i4));
        this.f2401Z.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f2396U, new A.h(27, this));
        this.f2401Z.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(xyz.happify.ckemv.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(xyz.happify.ckemv.R.id.mtrl_calendar_year_selector_frame);
        this.f2400Y = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2400Y.setLayoutManager(new GridLayoutManager(integer));
            this.f2400Y.setAdapter(new y(this));
            this.f2400Y.g(new h(this));
        }
        if (inflate.findViewById(xyz.happify.ckemv.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(xyz.happify.ckemv.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            T.l(materialButton, new G0.e(3, this));
            View findViewById = inflate.findViewById(xyz.happify.ckemv.R.id.month_navigation_previous);
            this.f2402a0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(xyz.happify.ckemv.R.id.month_navigation_next);
            this.f2403b0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2404c0 = inflate.findViewById(xyz.happify.ckemv.R.id.mtrl_calendar_year_selector_frame);
            this.f2405d0 = inflate.findViewById(xyz.happify.ckemv.R.id.mtrl_calendar_day_selector_frame);
            B(1);
            materialButton.setText(this.f2397V.c());
            this.f2401Z.h(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(0, this));
            this.f2403b0.setOnClickListener(new f(this, sVar, 1));
            this.f2402a0.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.E(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0056x = new C0056x()).f1368a) != (recyclerView = this.f2401Z)) {
            Z z3 = c0056x.f1369b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f2126f0;
                if (arrayList != null) {
                    arrayList.remove(z3);
                }
                c0056x.f1368a.setOnFlingListener(null);
            }
            c0056x.f1368a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0056x.f1368a.h(z3);
                c0056x.f1368a.setOnFlingListener(c0056x);
                new Scroller(c0056x.f1368a.getContext(), new DecelerateInterpolator());
                c0056x.f();
            }
        }
        this.f2401Z.a0(sVar.c.f2378b.d(this.f2397V));
        T.l(this.f2401Z, new N.i(2));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void q(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2395T);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2396U);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2397V);
    }
}
