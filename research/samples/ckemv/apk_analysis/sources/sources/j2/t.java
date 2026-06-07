package j2;

import e2.AbstractC0119a;
import e2.AbstractC0139v;

/* loaded from: classes.dex */
public class t extends AbstractC0119a implements Q1.c {

    /* renamed from: e, reason: collision with root package name */
    public final O1.d f3538e;

    public t(O1.d dVar, O1.i iVar) {
        super(iVar, true);
        this.f3538e = dVar;
    }

    @Override // e2.Z
    public final boolean K() {
        return true;
    }

    @Override // Q1.c
    public final Q1.c f() {
        O1.d dVar = this.f3538e;
        if (dVar instanceof Q1.c) {
            return (Q1.c) dVar;
        }
        return null;
    }

    @Override // e2.Z
    public void q(Object obj) {
        a.i(v0.f.y(this.f3538e), AbstractC0139v.l(obj), null);
    }

    @Override // e2.Z
    public void r(Object obj) {
        this.f3538e.c(AbstractC0139v.l(obj));
    }
}
