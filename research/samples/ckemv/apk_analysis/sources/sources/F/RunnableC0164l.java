package f;

import J.C0003b0;
import J.T;
import java.util.WeakHashMap;

/* renamed from: f.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0164l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2920b;
    public final /* synthetic */ v c;

    public /* synthetic */ RunnableC0164l(v vVar, int i3) {
        this.f2920b = i3;
        this.c = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (J.E.c(r3) != false) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z3 = true;
        v vVar = this.c;
        int i3 = 0;
        switch (this.f2920b) {
            case 0:
                if ((1 & vVar.f2974a0) != 0) {
                    vVar.u(0);
                }
                if ((vVar.f2974a0 & 4096) != 0) {
                    vVar.u(108);
                }
                vVar.f2973Z = false;
                vVar.f2974a0 = 0;
                return;
            default:
                vVar.f2995x.showAtLocation(vVar.f2994w, 55, 0, 0);
                C0003b0 c0003b0 = vVar.f2997z;
                if (c0003b0 != null) {
                    c0003b0.b();
                }
                if (vVar.f2949A && (r3 = vVar.f2950B) != null) {
                    WeakHashMap weakHashMap = T.f402a;
                    break;
                }
                z3 = false;
                if (!z3) {
                    vVar.f2994w.setAlpha(1.0f);
                    vVar.f2994w.setVisibility(0);
                    return;
                }
                vVar.f2994w.setAlpha(0.0f);
                C0003b0 a3 = T.a(vVar.f2994w);
                a3.a(1.0f);
                vVar.f2997z = a3;
                a3.d(new n(i3, this));
                return;
        }
    }
}
