package x0;

import m0.z;

/* renamed from: x0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428g extends z {
    @Override // m0.z
    public final void b0(C0429h c0429h, C0429h c0429h2) {
        c0429h.f5206b = c0429h2;
    }

    @Override // m0.z
    public final void c0(C0429h c0429h, Thread thread) {
        c0429h.f5205a = thread;
    }

    @Override // m0.z
    public final boolean f(AbstractC0430i abstractC0430i, C0425d c0425d, C0425d c0425d2) {
        synchronized (abstractC0430i) {
            try {
                if (abstractC0430i.f5211b != c0425d) {
                    return false;
                }
                abstractC0430i.f5211b = c0425d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.z
    public final boolean g(AbstractC0430i abstractC0430i, Object obj, Object obj2) {
        synchronized (abstractC0430i) {
            try {
                if (abstractC0430i.f5210a != obj) {
                    return false;
                }
                abstractC0430i.f5210a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.z
    public final boolean h(AbstractC0430i abstractC0430i, C0429h c0429h, C0429h c0429h2) {
        synchronized (abstractC0430i) {
            try {
                if (abstractC0430i.c != c0429h) {
                    return false;
                }
                abstractC0430i.c = c0429h2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
