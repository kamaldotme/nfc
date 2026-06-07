package g2;

/* loaded from: classes.dex */
public final class b extends Q1.b {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f3041f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, O1.d dVar2) {
        super(dVar2);
        this.f3041f = dVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        this.f3040e = obj;
        this.g |= Integer.MIN_VALUE;
        Object A3 = d.A(this.f3041f, this);
        return A3 == P1.a.f784b ? A3 : new k(A3);
    }
}
