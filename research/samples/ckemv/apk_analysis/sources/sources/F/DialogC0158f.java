package f;

import J.InterfaceC0012k;
import J.T;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.EnumC0095l;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* renamed from: f.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC0158f extends Dialog implements DialogInterface, InterfaceC0160h, androidx.lifecycle.r, androidx.activity.v, d0.e {

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.t f2904b;
    public final androidx.activity.l c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.activity.u f2905d;

    /* renamed from: e, reason: collision with root package name */
    public v f2906e;

    /* renamed from: f, reason: collision with root package name */
    public final w f2907f;
    public final C0157e g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v4, types: [f.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogC0158f(Context context, int i3) {
        super(context, r2);
        int i4;
        int i5 = i(context, i3);
        if (i5 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i4 = typedValue.resourceId;
        } else {
            i4 = i5;
        }
        X1.g.e(context, "context");
        this.c = new androidx.activity.l(this);
        this.f2905d = new androidx.activity.u(new B2.u(8, this));
        this.f2907f = new InterfaceC0012k() { // from class: f.w
            @Override // J.InterfaceC0012k
            public final boolean e(KeyEvent keyEvent) {
                return DialogC0158f.this.k(keyEvent);
            }
        };
        AbstractC0163k c = c();
        if (i5 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i5 = typedValue2.resourceId;
        }
        ((v) c).f2968U = i5;
        c.c();
        this.g = new C0157e(getContext(), this, getWindow());
    }

    public static void a(DialogC0158f dialogC0158f) {
        X1.g.e(dialogC0158f, "this$0");
        super.onBackPressed();
    }

    public static int i(Context context, int i3) {
        if (((i3 >>> 24) & 255) >= 1) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v vVar = (v) c();
        vVar.v();
        ((ViewGroup) vVar.f2950B.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f2985n.a(vVar.f2984m.getCallback());
    }

    @Override // d0.e
    public final d0.d b() {
        return (d0.d) this.c.f1464d;
    }

    public final AbstractC0163k c() {
        if (this.f2906e == null) {
            ExecutorC0145B executorC0145B = AbstractC0163k.f2914b;
            this.f2906e = new v(getContext(), getWindow(), this, this);
        }
        return this.f2906e;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return e();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return u2.l.h(this.f2907f, getWindow().getDecorView(), this, keyEvent);
    }

    public final androidx.lifecycle.t e() {
        androidx.lifecycle.t tVar = this.f2904b;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f2904b = tVar2;
        return tVar2;
    }

    public final void f(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            X1.g.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            androidx.activity.u uVar = this.f2905d;
            uVar.getClass();
            uVar.f1500e = onBackInvokedDispatcher;
            uVar.c(uVar.g);
        }
        this.c.d(bundle);
        e().d(EnumC0095l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i3) {
        v vVar = (v) c();
        vVar.v();
        return vVar.f2984m.findViewById(i3);
    }

    public final void g(Bundle bundle) {
        v vVar = (v) c();
        LayoutInflater from = LayoutInflater.from(vVar.f2983l);
        if (from.getFactory() == null) {
            from.setFactory2(vVar);
        } else {
            boolean z3 = from.getFactory2() instanceof v;
        }
        f(bundle);
        c().c();
    }

    public final void h() {
        e().d(EnumC0095l.ON_DESTROY);
        this.f2904b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().a();
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().l(charSequence);
    }

    public final boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f2905d.b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i3;
        ListAdapter listAdapter;
        View findViewById;
        g(bundle);
        C0157e c0157e = this.g;
        c0157e.f2884b.setContentView(c0157e.f2897r);
        Window window = c0157e.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a3 = C0157e.a(findViewById6, findViewById3);
        ViewGroup a4 = C0157e.a(findViewById7, findViewById4);
        ViewGroup a5 = C0157e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0157e.f2888i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0157e.f2888i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a4.findViewById(android.R.id.message);
        c0157e.f2893n = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0157e.f2888i.removeView(c0157e.f2893n);
            if (c0157e.f2886e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0157e.f2888i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0157e.f2888i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0157e.f2886e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a4.setVisibility(8);
            }
        }
        Button button = (Button) a5.findViewById(android.R.id.button1);
        c0157e.f2887f = button;
        com.google.android.material.datepicker.j jVar = c0157e.f2903x;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0157e.f2887f.setVisibility(8);
            i3 = 0;
        } else {
            c0157e.f2887f.setText((CharSequence) null);
            c0157e.f2887f.setVisibility(0);
            i3 = 1;
        }
        Button button2 = (Button) a5.findViewById(android.R.id.button2);
        c0157e.g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0157e.g.setVisibility(8);
        } else {
            c0157e.g.setText((CharSequence) null);
            c0157e.g.setVisibility(0);
            i3 |= 2;
        }
        Button button3 = (Button) a5.findViewById(android.R.id.button3);
        c0157e.h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0157e.h.setVisibility(8);
        } else {
            c0157e.h.setText((CharSequence) null);
            c0157e.h.setVisibility(0);
            i3 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0157e.f2883a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i3 == 1) {
                Button button4 = c0157e.f2887f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i3 == 2) {
                Button button5 = c0157e.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i3 == 4) {
                Button button6 = c0157e.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i3 == 0) {
            a5.setVisibility(8);
        }
        if (c0157e.f2894o != null) {
            a3.addView(c0157e.f2894o, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0157e.f2891l = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(c0157e.f2885d)) && c0157e.f2901v) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0157e.f2892m = textView2;
                textView2.setText(c0157e.f2885d);
                int i4 = c0157e.f2889j;
                if (i4 != 0) {
                    c0157e.f2891l.setImageResource(i4);
                } else {
                    Drawable drawable = c0157e.f2890k;
                    if (drawable != null) {
                        c0157e.f2891l.setImageDrawable(drawable);
                    } else {
                        c0157e.f2892m.setPadding(c0157e.f2891l.getPaddingLeft(), c0157e.f2891l.getPaddingTop(), c0157e.f2891l.getPaddingRight(), c0157e.f2891l.getPaddingBottom());
                        c0157e.f2891l.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0157e.f2891l.setVisibility(8);
                a3.setVisibility(8);
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i5 = (a3 == null || a3.getVisibility() == 8) ? 0 : 1;
        boolean z4 = a5.getVisibility() != 8;
        if (!z4 && (findViewById = a4.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = c0157e.f2888i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0157e.f2886e != null ? a3.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a4.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0157e.f2886e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z4 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1502b, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.c);
            }
        }
        if (!z3) {
            View view = c0157e.f2886e;
            if (view == null) {
                view = c0157e.f2888i;
            }
            if (view != null) {
                int i6 = (z4 ? 2 : 0) | i5;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = T.f402a;
                J.I.d(view, i6, 3);
                if (findViewById11 != null) {
                    a4.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a4.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0157e.f2886e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0157e.f2895p) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = c0157e.f2896q;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.f2888i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i3, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.f2888i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i3, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        X1.g.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.c.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        e().d(EnumC0095l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        h();
        v vVar = (v) c();
        vVar.z();
        C0152I c0152i = vVar.f2987p;
        if (c0152i != null) {
            c0152i.f2869u = false;
            i.l lVar = c0152i.f2868t;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i3) {
        c().i(i3);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i3) {
        super.setTitle(i3);
        c().l(getContext().getString(i3));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        c().j(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        C0157e c0157e = this.g;
        c0157e.f2885d = charSequence;
        TextView textView = c0157e.f2892m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
