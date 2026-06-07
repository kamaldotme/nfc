package O1;

import W1.p;
import java.io.Serializable;
import m0.z;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final i f780b;
    public final g c;

    public c(g gVar, i iVar) {
        X1.g.e(iVar, "left");
        X1.g.e(gVar, "element");
        this.f780b = iVar;
        this.c = gVar;
    }

    @Override // O1.i
    public final g A(h hVar) {
        X1.g.e(hVar, "key");
        c cVar = this;
        while (true) {
            g A3 = cVar.c.A(hVar);
            if (A3 != null) {
                return A3;
            }
            i iVar = cVar.f780b;
            if (!(iVar instanceof c)) {
                return iVar.A(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // O1.i
    public final Object D(Object obj, p pVar) {
        return pVar.e(this.f780b.D(obj, pVar), this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                cVar.getClass();
                int i3 = 2;
                c cVar2 = cVar;
                int i4 = 2;
                while (true) {
                    i iVar = cVar2.f780b;
                    cVar2 = iVar instanceof c ? (c) iVar : null;
                    if (cVar2 == null) {
                        break;
                    }
                    i4++;
                }
                c cVar3 = this;
                while (true) {
                    i iVar2 = cVar3.f780b;
                    cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                    if (cVar3 == null) {
                        break;
                    }
                    i3++;
                }
                if (i4 == i3) {
                    c cVar4 = this;
                    while (true) {
                        g gVar = cVar4.c;
                        if (!X1.g.a(cVar.A(gVar.getKey()), gVar)) {
                            break;
                        }
                        i iVar3 = cVar4.f780b;
                        if (iVar3 instanceof c) {
                            cVar4 = (c) iVar3;
                        } else {
                            X1.g.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            g gVar2 = (g) iVar3;
                            if (X1.g.a(cVar.A(gVar2.getKey()), gVar2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + this.f780b.hashCode();
    }

    @Override // O1.i
    public final i i(h hVar) {
        X1.g.e(hVar, "key");
        g gVar = this.c;
        g A3 = gVar.A(hVar);
        i iVar = this.f780b;
        if (A3 != null) {
            return iVar;
        }
        i i3 = iVar.i(hVar);
        return i3 == iVar ? this : i3 == j.f782b ? gVar : new c(gVar, i3);
    }

    @Override // O1.i
    public final i o(i iVar) {
        return z.a0(this, iVar);
    }

    public final String toString() {
        return "[" + ((String) D("", b.f778d)) + ']';
    }
}
