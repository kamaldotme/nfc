package h2;

/* loaded from: classes.dex */
public final class c extends Q1.b {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f3101f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, O1.d dVar2) {
        super(dVar2);
        this.f3101f = dVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        this.f3100e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f3101f.b(this, null);
    }
}
