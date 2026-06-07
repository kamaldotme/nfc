package y2;

import L1.t;
import X1.g;
import X1.j;
import d2.l;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import v0.f;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5277a = new Object();

    public static List a(X509Certificate x509Certificate, int i3) {
        Object obj;
        t tVar = t.f622b;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return tVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && g.a(list.get(0), Integer.valueOf(i3)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return tVar;
        }
    }

    public static boolean b(String str) {
        int i3;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(X.d.g("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j3 = 0;
        int i4 = 0;
        while (i4 < length2) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                j3++;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i5 = i4 + 1;
                    char charAt2 = i5 < length2 ? str.charAt(i5) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j3++;
                        i4 = i5;
                    } else {
                        j3 += 4;
                        i4 += 2;
                    }
                }
                j3 += i3;
            }
            i4++;
        }
        return length == ((int) j3);
    }

    public static boolean c(String str, X509Certificate x509Certificate) {
        int length;
        g.e(str, "host");
        byte[] bArr = n2.b.f4249a;
        j jVar = n2.b.f4252e;
        jVar.getClass();
        if (((Pattern) jVar.c).matcher(str).matches()) {
            String P2 = f.P(str);
            List a3 = a(x509Certificate, 7);
            if (!a3.isEmpty()) {
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    if (g.a(P2, f.P((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                g.d(locale, "US");
                str = str.toLowerCase(locale);
                g.d(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a4 = a(x509Certificate, 2);
            if (!a4.isEmpty()) {
                for (String str2 : a4) {
                    if (str.length() != 0 && !l.V(str, ".", false) && !l.P(str, "..") && str2 != null && str2.length() != 0 && !l.V(str2, ".", false) && !l.P(str2, "..")) {
                        String concat = !l.P(str, ".") ? str.concat(".") : str;
                        if (!l.P(str2, ".")) {
                            str2 = str2.concat(".");
                        }
                        if (b(str2)) {
                            Locale locale2 = Locale.US;
                            g.d(locale2, "US");
                            str2 = str2.toLowerCase(locale2);
                            g.d(str2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!d2.d.X(str2, "*")) {
                            if (g.a(concat, str2)) {
                                return true;
                            }
                        } else if (l.V(str2, "*.", false) && d2.d.b0(str2, '*', 1, false, 4) == -1 && concat.length() >= str2.length() && !g.a("*.", str2)) {
                            String substring = str2.substring(1);
                            g.d(substring, "this as java.lang.String).substring(startIndex)");
                            if (l.P(concat, substring) && ((length = concat.length() - substring.length()) <= 0 || d2.d.e0(concat, '.', length - 1, 4) == -1)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        g.e(str, "host");
        g.e(sSLSession, "session");
        if (b(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                g.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return c(str, (X509Certificate) certificate);
    }
}
