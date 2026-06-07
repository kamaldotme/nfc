package e2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class U extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Q q3) {
        super(true);
        boolean z3 = true;
        I(q3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.c;
        InterfaceC0127i interfaceC0127i = (InterfaceC0127i) atomicReferenceFieldUpdater.get(this);
        C0128j c0128j = interfaceC0127i instanceof C0128j ? (C0128j) interfaceC0127i : null;
        if (c0128j != null) {
            Z o3 = c0128j.o();
            while (!o3.C()) {
                InterfaceC0127i interfaceC0127i2 = (InterfaceC0127i) atomicReferenceFieldUpdater.get(o3);
                C0128j c0128j2 = interfaceC0127i2 instanceof C0128j ? (C0128j) interfaceC0127i2 : null;
                if (c0128j2 != null) {
                    o3 = c0128j2.o();
                }
            }
            this.f2783d = z3;
        }
        z3 = false;
        this.f2783d = z3;
    }

    @Override // e2.Z
    public final boolean C() {
        return this.f2783d;
    }
}
