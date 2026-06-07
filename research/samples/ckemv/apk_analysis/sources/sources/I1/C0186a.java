package i1;

import X.d;
import d1.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0186a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final Reader f3179b;

    /* renamed from: j, reason: collision with root package name */
    public long f3184j;

    /* renamed from: k, reason: collision with root package name */
    public int f3185k;

    /* renamed from: l, reason: collision with root package name */
    public String f3186l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f3187m;

    /* renamed from: o, reason: collision with root package name */
    public String[] f3189o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f3190p;
    public boolean c = false;

    /* renamed from: d, reason: collision with root package name */
    public final char[] f3180d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    public int f3181e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f3182f = 0;
    public int g = 0;
    public int h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f3183i = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3188n = 1;

    static {
        e.c = new e(4);
    }

    public C0186a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f3187m = iArr;
        iArr[0] = 6;
        this.f3189o = new String[32];
        this.f3190p = new int[32];
        this.f3179b = stringReader;
    }

    public final void A() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + d.x(W()) + L());
        }
        int i4 = this.f3188n;
        this.f3188n = i4 - 1;
        int[] iArr = this.f3190p;
        int i5 = i4 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.f3183i = 0;
    }

    public final void D() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + d.x(W()) + L());
        }
        int i4 = this.f3188n;
        int i5 = i4 - 1;
        this.f3188n = i5;
        this.f3189o[i5] = null;
        int[] iArr = this.f3190p;
        int i6 = i4 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f3183i = 0;
    }

    public final boolean G(int i3) {
        int i4;
        int i5;
        int i6 = this.h;
        int i7 = this.f3181e;
        this.h = i6 - i7;
        int i8 = this.f3182f;
        char[] cArr = this.f3180d;
        if (i8 != i7) {
            int i9 = i8 - i7;
            this.f3182f = i9;
            System.arraycopy(cArr, i7, cArr, 0, i9);
        } else {
            this.f3182f = 0;
        }
        this.f3181e = 0;
        do {
            int i10 = this.f3182f;
            int read = this.f3179b.read(cArr, i10, cArr.length - i10);
            if (read == -1) {
                return false;
            }
            i4 = this.f3182f + read;
            this.f3182f = i4;
            if (this.g == 0 && (i5 = this.h) == 0 && i4 > 0 && cArr[0] == 65279) {
                this.f3181e++;
                this.h = i5 + 1;
                i3++;
            }
        } while (i4 < i3);
        return true;
    }

    public final String I(boolean z3) {
        StringBuilder sb = new StringBuilder("$");
        int i3 = 0;
        while (true) {
            int i4 = this.f3188n;
            if (i3 >= i4) {
                return sb.toString();
            }
            int i5 = this.f3187m[i3];
            if (i5 == 1 || i5 == 2) {
                int i6 = this.f3190p[i3];
                if (z3 && i6 > 0 && i3 == i4 - 1) {
                    i6--;
                }
                sb.append('[');
                sb.append(i6);
                sb.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb.append('.');
                String str = this.f3189o[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
            i3++;
        }
    }

    public final boolean J() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        return (i3 == 2 || i3 == 4 || i3 == 17) ? false : true;
    }

    public final boolean K(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        i();
        return false;
    }

    public final String L() {
        return " at line " + (this.g + 1) + " column " + ((this.f3181e - this.h) + 1) + " path " + I(false);
    }

    public final boolean M() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 5) {
            this.f3183i = 0;
            int[] iArr = this.f3190p;
            int i4 = this.f3188n - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        }
        if (i3 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + d.x(W()) + L());
        }
        this.f3183i = 0;
        int[] iArr2 = this.f3190p;
        int i5 = this.f3188n - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return false;
    }

    public final double N() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 15) {
            this.f3183i = 0;
            int[] iArr = this.f3190p;
            int i4 = this.f3188n - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f3184j;
        }
        if (i3 == 16) {
            this.f3186l = new String(this.f3180d, this.f3181e, this.f3185k);
            this.f3181e += this.f3185k;
        } else if (i3 == 8 || i3 == 9) {
            this.f3186l = T(i3 == 8 ? '\'' : '\"');
        } else if (i3 == 10) {
            this.f3186l = V();
        } else if (i3 != 11) {
            throw new IllegalStateException("Expected a double but was " + d.x(W()) + L());
        }
        this.f3183i = 11;
        double parseDouble = Double.parseDouble(this.f3186l);
        if (!this.c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + L());
        }
        this.f3186l = null;
        this.f3183i = 0;
        int[] iArr2 = this.f3190p;
        int i5 = this.f3188n - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return parseDouble;
    }

    public final int O() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 15) {
            long j3 = this.f3184j;
            int i4 = (int) j3;
            if (j3 != i4) {
                throw new NumberFormatException("Expected an int but was " + this.f3184j + L());
            }
            this.f3183i = 0;
            int[] iArr = this.f3190p;
            int i5 = this.f3188n - 1;
            iArr[i5] = iArr[i5] + 1;
            return i4;
        }
        if (i3 == 16) {
            this.f3186l = new String(this.f3180d, this.f3181e, this.f3185k);
            this.f3181e += this.f3185k;
        } else {
            if (i3 != 8 && i3 != 9 && i3 != 10) {
                throw new IllegalStateException("Expected an int but was " + d.x(W()) + L());
            }
            if (i3 == 10) {
                this.f3186l = V();
            } else {
                this.f3186l = T(i3 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f3186l);
                this.f3183i = 0;
                int[] iArr2 = this.f3190p;
                int i6 = this.f3188n - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f3183i = 11;
        double parseDouble = Double.parseDouble(this.f3186l);
        int i7 = (int) parseDouble;
        if (i7 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f3186l + L());
        }
        this.f3186l = null;
        this.f3183i = 0;
        int[] iArr3 = this.f3190p;
        int i8 = this.f3188n - 1;
        iArr3[i8] = iArr3[i8] + 1;
        return i7;
    }

    public final long P() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 15) {
            this.f3183i = 0;
            int[] iArr = this.f3190p;
            int i4 = this.f3188n - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f3184j;
        }
        if (i3 == 16) {
            this.f3186l = new String(this.f3180d, this.f3181e, this.f3185k);
            this.f3181e += this.f3185k;
        } else {
            if (i3 != 8 && i3 != 9 && i3 != 10) {
                throw new IllegalStateException("Expected a long but was " + d.x(W()) + L());
            }
            if (i3 == 10) {
                this.f3186l = V();
            } else {
                this.f3186l = T(i3 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f3186l);
                this.f3183i = 0;
                int[] iArr2 = this.f3190p;
                int i5 = this.f3188n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f3183i = 11;
        double parseDouble = Double.parseDouble(this.f3186l);
        long j3 = (long) parseDouble;
        if (j3 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f3186l + L());
        }
        this.f3186l = null;
        this.f3183i = 0;
        int[] iArr3 = this.f3190p;
        int i6 = this.f3188n - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return j3;
    }

    public final String Q() {
        String T2;
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 14) {
            T2 = V();
        } else if (i3 == 12) {
            T2 = T('\'');
        } else {
            if (i3 != 13) {
                throw new IllegalStateException("Expected a name but was " + d.x(W()) + L());
            }
            T2 = T('\"');
        }
        this.f3183i = 0;
        this.f3189o[this.f3188n - 1] = T2;
        return T2;
    }

    public final int R(boolean z3) {
        int i3 = this.f3181e;
        int i4 = this.f3182f;
        while (true) {
            if (i3 == i4) {
                this.f3181e = i3;
                if (!G(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input" + L());
                }
                i3 = this.f3181e;
                i4 = this.f3182f;
            }
            int i5 = i3 + 1;
            char[] cArr = this.f3180d;
            char c = cArr[i3];
            if (c == '\n') {
                this.g++;
                this.h = i5;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f3181e = i5;
                    if (i5 == i4) {
                        this.f3181e = i3;
                        boolean G2 = G(2);
                        this.f3181e++;
                        if (!G2) {
                            return c;
                        }
                    }
                    i();
                    int i6 = this.f3181e;
                    char c3 = cArr[i6];
                    if (c3 == '*') {
                        this.f3181e = i6 + 1;
                        while (true) {
                            if (this.f3181e + 2 > this.f3182f && !G(2)) {
                                d0("Unterminated comment");
                                throw null;
                            }
                            int i7 = this.f3181e;
                            if (cArr[i7] != '\n') {
                                for (int i8 = 0; i8 < 2; i8++) {
                                    if (cArr[this.f3181e + i8] != "*/".charAt(i8)) {
                                        break;
                                    }
                                }
                                i3 = this.f3181e + 2;
                                i4 = this.f3182f;
                                break;
                            }
                            this.g++;
                            this.h = i7 + 1;
                            this.f3181e++;
                        }
                    } else {
                        if (c3 != '/') {
                            return c;
                        }
                        this.f3181e = i6 + 1;
                        a0();
                        i3 = this.f3181e;
                        i4 = this.f3182f;
                    }
                } else {
                    if (c != '#') {
                        this.f3181e = i5;
                        return c;
                    }
                    this.f3181e = i5;
                    i();
                    a0();
                    i3 = this.f3181e;
                    i4 = this.f3182f;
                }
            }
            i3 = i5;
        }
    }

    public final void S() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 != 7) {
            throw new IllegalStateException("Expected null but was " + d.x(W()) + L());
        }
        this.f3183i = 0;
        int[] iArr = this.f3190p;
        int i4 = this.f3188n - 1;
        iArr[i4] = iArr[i4] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f3181e = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.f3181e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String T(char c) {
        char[] cArr;
        int i3;
        StringBuilder sb = null;
        do {
            int i4 = this.f3181e;
            int i5 = this.f3182f;
            while (true) {
                int i6 = i5;
                int i7 = i4;
                while (true) {
                    cArr = this.f3180d;
                    if (i4 >= i6) {
                        break;
                    }
                    int i8 = i4 + 1;
                    char c3 = cArr[i4];
                    if (c3 == c) {
                        this.f3181e = i8;
                        int i9 = (i8 - i7) - 1;
                        if (sb == null) {
                            return new String(cArr, i7, i9);
                        }
                        sb.append(cArr, i7, i9);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        break;
                    }
                    if (c3 == '\n') {
                        this.g++;
                        this.h = i8;
                    }
                    i4 = i8;
                }
                sb.append(cArr, i7, i3);
                sb.append(Y());
                i4 = this.f3181e;
                i5 = this.f3182f;
            }
        } while (G(1));
        d0("Unterminated string");
        throw null;
    }

    public final String U() {
        String str;
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 10) {
            str = V();
        } else if (i3 == 8) {
            str = T('\'');
        } else if (i3 == 9) {
            str = T('\"');
        } else if (i3 == 11) {
            str = this.f3186l;
            this.f3186l = null;
        } else if (i3 == 15) {
            str = Long.toString(this.f3184j);
        } else {
            if (i3 != 16) {
                throw new IllegalStateException("Expected a string but was " + d.x(W()) + L());
            }
            str = new String(this.f3180d, this.f3181e, this.f3185k);
            this.f3181e += this.f3185k;
        }
        this.f3183i = 0;
        int[] iArr = this.f3190p;
        int i4 = this.f3188n - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        i();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String V() {
        char[] cArr;
        String sb;
        StringBuilder sb2 = null;
        int i3 = 0;
        do {
            int i4 = 0;
            while (true) {
                int i5 = this.f3181e;
                int i6 = i5 + i4;
                int i7 = this.f3182f;
                cArr = this.f3180d;
                if (i6 < i7) {
                    char c = cArr[i5 + i4];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i4++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i4 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i4, 16));
                    }
                    sb2.append(cArr, this.f3181e, i4);
                    this.f3181e += i4;
                } else if (G(i4 + 1)) {
                }
            }
            i3 = i4;
            if (sb2 != null) {
                sb = new String(cArr, this.f3181e, i3);
            } else {
                sb2.append(cArr, this.f3181e, i3);
                sb = sb2.toString();
            }
            this.f3181e += i3;
            return sb;
        } while (G(1));
        if (sb2 != null) {
        }
        this.f3181e += i3;
        return sb;
    }

    public final int W() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        switch (i3) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void X(int i3) {
        int i4 = this.f3188n;
        int[] iArr = this.f3187m;
        if (i4 == iArr.length) {
            int i5 = i4 * 2;
            this.f3187m = Arrays.copyOf(iArr, i5);
            this.f3190p = Arrays.copyOf(this.f3190p, i5);
            this.f3189o = (String[]) Arrays.copyOf(this.f3189o, i5);
        }
        int[] iArr2 = this.f3187m;
        int i6 = this.f3188n;
        this.f3188n = i6 + 1;
        iArr2[i6] = i3;
    }

    public final char Y() {
        int i3;
        if (this.f3181e == this.f3182f && !G(1)) {
            d0("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.f3181e;
        int i5 = i4 + 1;
        this.f3181e = i5;
        char[] cArr = this.f3180d;
        char c = cArr[i4];
        if (c == '\n') {
            this.g++;
            this.h = i5;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                d0("Invalid escape sequence");
                throw null;
            }
            if (i4 + 5 > this.f3182f && !G(4)) {
                d0("Unterminated escape sequence");
                throw null;
            }
            int i6 = this.f3181e;
            int i7 = i6 + 4;
            char c3 = 0;
            while (i6 < i7) {
                char c4 = cArr[i6];
                char c5 = (char) (c3 << 4);
                if (c4 >= '0' && c4 <= '9') {
                    i3 = c4 - '0';
                } else if (c4 >= 'a' && c4 <= 'f') {
                    i3 = c4 - 'W';
                } else {
                    if (c4 < 'A' || c4 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f3181e, 4)));
                    }
                    i3 = c4 - '7';
                }
                c3 = (char) (i3 + c5);
                i6++;
            }
            this.f3181e += 4;
            return c3;
        }
        return c;
    }

    public final void Z(char c) {
        do {
            int i3 = this.f3181e;
            int i4 = this.f3182f;
            while (i3 < i4) {
                int i5 = i3 + 1;
                char c3 = this.f3180d[i3];
                if (c3 == c) {
                    this.f3181e = i5;
                    return;
                }
                if (c3 == '\\') {
                    this.f3181e = i5;
                    Y();
                    i3 = this.f3181e;
                    i4 = this.f3182f;
                } else {
                    if (c3 == '\n') {
                        this.g++;
                        this.h = i5;
                    }
                    i3 = i5;
                }
            }
            this.f3181e = i3;
        } while (G(1));
        d0("Unterminated string");
        throw null;
    }

    public final void a() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 3) {
            X(1);
            this.f3190p[this.f3188n - 1] = 0;
            this.f3183i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + d.x(W()) + L());
        }
    }

    public final void a0() {
        char c;
        do {
            if (this.f3181e >= this.f3182f && !G(1)) {
                return;
            }
            int i3 = this.f3181e;
            int i4 = i3 + 1;
            this.f3181e = i4;
            c = this.f3180d[i3];
            if (c == '\n') {
                this.g++;
                this.h = i4;
                return;
            }
        } while (c != '\r');
    }

    public final void b() {
        int i3 = this.f3183i;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 1) {
            X(3);
            this.f3183i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + d.x(W()) + L());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void b0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f3181e
            int r2 = r1 + r0
            int r3 = r4.f3182f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f3180d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.i()
        L4b:
            int r1 = r4.f3181e
            int r1 = r1 + r0
            r4.f3181e = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f3181e = r1
            r0 = 1
            boolean r0 = r4.G(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C0186a.b0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void c0() {
        int i3 = 0;
        do {
            int i4 = this.f3183i;
            if (i4 == 0) {
                i4 = o();
            }
            switch (i4) {
                case 1:
                    X(3);
                    i3++;
                    this.f3183i = 0;
                    break;
                case 2:
                    if (i3 == 0) {
                        this.f3189o[this.f3188n - 1] = null;
                    }
                    this.f3188n--;
                    i3--;
                    this.f3183i = 0;
                    break;
                case 3:
                    X(1);
                    i3++;
                    this.f3183i = 0;
                    break;
                case 4:
                    this.f3188n--;
                    i3--;
                    this.f3183i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f3183i = 0;
                    break;
                case 8:
                    Z('\'');
                    this.f3183i = 0;
                    break;
                case 9:
                    Z('\"');
                    this.f3183i = 0;
                    break;
                case 10:
                    b0();
                    this.f3183i = 0;
                    break;
                case 12:
                    Z('\'');
                    if (i3 == 0) {
                        this.f3189o[this.f3188n - 1] = "<skipped>";
                    }
                    this.f3183i = 0;
                    break;
                case 13:
                    Z('\"');
                    if (i3 == 0) {
                        this.f3189o[this.f3188n - 1] = "<skipped>";
                    }
                    this.f3183i = 0;
                    break;
                case 14:
                    b0();
                    if (i3 == 0) {
                        this.f3189o[this.f3188n - 1] = "<skipped>";
                    }
                    this.f3183i = 0;
                    break;
                case 16:
                    this.f3181e += this.f3185k;
                    this.f3183i = 0;
                    break;
                case 17:
                    return;
            }
        } while (i3 > 0);
        int[] iArr = this.f3190p;
        int i5 = this.f3188n - 1;
        iArr[i5] = iArr[i5] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3183i = 0;
        this.f3187m[0] = 8;
        this.f3188n = 1;
        this.f3179b.close();
    }

    public final void d0(String str) {
        throw new IOException(str + L());
    }

    public final void i() {
        if (this.c) {
            return;
        }
        d0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0215, code lost:
    
        if (K(r1) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019a, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0218, code lost:
    
        if (r5 != 2) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021a, code lost:
    
        if (r14 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0220, code lost:
    
        if (r9 != Long.MIN_VALUE) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0222, code lost:
    
        if (r16 == 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0229, code lost:
    
        if (r9 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022b, code lost:
    
        if (r16 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x022d, code lost:
    
        if (r16 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0230, code lost:
    
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0231, code lost:
    
        r20.f3184j = r9;
        r20.f3181e += r8;
        r9 = 15;
        r20.f3183i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0225, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023d, code lost:
    
        if (r5 == r1) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0240, code lost:
    
        if (r5 == 4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0243, code lost:
    
        if (r5 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0245, code lost:
    
        r20.f3185k = r8;
        r9 = 16;
        r20.f3183i = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o() {
        int R2;
        int i3;
        int R3;
        int i4;
        String str;
        String str2;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.f3187m;
        int i9 = 1;
        int i10 = this.f3188n - 1;
        int i11 = iArr[i10];
        char[] cArr = this.f3180d;
        if (i11 == 1) {
            iArr[i10] = 2;
        } else if (i11 == 2) {
            int R4 = R(true);
            if (R4 != 44) {
                if (R4 != 59) {
                    if (R4 == 93) {
                        this.f3183i = 4;
                        return 4;
                    }
                    d0("Unterminated array");
                    throw null;
                }
                i();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10] = 4;
                if (i11 == 5 && (R2 = R(true)) != 44) {
                    if (R2 != 59) {
                        if (R2 == 125) {
                            this.f3183i = 2;
                            return 2;
                        }
                        d0("Unterminated object");
                        throw null;
                    }
                    i();
                }
                int R5 = R(true);
                if (R5 == 34) {
                    this.f3183i = 13;
                    return 13;
                }
                if (R5 == 39) {
                    i();
                    this.f3183i = 12;
                    return 12;
                }
                if (R5 == 125) {
                    if (i11 != 5) {
                        this.f3183i = 2;
                        return 2;
                    }
                    d0("Expected name");
                    throw null;
                }
                i();
                this.f3181e--;
                if (K((char) R5)) {
                    this.f3183i = 14;
                    return 14;
                }
                d0("Expected name");
                throw null;
            }
            if (i11 == 4) {
                iArr[i10] = 5;
                int R6 = R(true);
                if (R6 != 58) {
                    if (R6 != 61) {
                        d0("Expected ':'");
                        throw null;
                    }
                    i();
                    if (this.f3181e < this.f3182f || G(1)) {
                        int i12 = this.f3181e;
                        if (cArr[i12] == '>') {
                            this.f3181e = i12 + 1;
                        }
                    }
                }
            } else {
                if (i11 != 6) {
                    if (i11 == 7) {
                        i3 = 0;
                        if (R(false) == -1) {
                            this.f3183i = 17;
                            return 17;
                        }
                        i();
                        this.f3181e--;
                    } else {
                        i3 = 0;
                        if (i11 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    R3 = R(true);
                    if (R3 != 34) {
                        this.f3183i = 9;
                        return 9;
                    }
                    if (R3 == 39) {
                        i();
                        this.f3183i = 8;
                        return 8;
                    }
                    if (R3 == 44 || R3 == 59) {
                        i4 = 1;
                    } else {
                        if (R3 == 91) {
                            this.f3183i = 3;
                            return 3;
                        }
                        if (R3 == 93) {
                            i4 = 1;
                            if (i11 == 1) {
                                this.f3183i = 4;
                                return 4;
                            }
                        } else {
                            if (R3 == 123) {
                                this.f3183i = 1;
                                return 1;
                            }
                            int i13 = this.f3181e - 1;
                            this.f3181e = i13;
                            char c3 = cArr[i13];
                            if (c3 == 't' || c3 == 'T') {
                                str = "true";
                                str2 = "TRUE";
                                i5 = 5;
                            } else if (c3 == 'f' || c3 == 'F') {
                                str = "false";
                                str2 = "FALSE";
                                i5 = 6;
                            } else {
                                if (c3 == 'n' || c3 == 'N') {
                                    str = "null";
                                    str2 = "NULL";
                                    i5 = 7;
                                }
                                i5 = i3;
                                if (i5 == 0) {
                                    return i5;
                                }
                                int i14 = this.f3181e;
                                int i15 = this.f3182f;
                                int i16 = i3;
                                int i17 = i16;
                                int i18 = i17;
                                boolean z3 = true;
                                long j3 = 0;
                                while (true) {
                                    if (i14 + i17 == i15) {
                                        if (i17 == cArr.length) {
                                            break;
                                        }
                                        if (!G(i17 + 1)) {
                                            break;
                                        }
                                        int i19 = this.f3181e;
                                        i15 = this.f3182f;
                                        i14 = i19;
                                    }
                                    char c4 = cArr[i14 + i17];
                                    if (c4 != '+') {
                                        if (c4 == 'E' || c4 == 'e') {
                                            i6 = i15;
                                            i7 = 6;
                                            if (i16 != 2 && i16 != 4) {
                                                break;
                                            }
                                            i16 = 5;
                                            i17++;
                                            i15 = i6;
                                            i9 = 1;
                                        } else if (c4 == '-') {
                                            i6 = i15;
                                            i7 = 6;
                                            if (i16 == 0) {
                                                i16 = 1;
                                                i18 = 1;
                                                i17++;
                                                i15 = i6;
                                                i9 = 1;
                                            } else {
                                                if (i16 != 5) {
                                                    break;
                                                }
                                                i16 = i7;
                                                i17++;
                                                i15 = i6;
                                                i9 = 1;
                                            }
                                        } else if (c4 == '.') {
                                            i6 = i15;
                                            i7 = 6;
                                            if (i16 != 2) {
                                                break;
                                            }
                                            i16 = 3;
                                            i17++;
                                            i15 = i6;
                                            i9 = 1;
                                        } else {
                                            if (c4 < '0' || c4 > '9') {
                                                break;
                                            }
                                            if (i16 == i9 || i16 == 0) {
                                                i6 = i15;
                                                i7 = 6;
                                                j3 = -(c4 - '0');
                                                i16 = 2;
                                            } else if (i16 != 2) {
                                                i6 = i15;
                                                if (i16 == 3) {
                                                    i7 = 6;
                                                    i16 = 4;
                                                } else {
                                                    i7 = 6;
                                                    if (i16 == 5 || i16 == 6) {
                                                        i16 = 7;
                                                    }
                                                }
                                            } else {
                                                if (j3 == 0) {
                                                    break;
                                                }
                                                i6 = i15;
                                                long j4 = (10 * j3) - (c4 - '0');
                                                z3 &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                j3 = j4;
                                                i7 = 6;
                                            }
                                            i17++;
                                            i15 = i6;
                                            i9 = 1;
                                        }
                                        if (i8 == 0) {
                                            return i8;
                                        }
                                        if (!K(cArr[this.f3181e])) {
                                            d0("Expected value");
                                            throw null;
                                        }
                                        i();
                                        this.f3183i = 10;
                                        return 10;
                                    }
                                    i6 = i15;
                                    i7 = 6;
                                    if (i16 != 5) {
                                        break;
                                    }
                                    i16 = i7;
                                    i17++;
                                    i15 = i6;
                                    i9 = 1;
                                }
                                i8 = 0;
                                if (i8 == 0) {
                                }
                            }
                            int length = str.length();
                            int i20 = 1;
                            while (true) {
                                if (i20 < length) {
                                    if ((this.f3181e + i20 >= this.f3182f && !G(i20 + 1)) || ((c = cArr[this.f3181e + i20]) != str.charAt(i20) && c != str2.charAt(i20))) {
                                        break;
                                    }
                                    i20++;
                                } else if ((this.f3181e + length >= this.f3182f && !G(length + 1)) || !K(cArr[this.f3181e + length])) {
                                    this.f3181e += length;
                                    this.f3183i = i5;
                                }
                            }
                            i5 = i3;
                            if (i5 == 0) {
                            }
                        }
                    }
                    if (i11 != i4 && i11 != 2) {
                        d0("Unexpected value");
                        throw null;
                    }
                    i();
                    this.f3181e -= i4;
                    this.f3183i = 7;
                    return 7;
                }
                if (this.c) {
                    R(true);
                    int i21 = this.f3181e;
                    this.f3181e = i21 - 1;
                    if (i21 + 4 <= this.f3182f || G(5)) {
                        int i22 = this.f3181e;
                        if (cArr[i22] == ')' && cArr[i22 + 1] == ']' && cArr[i22 + 2] == '}' && cArr[i22 + 3] == '\'' && cArr[i22 + 4] == '\n') {
                            this.f3181e = i22 + 5;
                        }
                    }
                }
                this.f3187m[this.f3188n - 1] = 7;
            }
        }
        i3 = 0;
        R3 = R(true);
        if (R3 != 34) {
        }
    }

    public final String toString() {
        return C0186a.class.getSimpleName() + L();
    }
}
