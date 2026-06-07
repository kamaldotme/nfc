package e2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: e2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0131m {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2813b = AtomicIntegerFieldUpdater.newUpdater(C0131m.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2814a;

    public C0131m(Throwable th, boolean z3) {
        this.f2814a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2814a + ']';
    }
}
