package N;

import J.B;
import J.T;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: s, reason: collision with root package name */
    public static final int f658s = ViewConfiguration.getTapTimeout();

    /* renamed from: b, reason: collision with root package name */
    public final a f659b;
    public final AccelerateInterpolator c;

    /* renamed from: d, reason: collision with root package name */
    public final View f660d;

    /* renamed from: e, reason: collision with root package name */
    public F0.h f661e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f662f;
    public final float[] g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f663i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f664j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f665k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f666l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f667m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f668n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f669o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f670p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f671q;

    /* renamed from: r, reason: collision with root package name */
    public final ListView f672r;

    /* JADX WARN: Type inference failed for: r1v0, types: [N.a, java.lang.Object] */
    public g(ListView listView) {
        ?? obj = new Object();
        obj.f655e = Long.MIN_VALUE;
        obj.g = -1L;
        obj.f656f = 0L;
        this.f659b = obj;
        this.c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f662f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f664j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f665k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f666l = fArr5;
        this.f660d = listView;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f663i = f658s;
        obj.f652a = 500;
        obj.f653b = 500;
        this.f672r = listView;
    }

    public static float b(float f3, float f4, float f5) {
        return f3 > f5 ? f5 : f3 < f4 ? f4 : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f3, float f4, float f5, int i3) {
        float f6;
        float interpolation;
        float b3 = b(this.f662f[i3] * f4, 0.0f, this.g[i3]);
        float c = c(f4 - f3, b3) - c(f3, b3);
        AccelerateInterpolator accelerateInterpolator = this.c;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= 0.0f) {
                f6 = 0.0f;
                if (f6 != 0.0f) {
                    return 0.0f;
                }
                float f7 = this.f664j[i3];
                float f8 = this.f665k[i3];
                float f9 = this.f666l[i3];
                float f10 = f7 * f5;
                return f6 > 0.0f ? b(f6 * f10, f8, f9) : -b((-f6) * f10, f8, f9);
            }
            interpolation = accelerateInterpolator.getInterpolation(c);
        }
        f6 = b(interpolation, -1.0f, 1.0f);
        if (f6 != 0.0f) {
        }
    }

    public final float c(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i3 = this.h;
        if (i3 == 0 || i3 == 1) {
            if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (this.f670p && i3 == 1) {
                    return 1.0f;
                }
            }
        } else if (i3 == 2 && f3 < 0.0f) {
            return f3 / (-f4);
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f668n) {
            this.f670p = false;
            return;
        }
        a aVar = this.f659b;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - aVar.f655e);
        int i5 = aVar.f653b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        aVar.f657i = i3;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        ListView listView;
        int count;
        a aVar = this.f659b;
        float f3 = aVar.f654d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.c);
        if (abs == 0 || (count = (listView = this.f672r).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i3 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i3;
        int i4 = 1;
        if (!this.f671q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.f669o = true;
        this.f667m = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.f660d;
        float a3 = a(x2, width, view2.getWidth(), 0);
        float a4 = a(motionEvent.getY(), view.getHeight(), view2.getHeight(), 1);
        a aVar = this.f659b;
        aVar.c = a3;
        aVar.f654d = a4;
        if (!this.f670p && e()) {
            if (this.f661e == null) {
                this.f661e = new F0.h(i4, this);
            }
            this.f670p = true;
            this.f668n = true;
            if (this.f667m || (i3 = this.f663i) <= 0) {
                this.f661e.run();
            } else {
                F0.h hVar = this.f661e;
                long j3 = i3;
                WeakHashMap weakHashMap = T.f402a;
                B.n(view2, hVar, j3);
            }
            this.f667m = true;
        }
        return false;
    }
}
