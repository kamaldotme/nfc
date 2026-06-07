package androidx.emoji2.text;

import a.AbstractC0059a;
import a1.InterfaceFutureC0061a;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import m0.z;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1775b;
    public final /* synthetic */ Object c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1777e;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i3) {
        this.f1775b = i3;
        this.c = obj;
        this.f1776d = obj2;
        this.f1777e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        switch (this.f1775b) {
            case 0:
                A.h hVar = (A.h) this.c;
                z zVar = (z) this.f1776d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1777e;
                hVar.getClass();
                try {
                    q m3 = AbstractC0059a.m((Context) hVar.c);
                    if (m3 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) ((i) m3.f1367b);
                    synchronized (pVar.f1790e) {
                        pVar.g = threadPoolExecutor;
                    }
                    ((i) m3.f1367b).j(new l(zVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    zVar.T(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                n0.g gVar = (n0.g) this.c;
                InterfaceFutureC0061a interfaceFutureC0061a = (InterfaceFutureC0061a) this.f1776d;
                n0.u uVar = (n0.u) this.f1777e;
                gVar.getClass();
                try {
                    z3 = ((Boolean) interfaceFutureC0061a.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    z3 = true;
                }
                synchronized (gVar.f4185k) {
                    try {
                        v0.j k2 = u2.d.k(uVar.f4222d);
                        String str = k2.f5079a;
                        if (gVar.c(str) == uVar) {
                            gVar.b(str);
                        }
                        m0.r.a().getClass();
                        Iterator it = gVar.f4184j.iterator();
                        while (it.hasNext()) {
                            ((n0.c) it.next()).d(k2, z3);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
