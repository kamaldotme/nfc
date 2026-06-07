package F0;

import a.AbstractC0059a;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m0.z;
import v.AbstractC0397a;

/* loaded from: classes.dex */
public final class d extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0397a f165e;

    public /* synthetic */ d(AbstractC0397a abstractC0397a, int i3) {
        this.f164d = i3;
        this.f165e = abstractC0397a;
    }

    @Override // m0.z
    public int M(View view) {
        switch (this.f164d) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f165e;
                return sideSheetBehavior.f2468l + sideSheetBehavior.f2471o;
            default:
                return super.M(view);
        }
    }

    @Override // m0.z
    public int N() {
        switch (this.f164d) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f165e;
                return bottomSheetBehavior.f2287I ? bottomSheetBehavior.f2298T : bottomSheetBehavior.f2285G;
            default:
                return super.N();
        }
    }

    @Override // m0.z
    public final void W(int i3) {
        switch (this.f164d) {
            case 0:
                if (i3 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f165e;
                    if (bottomSheetBehavior.f2289K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i3 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f165e;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // m0.z
    public final void X(View view, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f164d) {
            case 0:
                ((BottomSheetBehavior) this.f165e).u(i4);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f165e;
                WeakReference weakReference = sideSheetBehavior.f2473q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2460a.o0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2477u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2460a.e(i3);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    X.d.q(it.next());
                    throw null;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.f2460a.R(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f2460a.C()) < java.lang.Math.abs(r7 - r0.f2460a.D())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r7 > r4.f2283E) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f2283E)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f2283E) < java.lang.Math.abs(r7 - r4.f2285G)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (java.lang.Math.abs(r7 - r4.D) < java.lang.Math.abs(r7 - r4.f2285G)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        if (r7 < java.lang.Math.abs(r7 - r4.f2285G)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
    
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r4.f2285G)) goto L71;
     */
    @Override // m0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(View view, float f3, float f4) {
        switch (this.f164d) {
            case 0:
                int i3 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f165e;
                if (f4 < 0.0f) {
                    if (!bottomSheetBehavior.f2307b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        break;
                    }
                    i3 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i3, true);
                    return;
                }
                if (bottomSheetBehavior.f2287I && bottomSheetBehavior.D(view, f4)) {
                    if (Math.abs(f3) >= Math.abs(f4) || f4 <= bottomSheetBehavior.f2310d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f2298T) / 2) {
                            if (!bottomSheetBehavior.f2307b) {
                                break;
                            }
                            i3 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.E(view, i3, true);
                            return;
                        }
                    }
                    i3 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i3, true);
                    return;
                }
                if (f4 == 0.0f || Math.abs(f3) > Math.abs(f4)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f2307b) {
                        int i4 = bottomSheetBehavior.f2283E;
                        if (top2 >= i4) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    if (!bottomSheetBehavior.f2307b) {
                        int top3 = view.getTop();
                        break;
                    }
                    i3 = 4;
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.E(view, i3, true);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f165e;
                int i5 = 3;
                if (!sideSheetBehavior.f2460a.P(f3)) {
                    if (sideSheetBehavior.f2460a.h0(view, f3)) {
                        if (!sideSheetBehavior.f2460a.S(f3, f4)) {
                            break;
                        }
                        i5 = 5;
                    } else {
                        if (f3 == 0.0f || Math.abs(f3) <= Math.abs(f4)) {
                            int left = view.getLeft();
                            break;
                        }
                        i5 = 5;
                    }
                }
                sideSheetBehavior.t(view, i5, true);
                return;
        }
    }

    @Override // m0.z
    public final int l(View view, int i3) {
        switch (this.f164d) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f165e;
                return AbstractC0059a.i(i3, sideSheetBehavior.f2460a.F(), sideSheetBehavior.f2460a.E());
        }
    }

    @Override // m0.z
    public final int m(View view, int i3) {
        switch (this.f164d) {
            case 0:
                return AbstractC0059a.i(i3, ((BottomSheetBehavior) this.f165e).x(), N());
            default:
                return view.getTop();
        }
    }

    @Override // m0.z
    public final boolean n0(View view, int i3) {
        WeakReference weakReference;
        switch (this.f164d) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f165e;
                int i4 = bottomSheetBehavior.f2290L;
                if (i4 == 1 || bottomSheetBehavior.f2306a0) {
                    return false;
                }
                if (i4 == 3 && bottomSheetBehavior.f2303Y == i3) {
                    WeakReference weakReference2 = bottomSheetBehavior.f2300V;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.f2299U;
                return weakReference3 != null && weakReference3.get() == view;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f165e;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.f2472p) == null || weakReference.get() != view) ? false : true;
        }
    }
}
