package j;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.AbstractViewOnTouchListenerC0317x0;
import k.C0280f;
import k.C0282g;
import k.C0286i;
import k.C0288j;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196b extends AbstractViewOnTouchListenerC0317x0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3268k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f3269l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3269l = actionMenuItemView;
    }

    @Override // k.AbstractViewOnTouchListenerC0317x0
    public final InterfaceC0192D b() {
        C0280f c0280f;
        switch (this.f3268k) {
            case 0:
                AbstractC0197c abstractC0197c = ((ActionMenuItemView) this.f3269l).f1508n;
                if (abstractC0197c == null || (c0280f = ((C0282g) abstractC0197c).f3686a.f3708u) == null) {
                    return null;
                }
                return c0280f.a();
            default:
                C0280f c0280f2 = ((C0286i) this.f3269l).f3689e.f3707t;
                if (c0280f2 == null) {
                    return null;
                }
                return c0280f2.a();
        }
    }

    @Override // k.AbstractViewOnTouchListenerC0317x0
    public final boolean c() {
        InterfaceC0192D b3;
        switch (this.f3268k) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3269l;
                InterfaceC0206l interfaceC0206l = actionMenuItemView.f1506l;
                return interfaceC0206l != null && interfaceC0206l.d(actionMenuItemView.f1503i) && (b3 = b()) != null && b3.b();
            default:
                ((C0286i) this.f3269l).f3689e.l();
                return true;
        }
    }

    @Override // k.AbstractViewOnTouchListenerC0317x0
    public boolean d() {
        switch (this.f3268k) {
            case 1:
                C0288j c0288j = ((C0286i) this.f3269l).f3689e;
                if (c0288j.f3709v != null) {
                    return false;
                }
                c0288j.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196b(C0286i c0286i, View view) {
        super(view);
        this.f3269l = c0286i;
    }
}
