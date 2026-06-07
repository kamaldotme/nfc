package F;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f152a;

    /* renamed from: b, reason: collision with root package name */
    public c f153b;
    public boolean c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f152a) {
                    return;
                }
                this.f152a = true;
                this.c = true;
                c cVar = this.f153b;
                if (cVar != null) {
                    try {
                        cVar.h();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(c cVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f153b == cVar) {
                return;
            }
            this.f153b = cVar;
            if (this.f152a) {
                cVar.h();
            }
        }
    }
}
