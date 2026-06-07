package w0;

import f.C0150G;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C0150G f5176a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5177b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f5178d = new Object();

    static {
        m0.r.b("WorkTimer");
    }

    public x(C0150G c0150g) {
        this.f5176a = c0150g;
    }

    public final void a(v0.j jVar) {
        synchronized (this.f5178d) {
            try {
                if (((w) this.f5177b.remove(jVar)) != null) {
                    m0.r a3 = m0.r.a();
                    Objects.toString(jVar);
                    a3.getClass();
                    this.c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
