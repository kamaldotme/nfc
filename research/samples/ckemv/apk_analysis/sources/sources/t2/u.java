package t2;

import a2.C0062a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f4987f;

    /* renamed from: b, reason: collision with root package name */
    public final z2.h f4988b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final t f4989d;

    /* renamed from: e, reason: collision with root package name */
    public final C0388c f4990e;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        X1.g.d(logger, "getLogger(Http2::class.java.name)");
        f4987f = logger;
    }

    public u(z2.h hVar, boolean z3) {
        this.f4988b = hVar;
        this.c = z3;
        t tVar = new t(hVar);
        this.f4989d = tVar;
        this.f4990e = new C0388c(tVar);
    }

    public final void A(l lVar, int i3, int i4, int i5) {
        int i6;
        int i7 = 1;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = false;
        boolean z4 = (i4 & 1) != 0;
        if ((i4 & 8) != 0) {
            byte E2 = this.f4988b.E();
            byte[] bArr = n2.b.f4249a;
            i6 = E2 & 255;
        } else {
            i6 = 0;
        }
        if ((i4 & 32) != 0) {
            z2.h hVar = this.f4988b;
            hVar.H();
            hVar.E();
            byte[] bArr2 = n2.b.f4249a;
            lVar.getClass();
            i3 -= 5;
        }
        List o3 = o(s.a(i3, i4, i6), i6, i4, i5);
        lVar.getClass();
        lVar.c.getClass();
        if (i5 != 0 && (i5 & 1) == 0) {
            z3 = true;
        }
        if (z3) {
            q qVar = lVar.c;
            qVar.getClass();
            qVar.f4962k.c(new n(qVar.f4958e + '[' + i5 + "] onHeaders", qVar, i5, o3, z4), 0L);
            return;
        }
        q qVar2 = lVar.c;
        synchronized (qVar2) {
            y i8 = qVar2.i(i5);
            if (i8 != null) {
                i8.i(n2.b.t(o3), z4);
                return;
            }
            if (qVar2.h) {
                return;
            }
            if (i5 <= qVar2.f4959f) {
                return;
            }
            if (i5 % 2 == qVar2.g % 2) {
                return;
            }
            y yVar = new y(i5, qVar2, false, z4, n2.b.t(o3));
            qVar2.f4959f = i5;
            qVar2.f4957d.put(Integer.valueOf(i5), yVar);
            qVar2.f4960i.f().c(new i(qVar2.f4958e + '[' + i5 + "] onStream", qVar2, yVar, i7), 0L);
        }
    }

    public final void D(l lVar, int i3, int i4, int i5) {
        int i6;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i4 & 8) != 0) {
            byte E2 = this.f4988b.E();
            byte[] bArr = n2.b.f4249a;
            i6 = E2 & 255;
        } else {
            i6 = 0;
        }
        int H2 = this.f4988b.H() & Integer.MAX_VALUE;
        List o3 = o(s.a(i3 - 4, i4, i6), i6, i4, i5);
        lVar.getClass();
        q qVar = lVar.c;
        qVar.getClass();
        synchronized (qVar) {
            if (qVar.f4955B.contains(Integer.valueOf(H2))) {
                qVar.I(H2, 2);
                return;
            }
            qVar.f4955B.add(Integer.valueOf(H2));
            qVar.f4962k.c(new n(qVar.f4958e + '[' + H2 + "] onRequest", qVar, H2, o3), 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0242, code lost:
    
        throw new java.io.IOException(X.d.f("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z3, l lVar) {
        Object[] array;
        X1.g.e(lVar, "handler");
        int i3 = 0;
        try {
            this.f4988b.n(9L);
            int r3 = n2.b.r(this.f4988b);
            if (r3 > 16384) {
                throw new IOException(X.d.f("FRAME_SIZE_ERROR: ", r3));
            }
            int E2 = this.f4988b.E() & 255;
            byte E3 = this.f4988b.E();
            int i4 = E3 & 255;
            int H2 = this.f4988b.H();
            int i5 = H2 & Integer.MAX_VALUE;
            Logger logger = f4987f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(i5, r3, E2, i4, true));
            }
            if (z3 && E2 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f4935b;
                sb.append(E2 < strArr.length ? strArr[E2] : n2.b.h("0x%02x", Integer.valueOf(E2)));
                throw new IOException(sb.toString());
            }
            switch (E2) {
                case 0:
                    i(lVar, r3, i4, i5);
                    return true;
                case 1:
                    A(lVar, r3, i4, i5);
                    return true;
                case 2:
                    if (r3 != 5) {
                        throw new IOException(X.d.g("TYPE_PRIORITY length: ", r3, " != 5"));
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    z2.h hVar = this.f4988b;
                    hVar.H();
                    hVar.E();
                    return true;
                case 3:
                    if (r3 != 4) {
                        throw new IOException(X.d.g("TYPE_RST_STREAM length: ", r3, " != 4"));
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int H3 = this.f4988b.H();
                    int[] b3 = q.h.b(14);
                    int length = b3.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            int i7 = b3[i6];
                            if (q.h.a(i7) == H3) {
                                i3 = i7;
                            } else {
                                i6++;
                            }
                        }
                    }
                    if (i3 == 0) {
                        throw new IOException(X.d.f("TYPE_RST_STREAM unexpected error code: ", H3));
                    }
                    q qVar = lVar.c;
                    qVar.getClass();
                    if (i5 == 0 || (H2 & 1) != 0) {
                        y o3 = qVar.o(i5);
                        if (o3 == null) {
                            return true;
                        }
                        o3.j(i3);
                        return true;
                    }
                    qVar.f4962k.c(new j(qVar.f4958e + '[' + i5 + "] onReset", qVar, i5, i3, 1), 0L);
                    return true;
                case 4:
                    if (i5 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((E3 & 1) != 0) {
                        if (r3 == 0) {
                            return true;
                        }
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    if (r3 % 6 != 0) {
                        throw new IOException(X.d.f("TYPE_SETTINGS length % 6 != 0: ", r3));
                    }
                    C c = new C();
                    C0062a O2 = u2.l.O(u2.l.P(0, r3), 6);
                    int i8 = O2.f1424b;
                    int i9 = O2.c;
                    int i10 = O2.f1425d;
                    if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                        while (true) {
                            z2.h hVar2 = this.f4988b;
                            short y3 = hVar2.y();
                            byte[] bArr = n2.b.f4249a;
                            int i11 = y3 & 65535;
                            int H4 = hVar2.H();
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    i11 = 4;
                                } else if (i11 != 4) {
                                    if (i11 == 5 && (H4 < 16384 || H4 > 16777215)) {
                                    }
                                } else {
                                    if (H4 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i11 = 7;
                                }
                            } else if (H4 != 0 && H4 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            c.c(i11, H4);
                            if (i8 != i9) {
                                i8 += i10;
                            }
                        }
                    }
                    q qVar2 = lVar.c;
                    qVar2.f4961j.c(new k(X.d.j(new StringBuilder(), qVar2.f4958e, " applyAndAckSettings"), lVar, c), 0L);
                    return true;
                case 5:
                    D(lVar, r3, i4, i5);
                    return true;
                case 6:
                    if (r3 != 8) {
                        throw new IOException(X.d.f("TYPE_PING length != 8: ", r3));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int H5 = this.f4988b.H();
                    int H6 = this.f4988b.H();
                    if ((E3 & 1) == 0) {
                        lVar.c.f4961j.c(new j(X.d.j(new StringBuilder(), lVar.c.f4958e, " ping"), lVar.c, H5, H6, 0), 0L);
                        return true;
                    }
                    q qVar3 = lVar.c;
                    synchronized (qVar3) {
                        try {
                            if (H5 == 1) {
                                qVar3.f4966o++;
                            } else if (H5 == 2) {
                                qVar3.f4968q++;
                            } else if (H5 == 3) {
                                qVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (r3 < 8) {
                        throw new IOException(X.d.f("TYPE_GOAWAY length < 8: ", r3));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int H7 = this.f4988b.H();
                    int H8 = this.f4988b.H();
                    int i12 = r3 - 8;
                    int[] b4 = q.h.b(14);
                    int length2 = b4.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            int i14 = b4[i13];
                            if (q.h.a(i14) != H8) {
                                i13++;
                            } else if (i14 != 0) {
                                z2.i iVar = z2.i.f5338e;
                                if (i12 > 0) {
                                    iVar = this.f4988b.p(i12);
                                }
                                X1.g.e(iVar, "debugData");
                                iVar.c();
                                q qVar4 = lVar.c;
                                synchronized (qVar4) {
                                    array = qVar4.f4957d.values().toArray(new y[0]);
                                    qVar4.h = true;
                                }
                                y[] yVarArr = (y[]) array;
                                int length3 = yVarArr.length;
                                while (i3 < length3) {
                                    y yVar = yVarArr[i3];
                                    if (yVar.f4999a > H7 && yVar.g()) {
                                        yVar.j(8);
                                        lVar.c.o(yVar.f4999a);
                                    }
                                    i3++;
                                }
                                return true;
                            }
                        }
                    }
                    throw new IOException(X.d.f("TYPE_GOAWAY unexpected error code: ", H8));
                case 8:
                    if (r3 != 4) {
                        throw new IOException(X.d.f("TYPE_WINDOW_UPDATE length !=4: ", r3));
                    }
                    long H9 = this.f4988b.H() & 2147483647L;
                    if (H9 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i5 == 0) {
                        q qVar5 = lVar.c;
                        synchronized (qVar5) {
                            qVar5.f4975x += H9;
                            qVar5.notifyAll();
                        }
                        return true;
                    }
                    y i15 = lVar.c.i(i5);
                    if (i15 == null) {
                        return true;
                    }
                    synchronized (i15) {
                        i15.f5003f += H9;
                        if (H9 > 0) {
                            i15.notifyAll();
                        }
                    }
                    return true;
                default:
                    this.f4988b.u(r3);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(l lVar) {
        X1.g.e(lVar, "handler");
        if (this.c) {
            if (!a(true, lVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        z2.i iVar = f.f4934a;
        z2.i p3 = this.f4988b.p(iVar.f5339b.length);
        Level level = Level.FINE;
        Logger logger = f4987f;
        if (logger.isLoggable(level)) {
            logger.fine(n2.b.h("<< CONNECTION " + p3.d(), new Object[0]));
        }
        if (!X1.g.a(iVar, p3)) {
            throw new IOException("Expected a connection header but was ".concat(p3.j()));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4988b.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [z2.f, java.lang.Object] */
    public final void i(l lVar, int i3, int i4, int i5) {
        int i6;
        int i7;
        y yVar;
        boolean z3;
        boolean z4;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z5 = (i4 & 1) != 0;
        if ((i4 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i4 & 8) != 0) {
            byte E2 = this.f4988b.E();
            byte[] bArr = n2.b.f4249a;
            i7 = E2 & 255;
            i6 = i3;
        } else {
            i6 = i3;
            i7 = 0;
        }
        int a3 = s.a(i6, i4, i7);
        z2.h hVar = this.f4988b;
        lVar.getClass();
        X1.g.e(hVar, "source");
        lVar.c.getClass();
        long j3 = 0;
        if (i5 != 0 && (i5 & 1) == 0) {
            q qVar = lVar.c;
            qVar.getClass();
            ?? obj = new Object();
            long j4 = a3;
            hVar.n(j4);
            hVar.z(obj, j4);
            qVar.f4962k.c(new m(qVar.f4958e + '[' + i5 + "] onData", qVar, i5, obj, a3, z5), 0L);
        } else {
            y i8 = lVar.c.i(i5);
            if (i8 == null) {
                lVar.c.I(i5, 2);
                long j5 = a3;
                lVar.c.D(j5);
                hVar.u(j5);
            } else {
                byte[] bArr2 = n2.b.f4249a;
                w wVar = i8.f5004i;
                long j6 = a3;
                wVar.getClass();
                long j7 = j6;
                while (true) {
                    if (j7 <= j3) {
                        yVar = i8;
                        wVar.a(j6);
                        break;
                    }
                    synchronized (wVar.g) {
                        z3 = wVar.c;
                        yVar = i8;
                        z4 = wVar.f4996e.c + j7 > wVar.f4994b;
                    }
                    if (z4) {
                        hVar.u(j7);
                        wVar.g.e(4);
                        break;
                    }
                    if (z3) {
                        hVar.u(j7);
                        break;
                    }
                    long z6 = hVar.z(wVar.f4995d, j7);
                    if (z6 == -1) {
                        throw new EOFException();
                    }
                    j7 -= z6;
                    y yVar2 = wVar.g;
                    synchronized (yVar2) {
                        try {
                            if (wVar.f4997f) {
                                z2.f fVar = wVar.f4995d;
                                fVar.u(fVar.c);
                                j3 = 0;
                            } else {
                                z2.f fVar2 = wVar.f4996e;
                                j3 = 0;
                                boolean z7 = fVar2.c == 0;
                                fVar2.K(wVar.f4995d);
                                if (z7) {
                                    yVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    i8 = yVar;
                }
                if (z5) {
                    yVar.i(n2.b.f4250b, true);
                }
            }
        }
        this.f4988b.u(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f4921a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List o(int i3, int i4, int i5, int i6) {
        int e3;
        t tVar = this.f4989d;
        tVar.f4986f = i3;
        tVar.c = i3;
        tVar.g = i4;
        tVar.f4984d = i5;
        tVar.f4985e = i6;
        while (true) {
            C0388c c0388c = this.f4990e;
            z2.p pVar = c0388c.c;
            boolean v3 = pVar.v();
            ArrayList arrayList = c0388c.f4922b;
            if (v3) {
                List Y2 = L1.k.Y(arrayList);
                arrayList.clear();
                return Y2;
            }
            byte E2 = pVar.E();
            byte[] bArr = n2.b.f4249a;
            int i7 = E2 & 255;
            if (i7 == 128) {
                throw new IOException("index == 0");
            }
            if ((E2 & 128) == 128) {
                e3 = c0388c.e(i7, 127);
                int i8 = e3 - 1;
                if (i8 >= 0) {
                    C0387b[] c0387bArr = e.f4932a;
                    if (i8 <= c0387bArr.length - 1) {
                        arrayList.add(c0387bArr[i8]);
                    }
                }
                int length = c0388c.f4924e + 1 + (i8 - e.f4932a.length);
                if (length < 0) {
                    break;
                }
                C0387b[] c0387bArr2 = c0388c.f4923d;
                if (length >= c0387bArr2.length) {
                    break;
                }
                C0387b c0387b = c0387bArr2[length];
                X1.g.b(c0387b);
                arrayList.add(c0387b);
            } else if (i7 == 64) {
                C0387b[] c0387bArr3 = e.f4932a;
                z2.i d3 = c0388c.d();
                e.a(d3);
                c0388c.c(new C0387b(d3, c0388c.d()));
            } else if ((E2 & 64) == 64) {
                c0388c.c(new C0387b(c0388c.b(c0388c.e(i7, 63) - 1), c0388c.d()));
            } else if ((E2 & 32) == 32) {
                int e4 = c0388c.e(i7, 31);
                c0388c.f4921a = e4;
                if (e4 < 0 || e4 > 4096) {
                    break;
                }
                int i9 = c0388c.g;
                if (e4 < i9) {
                    if (e4 == 0) {
                        L1.j.T(r7, null, 0, c0388c.f4923d.length);
                        c0388c.f4924e = c0388c.f4923d.length - 1;
                        c0388c.f4925f = 0;
                        c0388c.g = 0;
                    } else {
                        c0388c.a(i9 - e4);
                    }
                }
            } else if (i7 == 16 || i7 == 0) {
                C0387b[] c0387bArr4 = e.f4932a;
                z2.i d4 = c0388c.d();
                e.a(d4);
                arrayList.add(new C0387b(d4, c0388c.d()));
            } else {
                arrayList.add(new C0387b(c0388c.b(c0388c.e(i7, 15) - 1), c0388c.d()));
            }
        }
        throw new IOException(X.d.f("Header index too large ", e3));
    }
}
