package z2;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface t extends Closeable, Flushable {
    x c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void m(f fVar, long j3);
}
