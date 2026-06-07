package e2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class F implements Runnable, Comparable, C {
    private volatile Object _heap;

    /* renamed from: b, reason: collision with root package name */
    public long f2772b;
    public int c;

    public final j2.y a() {
        Object obj = this._heap;
        if (obj instanceof j2.y) {
            return (j2.y) obj;
        }
        return null;
    }

    public final int b(long j3, G g, H h) {
        synchronized (this) {
            if (this._heap == AbstractC0139v.f2823b) {
                return 2;
            }
            synchronized (g) {
                try {
                    F[] fArr = g.f3547a;
                    F f3 = fArr != null ? fArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H.g;
                    h.getClass();
                    if (H.f2773i.get(h) != 0) {
                        return 1;
                    }
                    if (f3 == null) {
                        g.c = j3;
                    } else {
                        long j4 = f3.f2772b;
                        if (j4 - j3 < 0) {
                            j3 = j4;
                        }
                        if (j3 - g.c > 0) {
                            g.c = j3;
                        }
                    }
                    long j5 = this.f2772b;
                    long j6 = g.c;
                    if (j5 - j6 < 0) {
                        this.f2772b = j6;
                    }
                    g.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(G g) {
        if (this._heap == AbstractC0139v.f2823b) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f2772b - ((F) obj).f2772b;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    @Override // e2.C
    public final void f() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                d1.f fVar = AbstractC0139v.f2823b;
                if (obj == fVar) {
                    return;
                }
                G g = obj instanceof G ? (G) obj : null;
                if (g != null) {
                    synchronized (g) {
                        if (a() != null) {
                            g.b(this.c);
                        }
                    }
                }
                this._heap = fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f2772b + ']';
    }
}
