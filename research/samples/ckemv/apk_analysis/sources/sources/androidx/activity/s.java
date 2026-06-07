package androidx.activity;

/* loaded from: classes.dex */
public final class s implements c {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.v f1495b;
    public final /* synthetic */ u c;

    public s(u uVar, androidx.fragment.app.v vVar) {
        this.c = uVar;
        this.f1495b = vVar;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        u uVar = this.c;
        L1.i iVar = uVar.f1498b;
        androidx.fragment.app.v vVar = this.f1495b;
        iVar.remove(vVar);
        if (X1.g.a(uVar.c, vVar)) {
            vVar.getClass();
            uVar.c = null;
        }
        vVar.getClass();
        vVar.f2006b.remove(this);
        W1.a aVar = vVar.c;
        if (aVar != null) {
            aVar.d();
        }
        vVar.c = null;
    }
}
