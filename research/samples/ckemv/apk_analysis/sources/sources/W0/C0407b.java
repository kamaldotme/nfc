package w0;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407b extends AbstractRunnableC0409d {
    public final /* synthetic */ n0.s c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f5146d;

    public C0407b(n0.s sVar, UUID uuid) {
        this.c = sVar;
        this.f5146d = uuid;
    }

    @Override // w0.AbstractRunnableC0409d
    public final void b() {
        n0.s sVar = this.c;
        WorkDatabase workDatabase = sVar.f4209f;
        workDatabase.c();
        try {
            AbstractRunnableC0409d.a(sVar, this.f5146d.toString());
            workDatabase.p();
            workDatabase.k();
            n0.l.b(sVar.f4208e, sVar.f4209f, sVar.h);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
