package i2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class j extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
