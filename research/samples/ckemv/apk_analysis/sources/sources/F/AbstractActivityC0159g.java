package f;

import a.AbstractC0059a;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0077n;
import androidx.fragment.app.C0078o;
import androidx.fragment.app.C0079p;
import androidx.fragment.app.C0080q;
import androidx.fragment.app.P;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.EnumC0096m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.C0308t;
import k.O0;
import k.n1;
import k.p1;
import n.C0336e;
import x.AbstractC0411a;
import x.AbstractC0419i;
import x.InterfaceC0413c;
import xyz.happify.ckemv.MainActivity;
import y.AbstractC0444a;
import z.AbstractC0452b;
import z.AbstractC0463m;

/* renamed from: f.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0159g extends androidx.activity.k implements InterfaceC0160h, InterfaceC0413c {

    /* renamed from: r, reason: collision with root package name */
    public final A.h f2908r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2910t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2911u;

    /* renamed from: w, reason: collision with root package name */
    public v f2913w;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.t f2909s = new androidx.lifecycle.t(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f2912v = true;

    public AbstractActivityC0159g() {
        MainActivity mainActivity = (MainActivity) this;
        this.f2908r = new A.h(24, new C0080q(mainActivity));
        ((d0.d) this.f1452f.f1464d).e("android:support:fragments", new C0078o(mainActivity, 0));
        g(new C0079p(mainActivity, 0));
        ((d0.d) this.f1452f.f1464d).e("androidx:appcompat", new C0078o(mainActivity, 1));
        g(new C0079p(mainActivity, 1));
    }

    public static boolean n(androidx.fragment.app.B b3) {
        boolean z3 = false;
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : b3.c.u()) {
            if (abstractComponentCallbacksC0077n != null) {
                C0080q c0080q = abstractComponentCallbacksC0077n.f1984t;
                if ((c0080q == null ? null : c0080q.h) != null) {
                    z3 |= n(abstractComponentCallbacksC0077n.g());
                }
                P p3 = abstractComponentCallbacksC0077n.f1965N;
                EnumC0096m enumC0096m = EnumC0096m.f2046e;
                if (p3 != null) {
                    p3.f();
                    if (p3.c.c.compareTo(enumC0096m) >= 0) {
                        abstractComponentCallbacksC0077n.f1965N.c.g();
                        z3 = true;
                    }
                }
                if (abstractComponentCallbacksC0077n.f1964M.c.compareTo(enumC0096m) >= 0) {
                    abstractComponentCallbacksC0077n.f1964M.g();
                    z3 = true;
                }
            }
        }
        return z3;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        v vVar = (v) k();
        vVar.v();
        ((ViewGroup) vVar.f2950B.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f2985n.a(vVar.f2984m.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        v vVar = (v) k();
        vVar.f2963P = true;
        int i3 = vVar.f2967T;
        if (i3 == -100) {
            i3 = AbstractC0163k.c;
        }
        int B3 = vVar.B(context, i3);
        if (AbstractC0163k.b(context) && AbstractC0163k.b(context)) {
            if (!F.b.a()) {
                synchronized (AbstractC0163k.f2919j) {
                    try {
                        F.h hVar = AbstractC0163k.f2915d;
                        if (hVar == null) {
                            if (AbstractC0163k.f2916e == null) {
                                AbstractC0163k.f2916e = F.h.a(u2.l.E(context));
                            }
                            if (!AbstractC0163k.f2916e.f156a.f157a.isEmpty()) {
                                AbstractC0163k.f2915d = AbstractC0163k.f2916e;
                            }
                        } else if (!hVar.equals(AbstractC0163k.f2916e)) {
                            F.h hVar2 = AbstractC0163k.f2915d;
                            AbstractC0163k.f2916e = hVar2;
                            u2.l.C(context, hVar2.f156a.f157a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0163k.g) {
                AbstractC0163k.f2914b.execute(new X.h(context, 2));
            }
        }
        F.h o3 = v.o(context);
        if (v.f2948l0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v.s(context, B3, o3, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof i.e) {
            try {
                ((i.e) context).a(v.s(context, B3, o3, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (v.f2947k0) {
            int i4 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f3 = configuration3.fontScale;
                    float f4 = configuration4.fontScale;
                    if (f3 != f4) {
                        configuration.fontScale = f4;
                    }
                    int i5 = configuration3.mcc;
                    int i6 = configuration4.mcc;
                    if (i5 != i6) {
                        configuration.mcc = i6;
                    }
                    int i7 = configuration3.mnc;
                    int i8 = configuration4.mnc;
                    if (i7 != i8) {
                        configuration.mnc = i8;
                    }
                    o.a(configuration3, configuration4, configuration);
                    int i9 = configuration3.touchscreen;
                    int i10 = configuration4.touchscreen;
                    if (i9 != i10) {
                        configuration.touchscreen = i10;
                    }
                    int i11 = configuration3.keyboard;
                    int i12 = configuration4.keyboard;
                    if (i11 != i12) {
                        configuration.keyboard = i12;
                    }
                    int i13 = configuration3.keyboardHidden;
                    int i14 = configuration4.keyboardHidden;
                    if (i13 != i14) {
                        configuration.keyboardHidden = i14;
                    }
                    int i15 = configuration3.navigation;
                    int i16 = configuration4.navigation;
                    if (i15 != i16) {
                        configuration.navigation = i16;
                    }
                    int i17 = configuration3.navigationHidden;
                    int i18 = configuration4.navigationHidden;
                    if (i17 != i18) {
                        configuration.navigationHidden = i18;
                    }
                    int i19 = configuration3.orientation;
                    int i20 = configuration4.orientation;
                    if (i19 != i20) {
                        configuration.orientation = i20;
                    }
                    int i21 = configuration3.screenLayout & 15;
                    int i22 = configuration4.screenLayout & 15;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 192;
                    int i24 = configuration4.screenLayout & 192;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 48;
                    int i26 = configuration4.screenLayout & 48;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.screenLayout & 768;
                    int i28 = configuration4.screenLayout & 768;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.colorMode & 3;
                    int i30 = configuration4.colorMode & 3;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.colorMode & 12;
                    int i32 = configuration4.colorMode & 12;
                    if (i31 != i32) {
                        configuration.colorMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 15;
                    int i34 = configuration4.uiMode & 15;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.uiMode & 48;
                    int i36 = configuration4.uiMode & 48;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.screenWidthDp;
                    int i38 = configuration4.screenWidthDp;
                    if (i37 != i38) {
                        configuration.screenWidthDp = i38;
                    }
                    int i39 = configuration3.screenHeightDp;
                    int i40 = configuration4.screenHeightDp;
                    if (i39 != i40) {
                        configuration.screenHeightDp = i40;
                    }
                    int i41 = configuration3.smallestScreenWidthDp;
                    int i42 = configuration4.smallestScreenWidthDp;
                    if (i41 != i42) {
                        configuration.smallestScreenWidthDp = i42;
                    }
                    int i43 = configuration3.densityDpi;
                    int i44 = configuration4.densityDpi;
                    if (i43 != i44) {
                        configuration.densityDpi = i44;
                    }
                }
            }
            Configuration s3 = v.s(context, B3, o3, configuration, true);
            i.e eVar = new i.e(context, xyz.happify.ckemv.R.style.Theme_AppCompat_Empty);
            eVar.a(s3);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = eVar.getTheme();
                    if (i4 >= 29) {
                        AbstractC0463m.a(theme);
                    } else {
                        synchronized (AbstractC0452b.f5286e) {
                            if (!AbstractC0452b.g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC0452b.f5287f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                AbstractC0452b.g = true;
                            }
                            Method method = AbstractC0452b.f5287f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    AbstractC0452b.f5287f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = eVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        l();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.activity.k, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        l();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2910t);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2911u);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2912v);
        if (getApplication() != null) {
            new v0.e(this, c()).c(str2, printWriter);
        }
        ((C0080q) this.f2908r.c).g.t(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i3) {
        v vVar = (v) k();
        vVar.v();
        return vVar.f2984m.findViewById(i3);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        v vVar = (v) k();
        if (vVar.f2988q == null) {
            vVar.z();
            C0152I c0152i = vVar.f2987p;
            vVar.f2988q = new i.j(c0152i != null ? c0152i.I() : vVar.f2983l);
        }
        return vVar.f2988q;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i3 = p1.f3758a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        k().a();
    }

    public final AbstractC0163k k() {
        if (this.f2913w == null) {
            ExecutorC0145B executorC0145B = AbstractC0163k.f2914b;
            this.f2913w = new v(this, null, this, this);
        }
        return this.f2913w;
    }

    public final C0152I l() {
        v vVar = (v) k();
        vVar.z();
        return vVar.f2987p;
    }

    public final void m() {
        View decorView = getWindow().getDecorView();
        X1.g.e(decorView, "<this>");
        decorView.setTag(xyz.happify.ckemv.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        X1.g.e(decorView2, "<this>");
        decorView2.setTag(xyz.happify.ckemv.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        X1.g.e(decorView3, "<this>");
        decorView3.setTag(xyz.happify.ckemv.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        X1.g.e(decorView4, "<this>");
        decorView4.setTag(xyz.happify.ckemv.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void o(Configuration configuration) {
        A.h hVar = this.f2908r;
        hVar.q();
        super.onConfigurationChanged(configuration);
        ((C0080q) hVar.c).g.h();
    }

    @Override // androidx.activity.k, android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        this.f2908r.q();
        super.onActivityResult(i3, i4, intent);
    }

    @Override // androidx.activity.k, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        o(configuration);
        v vVar = (v) k();
        if (vVar.f2954G && vVar.f2949A) {
            vVar.z();
            C0152I c0152i = vVar.f2987p;
            if (c0152i != null) {
                c0152i.L(c0152i.f2852a.getResources().getBoolean(xyz.happify.ckemv.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0308t a3 = C0308t.a();
        Context context = vVar.f2983l;
        synchronized (a3) {
            O0 o02 = a3.f3777a;
            synchronized (o02) {
                C0336e c0336e = (C0336e) o02.f3609b.get(context);
                if (c0336e != null) {
                    c0336e.a();
                }
            }
        }
        vVar.f2966S = new Configuration(vVar.f2983l.getResources().getConfiguration());
        vVar.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.activity.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2909s.d(EnumC0095l.ON_CREATE);
        androidx.fragment.app.B b3 = ((C0080q) this.f2908r.c).g;
        b3.f1830y = false;
        b3.f1831z = false;
        b3.f1807F.h = false;
        b3.s(1);
    }

    @Override // androidx.activity.k, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0) {
            super.onCreatePanelMenu(i3, menu);
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        return ((C0080q) this.f2908r.c).g.j() | true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0080q) this.f2908r.c).g.f1813f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        p();
        k().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((C0080q) this.f2908r.c).g.l();
    }

    @Override // androidx.activity.k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        Intent t3;
        if (q(i3, menuItem)) {
            return true;
        }
        C0152I l3 = l();
        if (menuItem.getItemId() == 16908332 && l3 != null && (((n1) l3.f2855e).f3738b & 4) != 0 && (t3 = AbstractC0059a.t(this)) != null) {
            if (!AbstractC0419i.c(this, t3)) {
                AbstractC0419i.b(this, t3);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent t4 = AbstractC0059a.t(this);
            if (t4 == null) {
                t4 = AbstractC0059a.t(this);
            }
            if (t4 != null) {
                ComponentName component = t4.getComponent();
                if (component == null) {
                    component = t4.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent u3 = AbstractC0059a.u(this, component);
                    while (u3 != null) {
                        arrayList.add(size, u3);
                        u3 = AbstractC0059a.u(this, u3.getComponent());
                    }
                    arrayList.add(t4);
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new IllegalArgumentException(e3);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            AbstractC0444a.a(this, intentArr, null);
            try {
                AbstractC0411a.a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i3, Menu menu) {
        return super.onMenuOpened(i3, menu);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        ((C0080q) this.f2908r.c).g.m(z3);
    }

    @Override // androidx.activity.k, android.app.Activity
    public void onNewIntent(Intent intent) {
        this.f2908r.q();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.k, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        r(i3, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2911u = false;
        ((C0080q) this.f2908r.c).g.s(5);
        this.f2909s.d(EnumC0095l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        ((C0080q) this.f2908r.c).g.q(z3);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) k()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        s();
        v vVar = (v) k();
        vVar.z();
        C0152I c0152i = vVar.f2987p;
        if (c0152i != null) {
            c0152i.f2869u = true;
        }
    }

    @Override // androidx.activity.k, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        if (i3 == 0) {
            super.onPreparePanel(0, view, menu);
            return ((C0080q) this.f2908r.c).g.r() | true;
        }
        super.onPreparePanel(i3, view, menu);
        return true;
    }

    @Override // androidx.activity.k, android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f2908r.q();
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        A.h hVar = this.f2908r;
        hVar.q();
        super.onResume();
        this.f2911u = true;
        ((C0080q) hVar.c).g.w(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        t();
        ((v) k()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2908r.q();
    }

    @Override // android.app.Activity
    public final void onStop() {
        u();
        v vVar = (v) k();
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

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i3) {
        super.onTitleChanged(charSequence, i3);
        k().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        l();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        super.onDestroy();
        ((C0080q) this.f2908r.c).g.k();
        this.f2909s.d(EnumC0095l.ON_DESTROY);
    }

    public final boolean q(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        A.h hVar = this.f2908r;
        if (i3 == 0) {
            return ((C0080q) hVar.c).g.n();
        }
        if (i3 != 6) {
            return false;
        }
        return ((C0080q) hVar.c).g.i();
    }

    public final void r(int i3, Menu menu) {
        if (i3 == 0) {
            ((C0080q) this.f2908r.c).g.o();
        }
        super.onPanelClosed(i3, menu);
    }

    public final void s() {
        super.onPostResume();
        this.f2909s.d(EnumC0095l.ON_RESUME);
        androidx.fragment.app.B b3 = ((C0080q) this.f2908r.c).g;
        b3.f1830y = false;
        b3.f1831z = false;
        b3.f1807F.h = false;
        b3.s(7);
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        m();
        k().i(i3);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        super.setTheme(i3);
        ((v) k()).f2968U = i3;
    }

    public final void t() {
        A.h hVar = this.f2908r;
        hVar.q();
        super.onStart();
        this.f2912v = false;
        boolean z3 = this.f2910t;
        C0080q c0080q = (C0080q) hVar.c;
        if (!z3) {
            this.f2910t = true;
            androidx.fragment.app.B b3 = c0080q.g;
            b3.f1830y = false;
            b3.f1831z = false;
            b3.f1807F.h = false;
            b3.s(4);
        }
        c0080q.g.w(true);
        this.f2909s.d(EnumC0095l.ON_START);
        androidx.fragment.app.B b4 = c0080q.g;
        b4.f1830y = false;
        b4.f1831z = false;
        b4.f1807F.h = false;
        b4.s(5);
    }

    public final void u() {
        A.h hVar;
        super.onStop();
        this.f2912v = true;
        do {
            hVar = this.f2908r;
        } while (n(((C0080q) hVar.c).g));
        androidx.fragment.app.B b3 = ((C0080q) hVar.c).g;
        b3.f1831z = true;
        b3.f1807F.h = true;
        b3.s(4);
        this.f2909s.d(EnumC0095l.ON_STOP);
    }

    @Override // androidx.activity.k, android.app.Activity
    public void setContentView(View view) {
        m();
        k().j(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0080q) this.f2908r.c).g.f1813f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        k().k(view, layoutParams);
    }
}
