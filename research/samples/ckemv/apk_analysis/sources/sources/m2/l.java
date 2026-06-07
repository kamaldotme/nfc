package m2;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f4061j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f4062a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4063b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4064d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4065e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4066f;
    public final String g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4067i;

    public l(String str, String str2, String str3, String str4, int i3, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f4062a = str;
        this.f4063b = str2;
        this.c = str3;
        this.f4064d = str4;
        this.f4065e = i3;
        this.f4066f = arrayList2;
        this.g = str5;
        this.h = str6;
        this.f4067i = X1.g.a(str, "https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.f4062a.length() + 3;
        String str = this.h;
        String substring = str.substring(d2.d.b0(str, ':', length, false, 4) + 1, d2.d.b0(str, '@', 0, false, 6));
        X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f4062a.length() + 3;
        String str = this.h;
        int b02 = d2.d.b0(str, '/', length, false, 4);
        String substring = str.substring(b02, n2.b.e(b02, str.length(), str, "?#"));
        X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f4062a.length() + 3;
        String str = this.h;
        int b02 = d2.d.b0(str, '/', length, false, 4);
        int e3 = n2.b.e(b02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (b02 < e3) {
            int i3 = b02 + 1;
            int f3 = n2.b.f(str, '/', i3, e3);
            String substring = str.substring(i3, f3);
            X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            b02 = f3;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f4066f == null) {
            return null;
        }
        String str = this.h;
        int b02 = d2.d.b0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(b02, n2.b.f(str, '#', b02, str.length()));
        X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f4063b.length() == 0) {
            return "";
        }
        int length = this.f4062a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, n2.b.e(length, str.length(), str, ":@"));
        X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && X1.g.a(((l) obj).h, this.h);
    }

    public final URI f() {
        String substring;
        String str;
        k kVar = new k();
        String str2 = this.f4062a;
        kVar.f4057d = str2;
        kVar.f4058e = e();
        kVar.f4059f = a();
        kVar.g = this.f4064d;
        X1.g.e(str2, "scheme");
        int i3 = X1.g.a(str2, "http") ? 80 : X1.g.a(str2, "https") ? 443 : -1;
        int i4 = this.f4065e;
        kVar.f4056b = i4 != i3 ? i4 : -1;
        ArrayList arrayList = kVar.c;
        arrayList.clear();
        arrayList.addAll(c());
        String d3 = d();
        kVar.f4060i = d3 != null ? b.g(b.b(d3, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(d2.d.b0(str3, '#', 0, false, 6) + 1);
            X1.g.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        kVar.h = substring;
        String str4 = (String) kVar.g;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            X1.g.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            X1.g.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        kVar.g = str;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.set(i5, b.b((String) arrayList.get(i5), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = (ArrayList) kVar.f4060i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String str5 = (String) arrayList2.get(i6);
                arrayList2.set(i6, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str6 = (String) kVar.h;
        kVar.h = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String kVar2 = kVar.toString();
        try {
            return new URI(kVar2);
        } catch (URISyntaxException e3) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                X1.g.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(kVar2).replaceAll("");
                X1.g.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                X1.g.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
