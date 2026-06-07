package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends p2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f4951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4952f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, q qVar, int i3, long j3) {
        super(true, str);
        this.f4951e = qVar;
        this.f4952f = i3;
        this.g = j3;
    }

    @Override // p2.a
    public final long a() {
        q qVar = this.f4951e;
        try {
            qVar.f4977z.G(this.f4952f, this.g);
            return -1L;
        } catch (IOException e3) {
            qVar.b(e3);
            return -1L;
        }
    }
}
