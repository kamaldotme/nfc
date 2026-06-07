package w0;

import androidx.work.impl.WorkDatabase;
import u0.InterfaceC0391a;

/* loaded from: classes.dex */
public final class t implements m0.i {

    /* renamed from: a, reason: collision with root package name */
    public final v0.i f5173a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0391a f5174b;
    public final v0.p c;

    static {
        m0.r.b("WMFgUpdater");
    }

    public t(WorkDatabase workDatabase, InterfaceC0391a interfaceC0391a, v0.i iVar) {
        this.f5174b = interfaceC0391a;
        this.f5173a = iVar;
        this.c = workDatabase.u();
    }
}
