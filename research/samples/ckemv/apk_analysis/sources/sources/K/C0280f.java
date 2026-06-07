package k;

import android.content.Context;
import android.view.View;
import f.C0150G;
import j.AbstractC0215u;
import j.C0218x;
import j.MenuC0207m;
import j.SubMenuC0194F;
import xyz.happify.ckemv.R;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280f extends C0218x {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3684m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0288j f3685n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280f(C0288j c0288j, Context context, MenuC0207m menuC0207m, C0286i c0286i) {
        super(R.attr.actionOverflowMenuStyle, 0, context, c0286i, menuC0207m, true);
        this.f3685n = c0288j;
        this.g = 8388613;
        C0150G c0150g = c0288j.f3711x;
        this.f3373i = c0150g;
        AbstractC0215u abstractC0215u = this.f3374j;
        if (abstractC0215u != null) {
            abstractC0215u.h(c0150g);
        }
    }

    @Override // j.C0218x
    public final void c() {
        switch (this.f3684m) {
            case 0:
                this.f3685n.f3708u = null;
                super.c();
                return;
            default:
                C0288j c0288j = this.f3685n;
                MenuC0207m menuC0207m = c0288j.f3693d;
                if (menuC0207m != null) {
                    menuC0207m.c(true);
                }
                c0288j.f3707t = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280f(C0288j c0288j, Context context, SubMenuC0194F subMenuC0194F, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC0194F, false);
        this.f3685n = c0288j;
        if (!subMenuC0194F.f3253A.f()) {
            View view2 = c0288j.f3697j;
            this.f3372f = view2 == null ? (View) c0288j.f3696i : view2;
        }
        C0150G c0150g = c0288j.f3711x;
        this.f3373i = c0150g;
        AbstractC0215u abstractC0215u = this.f3374j;
        if (abstractC0215u != null) {
            abstractC0215u.h(c0150g);
        }
    }
}
