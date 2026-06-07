package i2;

/* loaded from: classes.dex */
public final class s implements O1.d, Q1.c {

    /* renamed from: b, reason: collision with root package name */
    public final O1.d f3234b;
    public final O1.i c;

    public s(O1.d dVar, O1.i iVar) {
        this.f3234b = dVar;
        this.c = iVar;
    }

    @Override // O1.d
    public final void c(Object obj) {
        this.f3234b.c(obj);
    }

    @Override // Q1.c
    public final Q1.c f() {
        O1.d dVar = this.f3234b;
        if (dVar instanceof Q1.c) {
            return (Q1.c) dVar;
        }
        return null;
    }

    @Override // O1.d
    public final O1.i j() {
        return this.c;
    }
}
