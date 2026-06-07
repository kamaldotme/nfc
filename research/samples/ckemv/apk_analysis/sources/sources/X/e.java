package X;

import java.util.concurrent.Executor;
import l.C0324a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1001b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1001b) {
            case 0:
                runnable.run();
                return;
            default:
                C0324a.O().f3891b.c.execute(runnable);
                return;
        }
    }
}
