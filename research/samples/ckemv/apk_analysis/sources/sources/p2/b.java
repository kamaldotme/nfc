package p2;

import X1.g;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import q2.l;
import q2.m;
import t2.q;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i3) {
        super(true, str);
        this.f4355e = i3;
        this.f4356f = obj;
    }

    @Override // p2.a
    public final long a() {
        switch (this.f4355e) {
            case 0:
                ((W1.a) this.f4356f).d();
                return -1L;
            case 1:
                m mVar = (m) this.f4356f;
                long nanoTime = System.nanoTime();
                Iterator it = mVar.f4484e.iterator();
                int i3 = 0;
                long j3 = Long.MIN_VALUE;
                l lVar = null;
                int i4 = 0;
                while (it.hasNext()) {
                    l lVar2 = (l) it.next();
                    g.d(lVar2, "connection");
                    synchronized (lVar2) {
                        if (mVar.b(lVar2, nanoTime) > 0) {
                            i4++;
                        } else {
                            i3++;
                            long j4 = nanoTime - lVar2.f4480q;
                            if (j4 > j3) {
                                lVar = lVar2;
                                j3 = j4;
                            }
                        }
                    }
                }
                long j5 = mVar.f4482b;
                if (j3 < j5 && i3 <= mVar.f4481a) {
                    if (i3 > 0) {
                        return j5 - j3;
                    }
                    if (i4 > 0) {
                        return j5;
                    }
                    return -1L;
                }
                g.b(lVar);
                synchronized (lVar) {
                    if (!lVar.f4479p.isEmpty()) {
                        return 0L;
                    }
                    if (lVar.f4480q + j3 != nanoTime) {
                        return 0L;
                    }
                    lVar.f4473j = true;
                    mVar.f4484e.remove(lVar);
                    Socket socket = lVar.f4469d;
                    g.b(socket);
                    n2.b.d(socket);
                    if (!mVar.f4484e.isEmpty()) {
                        return 0L;
                    }
                    mVar.c.a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f4356f;
                qVar.getClass();
                try {
                    qVar.f4977z.A(2, 0, false);
                    return -1L;
                } catch (IOException e3) {
                    qVar.a(2, 2, e3);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, String str) {
        super(true, str);
        this.f4355e = 1;
        this.f4356f = mVar;
    }
}
