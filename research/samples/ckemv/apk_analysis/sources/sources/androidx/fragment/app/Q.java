package androidx.fragment.app;

import java.io.Writer;

/* loaded from: classes.dex */
public final class Q extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f1878b = new StringBuilder(128);

    public final void a() {
        StringBuilder sb = this.f1878b;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c = cArr[i3 + i5];
            if (c == '\n') {
                a();
            } else {
                this.f1878b.append(c);
            }
        }
    }
}
