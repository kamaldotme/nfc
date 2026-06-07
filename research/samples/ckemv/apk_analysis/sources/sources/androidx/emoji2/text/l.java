package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import m0.z;

/* loaded from: classes.dex */
public final class l extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f1778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1779e;

    public l(z zVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1778d = zVar;
        this.f1779e = threadPoolExecutor;
    }

    @Override // m0.z
    public final void T(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1779e;
        try {
            this.f1778d.T(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // m0.z
    public final void U(v0.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1779e;
        try {
            this.f1778d.U(iVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
