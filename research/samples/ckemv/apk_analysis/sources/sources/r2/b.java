package r2;

import X0.o;
import X1.g;
import a.AbstractC0059a;
import java.io.IOException;
import java.net.ProtocolException;
import k.C0306s;
import m2.j;
import m2.m;
import m2.q;
import m2.r;
import m2.s;
import q2.i;
import q2.l;
import t2.C0386a;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4655a;

    public b(boolean z3) {
        this.f4655a = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0167 A[Catch: IOException -> 0x0138, TryCatch #1 {IOException -> 0x0138, blocks: (B:33:0x011e, B:35:0x0127, B:36:0x013a, B:39:0x015e, B:41:0x0167, B:42:0x016d, B:43:0x0181), top: B:32:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bf A[Catch: IOException -> 0x019e, TryCatch #11 {IOException -> 0x019e, blocks: (B:46:0x0189, B:50:0x0191, B:51:0x01af, B:53:0x01bf, B:61:0x01d8, B:63:0x01dc, B:66:0x01e9, B:68:0x01fe, B:69:0x0208, B:70:0x0212, B:74:0x01c9, B:75:0x01a1), top: B:45:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dc A[Catch: IOException -> 0x019e, TryCatch #11 {IOException -> 0x019e, blocks: (B:46:0x0189, B:50:0x0191, B:51:0x01af, B:53:0x01bf, B:61:0x01d8, B:63:0x01dc, B:66:0x01e9, B:68:0x01fe, B:69:0x0208, B:70:0x0212, B:74:0x01c9, B:75:0x01a1), top: B:45:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9 A[Catch: IOException -> 0x019e, TryCatch #11 {IOException -> 0x019e, blocks: (B:46:0x0189, B:50:0x0191, B:51:0x01af, B:53:0x01bf, B:61:0x01d8, B:63:0x01dc, B:66:0x01e9, B:68:0x01fe, B:69:0x0208, B:70:0x0212, B:74:0x01c9, B:75:0x01a1), top: B:45:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    @Override // m2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(f fVar) {
        boolean z3;
        q qVar;
        String str;
        boolean z4;
        IOException iOException;
        q qVar2;
        boolean z5;
        int i3;
        r a3;
        s sVar;
        IOException iOException2;
        q c;
        boolean z6;
        boolean z7;
        long j3;
        ?? r4 = "HTTP ";
        q2.e eVar = fVar.f4659d;
        g.b(eVar);
        d dVar = eVar.f4438d;
        m2.b bVar = eVar.f4437b;
        i iVar = eVar.f4436a;
        l lVar = eVar.g;
        C0306s c0306s = fVar.f4660e;
        o oVar = (o) c0306s.f3773e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                bVar.getClass();
                g.e(iVar, "call");
                dVar.b(c0306s);
            } catch (IOException e3) {
                e = e3;
            }
            try {
                if (!AbstractC0059a.H((String) c0306s.c) || oVar == null) {
                    str = "HTTP ";
                    iOException2 = null;
                    iVar.f(eVar, true, false, null);
                    z3 = true;
                    qVar = null;
                } else {
                    try {
                        try {
                            if (d2.l.Q("100-continue", ((j) c0306s.f3772d).a("Expect"))) {
                                try {
                                    dVar.e();
                                    c = eVar.c(true);
                                    try {
                                        bVar.getClass();
                                        g.e(iVar, "call");
                                        z6 = false;
                                    } catch (IOException e4) {
                                        e = e4;
                                        str = "HTTP ";
                                        qVar = c;
                                        z3 = true;
                                        if (e instanceof C0386a) {
                                            throw e;
                                        }
                                        if (!eVar.f4440f) {
                                            throw e;
                                        }
                                        z4 = z3;
                                        iOException = e;
                                        if (qVar == null) {
                                        }
                                        qVar2 = qVar;
                                        qVar2.f4100a = c0306s;
                                        qVar2.f4103e = lVar.f4470e;
                                        qVar2.f4107k = currentTimeMillis;
                                        z5 = z4;
                                        qVar2.f4108l = System.currentTimeMillis();
                                        r a4 = qVar2.a();
                                        i3 = a4.f4112e;
                                        if (i3 != 100) {
                                        }
                                        q c3 = eVar.c(false);
                                        g.b(c3);
                                        if (z5) {
                                        }
                                        c3.f4100a = c0306s;
                                        c3.f4103e = lVar.f4470e;
                                        c3.f4107k = currentTimeMillis;
                                        c3.f4108l = System.currentTimeMillis();
                                        a4 = c3.a();
                                        i3 = a4.f4112e;
                                        bVar.getClass();
                                        g.e(iVar, "call");
                                        if (this.f4655a) {
                                        }
                                        q b3 = a4.b();
                                        b3.g = eVar.b(a4);
                                        a3 = b3.a();
                                        if (!d2.l.Q("close", ((j) a3.f4110b.f3772d).a("Connection"))) {
                                        }
                                        dVar.g().k();
                                        if (i3 != 204) {
                                        }
                                        sVar = a3.h;
                                        if ((sVar == null ? sVar.a() : -1L) > 0) {
                                        }
                                        return a3;
                                    }
                                } catch (IOException e5) {
                                    bVar.getClass();
                                    g.e(iVar, "call");
                                    eVar.d(e5);
                                    throw e5;
                                }
                            } else {
                                z6 = true;
                                c = null;
                            }
                            try {
                                if (c == null) {
                                    try {
                                        eVar.f4439e = false;
                                        o oVar2 = (o) c0306s.f3773e;
                                        g.b(oVar2);
                                        z7 = z6;
                                        qVar = c;
                                        j3 = oVar2.f1058a;
                                    } catch (IOException e6) {
                                        e = e6;
                                        str = "HTTP ";
                                        z7 = z6;
                                        qVar = c;
                                    }
                                    try {
                                        bVar.getClass();
                                        g.e(iVar, "call");
                                        str = "HTTP ";
                                        z2.o oVar3 = new z2.o(new q2.c(eVar, dVar.h(c0306s, j3), j3));
                                        oVar3.b(oVar.f1059b, oVar.f1058a, (byte[]) oVar.f1060d);
                                        oVar3.close();
                                    } catch (IOException e7) {
                                        e = e7;
                                        str = "HTTP ";
                                        z3 = z7;
                                        if (e instanceof C0386a) {
                                        }
                                    }
                                } else {
                                    str = "HTTP ";
                                    z7 = z6;
                                    qVar = c;
                                    iVar.f(eVar, true, false, null);
                                    if (lVar.g == null) {
                                        dVar.g().k();
                                    }
                                }
                                z3 = z7;
                                iOException2 = null;
                            } catch (IOException e8) {
                                e = e8;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            str = "HTTP ";
                            z3 = true;
                            qVar = null;
                            if (e instanceof C0386a) {
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                    }
                }
                try {
                    dVar.d();
                    z4 = z3;
                    iOException = iOException2;
                } catch (IOException e11) {
                    try {
                        eVar.d(e11);
                        throw e11;
                    } catch (IOException e12) {
                        e = e12;
                        if (e instanceof C0386a) {
                        }
                    }
                }
            } catch (IOException e13) {
                e = e13;
                str = "HTTP ";
                r4 = 1;
                z3 = r4;
                qVar = null;
                if (e instanceof C0386a) {
                }
            }
            try {
                if (qVar == null) {
                    try {
                        qVar = eVar.c(false);
                        g.b(qVar);
                        if (z4) {
                            bVar.getClass();
                            g.e(iVar, "call");
                            qVar2 = qVar;
                            z4 = false;
                            qVar2.f4100a = c0306s;
                            qVar2.f4103e = lVar.f4470e;
                            qVar2.f4107k = currentTimeMillis;
                            z5 = z4;
                            qVar2.f4108l = System.currentTimeMillis();
                            r a42 = qVar2.a();
                            i3 = a42.f4112e;
                            if (i3 != 100) {
                                if (102 <= i3 && i3 < 200) {
                                }
                                bVar.getClass();
                                g.e(iVar, "call");
                                if (this.f4655a || i3 != 101) {
                                    q b32 = a42.b();
                                    b32.g = eVar.b(a42);
                                    a3 = b32.a();
                                } else {
                                    q b4 = a42.b();
                                    b4.g = n2.b.c;
                                    a3 = b4.a();
                                }
                                if (!d2.l.Q("close", ((j) a3.f4110b.f3772d).a("Connection")) || d2.l.Q("close", r.a("Connection", a3))) {
                                    dVar.g().k();
                                }
                                if (i3 != 204 || i3 == 205) {
                                    sVar = a3.h;
                                    if ((sVar == null ? sVar.a() : -1L) > 0) {
                                        StringBuilder sb = new StringBuilder(str);
                                        sb.append(i3);
                                        sb.append(" had non-zero Content-Length: ");
                                        s sVar2 = a3.h;
                                        sb.append(sVar2 != null ? Long.valueOf(sVar2.a()) : null);
                                        throw new ProtocolException(sb.toString());
                                    }
                                }
                                return a3;
                            }
                            q c32 = eVar.c(false);
                            g.b(c32);
                            if (z5) {
                                bVar.getClass();
                                g.e(iVar, "call");
                            }
                            c32.f4100a = c0306s;
                            c32.f4103e = lVar.f4470e;
                            c32.f4107k = currentTimeMillis;
                            c32.f4108l = System.currentTimeMillis();
                            a42 = c32.a();
                            i3 = a42.f4112e;
                            bVar.getClass();
                            g.e(iVar, "call");
                            if (this.f4655a) {
                            }
                            q b322 = a42.b();
                            b322.g = eVar.b(a42);
                            a3 = b322.a();
                            if (!d2.l.Q("close", ((j) a3.f4110b.f3772d).a("Connection"))) {
                            }
                            dVar.g().k();
                            if (i3 != 204) {
                            }
                            sVar = a3.h;
                            if ((sVar == null ? sVar.a() : -1L) > 0) {
                            }
                            return a3;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        if (iOException != null) {
                            throw e;
                        }
                        v0.f.h(iOException, e);
                        throw iOException;
                    }
                }
                if (this.f4655a) {
                }
                q b3222 = a42.b();
                b3222.g = eVar.b(a42);
                a3 = b3222.a();
                if (!d2.l.Q("close", ((j) a3.f4110b.f3772d).a("Connection"))) {
                }
                dVar.g().k();
                if (i3 != 204) {
                }
                sVar = a3.h;
                if ((sVar == null ? sVar.a() : -1L) > 0) {
                }
                return a3;
            } catch (IOException e15) {
                e = e15;
                if (iOException != null) {
                }
            }
            qVar2 = qVar;
            qVar2.f4100a = c0306s;
            qVar2.f4103e = lVar.f4470e;
            qVar2.f4107k = currentTimeMillis;
            z5 = z4;
            qVar2.f4108l = System.currentTimeMillis();
            r a422 = qVar2.a();
            i3 = a422.f4112e;
            if (i3 != 100) {
            }
            q c322 = eVar.c(false);
            g.b(c322);
            if (z5) {
            }
            c322.f4100a = c0306s;
            c322.f4103e = lVar.f4470e;
            c322.f4107k = currentTimeMillis;
            c322.f4108l = System.currentTimeMillis();
            a422 = c322.a();
            i3 = a422.f4112e;
            bVar.getClass();
            g.e(iVar, "call");
        } catch (IOException e16) {
            bVar.getClass();
            g.e(iVar, "call");
            eVar.d(e16);
            throw e16;
        }
    }
}
