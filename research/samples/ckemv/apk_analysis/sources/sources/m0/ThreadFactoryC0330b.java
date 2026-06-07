package m0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0330b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f3959a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3960b;

    public ThreadFactoryC0330b(boolean z3) {
        this.f3960b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        X1.g.e(runnable, "runnable");
        return new Thread(runnable, (this.f3960b ? "WM.task-" : "androidx.work-") + this.f3959a.incrementAndGet());
    }
}
