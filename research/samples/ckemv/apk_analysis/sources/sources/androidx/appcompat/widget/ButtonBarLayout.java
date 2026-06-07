package androidx.appcompat.widget;

import J.B;
import J.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import e.AbstractC0116a;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1590b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public int f1591d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1591d = -1;
        int[] iArr = AbstractC0116a.f2672k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        T.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f1590b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1590b);
        }
    }

    private void setStacked(boolean z3) {
        if (this.c != z3) {
            if (!z3 || this.f1590b) {
                this.c = z3;
                setOrientation(z3 ? 1 : 0);
                setGravity(z3 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z3 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r2 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        int size = View.MeasureSpec.getSize(i3);
        int i7 = 0;
        if (this.f1590b) {
            if (size > this.f1591d && this.c) {
                setStacked(false);
            }
            this.f1591d = size;
        }
        if (this.c || View.MeasureSpec.getMode(i3) != 1073741824) {
            i5 = i3;
            z3 = false;
        } else {
            i5 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i5, i4);
        if (this.f1590b && !this.c && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
        }
        super.onMeasure(i3, i4);
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i6 = -1;
            if (i8 >= childCount) {
                i8 = -1;
                break;
            } else if (getChildAt(i8).getVisibility() == 0) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            View childAt = getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.c) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i9).getVisibility() == 0) {
                        i6 = i9;
                        break;
                    }
                    i9++;
                }
                i7 = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i7 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = T.f402a;
        if (B.d(this) != i7) {
            setMinimumHeight(i7);
            if (i4 == 0) {
                super.onMeasure(i3, i4);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f1590b != z3) {
            this.f1590b = z3;
            if (!z3 && this.c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
