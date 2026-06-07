package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import f.C0150G;
import j.AbstractC0215u;
import j.ActionProviderVisibilityListenerC0210p;
import j.C0209o;
import j.InterfaceC0189A;
import j.InterfaceC0190B;
import j.InterfaceC0219y;
import j.InterfaceC0220z;
import j.MenuC0207m;
import j.SubMenuC0194F;
import java.util.ArrayList;
import xyz.happify.ckemv.R;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288j implements InterfaceC0220z {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3692b;
    public Context c;

    /* renamed from: d, reason: collision with root package name */
    public MenuC0207m f3693d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f3694e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0219y f3695f;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0190B f3696i;

    /* renamed from: j, reason: collision with root package name */
    public C0286i f3697j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f3698k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3699l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3700m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3701n;

    /* renamed from: o, reason: collision with root package name */
    public int f3702o;

    /* renamed from: p, reason: collision with root package name */
    public int f3703p;

    /* renamed from: q, reason: collision with root package name */
    public int f3704q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3705r;

    /* renamed from: t, reason: collision with root package name */
    public C0280f f3707t;

    /* renamed from: u, reason: collision with root package name */
    public C0280f f3708u;

    /* renamed from: v, reason: collision with root package name */
    public RunnableC0284h f3709v;

    /* renamed from: w, reason: collision with root package name */
    public C0282g f3710w;
    public final int g = R.layout.abc_action_menu_layout;
    public final int h = R.layout.abc_action_menu_item_layout;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f3706s = new SparseBooleanArray();

    /* renamed from: x, reason: collision with root package name */
    public final C0150G f3711x = new C0150G(this);

    public C0288j(Context context) {
        this.f3692b = context;
        this.f3694e = LayoutInflater.from(context);
    }

    @Override // j.InterfaceC0220z
    public final void a(MenuC0207m menuC0207m, boolean z3) {
        f();
        C0280f c0280f = this.f3708u;
        if (c0280f != null && c0280f.b()) {
            c0280f.f3374j.dismiss();
        }
        InterfaceC0219y interfaceC0219y = this.f3695f;
        if (interfaceC0219y != null) {
            interfaceC0219y.a(menuC0207m, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j.A] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(C0209o c0209o, View view, ViewGroup viewGroup) {
        View actionView = c0209o.getActionView();
        if (actionView == null || c0209o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0189A ? (InterfaceC0189A) view : (InterfaceC0189A) this.f3694e.inflate(this.h, viewGroup, false);
            actionMenuItemView.c(c0209o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f3696i);
            if (this.f3710w == null) {
                this.f3710w = new C0282g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3710w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0209o.f3334C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0292l)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.InterfaceC0220z
    public final void c() {
        int size;
        int i3;
        ViewGroup viewGroup = (ViewGroup) this.f3696i;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            MenuC0207m menuC0207m = this.f3693d;
            if (menuC0207m != null) {
                menuC0207m.i();
                ArrayList l3 = this.f3693d.l();
                int size2 = l3.size();
                i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    C0209o c0209o = (C0209o) l3.get(i4);
                    if (c0209o.f()) {
                        View childAt = viewGroup.getChildAt(i3);
                        C0209o itemData = childAt instanceof InterfaceC0189A ? ((InterfaceC0189A) childAt).getItemData() : null;
                        View b3 = b(c0209o, childAt, viewGroup);
                        if (c0209o != itemData) {
                            b3.setPressed(false);
                            b3.jumpDrawablesToCurrentState();
                        }
                        if (b3 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b3.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b3);
                            }
                            ((ViewGroup) this.f3696i).addView(b3, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.f3697j) {
                    i3++;
                } else {
                    viewGroup.removeViewAt(i3);
                }
            }
        }
        ((View) this.f3696i).requestLayout();
        MenuC0207m menuC0207m2 = this.f3693d;
        if (menuC0207m2 != null) {
            menuC0207m2.i();
            ArrayList arrayList2 = menuC0207m2.f3314i;
            int size3 = arrayList2.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p = ((C0209o) arrayList2.get(i5)).f3332A;
            }
        }
        MenuC0207m menuC0207m3 = this.f3693d;
        if (menuC0207m3 != null) {
            menuC0207m3.i();
            arrayList = menuC0207m3.f3315j;
        }
        if (!this.f3700m || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((C0209o) arrayList.get(0)).f3334C))) {
            C0286i c0286i = this.f3697j;
            if (c0286i != null) {
                Object parent = c0286i.getParent();
                Object obj = this.f3696i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f3697j);
                }
            }
        } else {
            if (this.f3697j == null) {
                this.f3697j = new C0286i(this, this.f3692b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f3697j.getParent();
            if (viewGroup3 != this.f3696i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f3697j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3696i;
                C0286i c0286i2 = this.f3697j;
                actionMenuView.getClass();
                C0292l l4 = ActionMenuView.l();
                l4.f3726a = true;
                actionMenuView.addView(c0286i2, l4);
            }
        }
        ((ActionMenuView) this.f3696i).setOverflowReserved(this.f3700m);
    }

    @Override // j.InterfaceC0220z
    public final boolean d(C0209o c0209o) {
        return false;
    }

    @Override // j.InterfaceC0220z
    public final void e(Context context, MenuC0207m menuC0207m) {
        this.c = context;
        LayoutInflater.from(context);
        this.f3693d = menuC0207m;
        Resources resources = context.getResources();
        if (!this.f3701n) {
            this.f3700m = true;
        }
        int i3 = 2;
        this.f3702o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i3 = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.f3704q = i3;
        int i6 = this.f3702o;
        if (this.f3700m) {
            if (this.f3697j == null) {
                C0286i c0286i = new C0286i(this, this.f3692b);
                this.f3697j = c0286i;
                if (this.f3699l) {
                    c0286i.setImageDrawable(this.f3698k);
                    this.f3698k = null;
                    this.f3699l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3697j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f3697j.getMeasuredWidth();
        } else {
            this.f3697j = null;
        }
        this.f3703p = i6;
        float f3 = resources.getDisplayMetrics().density;
    }

    public final boolean f() {
        Object obj;
        RunnableC0284h runnableC0284h = this.f3709v;
        if (runnableC0284h != null && (obj = this.f3696i) != null) {
            ((View) obj).removeCallbacks(runnableC0284h);
            this.f3709v = null;
            return true;
        }
        C0280f c0280f = this.f3707t;
        if (c0280f == null) {
            return false;
        }
        if (c0280f.b()) {
            c0280f.f3374j.dismiss();
        }
        return true;
    }

    @Override // j.InterfaceC0220z
    public final boolean g() {
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z3;
        MenuC0207m menuC0207m = this.f3693d;
        if (menuC0207m != null) {
            arrayList = menuC0207m.l();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i5 = this.f3704q;
        int i6 = this.f3703p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f3696i;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i7 >= i3) {
                break;
            }
            C0209o c0209o = (C0209o) arrayList.get(i7);
            int i10 = c0209o.f3356y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z4 = true;
            }
            if (this.f3705r && c0209o.f3334C) {
                i5 = 0;
            }
            i7++;
        }
        if (this.f3700m && (z4 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = this.f3706s;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            C0209o c0209o2 = (C0209o) arrayList.get(i12);
            int i14 = c0209o2.f3356y;
            boolean z5 = (i14 & 2) == i4 ? z3 : false;
            int i15 = c0209o2.f3336b;
            if (z5) {
                View b3 = b(c0209o2, null, viewGroup);
                b3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b3.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z3);
                }
                c0209o2.g(z3);
            } else if ((i14 & 1) == z3) {
                boolean z6 = sparseBooleanArray.get(i15);
                boolean z7 = ((i11 > 0 || z6) && i6 > 0) ? z3 : false;
                if (z7) {
                    View b4 = b(c0209o2, null, viewGroup);
                    b4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z7 &= i6 + i13 > 0;
                }
                if (z7 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z6) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        C0209o c0209o3 = (C0209o) arrayList.get(i16);
                        if (c0209o3.f3336b == i15) {
                            if (c0209o3.f()) {
                                i11++;
                            }
                            c0209o3.g(false);
                        }
                    }
                }
                if (z7) {
                    i11--;
                }
                c0209o2.g(z7);
            } else {
                c0209o2.g(false);
                i12++;
                i4 = 2;
                z3 = true;
            }
            i12++;
            i4 = 2;
            z3 = true;
        }
        return z3;
    }

    @Override // j.InterfaceC0220z
    public final void h(InterfaceC0219y interfaceC0219y) {
        this.f3695f = interfaceC0219y;
    }

    public final boolean i() {
        C0280f c0280f = this.f3707t;
        return c0280f != null && c0280f.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.InterfaceC0220z
    public final boolean j(SubMenuC0194F subMenuC0194F) {
        boolean z3;
        if (!subMenuC0194F.hasVisibleItems()) {
            return false;
        }
        SubMenuC0194F subMenuC0194F2 = subMenuC0194F;
        while (true) {
            MenuC0207m menuC0207m = subMenuC0194F2.f3254z;
            if (menuC0207m == this.f3693d) {
                break;
            }
            subMenuC0194F2 = (SubMenuC0194F) menuC0207m;
        }
        ViewGroup viewGroup = (ViewGroup) this.f3696i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i3);
                if ((childAt instanceof InterfaceC0189A) && ((InterfaceC0189A) childAt).getItemData() == subMenuC0194F2.f3253A) {
                    view = childAt;
                    break;
                }
                i3++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0194F.f3253A.getClass();
        int size = subMenuC0194F.f3313f.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = false;
                break;
            }
            MenuItem item = subMenuC0194F.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i4++;
        }
        C0280f c0280f = new C0280f(this, this.c, subMenuC0194F, view);
        this.f3708u = c0280f;
        c0280f.h = z3;
        AbstractC0215u abstractC0215u = c0280f.f3374j;
        if (abstractC0215u != null) {
            abstractC0215u.o(z3);
        }
        C0280f c0280f2 = this.f3708u;
        if (!c0280f2.b()) {
            if (c0280f2.f3372f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0280f2.d(0, 0, false, false);
        }
        InterfaceC0219y interfaceC0219y = this.f3695f;
        if (interfaceC0219y != null) {
            interfaceC0219y.b(subMenuC0194F);
        }
        return true;
    }

    @Override // j.InterfaceC0220z
    public final boolean k(C0209o c0209o) {
        return false;
    }

    public final boolean l() {
        MenuC0207m menuC0207m;
        if (!this.f3700m || i() || (menuC0207m = this.f3693d) == null || this.f3696i == null || this.f3709v != null) {
            return false;
        }
        menuC0207m.i();
        if (menuC0207m.f3315j.isEmpty()) {
            return false;
        }
        RunnableC0284h runnableC0284h = new RunnableC0284h(this, new C0280f(this, this.c, this.f3693d, this.f3697j));
        this.f3709v = runnableC0284h;
        ((View) this.f3696i).post(runnableC0284h);
        return true;
    }
}
