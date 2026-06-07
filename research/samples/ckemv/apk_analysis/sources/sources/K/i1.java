package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import i.InterfaceC0185c;
import j.C0209o;
import j.InterfaceC0220z;
import j.MenuC0207m;
import j.SubMenuC0194F;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i1 implements InterfaceC0220z {

    /* renamed from: b, reason: collision with root package name */
    public MenuC0207m f3690b;
    public C0209o c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3691d;

    public i1(Toolbar toolbar) {
        this.f3691d = toolbar;
    }

    @Override // j.InterfaceC0220z
    public final void a(MenuC0207m menuC0207m, boolean z3) {
    }

    @Override // j.InterfaceC0220z
    public final void c() {
        if (this.c != null) {
            MenuC0207m menuC0207m = this.f3690b;
            if (menuC0207m != null) {
                int size = menuC0207m.f3313f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f3690b.getItem(i3) == this.c) {
                        return;
                    }
                }
            }
            d(this.c);
        }
    }

    @Override // j.InterfaceC0220z
    public final boolean d(C0209o c0209o) {
        Toolbar toolbar = this.f3691d;
        KeyEvent.Callback callback = toolbar.f1660j;
        if (callback instanceof InterfaceC0185c) {
            ((InterfaceC0185c) callback).e();
        }
        toolbar.removeView(toolbar.f1660j);
        toolbar.removeView(toolbar.f1659i);
        toolbar.f1660j = null;
        ArrayList arrayList = toolbar.f1643F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.c = null;
        toolbar.requestLayout();
        c0209o.f3334C = false;
        c0209o.f3345n.p(false);
        toolbar.u();
        return true;
    }

    @Override // j.InterfaceC0220z
    public final void e(Context context, MenuC0207m menuC0207m) {
        C0209o c0209o;
        MenuC0207m menuC0207m2 = this.f3690b;
        if (menuC0207m2 != null && (c0209o = this.c) != null) {
            menuC0207m2.d(c0209o);
        }
        this.f3690b = menuC0207m;
    }

    @Override // j.InterfaceC0220z
    public final boolean g() {
        return false;
    }

    @Override // j.InterfaceC0220z
    public final boolean j(SubMenuC0194F subMenuC0194F) {
        return false;
    }

    @Override // j.InterfaceC0220z
    public final boolean k(C0209o c0209o) {
        Toolbar toolbar = this.f3691d;
        toolbar.c();
        ViewParent parent = toolbar.f1659i.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1659i);
            }
            toolbar.addView(toolbar.f1659i);
        }
        View actionView = c0209o.getActionView();
        toolbar.f1660j = actionView;
        this.c = c0209o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1660j);
            }
            j1 h = Toolbar.h();
            h.f3722a = (toolbar.f1665o & 112) | 8388611;
            h.f3723b = 2;
            toolbar.f1660j.setLayoutParams(h);
            toolbar.addView(toolbar.f1660j);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((j1) childAt.getLayoutParams()).f3723b != 2 && childAt != toolbar.f1655b) {
                toolbar.removeViewAt(childCount);
                toolbar.f1643F.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0209o.f3334C = true;
        c0209o.f3345n.p(false);
        KeyEvent.Callback callback = toolbar.f1660j;
        if (callback instanceof InterfaceC0185c) {
            ((InterfaceC0185c) callback).a();
        }
        toolbar.u();
        return true;
    }
}
