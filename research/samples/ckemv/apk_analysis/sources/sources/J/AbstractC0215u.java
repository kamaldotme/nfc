package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: j.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0215u implements InterfaceC0192D, InterfaceC0220z, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Rect f3366b;

    public static int m(C0204j c0204j, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c0204j.getCount();
        int i4 = 0;
        int i5 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = c0204j.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c0204j.getView(i6, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    public static boolean u(MenuC0207m menuC0207m) {
        int size = menuC0207m.f3313f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = menuC0207m.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // j.InterfaceC0220z
    public final boolean d(C0209o c0209o) {
        return false;
    }

    @Override // j.InterfaceC0220z
    public final void e(Context context, MenuC0207m menuC0207m) {
    }

    @Override // j.InterfaceC0220z
    public final boolean k(C0209o c0209o) {
        return false;
    }

    public abstract void l(MenuC0207m menuC0207m);

    public abstract void n(View view);

    public abstract void o(boolean z3);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0204j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0204j) listAdapter).f3304b.q((MenuItem) listAdapter.getItem(i3), this, (this instanceof ViewOnKeyListenerC0201g) ^ true ? 0 : 4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z3);

    public abstract void t(int i3);
}
