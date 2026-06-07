package h2;

import g2.r;

/* loaded from: classes.dex */
public final class a extends Q1.b {

    /* renamed from: e, reason: collision with root package name */
    public r f3093e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3094f;
    public final /* synthetic */ b g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, O1.d dVar) {
        super(dVar);
        this.g = bVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        this.f3094f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
