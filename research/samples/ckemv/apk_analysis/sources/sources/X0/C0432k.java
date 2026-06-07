package x0;

import a1.InterfaceFutureC0061a;

/* renamed from: x0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432k extends AbstractC0430i {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = AbstractC0430i.g;
        }
        if (!AbstractC0430i.f5209f.g(this, null, obj)) {
            return false;
        }
        AbstractC0430i.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        th.getClass();
        if (!AbstractC0430i.f5209f.g(this, null, new C0424c(th))) {
            return false;
        }
        AbstractC0430i.c(this);
        return true;
    }

    public final boolean l(InterfaceFutureC0061a interfaceFutureC0061a) {
        C0424c c0424c;
        interfaceFutureC0061a.getClass();
        Object obj = this.f5210a;
        if (obj == null) {
            if (interfaceFutureC0061a.isDone()) {
                if (!AbstractC0430i.f5209f.g(this, null, AbstractC0430i.f(interfaceFutureC0061a))) {
                    return false;
                }
                AbstractC0430i.c(this);
            } else {
                RunnableC0427f runnableC0427f = new RunnableC0427f(this, interfaceFutureC0061a);
                if (AbstractC0430i.f5209f.g(this, null, runnableC0427f)) {
                    try {
                        interfaceFutureC0061a.a(runnableC0427f, EnumC0431j.f5212b);
                    } catch (Throwable th) {
                        try {
                            c0424c = new C0424c(th);
                        } catch (Throwable unused) {
                            c0424c = C0424c.f5196b;
                        }
                        AbstractC0430i.f5209f.g(this, runnableC0427f, c0424c);
                    }
                } else {
                    obj = this.f5210a;
                }
            }
            return true;
        }
        if (!(obj instanceof C0422a)) {
            return false;
        }
        interfaceFutureC0061a.cancel(((C0422a) obj).f5194a);
        return false;
    }
}
