package F0;

import J.B;
import J.T;
import L1.v;
import Z.C0037d;
import Z.C0040g;
import Z.C0041h;
import Z.C0042i;
import Z.C0045l;
import Z.D;
import Z.RunnableC0036c;
import Z.W;
import a.AbstractC0059a;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import androidx.activity.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AnimationAnimationListenerC0067d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k;
import androidx.fragment.app.I;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.Worker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f.C0150G;
import f0.C0167c;
import f0.C0173i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import k.C0288j;
import k.C0311u0;
import m.C0328b;
import m0.p;
import m0.r;
import m0.z;
import n0.u;
import u2.l;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f171b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i3, Object obj) {
        this.f171b = i3;
        this.c = obj;
    }

    public M1.h a() {
        a0.f fVar = (a0.f) this.c;
        M1.h hVar = new M1.h();
        Cursor n3 = fVar.f1390a.n(new d1.f("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (n3.moveToNext()) {
            try {
                hVar.add(Integer.valueOf(n3.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0059a.j(n3, th);
                    throw th2;
                }
            }
        }
        AbstractC0059a.j(n3, null);
        M1.h c = z.c(hVar);
        if (!c.f651b.isEmpty()) {
            if (((a0.f) this.c).g == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            C0173i c0173i = ((a0.f) this.c).g;
            if (c0173i == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            c0173i.b();
        }
        return c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        boolean z3;
        Set set;
        Object obj;
        C0288j c0288j;
        p2.a c;
        long j3;
        switch (this.f171b) {
            case 0:
                i iVar = (i) this.c;
                iVar.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) iVar.f175e;
                Q.e eVar = bottomSheetBehavior.f2291M;
                if (eVar != null && eVar.f()) {
                    iVar.a(iVar.f173b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2290L == 2) {
                        bottomSheetBehavior.C(iVar.f173b);
                        return;
                    }
                    return;
                }
            case 1:
                N.g gVar = (N.g) this.c;
                if (gVar.f670p) {
                    boolean z4 = gVar.f668n;
                    N.a aVar = gVar.f659b;
                    if (z4) {
                        gVar.f668n = false;
                        aVar.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f655e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f656f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.f657i) || !gVar.e()) {
                        gVar.f670p = false;
                        return;
                    }
                    boolean z5 = gVar.f669o;
                    View view = gVar.f660d;
                    if (z5) {
                        gVar.f669o = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f656f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a3 = aVar.a(currentAnimationTimeMillis2);
                    long j4 = currentAnimationTimeMillis2 - aVar.f656f;
                    aVar.f656f = currentAnimationTimeMillis2;
                    N.h.b(gVar.f672r, (int) (((float) j4) * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * aVar.f654d));
                    WeakHashMap weakHashMap = T.f402a;
                    B.m(view, this);
                    return;
                }
                return;
            case 2:
                ((Q.e) this.c).m(0);
                return;
            case 3:
                C0045l c0045l = (C0045l) this.c;
                int i4 = c0045l.f1294A;
                ValueAnimator valueAnimator = c0045l.f1318z;
                if (i4 != 1) {
                    i3 = 2;
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    i3 = 2;
                    valueAnimator.cancel();
                }
                c0045l.f1294A = 3;
                float[] fArr = new float[i3];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 4:
                RecyclerView recyclerView = (RecyclerView) this.c;
                D d3 = recyclerView.f2102I;
                if (d3 != null) {
                    C0042i c0042i = (C0042i) d3;
                    ArrayList arrayList = c0042i.h;
                    boolean z6 = !arrayList.isEmpty();
                    ArrayList arrayList2 = c0042i.f1281j;
                    boolean z7 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = c0042i.f1282k;
                    boolean z8 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = c0042i.f1280i;
                    boolean z9 = !arrayList4.isEmpty();
                    if (z6 || z7 || z9 || z8) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j5 = c0042i.f1150d;
                            if (hasNext) {
                                W w3 = (W) it.next();
                                View view2 = w3.f1205a;
                                ViewPropertyAnimator animate = view2.animate();
                                c0042i.f1288q.add(w3);
                                animate.setDuration(j5).alpha(0.0f).setListener(new C0037d(c0042i, w3, animate, view2)).start();
                            } else {
                                arrayList.clear();
                                if (z7) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0042i.f1284m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0036c runnableC0036c = new RunnableC0036c(c0042i, arrayList5, 0);
                                    if (z6) {
                                        View view3 = ((C0041h) arrayList5.get(0)).f1275a.f1205a;
                                        WeakHashMap weakHashMap2 = T.f402a;
                                        B.n(view3, runnableC0036c, j5);
                                    } else {
                                        runnableC0036c.run();
                                    }
                                }
                                if (z8) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0042i.f1285n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0036c runnableC0036c2 = new RunnableC0036c(c0042i, arrayList6, 1);
                                    if (z6) {
                                        View view4 = ((C0040g) arrayList6.get(0)).f1270a.f1205a;
                                        WeakHashMap weakHashMap3 = T.f402a;
                                        B.n(view4, runnableC0036c2, j5);
                                    } else {
                                        runnableC0036c2.run();
                                    }
                                }
                                if (z9) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0042i.f1283l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0036c runnableC0036c3 = new RunnableC0036c(c0042i, arrayList7, 2);
                                    if (z6 || z7 || z8) {
                                        if (!z6) {
                                            j5 = 0;
                                        }
                                        long max = Math.max(z7 ? c0042i.f1151e : 0L, z8 ? c0042i.f1152f : 0L) + j5;
                                        View view5 = ((W) arrayList7.get(0)).f1205a;
                                        WeakHashMap weakHashMap4 = T.f402a;
                                        B.n(view5, runnableC0036c3, max);
                                    } else {
                                        runnableC0036c3.run();
                                    }
                                }
                            }
                        }
                    }
                    z3 = false;
                } else {
                    z3 = false;
                }
                recyclerView.f2131j0 = z3;
                return;
            case 5:
                ((StaggeredGridLayoutManager) this.c).y0();
                return;
            case 6:
                ReentrantReadWriteLock.ReadLock readLock = ((a0.f) this.c).f1390a.h.readLock();
                X1.g.d(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                    } finally {
                        readLock.unlock();
                        ((a0.f) this.c).getClass();
                    }
                } catch (SQLiteException unused) {
                    set = v.f624b;
                } catch (IllegalStateException unused2) {
                    set = v.f624b;
                }
                if (((a0.f) this.c).a() && ((a0.f) this.c).f1393e.compareAndSet(true, false) && !((a0.f) this.c).f1390a.h().s().G()) {
                    C0167c s3 = ((a0.f) this.c).f1390a.h().s();
                    s3.b();
                    try {
                        set = a();
                        s3.M();
                        if (!set.isEmpty()) {
                            a0.f fVar = (a0.f) this.c;
                            synchronized (fVar.f1395i) {
                                Iterator it2 = fVar.f1395i.iterator();
                                while (true) {
                                    C0328b c0328b = (C0328b) it2;
                                    if (c0328b.hasNext()) {
                                        ((a0.e) ((Map.Entry) c0328b.next()).getValue()).a(set);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                        s3.o();
                    }
                }
                return;
            case 7:
                try {
                    k.f((k) this.c);
                    return;
                } catch (IllegalStateException e3) {
                    if (!TextUtils.equals(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e3;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!TextUtils.equals(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
            case 8:
                AnimationAnimationListenerC0067d animationAnimationListenerC0067d = (AnimationAnimationListenerC0067d) this.c;
                animationAnimationListenerC0067d.f1916a.endViewTransition(animationAnimationListenerC0067d.f1917b);
                animationAnimationListenerC0067d.c.d();
                return;
            case 9:
                I.a((ArrayList) this.c, 4);
                return;
            case 10:
                DialogInterfaceOnCancelListenerC0074k dialogInterfaceOnCancelListenerC0074k = (DialogInterfaceOnCancelListenerC0074k) this.c;
                dialogInterfaceOnCancelListenerC0074k.f1931V.onDismiss(dialogInterfaceOnCancelListenerC0074k.f1939d0);
                return;
            case 11:
                ((androidx.fragment.app.B) this.c).w(true);
                return;
            case 12:
                synchronized (((y) this.c).f2063a) {
                    obj = ((y) this.c).f2067f;
                    ((y) this.c).f2067f = y.f2062k;
                }
                ((y) this.c).e(obj);
                return;
            case 13:
                C0311u0 c0311u0 = (C0311u0) this.c;
                c0311u0.f3788m = null;
                c0311u0.drawableStateChanged();
                return;
            case 14:
                ActionMenuView actionMenuView = ((Toolbar) this.c).f1655b;
                if (actionMenuView == null || (c0288j = actionMenuView.f1583u) == null) {
                    return;
                }
                c0288j.l();
                return;
            case 15:
                Worker worker = (Worker) this.c;
                try {
                    worker.f2184f.j(worker.f());
                    return;
                } catch (Throwable th) {
                    worker.f2184f.k(th);
                    return;
                }
            case 16:
                u uVar = (u) this.c;
                try {
                    try {
                        p pVar = (p) uVar.f4233q.get();
                        if (pVar == null) {
                            r a4 = r.a();
                            int i5 = u.f4220s;
                            String str = uVar.f4222d.c;
                            a4.getClass();
                        } else {
                            r a5 = r.a();
                            int i6 = u.f4220s;
                            String str2 = uVar.f4222d.c;
                            pVar.toString();
                            a5.getClass();
                            uVar.g = pVar;
                        }
                    } catch (Throwable th2) {
                        uVar.b();
                        throw th2;
                    }
                } catch (InterruptedException | ExecutionException unused3) {
                    r a6 = r.a();
                    int i7 = u.f4220s;
                    a6.getClass();
                } catch (CancellationException unused4) {
                    r a7 = r.a();
                    int i8 = u.f4220s;
                    a7.getClass();
                }
                uVar.b();
                return;
        }
        while (true) {
            p2.d dVar = (p2.d) this.c;
            synchronized (dVar) {
                c = dVar.c();
            }
            if (c == null) {
                return;
            }
            p2.c cVar = c.c;
            X1.g.b(cVar);
            p2.d dVar2 = (p2.d) this.c;
            boolean isLoggable = p2.d.f4362i.isLoggable(Level.FINE);
            if (isLoggable) {
                cVar.f4357a.f4363a.getClass();
                j3 = System.nanoTime();
                l.a(c, cVar, "starting");
            } else {
                j3 = -1;
            }
            try {
                p2.d.a(dVar2, c);
                if (isLoggable) {
                    cVar.f4357a.f4363a.getClass();
                    l.a(c, cVar, "finished run in ".concat(l.i(System.nanoTime() - j3)));
                }
            } catch (Throwable th3) {
                try {
                    C0150G c0150g = dVar2.f4363a;
                    c0150g.getClass();
                    ((ThreadPoolExecutor) c0150g.f2846b).execute(this);
                    throw th3;
                } catch (Throwable th4) {
                    if (isLoggable) {
                        cVar.f4357a.f4363a.getClass();
                        l.a(c, cVar, "failed a run in ".concat(l.i(System.nanoTime() - j3)));
                    }
                    throw th4;
                }
            }
        }
    }

    public h(u uVar, String str) {
        this.f171b = 16;
        this.c = uVar;
    }
}
