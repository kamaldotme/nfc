package k;

import a.AbstractC0059a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import e.AbstractC0116a;
import j.InterfaceC0192D;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0192D {

    /* renamed from: B, reason: collision with root package name */
    public static final Method f3566B;

    /* renamed from: C, reason: collision with root package name */
    public static final Method f3567C;

    /* renamed from: A, reason: collision with root package name */
    public final C0245A f3568A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3569b;
    public ListAdapter c;

    /* renamed from: d, reason: collision with root package name */
    public C0311u0 f3570d;
    public int g;
    public int h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3574j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3575k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3576l;

    /* renamed from: o, reason: collision with root package name */
    public O.b f3579o;

    /* renamed from: p, reason: collision with root package name */
    public View f3580p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemClickListener f3581q;

    /* renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f3582r;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f3587w;

    /* renamed from: y, reason: collision with root package name */
    public Rect f3589y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3590z;

    /* renamed from: e, reason: collision with root package name */
    public final int f3571e = -2;

    /* renamed from: f, reason: collision with root package name */
    public int f3572f = -2;

    /* renamed from: i, reason: collision with root package name */
    public final int f3573i = 1002;

    /* renamed from: m, reason: collision with root package name */
    public int f3577m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final int f3578n = Integer.MAX_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public final D0 f3583s = new D0(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public final F0 f3584t = new F0(this);

    /* renamed from: u, reason: collision with root package name */
    public final E0 f3585u = new E0(this);

    /* renamed from: v, reason: collision with root package name */
    public final D0 f3586v = new D0(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public final Rect f3588x = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3566B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f3567C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.PopupWindow, k.A] */
    public G0(Context context, AttributeSet attributeSet, int i3, int i4) {
        int resourceId;
        this.f3569b = context;
        this.f3587w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0116a.f2676o, i3, i4);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3574j = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i3, i4);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0116a.f2680s, i3, i4);
        if (obtainStyledAttributes2.hasValue(2)) {
            N.n.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0059a.s(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3568A = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // j.InterfaceC0192D
    public final boolean b() {
        return this.f3568A.isShowing();
    }

    public final void c(int i3) {
        this.g = i3;
    }

    @Override // j.InterfaceC0192D
    public final void dismiss() {
        C0245A c0245a = this.f3568A;
        c0245a.dismiss();
        c0245a.setContentView(null);
        this.f3570d = null;
        this.f3587w.removeCallbacks(this.f3583s);
    }

    public final int e() {
        return this.g;
    }

    @Override // j.InterfaceC0192D
    public final C0311u0 f() {
        return this.f3570d;
    }

    @Override // j.InterfaceC0192D
    public final void i() {
        int i3;
        int paddingBottom;
        C0311u0 c0311u0;
        C0311u0 c0311u02 = this.f3570d;
        C0245A c0245a = this.f3568A;
        Context context = this.f3569b;
        if (c0311u02 == null) {
            C0311u0 q3 = q(context, !this.f3590z);
            this.f3570d = q3;
            q3.setAdapter(this.c);
            this.f3570d.setOnItemClickListener(this.f3581q);
            this.f3570d.setFocusable(true);
            this.f3570d.setFocusableInTouchMode(true);
            this.f3570d.setOnItemSelectedListener(new A0(0, this));
            this.f3570d.setOnScrollListener(this.f3585u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3582r;
            if (onItemSelectedListener != null) {
                this.f3570d.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0245a.setContentView(this.f3570d);
        }
        Drawable background = c0245a.getBackground();
        Rect rect = this.f3588x;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i3 = rect.bottom + i4;
            if (!this.f3574j) {
                this.h = -i4;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int a3 = B0.a(c0245a, this.f3580p, this.h, c0245a.getInputMethodMode() == 2);
        int i5 = this.f3571e;
        if (i5 == -1) {
            paddingBottom = a3 + i3;
        } else {
            int i6 = this.f3572f;
            int a4 = this.f3570d.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a3);
            paddingBottom = a4 + (a4 > 0 ? this.f3570d.getPaddingBottom() + this.f3570d.getPaddingTop() + i3 : 0);
        }
        boolean z3 = this.f3568A.getInputMethodMode() == 2;
        N.n.d(c0245a, this.f3573i);
        if (c0245a.isShowing()) {
            View view = this.f3580p;
            WeakHashMap weakHashMap = J.T.f402a;
            if (J.E.b(view)) {
                int i7 = this.f3572f;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.f3580p.getWidth();
                }
                if (i5 == -1) {
                    i5 = z3 ? paddingBottom : -1;
                    if (z3) {
                        c0245a.setWidth(this.f3572f == -1 ? -1 : 0);
                        c0245a.setHeight(0);
                    } else {
                        c0245a.setWidth(this.f3572f == -1 ? -1 : 0);
                        c0245a.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                c0245a.setOutsideTouchable(true);
                c0245a.update(this.f3580p, this.g, this.h, i7 < 0 ? -1 : i7, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int i8 = this.f3572f;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f3580p.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        c0245a.setWidth(i8);
        c0245a.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3566B;
            if (method != null) {
                try {
                    method.invoke(c0245a, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            C0.b(c0245a, true);
        }
        c0245a.setOutsideTouchable(true);
        c0245a.setTouchInterceptor(this.f3584t);
        if (this.f3576l) {
            N.n.c(c0245a, this.f3575k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3567C;
            if (method2 != null) {
                try {
                    method2.invoke(c0245a, this.f3589y);
                } catch (Exception unused2) {
                }
            }
        } else {
            C0.a(c0245a, this.f3589y);
        }
        N.m.a(c0245a, this.f3580p, this.g, this.h, this.f3577m);
        this.f3570d.setSelection(-1);
        if ((!this.f3590z || this.f3570d.isInTouchMode()) && (c0311u0 = this.f3570d) != null) {
            c0311u0.setListSelectionHidden(true);
            c0311u0.requestLayout();
        }
        if (this.f3590z) {
            return;
        }
        this.f3587w.post(this.f3586v);
    }

    public final int k() {
        if (this.f3574j) {
            return this.h;
        }
        return 0;
    }

    public final void l(Drawable drawable) {
        this.f3568A.setBackgroundDrawable(drawable);
    }

    public final void m(int i3) {
        this.h = i3;
        this.f3574j = true;
    }

    public final Drawable n() {
        return this.f3568A.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        O.b bVar = this.f3579o;
        if (bVar == null) {
            this.f3579o = new O.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3579o);
        }
        C0311u0 c0311u0 = this.f3570d;
        if (c0311u0 != null) {
            c0311u0.setAdapter(this.c);
        }
    }

    public C0311u0 q(Context context, boolean z3) {
        return new C0311u0(context, z3);
    }

    public final void r(int i3) {
        Drawable background = this.f3568A.getBackground();
        if (background == null) {
            this.f3572f = i3;
            return;
        }
        Rect rect = this.f3588x;
        background.getPadding(rect);
        this.f3572f = rect.left + rect.right + i3;
    }
}
