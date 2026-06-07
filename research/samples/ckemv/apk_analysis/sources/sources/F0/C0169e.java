package f0;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169e extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final int f3014b;
    public final Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0169e(int i3, Throwable th) {
        super(th);
        X.d.o("callbackName", i3);
        this.f3014b = i3;
        this.c = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }
}
