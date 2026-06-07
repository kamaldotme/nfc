package w0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final x f5175b;
    public final v0.j c;

    public w(x xVar, v0.j jVar) {
        this.f5175b = xVar;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5175b.f5178d) {
            try {
                if (((w) this.f5175b.f5177b.remove(this.c)) != null) {
                    v vVar = (v) this.f5175b.c.remove(this.c);
                    if (vVar != null) {
                        v0.j jVar = this.c;
                        p0.g gVar = (p0.g) vVar;
                        m0.r a3 = m0.r.a();
                        Objects.toString(jVar);
                        a3.getClass();
                        gVar.f4311i.execute(new p0.f(gVar, 0));
                    }
                } else {
                    m0.r a4 = m0.r.a();
                    Objects.toString(this.c);
                    a4.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
