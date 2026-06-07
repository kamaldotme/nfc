package e1;

import i1.C0187b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends C0187b {

    /* renamed from: p, reason: collision with root package name */
    public static final e f2699p = new e();

    /* renamed from: q, reason: collision with root package name */
    public static final b1.r f2700q = new b1.r("closed");

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2701m;

    /* renamed from: n, reason: collision with root package name */
    public String f2702n;

    /* renamed from: o, reason: collision with root package name */
    public b1.n f2703o;

    public f() {
        super(f2699p);
        this.f2701m = new ArrayList();
        this.f2703o = b1.p.f2230b;
    }

    @Override // i1.C0187b
    public final void A() {
        ArrayList arrayList = this.f2701m;
        if (arrayList.isEmpty() || this.f2702n != null) {
            throw new IllegalStateException();
        }
        if (!(T() instanceof b1.m)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // i1.C0187b
    public final void D() {
        ArrayList arrayList = this.f2701m;
        if (arrayList.isEmpty() || this.f2702n != null) {
            throw new IllegalStateException();
        }
        if (!(T() instanceof b1.q)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // i1.C0187b
    public final void G(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f2701m.isEmpty() || this.f2702n != null) {
            throw new IllegalStateException();
        }
        if (!(T() instanceof b1.q)) {
            throw new IllegalStateException();
        }
        this.f2702n = str;
    }

    @Override // i1.C0187b
    public final C0187b J() {
        U(b1.p.f2230b);
        return this;
    }

    @Override // i1.C0187b
    public final void M(double d3) {
        if (this.f3197f || !(Double.isNaN(d3) || Double.isInfinite(d3))) {
            U(new b1.r(Double.valueOf(d3)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d3);
        }
    }

    @Override // i1.C0187b
    public final void N(long j3) {
        U(new b1.r(Long.valueOf(j3)));
    }

    @Override // i1.C0187b
    public final void O(Boolean bool) {
        if (bool == null) {
            U(b1.p.f2230b);
        } else {
            U(new b1.r(bool));
        }
    }

    @Override // i1.C0187b
    public final void P(Number number) {
        if (number == null) {
            U(b1.p.f2230b);
            return;
        }
        if (!this.f3197f) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        U(new b1.r(number));
    }

    @Override // i1.C0187b
    public final void Q(String str) {
        if (str == null) {
            U(b1.p.f2230b);
        } else {
            U(new b1.r(str));
        }
    }

    @Override // i1.C0187b
    public final void R(boolean z3) {
        U(new b1.r(Boolean.valueOf(z3)));
    }

    public final b1.n T() {
        return (b1.n) this.f2701m.get(r0.size() - 1);
    }

    public final void U(b1.n nVar) {
        if (this.f2702n != null) {
            if (!(nVar instanceof b1.p) || this.f3198i) {
                b1.q qVar = (b1.q) T();
                qVar.f2231b.put(this.f2702n, nVar);
            }
            this.f2702n = null;
            return;
        }
        if (this.f2701m.isEmpty()) {
            this.f2703o = nVar;
            return;
        }
        b1.n T2 = T();
        if (!(T2 instanceof b1.m)) {
            throw new IllegalStateException();
        }
        ((b1.m) T2).f2229b.add(nVar);
    }

    @Override // i1.C0187b
    public final void b() {
        b1.m mVar = new b1.m();
        U(mVar);
        this.f2701m.add(mVar);
    }

    @Override // i1.C0187b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f2701m;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f2700q);
    }

    @Override // i1.C0187b, java.io.Flushable
    public final void flush() {
    }

    @Override // i1.C0187b
    public final void i() {
        b1.q qVar = new b1.q();
        U(qVar);
        this.f2701m.add(qVar);
    }
}
