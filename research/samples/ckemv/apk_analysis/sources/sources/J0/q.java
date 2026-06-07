package j0;

import java.util.ArrayList;
import n.C0333b;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0333b f3440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3441b;

    public q(r rVar, C0333b c0333b) {
        this.f3441b = rVar;
        this.f3440a = c0333b;
    }

    @Override // j0.n
    public final void d(o oVar) {
        ((ArrayList) this.f3440a.getOrDefault(this.f3441b.c, null)).remove(oVar);
        oVar.v(this);
    }
}
