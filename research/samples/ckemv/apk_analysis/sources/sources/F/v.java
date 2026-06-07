package f;

import J.C0003b0;
import J.InterfaceC0012k;
import J.T;
import a.AbstractC0059a;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0096m;
import e.AbstractC0116a;
import i.AbstractC0184b;
import j.C0202h;
import j.C0203i;
import j.C0209o;
import j.InterfaceC0205k;
import j.MenuC0207m;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0280f;
import k.C0288j;
import k.C0308t;
import k.InterfaceC0295m0;
import k.InterfaceC0297n0;
import k.i1;
import k.n1;
import k.r1;
import n.C0342k;

/* loaded from: classes.dex */
public final class v extends AbstractC0163k implements InterfaceC0205k, LayoutInflater.Factory2 {
    public static final C0342k i0 = new C0342k();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f2946j0 = {R.attr.windowBackground};

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f2947k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f2948l0 = true;

    /* renamed from: A, reason: collision with root package name */
    public boolean f2949A;

    /* renamed from: B, reason: collision with root package name */
    public ViewGroup f2950B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f2951C;
    public View D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2952E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2953F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2954G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2955H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2956I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2957J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2958K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2959L;

    /* renamed from: M, reason: collision with root package name */
    public u[] f2960M;

    /* renamed from: N, reason: collision with root package name */
    public u f2961N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2962O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2963P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2964Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2965R;

    /* renamed from: S, reason: collision with root package name */
    public Configuration f2966S;

    /* renamed from: T, reason: collision with root package name */
    public final int f2967T;

    /* renamed from: U, reason: collision with root package name */
    public int f2968U;

    /* renamed from: V, reason: collision with root package name */
    public int f2969V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2970W;

    /* renamed from: X, reason: collision with root package name */
    public r f2971X;

    /* renamed from: Y, reason: collision with root package name */
    public r f2972Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2973Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2974a0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2976c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f2977d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f2978e0;

    /* renamed from: f0, reason: collision with root package name */
    public y f2979f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f2980g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f2981h0;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2982k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f2983l;

    /* renamed from: m, reason: collision with root package name */
    public Window f2984m;

    /* renamed from: n, reason: collision with root package name */
    public q f2985n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0160h f2986o;

    /* renamed from: p, reason: collision with root package name */
    public C0152I f2987p;

    /* renamed from: q, reason: collision with root package name */
    public i.j f2988q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2989r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0295m0 f2990s;

    /* renamed from: t, reason: collision with root package name */
    public m f2991t;

    /* renamed from: u, reason: collision with root package name */
    public m f2992u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0184b f2993v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContextView f2994w;

    /* renamed from: x, reason: collision with root package name */
    public PopupWindow f2995x;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC0164l f2996y;

    /* renamed from: z, reason: collision with root package name */
    public C0003b0 f2997z = null;

    /* renamed from: b0, reason: collision with root package name */
    public final RunnableC0164l f2975b0 = new RunnableC0164l(this, 0);

    public v(Context context, Window window, InterfaceC0160h interfaceC0160h, Object obj) {
        AbstractActivityC0159g abstractActivityC0159g;
        this.f2967T = -100;
        this.f2983l = context;
        this.f2986o = interfaceC0160h;
        this.f2982k = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0159g)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0159g = (AbstractActivityC0159g) context;
                    break;
                }
            }
            abstractActivityC0159g = null;
            if (abstractActivityC0159g != null) {
                this.f2967T = ((v) abstractActivityC0159g.k()).f2967T;
            }
        }
        if (this.f2967T == -100) {
            C0342k c0342k = i0;
            Integer num = (Integer) c0342k.getOrDefault(this.f2982k.getClass().getName(), null);
            if (num != null) {
                this.f2967T = num.intValue();
                c0342k.remove(this.f2982k.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0308t.c();
    }

    public static F.h o(Context context) {
        F.h hVar;
        F.h hVar2;
        if (Build.VERSION.SDK_INT >= 33 || (hVar = AbstractC0163k.f2915d) == null) {
            return null;
        }
        F.h b3 = o.b(context.getApplicationContext().getResources().getConfiguration());
        F.i iVar = hVar.f156a;
        if (iVar.f157a.isEmpty()) {
            hVar2 = F.h.f155b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i3 = 0;
            while (i3 < b3.f156a.f157a.size() + iVar.f157a.size()) {
                Locale locale = i3 < iVar.f157a.size() ? iVar.f157a.get(i3) : b3.f156a.f157a.get(i3 - iVar.f157a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i3++;
            }
            hVar2 = new F.h(new F.i(F.g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return hVar2.f156a.f157a.isEmpty() ? b3 : hVar2;
    }

    public static Configuration s(Context context, int i3, F.h hVar, Configuration configuration, boolean z3) {
        int i4 = i3 != 1 ? i3 != 2 ? z3 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            o.d(configuration2, hVar);
        }
        return configuration2;
    }

    public final void A(int i3) {
        this.f2974a0 = (1 << i3) | this.f2974a0;
        if (this.f2973Z) {
            return;
        }
        View decorView = this.f2984m.getDecorView();
        WeakHashMap weakHashMap = T.f402a;
        J.B.m(decorView, this.f2975b0);
        this.f2973Z = true;
    }

    public final int B(Context context, int i3) {
        if (i3 == -100) {
            return -1;
        }
        if (i3 != -1) {
            if (i3 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return x(context).f();
            }
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f2972Y == null) {
                    this.f2972Y = new r(this, context);
                }
                return this.f2972Y.f();
            }
        }
        return i3;
    }

    public final boolean C() {
        InterfaceC0297n0 interfaceC0297n0;
        i1 i1Var;
        boolean z3 = this.f2962O;
        this.f2962O = false;
        u y3 = y(0);
        if (y3.f2942m) {
            if (!z3) {
                r(y3, true);
            }
            return true;
        }
        AbstractC0184b abstractC0184b = this.f2993v;
        if (abstractC0184b != null) {
            abstractC0184b.a();
            return true;
        }
        z();
        C0152I c0152i = this.f2987p;
        if (c0152i == null || (interfaceC0297n0 = c0152i.f2855e) == null || (i1Var = ((n1) interfaceC0297n0).f3737a.f1649L) == null || i1Var.c == null) {
            return false;
        }
        i1 i1Var2 = ((n1) interfaceC0297n0).f3737a.f1649L;
        C0209o c0209o = i1Var2 == null ? null : i1Var2.c;
        if (c0209o != null) {
            c0209o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.g.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(u uVar, KeyEvent keyEvent) {
        int i3;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.f2942m || this.f2965R) {
            return;
        }
        int i4 = uVar.f2933a;
        Context context = this.f2983l;
        if (i4 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f2984m.getCallback();
        if (callback != null && !callback.onMenuOpened(i4, uVar.h)) {
            r(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(uVar, keyEvent)) {
            return;
        }
        t tVar = uVar.f2936e;
        if (tVar == null || uVar.f2943n) {
            if (tVar == null) {
                z();
                C0152I c0152i = this.f2987p;
                Context I2 = c0152i != null ? c0152i.I() : null;
                if (I2 != null) {
                    context = I2;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(xyz.happify.ckemv.R.attr.actionBarPopupTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    newTheme.applyStyle(i5, true);
                }
                newTheme.resolveAttribute(xyz.happify.ckemv.R.attr.panelMenuListTheme, typedValue, true);
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    newTheme.applyStyle(i6, true);
                } else {
                    newTheme.applyStyle(xyz.happify.ckemv.R.style.Theme_AppCompat_CompactMenu, true);
                }
                i.e eVar = new i.e(context, 0);
                eVar.getTheme().setTo(newTheme);
                uVar.f2939j = eVar;
                TypedArray obtainStyledAttributes = eVar.obtainStyledAttributes(AbstractC0116a.f2671j);
                uVar.f2934b = obtainStyledAttributes.getResourceId(86, 0);
                uVar.f2935d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                uVar.f2936e = new t(this, uVar.f2939j);
                uVar.c = 81;
            } else if (uVar.f2943n && tVar.getChildCount() > 0) {
                uVar.f2936e.removeAllViews();
            }
            View view = uVar.g;
            if (view == null) {
                if (uVar.h != null) {
                    if (this.f2992u == null) {
                        this.f2992u = new m(this, 3);
                    }
                    m mVar = this.f2992u;
                    if (uVar.f2938i == null) {
                        C0203i c0203i = new C0203i(uVar.f2939j);
                        uVar.f2938i = c0203i;
                        c0203i.f3303f = mVar;
                        MenuC0207m menuC0207m = uVar.h;
                        menuC0207m.b(c0203i, menuC0207m.f3309a);
                    }
                    C0203i c0203i2 = uVar.f2938i;
                    t tVar2 = uVar.f2936e;
                    if (c0203i2.f3302e == null) {
                        c0203i2.f3302e = (ExpandedMenuView) c0203i2.c.inflate(xyz.happify.ckemv.R.layout.abc_expanded_menu_layout, (ViewGroup) tVar2, false);
                        if (c0203i2.g == null) {
                            c0203i2.g = new C0202h(c0203i2);
                        }
                        c0203i2.f3302e.setAdapter((ListAdapter) c0203i2.g);
                        c0203i2.f3302e.setOnItemClickListener(c0203i2);
                    }
                    ExpandedMenuView expandedMenuView = c0203i2.f3302e;
                    uVar.f2937f = expandedMenuView;
                }
                uVar.f2943n = true;
                return;
            }
            uVar.f2937f = view;
            if (uVar.f2937f != null) {
                if (uVar.g == null) {
                    C0203i c0203i3 = uVar.f2938i;
                    if (c0203i3.g == null) {
                        c0203i3.g = new C0202h(c0203i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = uVar.f2937f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                uVar.f2936e.setBackgroundResource(uVar.f2934b);
                ViewParent parent = uVar.f2937f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(uVar.f2937f);
                }
                uVar.f2936e.addView(uVar.f2937f, layoutParams2);
                if (!uVar.f2937f.hasFocus()) {
                    uVar.f2937f.requestFocus();
                }
            }
            uVar.f2943n = true;
            return;
        }
        View view2 = uVar.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i3 = -1;
            uVar.f2941l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = uVar.c;
            layoutParams3.windowAnimations = uVar.f2935d;
            windowManager.addView(uVar.f2936e, layoutParams3);
            uVar.f2942m = true;
            if (i4 != 0) {
                H();
                return;
            }
            return;
        }
        i3 = -2;
        uVar.f2941l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = uVar.c;
        layoutParams32.windowAnimations = uVar.f2935d;
        windowManager.addView(uVar.f2936e, layoutParams32);
        uVar.f2942m = true;
        if (i4 != 0) {
        }
    }

    public final boolean E(u uVar, int i3, KeyEvent keyEvent) {
        MenuC0207m menuC0207m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f2940k || F(uVar, keyEvent)) && (menuC0207m = uVar.h) != null) {
            return menuC0207m.performShortcut(i3, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(u uVar, KeyEvent keyEvent) {
        InterfaceC0295m0 interfaceC0295m0;
        InterfaceC0295m0 interfaceC0295m02;
        Resources.Theme theme;
        InterfaceC0295m0 interfaceC0295m03;
        InterfaceC0295m0 interfaceC0295m04;
        if (this.f2965R) {
            return false;
        }
        if (uVar.f2940k) {
            return true;
        }
        u uVar2 = this.f2961N;
        if (uVar2 != null && uVar2 != uVar) {
            r(uVar2, false);
        }
        Window.Callback callback = this.f2984m.getCallback();
        int i3 = uVar.f2933a;
        if (callback != null) {
            uVar.g = callback.onCreatePanelView(i3);
        }
        boolean z3 = i3 == 0 || i3 == 108;
        if (z3 && (interfaceC0295m04 = this.f2990s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0295m04;
            actionBarOverlayLayout.k();
            ((n1) actionBarOverlayLayout.f1558f).f3745l = true;
        }
        if (uVar.g == null) {
            MenuC0207m menuC0207m = uVar.h;
            if (menuC0207m == null || uVar.f2944o) {
                if (menuC0207m == null) {
                    Context context = this.f2983l;
                    if ((i3 == 0 || i3 == 108) && this.f2990s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(xyz.happify.ckemv.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(xyz.happify.ckemv.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(xyz.happify.ckemv.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            i.e eVar = new i.e(context, 0);
                            eVar.getTheme().setTo(theme);
                            context = eVar;
                        }
                    }
                    MenuC0207m menuC0207m2 = new MenuC0207m(context);
                    menuC0207m2.f3312e = this;
                    MenuC0207m menuC0207m3 = uVar.h;
                    if (menuC0207m2 != menuC0207m3) {
                        if (menuC0207m3 != null) {
                            menuC0207m3.r(uVar.f2938i);
                        }
                        uVar.h = menuC0207m2;
                        C0203i c0203i = uVar.f2938i;
                        if (c0203i != null) {
                            menuC0207m2.b(c0203i, menuC0207m2.f3309a);
                        }
                    }
                    if (uVar.h == null) {
                        return false;
                    }
                }
                if (z3 && (interfaceC0295m02 = this.f2990s) != null) {
                    if (this.f2991t == null) {
                        this.f2991t = new m(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0295m02).l(uVar.h, this.f2991t);
                }
                uVar.h.w();
                if (!callback.onCreatePanelMenu(i3, uVar.h)) {
                    MenuC0207m menuC0207m4 = uVar.h;
                    if (menuC0207m4 != null) {
                        if (menuC0207m4 != null) {
                            menuC0207m4.r(uVar.f2938i);
                        }
                        uVar.h = null;
                    }
                    if (z3 && (interfaceC0295m0 = this.f2990s) != null) {
                        ((ActionBarOverlayLayout) interfaceC0295m0).l(null, this.f2991t);
                    }
                    return false;
                }
                uVar.f2944o = false;
            }
            uVar.h.w();
            Bundle bundle = uVar.f2945p;
            if (bundle != null) {
                uVar.h.s(bundle);
                uVar.f2945p = null;
            }
            if (!callback.onPreparePanel(0, uVar.g, uVar.h)) {
                if (z3 && (interfaceC0295m03 = this.f2990s) != null) {
                    ((ActionBarOverlayLayout) interfaceC0295m03).l(null, this.f2991t);
                }
                uVar.h.v();
                return false;
            }
            uVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            uVar.h.v();
        }
        uVar.f2940k = true;
        uVar.f2941l = false;
        this.f2961N = uVar;
        return true;
    }

    public final void G() {
        if (this.f2949A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f2980g0 != null && (y(0).f2942m || this.f2993v != null)) {
                z3 = true;
            }
            if (z3 && this.f2981h0 == null) {
                this.f2981h0 = p.b(this.f2980g0, this);
            } else {
                if (z3 || (onBackInvokedCallback = this.f2981h0) == null) {
                    return;
                }
                p.c(this.f2980g0, onBackInvokedCallback);
            }
        }
    }

    @Override // f.AbstractC0163k
    public final void a() {
        if (this.f2987p != null) {
            z();
            this.f2987p.getClass();
            A(0);
        }
    }

    @Override // f.AbstractC0163k
    public final void c() {
        String str;
        this.f2963P = true;
        m(false, true);
        w();
        Object obj = this.f2982k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0059a.v(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new IllegalArgumentException(e3);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0152I c0152i = this.f2987p;
                if (c0152i == null) {
                    this.f2976c0 = true;
                } else {
                    c0152i.K(true);
                }
            }
            synchronized (AbstractC0163k.f2918i) {
                AbstractC0163k.f(this);
                AbstractC0163k.h.add(new WeakReference(this));
            }
        }
        this.f2966S = new Configuration(this.f2983l.getResources().getConfiguration());
        this.f2964Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // f.AbstractC0163k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        r rVar;
        r rVar2;
        if (this.f2982k instanceof Activity) {
            synchronized (AbstractC0163k.f2918i) {
                AbstractC0163k.f(this);
            }
        }
        if (this.f2973Z) {
            this.f2984m.getDecorView().removeCallbacks(this.f2975b0);
        }
        this.f2965R = true;
        if (this.f2967T != -100) {
            Object obj = this.f2982k;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                i0.put(this.f2982k.getClass().getName(), Integer.valueOf(this.f2967T));
                rVar = this.f2971X;
                if (rVar != null) {
                    rVar.c();
                }
                rVar2 = this.f2972Y;
                if (rVar2 == null) {
                    rVar2.c();
                    return;
                }
                return;
            }
        }
        i0.remove(this.f2982k.getClass().getName());
        rVar = this.f2971X;
        if (rVar != null) {
        }
        rVar2 = this.f2972Y;
        if (rVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // j.InterfaceC0205k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MenuC0207m menuC0207m) {
        ActionMenuView actionMenuView;
        C0288j c0288j;
        C0288j c0288j2;
        C0288j c0288j3;
        InterfaceC0295m0 interfaceC0295m0 = this.f2990s;
        if (interfaceC0295m0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0295m0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((n1) actionBarOverlayLayout.f1558f).f3737a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1655b) != null && actionMenuView.f1582t) {
                if (ViewConfiguration.get(this.f2983l).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2990s;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((n1) actionBarOverlayLayout2.f1558f).f3737a.f1655b;
                    if (actionMenuView2 != null) {
                        C0288j c0288j4 = actionMenuView2.f1583u;
                        if (c0288j4 != null) {
                            if (c0288j4.f3709v == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f2984m.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2990s;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((n1) actionBarOverlayLayout3.f1558f).f3737a.f1655b;
                if ((actionMenuView3 == null || (c0288j3 = actionMenuView3.f1583u) == null || !c0288j3.i()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2990s;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((n1) actionBarOverlayLayout4.f1558f).f3737a.f1655b;
                    if (actionMenuView4 != null && (c0288j2 = actionMenuView4.f1583u) != null) {
                        c0288j2.f();
                    }
                    if (this.f2965R) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).h);
                    return;
                }
                if (callback == null || this.f2965R) {
                    return;
                }
                if (this.f2973Z && (1 & this.f2974a0) != 0) {
                    View decorView = this.f2984m.getDecorView();
                    RunnableC0164l runnableC0164l = this.f2975b0;
                    decorView.removeCallbacks(runnableC0164l);
                    runnableC0164l.run();
                }
                u y3 = y(0);
                MenuC0207m menuC0207m2 = y3.h;
                if (menuC0207m2 == null || y3.f2944o || !callback.onPreparePanel(0, y3.g, menuC0207m2)) {
                    return;
                }
                callback.onMenuOpened(108, y3.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f2990s;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((n1) actionBarOverlayLayout5.f1558f).f3737a.f1655b;
                if (actionMenuView5 == null || (c0288j = actionMenuView5.f1583u) == null) {
                    return;
                }
                c0288j.l();
                return;
            }
        }
        u y4 = y(0);
        y4.f2943n = true;
        r(y4, false);
        D(y4, null);
    }

    @Override // j.InterfaceC0205k
    public final boolean g(MenuC0207m menuC0207m, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f2984m.getCallback();
        if (callback != null && !this.f2965R) {
            MenuC0207m k2 = menuC0207m.k();
            u[] uVarArr = this.f2960M;
            int length = uVarArr != null ? uVarArr.length : 0;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    uVar = uVarArr[i3];
                    if (uVar != null && uVar.h == k2) {
                        break;
                    }
                    i3++;
                } else {
                    uVar = null;
                    break;
                }
            }
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f2933a, menuItem);
            }
        }
        return false;
    }

    @Override // f.AbstractC0163k
    public final boolean h(int i3) {
        if (i3 == 8) {
            i3 = 108;
        } else if (i3 == 9) {
            i3 = 109;
        }
        if (this.f2958K && i3 == 108) {
            return false;
        }
        if (this.f2954G && i3 == 1) {
            this.f2954G = false;
        }
        if (i3 == 1) {
            G();
            this.f2958K = true;
            return true;
        }
        if (i3 == 2) {
            G();
            this.f2952E = true;
            return true;
        }
        if (i3 == 5) {
            G();
            this.f2953F = true;
            return true;
        }
        if (i3 == 10) {
            G();
            this.f2956I = true;
            return true;
        }
        if (i3 == 108) {
            G();
            this.f2954G = true;
            return true;
        }
        if (i3 != 109) {
            return this.f2984m.requestFeature(i3);
        }
        G();
        this.f2955H = true;
        return true;
    }

    @Override // f.AbstractC0163k
    public final void i(int i3) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2950B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2983l).inflate(i3, viewGroup);
        this.f2985n.a(this.f2984m.getCallback());
    }

    @Override // f.AbstractC0163k
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2950B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2985n.a(this.f2984m.getCallback());
    }

    @Override // f.AbstractC0163k
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f2950B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2985n.a(this.f2984m.getCallback());
    }

    @Override // f.AbstractC0163k
    public final void l(CharSequence charSequence) {
        this.f2989r = charSequence;
        InterfaceC0295m0 interfaceC0295m0 = this.f2990s;
        if (interfaceC0295m0 != null) {
            interfaceC0295m0.setWindowTitle(charSequence);
            return;
        }
        C0152I c0152i = this.f2987p;
        if (c0152i == null) {
            TextView textView = this.f2951C;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        n1 n1Var = (n1) c0152i.f2855e;
        if (n1Var.g) {
            return;
        }
        n1Var.h = charSequence;
        if ((n1Var.f3738b & 8) != 0) {
            Toolbar toolbar = n1Var.f3737a;
            toolbar.setTitle(charSequence);
            if (n1Var.g) {
                T.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z3, boolean z4) {
        int i3;
        Configuration configuration;
        F.h b3;
        int i4;
        boolean z5;
        Activity activity;
        if (this.f2965R) {
            return false;
        }
        int i5 = this.f2967T;
        if (i5 == -100) {
            i5 = AbstractC0163k.c;
        }
        Context context = this.f2983l;
        int B3 = B(context, i5);
        int i6 = Build.VERSION.SDK_INT;
        F.h o3 = i6 < 33 ? o(context) : null;
        if (!z4 && o3 != null) {
            o3 = o.b(context.getResources().getConfiguration());
        }
        Configuration s3 = s(context, B3, o3, null, false);
        boolean z6 = this.f2970W;
        boolean z7 = true;
        Object obj = this.f2982k;
        if (!z6 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i3 = 0;
                configuration = this.f2966S;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i7 = configuration.uiMode & 48;
                int i8 = s3.uiMode & 48;
                F.h b4 = o.b(configuration);
                b3 = o3 != null ? null : o.b(s3);
                i4 = i7 == i8 ? 512 : 0;
                if (b3 != null && !b4.equals(b3)) {
                    i4 |= 8196;
                }
                if (((~i3) & i4) != 0 && z3 && this.f2963P && ((f2947k0 || this.f2964Q) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new B2.u(14, activity));
                        }
                        z5 = true;
                        if (!z5 || i4 == 0) {
                            z7 = z5;
                        } else {
                            boolean z8 = (i4 & i3) == i4;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i8;
                            if (b3 != null) {
                                o.d(configuration2, b3);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i9 = this.f2968U;
                            if (i9 != 0) {
                                context.setTheme(i9);
                                context.getTheme().applyStyle(this.f2968U, true);
                            }
                            if (z8 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof androidx.lifecycle.r) {
                                    if (((androidx.lifecycle.r) activity2).d().c.compareTo(EnumC0096m.f2045d) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f2964Q && !this.f2965R) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z7 && (obj instanceof AbstractActivityC0159g)) {
                            if ((i4 & 512) != 0) {
                                ((AbstractActivityC0159g) obj).getClass();
                            }
                            if ((i4 & 4) != 0) {
                                ((AbstractActivityC0159g) obj).getClass();
                            }
                        }
                        if (z7 && b3 != null) {
                            o.c(o.b(context.getResources().getConfiguration()));
                        }
                        if (i5 == 0) {
                            x(context).k();
                        } else {
                            r rVar = this.f2971X;
                            if (rVar != null) {
                                rVar.c();
                            }
                        }
                        if (i5 == 3) {
                            if (this.f2972Y == null) {
                                this.f2972Y = new r(this, context);
                            }
                            this.f2972Y.k();
                        } else {
                            r rVar2 = this.f2972Y;
                            if (rVar2 != null) {
                                rVar2.c();
                            }
                        }
                        return z7;
                    }
                }
                z5 = false;
                if (z5) {
                }
                z7 = z5;
                if (z7) {
                    if ((i4 & 512) != 0) {
                    }
                    if ((i4 & 4) != 0) {
                    }
                }
                if (z7) {
                    o.c(o.b(context.getResources().getConfiguration()));
                }
                if (i5 == 0) {
                }
                if (i5 == 3) {
                }
                return z7;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i6 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f2969V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f2969V = 0;
            }
        }
        this.f2970W = true;
        i3 = this.f2969V;
        configuration = this.f2966S;
        if (configuration == null) {
        }
        int i72 = configuration.uiMode & 48;
        int i82 = s3.uiMode & 48;
        F.h b42 = o.b(configuration);
        if (o3 != null) {
        }
        if (i72 == i82) {
        }
        if (b3 != null) {
            i4 |= 8196;
        }
        if (((~i3) & i4) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z5 = false;
        if (z5) {
        }
        z7 = z5;
        if (z7) {
        }
        if (z7) {
        }
        if (i5 == 0) {
        }
        if (i5 == 3) {
        }
        return z7;
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2984m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof q) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        q qVar = new q(this, callback);
        this.f2985n = qVar;
        window.setCallback(qVar);
        int[] iArr = f2946j0;
        Context context = this.f2983l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0308t a3 = C0308t.a();
            synchronized (a3) {
                drawable = a3.f3777a.f(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2984m = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2980g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2981h0) != null) {
            p.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2981h0 = null;
        }
        Object obj = this.f2982k;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2980g0 = p.a(activity);
                H();
            }
        }
        this.f2980g0 = null;
        H();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:64:0x01bb
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.v.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i3, u uVar, MenuC0207m menuC0207m) {
        if (menuC0207m == null) {
            if (uVar == null && i3 >= 0) {
                u[] uVarArr = this.f2960M;
                if (i3 < uVarArr.length) {
                    uVar = uVarArr[i3];
                }
            }
            if (uVar != null) {
                menuC0207m = uVar.h;
            }
        }
        if ((uVar == null || uVar.f2942m) && !this.f2965R) {
            q qVar = this.f2985n;
            Window.Callback callback = this.f2984m.getCallback();
            qVar.getClass();
            try {
                qVar.f2926e = true;
                callback.onPanelClosed(i3, menuC0207m);
            } finally {
                qVar.f2926e = false;
            }
        }
    }

    public final void q(MenuC0207m menuC0207m) {
        C0288j c0288j;
        if (this.f2959L) {
            return;
        }
        this.f2959L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2990s;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((n1) actionBarOverlayLayout.f1558f).f3737a.f1655b;
        if (actionMenuView != null && (c0288j = actionMenuView.f1583u) != null) {
            c0288j.f();
            C0280f c0280f = c0288j.f3708u;
            if (c0280f != null && c0280f.b()) {
                c0280f.f3374j.dismiss();
            }
        }
        Window.Callback callback = this.f2984m.getCallback();
        if (callback != null && !this.f2965R) {
            callback.onPanelClosed(108, menuC0207m);
        }
        this.f2959L = false;
    }

    public final void r(u uVar, boolean z3) {
        t tVar;
        InterfaceC0295m0 interfaceC0295m0;
        C0288j c0288j;
        if (z3 && uVar.f2933a == 0 && (interfaceC0295m0 = this.f2990s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0295m0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((n1) actionBarOverlayLayout.f1558f).f3737a.f1655b;
            if (actionMenuView != null && (c0288j = actionMenuView.f1583u) != null && c0288j.i()) {
                q(uVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2983l.getSystemService("window");
        if (windowManager != null && uVar.f2942m && (tVar = uVar.f2936e) != null) {
            windowManager.removeView(tVar);
            if (z3) {
                p(uVar.f2933a, uVar, null);
            }
        }
        uVar.f2940k = false;
        uVar.f2941l = false;
        uVar.f2942m = false;
        uVar.f2937f = null;
        uVar.f2943n = true;
        if (this.f2961N == uVar) {
            this.f2961N = null;
        }
        if (uVar.f2933a == 0) {
            H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        AudioManager audioManager;
        ActionMenuView actionMenuView;
        C0288j c0288j;
        C0288j c0288j2;
        C0288j c0288j3;
        Object obj = this.f2982k;
        if (((obj instanceof InterfaceC0012k) || (obj instanceof DialogC0158f)) && (decorView = this.f2984m.getDecorView()) != null && u2.l.g(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            q qVar = this.f2985n;
            Window.Callback callback = this.f2984m.getCallback();
            qVar.getClass();
            try {
                qVar.f2925d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                qVar.f2925d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2962O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                u y3 = y(0);
                if (y3.f2942m) {
                    return true;
                }
                F(y3, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2993v != null) {
                    return true;
                }
                u y4 = y(0);
                InterfaceC0295m0 interfaceC0295m0 = this.f2990s;
                Context context = this.f2983l;
                if (interfaceC0295m0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0295m0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((n1) actionBarOverlayLayout.f1558f).f3737a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1655b) != null && actionMenuView.f1582t && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f2990s;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((n1) actionBarOverlayLayout2.f1558f).f3737a.f1655b;
                        if (actionMenuView2 != null && (c0288j2 = actionMenuView2.f1583u) != null && c0288j2.i()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f2990s;
                            actionBarOverlayLayout3.k();
                            ActionMenuView actionMenuView3 = ((n1) actionBarOverlayLayout3.f1558f).f3737a.f1655b;
                            if (actionMenuView3 == null || (c0288j3 = actionMenuView3.f1583u) == null || !c0288j3.f()) {
                                return true;
                            }
                        } else {
                            if (this.f2965R || !F(y4, keyEvent)) {
                                return true;
                            }
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f2990s;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((n1) actionBarOverlayLayout4.f1558f).f3737a.f1655b;
                            if (actionMenuView4 == null || (c0288j = actionMenuView4.f1583u) == null || !c0288j.l()) {
                                return true;
                            }
                        }
                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            return true;
                        }
                        audioManager.playSoundEffect(0);
                        return true;
                    }
                }
                boolean z3 = y4.f2942m;
                if (z3 || y4.f2941l) {
                    r(y4, true);
                    if (!z3) {
                        return true;
                    }
                } else {
                    if (!y4.f2940k) {
                        return true;
                    }
                    if (y4.f2944o) {
                        y4.f2940k = false;
                        if (!F(y4, keyEvent)) {
                            return true;
                        }
                    }
                    D(y4, keyEvent);
                }
                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                }
            }
        } else if (C()) {
            return true;
        }
        return false;
    }

    public final void u(int i3) {
        u y3 = y(i3);
        if (y3.h != null) {
            Bundle bundle = new Bundle();
            y3.h.t(bundle);
            if (bundle.size() > 0) {
                y3.f2945p = bundle;
            }
            y3.h.w();
            y3.h.clear();
        }
        y3.f2944o = true;
        y3.f2943n = true;
        if ((i3 == 108 || i3 == 0) && this.f2990s != null) {
            u y4 = y(0);
            y4.f2940k = false;
            F(y4, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i3 = 1;
        int i4 = 0;
        if (this.f2949A) {
            return;
        }
        int[] iArr = AbstractC0116a.f2671j;
        Context context = this.f2983l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.f2957J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f2984m.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f2958K) {
            viewGroup = this.f2956I ? (ViewGroup) from.inflate(xyz.happify.ckemv.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(xyz.happify.ckemv.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2957J) {
            viewGroup = (ViewGroup) from.inflate(xyz.happify.ckemv.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f2955H = false;
            this.f2954G = false;
        } else if (this.f2954G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(xyz.happify.ckemv.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new i.e(context, typedValue.resourceId) : context).inflate(xyz.happify.ckemv.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0295m0 interfaceC0295m0 = (InterfaceC0295m0) viewGroup.findViewById(xyz.happify.ckemv.R.id.decor_content_parent);
            this.f2990s = interfaceC0295m0;
            interfaceC0295m0.setWindowCallback(this.f2984m.getCallback());
            if (this.f2955H) {
                ((ActionBarOverlayLayout) this.f2990s).j(109);
            }
            if (this.f2952E) {
                ((ActionBarOverlayLayout) this.f2990s).j(2);
            }
            if (this.f2953F) {
                ((ActionBarOverlayLayout) this.f2990s).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2954G + ", windowActionBarOverlay: " + this.f2955H + ", android:windowIsFloating: " + this.f2957J + ", windowActionModeOverlay: " + this.f2956I + ", windowNoTitle: " + this.f2958K + " }");
        }
        m mVar = new m(this, i4);
        WeakHashMap weakHashMap = T.f402a;
        J.H.u(viewGroup, mVar);
        if (this.f2990s == null) {
            this.f2951C = (TextView) viewGroup.findViewById(xyz.happify.ckemv.R.id.title);
        }
        Method method = r1.f3768a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(xyz.happify.ckemv.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2984m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f2984m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new m(this, i3));
        this.f2950B = viewGroup;
        Object obj = this.f2982k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2989r;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0295m0 interfaceC0295m02 = this.f2990s;
            if (interfaceC0295m02 != null) {
                interfaceC0295m02.setWindowTitle(title);
            } else {
                C0152I c0152i = this.f2987p;
                if (c0152i != null) {
                    n1 n1Var = (n1) c0152i.f2855e;
                    if (!n1Var.g) {
                        n1Var.h = title;
                        if ((n1Var.f3738b & 8) != 0) {
                            Toolbar toolbar = n1Var.f3737a;
                            toolbar.setTitle(title);
                            if (n1Var.g) {
                                T.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f2951C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2950B.findViewById(R.id.content);
        View decorView = this.f2984m.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = T.f402a;
        if (J.E.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f2949A = true;
        u y3 = y(0);
        if (this.f2965R || y3.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f2984m == null) {
            Object obj = this.f2982k;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f2984m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final A1.f x(Context context) {
        if (this.f2971X == null) {
            if (v0.m.f5085f == null) {
                Context applicationContext = context.getApplicationContext();
                v0.m.f5085f = new v0.m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2971X = new r(this, v0.m.f5085f);
        }
        return this.f2971X;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, f.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u y(int i3) {
        Object[] objArr;
        u[] uVarArr = this.f2960M;
        if (uVarArr != null) {
            int length = uVarArr.length;
            objArr = uVarArr;
        }
        u[] uVarArr2 = new u[i3 + 1];
        if (uVarArr != null) {
            System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
        }
        this.f2960M = uVarArr2;
        objArr = uVarArr2;
        u uVar = objArr[i3];
        if (uVar != 0) {
            return uVar;
        }
        ?? obj = new Object();
        obj.f2933a = i3;
        obj.f2943n = false;
        objArr[i3] = obj;
        return obj;
    }

    public final void z() {
        v();
        if (this.f2954G && this.f2987p == null) {
            Object obj = this.f2982k;
            if (obj instanceof Activity) {
                this.f2987p = new C0152I((Activity) obj, this.f2955H);
            } else if (obj instanceof Dialog) {
                this.f2987p = new C0152I((Dialog) obj);
            }
            C0152I c0152i = this.f2987p;
            if (c0152i != null) {
                c0152i.K(this.f2976c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
