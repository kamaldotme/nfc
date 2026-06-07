package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends p2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f4949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4950f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, long j3) {
        super(true, str);
        this.f4949e = qVar;
        this.f4950f = j3;
    }

    @Override // p2.a
    public final long a() {
        q qVar;
        boolean z3;
        synchronized (this.f4949e) {
            qVar = this.f4949e;
            long j3 = qVar.f4966o;
            long j4 = qVar.f4965n;
            if (j3 < j4) {
                z3 = true;
            } else {
                qVar.f4965n = j4 + 1;
                z3 = false;
            }
        }
        if (z3) {
            qVar.a(2, 2, null);
            return -1L;
        }
        try {
            qVar.f4977z.A(1, 0, false);
        } catch (IOException e3) {
            qVar.a(2, 2, e3);
        }
        return this.f4950f;
    }
}
