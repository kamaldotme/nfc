package K1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public W1.a f602b;
    public volatile Object c = g.f604a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f603d = this;

    public f(W1.a aVar) {
        this.f602b = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.c;
        g gVar = g.f604a;
        if (obj2 != gVar) {
            return obj2;
        }
        synchronized (this.f603d) {
            obj = this.c;
            if (obj == gVar) {
                W1.a aVar = this.f602b;
                X1.g.b(aVar);
                obj = aVar.d();
                this.c = obj;
                this.f602b = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.c != g.f604a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
