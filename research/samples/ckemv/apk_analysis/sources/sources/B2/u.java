package B2;

import X0.C0033e;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0095l;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e2.K;
import e2.Q;
import f.C0150G;
import f.DialogC0158f;
import f.ExecutorC0146C;
import j.C0209o;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import k.i1;
import m0.B;
import m0.z;
import x.AbstractC0416f;
import x.C0415e;
import x0.C0422a;
import x0.C0432k;
import z0.AbstractC0466a;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f100b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i3, Object obj) {
        this.f100b = i3;
        this.c = obj;
    }

    private final void a() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.c;
        X1.g.e(constraintTrackingWorker, "this$0");
        if (constraintTrackingWorker.f2213i.f5210a instanceof C0422a) {
            return;
        }
        Object obj = constraintTrackingWorker.c.f2186b.f3973a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        X1.g.d(m0.r.a(), "get()");
        if (str == null || str.length() == 0) {
            int i3 = AbstractC0466a.f5312a;
            C0432k c0432k = constraintTrackingWorker.f2213i;
            X1.g.d(c0432k, "future");
            c0432k.j(new m0.m());
            return;
        }
        B b3 = constraintTrackingWorker.c.f2188e;
        Context context = constraintTrackingWorker.f3980b;
        WorkerParameters workerParameters = constraintTrackingWorker.f2212f;
        b3.getClass();
        m0.q a3 = B.a(context, str, workerParameters);
        constraintTrackingWorker.f2214j = a3;
        if (a3 == null) {
            int i4 = AbstractC0466a.f5312a;
            C0432k c0432k2 = constraintTrackingWorker.f2213i;
            X1.g.d(c0432k2, "future");
            c0432k2.j(new m0.m());
            return;
        }
        n0.s p02 = n0.s.p0(constraintTrackingWorker.f3980b);
        v0.p u3 = p02.f4209f.u();
        String uuid = constraintTrackingWorker.c.f2185a.toString();
        X1.g.d(uuid, "id.toString()");
        v0.o i5 = u3.i(uuid);
        if (i5 == null) {
            C0432k c0432k3 = constraintTrackingWorker.f2213i;
            X1.g.d(c0432k3, "future");
            int i6 = AbstractC0466a.f5312a;
            c0432k3.j(new m0.m());
            return;
        }
        v0.i iVar = p02.f4214m;
        X1.g.d(iVar, "workManagerImpl.trackers");
        C0150G c0150g = new C0150G(iVar);
        K k2 = (K) p02.g.c;
        X1.g.d(k2, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
        constraintTrackingWorker.f2213i.a(new u(16, r0.k.a(c0150g, i5, k2, constraintTrackingWorker)), new ExecutorC0146C(1));
        if (!c0150g.k(i5)) {
            int i7 = AbstractC0466a.f5312a;
            C0432k c0432k4 = constraintTrackingWorker.f2213i;
            X1.g.d(c0432k4, "future");
            c0432k4.j(new Object());
            return;
        }
        int i8 = AbstractC0466a.f5312a;
        try {
            m0.q qVar = constraintTrackingWorker.f2214j;
            X1.g.b(qVar);
            C0432k d3 = qVar.d();
            X1.g.d(d3, "delegate!!.startWork()");
            d3.a(new I1.k(constraintTrackingWorker, 8, d3), constraintTrackingWorker.c.c);
        } catch (Throwable unused) {
            int i9 = AbstractC0466a.f5312a;
            synchronized (constraintTrackingWorker.g) {
                try {
                    if (constraintTrackingWorker.h) {
                        C0432k c0432k5 = constraintTrackingWorker.f2213i;
                        X1.g.d(c0432k5, "future");
                        c0432k5.j(new Object());
                    } else {
                        C0432k c0432k6 = constraintTrackingWorker.f2213i;
                        X1.g.d(c0432k6, "future");
                        c0432k6.j(new m0.m());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Boolean, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Handler handler;
        C0415e c0415e;
        Application application;
        Application application2;
        int i3 = 13;
        boolean z3 = true;
        switch (this.f100b) {
            case 0:
                w wVar = (w) this.c;
                X1.g.e(wVar, "this$0");
                while (wVar.f107d) {
                    Iterator it = wVar.c.iterator();
                    while (it.hasNext()) {
                        v vVar = (v) it.next();
                        float f3 = vVar.f101a + vVar.f103d;
                        vVar.f101a = f3;
                        vVar.f102b += vVar.f104e;
                        float f4 = vVar.c;
                        if (f3 - f4 < 0.0f || f3 + f4 > wVar.getWidth()) {
                            vVar.f103d *= -1;
                        }
                        float f5 = vVar.f102b;
                        if (f5 - f4 < 0.0f || f5 + f4 > wVar.getHeight()) {
                            vVar.f104e *= -1;
                        }
                    }
                    wVar.postInvalidate();
                    Thread.sleep(16L);
                }
                return;
            case 1:
                I1.g.a((I1.g) ((A.h) this.c).c);
                return;
            case 2:
                View view = (View) this.c;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 3:
                J1.b bVar = ((J1.a) this.c).f542a;
                bVar.f544b = false;
                bVar.a();
                return;
            case 4:
                F0.i iVar = (F0.i) this.c;
                iVar.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) iVar.f175e;
                Q.e eVar = sideSheetBehavior.f2465i;
                if (eVar != null && eVar.f()) {
                    iVar.a(iVar.f173b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(iVar.f173b);
                        return;
                    }
                    return;
                }
            case 5:
                ((C0033e) this.c).t(true);
                return;
            case 6:
                X0.k kVar = (X0.k) this.c;
                boolean isPopupShowing = kVar.h.isPopupShowing();
                kVar.t(isPopupShowing);
                kVar.f1049m = isPopupShowing;
                return;
            case 7:
                androidx.activity.j jVar = (androidx.activity.j) this.c;
                Runnable runnable = jVar.c;
                if (runnable != null) {
                    runnable.run();
                    jVar.c = null;
                    return;
                }
                return;
            case 8:
                DialogC0158f.a((DialogC0158f) this.c);
                return;
            case 9:
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.c;
                synchronized (pVar.f1790e) {
                    try {
                        if (pVar.f1792i == null) {
                            return;
                        }
                        try {
                            G.j c = pVar.c();
                            int i4 = c.f200e;
                            if (i4 == 2) {
                                synchronized (pVar.f1790e) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                int i5 = F.k.f158a;
                                F.j.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                U0.e eVar2 = pVar.f1789d;
                                Context context = pVar.f1788b;
                                eVar2.getClass();
                                Typeface s3 = A.i.f9a.s(context, new G.j[]{c}, 0);
                                MappedByteBuffer u3 = u2.d.u(pVar.f1788b, c.f197a);
                                if (u3 == null || s3 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    F.j.a("EmojiCompat.MetadataRepo.create");
                                    v0.i iVar2 = new v0.i(s3, u2.d.y(u3));
                                    F.j.b();
                                    F.j.b();
                                    synchronized (pVar.f1790e) {
                                        try {
                                            z zVar = pVar.f1792i;
                                            if (zVar != null) {
                                                zVar.U(iVar2);
                                            }
                                        } finally {
                                        }
                                    }
                                    pVar.a();
                                    return;
                                } finally {
                                    int i6 = F.k.f158a;
                                    F.j.b();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (pVar.f1790e) {
                                try {
                                    z zVar2 = pVar.f1792i;
                                    if (zVar2 != null) {
                                        zVar2.T(th2);
                                    }
                                    pVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 10:
                D d3 = (D) this.c;
                X1.g.e(d3, "this$0");
                int i7 = d3.c;
                androidx.lifecycle.t tVar = d3.g;
                if (i7 == 0) {
                    d3.f2015d = true;
                    tVar.d(EnumC0095l.ON_PAUSE);
                }
                if (d3.f2014b == 0 && d3.f2015d) {
                    tVar.d(EnumC0095l.ON_STOP);
                    d3.f2016e = true;
                    return;
                }
                return;
            case 11:
                ((com.google.android.material.timepicker.e) this.c).f();
                return;
            case 12:
                i1 i1Var = ((Toolbar) this.c).f1649L;
                C0209o c0209o = i1Var != null ? i1Var.c : null;
                if (c0209o != null) {
                    c0209o.collapseActionView();
                    return;
                }
                return;
            case 13:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.c;
                X1.g.e(coroutineWorker, "this$0");
                if (coroutineWorker.g.f5210a instanceof C0422a) {
                    coroutineWorker.f2183f.a(null);
                    return;
                }
                return;
            case 14:
                Activity activity = (Activity) this.c;
                if (activity.isFinishing()) {
                    return;
                }
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 28) {
                    Class cls = AbstractC0416f.f5187a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0416f.f5187a;
                if (i8 != 26 && i8 != 27) {
                    z3 = false;
                }
                Method method = AbstractC0416f.f5191f;
                if ((!z3 || method != null) && (AbstractC0416f.f5190e != null || AbstractC0416f.f5189d != null)) {
                    try {
                        Object obj2 = AbstractC0416f.c.get(activity);
                        if (obj2 != null && (obj = AbstractC0416f.f5188b.get(activity)) != null) {
                            Application application3 = activity.getApplication();
                            C0415e c0415e2 = new C0415e(activity);
                            application3.registerActivityLifecycleCallbacks(c0415e2);
                            Handler handler2 = AbstractC0416f.g;
                            handler2.post(new D0.c(c0415e2, 12, obj2));
                            try {
                                if (i8 == 26 || i8 == 27) {
                                    ?? r17 = Boolean.FALSE;
                                    handler = handler2;
                                    handler2 = r17;
                                    c0415e = c0415e2;
                                    c0415e2 = null;
                                    application2 = application3;
                                    application3 = null;
                                    try {
                                        method.invoke(obj, obj2, null, null, 0, handler2, null, null, r17, r17);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        application = application2;
                                        handler.post(new D0.c(application, i3, c0415e));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                    handler = handler2;
                                    c0415e = c0415e2;
                                    application2 = application3;
                                }
                                handler.post(new D0.c(application2, i3, c0415e));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                handler = handler2;
                                c0415e = c0415e2;
                                application = application3;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 15:
                a();
                return;
            default:
                Q q3 = (Q) this.c;
                X1.g.e(q3, "$job");
                q3.a(null);
                return;
        }
    }
}
