package H0;

import Z.C0053u;
import Z.C0056x;
import Z.Q;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class a extends C0053u {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f273p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f274q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Context context, int i3) {
        super(context);
        this.f273p = i3;
        this.f274q = obj;
    }

    @Override // Z.C0053u
    public int b(View view, int i3) {
        switch (this.f273p) {
            case 0:
                ((CarouselLayoutManager) this.f274q).getClass();
                return 0;
            default:
                return super.b(view, i3);
        }
    }

    @Override // Z.C0053u
    public int c(View view, int i3) {
        switch (this.f273p) {
            case 0:
                ((CarouselLayoutManager) this.f274q).getClass();
                return 0;
            default:
                return super.c(view, i3);
        }
    }

    @Override // Z.C0053u
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f273p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // Z.C0053u
    public int e(int i3) {
        switch (this.f273p) {
            case 1:
                return Math.min(100, super.e(i3));
            default:
                return super.e(i3);
        }
    }

    @Override // Z.C0053u
    public PointF f(int i3) {
        switch (this.f273p) {
            case 0:
                ((CarouselLayoutManager) this.f274q).getClass();
                return null;
            default:
                return super.f(i3);
        }
    }

    @Override // Z.C0053u
    public void h(View view, Q q3) {
        switch (this.f273p) {
            case 1:
                C0056x c0056x = (C0056x) this.f274q;
                int[] a3 = c0056x.a(c0056x.f1368a.getLayoutManager(), view);
                int i3 = a3[0];
                int i4 = a3[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i3), Math.abs(i4))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f1358i;
                    q3.f1184a = i3;
                    q3.f1185b = i4;
                    q3.c = ceil;
                    q3.f1187e = decelerateInterpolator;
                    q3.f1188f = true;
                    return;
                }
                return;
            default:
                super.h(view, q3);
                return;
        }
    }
}
