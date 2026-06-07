package u2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import m2.p;

/* loaded from: classes.dex */
public final class k extends n {
    public static final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r1.intValue() >= 9) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    static {
        Integer num;
        int i3;
        int i4;
        int i5;
        boolean z3 = true;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            v0.f.n(10);
            int length = property.length();
            if (length != 0) {
                char charAt = property.charAt(0);
                int i6 = -2147483647;
                if (X1.g.f(charAt, 48) >= 0) {
                    i3 = 0;
                } else if (length != 1) {
                    if (charAt == '-') {
                        i6 = Integer.MIN_VALUE;
                        i3 = 1;
                    } else if (charAt == '+') {
                        i3 = 1;
                        i4 = 0;
                        int i7 = 0;
                        int i8 = -59652323;
                        while (i3 < length) {
                            int digit = Character.digit((int) property.charAt(i3), 10);
                            if (digit >= 0 && ((i7 >= i8 || (i8 == -59652323 && i7 >= (i8 = i6 / 10))) && (i5 = i7 * 10) >= i6 + digit)) {
                                i7 = i5 - digit;
                                i3++;
                            }
                        }
                        num = i4 == 0 ? Integer.valueOf(i7) : Integer.valueOf(-i7);
                        if (num == null) {
                            try {
                                SSLSocket.class.getMethod("getApplicationProtocol", null);
                            } catch (NoSuchMethodException unused) {
                                z3 = false;
                                c = z3;
                            }
                        }
                        c = z3;
                    }
                }
                i4 = i3;
                int i72 = 0;
                int i82 = -59652323;
                while (i3 < length) {
                }
                if (i4 == 0) {
                }
                if (num == null) {
                }
                c = z3;
            }
        }
        num = null;
        if (num == null) {
        }
        c = z3;
    }

    @Override // u2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((p) obj) != p.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(L1.m.S(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p) it.next()).f4099b);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // u2.n
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (X1.g.a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
