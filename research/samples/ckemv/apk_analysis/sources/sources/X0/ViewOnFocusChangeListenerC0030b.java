package X0;

import android.view.View;

/* renamed from: X0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0030b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1025b;

    public /* synthetic */ ViewOnFocusChangeListenerC0030b(q qVar, int i3) {
        this.f1024a = i3;
        this.f1025b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f1024a) {
            case 0:
                C0033e c0033e = (C0033e) this.f1025b;
                c0033e.t(c0033e.u());
                return;
            default:
                k kVar = (k) this.f1025b;
                kVar.f1048l = z3;
                kVar.q();
                if (z3) {
                    return;
                }
                kVar.t(false);
                kVar.f1049m = false;
                return;
        }
    }
}
