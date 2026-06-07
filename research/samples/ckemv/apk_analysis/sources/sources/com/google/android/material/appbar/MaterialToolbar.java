package com.google.android.material.appbar;

import B.b;
import J.B;
import J.H;
import J.T;
import O0.k;
import O0.l;
import U0.g;
import Z0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import j.MenuC0207m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import v0.f;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: W, reason: collision with root package name */
    public static final ImageView.ScaleType[] f2264W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R, reason: collision with root package name */
    public Integer f2265R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2266S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f2267T;

    /* renamed from: U, reason: collision with root package name */
    public ImageView.ScaleType f2268U;

    /* renamed from: V, reason: collision with root package name */
    public Boolean f2269V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray f3 = k.f(context2, attributeSet, A0.a.f36r, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (f3.hasValue(2)) {
            setNavigationIconTint(f3.getColor(2, -1));
        }
        this.f2266S = f3.getBoolean(4, false);
        this.f2267T = f3.getBoolean(3, false);
        int i3 = f3.getInt(1, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2264W;
            if (i3 < scaleTypeArr.length) {
                this.f2268U = scaleTypeArr[i3];
            }
        }
        if (f3.hasValue(0)) {
            this.f2269V = Boolean.valueOf(f3.getBoolean(0, false));
        }
        f3.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.k(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.i(context2);
            WeakHashMap weakHashMap = T.f402a;
            gVar.j(H.i(this));
            B.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2268U;
    }

    public Integer getNavigationIconTint() {
        return this.f2265R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i3) {
        Menu menu = getMenu();
        boolean z3 = menu instanceof MenuC0207m;
        if (z3) {
            ((MenuC0207m) menu).w();
        }
        super.n(i3);
        if (z3) {
            ((MenuC0207m) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            f.M(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z3, i3, i4, i5, i6);
        int i7 = 0;
        ImageView imageView2 = null;
        if (this.f2266S || this.f2267T) {
            ArrayList d3 = k.d(this, getTitle());
            boolean isEmpty = d3.isEmpty();
            l lVar = k.c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(d3, lVar);
            ArrayList d4 = k.d(this, getSubtitle());
            TextView textView2 = d4.isEmpty() ? null : (TextView) Collections.max(d4, lVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i8 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i8 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i8 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2266S && textView != null) {
                    v(textView, pair);
                }
                if (this.f2267T && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i7 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i7++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2269V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2268U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).j(f3);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f2269V;
        if (bool == null || bool.booleanValue() != z3) {
            this.f2269V = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2268U != scaleType) {
            this.f2268U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2265R != null) {
            drawable = drawable.mutate();
            b.g(drawable, this.f2265R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i3) {
        this.f2265R = Integer.valueOf(i3);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f2267T != z3) {
            this.f2267T = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f2266S != z3) {
            this.f2266S = z3;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i3 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i3;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i3, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i3 += max;
            i4 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i4 - i3, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i3, textView.getTop(), i4, textView.getBottom());
    }
}
