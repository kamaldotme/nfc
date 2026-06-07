package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j.C0209o;
import j.InterfaceC0190B;
import j.InterfaceC0206l;
import j.MenuC0207m;
import v0.m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0206l, InterfaceC0190B, AdapterView.OnItemClickListener {
    public static final int[] c = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    public MenuC0207m f1514b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        m F2 = m.F(context, attributeSet, c, R.attr.listViewStyle, 0);
        TypedArray typedArray = (TypedArray) F2.f5087d;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(F2.r(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(F2.r(1));
        }
        F2.J();
    }

    @Override // j.InterfaceC0190B
    public final void b(MenuC0207m menuC0207m) {
        this.f1514b = menuC0207m;
    }

    @Override // j.InterfaceC0206l
    public final boolean d(C0209o c0209o) {
        return this.f1514b.q(c0209o, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        d((C0209o) getAdapter().getItem(i3));
    }
}
