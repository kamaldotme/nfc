package androidx.work.impl.workers;

import X1.g;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import m0.o;

/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.e(context, "context");
        g.e(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public final o f() {
        return new o(this.c.f2186b);
    }
}
