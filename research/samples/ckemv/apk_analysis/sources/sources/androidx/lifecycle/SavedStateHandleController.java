package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0099p {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2035b;

    @Override // androidx.lifecycle.InterfaceC0099p
    public final void b(r rVar, EnumC0095l enumC0095l) {
        if (enumC0095l == EnumC0095l.ON_DESTROY) {
            this.f2035b = false;
            rVar.d().f(this);
        }
    }
}
