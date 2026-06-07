package I1;

import j1.C0237g;
import j1.C0239i;
import j1.C0244n;
import j1.InterfaceC0240j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class m implements j1.o {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0240j f366a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f367b = new ArrayList();

    public m(C0237g c0237g) {
        this.f366a = c0237g;
    }

    @Override // j1.o
    public final void a(C0244n c0244n) {
        this.f367b.add(c0244n);
    }

    public v0.e b(C0239i c0239i) {
        return new v0.e(new p1.e(c0239i));
    }
}
