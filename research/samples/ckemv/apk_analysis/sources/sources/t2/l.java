package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l implements W1.a {

    /* renamed from: b, reason: collision with root package name */
    public final u f4944b;
    public final /* synthetic */ q c;

    public l(q qVar, u uVar) {
        this.c = qVar;
        this.f4944b = uVar;
    }

    @Override // W1.a
    public final Object d() {
        q qVar = this.c;
        u uVar = this.f4944b;
        try {
            uVar.b(this);
            do {
            } while (uVar.a(false, this));
            qVar.a(1, 9, null);
        } catch (IOException e3) {
            qVar.a(2, 2, e3);
        } catch (Throwable th) {
            qVar.a(3, 3, null);
            n2.b.c(uVar);
            throw th;
        }
        n2.b.c(uVar);
        return K1.h.f605a;
    }
}
