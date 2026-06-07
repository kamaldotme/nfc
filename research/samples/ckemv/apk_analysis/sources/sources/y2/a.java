package y2;

import X1.g;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import u2.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: e, reason: collision with root package name */
    public final d f5275e;

    public a(d dVar) {
        g.e(dVar, "trustRootIndex");
        this.f5275e = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    @Override // u2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d(List list, String str) {
        g.e(list, "chain");
        g.e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        g.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z3 = false;
        for (int i3 = 0; i3 < 9; i3++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            g.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a3 = this.f5275e.a(x509Certificate);
            if (a3 == null) {
                Iterator it = arrayDeque.iterator();
                g.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    g.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (g.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                    while (it.hasNext()) {
                    }
                }
                if (z3) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !g.a(x509Certificate, a3)) {
                arrayList.add(a3);
            }
            if (g.a(a3.getIssuerDN(), a3.getSubjectDN())) {
                try {
                    a3.verify(a3.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                    z3 = true;
                }
            }
            z3 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && g.a(((a) obj).f5275e, this.f5275e);
    }

    public final int hashCode() {
        return this.f5275e.hashCode();
    }
}
