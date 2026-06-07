package f;

import J.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import v0.C0403c;

/* loaded from: classes.dex */
public final class n extends v0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2923e;

    public /* synthetic */ n(int i3, Object obj) {
        this.f2922d = i3;
        this.f2923e = obj;
    }

    @Override // J.c0
    public final void a() {
        Object obj = this.f2923e;
        switch (this.f2922d) {
            case 0:
                RunnableC0164l runnableC0164l = (RunnableC0164l) obj;
                runnableC0164l.c.f2994w.setAlpha(1.0f);
                v vVar = runnableC0164l.c;
                vVar.f2997z.d(null);
                vVar.f2997z = null;
                return;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f2994w.setAlpha(1.0f);
                vVar2.f2997z.d(null);
                vVar2.f2997z = null;
                return;
            default:
                C0403c c0403c = (C0403c) obj;
                ((v) c0403c.f5067d).f2994w.setVisibility(8);
                v vVar3 = (v) c0403c.f5067d;
                PopupWindow popupWindow = vVar3.f2995x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f2994w.getParent() instanceof View) {
                    View view = (View) vVar3.f2994w.getParent();
                    WeakHashMap weakHashMap = T.f402a;
                    J.F.c(view);
                }
                vVar3.f2994w.e();
                vVar3.f2997z.d(null);
                vVar3.f2997z = null;
                ViewGroup viewGroup = vVar3.f2950B;
                WeakHashMap weakHashMap2 = T.f402a;
                J.F.c(viewGroup);
                return;
        }
    }

    @Override // v0.f, J.c0
    public void g() {
        Object obj = this.f2923e;
        switch (this.f2922d) {
            case 0:
                ((RunnableC0164l) obj).c.f2994w.setVisibility(0);
                return;
            case 1:
                v vVar = (v) obj;
                vVar.f2994w.setVisibility(0);
                if (vVar.f2994w.getParent() instanceof View) {
                    View view = (View) vVar.f2994w.getParent();
                    WeakHashMap weakHashMap = T.f402a;
                    J.F.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
