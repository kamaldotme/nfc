package q2;

import java.net.Socket;

/* loaded from: classes.dex */
public final class h extends z2.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f4449m;

    public h(i iVar) {
        this.f4449m = iVar;
    }

    @Override // z2.e
    public final void k() {
        Socket socket;
        i iVar = this.f4449m;
        if (iVar.f4462q) {
            return;
        }
        iVar.f4462q = true;
        e eVar = iVar.f4463r;
        if (eVar != null) {
            eVar.f4438d.cancel();
        }
        l lVar = iVar.f4464s;
        if (lVar != null && (socket = lVar.c) != null) {
            n2.b.d(socket);
        }
        iVar.f4453f.getClass();
    }
}
