package c2;

import W1.l;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f2259a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2260b;

    public h(d2.c cVar, L1.a aVar) {
        this.f2259a = cVar;
        this.f2260b = aVar;
    }

    @Override // c2.c
    public final Iterator iterator() {
        return new g(this);
    }
}
