package m;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3946a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3947b = true;
    public final /* synthetic */ f c;

    public d(f fVar) {
        this.c = fVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2 = this.f3946a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f3945d;
            this.f3946a = cVar3;
            this.f3947b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3947b) {
            return this.c.f3948b != null;
        }
        c cVar = this.f3946a;
        return (cVar == null || cVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3947b) {
            this.f3947b = false;
            this.f3946a = this.c.f3948b;
        } else {
            c cVar = this.f3946a;
            this.f3946a = cVar != null ? cVar.c : null;
        }
        return this.f3946a;
    }
}
