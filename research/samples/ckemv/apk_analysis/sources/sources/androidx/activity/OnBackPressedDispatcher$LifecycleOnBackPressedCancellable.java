package androidx.activity;

import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.InterfaceC0099p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0099p, c {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.t f1435b;
    public final androidx.fragment.app.v c;

    /* renamed from: d, reason: collision with root package name */
    public s f1436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f1437e;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(u uVar, androidx.lifecycle.t tVar, androidx.fragment.app.v vVar) {
        X1.g.e(vVar, "onBackPressedCallback");
        this.f1437e = uVar;
        this.f1435b = tVar;
        this.c = vVar;
        tVar.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0099p
    public final void b(androidx.lifecycle.r rVar, EnumC0095l enumC0095l) {
        if (enumC0095l != EnumC0095l.ON_START) {
            if (enumC0095l != EnumC0095l.ON_STOP) {
                if (enumC0095l == EnumC0095l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                s sVar = this.f1436d;
                if (sVar != null) {
                    sVar.cancel();
                    return;
                }
                return;
            }
        }
        u uVar = this.f1437e;
        uVar.getClass();
        androidx.fragment.app.v vVar = this.c;
        X1.g.e(vVar, "onBackPressedCallback");
        uVar.f1498b.c(vVar);
        s sVar2 = new s(uVar, vVar);
        vVar.f2006b.add(sVar2);
        uVar.d();
        vVar.c = new t(0, uVar, u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f1436d = sVar2;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f1435b.f(this);
        androidx.fragment.app.v vVar = this.c;
        vVar.getClass();
        vVar.f2006b.remove(this);
        s sVar = this.f1436d;
        if (sVar != null) {
            sVar.cancel();
        }
        this.f1436d = null;
    }
}
