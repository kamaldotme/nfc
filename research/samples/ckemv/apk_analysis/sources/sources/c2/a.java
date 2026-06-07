package c2;

import L1.r;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2253a;

    public a(r rVar) {
        this.f2253a = new AtomicReference(rVar);
    }

    @Override // c2.c
    public final Iterator iterator() {
        c cVar = (c) this.f2253a.getAndSet(null);
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
