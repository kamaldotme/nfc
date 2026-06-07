package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends p2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f4939f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, q qVar, Object obj, int i3) {
        super(true, str);
        this.f4938e = i3;
        this.f4939f = qVar;
        this.g = obj;
    }

    @Override // p2.a
    public final long a() {
        switch (this.f4938e) {
            case 0:
                q qVar = this.f4939f;
                qVar.c.a(qVar, (C) ((X1.j) this.g).c);
                return -1L;
            default:
                try {
                    this.f4939f.c.b((y) this.g);
                } catch (IOException e3) {
                    u2.n nVar = u2.n.f5043a;
                    u2.n nVar2 = u2.n.f5043a;
                    String str = "Http2Connection.Listener failure for " + this.f4939f.f4958e;
                    nVar2.getClass();
                    u2.n.i(str, 4, e3);
                    try {
                        ((y) this.g).c(2, e3);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
        }
    }
}
