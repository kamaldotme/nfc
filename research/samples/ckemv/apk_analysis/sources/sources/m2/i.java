package m2;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final u f4051a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4052b;
    public final List c;

    /* renamed from: d, reason: collision with root package name */
    public final K1.f f4053d;

    public i(u uVar, f fVar, List list, W1.a aVar) {
        X1.g.e(uVar, "tlsVersion");
        X1.g.e(fVar, "cipherSuite");
        X1.g.e(list, "localCertificates");
        this.f4051a = uVar;
        this.f4052b = fVar;
        this.c = list;
        this.f4053d = new K1.f(new a0.l(4, aVar));
    }

    public final List a() {
        return (List) this.f4053d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f4051a == this.f4051a && X1.g.a(iVar.f4052b, this.f4052b) && X1.g.a(iVar.a(), a()) && X1.g.a(iVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.f4052b.hashCode() + ((this.f4051a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a3 = a();
        ArrayList arrayList = new ArrayList(L1.m.S(a3));
        for (Certificate certificate : a3) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                X1.g.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f4051a);
        sb.append(" cipherSuite=");
        sb.append(this.f4052b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(L1.m.S(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                X1.g.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
