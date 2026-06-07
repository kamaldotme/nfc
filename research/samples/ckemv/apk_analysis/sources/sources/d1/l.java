package d1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public n f2630a;

    /* renamed from: b, reason: collision with root package name */
    public n f2631b = null;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f2632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2633e;

    public l(o oVar, int i3) {
        this.f2633e = i3;
        this.f2632d = oVar;
        this.f2630a = oVar.g.f2637d;
        this.c = oVar.f2645f;
    }

    public final Object a() {
        return b();
    }

    public final n b() {
        n nVar = this.f2630a;
        o oVar = this.f2632d;
        if (nVar == oVar.g) {
            throw new NoSuchElementException();
        }
        if (oVar.f2645f != this.c) {
            throw new ConcurrentModificationException();
        }
        this.f2630a = nVar.f2637d;
        this.f2631b = nVar;
        return nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2630a != this.f2632d.g;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f2633e) {
            case 1:
                return b().f2639f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        n nVar = this.f2631b;
        if (nVar == null) {
            throw new IllegalStateException();
        }
        o oVar = this.f2632d;
        oVar.c(nVar, true);
        this.f2631b = null;
        this.c = oVar.f2645f;
    }
}
