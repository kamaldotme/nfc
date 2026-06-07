package f2;

import O1.i;
import X1.g;
import android.os.Handler;
import android.os.Looper;
import e2.B;
import e2.C0124f;
import e2.C0136s;
import e2.InterfaceC0142y;
import e2.Q;
import e2.r;
import j2.o;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class d extends r implements InterfaceC0142y {
    private volatile d _immediate;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3027d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3028e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3029f;
    public final d g;

    public d(Handler handler, String str, boolean z3) {
        this.f3027d = handler;
        this.f3028e = str;
        this.f3029f = z3;
        this._immediate = z3 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.g = dVar;
    }

    @Override // e2.InterfaceC0142y
    public final void G(long j3, C0124f c0124f) {
        D0.c cVar = new D0.c(c0124f, 4, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f3027d.postDelayed(cVar, j3)) {
            c0124f.t(new c(this, cVar));
        } else {
            L(c0124f.f2802f, cVar);
        }
    }

    @Override // e2.r
    public final void I(i iVar, Runnable runnable) {
        if (this.f3027d.post(runnable)) {
            return;
        }
        L(iVar, runnable);
    }

    @Override // e2.r
    public final boolean K() {
        return (this.f3029f && g.a(Looper.myLooper(), this.f3027d.getLooper())) ? false : true;
    }

    public final void L(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        Q q3 = (Q) iVar.A(C0136s.c);
        if (q3 != null) {
            q3.a(cancellationException);
        }
        B.f2768b.I(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f3027d == this.f3027d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3027d);
    }

    @Override // e2.r
    public final String toString() {
        d dVar;
        String str;
        l2.d dVar2 = B.f2767a;
        d dVar3 = o.f3534a;
        if (this == dVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar3.g;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f3028e;
        if (str2 == null) {
            str2 = this.f3027d.toString();
        }
        return this.f3029f ? X.d.h(str2, ".immediate") : str2;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
