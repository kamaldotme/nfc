package k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import j.ViewTreeObserverOnGlobalLayoutListenerC0198d;
import xyz.happify.ckemv.R;

/* renamed from: k.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259O extends G0 implements InterfaceC0261Q {
    public CharSequence D;

    /* renamed from: E, reason: collision with root package name */
    public ListAdapter f3603E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f3604F;

    /* renamed from: G, reason: collision with root package name */
    public int f3605G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ C0262S f3606H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0259O(C0262S c0262s, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f3606H = c0262s;
        this.f3604F = new Rect();
        this.f3580p = c0262s;
        this.f3590z = true;
        this.f3568A.setFocusable(true);
        this.f3581q = new X0.u(1, this);
    }

    @Override // k.InterfaceC0261Q
    public final CharSequence a() {
        return this.D;
    }

    @Override // k.InterfaceC0261Q
    public final void g(int i3, int i4) {
        ViewTreeObserver viewTreeObserver;
        C0245A c0245a = this.f3568A;
        boolean isShowing = c0245a.isShowing();
        s();
        this.f3568A.setInputMethodMode(2);
        i();
        C0311u0 c0311u0 = this.f3570d;
        c0311u0.setChoiceMode(1);
        AbstractC0254J.d(c0311u0, i3);
        AbstractC0254J.c(c0311u0, i4);
        C0262S c0262s = this.f3606H;
        int selectedItemPosition = c0262s.getSelectedItemPosition();
        C0311u0 c0311u02 = this.f3570d;
        if (c0245a.isShowing() && c0311u02 != null) {
            c0311u02.setListSelectionHidden(false);
            c0311u02.setSelection(selectedItemPosition);
            if (c0311u02.getChoiceMode() != 0) {
                c0311u02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0262s.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0198d viewTreeObserverOnGlobalLayoutListenerC0198d = new ViewTreeObserverOnGlobalLayoutListenerC0198d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0198d);
        this.f3568A.setOnDismissListener(new C0258N(this, viewTreeObserverOnGlobalLayoutListenerC0198d));
    }

    @Override // k.InterfaceC0261Q
    public final void h(CharSequence charSequence) {
        this.D = charSequence;
    }

    @Override // k.G0, k.InterfaceC0261Q
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f3603E = listAdapter;
    }

    @Override // k.InterfaceC0261Q
    public final void p(int i3) {
        this.f3605G = i3;
    }

    public final void s() {
        int i3;
        C0245A c0245a = this.f3568A;
        Drawable background = c0245a.getBackground();
        C0262S c0262s = this.f3606H;
        if (background != null) {
            background.getPadding(c0262s.f3623i);
            boolean a3 = r1.a(c0262s);
            Rect rect = c0262s.f3623i;
            i3 = a3 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0262s.f3623i;
            rect2.right = 0;
            rect2.left = 0;
            i3 = 0;
        }
        int paddingLeft = c0262s.getPaddingLeft();
        int paddingRight = c0262s.getPaddingRight();
        int width = c0262s.getWidth();
        int i4 = c0262s.h;
        if (i4 == -2) {
            int a4 = c0262s.a((SpinnerAdapter) this.f3603E, c0245a.getBackground());
            int i5 = c0262s.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0262s.f3623i;
            int i6 = (i5 - rect3.left) - rect3.right;
            if (a4 > i6) {
                a4 = i6;
            }
            r(Math.max(a4, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i4);
        }
        this.g = r1.a(c0262s) ? (((width - paddingRight) - this.f3572f) - this.f3605G) + i3 : paddingLeft + this.f3605G + i3;
    }
}
