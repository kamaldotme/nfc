package w0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408c extends AbstractRunnableC0409d {
    public final /* synthetic */ n0.s c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5148e = false;

    public C0408c(n0.s sVar, String str) {
        this.c = sVar;
        this.f5147d = str;
    }

    @Override // w0.AbstractRunnableC0409d
    public final void b() {
        n0.s sVar = this.c;
        WorkDatabase workDatabase = sVar.f4209f;
        workDatabase.c();
        try {
            Iterator it = workDatabase.u().h(this.f5147d).iterator();
            while (it.hasNext()) {
                AbstractRunnableC0409d.a(sVar, (String) it.next());
            }
            workDatabase.p();
            workDatabase.k();
            if (this.f5148e) {
                n0.l.b(sVar.f4208e, sVar.f4209f, sVar.h);
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
