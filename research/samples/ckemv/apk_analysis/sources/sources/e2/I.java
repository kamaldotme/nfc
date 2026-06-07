package e2;

/* loaded from: classes.dex */
public abstract class I extends r {

    /* renamed from: d, reason: collision with root package name */
    public long f2774d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2775e;

    /* renamed from: f, reason: collision with root package name */
    public L1.i f2776f;

    public final void L() {
        long j3 = this.f2774d - 4294967296L;
        this.f2774d = j3;
        if (j3 <= 0 && this.f2775e) {
            S();
        }
    }

    public final void M(A a3) {
        L1.i iVar = this.f2776f;
        if (iVar == null) {
            iVar = new L1.i();
            this.f2776f = iVar;
        }
        iVar.c(a3);
    }

    public abstract Thread N();

    public final void O(boolean z3) {
        this.f2774d = (z3 ? 4294967296L : 1L) + this.f2774d;
        if (z3) {
            return;
        }
        this.f2775e = true;
    }

    public final boolean P() {
        return this.f2774d >= 4294967296L;
    }

    public final boolean Q() {
        L1.i iVar = this.f2776f;
        if (iVar == null) {
            return false;
        }
        A a3 = (A) (iVar.isEmpty() ? null : iVar.h());
        if (a3 == null) {
            return false;
        }
        a3.run();
        return true;
    }

    public void R(long j3, F f3) {
        RunnableC0140w.f2829j.X(j3, f3);
    }

    public abstract void S();
}
