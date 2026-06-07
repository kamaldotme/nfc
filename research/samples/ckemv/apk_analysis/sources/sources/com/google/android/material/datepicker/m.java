package com.google.android.material.datepicker;

import J.A0;
import J.E;
import J.H;
import J.T;
import J.d0;
import J.e0;
import J.z0;
import X0.ViewOnClickListenerC0029a;
import a.AbstractC0059a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0074k {

    /* renamed from: A0, reason: collision with root package name */
    public CharSequence f2408A0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f2409h0;
    public final LinkedHashSet i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f2410j0;

    /* renamed from: k0, reason: collision with root package name */
    public t f2411k0;

    /* renamed from: l0, reason: collision with root package name */
    public b f2412l0;

    /* renamed from: m0, reason: collision with root package name */
    public k f2413m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f2414n0;

    /* renamed from: o0, reason: collision with root package name */
    public CharSequence f2415o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f2416p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2417q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f2418r0;

    /* renamed from: s0, reason: collision with root package name */
    public CharSequence f2419s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2420t0;

    /* renamed from: u0, reason: collision with root package name */
    public CharSequence f2421u0;

    /* renamed from: v0, reason: collision with root package name */
    public TextView f2422v0;

    /* renamed from: w0, reason: collision with root package name */
    public CheckableImageButton f2423w0;

    /* renamed from: x0, reason: collision with root package name */
    public U0.g f2424x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f2425y0;

    /* renamed from: z0, reason: collision with root package name */
    public CharSequence f2426z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2409h0 = new LinkedHashSet();
        this.i0 = new LinkedHashSet();
    }

    public static int D(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c = w.c();
        c.set(5, 1);
        Calendar b3 = w.b(c);
        b3.get(2);
        b3.get(1);
        int maximum = b3.getMaximum(7);
        b3.getActualMaximum(5);
        b3.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean E(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(u2.d.B(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i3});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k
    public final Dialog B() {
        Context w3 = w();
        w();
        int i3 = this.f2410j0;
        if (i3 == 0) {
            C();
            throw null;
        }
        Dialog dialog = new Dialog(w3, i3);
        Context context = dialog.getContext();
        this.f2416p0 = E(context, android.R.attr.windowFullscreen);
        this.f2424x0 = new U0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, A0.a.f29k, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f2424x0.i(context);
        this.f2424x0.k(ColorStateList.valueOf(color));
        U0.g gVar = this.f2424x0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = T.f402a;
        gVar.j(H.i(decorView));
        return dialog;
    }

    public final void C() {
        X.d.m(this.g.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k, androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.f2410j0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        X.d.m(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f2412l0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        X.d.m(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f2414n0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2415o0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2417q0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2418r0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2419s0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2420t0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2421u0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f2415o0;
        if (charSequence == null) {
            charSequence = w().getResources().getText(this.f2414n0);
        }
        this.f2426z0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f2408A0 = charSequence;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final View m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f2416p0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f2416p0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(D(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(D(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = T.f402a;
        E.f(textView, 1);
        this.f2423w0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2422v0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2423w0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2423w0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0059a.s(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0059a.s(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2423w0.setChecked(this.f2417q0 != 0);
        T.l(this.f2423w0, null);
        CheckableImageButton checkableImageButton2 = this.f2423w0;
        this.f2423w0.setContentDescription(this.f2417q0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f2423w0.setOnClickListener(new ViewOnClickListenerC0029a(3, this));
        C();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2409h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.i0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1957F;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k, androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void q(Bundle bundle) {
        super.q(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2410j0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f2412l0;
        ?? obj = new Object();
        int i3 = a.f2376b;
        int i4 = a.f2376b;
        long j3 = bVar.f2378b.g;
        long j4 = bVar.c.g;
        obj.f2377a = Long.valueOf(bVar.f2380e.g);
        k kVar = this.f2413m0;
        o oVar = kVar == null ? null : kVar.f2397V;
        if (oVar != null) {
            obj.f2377a = Long.valueOf(oVar.g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f2379d);
        o b3 = o.b(j3);
        o b4 = o.b(j4);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l3 = obj.f2377a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b3, b4, dVar, l3 == null ? null : o.b(l3.longValue()), bVar.f2381f));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2414n0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2415o0);
        bundle.putInt("INPUT_MODE_KEY", this.f2417q0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2418r0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2419s0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2420t0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2421u0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k, androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void r() {
        z0 z0Var;
        z0 z0Var2;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.r();
        Dialog dialog = this.f1939d0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f2416p0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2424x0);
            if (!this.f2425y0) {
                View findViewById = x().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i3 = Build.VERSION.SDK_INT;
                boolean z3 = false;
                boolean z4 = valueOf == null || valueOf.intValue() == 0;
                int k2 = u2.l.k(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z4) {
                    valueOf = Integer.valueOf(k2);
                }
                if (i3 >= 30) {
                    e0.a(window, false);
                } else {
                    d0.a(window, false);
                }
                window.getContext();
                int d3 = i3 < 27 ? A.a.d(u2.l.k(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d3);
                boolean z5 = u2.l.v(0) || u2.l.v(valueOf.intValue());
                A.h hVar = new A.h(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    A0 a02 = new A0(insetsController2, hVar);
                    a02.f394f = window;
                    z0Var = a02;
                } else {
                    z0Var = new z0(window, hVar);
                }
                z0Var.e0(z5);
                boolean v3 = u2.l.v(k2);
                if (u2.l.v(d3) || (d3 == 0 && v3)) {
                    z3 = true;
                }
                A.h hVar2 = new A.h(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    A0 a03 = new A0(insetsController, hVar2);
                    a03.f394f = window;
                    z0Var2 = a03;
                } else {
                    z0Var2 = new z0(window, hVar2);
                }
                z0Var2.d0(z3);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = T.f402a;
                H.u(findViewById, lVar);
                this.f2425y0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = w().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2424x0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1939d0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new L0.a(dialog2, rect));
        }
        w();
        int i4 = this.f2410j0;
        if (i4 == 0) {
            C();
            throw null;
        }
        C();
        b bVar = this.f2412l0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f2380e);
        kVar.z(bundle);
        this.f2413m0 = kVar;
        t tVar = kVar;
        if (this.f2417q0 == 1) {
            C();
            b bVar2 = this.f2412l0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i4);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.z(bundle2);
            tVar = nVar;
        }
        this.f2411k0 = tVar;
        this.f2422v0.setText((this.f2417q0 == 1 && w().getResources().getConfiguration().orientation == 2) ? this.f2408A0 : this.f2426z0);
        C();
        h();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k, androidx.fragment.app.AbstractComponentCallbacksC0077n
    public final void s() {
        this.f2411k0.f2442S.clear();
        super.s();
    }
}
