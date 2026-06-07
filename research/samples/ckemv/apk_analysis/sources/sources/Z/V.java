package Z;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public int f1200b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f1201d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f1202e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1203f;
    public boolean g;
    public final /* synthetic */ RecyclerView h;

    public V(RecyclerView recyclerView) {
        this.h = recyclerView;
        Q.d dVar = RecyclerView.f2094v0;
        this.f1202e = dVar;
        this.f1203f = false;
        this.g = false;
        this.f1201d = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f1203f) {
            this.g = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = J.T.f402a;
        J.B.m(recyclerView, this);
    }

    public final void b(int i3, int i4, int i5, Interpolator interpolator) {
        int i6;
        RecyclerView recyclerView = this.h;
        if (i5 == Integer.MIN_VALUE) {
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i4);
            boolean z3 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i4 * i4) + (i3 * i3));
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i7 = width / 2;
            float f3 = width;
            float f4 = i7;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f4) + f4;
            if (sqrt > 0) {
                i6 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z3) {
                    abs = abs2;
                }
                i6 = (int) (((abs / f3) + 1.0f) * 300.0f);
            }
            i5 = Math.min(i6, 2000);
        }
        int i8 = i5;
        if (interpolator == null) {
            interpolator = RecyclerView.f2094v0;
        }
        if (this.f1202e != interpolator) {
            this.f1202e = interpolator;
            this.f1201d = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.c = 0;
        this.f1200b = 0;
        recyclerView.setScrollState(2);
        this.f1201d.startScroll(0, 0, i3, i4, i8);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i4;
        int i5;
        int i6;
        RecyclerView recyclerView = this.h;
        if (recyclerView.f2136m == null) {
            recyclerView.removeCallbacks(this);
            this.f1201d.abortAnimation();
            return;
        }
        this.g = false;
        this.f1203f = true;
        recyclerView.m();
        OverScroller overScroller = this.f1201d;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i7 = currX - this.f1200b;
            int i8 = currY - this.c;
            this.f1200b = currX;
            this.c = currY;
            int[] iArr = recyclerView.f2143p0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r3 = recyclerView.r(i7, i8, iArr, null, 1);
            int[] iArr2 = recyclerView.f2143p0;
            if (r3) {
                i7 -= iArr2[0];
                i8 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i7, i8);
            }
            if (recyclerView.f2134l != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(i7, i8, iArr2);
                int i9 = iArr2[0];
                int i10 = iArr2[1];
                int i11 = i7 - i9;
                int i12 = i8 - i10;
                C0053u c0053u = recyclerView.f2136m.f1161e;
                if (c0053u != null && !c0053u.f1355d && c0053u.f1356e) {
                    int b3 = recyclerView.f2122d0.b();
                    if (b3 == 0) {
                        c0053u.i();
                    } else if (c0053u.f1353a >= b3) {
                        c0053u.f1353a = b3 - 1;
                        c0053u.g(i9, i10);
                    } else {
                        c0053u.g(i9, i10);
                    }
                }
                i6 = i9;
                i3 = i11;
                i4 = i12;
                i5 = i10;
            } else {
                i3 = i7;
                i4 = i8;
                i5 = 0;
                i6 = 0;
            }
            if (!recyclerView.f2138n.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f2143p0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i13 = i5;
            recyclerView.s(i6, i5, i3, i4, null, 1, iArr3);
            int i14 = i3 - iArr2[0];
            int i15 = i4 - iArr2[1];
            if (i6 != 0 || i13 != 0) {
                recyclerView.t(i6, i13);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
            C0053u c0053u2 = recyclerView.f2136m.f1161e;
            if ((c0053u2 == null || !c0053u2.f1355d) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                    if (i15 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i15 <= 0) {
                        currVelocity = 0;
                    }
                    if (i16 < 0) {
                        recyclerView.v();
                        if (recyclerView.f2098E.isFinished()) {
                            recyclerView.f2098E.onAbsorb(-i16);
                        }
                    } else if (i16 > 0) {
                        recyclerView.w();
                        if (recyclerView.f2100G.isFinished()) {
                            recyclerView.f2100G.onAbsorb(i16);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f2099F.isFinished()) {
                            recyclerView.f2099F.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f2101H.isFinished()) {
                            recyclerView.f2101H.onAbsorb(currVelocity);
                        }
                    }
                    if (i16 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = J.T.f402a;
                        J.B.k(recyclerView);
                    }
                }
                C0.b bVar = recyclerView.f2120c0;
                int[] iArr4 = (int[]) bVar.f112d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                bVar.c = 0;
            } else {
                a();
                RunnableC0047n runnableC0047n = recyclerView.f2119b0;
                if (runnableC0047n != null) {
                    runnableC0047n.a(recyclerView, i6, i13);
                }
            }
        }
        C0053u c0053u3 = recyclerView.f2136m.f1161e;
        if (c0053u3 != null && c0053u3.f1355d) {
            c0053u3.g(0, 0);
        }
        this.f1203f = false;
        if (!this.g) {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = J.T.f402a;
            J.B.m(recyclerView, this);
        }
    }
}
