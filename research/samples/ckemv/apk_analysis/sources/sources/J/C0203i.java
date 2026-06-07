package j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import f.C0154b;
import f.DialogC0158f;

/* renamed from: j.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203i implements InterfaceC0220z, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f3300b;
    public LayoutInflater c;

    /* renamed from: d, reason: collision with root package name */
    public MenuC0207m f3301d;

    /* renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f3302e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0219y f3303f;
    public C0202h g;

    public C0203i(Context context) {
        this.f3300b = context;
        this.c = LayoutInflater.from(context);
    }

    @Override // j.InterfaceC0220z
    public final void a(MenuC0207m menuC0207m, boolean z3) {
        InterfaceC0219y interfaceC0219y = this.f3303f;
        if (interfaceC0219y != null) {
            interfaceC0219y.a(menuC0207m, z3);
        }
    }

    @Override // j.InterfaceC0220z
    public final void c() {
        C0202h c0202h = this.g;
        if (c0202h != null) {
            c0202h.notifyDataSetChanged();
        }
    }

    @Override // j.InterfaceC0220z
    public final boolean d(C0209o c0209o) {
        return false;
    }

    @Override // j.InterfaceC0220z
    public final void e(Context context, MenuC0207m menuC0207m) {
        if (this.f3300b != null) {
            this.f3300b = context;
            if (this.c == null) {
                this.c = LayoutInflater.from(context);
            }
        }
        this.f3301d = menuC0207m;
        C0202h c0202h = this.g;
        if (c0202h != null) {
            c0202h.notifyDataSetChanged();
        }
    }

    @Override // j.InterfaceC0220z
    public final boolean g() {
        return false;
    }

    @Override // j.InterfaceC0220z
    public final void h(InterfaceC0219y interfaceC0219y) {
        this.f3303f = interfaceC0219y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, j.y, android.content.DialogInterface$OnKeyListener, java.lang.Object, j.n, android.content.DialogInterface$OnDismissListener] */
    @Override // j.InterfaceC0220z
    public final boolean j(SubMenuC0194F subMenuC0194F) {
        if (!subMenuC0194F.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.f3330b = subMenuC0194F;
        Context context = subMenuC0194F.f3309a;
        F0.e eVar = new F0.e(context);
        C0154b c0154b = (C0154b) eVar.c;
        C0203i c0203i = new C0203i(c0154b.f2875a);
        obj.f3331d = c0203i;
        c0203i.f3303f = obj;
        subMenuC0194F.b(c0203i, context);
        C0203i c0203i2 = obj.f3331d;
        if (c0203i2.g == null) {
            c0203i2.g = new C0202h(c0203i2);
        }
        c0154b.g = c0203i2.g;
        c0154b.h = obj;
        View view = subMenuC0194F.f3320o;
        if (view != null) {
            c0154b.f2878e = view;
        } else {
            c0154b.c = subMenuC0194F.f3319n;
            c0154b.f2877d = subMenuC0194F.f3318m;
        }
        c0154b.f2879f = obj;
        DialogC0158f a3 = eVar.a();
        obj.c = a3;
        a3.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.c.show();
        InterfaceC0219y interfaceC0219y = this.f3303f;
        if (interfaceC0219y == null) {
            return true;
        }
        interfaceC0219y.b(subMenuC0194F);
        return true;
    }

    @Override // j.InterfaceC0220z
    public final boolean k(C0209o c0209o) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        this.f3301d.q(this.g.getItem(i3), this, 0);
    }
}
