package s2;

import Z.C0035b;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import k.C0306s;
import m0.z;
import m2.j;
import m2.k;
import m2.o;
import m2.p;
import m2.q;
import m2.r;
import q2.l;
import z2.h;
import z2.t;
import z2.v;

/* loaded from: classes.dex */
public final class g implements r2.d {

    /* renamed from: a, reason: collision with root package name */
    public h f4720a;

    /* renamed from: b, reason: collision with root package name */
    public z2.g f4721b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4722d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4723e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4724f;
    public Object g;

    public g(o oVar, l lVar, h hVar, z2.g gVar) {
        X1.g.e(lVar, "connection");
        this.f4722d = oVar;
        this.f4723e = lVar;
        this.f4720a = hVar;
        this.f4721b = gVar;
        this.f4724f = new C0035b(hVar);
    }

    @Override // r2.d
    public v a(r rVar) {
        if (!r2.e.a(rVar)) {
            return i(0L);
        }
        if (d2.l.Q("chunked", r.a("Transfer-Encoding", rVar))) {
            m2.l lVar = (m2.l) rVar.f4110b.f3771b;
            if (this.c == 4) {
                this.c = 5;
                return new c(this, lVar);
            }
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        long j3 = n2.b.j(rVar);
        if (j3 != -1) {
            return i(j3);
        }
        if (this.c == 4) {
            this.c = 5;
            ((l) this.f4723e).k();
            return new a(this);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    @Override // r2.d
    public void b(C0306s c0306s) {
        Proxy.Type type = ((l) this.f4723e).f4468b.f4123b.type();
        X1.g.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) c0306s.c);
        sb.append(' ');
        m2.l lVar = (m2.l) c0306s.f3771b;
        if (lVar.f4067i || type != Proxy.Type.HTTP) {
            String b3 = lVar.b();
            String d3 = lVar.d();
            if (d3 != null) {
                b3 = b3 + '?' + d3;
            }
            sb.append(b3);
        } else {
            sb.append(lVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        X1.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
        j((j) c0306s.f3772d, sb2);
    }

    @Override // r2.d
    public long c(r rVar) {
        if (!r2.e.a(rVar)) {
            return 0L;
        }
        if (d2.l.Q("chunked", r.a("Transfer-Encoding", rVar))) {
            return -1L;
        }
        return n2.b.j(rVar);
    }

    @Override // r2.d
    public void cancel() {
        Socket socket = ((l) this.f4723e).c;
        if (socket != null) {
            n2.b.d(socket);
        }
    }

    @Override // r2.d
    public void d() {
        this.f4721b.flush();
    }

    @Override // r2.d
    public void e() {
        this.f4721b.flush();
    }

    @Override // r2.d
    public q f(boolean z3) {
        C0035b c0035b = (C0035b) this.f4724f;
        int i3 = this.c;
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        k kVar = null;
        try {
            String r3 = ((h) c0035b.c).r(c0035b.f1235b);
            c0035b.f1235b -= r3.length();
            J1.l Z2 = z.Z(r3);
            int i4 = Z2.f579b;
            q qVar = new q();
            p pVar = (p) Z2.c;
            X1.g.e(pVar, "protocol");
            qVar.f4101b = pVar;
            qVar.c = i4;
            String str = (String) Z2.f580d;
            X1.g.e(str, "message");
            qVar.f4102d = str;
            qVar.f4104f = c0035b.f().c();
            if (z3 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.c = 3;
            } else if (102 > i4 || i4 >= 200) {
                this.c = 4;
            } else {
                this.c = 3;
            }
            return qVar;
        } catch (EOFException e3) {
            m2.l lVar = ((l) this.f4723e).f4468b.f4122a.h;
            lVar.getClass();
            try {
                k kVar2 = new k();
                kVar2.d(lVar, "/...");
                kVar = kVar2;
            } catch (IllegalArgumentException unused) {
            }
            X1.g.b(kVar);
            kVar.f4058e = m2.b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            kVar.f4059f = m2.b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new IOException("unexpected end of stream on " + kVar.a().h, e3);
        }
    }

    @Override // r2.d
    public l g() {
        return (l) this.f4723e;
    }

    @Override // r2.d
    public t h(C0306s c0306s, long j3) {
        if (d2.l.Q("chunked", ((j) c0306s.f3772d).a("Transfer-Encoding"))) {
            if (this.c == 1) {
                this.c = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        if (j3 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.c == 1) {
            this.c = 2;
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    public d i(long j3) {
        if (this.c == 4) {
            this.c = 5;
            return new d(this, j3);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    public void j(j jVar, String str) {
        X1.g.e(jVar, "headers");
        X1.g.e(str, "requestLine");
        if (this.c != 0) {
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        z2.g gVar = this.f4721b;
        gVar.q(str).q("\r\n");
        int size = jVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            gVar.q(jVar.b(i3)).q(": ").q(jVar.d(i3)).q("\r\n");
        }
        gVar.q("\r\n");
        this.c = 1;
    }

    public g(p2.d dVar) {
        X1.g.e(dVar, "taskRunner");
        this.f4722d = dVar;
        this.g = t2.h.f4937a;
    }
}
