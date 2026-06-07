package m2;

import a2.C0062a;
import f.C0150G;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4055a;

    /* renamed from: b, reason: collision with root package name */
    public int f4056b;
    public final ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4057d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4058e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4059f;
    public Object g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public List f4060i;

    public k(a aVar, C0150G c0150g, q2.i iVar, b bVar) {
        List k2;
        this.f4055a = 1;
        X1.g.e(aVar, "address");
        X1.g.e(c0150g, "routeDatabase");
        X1.g.e(iVar, "call");
        X1.g.e(bVar, "eventListener");
        this.f4057d = aVar;
        this.f4058e = c0150g;
        this.f4059f = iVar;
        this.g = bVar;
        L1.t tVar = L1.t.f622b;
        this.h = tVar;
        this.f4060i = tVar;
        this.c = new ArrayList();
        l lVar = aVar.h;
        X1.g.e(lVar, "url");
        URI f3 = lVar.f();
        if (f3.getHost() == null) {
            k2 = n2.b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.g.select(f3);
            if (select != null && !select.isEmpty()) {
                k2 = n2.b.v(select);
            } else {
                k2 = n2.b.k(Proxy.NO_PROXY);
            }
        }
        this.h = k2;
        this.f4056b = 0;
    }

    public l a() {
        ArrayList arrayList;
        String str = (String) this.f4057d;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String f3 = b.f((String) this.f4058e, 0, 0, false, 7);
        String f4 = b.f((String) this.f4059f, 0, 0, false, 7);
        String str2 = (String) this.g;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b3 = b();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(L1.m.S(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(b.f((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f4060i;
        if (arrayList4 != null) {
            arrayList = new ArrayList(L1.m.S(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? b.f(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.h;
        return new l(str, f3, f4, str2, b3, arrayList3, arrayList, str4 != null ? b.f(str4, 0, 0, false, 7) : null, toString());
    }

    public int b() {
        int i3 = this.f4056b;
        if (i3 != -1) {
            return i3;
        }
        String str = (String) this.f4057d;
        X1.g.b(str);
        if (X1.g.a(str, "http")) {
            return 80;
        }
        return X1.g.a(str, "https") ? 443 : -1;
    }

    public boolean c() {
        return (this.f4056b < ((List) this.h).size()) || (this.c.isEmpty() ^ true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0279, code lost:
    
        if (r1 < 65536) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0079, code lost:
    
        if (r7 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0148  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(l lVar, String str) {
        int i3;
        int i4;
        int i5;
        char c;
        char c3;
        int i6;
        int e3;
        char charAt;
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        String str2;
        boolean z3;
        int i10;
        int i11;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList2;
        int e4;
        ArrayList arrayList3;
        char charAt2;
        byte[] bArr = n2.b.f4249a;
        int m3 = n2.b.m(0, str.length(), str);
        int n3 = n2.b.n(m3, str.length(), str);
        char c4 = 65535;
        if (n3 - m3 >= 2) {
            char charAt3 = str.charAt(m3);
            char c5 = 'a';
            if ((X1.g.f(charAt3, 97) >= 0 && X1.g.f(charAt3, 122) <= 0) || (X1.g.f(charAt3, 65) >= 0 && X1.g.f(charAt3, 90) <= 0)) {
                i3 = m3 + 1;
                while (true) {
                    if (i3 >= n3) {
                        break;
                    }
                    char charAt4 = str.charAt(i3);
                    if ((c5 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i3++;
                        c5 = 'a';
                    }
                }
                String str6 = "http";
                String str7 = "https";
                String str8 = "this as java.lang.String…ing(startIndex, endIndex)";
                if (i3 == -1) {
                    if (d2.l.U(str, "https:", m3, true)) {
                        this.f4057d = "https";
                        m3 += 6;
                    } else {
                        if (!d2.l.U(str, "http:", m3, true)) {
                            StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            String substring = str.substring(0, i3);
                            X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f4057d = "http";
                        m3 += 5;
                    }
                } else {
                    if (lVar == null) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? d2.d.m0(str, 6).concat("...") : str));
                    }
                    this.f4057d = lVar.f4062a;
                }
                i4 = m3;
                i5 = 0;
                while (true) {
                    c = '/';
                    c3 = '\\';
                    if (i4 >= n3 || !((charAt2 = str.charAt(i4)) == '\\' || charAt2 == '/')) {
                        break;
                    }
                    i5++;
                    i4++;
                }
                ArrayList arrayList4 = this.c;
                char c6 = '#';
                if (i5 < 2 && lVar != null) {
                    if (X1.g.a(lVar.f4062a, (String) this.f4057d)) {
                        this.f4058e = lVar.e();
                        this.f4059f = lVar.a();
                        this.g = lVar.f4064d;
                        this.f4056b = lVar.f4065e;
                        arrayList4.clear();
                        arrayList4.addAll(lVar.c());
                        if (m3 == n3 || str.charAt(m3) == '#') {
                            String d3 = lVar.d();
                            this.f4060i = d3 != null ? b.g(b.b(d3, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
                        }
                        arrayList = arrayList4;
                        z3 = false;
                        e4 = n2.b.e(m3, n3, str, "?#");
                        if (m3 != e4) {
                            char charAt5 = str.charAt(m3);
                            if (charAt5 == '/' || charAt5 == '\\') {
                                arrayList3 = arrayList;
                                arrayList3.clear();
                                arrayList3.add("");
                                m3++;
                            } else {
                                arrayList3 = arrayList;
                                arrayList3.set(arrayList.size() - 1, "");
                            }
                            int i12 = m3;
                            while (i12 < e4) {
                                int e5 = n2.b.e(i12, e4, str, "/\\");
                                boolean z4 = e5 < e4 ? true : z3;
                                String b3 = b.b(str, i12, e5, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                                if (!X1.g.a(b3, ".") && !d2.l.Q(b3, "%2e")) {
                                    if (X1.g.a(b3, "..") || d2.l.Q(b3, "%2e.") || d2.l.Q(b3, ".%2e") || d2.l.Q(b3, "%2e%2e")) {
                                        if (((String) arrayList3.remove(arrayList3.size() - 1)).length() == 0 && (!arrayList3.isEmpty())) {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        } else {
                                            arrayList3.add("");
                                        }
                                        i12 = !z4 ? e5 + 1 : e5;
                                    } else {
                                        if (((CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                                            arrayList3.set(arrayList3.size() - 1, b3);
                                        } else {
                                            arrayList3.add(b3);
                                        }
                                        if (z4) {
                                            arrayList3.add("");
                                        }
                                    }
                                }
                                if (!z4) {
                                }
                            }
                        }
                        if (e4 < n3 && str.charAt(e4) == '?') {
                            int f3 = n2.b.f(str, '#', e4, n3);
                            this.f4060i = b.g(b.b(str, e4 + 1, f3, " \"'<>#", true, false, true, false, 208));
                            e4 = f3;
                        }
                        if (e4 < n3 || str.charAt(e4) != '#') {
                            return;
                        }
                        this.h = b.b(str, e4 + 1, n3, "", true, false, false, true, 176);
                        return;
                    }
                }
                i6 = m3 + i5;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    e3 = n2.b.e(i6, n3, str, "@/\\?#");
                    charAt = e3 == n3 ? str.charAt(e3) : c4;
                    if (charAt == c4 || charAt == c6 || charAt == c || charAt == c3 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z5) {
                            i11 = e3;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            this.f4059f = ((String) this.f4059f) + "%40" + b.b(str, i6, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        } else {
                            int f4 = n2.b.f(str, ':', i6, e3);
                            i11 = e3;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            String b4 = b.b(str, i6, f4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z6) {
                                b4 = ((String) this.f4058e) + "%40" + b4;
                            }
                            this.f4058e = b4;
                            if (f4 != i11) {
                                this.f4059f = b.b(str, f4 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z5 = true;
                            }
                            z6 = true;
                        }
                        i6 = i11 + 1;
                        arrayList4 = arrayList2;
                        str8 = str3;
                        str7 = str4;
                        str6 = str5;
                        c6 = '#';
                        c3 = '\\';
                        c4 = 65535;
                        c = '/';
                    }
                }
                String str9 = str8;
                String str10 = str7;
                String str11 = str6;
                arrayList = arrayList4;
                i7 = i6;
                while (true) {
                    if (i7 >= e3) {
                        i8 = e3;
                        break;
                    }
                    char charAt6 = str.charAt(i7);
                    if (charAt6 != '[') {
                        if (charAt6 == ':') {
                            i8 = i7;
                            break;
                        }
                        i7++;
                    }
                    do {
                        i7++;
                        if (i7 >= e3) {
                            break;
                        }
                    } while (str.charAt(i7) != ']');
                    i7++;
                }
                i9 = i8 + 1;
                if (i9 >= e3) {
                    this.g = v0.f.P(b.f(str, i6, i8, false, 4));
                    int i13 = i6;
                    try {
                        i10 = Integer.parseInt(b.b(str, i9, e3, "", false, false, false, false, 248));
                        if (1 <= i10) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i10 = -1;
                    this.f4056b = i10;
                    if (i10 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str.substring(i9, e3);
                        X1.g.d(substring2, str9);
                        sb2.append(substring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    str2 = str9;
                    i6 = i13;
                    z3 = false;
                } else {
                    str2 = str9;
                    z3 = false;
                    this.g = v0.f.P(b.f(str, i6, i8, false, 4));
                    String str12 = (String) this.f4057d;
                    X1.g.b(str12);
                    this.f4056b = X1.g.a(str12, str11) ? 80 : X1.g.a(str12, str10) ? 443 : -1;
                }
                if (((String) this.g) != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str.substring(i6, i8);
                    X1.g.d(substring3, str2);
                    sb3.append(substring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                m3 = e3;
                e4 = n2.b.e(m3, n3, str, "?#");
                if (m3 != e4) {
                }
                if (e4 < n3) {
                    int f32 = n2.b.f(str, '#', e4, n3);
                    this.f4060i = b.g(b.b(str, e4 + 1, f32, " \"'<>#", true, false, true, false, 208));
                    e4 = f32;
                }
                if (e4 < n3) {
                    return;
                } else {
                    return;
                }
            }
        }
        i3 = -1;
        String str62 = "http";
        String str72 = "https";
        String str82 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i3 == -1) {
        }
        i4 = m3;
        i5 = 0;
        while (true) {
            c = '/';
            c3 = '\\';
            if (i4 >= n3) {
                break;
            } else {
                break;
            }
            i5++;
            i4++;
        }
        ArrayList arrayList42 = this.c;
        char c62 = '#';
        if (i5 < 2) {
            if (X1.g.a(lVar.f4062a, (String) this.f4057d)) {
            }
        }
        i6 = m3 + i5;
        boolean z52 = false;
        boolean z62 = false;
        while (true) {
            e3 = n2.b.e(i6, n3, str, "@/\\?#");
            if (e3 == n3) {
            }
            if (charAt == c4) {
                break;
            } else {
                break;
            }
        }
        String str92 = str82;
        String str102 = str72;
        String str112 = str62;
        arrayList = arrayList42;
        i7 = i6;
        while (true) {
            if (i7 >= e3) {
            }
            i7++;
        }
        i9 = i8 + 1;
        if (i9 >= e3) {
        }
        if (((String) this.g) != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.f4055a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.f4057d;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f4058e).length() > 0 || ((String) this.f4059f).length() > 0) {
                    sb.append((String) this.f4058e);
                    if (((String) this.f4059f).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f4059f);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.g;
                if (str2 != null) {
                    if (d2.d.W(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.g);
                        sb.append(']');
                    } else {
                        sb.append((String) this.g);
                    }
                }
                int i3 = -1;
                if (this.f4056b != -1 || ((String) this.f4057d) != null) {
                    int b3 = b();
                    String str3 = (String) this.f4057d;
                    if (str3 != null) {
                        if (X1.g.a(str3, "http")) {
                            i3 = 80;
                            break;
                        } else if (X1.g.a(str3, "https")) {
                            i3 = 443;
                            break;
                        }
                    }
                    sb.append(':');
                    sb.append(b3);
                }
                ArrayList arrayList = this.c;
                X1.g.e(arrayList, "<this>");
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i4));
                }
                if (((ArrayList) this.f4060i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f4060i;
                    X1.g.b(arrayList2);
                    C0062a O2 = u2.l.O(u2.l.P(0, arrayList2.size()), 2);
                    int i5 = O2.f1424b;
                    int i6 = O2.c;
                    int i7 = O2.f1425d;
                    if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i5);
                            String str5 = (String) arrayList2.get(i5 + 1);
                            if (i5 > 0) {
                                sb.append('&');
                            }
                            sb.append(str4);
                            if (str5 != null) {
                                sb.append('=');
                                sb.append(str5);
                            }
                            if (i5 != i6) {
                                i5 += i7;
                            }
                        }
                    }
                }
                if (((String) this.h) != null) {
                    sb.append('#');
                    sb.append((String) this.h);
                }
                String sb2 = sb.toString();
                X1.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public k() {
        this.f4055a = 0;
        this.f4058e = "";
        this.f4059f = "";
        this.f4056b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("");
    }
}
