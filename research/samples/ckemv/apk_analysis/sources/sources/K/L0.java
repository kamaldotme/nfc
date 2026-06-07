package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import j.C0204j;
import j.C0209o;
import j.MenuC0207m;

/* loaded from: classes.dex */
public final class L0 extends C0311u0 {

    /* renamed from: n, reason: collision with root package name */
    public final int f3596n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3597o;

    /* renamed from: p, reason: collision with root package name */
    public H0 f3598p;

    /* renamed from: q, reason: collision with root package name */
    public C0209o f3599q;

    public L0(Context context, boolean z3) {
        super(context, z3);
        if (1 == K0.a(context.getResources().getConfiguration())) {
            this.f3596n = 21;
            this.f3597o = 22;
        } else {
            this.f3596n = 22;
            this.f3597o = 21;
        }
    }

    @Override // k.C0311u0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0204j c0204j;
        int i3;
        int pointToPosition;
        int i4;
        if (this.f3598p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                c0204j = (C0204j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0204j = (C0204j) adapter;
                i3 = 0;
            }
            C0209o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i3) < 0 || i4 >= c0204j.getCount()) ? null : c0204j.getItem(i4);
            C0209o c0209o = this.f3599q;
            if (c0209o != item) {
                MenuC0207m menuC0207m = c0204j.f3304b;
                if (c0209o != null) {
                    this.f3598p.j(menuC0207m, c0209o);
                }
                this.f3599q = item;
                if (item != null) {
                    this.f3598p.d(menuC0207m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f3596n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.f3597o) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0204j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0204j) adapter).f3304b.c(false);
        return true;
    }

    public void setHoverListener(H0 h02) {
        this.f3598p = h02;
    }

    @Override // k.C0311u0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
