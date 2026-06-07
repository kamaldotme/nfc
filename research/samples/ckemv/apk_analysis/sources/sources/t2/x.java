package t2;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class x extends z2.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f4998m;

    public x(y yVar) {
        this.f4998m = yVar;
    }

    @Override // z2.e
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // z2.e
    public final void k() {
        this.f4998m.e(9);
        q qVar = this.f4998m.f5000b;
        synchronized (qVar) {
            long j3 = qVar.f4968q;
            long j4 = qVar.f4967p;
            if (j3 < j4) {
                return;
            }
            qVar.f4967p = j4 + 1;
            qVar.f4969r = System.nanoTime() + 1000000000;
            qVar.f4961j.c(new p2.b(X.d.j(new StringBuilder(), qVar.f4958e, " ping"), qVar, 2), 0L);
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
