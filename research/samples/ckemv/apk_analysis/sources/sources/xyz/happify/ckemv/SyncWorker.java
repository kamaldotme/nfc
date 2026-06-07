package xyz.happify.ckemv;

import B2.a;
import X1.g;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import d2.l;
import java.util.List;
import m0.o;
import m0.p;

/* loaded from: classes.dex */
public final class SyncWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.e(context, "appContext");
        g.e(workerParameters, "workerParams");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [m0.p, java.lang.Object] */
    @Override // androidx.work.CoroutineWorker
    public final p f() {
        Context context = this.f3980b;
        g.d(context, "getApplicationContext(...)");
        a aVar = new a(context);
        String i3 = aVar.i();
        if (i3 != null) {
            String fetchCves = Reporter.INSTANCE.fetchCves(i3, "https://tqqemv.xyz");
            if (!l.V(fetchCves, "Error", false)) {
                try {
                    MeResponse meResponse = (MeResponse) new b1.l().b(fetchCves);
                    List<CveConfig> cves = meResponse != null ? meResponse.getCves() : null;
                    if (cves != null) {
                        cves.size();
                        aVar.A(cves);
                        return new o(m0.g.f3972b);
                    }
                } catch (Exception e3) {
                    e3.getMessage();
                }
            }
        }
        return new Object();
    }
}
