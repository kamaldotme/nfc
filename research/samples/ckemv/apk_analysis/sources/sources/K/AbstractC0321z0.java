package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import e.AbstractC0116a;
import java.util.WeakHashMap;

/* renamed from: k.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0321z0 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3809b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f3810d;

    /* renamed from: e, reason: collision with root package name */
    public int f3811e;

    /* renamed from: f, reason: collision with root package name */
    public int f3812f;
    public int g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3813i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3814j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f3815k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3816l;

    /* renamed from: m, reason: collision with root package name */
    public int f3817m;

    /* renamed from: n, reason: collision with root package name */
    public int f3818n;

    /* renamed from: o, reason: collision with root package name */
    public int f3819o;

    /* renamed from: p, reason: collision with root package name */
    public int f3820p;

    public AbstractC0321z0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3809b = true;
        this.c = -1;
        this.f3810d = 0;
        this.f3812f = 8388659;
        int[] iArr = AbstractC0116a.f2675n;
        v0.m F2 = v0.m.F(context, attributeSet, iArr, i3, 0);
        J.T.k(this, context, iArr, attributeSet, (TypedArray) F2.f5087d, i3);
        TypedArray typedArray = (TypedArray) F2.f5087d;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.c = typedArray.getInt(3, -1);
        this.f3813i = typedArray.getBoolean(7, false);
        setDividerDrawable(F2.r(5));
        this.f3819o = typedArray.getInt(8, 0);
        this.f3820p = typedArray.getDimensionPixelSize(6, 0);
        F2.J();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0319y0;
    }

    public final void f(Canvas canvas, int i3) {
        this.f3816l.setBounds(getPaddingLeft() + this.f3820p, i3, (getWidth() - getPaddingRight()) - this.f3820p, this.f3818n + i3);
        this.f3816l.draw(canvas);
    }

    public final void g(Canvas canvas, int i3) {
        this.f3816l.setBounds(i3, getPaddingTop() + this.f3820p, this.f3817m + i3, (getHeight() - getPaddingBottom()) - this.f3820p);
        this.f3816l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.c;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i5 = this.f3810d;
        if (this.f3811e == 1 && (i3 = this.f3812f & 112) != 48) {
            if (i3 == 16) {
                i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
            } else if (i3 == 80) {
                i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
            }
        }
        return i5 + ((LinearLayout.LayoutParams) ((C0319y0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.c;
    }

    public Drawable getDividerDrawable() {
        return this.f3816l;
    }

    public int getDividerPadding() {
        return this.f3820p;
    }

    public int getDividerWidth() {
        return this.f3817m;
    }

    public int getGravity() {
        return this.f3812f;
    }

    public int getOrientation() {
        return this.f3811e;
    }

    public int getShowDividers() {
        return this.f3819o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, k.y0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, k.y0] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0319y0 generateDefaultLayoutParams() {
        int i3 = this.f3811e;
        if (i3 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i3 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.y0] */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0319y0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.y0] */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0319y0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean k(int i3) {
        if (i3 == 0) {
            return (this.f3819o & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f3819o & 4) != 0;
        }
        if ((this.f3819o & 2) == 0) {
            return false;
        }
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (getChildAt(i4).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        if (this.f3816l == null) {
            return;
        }
        int i4 = 0;
        if (this.f3811e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && k(i4)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0319y0) childAt.getLayoutParams())).topMargin) - this.f3818n);
                }
                i4++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f3818n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0319y0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a3 = r1.a(this);
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i4)) {
                C0319y0 c0319y0 = (C0319y0) childAt3.getLayoutParams();
                g(canvas, a3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0319y0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0319y0).leftMargin) - this.f3817m);
            }
            i4++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0319y0 c0319y02 = (C0319y0) childAt4.getLayoutParams();
                if (a3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0319y02).leftMargin;
                    i3 = this.f3817m;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0319y02).rightMargin;
                }
            } else if (a3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f3817m;
                right = left - i3;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 8;
        if (this.f3811e == 1) {
            int paddingLeft = getPaddingLeft();
            int i22 = i5 - i3;
            int paddingRight = i22 - getPaddingRight();
            int paddingRight2 = (i22 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i23 = this.f3812f;
            int i24 = i23 & 112;
            int i25 = 8388615 & i23;
            int paddingTop = i24 != 16 ? i24 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - this.g : getPaddingTop() + (((i6 - i4) - this.g) / 2);
            int i26 = 0;
            while (i26 < virtualChildCount) {
                View childAt = getChildAt(i26);
                if (childAt != null && childAt.getVisibility() != i21) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0319y0 c0319y0 = (C0319y0) childAt.getLayoutParams();
                    int i27 = ((LinearLayout.LayoutParams) c0319y0).gravity;
                    if (i27 < 0) {
                        i27 = i25;
                    }
                    WeakHashMap weakHashMap = J.T.f402a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, J.C.d(this)) & 7;
                    if (absoluteGravity == 1) {
                        i18 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0319y0).leftMargin;
                        i19 = ((LinearLayout.LayoutParams) c0319y0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i20 = ((LinearLayout.LayoutParams) c0319y0).leftMargin + paddingLeft;
                        if (k(i26)) {
                            paddingTop += this.f3818n;
                        }
                        int i28 = paddingTop + ((LinearLayout.LayoutParams) c0319y0).topMargin;
                        childAt.layout(i20, i28, measuredWidth + i20, i28 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c0319y0).bottomMargin + i28;
                    } else {
                        i18 = paddingRight - measuredWidth;
                        i19 = ((LinearLayout.LayoutParams) c0319y0).rightMargin;
                    }
                    i20 = i18 - i19;
                    if (k(i26)) {
                    }
                    int i282 = paddingTop + ((LinearLayout.LayoutParams) c0319y0).topMargin;
                    childAt.layout(i20, i282, measuredWidth + i20, i282 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c0319y0).bottomMargin + i282;
                }
                i26++;
                i21 = 8;
            }
            return;
        }
        boolean a3 = r1.a(this);
        int paddingTop2 = getPaddingTop();
        int i29 = i6 - i4;
        int paddingBottom = i29 - getPaddingBottom();
        int paddingBottom2 = (i29 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i30 = this.f3812f;
        int i31 = 8388615 & i30;
        int i32 = i30 & 112;
        boolean z4 = this.f3809b;
        int[] iArr = this.f3814j;
        int[] iArr2 = this.f3815k;
        WeakHashMap weakHashMap2 = J.T.f402a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i31, J.C.d(this));
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i3) - this.g : getPaddingLeft() + (((i5 - i3) - this.g) / 2);
        if (a3) {
            i8 = virtualChildCount2 - 1;
            i7 = -1;
        } else {
            i7 = 1;
            i8 = 0;
        }
        int i33 = 0;
        while (i33 < virtualChildCount2) {
            int i34 = (i7 * i33) + i8;
            View childAt2 = getChildAt(i34);
            if (childAt2 == null) {
                i9 = i8;
                i10 = i7;
                i11 = virtualChildCount2;
                i12 = i32;
                i13 = 1;
            } else {
                i9 = i8;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C0319y0 c0319y02 = (C0319y0) childAt2.getLayoutParams();
                    i10 = i7;
                    if (z4) {
                        i11 = virtualChildCount2;
                        if (((LinearLayout.LayoutParams) c0319y02).height != -1) {
                            i14 = childAt2.getBaseline();
                            i15 = ((LinearLayout.LayoutParams) c0319y02).gravity;
                            if (i15 < 0) {
                                i15 = i32;
                            }
                            i16 = i15 & 112;
                            i12 = i32;
                            if (i16 != 16) {
                                i17 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0319y02).topMargin) - ((LinearLayout.LayoutParams) c0319y02).bottomMargin;
                            } else if (i16 == 48) {
                                i17 = ((LinearLayout.LayoutParams) c0319y02).topMargin + paddingTop2;
                                if (i14 != -1) {
                                    i17 = (iArr[1] - i14) + i17;
                                }
                            } else if (i16 != 80) {
                                i17 = paddingTop2;
                            } else {
                                i17 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c0319y02).bottomMargin;
                                if (i14 != -1) {
                                    i17 -= iArr2[2] - (childAt2.getMeasuredHeight() - i14);
                                }
                            }
                            if (k(i34)) {
                                paddingLeft2 += this.f3817m;
                            }
                            int i35 = paddingLeft2 + ((LinearLayout.LayoutParams) c0319y02).leftMargin;
                            childAt2.layout(i35, i17, i35 + measuredWidth2, i17 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0319y02).rightMargin + i35;
                        }
                    } else {
                        i11 = virtualChildCount2;
                    }
                    i14 = -1;
                    i15 = ((LinearLayout.LayoutParams) c0319y02).gravity;
                    if (i15 < 0) {
                    }
                    i16 = i15 & 112;
                    i12 = i32;
                    if (i16 != 16) {
                    }
                    if (k(i34)) {
                    }
                    int i352 = paddingLeft2 + ((LinearLayout.LayoutParams) c0319y02).leftMargin;
                    childAt2.layout(i352, i17, i352 + measuredWidth2, i17 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0319y02).rightMargin + i352;
                } else {
                    i10 = i7;
                    i11 = virtualChildCount2;
                    i12 = i32;
                }
                i13 = 1;
            }
            i33 += i13;
            i8 = i9;
            i7 = i10;
            virtualChildCount2 = i11;
            i32 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i3, int i4) {
        char c;
        int i5;
        int max;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        char c3;
        int i10;
        int i11;
        int i12;
        int i13;
        float f4;
        int i14;
        int i15;
        boolean z3;
        int baseline;
        int i16;
        int i17;
        float f5;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z4;
        boolean z5;
        C0319y0 c0319y0;
        boolean z6;
        int i23;
        boolean z7;
        int i24;
        int i25;
        int baseline2;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z8;
        C0319y0 c0319y02;
        boolean z9;
        int i35;
        boolean z10;
        int max2;
        int i36 = -2;
        int i37 = 1073741824;
        int i38 = 8;
        int i39 = Integer.MIN_VALUE;
        float f6 = 0.0f;
        boolean z11 = true;
        if (this.f3811e == 1) {
            this.g = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i40 = this.c;
            boolean z12 = this.f3813i;
            boolean z13 = true;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            boolean z14 = false;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            boolean z15 = false;
            float f7 = 0.0f;
            while (i41 < virtualChildCount) {
                View childAt = getChildAt(i41);
                if (childAt == null) {
                    this.g = this.g;
                } else if (childAt.getVisibility() != i38) {
                    if (k(i41)) {
                        this.g += this.f3818n;
                    }
                    C0319y0 c0319y03 = (C0319y0) childAt.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) c0319y03).weight;
                    f7 += f8;
                    if (mode2 == i37 && ((LinearLayout.LayoutParams) c0319y03).height == 0 && f8 > f6) {
                        int i47 = this.g;
                        this.g = Math.max(i47, ((LinearLayout.LayoutParams) c0319y03).topMargin + i47 + ((LinearLayout.LayoutParams) c0319y03).bottomMargin);
                        i31 = i40;
                        i32 = mode2;
                        i33 = mode;
                        i34 = virtualChildCount;
                        c0319y02 = c0319y03;
                        z9 = true;
                        z8 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) c0319y03).height != 0 || f8 <= f6) {
                            i30 = i39;
                        } else {
                            ((LinearLayout.LayoutParams) c0319y03).height = i36;
                            i30 = 0;
                        }
                        int i48 = f7 == f6 ? this.g : 0;
                        i31 = i40;
                        i32 = mode2;
                        i33 = mode;
                        i34 = virtualChildCount;
                        z8 = true;
                        c0319y02 = c0319y03;
                        measureChildWithMargins(childAt, i3, 0, i4, i48);
                        if (i30 != i39) {
                            ((LinearLayout.LayoutParams) c0319y02).height = i30;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i49 = this.g;
                        this.g = Math.max(i49, i49 + measuredHeight + ((LinearLayout.LayoutParams) c0319y02).topMargin + ((LinearLayout.LayoutParams) c0319y02).bottomMargin);
                        int i50 = i44;
                        if (z12) {
                            i44 = Math.max(measuredHeight, i50);
                        }
                        z9 = z14;
                    }
                    if (i31 >= 0 && i31 == i41 + 1) {
                        this.f3810d = this.g;
                    }
                    if (i41 < i31 && ((LinearLayout.LayoutParams) c0319y02).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i35 = i33;
                    if (i35 == 1073741824 || ((LinearLayout.LayoutParams) c0319y02).width != -1) {
                        z10 = false;
                    } else {
                        z10 = z8;
                        z15 = z10;
                    }
                    int i51 = ((LinearLayout.LayoutParams) c0319y02).leftMargin + ((LinearLayout.LayoutParams) c0319y02).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i51;
                    max2 = Math.max(i45, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i46, childAt.getMeasuredState());
                    boolean z16 = (z13 && ((LinearLayout.LayoutParams) c0319y02).width == -1) ? z8 : false;
                    if (((LinearLayout.LayoutParams) c0319y02).weight > 0.0f) {
                        if (!z10) {
                            i51 = measuredWidth;
                        }
                        i43 = Math.max(i43, i51);
                    } else {
                        int i52 = i43;
                        if (!z10) {
                            i51 = measuredWidth;
                        }
                        i42 = Math.max(i42, i51);
                        i43 = i52;
                    }
                    z14 = z9;
                    i46 = combineMeasuredStates;
                    z13 = z16;
                    i41++;
                    mode = i35;
                    i45 = max2;
                    i40 = i31;
                    z11 = z8;
                    mode2 = i32;
                    virtualChildCount = i34;
                    i36 = -2;
                    i37 = 1073741824;
                    i38 = 8;
                    i39 = Integer.MIN_VALUE;
                    f6 = 0.0f;
                }
                i31 = i40;
                i32 = mode2;
                i35 = mode;
                i34 = virtualChildCount;
                max2 = i45;
                z8 = true;
                i41++;
                mode = i35;
                i45 = max2;
                i40 = i31;
                z11 = z8;
                mode2 = i32;
                virtualChildCount = i34;
                i36 = -2;
                i37 = 1073741824;
                i38 = 8;
                i39 = Integer.MIN_VALUE;
                f6 = 0.0f;
            }
            int i53 = mode2;
            int i54 = mode;
            int i55 = virtualChildCount;
            boolean z17 = z11;
            int i56 = i42;
            int i57 = i43;
            int i58 = i44;
            int i59 = i45;
            int i60 = i46;
            if (this.g > 0 && k(i55)) {
                this.g += this.f3818n;
            }
            int i61 = i53;
            if (z12 && (i61 == Integer.MIN_VALUE || i61 == 0)) {
                this.g = 0;
                for (int i62 = 0; i62 < i55; i62++) {
                    View childAt2 = getChildAt(i62);
                    if (childAt2 == null) {
                        this.g = this.g;
                    } else if (childAt2.getVisibility() != 8) {
                        C0319y0 c0319y04 = (C0319y0) childAt2.getLayoutParams();
                        int i63 = this.g;
                        this.g = Math.max(i63, i63 + i58 + ((LinearLayout.LayoutParams) c0319y04).topMargin + ((LinearLayout.LayoutParams) c0319y04).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.g;
            this.g = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, 0);
            int i64 = (16777215 & resolveSizeAndState) - this.g;
            if (z14 || (i64 != 0 && f7 > 0.0f)) {
                float f9 = this.h;
                if (f9 > 0.0f) {
                    f7 = f9;
                }
                this.g = 0;
                int i65 = 0;
                while (i65 < i55) {
                    View childAt3 = getChildAt(i65);
                    if (childAt3.getVisibility() == 8) {
                        i27 = i61;
                    } else {
                        C0319y0 c0319y05 = (C0319y0) childAt3.getLayoutParams();
                        float f10 = ((LinearLayout.LayoutParams) c0319y05).weight;
                        if (f10 > 0.0f) {
                            int i66 = (int) ((i64 * f10) / f7);
                            f7 -= f10;
                            int i67 = i64 - i66;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c0319y05).leftMargin + ((LinearLayout.LayoutParams) c0319y05).rightMargin, ((LinearLayout.LayoutParams) c0319y05).width);
                            if (((LinearLayout.LayoutParams) c0319y05).height == 0) {
                                i29 = 1073741824;
                                if (i61 == 1073741824) {
                                    if (i66 <= 0) {
                                        i66 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i66, 1073741824));
                                    i60 = View.combineMeasuredStates(i60, childAt3.getMeasuredState() & (-256));
                                    i64 = i67;
                                }
                            } else {
                                i29 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i66;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i29));
                            i60 = View.combineMeasuredStates(i60, childAt3.getMeasuredState() & (-256));
                            i64 = i67;
                        }
                        int i68 = ((LinearLayout.LayoutParams) c0319y05).leftMargin + ((LinearLayout.LayoutParams) c0319y05).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i68;
                        int max3 = Math.max(i59, measuredWidth2);
                        if (i54 != 1073741824) {
                            i27 = i61;
                            i28 = -1;
                        } else {
                            i27 = i61;
                            i28 = -1;
                        }
                        i68 = measuredWidth2;
                        i56 = Math.max(i56, i68);
                        boolean z18 = (z13 && ((LinearLayout.LayoutParams) c0319y05).width == i28) ? z17 : false;
                        int i69 = this.g;
                        this.g = Math.max(i69, childAt3.getMeasuredHeight() + i69 + ((LinearLayout.LayoutParams) c0319y05).topMargin + ((LinearLayout.LayoutParams) c0319y05).bottomMargin);
                        z13 = z18;
                        i59 = max3;
                    }
                    i65++;
                    i61 = i27;
                }
                this.g = getPaddingBottom() + getPaddingTop() + this.g;
            } else {
                i56 = Math.max(i56, i57);
                if (z12 && i61 != 1073741824) {
                    for (int i70 = 0; i70 < i55; i70++) {
                        View childAt4 = getChildAt(i70);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0319y0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i58, 1073741824));
                        }
                    }
                }
            }
            int i71 = i59;
            if (z13 || i54 == 1073741824) {
                i56 = i71;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i56, getSuggestedMinimumWidth()), i3, i60), resolveSizeAndState);
            if (z15) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i72 = 0; i72 < i55; i72++) {
                    View childAt5 = getChildAt(i72);
                    if (childAt5.getVisibility() != 8) {
                        C0319y0 c0319y06 = (C0319y0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0319y06).width == -1) {
                            int i73 = ((LinearLayout.LayoutParams) c0319y06).height;
                            ((LinearLayout.LayoutParams) c0319y06).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i4, 0);
                            ((LinearLayout.LayoutParams) c0319y06).height = i73;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.g = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i3);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (this.f3814j == null || this.f3815k == null) {
            this.f3814j = new int[4];
            this.f3815k = new int[4];
        }
        int[] iArr = this.f3814j;
        int[] iArr2 = this.f3815k;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z19 = this.f3809b;
        boolean z20 = this.f3813i;
        boolean z21 = mode3 == 1073741824;
        boolean z22 = true;
        int i74 = 0;
        float f11 = 0.0f;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        int i79 = 0;
        boolean z23 = false;
        boolean z24 = false;
        while (i76 < virtualChildCount2) {
            View childAt6 = getChildAt(i76);
            if (childAt6 == null) {
                this.g = this.g;
                i22 = i76;
                z4 = z20;
                z5 = z19;
            } else {
                int i80 = i74;
                int i81 = i75;
                if (childAt6.getVisibility() == 8) {
                    z5 = z19;
                    i74 = i80;
                    i75 = i81;
                    i22 = i76;
                    z4 = z20;
                } else {
                    if (k(i76)) {
                        this.g += this.f3817m;
                    }
                    C0319y0 c0319y07 = (C0319y0) childAt6.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) c0319y07).weight;
                    float f13 = f11 + f12;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0319y07).width == 0 && f12 > 0.0f) {
                        if (z21) {
                            i26 = i76;
                            this.g = ((LinearLayout.LayoutParams) c0319y07).leftMargin + ((LinearLayout.LayoutParams) c0319y07).rightMargin + this.g;
                        } else {
                            i26 = i76;
                            int i82 = this.g;
                            this.g = Math.max(i82, ((LinearLayout.LayoutParams) c0319y07).leftMargin + i82 + ((LinearLayout.LayoutParams) c0319y07).rightMargin);
                        }
                        if (z19) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            c0319y0 = c0319y07;
                            i19 = i80;
                            i20 = i81;
                            i22 = i26;
                            z4 = z20;
                            z5 = z19;
                        } else {
                            c0319y0 = c0319y07;
                            i19 = i80;
                            i20 = i81;
                            i22 = i26;
                            i23 = 1073741824;
                            z4 = z20;
                            z5 = z19;
                            z6 = true;
                            if (mode4 == i23 && ((LinearLayout.LayoutParams) c0319y0).height == -1) {
                                z7 = true;
                                z24 = true;
                            } else {
                                z7 = false;
                            }
                            i24 = ((LinearLayout.LayoutParams) c0319y0).topMargin + ((LinearLayout.LayoutParams) c0319y0).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i24;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i77, childAt6.getMeasuredState());
                            if (z5 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i25 = i24;
                            } else {
                                int i83 = ((LinearLayout.LayoutParams) c0319y0).gravity;
                                if (i83 < 0) {
                                    i83 = this.f3812f;
                                }
                                int i84 = (((i83 & 112) >> 4) & (-2)) >> 1;
                                i25 = i24;
                                iArr[i84] = Math.max(iArr[i84], baseline2);
                                iArr2[i84] = Math.max(iArr2[i84], measuredHeight3 - baseline2);
                            }
                            int max4 = Math.max(i20, measuredHeight3);
                            boolean z25 = !z22 && ((LinearLayout.LayoutParams) c0319y0).height == -1;
                            if (((LinearLayout.LayoutParams) c0319y0).weight <= 0.0f) {
                                if (z7) {
                                    measuredHeight3 = i25;
                                }
                                i79 = Math.max(i79, measuredHeight3);
                                i74 = i19;
                            } else {
                                if (z7) {
                                    measuredHeight3 = i25;
                                }
                                i74 = Math.max(i19, measuredHeight3);
                            }
                            i75 = max4;
                            i77 = combineMeasuredStates2;
                            z23 = z6;
                            z22 = z25;
                            f11 = f13;
                        }
                    } else {
                        int i85 = i76;
                        if (((LinearLayout.LayoutParams) c0319y07).width == 0) {
                            f5 = 0.0f;
                            if (f12 > 0.0f) {
                                ((LinearLayout.LayoutParams) c0319y07).width = -2;
                                i18 = 0;
                                i19 = i80;
                                i20 = i81;
                                i21 = i18;
                                i22 = i85;
                                z4 = z20;
                                z5 = z19;
                                measureChildWithMargins(childAt6, i3, f13 != f5 ? this.g : 0, i4, 0);
                                if (i21 == Integer.MIN_VALUE) {
                                    c0319y0 = c0319y07;
                                    ((LinearLayout.LayoutParams) c0319y0).width = i21;
                                } else {
                                    c0319y0 = c0319y07;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z21) {
                                    int i86 = this.g;
                                    this.g = Math.max(i86, i86 + measuredWidth3 + ((LinearLayout.LayoutParams) c0319y0).leftMargin + ((LinearLayout.LayoutParams) c0319y0).rightMargin);
                                } else {
                                    this.g = ((LinearLayout.LayoutParams) c0319y0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0319y0).rightMargin + this.g;
                                }
                                if (z4) {
                                    i78 = Math.max(measuredWidth3, i78);
                                }
                            }
                        } else {
                            f5 = 0.0f;
                        }
                        i18 = Integer.MIN_VALUE;
                        i19 = i80;
                        i20 = i81;
                        i21 = i18;
                        i22 = i85;
                        z4 = z20;
                        z5 = z19;
                        measureChildWithMargins(childAt6, i3, f13 != f5 ? this.g : 0, i4, 0);
                        if (i21 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z21) {
                        }
                        if (z4) {
                        }
                    }
                    z6 = z23;
                    i23 = 1073741824;
                    if (mode4 == i23) {
                    }
                    z7 = false;
                    i24 = ((LinearLayout.LayoutParams) c0319y0).topMargin + ((LinearLayout.LayoutParams) c0319y0).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i24;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i77, childAt6.getMeasuredState());
                    if (z5) {
                    }
                    i25 = i24;
                    int max42 = Math.max(i20, measuredHeight32);
                    if (z22) {
                    }
                    if (((LinearLayout.LayoutParams) c0319y0).weight <= 0.0f) {
                    }
                    i75 = max42;
                    i77 = combineMeasuredStates22;
                    z23 = z6;
                    z22 = z25;
                    f11 = f13;
                }
            }
            i76 = i22 + 1;
            z20 = z4;
            z19 = z5;
        }
        int i87 = i75;
        boolean z26 = z20;
        boolean z27 = z19;
        if (this.g > 0 && k(virtualChildCount2)) {
            this.g += this.f3817m;
        }
        int i88 = iArr[1];
        if (i88 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] == -1) {
                max = i87;
                i5 = i77;
                if (z26 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.g = 0;
                    for (i17 = 0; i17 < virtualChildCount2; i17++) {
                        View childAt7 = getChildAt(i17);
                        if (childAt7 == null) {
                            this.g = this.g;
                        } else if (childAt7.getVisibility() != 8) {
                            C0319y0 c0319y08 = (C0319y0) childAt7.getLayoutParams();
                            if (z21) {
                                this.g = ((LinearLayout.LayoutParams) c0319y08).leftMargin + i78 + ((LinearLayout.LayoutParams) c0319y08).rightMargin + this.g;
                            } else {
                                int i89 = this.g;
                                this.g = Math.max(i89, i89 + i78 + ((LinearLayout.LayoutParams) c0319y08).leftMargin + ((LinearLayout.LayoutParams) c0319y08).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.g;
                this.g = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, 0);
                int i90 = (16777215 & resolveSizeAndState2) - this.g;
                if (!z23 || (i90 != 0 && f11 > 0.0f)) {
                    f3 = this.h;
                    if (f3 > 0.0f) {
                        f11 = f3;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.g = 0;
                    int i91 = i5;
                    max = -1;
                    i6 = 0;
                    while (i6 < virtualChildCount2) {
                        View childAt8 = getChildAt(i6);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i11 = i90;
                            i12 = virtualChildCount2;
                        } else {
                            C0319y0 c0319y09 = (C0319y0) childAt8.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) c0319y09).weight;
                            if (f14 > 0.0f) {
                                i12 = virtualChildCount2;
                                int i92 = (int) ((i90 * f14) / f11);
                                float f15 = f11 - f14;
                                int i93 = i90 - i92;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c0319y09).topMargin + ((LinearLayout.LayoutParams) c0319y09).bottomMargin, ((LinearLayout.LayoutParams) c0319y09).height);
                                if (((LinearLayout.LayoutParams) c0319y09).width == 0) {
                                    i16 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i92 <= 0) {
                                            i92 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i92, 1073741824), childMeasureSpec2);
                                        i91 = View.combineMeasuredStates(i91, childAt8.getMeasuredState() & (-16777216));
                                        f11 = f15;
                                        i13 = i93;
                                    }
                                } else {
                                    i16 = 1073741824;
                                }
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i92;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i16), childMeasureSpec2);
                                i91 = View.combineMeasuredStates(i91, childAt8.getMeasuredState() & (-16777216));
                                f11 = f15;
                                i13 = i93;
                            } else {
                                i13 = i90;
                                i12 = virtualChildCount2;
                            }
                            if (z21) {
                                f4 = f11;
                                this.g = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0319y09).leftMargin + ((LinearLayout.LayoutParams) c0319y09).rightMargin + this.g;
                                i14 = i13;
                            } else {
                                f4 = f11;
                                int i94 = this.g;
                                i14 = i13;
                                this.g = Math.max(i94, childAt8.getMeasuredWidth() + i94 + ((LinearLayout.LayoutParams) c0319y09).leftMargin + ((LinearLayout.LayoutParams) c0319y09).rightMargin);
                            }
                            boolean z28 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0319y09).height == -1;
                            int i95 = ((LinearLayout.LayoutParams) c0319y09).topMargin + ((LinearLayout.LayoutParams) c0319y09).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i95;
                            max = Math.max(max, measuredHeight4);
                            if (!z28) {
                                i95 = measuredHeight4;
                            }
                            i74 = Math.max(i74, i95);
                            if (z22) {
                                i15 = -1;
                                if (((LinearLayout.LayoutParams) c0319y09).height == -1) {
                                    z3 = true;
                                    if (!z27 && (baseline = childAt8.getBaseline()) != i15) {
                                        int i96 = ((LinearLayout.LayoutParams) c0319y09).gravity;
                                        if (i96 < 0) {
                                            i96 = this.f3812f;
                                        }
                                        int i97 = (((i96 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i97] = Math.max(iArr[i97], baseline);
                                        iArr2[i97] = Math.max(iArr2[i97], measuredHeight4 - baseline);
                                    }
                                    z22 = z3;
                                    i11 = i14;
                                    f11 = f4;
                                }
                            } else {
                                i15 = -1;
                            }
                            z3 = false;
                            if (!z27) {
                            }
                            z22 = z3;
                            i11 = i14;
                            f11 = f4;
                        }
                        i6++;
                        i90 = i11;
                        virtualChildCount2 = i12;
                    }
                    i7 = i4;
                    i8 = virtualChildCount2;
                    this.g = getPaddingRight() + getPaddingLeft() + this.g;
                    i9 = iArr[1];
                    if (i9 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c3 = 3;
                        if (iArr[3] == -1) {
                            i10 = 0;
                            i5 = i91;
                        }
                    } else {
                        c3 = 3;
                    }
                    i10 = 0;
                    max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i9, iArr[2]))));
                    i5 = i91;
                } else {
                    i74 = Math.max(i74, i79);
                    if (z26 && mode3 != 1073741824) {
                        for (int i98 = 0; i98 < virtualChildCount2; i98++) {
                            View childAt9 = getChildAt(i98);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0319y0) childAt9.getLayoutParams())).weight > 0.0f) {
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i78, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i7 = i4;
                    i8 = virtualChildCount2;
                    i10 = 0;
                }
                if (!z22 || mode4 == 1073741824) {
                    i74 = max;
                }
                setMeasuredDimension((i5 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i74, getSuggestedMinimumHeight()), i7, i5 << 16));
                if (z24) {
                    return;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i99 = i8;
                while (i10 < i99) {
                    View childAt10 = getChildAt(i10);
                    if (childAt10.getVisibility() != 8) {
                        C0319y0 c0319y010 = (C0319y0) childAt10.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0319y010).height == -1) {
                            int i100 = ((LinearLayout.LayoutParams) c0319y010).width;
                            ((LinearLayout.LayoutParams) c0319y010).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i3, 0, makeMeasureSpec3, 0);
                            ((LinearLayout.LayoutParams) c0319y010).width = i100;
                        }
                    }
                    i10++;
                }
                return;
            }
        } else {
            c = 3;
        }
        i5 = i77;
        max = Math.max(i87, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(i88, iArr[2]))));
        if (z26) {
            this.g = 0;
            while (i17 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.g;
        this.g = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i3, 0);
        int i902 = (16777215 & resolveSizeAndState22) - this.g;
        if (z23) {
        }
        f3 = this.h;
        if (f3 > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.g = 0;
        int i912 = i5;
        max = -1;
        i6 = 0;
        while (i6 < virtualChildCount2) {
        }
        i7 = i4;
        i8 = virtualChildCount2;
        this.g = getPaddingRight() + getPaddingLeft() + this.g;
        i9 = iArr[1];
        if (i9 != -1) {
        }
        c3 = 3;
        i10 = 0;
        max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i9, iArr[2]))));
        i5 = i912;
        if (!z22) {
        }
        i74 = max;
        setMeasuredDimension((i5 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i74, getSuggestedMinimumHeight()), i7, i5 << 16));
        if (z24) {
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.f3809b = z3;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.c = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3816l) {
            return;
        }
        this.f3816l = drawable;
        if (drawable != null) {
            this.f3817m = drawable.getIntrinsicWidth();
            this.f3818n = drawable.getIntrinsicHeight();
        } else {
            this.f3817m = 0;
            this.f3818n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f3820p = i3;
    }

    public void setGravity(int i3) {
        if (this.f3812f != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f3812f = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f3812f;
        if ((8388615 & i5) != i4) {
            this.f3812f = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f3813i = z3;
    }

    public void setOrientation(int i3) {
        if (this.f3811e != i3) {
            this.f3811e = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f3819o) {
            requestLayout();
        }
        this.f3819o = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f3812f;
        if ((i5 & 112) != i4) {
            this.f3812f = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.h = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
