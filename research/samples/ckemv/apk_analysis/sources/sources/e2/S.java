package e2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class S extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient Q f2782b;

    public S(String str, Throwable th, Q q3) {
        super(str);
        this.f2782b = q3;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof S) {
                S s3 = (S) obj;
                if (!X1.g.a(s3.getMessage(), getMessage()) || !X1.g.a(s3.f2782b, this.f2782b) || !X1.g.a(s3.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        X1.g.b(message);
        int hashCode = (this.f2782b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f2782b;
    }
}
