package J1;

import I1.p;
import I1.y;
import I1.z;
import android.hardware.Camera;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class h implements Camera.PreviewCallback {

    /* renamed from: a, reason: collision with root package name */
    public A.h f564a;

    /* renamed from: b, reason: collision with root package name */
    public y f565b;
    public final /* synthetic */ i c;

    public h(i iVar) {
        this.c = iVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        y yVar = this.f565b;
        A.h hVar = this.f564a;
        if (yVar == null || hVar == null) {
            if (hVar != null) {
                new Exception("No resolution available");
                hVar.r();
                return;
            }
            return;
        }
        try {
            if (bArr == null) {
                throw new NullPointerException("No preview data received");
            }
            z zVar = new z(bArr, yVar.f387b, yVar.c, camera.getParameters().getPreviewFormat(), this.c.f574k);
            if (this.c.f568b.facing == 1) {
                zVar.f391e = true;
            }
            synchronized (((p) hVar.c).h) {
                try {
                    p pVar = (p) hVar.c;
                    if (pVar.g) {
                        pVar.c.obtainMessage(R.id.zxing_decode, zVar).sendToTarget();
                    }
                } finally {
                }
            }
        } catch (RuntimeException unused) {
            hVar.r();
        }
    }
}
