package f;

import java.util.concurrent.Executor;

/* renamed from: f.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0146C implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2838b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2838b) {
            case 0:
                new Thread(runnable).start();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
