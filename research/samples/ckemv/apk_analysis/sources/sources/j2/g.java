package j2;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final transient O1.i f3517b;

    public g(O1.i iVar) {
        this.f3517b = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3517b.toString();
    }
}
