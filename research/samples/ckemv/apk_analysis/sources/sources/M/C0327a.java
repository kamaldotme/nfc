package m;

import java.util.HashMap;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327a extends f {

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3940f = new HashMap();

    @Override // m.f
    public final c a(Object obj) {
        return (c) this.f3940f.get(obj);
    }

    @Override // m.f
    public final Object b(Object obj) {
        Object b3 = super.b(obj);
        this.f3940f.remove(obj);
        return b3;
    }

    public final Object c(Object obj, Object obj2) {
        c a3 = a(obj);
        if (a3 != null) {
            return a3.f3944b;
        }
        HashMap hashMap = this.f3940f;
        c cVar = new c(obj, obj2);
        this.f3950e++;
        c cVar2 = this.c;
        if (cVar2 == null) {
            this.f3948b = cVar;
            this.c = cVar;
        } else {
            cVar2.c = cVar;
            cVar.f3945d = cVar2;
            this.c = cVar;
        }
        hashMap.put(obj, cVar);
        return null;
    }
}
