package Z;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0053u {

    /* renamed from: a, reason: collision with root package name */
    public int f1353a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1354b;
    public H c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1355d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1356e;

    /* renamed from: f, reason: collision with root package name */
    public View f1357f;
    public final Q g;
    public final LinearInterpolator h;

    /* renamed from: i, reason: collision with root package name */
    public final DecelerateInterpolator f1358i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f1359j;

    /* renamed from: k, reason: collision with root package name */
    public final DisplayMetrics f1360k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1361l;

    /* renamed from: m, reason: collision with root package name */
    public float f1362m;

    /* renamed from: n, reason: collision with root package name */
    public int f1363n;

    /* renamed from: o, reason: collision with root package name */
    public int f1364o;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, Z.Q] */
    public C0053u(Context context) {
        ?? obj = new Object();
        obj.f1186d = -1;
        obj.f1188f = false;
        obj.f1184a = 0;
        obj.f1185b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.f1187e = null;
        this.g = obj;
        this.h = new LinearInterpolator();
        this.f1358i = new DecelerateInterpolator();
        this.f1361l = false;
        this.f1363n = 0;
        this.f1364o = 0;
        this.f1360k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == -1) {
            return i5 - i3;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                return i6 - i4;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i8 = i5 - i3;
        if (i8 > 0) {
            return i8;
        }
        int i9 = i6 - i4;
        if (i9 < 0) {
            return i9;
        }
        return 0;
    }

    public int b(View view, int i3) {
        H h = this.c;
        if (h == null || !h.d()) {
            return 0;
        }
        I i4 = (I) view.getLayoutParams();
        return a((view.getLeft() - ((I) view.getLayoutParams()).f1171b.left) - ((ViewGroup.MarginLayoutParams) i4).leftMargin, view.getRight() + ((I) view.getLayoutParams()).f1171b.right + ((ViewGroup.MarginLayoutParams) i4).rightMargin, h.C(), h.f1168n - h.D(), i3);
    }

    public int c(View view, int i3) {
        H h = this.c;
        if (h == null || !h.e()) {
            return 0;
        }
        I i4 = (I) view.getLayoutParams();
        return a((view.getTop() - ((I) view.getLayoutParams()).f1171b.top) - ((ViewGroup.MarginLayoutParams) i4).topMargin, view.getBottom() + ((I) view.getLayoutParams()).f1171b.bottom + ((ViewGroup.MarginLayoutParams) i4).bottomMargin, h.E(), h.f1169o - h.B(), i3);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i3) {
        float abs = Math.abs(i3);
        if (!this.f1361l) {
            this.f1362m = d(this.f1360k);
            this.f1361l = true;
        }
        return (int) Math.ceil(abs * this.f1362m);
    }

    public PointF f(int i3) {
        Object obj = this.c;
        if (obj instanceof S) {
            return ((S) obj).a(i3);
        }
        return null;
    }

    public final void g(int i3, int i4) {
        PointF f3;
        RecyclerView recyclerView = this.f1354b;
        if (this.f1353a == -1 || recyclerView == null) {
            i();
        }
        if (this.f1355d && this.f1357f == null && this.c != null && (f3 = f(this.f1353a)) != null) {
            float f4 = f3.x;
            if (f4 != 0.0f || f3.y != 0.0f) {
                recyclerView.Z((int) Math.signum(f4), (int) Math.signum(f3.y), null);
            }
        }
        this.f1355d = false;
        View view = this.f1357f;
        Q q3 = this.g;
        if (view != null) {
            this.f1354b.getClass();
            W I2 = RecyclerView.I(view);
            if ((I2 != null ? I2.c() : -1) == this.f1353a) {
                View view2 = this.f1357f;
                T t3 = recyclerView.f2122d0;
                h(view2, q3);
                q3.a(recyclerView);
                i();
            } else {
                this.f1357f = null;
            }
        }
        if (this.f1356e) {
            T t4 = recyclerView.f2122d0;
            if (this.f1354b.f2136m.v() == 0) {
                i();
            } else {
                int i5 = this.f1363n;
                int i6 = i5 - i3;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f1363n = i6;
                int i7 = this.f1364o;
                int i8 = i7 - i4;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f1364o = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF f5 = f(this.f1353a);
                    if (f5 != null) {
                        if (f5.x != 0.0f || f5.y != 0.0f) {
                            float f6 = f5.y;
                            float sqrt = (float) Math.sqrt((f6 * f6) + (r10 * r10));
                            float f7 = f5.x / sqrt;
                            f5.x = f7;
                            float f8 = f5.y / sqrt;
                            f5.y = f8;
                            this.f1359j = f5;
                            this.f1363n = (int) (f7 * 10000.0f);
                            this.f1364o = (int) (f8 * 10000.0f);
                            int e3 = e(10000);
                            LinearInterpolator linearInterpolator = this.h;
                            q3.f1184a = (int) (this.f1363n * 1.2f);
                            q3.f1185b = (int) (this.f1364o * 1.2f);
                            q3.c = (int) (e3 * 1.2f);
                            q3.f1187e = linearInterpolator;
                            q3.f1188f = true;
                        }
                    }
                    q3.f1186d = this.f1353a;
                    i();
                }
            }
            boolean z3 = q3.f1186d >= 0;
            q3.a(recyclerView);
            if (z3 && this.f1356e) {
                this.f1355d = true;
                recyclerView.f2117a0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, Q q3) {
        int i3;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f1359j;
        int i4 = 0;
        if (pointF2 != null) {
            float f3 = pointF2.x;
            if (f3 != 0.0f) {
                i3 = f3 > 0.0f ? 1 : -1;
                int b3 = b(view, i3);
                pointF = this.f1359j;
                if (pointF != null) {
                    float f4 = pointF.y;
                    if (f4 != 0.0f) {
                        i4 = f4 > 0.0f ? 1 : -1;
                    }
                }
                int c = c(view, i4);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c * c) + (b3 * b3))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f1358i;
                    q3.f1184a = -b3;
                    q3.f1185b = -c;
                    q3.c = ceil;
                    q3.f1187e = decelerateInterpolator;
                    q3.f1188f = true;
                    return;
                }
                return;
            }
        }
        i3 = 0;
        int b32 = b(view, i3);
        pointF = this.f1359j;
        if (pointF != null) {
        }
        int c3 = c(view, i4);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c3 * c3) + (b32 * b32))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f1356e) {
            this.f1356e = false;
            this.f1364o = 0;
            this.f1363n = 0;
            this.f1359j = null;
            this.f1354b.f2122d0.f1189a = -1;
            this.f1357f = null;
            this.f1353a = -1;
            this.f1355d = false;
            H h = this.c;
            if (h.f1161e == this) {
                h.f1161e = null;
            }
            this.c = null;
            this.f1354b = null;
        }
    }
}
