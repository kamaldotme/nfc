package Q;

import F0.h;
import J.T;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import m0.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f800v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f801a;

    /* renamed from: b, reason: collision with root package name */
    public final int f802b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f803d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f804e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f805f;
    public float[] g;
    public int[] h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f806i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f807j;

    /* renamed from: k, reason: collision with root package name */
    public int f808k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f809l;

    /* renamed from: m, reason: collision with root package name */
    public final float f810m;

    /* renamed from: n, reason: collision with root package name */
    public final float f811n;

    /* renamed from: o, reason: collision with root package name */
    public final int f812o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f813p;

    /* renamed from: q, reason: collision with root package name */
    public final z f814q;

    /* renamed from: r, reason: collision with root package name */
    public View f815r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f816s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f817t;
    public int c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final h f818u = new h(2, this);

    public e(Context context, ViewGroup viewGroup, z zVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (zVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f817t = viewGroup;
        this.f814q = zVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f812o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f802b = viewConfiguration.getScaledTouchSlop();
        this.f810m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f811n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f813p = new OverScroller(context, f800v);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.f803d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f804e, 0.0f);
            Arrays.fill(this.f805f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.f806i, 0);
            Arrays.fill(this.f807j, 0);
            this.f808k = 0;
        }
        VelocityTracker velocityTracker = this.f809l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f809l = null;
        }
    }

    public final void b(View view, int i3) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f817t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f815r = view;
        this.c = i3;
        this.f814q.V(view, i3);
        m(1);
    }

    public final boolean c(View view, float f3, float f4) {
        if (view == null) {
            return false;
        }
        z zVar = this.f814q;
        boolean z3 = zVar.M(view) > 0;
        boolean z4 = zVar.N() > 0;
        if (!z3 || !z4) {
            return z3 ? Math.abs(f3) > ((float) this.f802b) : z4 && Math.abs(f4) > ((float) this.f802b);
        }
        float f5 = (f4 * f4) + (f3 * f3);
        int i3 = this.f802b;
        return f5 > ((float) (i3 * i3));
    }

    public final void d(int i3) {
        float[] fArr = this.f803d;
        if (fArr != null) {
            int i4 = this.f808k;
            int i5 = 1 << i3;
            if ((i4 & i5) != 0) {
                fArr[i3] = 0.0f;
                this.f804e[i3] = 0.0f;
                this.f805f[i3] = 0.0f;
                this.g[i3] = 0.0f;
                this.h[i3] = 0;
                this.f806i[i3] = 0;
                this.f807j[i3] = 0;
                this.f808k = (~i5) & i4;
            }
        }
    }

    public final int e(int i3, int i4, int i5) {
        if (i3 == 0) {
            return 0;
        }
        float width = this.f817t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i3) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i4);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / i5) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        if (this.f801a == 2) {
            OverScroller overScroller = this.f813p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f815r.getLeft();
            int top = currY - this.f815r.getTop();
            if (left != 0) {
                View view = this.f815r;
                WeakHashMap weakHashMap = T.f402a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f815r;
                WeakHashMap weakHashMap2 = T.f402a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f814q.X(this.f815r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
            }
            this.f817t.post(this.f818u);
        }
        return this.f801a == 2;
    }

    public final View g(int i3, int i4) {
        ViewGroup viewGroup = this.f817t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f814q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i3, int i4, int i5, int i6) {
        float f3;
        float f4;
        float f5;
        float f6;
        int left = this.f815r.getLeft();
        int top = this.f815r.getTop();
        int i7 = i3 - left;
        int i8 = i4 - top;
        OverScroller overScroller = this.f813p;
        int i9 = 0;
        if (i7 == 0 && i8 == 0) {
            overScroller.abortAnimation();
            m(0);
            return false;
        }
        View view = this.f815r;
        int i10 = (int) this.f811n;
        int i11 = (int) this.f810m;
        int abs = Math.abs(i5);
        if (abs < i10) {
            i5 = 0;
        } else if (abs > i11) {
            i5 = i5 > 0 ? i11 : -i11;
        }
        int abs2 = Math.abs(i6);
        if (abs2 >= i10) {
            if (abs2 > i11) {
                if (i6 > 0) {
                    i6 = i11;
                } else {
                    i9 = -i11;
                }
            }
            int abs3 = Math.abs(i7);
            int abs4 = Math.abs(i8);
            int abs5 = Math.abs(i5);
            int abs6 = Math.abs(i6);
            int i12 = abs5 + abs6;
            int i13 = abs3 + abs4;
            if (i5 == 0) {
                f3 = abs5;
                f4 = i12;
            } else {
                f3 = abs3;
                f4 = i13;
            }
            float f7 = f3 / f4;
            if (i6 == 0) {
                f5 = abs6;
                f6 = i12;
            } else {
                f5 = abs4;
                f6 = i13;
            }
            float f8 = f5 / f6;
            z zVar = this.f814q;
            overScroller.startScroll(left, top, i7, i8, (int) ((e(i8, i6, zVar.N()) * f8) + (e(i7, i5, zVar.M(view)) * f7)));
            m(2);
            return true;
        }
        i6 = i9;
        int abs32 = Math.abs(i7);
        int abs42 = Math.abs(i8);
        int abs52 = Math.abs(i5);
        int abs62 = Math.abs(i6);
        int i122 = abs52 + abs62;
        int i132 = abs32 + abs42;
        if (i5 == 0) {
        }
        float f72 = f3 / f4;
        if (i6 == 0) {
        }
        float f82 = f5 / f6;
        z zVar2 = this.f814q;
        overScroller.startScroll(left, top, i7, i8, (int) ((e(i8, i6, zVar2.N()) * f82) + (e(i7, i5, zVar2.M(view)) * f72)));
        m(2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r9.c == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f809l == null) {
            this.f809l = VelocityTracker.obtain();
        }
        this.f809l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g = g((int) x2, (int) y3);
            k(x2, y3, pointerId);
            p(g, pointerId);
            int i4 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f801a == 1) {
                j();
            }
            a();
            return;
        }
        z zVar = this.f814q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f801a == 1) {
                    this.f816s = true;
                    zVar.Y(this.f815r, 0.0f, 0.0f);
                    this.f816s = false;
                    if (this.f801a == 1) {
                        m(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return;
                }
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                if (this.f801a == 1 && pointerId2 == this.c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            break;
                        }
                        int pointerId3 = motionEvent.getPointerId(i3);
                        if (pointerId3 != this.c) {
                            View g3 = g((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view = this.f815r;
                            if (g3 == view && p(view, pointerId3)) {
                            }
                        }
                        i3++;
                    }
                }
                d(pointerId2);
                return;
            }
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            float x3 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            k(x3, y4, pointerId4);
            if (this.f801a == 0) {
                p(g((int) x3, (int) y4), pointerId4);
                int i5 = this.h[pointerId4];
                return;
            }
            int i6 = (int) x3;
            int i7 = (int) y4;
            View view2 = this.f815r;
            if (view2 != null && i6 >= view2.getLeft() && i6 < view2.getRight() && i7 >= view2.getTop() && i7 < view2.getBottom()) {
                p(this.f815r, pointerId4);
                return;
            }
            return;
        }
        if (this.f801a == 1) {
            int i8 = this.c;
            if (((1 << i8) & this.f808k) != 0) {
                int findPointerIndex = motionEvent.findPointerIndex(i8);
                float x4 = motionEvent.getX(findPointerIndex);
                float y5 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f805f;
                int i9 = this.c;
                int i10 = (int) (x4 - fArr[i9]);
                int i11 = (int) (y5 - this.g[i9]);
                int left = this.f815r.getLeft() + i10;
                int top = this.f815r.getTop() + i11;
                int left2 = this.f815r.getLeft();
                int top2 = this.f815r.getTop();
                if (i10 != 0) {
                    left = zVar.l(this.f815r, left);
                    WeakHashMap weakHashMap = T.f402a;
                    this.f815r.offsetLeftAndRight(left - left2);
                }
                if (i11 != 0) {
                    top = zVar.m(this.f815r, top);
                    WeakHashMap weakHashMap2 = T.f402a;
                    this.f815r.offsetTopAndBottom(top - top2);
                }
                if (i10 != 0 || i11 != 0) {
                    zVar.X(this.f815r, left, top);
                }
                l(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i3 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i3);
            if ((this.f808k & (1 << pointerId5)) != 0) {
                float x5 = motionEvent.getX(i3);
                float y6 = motionEvent.getY(i3);
                float f3 = x5 - this.f803d[pointerId5];
                float f4 = y6 - this.f804e[pointerId5];
                Math.abs(f3);
                Math.abs(f4);
                int i12 = this.h[pointerId5];
                Math.abs(f4);
                Math.abs(f3);
                int i13 = this.h[pointerId5];
                Math.abs(f3);
                Math.abs(f4);
                int i14 = this.h[pointerId5];
                Math.abs(f4);
                Math.abs(f3);
                int i15 = this.h[pointerId5];
                if (this.f801a != 1) {
                    View g4 = g((int) x5, (int) y6);
                    if (c(g4, f3, f4) && p(g4, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i3++;
        }
        l(motionEvent);
    }

    public final void j() {
        VelocityTracker velocityTracker = this.f809l;
        float f3 = this.f810m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.f809l.getXVelocity(this.c);
        float f4 = this.f811n;
        float abs = Math.abs(xVelocity);
        float f5 = 0.0f;
        if (abs < f4) {
            xVelocity = 0.0f;
        } else if (abs > f3) {
            xVelocity = xVelocity > 0.0f ? f3 : -f3;
        }
        float yVelocity = this.f809l.getYVelocity(this.c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f3) {
                if (yVelocity <= 0.0f) {
                    f3 = -f3;
                }
                f5 = f3;
            } else {
                f5 = yVelocity;
            }
        }
        this.f816s = true;
        this.f814q.Y(this.f815r, xVelocity, f5);
        this.f816s = false;
        if (this.f801a == 1) {
            m(0);
        }
    }

    public final void k(float f3, float f4, int i3) {
        float[] fArr = this.f803d;
        if (fArr == null || fArr.length <= i3) {
            int i4 = i3 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f804e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f805f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f806i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f807j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f803d = fArr2;
            this.f804e = fArr3;
            this.f805f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.f806i = iArr2;
            this.f807j = iArr3;
        }
        float[] fArr9 = this.f803d;
        this.f805f[i3] = f3;
        fArr9[i3] = f3;
        float[] fArr10 = this.f804e;
        this.g[i3] = f4;
        fArr10[i3] = f4;
        int[] iArr7 = this.h;
        int i5 = (int) f3;
        int i6 = (int) f4;
        ViewGroup viewGroup = this.f817t;
        int left = viewGroup.getLeft();
        int i7 = this.f812o;
        int i8 = i5 < left + i7 ? 1 : 0;
        if (i6 < viewGroup.getTop() + i7) {
            i8 |= 4;
        }
        if (i5 > viewGroup.getRight() - i7) {
            i8 |= 2;
        }
        if (i6 > viewGroup.getBottom() - i7) {
            i8 |= 8;
        }
        iArr7[i3] = i8;
        this.f808k |= 1 << i3;
    }

    public final void l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if ((this.f808k & (1 << pointerId)) != 0) {
                float x2 = motionEvent.getX(i3);
                float y3 = motionEvent.getY(i3);
                this.f805f[pointerId] = x2;
                this.g[pointerId] = y3;
            }
        }
    }

    public final void m(int i3) {
        this.f817t.removeCallbacks(this.f818u);
        if (this.f801a != i3) {
            this.f801a = i3;
            this.f814q.W(i3);
            if (this.f801a == 0) {
                this.f815r = null;
            }
        }
    }

    public final boolean n(int i3, int i4) {
        if (this.f816s) {
            return h(i3, i4, (int) this.f809l.getXVelocity(this.c), (int) this.f809l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        if (r12 != r11) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(MotionEvent motionEvent) {
        View g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f809l == null) {
            this.f809l = VelocityTracker.obtain();
        }
        this.f809l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y3 = motionEvent.getY(actionIndex);
                            k(x2, y3, pointerId);
                            int i3 = this.f801a;
                            if (i3 == 0) {
                                int i4 = this.h[pointerId];
                            } else if (i3 == 2 && (g = g((int) x2, (int) y3)) == this.f815r) {
                                p(g, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f803d != null && this.f804e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i5 = 0; i5 < pointerCount; i5++) {
                        int pointerId2 = motionEvent.getPointerId(i5);
                        if ((this.f808k & (1 << pointerId2)) != 0) {
                            float x3 = motionEvent.getX(i5);
                            float y4 = motionEvent.getY(i5);
                            float f3 = x3 - this.f803d[pointerId2];
                            float f4 = y4 - this.f804e[pointerId2];
                            View g3 = g((int) x3, (int) y4);
                            boolean z3 = g3 != null && c(g3, f3, f4);
                            if (z3) {
                                int left = g3.getLeft();
                                z zVar = this.f814q;
                                int l3 = zVar.l(g3, ((int) f3) + left);
                                int top = g3.getTop();
                                int m3 = zVar.m(g3, ((int) f4) + top);
                                int M2 = zVar.M(g3);
                                int N2 = zVar.N();
                                if (M2 != 0) {
                                    if (M2 > 0) {
                                    }
                                }
                                if (N2 == 0) {
                                    break;
                                }
                                if (N2 > 0 && m3 == top) {
                                    break;
                                }
                            }
                            Math.abs(f3);
                            Math.abs(f4);
                            int i6 = this.h[pointerId2];
                            Math.abs(f4);
                            Math.abs(f3);
                            int i7 = this.h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f4);
                            int i8 = this.h[pointerId2];
                            Math.abs(f4);
                            Math.abs(f3);
                            int i9 = this.h[pointerId2];
                            if (this.f801a == 1) {
                                break;
                            }
                            if (z3 && p(g3, pointerId2)) {
                                break;
                            }
                        }
                    }
                    l(motionEvent);
                }
            }
            a();
        } else {
            float x4 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            k(x4, y5, pointerId3);
            View g4 = g((int) x4, (int) y5);
            if (g4 == this.f815r && this.f801a == 2) {
                p(g4, pointerId3);
            }
            int i10 = this.h[pointerId3];
        }
        return this.f801a == 1;
    }

    public final boolean p(View view, int i3) {
        if (view == this.f815r && this.c == i3) {
            return true;
        }
        if (view == null || !this.f814q.n0(view, i3)) {
            return false;
        }
        this.c = i3;
        b(view, i3);
        return true;
    }
}
