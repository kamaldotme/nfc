package Z;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054v extends AbstractC0055w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0054v(H h, int i3) {
        super(h);
        this.f1365d = i3;
    }

    @Override // Z.AbstractC0055w
    public final int b(View view) {
        switch (this.f1365d) {
            case 0:
                I i3 = (I) view.getLayoutParams();
                ((H) this.f1367b).getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f1171b.right + ((ViewGroup.MarginLayoutParams) i3).rightMargin;
            default:
                I i4 = (I) view.getLayoutParams();
                ((H) this.f1367b).getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f1171b.bottom + ((ViewGroup.MarginLayoutParams) i4).bottomMargin;
        }
    }

    @Override // Z.AbstractC0055w
    public final int c(View view) {
        switch (this.f1365d) {
            case 0:
                I i3 = (I) view.getLayoutParams();
                ((H) this.f1367b).getClass();
                Rect rect = ((I) view.getLayoutParams()).f1171b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) i3).leftMargin + ((ViewGroup.MarginLayoutParams) i3).rightMargin;
            default:
                I i4 = (I) view.getLayoutParams();
                ((H) this.f1367b).getClass();
                Rect rect2 = ((I) view.getLayoutParams()).f1171b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) i4).topMargin + ((ViewGroup.MarginLayoutParams) i4).bottomMargin;
        }
    }

    @Override // Z.AbstractC0055w
    public final int d(View view) {
        switch (this.f1365d) {
            case 0:
                I i3 = (I) view.getLayoutParams();
                ((H) this.f1367b).getClass();
                Rect rect = ((I) view.getLayoutParams()).f1171b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) i3).topMargin + ((ViewGroup.MarginLayoutParams) i3).bottomMargin;
            default:
                I i4 = (I) view.getLayoutParams();
                ((H) this.f1367b).getClass();
                Rect rect2 = ((I) view.getLayoutParams()).f1171b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) i4).leftMargin + ((ViewGroup.MarginLayoutParams) i4).rightMargin;
        }
    }

    @Override // Z.AbstractC0055w
    public final int e(View view) {
        switch (this.f1365d) {
            case 0:
                I i3 = (I) view.getLayoutParams();
                ((H) this.f1367b).getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f1171b.left) - ((ViewGroup.MarginLayoutParams) i3).leftMargin;
            default:
                I i4 = (I) view.getLayoutParams();
                ((H) this.f1367b).getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f1171b.top) - ((ViewGroup.MarginLayoutParams) i4).topMargin;
        }
    }

    @Override // Z.AbstractC0055w
    public final int f() {
        switch (this.f1365d) {
            case 0:
                return ((H) this.f1367b).f1168n;
            default:
                return ((H) this.f1367b).f1169o;
        }
    }

    @Override // Z.AbstractC0055w
    public final int g() {
        switch (this.f1365d) {
            case 0:
                H h = (H) this.f1367b;
                return h.f1168n - h.D();
            default:
                H h3 = (H) this.f1367b;
                return h3.f1169o - h3.B();
        }
    }

    @Override // Z.AbstractC0055w
    public final int h() {
        switch (this.f1365d) {
            case 0:
                return ((H) this.f1367b).D();
            default:
                return ((H) this.f1367b).B();
        }
    }

    @Override // Z.AbstractC0055w
    public final int i() {
        switch (this.f1365d) {
            case 0:
                return ((H) this.f1367b).f1166l;
            default:
                return ((H) this.f1367b).f1167m;
        }
    }

    @Override // Z.AbstractC0055w
    public final int j() {
        switch (this.f1365d) {
            case 0:
                return ((H) this.f1367b).f1167m;
            default:
                return ((H) this.f1367b).f1166l;
        }
    }

    @Override // Z.AbstractC0055w
    public final int k() {
        switch (this.f1365d) {
            case 0:
                return ((H) this.f1367b).C();
            default:
                return ((H) this.f1367b).E();
        }
    }

    @Override // Z.AbstractC0055w
    public final int l() {
        switch (this.f1365d) {
            case 0:
                H h = (H) this.f1367b;
                return (h.f1168n - h.C()) - h.D();
            default:
                H h3 = (H) this.f1367b;
                return (h3.f1169o - h3.E()) - h3.B();
        }
    }

    @Override // Z.AbstractC0055w
    public final int n(View view) {
        switch (this.f1365d) {
            case 0:
                H h = (H) this.f1367b;
                Rect rect = (Rect) this.c;
                h.I(view, rect);
                return rect.right;
            default:
                H h3 = (H) this.f1367b;
                Rect rect2 = (Rect) this.c;
                h3.I(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // Z.AbstractC0055w
    public final int o(View view) {
        switch (this.f1365d) {
            case 0:
                H h = (H) this.f1367b;
                Rect rect = (Rect) this.c;
                h.I(view, rect);
                return rect.left;
            default:
                H h3 = (H) this.f1367b;
                Rect rect2 = (Rect) this.c;
                h3.I(view, rect2);
                return rect2.top;
        }
    }

    @Override // Z.AbstractC0055w
    public final void p(int i3) {
        switch (this.f1365d) {
            case 0:
                ((H) this.f1367b).M(i3);
                return;
            default:
                ((H) this.f1367b).N(i3);
                return;
        }
    }
}
