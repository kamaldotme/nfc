package Z;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f1154b;

    public /* synthetic */ F(H h, int i3) {
        this.f1153a = i3;
        this.f1154b = h;
    }

    public final View a(int i3) {
        switch (this.f1153a) {
            case 0:
                return this.f1154b.u(i3);
            default:
                return this.f1154b.u(i3);
        }
    }

    public final int b(View view) {
        switch (this.f1153a) {
            case 0:
                I i3 = (I) view.getLayoutParams();
                this.f1154b.getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f1171b.right + ((ViewGroup.MarginLayoutParams) i3).rightMargin;
            default:
                I i4 = (I) view.getLayoutParams();
                this.f1154b.getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f1171b.bottom + ((ViewGroup.MarginLayoutParams) i4).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f1153a) {
            case 0:
                I i3 = (I) view.getLayoutParams();
                this.f1154b.getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f1171b.left) - ((ViewGroup.MarginLayoutParams) i3).leftMargin;
            default:
                I i4 = (I) view.getLayoutParams();
                this.f1154b.getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f1171b.top) - ((ViewGroup.MarginLayoutParams) i4).topMargin;
        }
    }

    public final int d() {
        switch (this.f1153a) {
            case 0:
                H h = this.f1154b;
                return h.f1168n - h.D();
            default:
                H h3 = this.f1154b;
                return h3.f1169o - h3.B();
        }
    }

    public final int e() {
        switch (this.f1153a) {
            case 0:
                return this.f1154b.C();
            default:
                return this.f1154b.E();
        }
    }
}
