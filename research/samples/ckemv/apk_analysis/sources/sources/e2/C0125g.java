package e2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: e2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125g extends C0131m {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C0125g.class, "_resumed");
    private volatile int _resumed;

    public C0125g(O1.d dVar, Throwable th, boolean z3) {
        super(th, z3);
        this._resumed = 0;
    }
}
