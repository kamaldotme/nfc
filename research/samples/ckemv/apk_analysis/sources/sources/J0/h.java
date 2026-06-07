package j0;

import android.view.View;

/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3405a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3406b;

    public /* synthetic */ h() {
        this.f3405a = 2;
    }

    @Override // j0.p, j0.n
    public void c() {
        switch (this.f3405a) {
            case 2:
                t tVar = (t) this.f3406b;
                if (tVar.f3446B) {
                    return;
                }
                tVar.F();
                tVar.f3446B = true;
                return;
            default:
                return;
        }
    }

    @Override // j0.n
    public final void d(o oVar) {
        switch (this.f3405a) {
            case 0:
                y yVar = w.f3454a;
                yVar.f0((View) this.f3406b, 1.0f);
                yVar.getClass();
                oVar.v(this);
                return;
            case 1:
                ((o) this.f3406b).y();
                oVar.v(this);
                return;
            default:
                t tVar = (t) this.f3406b;
                int i3 = tVar.f3445A - 1;
                tVar.f3445A = i3;
                if (i3 == 0) {
                    tVar.f3446B = false;
                    tVar.m();
                }
                oVar.v(this);
                return;
        }
    }

    public /* synthetic */ h(int i3, Object obj) {
        this.f3405a = i3;
        this.f3406b = obj;
    }
}
