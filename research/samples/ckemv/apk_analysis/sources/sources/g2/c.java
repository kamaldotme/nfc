package g2;

/* loaded from: classes.dex */
public final class c extends Q1.b {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f3043f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, O1.d dVar2) {
        super(dVar2);
        this.f3043f = dVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        this.f3042e = obj;
        this.g |= Integer.MIN_VALUE;
        Object B3 = this.f3043f.B(null, 0, 0L, this);
        return B3 == P1.a.f784b ? B3 : new k(B3);
    }
}
