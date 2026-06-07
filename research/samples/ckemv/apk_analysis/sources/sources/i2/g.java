package i2;

/* loaded from: classes.dex */
public final class g extends Q1.b {

    /* renamed from: e, reason: collision with root package name */
    public h f3207e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3208f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h h;

    /* renamed from: i, reason: collision with root package name */
    public int f3209i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, O1.d dVar) {
        super(dVar);
        this.h = hVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        this.g = obj;
        this.f3209i |= Integer.MIN_VALUE;
        return this.h.b(this, null);
    }
}
