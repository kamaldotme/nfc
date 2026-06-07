package J1;

import I1.y;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.SurfaceHolder;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f553b;
    public final /* synthetic */ g c;

    public /* synthetic */ f(g gVar, int i3) {
        this.f553b = i3;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = null;
        switch (this.f553b) {
            case 0:
                g gVar = this.c;
                try {
                    gVar.c.b();
                    return;
                } catch (Exception e3) {
                    Handler handler = gVar.f557d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e3).sendToTarget();
                        return;
                    }
                    return;
                }
            case 1:
                g gVar2 = this.c;
                try {
                    gVar2.c.a();
                    Handler handler2 = gVar2.f557d;
                    if (handler2 != null) {
                        i iVar = gVar2.c;
                        y yVar2 = iVar.f573j;
                        if (yVar2 != null) {
                            int i3 = iVar.f574k;
                            if (i3 == -1) {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                            yVar = i3 % 180 != 0 ? new y(yVar2.c, yVar2.f387b) : yVar2;
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, yVar).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    Handler handler3 = gVar2.f557d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e4).sendToTarget();
                        return;
                    }
                    return;
                }
            case 2:
                g gVar3 = this.c;
                try {
                    i iVar2 = gVar3.c;
                    v0.l lVar = gVar3.f556b;
                    Camera camera = iVar2.f567a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) lVar.f5083d;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) lVar.f5084e);
                    }
                    gVar3.c.e();
                    return;
                } catch (Exception e5) {
                    Handler handler4 = gVar3.f557d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e5).sendToTarget();
                        return;
                    }
                    return;
                }
            default:
                try {
                    i iVar3 = this.c.c;
                    b bVar = iVar3.c;
                    if (bVar != null) {
                        bVar.f543a = true;
                        bVar.f544b = false;
                        bVar.f546e.removeMessages(1);
                        if (bVar.c) {
                            try {
                                bVar.f545d.cancelAutoFocus();
                            } catch (RuntimeException unused) {
                            }
                        }
                        iVar3.c = null;
                    }
                    if (iVar3.f569d != null) {
                        iVar3.f569d = null;
                    }
                    Camera camera2 = iVar3.f567a;
                    if (camera2 != null && iVar3.f570e) {
                        camera2.stopPreview();
                        iVar3.f575l.f564a = null;
                        iVar3.f570e = false;
                    }
                    i iVar4 = this.c.c;
                    Camera camera3 = iVar4.f567a;
                    if (camera3 != null) {
                        camera3.release();
                        iVar4.f567a = null;
                    }
                } catch (Exception unused2) {
                }
                g gVar4 = this.c;
                gVar4.g = true;
                gVar4.f557d.sendEmptyMessage(R.id.zxing_camera_closed);
                C1.e eVar = this.c.f555a;
                synchronized (eVar.f131e) {
                    int i4 = eVar.f129b - 1;
                    eVar.f129b = i4;
                    if (i4 == 0) {
                        synchronized (eVar.f131e) {
                            ((HandlerThread) eVar.f130d).quit();
                            eVar.f130d = null;
                            eVar.c = null;
                        }
                    }
                }
                return;
        }
    }
}
