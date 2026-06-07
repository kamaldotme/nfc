package k;

import android.view.View;
import android.view.Window;
import j.C0195a;

/* loaded from: classes.dex */
public final class m1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final C0195a f3733b;
    public final /* synthetic */ n1 c;

    public m1(n1 n1Var) {
        this.c = n1Var;
        this.f3733b = new C0195a(n1Var.f3737a.getContext(), n1Var.h);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n1 n1Var = this.c;
        Window.Callback callback = n1Var.f3744k;
        if (callback == null || !n1Var.f3745l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3733b);
    }
}
