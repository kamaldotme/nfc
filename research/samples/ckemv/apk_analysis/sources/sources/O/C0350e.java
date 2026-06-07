package o;

import a.AbstractC0059a;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350e extends AbstractC0059a {
    @Override // a.AbstractC0059a
    public final void I(f fVar, f fVar2) {
        fVar.f4264b = fVar2;
    }

    @Override // a.AbstractC0059a
    public final void J(f fVar, Thread thread) {
        fVar.f4263a = thread;
    }

    @Override // a.AbstractC0059a
    public final boolean f(g gVar, C0348c c0348c, C0348c c0348c2) {
        synchronized (gVar) {
            try {
                if (gVar.f4269b != c0348c) {
                    return false;
                }
                gVar.f4269b = c0348c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0059a
    public final boolean g(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f4268a != obj) {
                    return false;
                }
                gVar.f4268a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0059a
    public final boolean h(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.c != fVar) {
                    return false;
                }
                gVar.c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
