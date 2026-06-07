package o2;

import d2.l;
import m2.q;
import m2.r;

/* loaded from: classes.dex */
public final class a {
    public static final r a(r rVar) {
        if ((rVar != null ? rVar.h : null) == null) {
            return rVar;
        }
        q b3 = rVar.b();
        b3.g = null;
        return b3.a();
    }

    public static boolean b(String str) {
        return (l.Q("Connection", str) || l.Q("Keep-Alive", str) || l.Q("Proxy-Authenticate", str) || l.Q("Proxy-Authorization", str) || l.Q("TE", str) || l.Q("Trailers", str) || l.Q("Transfer-Encoding", str) || l.Q("Upgrade", str)) ? false : true;
    }
}
