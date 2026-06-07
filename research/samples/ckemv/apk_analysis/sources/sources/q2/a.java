package q2;

import java.io.IOException;
import m2.o;
import m2.r;

/* loaded from: classes.dex */
public final class a implements m2.m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4424a = new Object();

    @Override // m2.m
    public final r a(r2.f fVar) {
        i iVar = fVar.f4657a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (!iVar.f4461p) {
                    throw new IllegalStateException("released".toString());
                }
                if (!(!iVar.f4460o)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!(!iVar.f4459n)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = iVar.f4455j;
        X1.g.b(fVar2);
        o oVar = iVar.f4450b;
        X1.g.e(oVar, "client");
        try {
            e eVar = new e(iVar, iVar.f4453f, fVar2, fVar2.a(fVar.f4661f, fVar.g, fVar.h, oVar.g, !X1.g.a((String) fVar.f4660e.c, "GET")).j(oVar, fVar));
            iVar.f4458m = eVar;
            iVar.f4463r = eVar;
            synchronized (iVar) {
                iVar.f4459n = true;
                iVar.f4460o = true;
            }
            if (iVar.f4462q) {
                throw new IOException("Canceled");
            }
            return r2.f.a(fVar, 0, eVar, null, 61).b(fVar.f4660e);
        } catch (IOException e3) {
            fVar2.c(e3);
            throw new n(e3);
        } catch (n e4) {
            fVar2.c(e4.c);
            throw e4;
        }
    }
}
