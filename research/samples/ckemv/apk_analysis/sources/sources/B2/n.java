package B2;

import android.widget.Toast;
import e2.InterfaceC0137t;
import m0.z;
import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final class n extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f88f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MainActivity mainActivity, O1.d dVar) {
        super(2, dVar);
        this.f88f = mainActivity;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new n(this.f88f, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((n) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        z.m0(obj);
        Toast makeText = Toast.makeText(this.f88f, "✅", 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        return makeText;
    }
}
