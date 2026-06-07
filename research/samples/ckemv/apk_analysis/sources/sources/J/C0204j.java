package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: j.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204j extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0207m f3304b;
    public int c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3305d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3306e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f3307f;
    public final int g;

    public C0204j(MenuC0207m menuC0207m, LayoutInflater layoutInflater, boolean z3, int i3) {
        this.f3306e = z3;
        this.f3307f = layoutInflater;
        this.f3304b = menuC0207m;
        this.g = i3;
        a();
    }

    public final void a() {
        MenuC0207m menuC0207m = this.f3304b;
        C0209o c0209o = menuC0207m.f3327v;
        if (c0209o != null) {
            menuC0207m.i();
            ArrayList arrayList = menuC0207m.f3315j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((C0209o) arrayList.get(i3)) == c0209o) {
                    this.c = i3;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0209o getItem(int i3) {
        ArrayList l3;
        boolean z3 = this.f3306e;
        MenuC0207m menuC0207m = this.f3304b;
        if (z3) {
            menuC0207m.i();
            l3 = menuC0207m.f3315j;
        } else {
            l3 = menuC0207m.l();
        }
        int i4 = this.c;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (C0209o) l3.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l3;
        boolean z3 = this.f3306e;
        MenuC0207m menuC0207m = this.f3304b;
        if (z3) {
            menuC0207m.i();
            l3 = menuC0207m.f3315j;
        } else {
            l3 = menuC0207m.l();
        }
        return this.c < 0 ? l3.size() : l3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f3307f.inflate(this.g, viewGroup, false);
        }
        int i4 = getItem(i3).f3336b;
        int i5 = i3 - 1;
        int i6 = i5 >= 0 ? getItem(i5).f3336b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3304b.m() && i4 != i6) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        InterfaceC0189A interfaceC0189A = (InterfaceC0189A) view;
        if (this.f3305d) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0189A.c(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
