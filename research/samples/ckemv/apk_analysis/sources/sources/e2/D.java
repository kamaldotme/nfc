package e2;

/* loaded from: classes.dex */
public final class D implements M {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2769b;

    public D(boolean z3) {
        this.f2769b = z3;
    }

    @Override // e2.M
    public final boolean b() {
        return this.f2769b;
    }

    @Override // e2.M
    public final b0 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f2769b ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
