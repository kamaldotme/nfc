package androidx.appcompat.widget;

import J.B;
import J.C;
import J.T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import k.AbstractC0321z0;
import k.C0319y0;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC0321z0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int l(View view) {
        WeakHashMap weakHashMap = T.f402a;
        int d3 = B.d(view);
        if (d3 > 0) {
            return d3;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    @Override // k.AbstractC0321z0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i5 - i3;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i11 = gravity & 112;
        int i12 = gravity & 8388615;
        int paddingTop = i11 != 16 ? i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - measuredHeight : (((i6 - i4) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C0319y0 c0319y0 = (C0319y0) childAt.getLayoutParams();
                int i14 = ((LinearLayout.LayoutParams) c0319y0).gravity;
                if (i14 < 0) {
                    i14 = i12;
                }
                WeakHashMap weakHashMap = T.f402a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i14, C.d(this)) & 7;
                if (absoluteGravity == 1) {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0319y0).leftMargin;
                    i8 = ((LinearLayout.LayoutParams) c0319y0).rightMargin;
                } else if (absoluteGravity != 5) {
                    i9 = ((LinearLayout.LayoutParams) c0319y0).leftMargin + paddingLeft;
                    if (k(i13)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i15 = paddingTop + ((LinearLayout.LayoutParams) c0319y0).topMargin;
                    childAt.layout(i9, i15, measuredWidth + i9, i15 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0319y0).bottomMargin + i15;
                } else {
                    i7 = paddingRight - measuredWidth;
                    i8 = ((LinearLayout.LayoutParams) c0319y0).rightMargin;
                }
                i9 = i7 - i8;
                if (k(i13)) {
                }
                int i152 = paddingTop + ((LinearLayout.LayoutParams) c0319y0).topMargin;
                childAt.layout(i9, i152, measuredWidth + i9, i152 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0319y0).bottomMargin + i152;
            }
        }
    }

    @Override // k.AbstractC0321z0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i3, i4);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i3, 0);
            paddingBottom += view.getMeasuredHeight();
            i5 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i5 = 0;
        }
        if (view2 != null) {
            view2.measure(i3, 0);
            i6 = l(view2);
            i7 = view2.getMeasuredHeight() - i6;
            paddingBottom += i6;
            i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (view3 != null) {
            view3.measure(i3, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i8 = view3.getMeasuredHeight();
            paddingBottom += i8;
            i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
        } else {
            i8 = 0;
        }
        int i10 = size - paddingBottom;
        if (view2 != null) {
            int i11 = paddingBottom - i6;
            int min = Math.min(i10, i7);
            if (min > 0) {
                i10 -= min;
                i6 += min;
            }
            view2.measure(i3, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            paddingBottom = i11 + view2.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
        }
        if (view3 != null && i10 > 0) {
            view3.measure(i3, View.MeasureSpec.makeMeasureSpec(i8 + i10, mode));
            paddingBottom = (paddingBottom - i8) + view3.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                i12 = Math.max(i12, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i12, i3, i5), View.resolveSizeAndState(paddingBottom, i4, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    C0319y0 c0319y0 = (C0319y0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0319y0).width == -1) {
                        int i15 = ((LinearLayout.LayoutParams) c0319y0).height;
                        ((LinearLayout.LayoutParams) c0319y0).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i4, 0);
                        ((LinearLayout.LayoutParams) c0319y0).height = i15;
                    }
                }
            }
        }
    }
}
