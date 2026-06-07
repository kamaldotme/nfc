package k;

import android.view.View;
import j.InterfaceC0192D;

/* renamed from: k.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252H extends AbstractViewOnTouchListenerC0317x0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0259O f3591k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0262S f3592l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252H(C0262S c0262s, View view, C0259O c0259o) {
        super(view);
        this.f3592l = c0262s;
        this.f3591k = c0259o;
    }

    @Override // k.AbstractViewOnTouchListenerC0317x0
    public final InterfaceC0192D b() {
        return this.f3591k;
    }

    @Override // k.AbstractViewOnTouchListenerC0317x0
    public final boolean c() {
        C0262S c0262s = this.f3592l;
        if (c0262s.getInternalPopup().b()) {
            return true;
        }
        c0262s.g.g(AbstractC0254J.b(c0262s), AbstractC0254J.a(c0262s));
        return true;
    }
}
