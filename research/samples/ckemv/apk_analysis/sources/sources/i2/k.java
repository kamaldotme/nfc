package i2;

/* loaded from: classes.dex */
public final class k extends Q1.b {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3216f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, O1.d dVar) {
        super(dVar);
        this.f3216f = lVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        this.f3215e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f3216f.b(this, null);
    }
}
