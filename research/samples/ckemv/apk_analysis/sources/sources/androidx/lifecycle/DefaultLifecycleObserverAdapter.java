package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0099p {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0087d f2019b;
    public final InterfaceC0099p c;

    public DefaultLifecycleObserverAdapter(InterfaceC0087d interfaceC0087d, InterfaceC0099p interfaceC0099p) {
        X1.g.e(interfaceC0087d, "defaultLifecycleObserver");
        this.f2019b = interfaceC0087d;
        this.c = interfaceC0099p;
    }

    @Override // androidx.lifecycle.InterfaceC0099p
    public final void b(r rVar, EnumC0095l enumC0095l) {
        int i3 = AbstractC0088e.f2042a[enumC0095l.ordinal()];
        InterfaceC0087d interfaceC0087d = this.f2019b;
        switch (i3) {
            case 1:
                interfaceC0087d.getClass();
                break;
            case 2:
                interfaceC0087d.getClass();
                break;
            case 3:
                interfaceC0087d.a();
                break;
            case 4:
                interfaceC0087d.getClass();
                break;
            case 5:
                interfaceC0087d.getClass();
                break;
            case 6:
                interfaceC0087d.getClass();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0099p interfaceC0099p = this.c;
        if (interfaceC0099p != null) {
            interfaceC0099p.b(rVar, enumC0095l);
        }
    }
}
