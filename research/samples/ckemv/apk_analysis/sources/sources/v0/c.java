package V0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import z.AbstractC0452b;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f977b;
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f978d;

    public /* synthetic */ c(int i3, int i4, Object obj) {
        this.f977b = i4;
        this.f978d = obj;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f977b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f978d;
                View view = (View) sideSheetBehavior.f2472p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.c, false);
                    return;
                }
                return;
            default:
                ((AbstractC0452b) this.f978d).g(this.c);
                return;
        }
    }
}
