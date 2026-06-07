package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import xyz.happify.ckemv.R;

/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202h extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public int f3299b = -1;
    public final /* synthetic */ C0203i c;

    public C0202h(C0203i c0203i) {
        this.c = c0203i;
        a();
    }

    public final void a() {
        MenuC0207m menuC0207m = this.c.f3301d;
        C0209o c0209o = menuC0207m.f3327v;
        if (c0209o != null) {
            menuC0207m.i();
            ArrayList arrayList = menuC0207m.f3315j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((C0209o) arrayList.get(i3)) == c0209o) {
                    this.f3299b = i3;
                    return;
                }
            }
        }
        this.f3299b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0209o getItem(int i3) {
        C0203i c0203i = this.c;
        MenuC0207m menuC0207m = c0203i.f3301d;
        menuC0207m.i();
        ArrayList arrayList = menuC0207m.f3315j;
        c0203i.getClass();
        int i4 = this.f3299b;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (C0209o) arrayList.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0203i c0203i = this.c;
        MenuC0207m menuC0207m = c0203i.f3301d;
        menuC0207m.i();
        int size = menuC0207m.f3315j.size();
        c0203i.getClass();
        return this.f3299b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.c.c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0189A) view).c(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
