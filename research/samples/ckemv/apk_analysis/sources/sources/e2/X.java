package e2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class X implements M {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(X.class, "_isCompleting");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2787d = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_rootCause");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2788e = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f2789b;

    public X(b0 b0Var, Throwable th) {
        this.f2789b = b0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable d3 = d();
        if (d3 == null) {
            f2787d.set(this, th);
            return;
        }
        if (th == d3) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2788e;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // e2.M
    public final boolean b() {
        return d() == null;
    }

    @Override // e2.M
    public final b0 c() {
        return this.f2789b;
    }

    public final Throwable d() {
        return (Throwable) f2787d.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final boolean f() {
        return c.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2788e;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable d3 = d();
        if (d3 != null) {
            arrayList.add(0, d3);
        }
        if (th != null && !X1.g.a(th, d3)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0139v.h);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + f2788e.get(this) + ", list=" + this.f2789b + ']';
    }
}
