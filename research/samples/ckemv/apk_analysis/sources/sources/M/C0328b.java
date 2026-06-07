package m;

import java.util.Iterator;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3941a;

    /* renamed from: b, reason: collision with root package name */
    public c f3942b;
    public final /* synthetic */ int c;

    public C0328b(c cVar, c cVar2, int i3) {
        this.c = i3;
        this.f3941a = cVar2;
        this.f3942b = cVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2 = null;
        if (this.f3941a == cVar && cVar == this.f3942b) {
            this.f3942b = null;
            this.f3941a = null;
        }
        c cVar3 = this.f3941a;
        if (cVar3 == cVar) {
            this.f3941a = b(cVar3);
        }
        c cVar4 = this.f3942b;
        if (cVar4 == cVar) {
            c cVar5 = this.f3941a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVar2 = c(cVar4);
            }
            this.f3942b = cVar2;
        }
    }

    public final c b(c cVar) {
        switch (this.c) {
            case 0:
                return cVar.f3945d;
            default:
                return cVar.c;
        }
    }

    public final c c(c cVar) {
        switch (this.c) {
            case 0:
                return cVar.c;
            default:
                return cVar.f3945d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3942b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3942b;
        c cVar2 = this.f3941a;
        this.f3942b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
        return cVar;
    }
}
