package B2;

import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final class f extends Q1.b {

    /* renamed from: e, reason: collision with root package name */
    public MainActivity f80e;

    /* renamed from: f, reason: collision with root package name */
    public String f81f;
    public String g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MainActivity f82i;

    /* renamed from: j, reason: collision with root package name */
    public int f83j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MainActivity mainActivity, O1.d dVar) {
        super(dVar);
        this.f82i = mainActivity;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        this.h = obj;
        this.f83j |= Integer.MIN_VALUE;
        return MainActivity.w(this.f82i, null, null, this);
    }
}
