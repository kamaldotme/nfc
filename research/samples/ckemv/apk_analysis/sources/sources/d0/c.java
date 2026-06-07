package D0;

import A.h;
import G.g;
import J.B;
import J.T;
import O1.j;
import Q.e;
import a1.InterfaceFutureC0061a;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import androidx.work.Worker;
import com.google.android.material.behavior.SwipeDismissBehavior;
import e2.AbstractC0139v;
import e2.C0124f;
import e2.InterfaceC0123e;
import e2.K;
import e2.r;
import f.ExecutorC0145B;
import f2.d;
import j2.i;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.WeakHashMap;
import n0.u;
import o0.C0351a;
import r0.k;
import u0.C0393c;
import v0.o;
import w0.s;
import w0.t;
import x.AbstractC0416f;
import x.C0415e;
import x0.C0422a;
import x0.C0432k;
import z.AbstractC0452b;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f140b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f141d;

    public /* synthetic */ c(Object obj, int i3, Object obj2) {
        this.f140b = i3;
        this.c = obj;
        this.f141d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [x0.k, java.lang.Object, a1.a] */
    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        switch (this.f140b) {
            case 0:
                e eVar = ((SwipeDismissBehavior) this.f141d).f2275a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = T.f402a;
                B.m((View) this.c, this);
                return;
            case 1:
                AbstractC0452b abstractC0452b = (AbstractC0452b) ((h) this.c).c;
                if (abstractC0452b != null) {
                    abstractC0452b.h((Typeface) this.f141d);
                    return;
                }
                return;
            case 2:
                ((g) this.c).a(this.f141d);
                return;
            case 3:
                ((C0124f) ((InterfaceC0123e) this.f141d)).z((r) this.c);
                return;
            case 4:
                ((C0124f) ((InterfaceC0123e) this.c)).z((d) this.f141d);
                return;
            case 5:
                int i3 = 0;
                while (true) {
                    try {
                        ((Runnable) this.c).run();
                    } catch (Throwable th) {
                        AbstractC0139v.h(j.f782b, th);
                    }
                    i iVar = (i) this.f141d;
                    Runnable L2 = iVar.L();
                    if (L2 == null) {
                        return;
                    }
                    this.c = L2;
                    i3++;
                    if (i3 >= 16) {
                        r rVar = iVar.f3522d;
                        if (rVar.K()) {
                            rVar.I(iVar, this);
                            return;
                        }
                    }
                }
            case 6:
                try {
                    ((Worker) this.f141d).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th2) {
                    ((C0432k) this.c).k(th2);
                    return;
                }
            case 7:
                if (((u) this.f141d).f4233q.f5210a instanceof C0422a) {
                    return;
                }
                try {
                    ((InterfaceFutureC0061a) this.c).get();
                    m0.r a3 = m0.r.a();
                    int i4 = u.f4220s;
                    String str = ((u) this.f141d).f4222d.c;
                    a3.getClass();
                    u uVar = (u) this.f141d;
                    uVar.f4233q.l(uVar.f4223e.d());
                    return;
                } catch (Throwable th3) {
                    ((u) this.f141d).f4233q.k(th3);
                    return;
                }
            case 8:
                m0.r a4 = m0.r.a();
                int i5 = C0351a.f4270e;
                o oVar2 = (o) this.c;
                String str2 = oVar2.f5091a;
                a4.getClass();
                ((C0351a) this.f141d).f4271a.e(oVar2);
                return;
            case 9:
                n0.g gVar = ((C0393c) this.f141d).f5017b.f4210i;
                String str3 = (String) this.c;
                synchronized (gVar.f4185k) {
                    try {
                        u c = gVar.c(str3);
                        oVar = c != null ? c.f4222d : null;
                    } finally {
                    }
                }
                if (oVar == null || !oVar.b()) {
                    return;
                }
                synchronized (((C0393c) this.f141d).f5018d) {
                    ((C0393c) this.f141d).g.put(u2.d.k(oVar), oVar);
                    C0393c c0393c = (C0393c) this.f141d;
                    ((C0393c) this.f141d).h.put(u2.d.k(oVar), k.a(c0393c.f5021i, oVar, (K) c0393c.c.c, c0393c));
                }
                return;
            case 10:
                try {
                    ((Runnable) this.f141d).run();
                    synchronized (((ExecutorC0145B) this.c).f2837f) {
                        ((ExecutorC0145B) this.c).a();
                    }
                    return;
                } catch (Throwable th4) {
                    synchronized (((ExecutorC0145B) this.c).f2837f) {
                        ((ExecutorC0145B) this.c).a();
                        throw th4;
                    }
                }
            case 11:
                if (((w0.r) this.f141d).f5165b.f5210a instanceof C0422a) {
                    return;
                }
                try {
                    m0.h hVar = (m0.h) ((C0432k) this.c).get();
                    if (hVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((w0.r) this.f141d).f5166d.c + ") but did not provide ForegroundInfo");
                    }
                    m0.r a5 = m0.r.a();
                    int i6 = w0.r.h;
                    String str4 = ((w0.r) this.f141d).f5166d.c;
                    a5.getClass();
                    w0.r rVar2 = (w0.r) this.f141d;
                    C0432k c0432k = rVar2.f5165b;
                    m0.i iVar2 = rVar2.f5168f;
                    Context context = rVar2.c;
                    UUID uuid = rVar2.f5167e.c.f2185a;
                    t tVar = (t) iVar2;
                    tVar.getClass();
                    ?? obj = new Object();
                    tVar.f5173a.f(new s(tVar, obj, uuid, hVar, context));
                    c0432k.l(obj);
                    return;
                } catch (Throwable th5) {
                    ((w0.r) this.f141d).f5165b.k(th5);
                    return;
                }
            case 12:
                ((C0415e) this.c).f5182a = this.f141d;
                return;
            case 13:
                ((Application) this.c).unregisterActivityLifecycleCallbacks((C0415e) this.f141d);
                return;
            default:
                try {
                    Method method = AbstractC0416f.f5189d;
                    Object obj2 = this.f141d;
                    Object obj3 = this.c;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0416f.f5190e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e3) {
                    if (e3.getClass() == RuntimeException.class && e3.getMessage() != null && e3.getMessage().startsWith("Unable to stop")) {
                        throw e3;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, int i3, boolean z3) {
        this.f140b = i3;
        this.f141d = obj;
        this.c = obj2;
    }

    public c(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f140b = 0;
        this.f141d = swipeDismissBehavior;
        this.c = view;
    }
}
