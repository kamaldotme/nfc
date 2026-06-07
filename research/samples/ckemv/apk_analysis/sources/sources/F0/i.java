package F0;

import B2.u;
import J.B;
import J.T;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import v.AbstractC0397a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172a;

    /* renamed from: b, reason: collision with root package name */
    public int f173b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0397a f175e;

    public i(SideSheetBehavior sideSheetBehavior) {
        this.f172a = 1;
        this.f175e = sideSheetBehavior;
        this.f174d = new u(4, this);
    }

    public final void a(int i3) {
        Runnable runnable = this.f174d;
        AbstractC0397a abstractC0397a = this.f175e;
        switch (this.f172a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0397a;
                WeakReference weakReference = bottomSheetBehavior.f2299U;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.f173b = i3;
                if (this.c) {
                    return;
                }
                View view = (View) bottomSheetBehavior.f2299U.get();
                WeakHashMap weakHashMap = T.f402a;
                B.m(view, (h) runnable);
                this.c = true;
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0397a;
                WeakReference weakReference2 = sideSheetBehavior.f2472p;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                this.f173b = i3;
                if (this.c) {
                    return;
                }
                View view2 = (View) sideSheetBehavior.f2472p.get();
                WeakHashMap weakHashMap2 = T.f402a;
                B.m(view2, (u) runnable);
                this.c = true;
                return;
        }
    }

    public i(BottomSheetBehavior bottomSheetBehavior) {
        this.f172a = 0;
        this.f175e = bottomSheetBehavior;
        this.f174d = new h(0, this);
    }
}
