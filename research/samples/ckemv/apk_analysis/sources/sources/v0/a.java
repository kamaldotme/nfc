package V0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import m0.z;

/* loaded from: classes.dex */
public final class a extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f974d;

    /* renamed from: e, reason: collision with root package name */
    public final SideSheetBehavior f975e;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i3) {
        this.f974d = i3;
        this.f975e = sideSheetBehavior;
    }

    @Override // m0.z
    public final int C() {
        switch (this.f974d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f975e;
                return Math.max(0, sideSheetBehavior.f2470n + sideSheetBehavior.f2471o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f975e;
                return Math.max(0, (sideSheetBehavior2.f2469m - sideSheetBehavior2.f2468l) - sideSheetBehavior2.f2471o);
        }
    }

    @Override // m0.z
    public final int D() {
        switch (this.f974d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f975e;
                return (-sideSheetBehavior.f2468l) - sideSheetBehavior.f2471o;
            default:
                return this.f975e.f2469m;
        }
    }

    @Override // m0.z
    public final int E() {
        switch (this.f974d) {
            case 0:
                return this.f975e.f2471o;
            default:
                return this.f975e.f2469m;
        }
    }

    @Override // m0.z
    public final int F() {
        switch (this.f974d) {
            case 0:
                return -this.f975e.f2468l;
            default:
                return C();
        }
    }

    @Override // m0.z
    public final int G(View view) {
        switch (this.f974d) {
            case 0:
                return view.getRight() + this.f975e.f2471o;
            default:
                return view.getLeft() - this.f975e.f2471o;
        }
    }

    @Override // m0.z
    public final int H(CoordinatorLayout coordinatorLayout) {
        switch (this.f974d) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // m0.z
    public final int K() {
        switch (this.f974d) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // m0.z
    public final boolean P(float f3) {
        switch (this.f974d) {
            case 0:
                return f3 > 0.0f;
            default:
                return f3 < 0.0f;
        }
    }

    @Override // m0.z
    public final boolean R(View view) {
        switch (this.f974d) {
            case 0:
                return view.getRight() < (C() - D()) / 2;
            default:
                return view.getLeft() > (C() + this.f975e.f2469m) / 2;
        }
    }

    @Override // m0.z
    public final boolean S(float f3, float f4) {
        switch (this.f974d) {
            case 0:
                if (Math.abs(f3) > Math.abs(f4)) {
                    float abs = Math.abs(f3);
                    this.f975e.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f3) > Math.abs(f4)) {
                    float abs2 = Math.abs(f3);
                    this.f975e.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // m0.z
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f974d) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // m0.z
    public final float e(int i3) {
        switch (this.f974d) {
            case 0:
                float D = D();
                return (i3 - D) / (C() - D);
            default:
                float f3 = this.f975e.f2469m;
                return (f3 - i3) / (f3 - C());
        }
    }

    @Override // m0.z
    public final boolean h0(View view, float f3) {
        switch (this.f974d) {
            case 0:
                return Math.abs((f3 * this.f975e.f2467k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f3 * this.f975e.f2467k) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // m0.z
    public final void o0(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4) {
        switch (this.f974d) {
            case 0:
                if (i3 <= this.f975e.f2469m) {
                    marginLayoutParams.leftMargin = i4;
                    return;
                }
                return;
            default:
                int i5 = this.f975e.f2469m;
                if (i3 <= i5) {
                    marginLayoutParams.rightMargin = i5 - i3;
                    return;
                }
                return;
        }
    }
}
