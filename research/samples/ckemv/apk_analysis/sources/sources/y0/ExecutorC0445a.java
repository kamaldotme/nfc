package y0;

import android.os.Handler;
import java.util.concurrent.Executor;
import v0.i;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0445a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f5257b;

    public ExecutorC0445a(i iVar) {
        this.f5257b = iVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Handler) this.f5257b.f5077d).post(runnable);
    }
}
