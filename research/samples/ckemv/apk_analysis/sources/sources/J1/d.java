package J1;

import android.hardware.Camera;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f549b;
    public final /* synthetic */ g c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A.h f550d;

    public /* synthetic */ d(g gVar, A.h hVar, int i3) {
        this.f549b = i3;
        this.c = gVar;
        this.f550d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f549b) {
            case 0:
                g gVar = this.c;
                if (gVar.f559f) {
                    gVar.f555a.c(new d(gVar, this.f550d, 1));
                    return;
                }
                return;
            default:
                i iVar = this.c.c;
                Camera camera = iVar.f567a;
                if (camera == null || !iVar.f570e) {
                    return;
                }
                h hVar = iVar.f575l;
                hVar.f564a = this.f550d;
                camera.setOneShotPreviewCallback(hVar);
                return;
        }
    }
}
