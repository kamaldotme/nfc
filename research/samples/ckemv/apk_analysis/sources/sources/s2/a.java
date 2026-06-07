package s2;

import java.io.IOException;
import q2.l;
import z2.j;
import z2.v;
import z2.x;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: b, reason: collision with root package name */
    public final j f4709b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f4710d;

    public a(g gVar) {
        this.f4710d = gVar;
        this.f4709b = new j(gVar.f4720a.c());
    }

    public final void a() {
        g gVar = this.f4710d;
        int i3 = gVar.c;
        if (i3 == 6) {
            return;
        }
        if (i3 != 5) {
            throw new IllegalStateException("state: " + gVar.c);
        }
        j jVar = this.f4709b;
        x xVar = jVar.f5341e;
        jVar.f5341e = x.f5364d;
        xVar.a();
        xVar.b();
        gVar.c = 6;
    }

    @Override // z2.v
    public final x c() {
        return this.f4709b;
    }

    @Override // z2.v
    public long z(z2.f fVar, long j3) {
        g gVar = this.f4710d;
        X1.g.e(fVar, "sink");
        try {
            return gVar.f4720a.z(fVar, j3);
        } catch (IOException e3) {
            ((l) gVar.f4723e).k();
            a();
            throw e3;
        }
    }
}
