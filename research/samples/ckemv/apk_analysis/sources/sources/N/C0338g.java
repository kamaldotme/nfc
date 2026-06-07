package n;

import a0.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f4148a;

    /* renamed from: b, reason: collision with root package name */
    public int f4149b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4150d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f4151e;

    public C0338g(m mVar, int i3) {
        this.f4151e = mVar;
        this.f4148a = i3;
        this.f4149b = mVar.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.f4149b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object e3 = this.f4151e.e(this.c, this.f4148a);
        this.c++;
        this.f4150d = true;
        return e3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4150d) {
            throw new IllegalStateException();
        }
        int i3 = this.c - 1;
        this.c = i3;
        this.f4149b--;
        this.f4150d = false;
        this.f4151e.k(i3);
    }
}
