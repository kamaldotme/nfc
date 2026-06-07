package J1;

import I1.y;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m0.z;
import n1.C0345a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f566m = 0;

    /* renamed from: a, reason: collision with root package name */
    public Camera f567a;

    /* renamed from: b, reason: collision with root package name */
    public Camera.CameraInfo f568b;
    public b c;

    /* renamed from: d, reason: collision with root package name */
    public C0345a f569d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f570e;

    /* renamed from: f, reason: collision with root package name */
    public String f571f;
    public l h;

    /* renamed from: i, reason: collision with root package name */
    public y f572i;

    /* renamed from: j, reason: collision with root package name */
    public y f573j;
    public j g = new j();

    /* renamed from: k, reason: collision with root package name */
    public int f574k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final h f575l = new h(this);

    public i(Context context) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024 A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:5:0x0006, B:13:0x001e, B:15:0x0024, B:16:0x0035, B:31:0x002e), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:5:0x0006, B:13:0x001e, B:15:0x0024, B:16:0x0035, B:31:0x002e), top: B:4:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Camera.Size previewSize;
        int i3;
        int i4;
        Camera camera = this.f567a;
        if (camera == null) {
            throw new RuntimeException("Camera not open");
        }
        try {
            i3 = this.h.f579b;
        } catch (Exception unused) {
        }
        try {
            try {
                if (i3 != 0) {
                    if (i3 == 1) {
                        i4 = 90;
                    } else if (i3 == 2) {
                        i4 = 180;
                    } else if (i3 == 3) {
                        i4 = 270;
                    }
                    Camera.CameraInfo cameraInfo = this.f568b;
                    int i5 = cameraInfo.facing != 1 ? (360 - ((cameraInfo.orientation + i4) % 360)) % 360 : ((cameraInfo.orientation - i4) + 360) % 360;
                    this.f574k = i5;
                    camera.setDisplayOrientation(i5);
                    c(false);
                }
                c(false);
            } catch (Exception unused2) {
                c(true);
                previewSize = this.f567a.getParameters().getPreviewSize();
                if (previewSize != null) {
                    this.f573j = this.f572i;
                } else {
                    this.f573j = new y(previewSize.width, previewSize.height);
                }
                this.f575l.f565b = this.f573j;
                return;
            }
        } catch (Exception unused3) {
            previewSize = this.f567a.getParameters().getPreviewSize();
            if (previewSize != null) {
            }
            this.f575l.f565b = this.f573j;
            return;
        }
        i4 = 0;
        Camera.CameraInfo cameraInfo2 = this.f568b;
        if (cameraInfo2.facing != 1) {
        }
        this.f574k = i5;
        camera.setDisplayOrientation(i5);
    }

    public final void b() {
        int z3 = z.z(this.g.f576a);
        Camera open = z3 == -1 ? null : Camera.open(z3);
        this.f567a = open;
        if (open == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int z4 = z.z(this.g.f576a);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f568b = cameraInfo;
        Camera.getCameraInfo(z4, cameraInfo);
    }

    public final void c(boolean z3) {
        Camera.Parameters parameters = this.f567a.getParameters();
        String str = this.f571f;
        if (str == null) {
            this.f571f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters == null) {
            return;
        }
        parameters.flatten();
        this.g.getClass();
        int i3 = c.f548a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String a3 = c.a(supportedFocusModes, "auto");
        if (!z3 && a3 == null) {
            a3 = c.a(supportedFocusModes, "macro", "edof");
        }
        if (a3 != null && !a3.equals(parameters.getFocusMode())) {
            parameters.setFocusMode(a3);
        }
        if (!z3) {
            c.b(parameters, false);
            this.g.getClass();
            this.g.getClass();
            this.g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new y(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new y(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f572i = null;
        } else {
            l lVar = this.h;
            int i4 = this.f574k;
            if (i4 == -1) {
                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
            }
            boolean z4 = i4 % 180 != 0;
            y yVar = (y) lVar.c;
            if (yVar == null) {
                yVar = null;
            } else if (z4) {
                yVar = new y(yVar.c, yVar.f387b);
            }
            n nVar = (n) lVar.f580d;
            nVar.getClass();
            if (yVar != null) {
                Collections.sort(arrayList, new m(nVar, yVar));
            }
            Objects.toString(yVar);
            Objects.toString(arrayList);
            y yVar2 = (y) arrayList.get(0);
            this.f572i = yVar2;
            parameters.setPreviewSize(yVar2.f387b, yVar2.c);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    Arrays.toString(it.next());
                    it.hasNext();
                }
            }
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next = it2.next();
                    int i5 = next[0];
                    int i6 = next[1];
                    if (i5 >= 10000 && i6 <= 20000) {
                        iArr = next;
                        break;
                    }
                }
                if (iArr != null) {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Arrays.toString(iArr);
                    } else {
                        Arrays.toString(iArr);
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        parameters.flatten();
        this.f567a.setParameters(parameters);
    }

    public final void d(boolean z3) {
        String flashMode;
        Camera camera = this.f567a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z3 != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true)) {
                    b bVar = this.c;
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
                    }
                    Camera.Parameters parameters2 = this.f567a.getParameters();
                    c.b(parameters2, z3);
                    this.g.getClass();
                    this.f567a.setParameters(parameters2);
                    b bVar2 = this.c;
                    if (bVar2 != null) {
                        bVar2.f543a = false;
                        bVar2.b();
                    }
                }
            } catch (RuntimeException unused2) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [n1.a, java.lang.Object] */
    public final void e() {
        Camera camera = this.f567a;
        if (camera == null || this.f570e) {
            return;
        }
        camera.startPreview();
        this.f570e = true;
        this.c = new b(this.f567a, this.g);
        j jVar = this.g;
        ?? obj = new Object();
        obj.f4235a = this;
        obj.f4236b = new Handler();
        this.f569d = obj;
        jVar.getClass();
    }
}
