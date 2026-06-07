package B2;

import android.widget.ProgressBar;
import e2.InterfaceC0137t;
import m0.z;
import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final class p extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f92f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MainActivity mainActivity, O1.d dVar) {
        super(2, dVar);
        this.f92f = mainActivity;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new p(this.f92f, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        p pVar = (p) b((O1.d) obj2, (InterfaceC0137t) obj);
        K1.h hVar = K1.h.f605a;
        pVar.k(hVar);
        return hVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        z.m0(obj);
        ProgressBar progressBar = this.f92f.f5249C;
        if (progressBar != null) {
            progressBar.setVisibility(4);
            return K1.h.f605a;
        }
        X1.g.h("progressBar");
        throw null;
    }
}
