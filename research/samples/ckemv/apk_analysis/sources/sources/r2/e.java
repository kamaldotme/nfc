package r2;

import L1.t;
import X1.g;
import a.AbstractC0059a;
import d2.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import m2.h;
import m2.j;
import m2.r;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import z2.i;

/* loaded from: classes.dex */
public abstract class e {
    static {
        i iVar = i.f5338e;
        d1.e.i("\"\\");
        d1.e.i("\t ,=");
    }

    public static final boolean a(r rVar) {
        if (g.a((String) rVar.f4110b.c, "HEAD")) {
            return false;
        }
        int i3 = rVar.f4112e;
        return (((i3 >= 100 && i3 < 200) || i3 == 204 || i3 == 304) && n2.b.j(rVar) == -1 && !l.Q("chunked", r.a("Transfer-Encoding", rVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f1, code lost:
    
        if (((java.util.regex.Pattern) r3.c).matcher(r0).matches() == false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0241  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(m2.b bVar, m2.l lVar, j jVar) {
        List list;
        h hVar;
        String str;
        int i3 = 1;
        g.e(bVar, "<this>");
        g.e(lVar, "url");
        g.e(jVar, "headers");
        if (bVar == m2.b.f4004b) {
            return;
        }
        Pattern pattern = h.f4041j;
        int size = jVar.size();
        int i4 = 0;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < size; i5++) {
            if (l.Q("Set-Cookie", jVar.b(i5))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(jVar.d(i5));
            }
        }
        List list2 = t.f622b;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            g.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i6 = 0; i6 < size2; i6++) {
            String str2 = (String) list.get(i6);
            g.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = n2.b.f4249a;
            char c = ';';
            int f3 = n2.b.f(str2, ';', i4, str2.length());
            char c3 = '=';
            int f4 = n2.b.f(str2, '=', i4, f3);
            if (f4 != f3) {
                String x2 = n2.b.x(i4, f4, str2);
                if (x2.length() != 0 && n2.b.l(x2) == -1) {
                    String x3 = n2.b.x(f4 + i3, f3, str2);
                    if (n2.b.l(x3) == -1) {
                        int i7 = f3 + i3;
                        int length = str2.length();
                        long j3 = 253402300799999L;
                        boolean z3 = i3;
                        long j4 = 253402300799999L;
                        String str3 = null;
                        long j5 = -1;
                        boolean z4 = false;
                        boolean z5 = false;
                        boolean z6 = 0;
                        String str4 = null;
                        while (true) {
                            if (i7 < length) {
                                int f5 = n2.b.f(str2, c, i7, length);
                                int f6 = n2.b.f(str2, c3, i7, f5);
                                String x4 = n2.b.x(i7, f6, str2);
                                String x5 = f6 < f5 ? n2.b.x(f6 + i3, f5, str2) : "";
                                if (l.Q(x4, "expires")) {
                                    try {
                                        j4 = AbstractC0059a.F(x5, x5.length());
                                        z6 = i3;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (l.Q(x4, "max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(x5);
                                        j5 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (NumberFormatException e3) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        g.d(compile, "compile(...)");
                                        if (!compile.matcher(x5).matches()) {
                                            throw e3;
                                        }
                                        j5 = l.V(x5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i3 = 1;
                                    z6 = 1;
                                } else if (!l.Q(x4, "domain")) {
                                    if (l.Q(x4, "path")) {
                                        str4 = x5;
                                    } else if (l.Q(x4, "secure")) {
                                        i3 = 1;
                                        z4 = true;
                                    } else if (l.Q(x4, "httponly")) {
                                        i3 = 1;
                                        z5 = true;
                                    }
                                    i3 = 1;
                                } else {
                                    if (!(!l.P(x5, "."))) {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                    String P2 = v0.f.P(d2.d.h0(x5, "."));
                                    if (P2 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = P2;
                                    i3 = 1;
                                    z3 = 0;
                                }
                                i7 = f5 + 1;
                                c = ';';
                                c3 = '=';
                                z6 = z6;
                                z3 = z3;
                            } else {
                                if (j5 == Long.MIN_VALUE) {
                                    j3 = Long.MIN_VALUE;
                                } else if (j5 != -1) {
                                    long j6 = currentTimeMillis + (j5 <= 9223372036854775L ? j5 * 1000 : Long.MAX_VALUE);
                                    if (j6 >= currentTimeMillis && j6 <= 253402300799999L) {
                                        j3 = j6;
                                    }
                                } else {
                                    j3 = j4;
                                }
                                String str5 = lVar.f4064d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!g.a(str5, str3)) {
                                    if (l.P(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        X1.j jVar2 = n2.b.f4252e;
                                        jVar2.getClass();
                                    }
                                    i4 = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i4 = 0;
                                    if (str7 == null || !l.V(str7, "/", false)) {
                                        String b3 = lVar.b();
                                        int e02 = d2.d.e0(b3, '/', 0, 6);
                                        if (e02 != 0) {
                                            str6 = b3.substring(0, e02);
                                            g.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    hVar = new h(x2, x3, j3, str3, str, z4, z5, z6, z3);
                                }
                            }
                        }
                    }
                }
                hVar = null;
                i4 = 0;
                if (hVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(hVar);
                }
                i3 = 1;
            }
            hVar = null;
            if (hVar != null) {
            }
            i3 = 1;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            g.d(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
