package j0;

import a.AbstractC0059a;
import android.view.ViewGroup;

/* renamed from: j0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229e extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3393a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3394b;

    public C0229e(ViewGroup viewGroup) {
        this.f3394b = viewGroup;
    }

    @Override // j0.p, j0.n
    public final void a() {
        AbstractC0059a.M(this.f3394b, false);
        this.f3393a = true;
    }

    @Override // j0.p, j0.n
    public final void b() {
        AbstractC0059a.M(this.f3394b, false);
    }

    @Override // j0.n
    public final void d(o oVar) {
        if (!this.f3393a) {
            AbstractC0059a.M(this.f3394b, false);
        }
        oVar.v(this);
    }

    @Override // j0.p, j0.n
    public final void e() {
        AbstractC0059a.M(this.f3394b, true);
    }
}
