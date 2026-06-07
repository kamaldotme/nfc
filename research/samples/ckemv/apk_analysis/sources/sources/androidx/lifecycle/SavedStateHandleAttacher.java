package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0099p {

    /* renamed from: b, reason: collision with root package name */
    public final J f2034b;

    public SavedStateHandleAttacher(J j3) {
        this.f2034b = j3;
    }

    @Override // androidx.lifecycle.InterfaceC0099p
    public final void b(r rVar, EnumC0095l enumC0095l) {
        if (enumC0095l != EnumC0095l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0095l).toString());
        }
        rVar.d().f(this);
        J j3 = this.f2034b;
        if (j3.f2024b) {
            return;
        }
        j3.c = j3.f2023a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        j3.f2024b = true;
    }
}
