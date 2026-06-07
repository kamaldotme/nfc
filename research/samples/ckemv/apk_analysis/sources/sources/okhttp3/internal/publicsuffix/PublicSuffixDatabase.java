package okhttp3.internal.publicsuffix;

import L1.k;
import L1.l;
import L1.t;
import X1.g;
import a.AbstractC0059a;
import d1.e;
import d2.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import u2.n;
import v0.f;
import z2.m;
import z2.p;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4291e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f4292f = f.B("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f4293a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f4294b = new CountDownLatch(1);
    public byte[] c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4295d;

    public static List c(String str) {
        List j02 = d.j0(str, new char[]{'.'});
        if (j02.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!g.a(j02.get(l.Q(j02)), "")) {
            return j02;
        }
        int size = j02.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(X.d.g("Requested element count ", size, " is less than zero.").toString());
        }
        t tVar = t.f622b;
        if (size == 0) {
            return tVar;
        }
        if (size >= j02.size()) {
            return k.Y(j02);
        }
        if (size == 1) {
            if (j02.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return f.B(j02.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = j02.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : f.B(arrayList.get(0)) : tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d7, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00b9, code lost:
    
        X1.g.h("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00bd, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r3 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r5 = (byte[][]) r4.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r10 >= r9) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r5[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f4291e;
        r11 = r12.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r11 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r11 = d1.e.d(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r11 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        r3 = r3 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r5 >= r3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r7 = r12.f4295d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r7 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        r7 = d1.e.d(r7, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        r3 = d2.d.j0("!".concat(r7), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        if (r2.size() != r3.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) == '!') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) != '!') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        r2 = r2.size();
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0150, code lost:
    
        r3 = new L1.r(0, c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
    
        if (r2 < 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        if (r2 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        if ((r3 instanceof c2.b) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
    
        r3 = (c2.b) r3;
        r13 = r3.f2255b + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0167, code lost:
    
        if (r13 >= 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0169, code lost:
    
        r13 = new c2.b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016f, code lost:
    
        r3 = new c2.b(r3.f2254a, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0178, code lost:
    
        r13 = new c2.b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017e, code lost:
    
        r13 = new java.lang.StringBuilder();
        r13.append((java.lang.CharSequence) "");
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        if (r3.hasNext() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0192, code lost:
    
        r4 = r3.next();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        if (r0 <= 1) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0199, code lost:
    
        r13.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
    
        a.AbstractC0059a.a(r13, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        r13.append((java.lang.CharSequence) "");
        r13 = r13.toString();
        X1.g.d(r13, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ae, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
    
        throw new java.lang.IllegalArgumentException(X.d.g("Requested element count ", r2, " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0146, code lost:
    
        r2 = r2.size();
        r3 = r3.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00eb, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ed, code lost:
    
        if (r11 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ef, code lost:
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f4292f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f2, code lost:
    
        r4 = L1.t.f622b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f4, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f6, code lost:
    
        r5 = d2.d.j0(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0100, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0102, code lost:
    
        r4 = d2.d.j0(r11, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0112, code lost:
    
        if (r5.size() <= r4.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0114, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0116, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00d1, code lost:
    
        X1.g.h("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00d6, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        int i3 = 0;
        String unicode = IDN.toUnicode(str);
        g.d(unicode, "unicodeDomain");
        List c = c(unicode);
        if (this.f4293a.get() || !this.f4293a.compareAndSet(false, true)) {
            try {
                this.f4294b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z3 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z3 = true;
                    } catch (IOException e3) {
                        n nVar = n.f5043a;
                        n.f5043a.getClass();
                        n.i("Failed to read public suffix list", 5, e3);
                        if (z3) {
                        }
                    }
                } finally {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = c.size();
        byte[][] bArr = new byte[size];
        for (int i4 = 0; i4 < size; i4++) {
            String str3 = (String) c.get(i4);
            Charset charset = StandardCharsets.UTF_8;
            g.d(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            g.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i4] = bytes;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                g.h("publicSuffixListBytes");
                throw null;
            }
            str2 = e.d(bArr2, bArr, i5);
            if (str2 != null) {
                break;
            }
            i5++;
        }
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            Logger logger = m.f5349a;
            p pVar = new p(new z2.k(new z2.d(resourceAsStream, 1, new Object())));
            try {
                long H2 = pVar.H();
                pVar.n(H2);
                byte[] o3 = pVar.c.o(H2);
                long H3 = pVar.H();
                pVar.n(H3);
                byte[] o4 = pVar.c.o(H3);
                AbstractC0059a.j(pVar, null);
                synchronized (this) {
                    this.c = o3;
                    this.f4295d = o4;
                }
            } finally {
            }
        } finally {
            this.f4294b.countDown();
        }
    }
}
