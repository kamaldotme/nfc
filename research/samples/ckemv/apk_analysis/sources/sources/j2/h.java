package j2;

import e2.A;
import e2.AbstractC0139v;
import e2.C0131m;
import e2.C0132n;
import e2.I;
import e2.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h extends A implements Q1.c, O1.d {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3518i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e, reason: collision with root package name */
    public final e2.r f3519e;

    /* renamed from: f, reason: collision with root package name */
    public final O1.d f3520f;
    public Object g;
    public final Object h;

    public h(e2.r rVar, Q1.b bVar) {
        super(-1);
        this.f3519e = rVar;
        this.f3520f = bVar;
        this.g = a.c;
        O1.i iVar = bVar.c;
        X1.g.b(iVar);
        this.h = a.m(iVar);
    }

    @Override // e2.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0132n) {
            ((C0132n) obj).f2817b.h(cancellationException);
        }
    }

    @Override // O1.d
    public final void c(Object obj) {
        O1.d dVar = this.f3520f;
        O1.i j3 = dVar.j();
        Throwable a3 = K1.e.a(obj);
        Object c0131m = a3 == null ? obj : new C0131m(a3, false);
        e2.r rVar = this.f3519e;
        if (rVar.K()) {
            this.g = c0131m;
            this.f2766d = 0;
            rVar.I(j3, this);
            return;
        }
        I a4 = h0.a();
        if (a4.P()) {
            this.g = c0131m;
            this.f2766d = 0;
            a4.M(this);
            return;
        }
        a4.O(true);
        try {
            O1.i j4 = dVar.j();
            Object n3 = a.n(j4, this.h);
            try {
                dVar.c(obj);
                do {
                } while (a4.Q());
            } finally {
                a.h(j4, n3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // e2.A
    public final O1.d d() {
        return this;
    }

    @Override // Q1.c
    public final Q1.c f() {
        O1.d dVar = this.f3520f;
        if (dVar instanceof Q1.c) {
            return (Q1.c) dVar;
        }
        return null;
    }

    @Override // e2.A
    public final Object i() {
        Object obj = this.g;
        this.g = a.c;
        return obj;
    }

    @Override // O1.d
    public final O1.i j() {
        return this.f3520f.j();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3519e + ", " + AbstractC0139v.n(this.f3520f) + ']';
    }
}
