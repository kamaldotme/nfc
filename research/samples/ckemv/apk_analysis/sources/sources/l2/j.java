package l2;

import e2.AbstractC0139v;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f3929d;

    public j(Runnable runnable, long j3, i iVar) {
        super(j3, iVar);
        this.f3929d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3929d.run();
        } finally {
            this.c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3929d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0139v.f(runnable));
        sb.append(", ");
        sb.append(this.f3927b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
