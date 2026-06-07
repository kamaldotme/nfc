package i;

import J.c0;
import android.view.View;
import k.n1;

/* loaded from: classes.dex */
public final class k extends v0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3171d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3172e;

    /* renamed from: f, reason: collision with root package name */
    public int f3173f;
    public final /* synthetic */ Object g;

    public k(l lVar) {
        this.f3171d = 0;
        this.g = lVar;
        this.f3172e = false;
        this.f3173f = 0;
    }

    @Override // J.c0
    public final void a() {
        switch (this.f3171d) {
            case 0:
                int i3 = this.f3173f + 1;
                this.f3173f = i3;
                l lVar = (l) this.g;
                if (i3 == lVar.f3174a.size()) {
                    c0 c0Var = lVar.f3176d;
                    if (c0Var != null) {
                        c0Var.a();
                    }
                    this.f3173f = 0;
                    this.f3172e = false;
                    lVar.f3177e = false;
                    return;
                }
                return;
            default:
                if (this.f3172e) {
                    return;
                }
                ((n1) this.g).f3737a.setVisibility(this.f3173f);
                return;
        }
    }

    @Override // v0.f, J.c0
    public void e(View view) {
        switch (this.f3171d) {
            case 1:
                this.f3172e = true;
                return;
            default:
                return;
        }
    }

    @Override // v0.f, J.c0
    public final void g() {
        switch (this.f3171d) {
            case 0:
                if (this.f3172e) {
                    return;
                }
                this.f3172e = true;
                c0 c0Var = ((l) this.g).f3176d;
                if (c0Var != null) {
                    c0Var.g();
                    return;
                }
                return;
            default:
                ((n1) this.g).f3737a.setVisibility(0);
                return;
        }
    }

    public k(n1 n1Var, int i3) {
        this.f3171d = 1;
        this.g = n1Var;
        this.f3173f = i3;
        this.f3172e = false;
    }
}
