package i1;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0187b implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3191j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f3192k = new String[128];

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f3193l;

    /* renamed from: b, reason: collision with root package name */
    public final Writer f3194b;
    public int[] c;

    /* renamed from: d, reason: collision with root package name */
    public int f3195d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3196e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3197f;
    public boolean g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3198i;

    static {
        for (int i3 = 0; i3 <= 31; i3++) {
            f3192k[i3] = String.format("\\u%04x", Integer.valueOf(i3));
        }
        String[] strArr = f3192k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f3193l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C0187b(Writer writer) {
        int[] iArr = new int[32];
        this.c = iArr;
        this.f3195d = 0;
        if (iArr.length == 0) {
            this.c = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.c;
        int i3 = this.f3195d;
        this.f3195d = i3 + 1;
        iArr2[i3] = 6;
        this.f3196e = ":";
        this.f3198i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f3194b = writer;
    }

    public void A() {
        o(1, 2, ']');
    }

    public void D() {
        o(3, 5, '}');
    }

    public void G(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.h != null) {
            throw new IllegalStateException();
        }
        if (this.f3195d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.h = str;
    }

    public final void I() {
    }

    public C0187b J() {
        if (this.h != null) {
            if (!this.f3198i) {
                this.h = null;
                return this;
            }
            S();
        }
        a();
        this.f3194b.write("null");
        return this;
    }

    public final int K() {
        int i3 = this.f3195d;
        if (i3 != 0) {
            return this.c[i3 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(String str) {
        int i3;
        String str2;
        String[] strArr = this.g ? f3193l : f3192k;
        Writer writer = this.f3194b;
        writer.write(34);
        int length = str.length();
        int i4 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i3 = str2 == null ? i3 + 1 : 0;
                if (i4 < i3) {
                    writer.write(str, i4, i3 - i4);
                }
                writer.write(str2);
                i4 = i3 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i4 < i3) {
                }
                writer.write(str2);
                i4 = i3 + 1;
            }
        }
        if (i4 < length) {
            writer.write(str, i4, length - i4);
        }
        writer.write(34);
    }

    public void M(double d3) {
        S();
        if (this.f3197f || !(Double.isNaN(d3) || Double.isInfinite(d3))) {
            a();
            this.f3194b.append((CharSequence) Double.toString(d3));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
    }

    public void N(long j3) {
        S();
        a();
        this.f3194b.write(Long.toString(j3));
    }

    public void O(Boolean bool) {
        if (bool == null) {
            J();
            return;
        }
        S();
        a();
        this.f3194b.write(bool.booleanValue() ? "true" : "false");
    }

    public void P(Number number) {
        if (number == null) {
            J();
            return;
        }
        S();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f3191j.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f3197f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f3194b.append((CharSequence) obj);
    }

    public void Q(String str) {
        if (str == null) {
            J();
            return;
        }
        S();
        a();
        L(str);
    }

    public void R(boolean z3) {
        S();
        a();
        this.f3194b.write(z3 ? "true" : "false");
    }

    public final void S() {
        if (this.h != null) {
            int K2 = K();
            if (K2 == 5) {
                this.f3194b.write(44);
            } else if (K2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            I();
            this.c[this.f3195d - 1] = 4;
            L(this.h);
            this.h = null;
        }
    }

    public final void a() {
        int K2 = K();
        if (K2 == 1) {
            this.c[this.f3195d - 1] = 2;
            I();
            return;
        }
        Writer writer = this.f3194b;
        if (K2 == 2) {
            writer.append(',');
            I();
        } else {
            if (K2 == 4) {
                writer.append((CharSequence) this.f3196e);
                this.c[this.f3195d - 1] = 5;
                return;
            }
            if (K2 != 6) {
                if (K2 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f3197f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.c[this.f3195d - 1] = 7;
        }
    }

    public void b() {
        S();
        a();
        int i3 = this.f3195d;
        int[] iArr = this.c;
        if (i3 == iArr.length) {
            this.c = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.c;
        int i4 = this.f3195d;
        this.f3195d = i4 + 1;
        iArr2[i4] = 1;
        this.f3194b.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3194b.close();
        int i3 = this.f3195d;
        if (i3 > 1 || (i3 == 1 && this.c[i3 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f3195d = 0;
    }

    public void flush() {
        if (this.f3195d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f3194b.flush();
    }

    public void i() {
        S();
        a();
        int i3 = this.f3195d;
        int[] iArr = this.c;
        if (i3 == iArr.length) {
            this.c = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.c;
        int i4 = this.f3195d;
        this.f3195d = i4 + 1;
        iArr2[i4] = 3;
        this.f3194b.write(123);
    }

    public final void o(int i3, int i4, char c) {
        int K2 = K();
        if (K2 != i4 && K2 != i3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.h != null) {
            throw new IllegalStateException("Dangling name: " + this.h);
        }
        this.f3195d--;
        if (K2 == i4) {
            I();
        }
        this.f3194b.write(c);
    }
}
