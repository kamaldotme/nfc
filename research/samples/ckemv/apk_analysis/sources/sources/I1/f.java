package I1;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.Iterator;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f326b;

    public /* synthetic */ f(int i3, Object obj) {
        this.f325a = i3;
        this.f326b = obj;
    }

    private final void b() {
    }

    private final void d(Exception exc) {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    public final void a() {
        Object obj = this.f326b;
        switch (this.f325a) {
            case 0:
                Iterator it = ((g) obj).f334k.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
                return;
            case 1:
                l lVar = (l) obj;
                if (lVar.f363k) {
                    lVar.f356a.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Exception exc) {
        switch (this.f325a) {
            case 0:
                Iterator it = ((g) this.f326b).f334k.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).c(exc);
                }
                return;
            case 1:
                l lVar = (l) this.f326b;
                lVar.b(lVar.f356a.getString(R.string.zxing_msg_camera_framework_bug));
                return;
            default:
                return;
        }
    }

    public final void e() {
        switch (this.f325a) {
            case 0:
                Iterator it = ((g) this.f326b).f334k.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).e();
                }
                return;
            case 1:
                return;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) this.f326b;
                g gVar = viewfinderView.f2604j;
                if (gVar != null) {
                    Rect framingRect = gVar.getFramingRect();
                    y previewSize = viewfinderView.f2604j.getPreviewSize();
                    if (framingRect != null && previewSize != null) {
                        viewfinderView.f2605k = framingRect;
                        viewfinderView.f2606l = previewSize;
                    }
                }
                viewfinderView.invalidate();
                return;
        }
    }

    public final void g() {
        switch (this.f325a) {
            case 0:
                Iterator it = ((g) this.f326b).f334k.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).g();
                }
                return;
            case 1:
            default:
                return;
        }
    }

    public final void j() {
        switch (this.f325a) {
            case 0:
                Iterator it = ((g) this.f326b).f334k.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).j();
                }
                return;
            case 1:
            default:
                return;
        }
    }
}
