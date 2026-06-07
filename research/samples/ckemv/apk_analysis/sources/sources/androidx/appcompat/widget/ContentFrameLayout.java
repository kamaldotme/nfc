package androidx.appcompat.widget;

import J.C0003b0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import f.m;
import f.v;
import j.MenuC0207m;
import k.C0280f;
import k.C0288j;
import k.InterfaceC0293l0;
import k.InterfaceC0295m0;
import k.n1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f1592b;
    public TypedValue c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f1593d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f1594e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f1595f;
    public TypedValue g;
    public final Rect h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0293l0 f1596i;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1595f == null) {
            this.f1595f = new TypedValue();
        }
        return this.f1595f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1593d == null) {
            this.f1593d = new TypedValue();
        }
        return this.f1593d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1594e == null) {
            this.f1594e = new TypedValue();
        }
        return this.f1594e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1592b == null) {
            this.f1592b = new TypedValue();
        }
        return this.f1592b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0293l0 interfaceC0293l0 = this.f1596i;
        if (interfaceC0293l0 != null) {
            interfaceC0293l0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0288j c0288j;
        super.onDetachedFromWindow();
        InterfaceC0293l0 interfaceC0293l0 = this.f1596i;
        if (interfaceC0293l0 != null) {
            v vVar = ((m) interfaceC0293l0).c;
            InterfaceC0295m0 interfaceC0295m0 = vVar.f2990s;
            if (interfaceC0295m0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0295m0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((n1) actionBarOverlayLayout.f1558f).f3737a.f1655b;
                if (actionMenuView != null && (c0288j = actionMenuView.f1583u) != null) {
                    c0288j.f();
                    C0280f c0280f = c0288j.f3708u;
                    if (c0280f != null && c0280f.b()) {
                        c0280f.f3374j.dismiss();
                    }
                }
            }
            if (vVar.f2995x != null) {
                vVar.f2984m.getDecorView().removeCallbacks(vVar.f2996y);
                if (vVar.f2995x.isShowing()) {
                    try {
                        vVar.f2995x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f2995x = null;
            }
            C0003b0 c0003b0 = vVar.f2997z;
            if (c0003b0 != null) {
                c0003b0.b();
            }
            MenuC0207m menuC0207m = vVar.y(0).h;
            if (menuC0207m != null) {
                menuC0207m.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        int measuredWidth;
        TypedValue typedValue;
        int i7;
        int i8;
        float fraction;
        int i9;
        int i10;
        float fraction2;
        int i11;
        int i12;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z4 = true;
        boolean z5 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.h;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z5 ? this.f1594e : this.f1593d;
            if (typedValue2 != null && (i11 = typedValue2.type) != 0) {
                if (i11 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i11 == 6) {
                    int i13 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i13, i13);
                } else {
                    i12 = 0;
                    if (i12 > 0) {
                        i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                        z3 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z5 ? this.f1595f : this.g;
                            if (typedValue3 != null && (i9 = typedValue3.type) != 0) {
                                if (i9 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i9 == 6) {
                                    int i14 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i14, i14);
                                } else {
                                    i10 = 0;
                                    if (i10 > 0) {
                                        i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                                        super.onMeasure(i5, i6);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z3 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z5 ? this.c : this.f1592b;
                                            if (typedValue != null && (i7 = typedValue.type) != 0) {
                                                if (i7 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i7 == 6) {
                                                    int i15 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i15, i15);
                                                } else {
                                                    i8 = 0;
                                                    if (i8 > 0) {
                                                        i8 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i8) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                                                        if (z4) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i6);
                                                        return;
                                                    }
                                                }
                                                i8 = (int) fraction;
                                                if (i8 > 0) {
                                                }
                                                if (measuredWidth < i8) {
                                                }
                                            }
                                        }
                                        z4 = false;
                                        if (z4) {
                                        }
                                    }
                                }
                                i10 = (int) fraction2;
                                if (i10 > 0) {
                                }
                            }
                        }
                        i6 = i4;
                        super.onMeasure(i5, i6);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z3) {
                            if (!z5) {
                            }
                            if (typedValue != null) {
                                if (i7 != 5) {
                                }
                                i8 = (int) fraction;
                                if (i8 > 0) {
                                }
                                if (measuredWidth < i8) {
                                }
                            }
                        }
                        z4 = false;
                        if (z4) {
                        }
                    }
                }
                i12 = (int) fraction3;
                if (i12 > 0) {
                }
            }
        }
        i5 = i3;
        z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i6 = i4;
        super.onMeasure(i5, i6);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z3) {
        }
        z4 = false;
        if (z4) {
        }
    }

    public void setAttachListener(InterfaceC0293l0 interfaceC0293l0) {
        this.f1596i = interfaceC0293l0;
    }
}
