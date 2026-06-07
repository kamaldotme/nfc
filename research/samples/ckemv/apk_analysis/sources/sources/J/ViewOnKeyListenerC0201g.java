package j;

import J.T;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import f.C0150G;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.C0245A;
import k.C0311u0;
import k.G0;
import k.I0;
import k.J0;
import k.M0;
import xyz.happify.ckemv.R;

/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0201g extends AbstractC0215u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public PopupWindow.OnDismissListener f3276A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3277B;
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3278d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3279e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3280f;
    public final boolean g;
    public final Handler h;

    /* renamed from: p, reason: collision with root package name */
    public View f3288p;

    /* renamed from: q, reason: collision with root package name */
    public View f3289q;

    /* renamed from: r, reason: collision with root package name */
    public int f3290r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3291s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3292t;

    /* renamed from: u, reason: collision with root package name */
    public int f3293u;

    /* renamed from: v, reason: collision with root package name */
    public int f3294v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3296x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0219y f3297y;

    /* renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f3298z;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3281i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3282j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0198d f3283k = new ViewTreeObserverOnGlobalLayoutListenerC0198d(0, this);

    /* renamed from: l, reason: collision with root package name */
    public final X0.n f3284l = new X0.n(2, this);

    /* renamed from: m, reason: collision with root package name */
    public final C0150G f3285m = new C0150G(this);

    /* renamed from: n, reason: collision with root package name */
    public int f3286n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3287o = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3295w = false;

    public ViewOnKeyListenerC0201g(Context context, View view, int i3, int i4, boolean z3) {
        this.c = context;
        this.f3288p = view;
        this.f3279e = i3;
        this.f3280f = i4;
        this.g = z3;
        WeakHashMap weakHashMap = T.f402a;
        this.f3290r = J.C.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3278d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // j.InterfaceC0220z
    public final void a(MenuC0207m menuC0207m, boolean z3) {
        ArrayList arrayList = this.f3282j;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (menuC0207m == ((C0200f) arrayList.get(i3)).f3275b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            ((C0200f) arrayList.get(i4)).f3275b.c(false);
        }
        C0200f c0200f = (C0200f) arrayList.remove(i3);
        c0200f.f3275b.r(this);
        boolean z4 = this.f3277B;
        M0 m02 = c0200f.f3274a;
        if (z4) {
            I0.b(m02.f3568A, null);
            m02.f3568A.setAnimationStyle(0);
        }
        m02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3290r = ((C0200f) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.f3288p;
            WeakHashMap weakHashMap = T.f402a;
            this.f3290r = J.C.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((C0200f) arrayList.get(0)).f3275b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0219y interfaceC0219y = this.f3297y;
        if (interfaceC0219y != null) {
            interfaceC0219y.a(menuC0207m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3298z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3298z.removeGlobalOnLayoutListener(this.f3283k);
            }
            this.f3298z = null;
        }
        this.f3289q.removeOnAttachStateChangeListener(this.f3284l);
        this.f3276A.onDismiss();
    }

    @Override // j.InterfaceC0192D
    public final boolean b() {
        ArrayList arrayList = this.f3282j;
        return arrayList.size() > 0 && ((C0200f) arrayList.get(0)).f3274a.f3568A.isShowing();
    }

    @Override // j.InterfaceC0220z
    public final void c() {
        Iterator it = this.f3282j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0200f) it.next()).f3274a.f3570d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0204j) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.InterfaceC0192D
    public final void dismiss() {
        ArrayList arrayList = this.f3282j;
        int size = arrayList.size();
        if (size > 0) {
            C0200f[] c0200fArr = (C0200f[]) arrayList.toArray(new C0200f[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C0200f c0200f = c0200fArr[i3];
                if (c0200f.f3274a.f3568A.isShowing()) {
                    c0200f.f3274a.dismiss();
                }
            }
        }
    }

    @Override // j.InterfaceC0192D
    public final C0311u0 f() {
        ArrayList arrayList = this.f3282j;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0200f) arrayList.get(arrayList.size() - 1)).f3274a.f3570d;
    }

    @Override // j.InterfaceC0220z
    public final boolean g() {
        return false;
    }

    @Override // j.InterfaceC0220z
    public final void h(InterfaceC0219y interfaceC0219y) {
        this.f3297y = interfaceC0219y;
    }

    @Override // j.InterfaceC0192D
    public final void i() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f3281i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0207m) it.next());
        }
        arrayList.clear();
        View view = this.f3288p;
        this.f3289q = view;
        if (view != null) {
            boolean z3 = this.f3298z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3298z = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3283k);
            }
            this.f3289q.addOnAttachStateChangeListener(this.f3284l);
        }
    }

    @Override // j.InterfaceC0220z
    public final boolean j(SubMenuC0194F subMenuC0194F) {
        Iterator it = this.f3282j.iterator();
        while (it.hasNext()) {
            C0200f c0200f = (C0200f) it.next();
            if (subMenuC0194F == c0200f.f3275b) {
                c0200f.f3274a.f3570d.requestFocus();
                return true;
            }
        }
        if (!subMenuC0194F.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0194F);
        InterfaceC0219y interfaceC0219y = this.f3297y;
        if (interfaceC0219y != null) {
            interfaceC0219y.b(subMenuC0194F);
        }
        return true;
    }

    @Override // j.AbstractC0215u
    public final void l(MenuC0207m menuC0207m) {
        menuC0207m.b(this, this.c);
        if (b()) {
            v(menuC0207m);
        } else {
            this.f3281i.add(menuC0207m);
        }
    }

    @Override // j.AbstractC0215u
    public final void n(View view) {
        if (this.f3288p != view) {
            this.f3288p = view;
            int i3 = this.f3286n;
            WeakHashMap weakHashMap = T.f402a;
            this.f3287o = Gravity.getAbsoluteGravity(i3, J.C.d(view));
        }
    }

    @Override // j.AbstractC0215u
    public final void o(boolean z3) {
        this.f3295w = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0200f c0200f;
        ArrayList arrayList = this.f3282j;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                c0200f = null;
                break;
            }
            c0200f = (C0200f) arrayList.get(i3);
            if (!c0200f.f3274a.f3568A.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (c0200f != null) {
            c0200f.f3275b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.AbstractC0215u
    public final void p(int i3) {
        if (this.f3286n != i3) {
            this.f3286n = i3;
            View view = this.f3288p;
            WeakHashMap weakHashMap = T.f402a;
            this.f3287o = Gravity.getAbsoluteGravity(i3, J.C.d(view));
        }
    }

    @Override // j.AbstractC0215u
    public final void q(int i3) {
        this.f3291s = true;
        this.f3293u = i3;
    }

    @Override // j.AbstractC0215u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3276A = onDismissListener;
    }

    @Override // j.AbstractC0215u
    public final void s(boolean z3) {
        this.f3296x = z3;
    }

    @Override // j.AbstractC0215u
    public final void t(int i3) {
        this.f3292t = true;
        this.f3294v = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0139, code lost:
    
        if (((r8.getWidth() + r10[0]) + r5) > r11.right) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013b, code lost:
    
        r10 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        r8 = 1;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
    
        if ((r10[0] - r5) < 0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Type inference failed for: r7v0, types: [k.M0, k.G0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(MenuC0207m menuC0207m) {
        C0200f c0200f;
        View view;
        int i3;
        int i4;
        MenuItem menuItem;
        C0204j c0204j;
        int i5;
        int firstVisiblePosition;
        Context context = this.c;
        LayoutInflater from = LayoutInflater.from(context);
        C0204j c0204j2 = new C0204j(menuC0207m, from, this.g, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f3295w) {
            c0204j2.f3305d = true;
        } else if (b()) {
            c0204j2.f3305d = AbstractC0215u.u(menuC0207m);
        }
        int m3 = AbstractC0215u.m(c0204j2, context, this.f3278d);
        ?? g02 = new G0(context, null, this.f3279e, this.f3280f);
        g02.D = this.f3285m;
        g02.f3581q = this;
        g02.f3568A.setOnDismissListener(this);
        g02.f3580p = this.f3288p;
        g02.f3577m = this.f3287o;
        g02.f3590z = true;
        g02.f3568A.setFocusable(true);
        g02.f3568A.setInputMethodMode(2);
        g02.o(c0204j2);
        g02.r(m3);
        g02.f3577m = this.f3287o;
        ArrayList arrayList = this.f3282j;
        if (arrayList.size() > 0) {
            c0200f = (C0200f) arrayList.get(arrayList.size() - 1);
            MenuC0207m menuC0207m2 = c0200f.f3275b;
            int size = menuC0207m2.f3313f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0207m2.getItem(i6);
                if (menuItem.hasSubMenu() && menuC0207m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0311u0 c0311u0 = c0200f.f3274a.f3570d;
                ListAdapter adapter = c0311u0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    c0204j = (C0204j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0204j = (C0204j) adapter;
                    i5 = 0;
                }
                int count = c0204j.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == c0204j.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + i5) - c0311u0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0311u0.getChildCount()) {
                    view = c0311u0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i8 = Build.VERSION.SDK_INT;
                C0245A c0245a = g02.f3568A;
                if (i8 <= 28) {
                    Method method = M0.f3601E;
                    if (method != null) {
                        try {
                            method.invoke(c0245a, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    J0.a(c0245a, false);
                }
                I0.a(g02.f3568A, null);
                C0311u0 c0311u02 = ((C0200f) arrayList.get(arrayList.size() - 1)).f3274a.f3570d;
                int[] iArr = new int[2];
                c0311u02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3289q.getWindowVisibleDisplayFrame(rect);
                if (this.f3290r == 1) {
                }
                boolean z3 = i4 == i3;
                this.f3290r = i4;
                g02.f3580p = view;
                if ((this.f3287o & 5) != 5) {
                    m3 = z3 ? view.getWidth() : 0 - m3;
                } else if (!z3) {
                    m3 = 0 - view.getWidth();
                }
                g02.g = m3;
                g02.f3576l = true;
                g02.f3575k = true;
                g02.m(0);
            } else {
                if (this.f3291s) {
                    g02.g = this.f3293u;
                }
                if (this.f3292t) {
                    g02.m(this.f3294v);
                }
                Rect rect2 = this.f3366b;
                g02.f3589y = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0200f(g02, menuC0207m, this.f3290r));
            g02.i();
            C0311u0 c0311u03 = g02.f3570d;
            c0311u03.setOnKeyListener(this);
            if (c0200f == null || !this.f3296x || menuC0207m.f3318m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0311u03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0207m.f3318m);
            c0311u03.addHeaderView(frameLayout, null, false);
            g02.i();
            return;
        }
        c0200f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0200f(g02, menuC0207m, this.f3290r));
        g02.i();
        C0311u0 c0311u032 = g02.f3570d;
        c0311u032.setOnKeyListener(this);
        if (c0200f == null) {
        }
    }
}
