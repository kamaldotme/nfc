package O1;

import W1.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: b, reason: collision with root package name */
    public final h f777b;

    public a(h hVar) {
        this.f777b = hVar;
    }

    @Override // O1.i
    public g A(h hVar) {
        return u2.d.l(this, hVar);
    }

    @Override // O1.i
    public final Object D(Object obj, p pVar) {
        return pVar.e(obj, this);
    }

    @Override // O1.g
    public final h getKey() {
        return this.f777b;
    }

    @Override // O1.i
    public i i(h hVar) {
        return u2.d.t(this, hVar);
    }

    @Override // O1.i
    public final i o(i iVar) {
        return u2.d.x(this, iVar);
    }
}
