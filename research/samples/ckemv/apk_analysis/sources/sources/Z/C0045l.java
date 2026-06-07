package Z;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: Z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045l extends E {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1293C = {R.attr.state_pressed};
    public static final int[] D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f1294A;

    /* renamed from: B, reason: collision with root package name */
    public final F0.h f1295B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1297b;
    public final StateListDrawable c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f1298d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1299e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1300f;
    public final StateListDrawable g;
    public final Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1301i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1302j;

    /* renamed from: k, reason: collision with root package name */
    public int f1303k;

    /* renamed from: l, reason: collision with root package name */
    public int f1304l;

    /* renamed from: m, reason: collision with root package name */
    public float f1305m;

    /* renamed from: n, reason: collision with root package name */
    public int f1306n;

    /* renamed from: o, reason: collision with root package name */
    public int f1307o;

    /* renamed from: p, reason: collision with root package name */
    public float f1308p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f1311s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f1318z;

    /* renamed from: q, reason: collision with root package name */
    public int f1309q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1310r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1312t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1313u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f1314v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f1315w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1316x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f1317y = new int[2];

    public C0045l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1318z = ofFloat;
        this.f1294A = 0;
        F0.h hVar = new F0.h(3, this);
        this.f1295B = hVar;
        C0043j c0043j = new C0043j(this);
        this.c = stateListDrawable;
        this.f1298d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.f1299e = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f1300f = Math.max(i3, drawable.getIntrinsicWidth());
        this.f1301i = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f1302j = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f1296a = i4;
        this.f1297b = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0044k(this));
        ofFloat.addUpdateListener(new F0.c(2, this));
        RecyclerView recyclerView2 = this.f1311s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            H h = recyclerView2.f2136m;
            if (h != null) {
                h.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2138n;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1311s;
            recyclerView3.f2140o.remove(this);
            if (recyclerView3.f2142p == this) {
                recyclerView3.f2142p = null;
            }
            ArrayList arrayList2 = this.f1311s.f2126f0;
            if (arrayList2 != null) {
                arrayList2.remove(c0043j);
            }
            this.f1311s.removeCallbacks(hVar);
        }
        this.f1311s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f1311s.f2140o.add(this);
            this.f1311s.h(c0043j);
        }
    }

    public static int e(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 == 0) {
            return 0;
        }
        int i7 = i3 - i5;
        int i8 = (int) (((f4 - f3) / i6) * i7);
        int i9 = i4 + i8;
        if (i9 >= i7 || i9 < 0) {
            return 0;
        }
        return i8;
    }

    @Override // Z.E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i3 = this.f1309q;
        RecyclerView recyclerView2 = this.f1311s;
        if (i3 != recyclerView2.getWidth() || this.f1310r != recyclerView2.getHeight()) {
            this.f1309q = recyclerView2.getWidth();
            this.f1310r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f1294A != 0) {
            if (this.f1312t) {
                int i4 = this.f1309q;
                int i5 = this.f1299e;
                int i6 = i4 - i5;
                int i7 = this.f1304l;
                int i8 = this.f1303k;
                int i9 = i7 - (i8 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i5, i8);
                int i10 = this.f1310r;
                int i11 = this.f1300f;
                Drawable drawable = this.f1298d;
                drawable.setBounds(0, 0, i11, i10);
                WeakHashMap weakHashMap = J.T.f402a;
                if (J.C.d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i5, i9);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i5, -i9);
                } else {
                    canvas.translate(i6, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i9);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i6, -i9);
                }
            }
            if (this.f1313u) {
                int i12 = this.f1310r;
                int i13 = this.f1301i;
                int i14 = i12 - i13;
                int i15 = this.f1307o;
                int i16 = this.f1306n;
                int i17 = i15 - (i16 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i16, i13);
                int i18 = this.f1309q;
                int i19 = this.f1302j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i18, i19);
                canvas.translate(0.0f, i14);
                drawable2.draw(canvas);
                canvas.translate(i17, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i17, -i14);
            }
        }
    }

    public final boolean c(float f3, float f4) {
        if (f4 >= this.f1310r - this.f1301i) {
            int i3 = this.f1307o;
            int i4 = this.f1306n;
            if (f3 >= i3 - (i4 / 2) && f3 <= (i4 / 2) + i3) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f3, float f4) {
        RecyclerView recyclerView = this.f1311s;
        WeakHashMap weakHashMap = J.T.f402a;
        boolean z3 = J.C.d(recyclerView) == 1;
        int i3 = this.f1299e;
        if (z3) {
            if (f3 > i3 / 2) {
                return false;
            }
        } else if (f3 < this.f1309q - i3) {
            return false;
        }
        int i4 = this.f1304l;
        int i5 = this.f1303k / 2;
        return f4 >= ((float) (i4 - i5)) && f4 <= ((float) (i5 + i4));
    }

    public final void f(int i3) {
        F0.h hVar = this.f1295B;
        StateListDrawable stateListDrawable = this.c;
        if (i3 == 2 && this.f1314v != 2) {
            stateListDrawable.setState(f1293C);
            this.f1311s.removeCallbacks(hVar);
        }
        if (i3 == 0) {
            this.f1311s.invalidate();
        } else {
            g();
        }
        if (this.f1314v == 2 && i3 != 2) {
            stateListDrawable.setState(D);
            this.f1311s.removeCallbacks(hVar);
            this.f1311s.postDelayed(hVar, 1200);
        } else if (i3 == 1) {
            this.f1311s.removeCallbacks(hVar);
            this.f1311s.postDelayed(hVar, 1500);
        }
        this.f1314v = i3;
    }

    public final void g() {
        int i3 = this.f1294A;
        ValueAnimator valueAnimator = this.f1318z;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f1294A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
