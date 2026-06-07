package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289j0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f3712l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f3713m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3714a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3715b = false;
    public float c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f3716d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f3717e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3718f = new int[0];
    public boolean g = false;
    public TextPaint h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f3719i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f3720j;

    /* renamed from: k, reason: collision with root package name */
    public final C0283g0 f3721k;

    static {
        new ConcurrentHashMap();
    }

    public C0289j0(TextView textView) {
        this.f3719i = textView;
        this.f3720j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3721k = new C0285h0();
        } else {
            this.f3721k = new C0283g0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArr) {
            if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3713m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f3715b) {
                if (this.f3719i.getMeasuredHeight() <= 0 || this.f3719i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3721k.b(this.f3719i) ? 1048576 : (this.f3719i.getMeasuredWidth() - this.f3719i.getTotalPaddingLeft()) - this.f3719i.getTotalPaddingRight();
                int height = (this.f3719i.getHeight() - this.f3719i.getCompoundPaddingBottom()) - this.f3719i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3712l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c = c(rectF);
                        if (c != this.f3719i.getTextSize()) {
                            g(0, c);
                        }
                    } finally {
                    }
                }
            }
            this.f3715b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f3718f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 <= i3) {
            int i6 = (i5 + i3) / 2;
            int i7 = this.f3718f[i6];
            TextView textView = this.f3719i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int b3 = AbstractC0277d0.b(textView);
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i7);
            StaticLayout a3 = AbstractC0281f0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b3, this.f3719i, this.h, this.f3721k);
            if ((b3 == -1 || (a3.getLineCount() <= b3 && a3.getLineEnd(a3.getLineCount() - 1) == text.length())) && a3.getHeight() <= rectF.bottom) {
                int i8 = i6 + 1;
                i4 = i5;
                i5 = i8;
            } else {
                i4 = i6 - 1;
                i3 = i4;
            }
        }
        return this.f3718f[i4];
    }

    public final boolean f() {
        return j() && this.f3714a != 0;
    }

    public final void g(int i3, float f3) {
        Context context = this.f3720j;
        float applyDimension = TypedValue.applyDimension(i3, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3719i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a3 = AbstractC0279e0.a(textView);
            if (textView.getLayout() != null) {
                this.f3715b = false;
                try {
                    Method d3 = d("nullLayouts");
                    if (d3 != null) {
                        d3.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (a3) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f3714a == 1) {
            if (!this.g || this.f3718f.length == 0) {
                int floor = ((int) Math.floor((this.f3717e - this.f3716d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((i3 * this.c) + this.f3716d);
                }
                this.f3718f = b(iArr);
            }
            this.f3715b = true;
        } else {
            this.f3715b = false;
        }
        return this.f3715b;
    }

    public final boolean i() {
        boolean z3 = this.f3718f.length > 0;
        this.g = z3;
        if (z3) {
            this.f3714a = 1;
            this.f3716d = r0[0];
            this.f3717e = r0[r1 - 1];
            this.c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.f3719i instanceof C0312v);
    }

    public final void k(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f4 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f3714a = 1;
        this.f3716d = f3;
        this.f3717e = f4;
        this.c = f5;
        this.g = false;
    }
}
