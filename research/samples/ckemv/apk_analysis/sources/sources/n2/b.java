package n2;

import L1.h;
import X1.g;
import d1.e;
import d2.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import m2.j;
import m2.o;
import m2.r;
import m2.s;
import t2.C0387b;
import u2.d;
import z2.i;
import z2.n;
import z2.v;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4249a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f4250b = d.v(new String[0]);
    public static final s c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f4251d;

    /* renamed from: e, reason: collision with root package name */
    public static final X1.j f4252e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f4253f;

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0185, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [z2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [z2.f, java.lang.Object, z2.h] */
    static {
        int i3;
        byte[] bArr = new byte[0];
        f4249a = bArr;
        ?? obj = new Object();
        obj.I(0, 0, bArr);
        long j3 = 0;
        c = new s(j3, obj, 0);
        b(j3, j3, j3);
        i iVar = i.f5338e;
        i[] iVarArr = {e.h("efbbbf"), e.h("feff"), e.h("fffe"), e.h("0000ffff"), e.h("ffff0000")};
        ArrayList arrayList = new ArrayList(new h(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i4 = 0; i4 < 5; i4++) {
            i iVar2 = iVarArr[i4];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        g.e(copyOf, "elements");
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new h(copyOf, true));
        int i5 = 0;
        int i6 = 0;
        while (i5 < 5) {
            i iVar3 = iVarArr[i5];
            int i7 = i6 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(X.d.g("fromIndex (0) is greater than toIndex (", size, ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i8 = size - 1;
            int i9 = 0;
            while (true) {
                if (i9 > i8) {
                    i3 = -(i9 + 1);
                    break;
                }
                i3 = (i9 + i8) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i3);
                int compareTo = comparable == iVar3 ? 0 : comparable == null ? -1 : iVar3 == null ? 1 : comparable.compareTo(iVar3);
                if (compareTo < 0) {
                    i9 = i3 + 1;
                } else if (compareTo > 0) {
                    i8 = i3 - 1;
                }
            }
            arrayList3.set(i3, Integer.valueOf(i6));
            i5++;
            i6 = i7;
        }
        if (((i) arrayList.get(0)).c() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i iVar4 = (i) arrayList.get(i10);
            int i11 = i10 + 1;
            int i12 = i11;
            while (i12 < arrayList.size()) {
                i iVar5 = (i) arrayList.get(i12);
                iVar5.getClass();
                g.e(iVar4, "prefix");
                if (iVar5.h(iVar4, iVar4.c())) {
                    if (iVar5.c() == iVar4.c()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar5).toString());
                    }
                    if (((Number) arrayList3.get(i12)).intValue() > ((Number) arrayList3.get(i10)).intValue()) {
                        arrayList.remove(i12);
                        arrayList3.remove(i12);
                    } else {
                        i12++;
                    }
                }
            }
            i10 = i11;
        }
        ?? obj2 = new Object();
        d.b(0L, obj2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (obj2.c / 4)];
        int i13 = 0;
        while (!obj2.v()) {
            iArr[i13] = obj2.H();
            i13++;
        }
        Object[] copyOf2 = Arrays.copyOf(iVarArr, 5);
        g.d(copyOf2, "copyOf(this, size)");
        new n((i[]) copyOf2);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        g.b(timeZone);
        f4251d = timeZone;
        f4252e = new X1.j(1);
        String h02 = d2.d.h0(o.class.getName(), "okhttp3.");
        if (l.P(h02, "Client")) {
            h02 = h02.substring(0, h02.length() - "Client".length());
            g.d(h02, "substring(...)");
        }
        f4253f = h02;
    }

    public static final boolean a(m2.l lVar, m2.l lVar2) {
        g.e(lVar, "<this>");
        g.e(lVar2, "other");
        return g.a(lVar.f4064d, lVar2.f4064d) && lVar.f4065e == lVar2.f4065e && g.a(lVar.f4062a, lVar2.f4062a);
    }

    public static final void b(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void c(Closeable closeable) {
        g.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!g.a(e4.getMessage(), "bio == null")) {
                throw e4;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i3, int i4, String str, String str2) {
        g.e(str, "<this>");
        while (i3 < i4) {
            if (d2.d.W(str2, str.charAt(i3))) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final int f(String str, char c3, int i3, int i4) {
        g.e(str, "<this>");
        while (i3 < i4) {
            if (str.charAt(i3) == c3) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final boolean g(v vVar, TimeUnit timeUnit) {
        g.e(vVar, "<this>");
        g.e(timeUnit, "timeUnit");
        try {
            return s(vVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        g.e(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        g.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i3 = 0;
            while (i3 < length) {
                String str = strArr[i3];
                int i4 = 0;
                while (true) {
                    if (i4 < strArr2.length) {
                        int i5 = i4 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i4]) == 0) {
                                return true;
                            }
                            i4 = i5;
                        } catch (ArrayIndexOutOfBoundsException e3) {
                            throw new NoSuchElementException(e3.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(r rVar) {
        String a3 = rVar.g.a("Content-Length");
        if (a3 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a3);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        g.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(L1.l.R(Arrays.copyOf(objArr2, objArr2.length)));
        g.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (g.f(charAt, 31) <= 0 || g.f(charAt, 127) >= 0) {
                return i3;
            }
        }
        return -1;
    }

    public static final int m(int i3, int i4, String str) {
        while (i3 < i4) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final int n(int i3, int i4, String str) {
        int i5 = i4 - 1;
        if (i3 <= i5) {
            while (true) {
                char charAt = str.charAt(i5);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i5 + 1;
                }
                if (i5 == i3) {
                    break;
                }
                i5--;
            }
        }
        return i3;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        g.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i3]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i3++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        g.e(str, "name");
        return l.Q(str, "Authorization") || l.Q(str, "Cookie") || l.Q(str, "Proxy-Authorization") || l.Q(str, "Set-Cookie");
    }

    public static final int q(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' > c3 || c3 >= 'G') {
            return -1;
        }
        return c3 - '7';
    }

    public static final int r(z2.h hVar) {
        g.e(hVar, "<this>");
        return (hVar.E() & 255) | ((hVar.E() & 255) << 16) | ((hVar.E() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [z2.f, java.lang.Object] */
    public static final boolean s(v vVar, int i3, TimeUnit timeUnit) {
        g.e(vVar, "<this>");
        g.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c3 = vVar.c().e() ? vVar.c().c() - nanoTime : Long.MAX_VALUE;
        vVar.c().d(Math.min(c3, timeUnit.toNanos(i3)) + nanoTime);
        try {
            ?? obj = new Object();
            while (vVar.z(obj, 8192L) != -1) {
                obj.u(obj.c);
            }
            if (c3 == Long.MAX_VALUE) {
                vVar.c().a();
            } else {
                vVar.c().d(nanoTime + c3);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c3 == Long.MAX_VALUE) {
                vVar.c().a();
            } else {
                vVar.c().d(nanoTime + c3);
            }
            return false;
        } catch (Throwable th) {
            if (c3 == Long.MAX_VALUE) {
                vVar.c().a();
            } else {
                vVar.c().d(nanoTime + c3);
            }
            throw th;
        }
    }

    public static final j t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0387b c0387b = (C0387b) it.next();
            String j3 = c0387b.f4919a.j();
            String j4 = c0387b.f4920b.j();
            arrayList.add(j3);
            arrayList.add(d2.d.n0(j4).toString());
        }
        return new j((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(m2.l lVar, boolean z3) {
        g.e(lVar, "<this>");
        String str = lVar.f4064d;
        if (d2.d.X(str, ":")) {
            str = "[" + str + ']';
        }
        int i3 = lVar.f4065e;
        if (!z3) {
            String str2 = lVar.f4062a;
            g.e(str2, "scheme");
            if (i3 == (g.a(str2, "http") ? 80 : g.a(str2, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i3;
    }

    public static final List v(List list) {
        g.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        g.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int w(String str, int i3) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i3;
    }

    public static final String x(int i3, int i4, String str) {
        int m3 = m(i3, i4, str);
        String substring = str.substring(m3, n(m3, i4, str));
        g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
