package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import e.AbstractC0116a;
import java.lang.ref.WeakReference;
import xyz.happify.ckemv.R;

/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2883a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogC0158f f2884b;
    public final Window c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2885d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2886e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2887f;
    public Button g;
    public Button h;

    /* renamed from: i, reason: collision with root package name */
    public NestedScrollView f2888i;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2890k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f2891l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2892m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f2893n;

    /* renamed from: o, reason: collision with root package name */
    public View f2894o;

    /* renamed from: p, reason: collision with root package name */
    public ListAdapter f2895p;

    /* renamed from: r, reason: collision with root package name */
    public final int f2897r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2898s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2899t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2900u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2901v;

    /* renamed from: w, reason: collision with root package name */
    public final HandlerC0155c f2902w;

    /* renamed from: j, reason: collision with root package name */
    public int f2889j = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2896q = -1;

    /* renamed from: x, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2903x = new com.google.android.material.datepicker.j(1, this);

    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.Handler, f.c] */
    public C0157e(Context context, DialogC0158f dialogC0158f, Window window) {
        this.f2883a = context;
        this.f2884b = dialogC0158f;
        this.c = window;
        ?? handler = new Handler();
        handler.f2882a = new WeakReference(dialogC0158f);
        this.f2902w = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0116a.f2668e, R.attr.alertDialogStyle, 0);
        this.f2897r = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2898s = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2899t = obtainStyledAttributes.getResourceId(7, 0);
        this.f2900u = obtainStyledAttributes.getResourceId(3, 0);
        this.f2901v = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogC0158f.c().h(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
