package x0;

import a1.InterfaceFutureC0061a;

/* renamed from: x0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0427f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0430i f5204b;
    public final InterfaceFutureC0061a c;

    public RunnableC0427f(AbstractC0430i abstractC0430i, InterfaceFutureC0061a interfaceFutureC0061a) {
        this.f5204b = abstractC0430i;
        this.c = interfaceFutureC0061a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5204b.f5210a != this) {
            return;
        }
        if (AbstractC0430i.f5209f.g(this.f5204b, this, AbstractC0430i.f(this.c))) {
            AbstractC0430i.c(this.f5204b);
        }
    }
}
