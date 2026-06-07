package t2;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0387b[] f4932a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f4933b;

    static {
        C0387b c0387b = new C0387b(C0387b.f4918i, "");
        z2.i iVar = C0387b.f4917f;
        C0387b c0387b2 = new C0387b(iVar, "GET");
        C0387b c0387b3 = new C0387b(iVar, "POST");
        z2.i iVar2 = C0387b.g;
        C0387b c0387b4 = new C0387b(iVar2, "/");
        C0387b c0387b5 = new C0387b(iVar2, "/index.html");
        z2.i iVar3 = C0387b.h;
        C0387b c0387b6 = new C0387b(iVar3, "http");
        C0387b c0387b7 = new C0387b(iVar3, "https");
        z2.i iVar4 = C0387b.f4916e;
        C0387b[] c0387bArr = {c0387b, c0387b2, c0387b3, c0387b4, c0387b5, c0387b6, c0387b7, new C0387b(iVar4, "200"), new C0387b(iVar4, "204"), new C0387b(iVar4, "206"), new C0387b(iVar4, "304"), new C0387b(iVar4, "400"), new C0387b(iVar4, "404"), new C0387b(iVar4, "500"), new C0387b("accept-charset", ""), new C0387b("accept-encoding", "gzip, deflate"), new C0387b("accept-language", ""), new C0387b("accept-ranges", ""), new C0387b("accept", ""), new C0387b("access-control-allow-origin", ""), new C0387b("age", ""), new C0387b("allow", ""), new C0387b("authorization", ""), new C0387b("cache-control", ""), new C0387b("content-disposition", ""), new C0387b("content-encoding", ""), new C0387b("content-language", ""), new C0387b("content-length", ""), new C0387b("content-location", ""), new C0387b("content-range", ""), new C0387b("content-type", ""), new C0387b("cookie", ""), new C0387b("date", ""), new C0387b("etag", ""), new C0387b("expect", ""), new C0387b("expires", ""), new C0387b("from", ""), new C0387b("host", ""), new C0387b("if-match", ""), new C0387b("if-modified-since", ""), new C0387b("if-none-match", ""), new C0387b("if-range", ""), new C0387b("if-unmodified-since", ""), new C0387b("last-modified", ""), new C0387b("link", ""), new C0387b("location", ""), new C0387b("max-forwards", ""), new C0387b("proxy-authenticate", ""), new C0387b("proxy-authorization", ""), new C0387b("range", ""), new C0387b("referer", ""), new C0387b("refresh", ""), new C0387b("retry-after", ""), new C0387b("server", ""), new C0387b("set-cookie", ""), new C0387b("strict-transport-security", ""), new C0387b("transfer-encoding", ""), new C0387b("user-agent", ""), new C0387b("vary", ""), new C0387b("via", ""), new C0387b("www-authenticate", "")};
        f4932a = c0387bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i3 = 0; i3 < 61; i3++) {
            if (!linkedHashMap.containsKey(c0387bArr[i3].f4919a)) {
                linkedHashMap.put(c0387bArr[i3].f4919a, Integer.valueOf(i3));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        X1.g.d(unmodifiableMap, "unmodifiableMap(result)");
        f4933b = unmodifiableMap;
    }

    public static void a(z2.i iVar) {
        X1.g.e(iVar, "name");
        int c = iVar.c();
        for (int i3 = 0; i3 < c; i3++) {
            byte f3 = iVar.f(i3);
            if (65 <= f3 && f3 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.j()));
            }
        }
    }
}
