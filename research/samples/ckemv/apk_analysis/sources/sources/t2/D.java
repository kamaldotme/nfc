package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class D extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final int f4914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(int i3) {
        super("stream was reset: ".concat(X.d.B(i3)));
        X.d.o("errorCode", i3);
        this.f4914b = i3;
    }
}
