package B2;

import android.widget.ProgressBar;
import m0.z;
import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final class k extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f85f;
    public final /* synthetic */ MainActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MainActivity mainActivity, O1.d dVar) {
        super(2, dVar);
        this.g = mainActivity;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        k kVar = new k(this.g, dVar);
        kVar.f85f = ((Number) obj).intValue();
        return kVar;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        k kVar = (k) b((O1.d) obj2, Integer.valueOf(((Number) obj).intValue()));
        K1.h hVar = K1.h.f605a;
        kVar.k(hVar);
        return hVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        z.m0(obj);
        int i3 = this.f85f;
        ProgressBar progressBar = this.g.f5249C;
        if (progressBar != null) {
            progressBar.setProgress(i3);
            return K1.h.f605a;
        }
        X1.g.h("progressBar");
        throw null;
    }
}
