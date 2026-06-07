package androidx.activity;

import J.InterfaceC0012k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0091h;
import androidx.lifecycle.InterfaceC0099p;
import androidx.lifecycle.J;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.SavedStateHandleAttacher;
import b.C0100a;
import b.InterfaceC0101b;
import d0.InterfaceC0114c;
import f.AbstractActivityC0159g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0328b;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public abstract class k extends Activity implements P, InterfaceC0091h, d0.e, v, androidx.activity.result.h, androidx.lifecycle.r, InterfaceC0012k {

    /* renamed from: b */
    public androidx.lifecycle.t f1449b = new androidx.lifecycle.t(this);
    public final C0100a c = new C0100a();

    /* renamed from: d */
    public final A.h f1450d = new A.h(9);

    /* renamed from: e */
    public final androidx.lifecycle.t f1451e;

    /* renamed from: f */
    public final l f1452f;
    public O g;
    public u h;

    /* renamed from: i */
    public final j f1453i;

    /* renamed from: j */
    public final l f1454j;

    /* renamed from: k */
    public final AtomicInteger f1455k;

    /* renamed from: l */
    public final g f1456l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f1457m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f1458n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f1459o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f1460p;

    /* renamed from: q */
    public final CopyOnWriteArrayList f1461q;

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.activity.d] */
    public k() {
        final AbstractActivityC0159g abstractActivityC0159g = (AbstractActivityC0159g) this;
        androidx.lifecycle.t tVar = new androidx.lifecycle.t(this);
        this.f1451e = tVar;
        l lVar = new l(this);
        this.f1452f = lVar;
        InterfaceC0114c interfaceC0114c = null;
        this.h = null;
        j jVar = new j(abstractActivityC0159g);
        this.f1453i = jVar;
        this.f1454j = new l(jVar, (d) new W1.a() { // from class: androidx.activity.d
            @Override // W1.a
            public final Object d() {
                abstractActivityC0159g.reportFullyDrawn();
                return null;
            }
        });
        this.f1455k = new AtomicInteger();
        this.f1456l = new g(abstractActivityC0159g);
        this.f1457m = new CopyOnWriteArrayList();
        this.f1458n = new CopyOnWriteArrayList();
        this.f1459o = new CopyOnWriteArrayList();
        this.f1460p = new CopyOnWriteArrayList();
        this.f1461q = new CopyOnWriteArrayList();
        tVar.a(new InterfaceC0099p() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.InterfaceC0099p
            public final void b(androidx.lifecycle.r rVar, EnumC0095l enumC0095l) {
                if (enumC0095l == EnumC0095l.ON_STOP) {
                    Window window = abstractActivityC0159g.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        tVar.a(new InterfaceC0099p() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.InterfaceC0099p
            public final void b(androidx.lifecycle.r rVar, EnumC0095l enumC0095l) {
                if (enumC0095l == EnumC0095l.ON_DESTROY) {
                    abstractActivityC0159g.c.f2216b = null;
                    if (!abstractActivityC0159g.isChangingConfigurations()) {
                        abstractActivityC0159g.c().a();
                    }
                    j jVar2 = abstractActivityC0159g.f1453i;
                    k kVar = jVar2.f1448e;
                    kVar.getWindow().getDecorView().removeCallbacks(jVar2);
                    kVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar2);
                }
            }
        });
        tVar.a(new InterfaceC0099p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0099p
            public final void b(androidx.lifecycle.r rVar, EnumC0095l enumC0095l) {
                k kVar = abstractActivityC0159g;
                if (kVar.g == null) {
                    i iVar = (i) kVar.getLastNonConfigurationInstance();
                    if (iVar != null) {
                        kVar.g = iVar.f1445a;
                    }
                    if (kVar.g == null) {
                        kVar.g = new O();
                    }
                }
                kVar.f1451e.f(this);
            }
        });
        lVar.c();
        EnumC0096m enumC0096m = tVar.c;
        if (enumC0096m != EnumC0096m.c && enumC0096m != EnumC0096m.f2045d) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        d0.d dVar = (d0.d) lVar.f1464d;
        dVar.getClass();
        Iterator it = ((m.f) dVar.f2610d).iterator();
        while (true) {
            C0328b c0328b = (C0328b) it;
            if (!c0328b.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0328b.next();
            X1.g.d(entry, "components");
            String str = (String) entry.getKey();
            InterfaceC0114c interfaceC0114c2 = (InterfaceC0114c) entry.getValue();
            if (X1.g.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                interfaceC0114c = interfaceC0114c2;
                break;
            }
        }
        if (interfaceC0114c == null) {
            J j3 = new J((d0.d) this.f1452f.f1464d, abstractActivityC0159g);
            ((d0.d) this.f1452f.f1464d).e("androidx.lifecycle.internal.SavedStateHandlesProvider", j3);
            this.f1451e.a(new SavedStateHandleAttacher(j3));
        }
        ((d0.d) this.f1452f.f1464d).e("android:support:activity-result", new InterfaceC0114c() { // from class: androidx.activity.e
            @Override // d0.InterfaceC0114c
            public final Bundle a() {
                k kVar = abstractActivityC0159g;
                kVar.getClass();
                Bundle bundle = new Bundle();
                g gVar = kVar.f1456l;
                gVar.getClass();
                HashMap hashMap = gVar.f1488b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(gVar.f1489d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) gVar.g.clone());
                return bundle;
            }
        });
        g(new InterfaceC0101b() { // from class: androidx.activity.f
            @Override // b.InterfaceC0101b
            public final void a() {
                k kVar = abstractActivityC0159g;
                Bundle c = ((d0.d) kVar.f1452f.f1464d).c("android:support:activity-result");
                if (c != null) {
                    g gVar = kVar.f1456l;
                    gVar.getClass();
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    gVar.f1489d = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    Bundle bundle = c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = gVar.g;
                    bundle2.putAll(bundle);
                    for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                        String str2 = stringArrayList.get(i3);
                        HashMap hashMap = gVar.f1488b;
                        boolean containsKey = hashMap.containsKey(str2);
                        HashMap hashMap2 = gVar.f1487a;
                        if (containsKey) {
                            Integer num = (Integer) hashMap.remove(str2);
                            if (!bundle2.containsKey(str2)) {
                                hashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i3);
                        num2.intValue();
                        String str3 = stringArrayList.get(i3);
                        hashMap2.put(num2, str3);
                        hashMap.put(str3, num2);
                    }
                }
            }
        });
    }

    @Override // androidx.lifecycle.InterfaceC0091h
    public final V.b a() {
        V.c cVar = new V.c(V.a.f970b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f971a;
        if (application != null) {
            linkedHashMap.put(N.f2030a, getApplication());
        }
        linkedHashMap.put(I.f2021a, this);
        linkedHashMap.put(I.f2022b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(I.c, getIntent().getExtras());
        }
        return cVar;
    }

    @Override // d0.e
    public final d0.d b() {
        return (d0.d) this.f1452f.f1464d;
    }

    @Override // androidx.lifecycle.P
    public final O c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.g == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.g = iVar.f1445a;
            }
            if (this.g == null) {
                this.g = new O();
            }
        }
        return this.g;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1451e;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !u2.l.g(decorView, keyEvent)) {
            return u2.l.h(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !u2.l.g(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // J.InterfaceC0012k
    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(InterfaceC0101b interfaceC0101b) {
        C0100a c0100a = this.c;
        c0100a.getClass();
        if (c0100a.f2216b != null) {
            interfaceC0101b.a();
        }
        c0100a.f2215a.add(interfaceC0101b);
    }

    public final u h() {
        if (this.h == null) {
            this.h = new u(new F0.h(7, this));
            this.f1451e.a(new InterfaceC0099p() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.InterfaceC0099p
                public final void b(androidx.lifecycle.r rVar, EnumC0095l enumC0095l) {
                    if (enumC0095l != EnumC0095l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    u uVar = k.this.h;
                    OnBackInvokedDispatcher a3 = h.a((k) rVar);
                    uVar.getClass();
                    X1.g.e(a3, "invoker");
                    uVar.f1500e = a3;
                    uVar.c(uVar.g);
                }
            });
        }
        return this.h;
    }

    public final void i(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = G.c;
        I.b(this);
    }

    public final void j(Bundle bundle) {
        androidx.lifecycle.t tVar = this.f1449b;
        tVar.getClass();
        tVar.c("markState");
        tVar.g();
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f1456l.a(i3, i4, intent)) {
            return;
        }
        super.onActivityResult(i3, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        h().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1457m.iterator();
        while (it.hasNext()) {
            ((G.g) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1452f.d(bundle);
        C0100a c0100a = this.c;
        c0100a.getClass();
        c0100a.f2216b = this;
        Iterator it = c0100a.f2215a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0101b) it.next()).a();
        }
        i(bundle);
        int i3 = G.c;
        I.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1450d.c).iterator();
        if (!it.hasNext()) {
            return true;
        }
        X.d.q(it.next());
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1450d.c).iterator();
        if (!it.hasNext()) {
            return false;
        }
        X.d.q(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        super.onMultiWindowModeChanged(z3, configuration);
        Iterator it = this.f1460p.iterator();
        while (it.hasNext()) {
            ((G.g) it.next()).a(new d1.e(11));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f1459o.iterator();
        while (it.hasNext()) {
            ((G.g) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f1450d.c).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            throw null;
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        super.onPictureInPictureModeChanged(z3, configuration);
        Iterator it = this.f1461q.iterator();
        while (it.hasNext()) {
            ((G.g) it.next()).a(new d1.e(12));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i3, View view, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1450d.c).iterator();
        if (!it.hasNext()) {
            return true;
        }
        X.d.q(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (this.f1456l.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.activity.i] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        O o3 = this.g;
        if (o3 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            o3 = iVar.f1445a;
        }
        if (o3 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f1445a = o3;
        return obj;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.t tVar = this.f1451e;
        if (tVar instanceof androidx.lifecycle.t) {
            tVar.g();
        }
        j(bundle);
        this.f1452f.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f1458n.iterator();
        while (it.hasNext()) {
            ((G.g) it.next()).a(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (v0.f.z()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            l lVar = this.f1454j;
            synchronized (lVar.c) {
                try {
                    lVar.f1463b = true;
                    Iterator it = ((ArrayList) lVar.f1464d).iterator();
                    while (it.hasNext()) {
                        ((W1.a) it.next()).d();
                    }
                    ((ArrayList) lVar.f1464d).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        View decorView = getWindow().getDecorView();
        X1.g.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        X1.g.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        X1.g.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        X1.g.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        X1.g.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        j jVar = this.f1453i;
        if (!jVar.f1447d) {
            jVar.f1447d = true;
            decorView6.getViewTreeObserver().addOnDrawListener(jVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3) {
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6) {
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }
}
