package I1;

import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;

/* loaded from: classes.dex */
public final class e implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f324a;

    public e(BarcodeView barcodeView) {
        this.f324a = barcodeView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        if (surfaceHolder == null) {
            int i6 = g.f327A;
            return;
        }
        y yVar = new y(i4, i5);
        g gVar = this.f324a;
        gVar.f340q = yVar;
        gVar.f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f324a.f340q = null;
    }
}
