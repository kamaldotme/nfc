package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends p2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f4945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4946f;
    public final /* synthetic */ z2.f g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, q qVar, int i3, z2.f fVar, int i4, boolean z3) {
        super(true, str);
        this.f4945e = qVar;
        this.f4946f = i3;
        this.g = fVar;
        this.h = i4;
    }

    @Override // p2.a
    public final long a() {
        try {
            B b3 = this.f4945e.f4964m;
            z2.f fVar = this.g;
            int i3 = this.h;
            b3.getClass();
            X1.g.e(fVar, "source");
            fVar.u(i3);
            this.f4945e.f4977z.D(this.f4946f, 9);
            synchronized (this.f4945e) {
                this.f4945e.f4955B.remove(Integer.valueOf(this.f4946f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
