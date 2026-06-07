package Z;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public C0057y f1148a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1149b;
    public long c;

    /* renamed from: d, reason: collision with root package name */
    public long f1150d;

    /* renamed from: e, reason: collision with root package name */
    public long f1151e;

    /* renamed from: f, reason: collision with root package name */
    public long f1152f;

    public static void b(W w3) {
        RecyclerView recyclerView;
        int i3 = w3.f1211j;
        if (w3.h() || (i3 & 4) != 0 || (recyclerView = w3.f1219r) == null) {
            return;
        }
        recyclerView.F(w3);
    }

    public abstract boolean a(W w3, W w4, A1.i iVar, A1.i iVar2);

    public final void c(W w3) {
        C0057y c0057y = this.f1148a;
        if (c0057y != null) {
            boolean z3 = true;
            w3.p(true);
            if (w3.h != null && w3.f1210i == null) {
                w3.h = null;
            }
            w3.f1210i = null;
            if ((w3.f1211j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0057y.f1371a;
            recyclerView.c0();
            v0.m mVar = recyclerView.f2125f;
            C0057y c0057y2 = (C0057y) mVar.c;
            RecyclerView recyclerView2 = c0057y2.f1371a;
            View view = w3.f1205a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                mVar.L(view);
            } else {
                C0035b c0035b = (C0035b) mVar.f5087d;
                if (c0035b.d(indexOfChild)) {
                    c0035b.g(indexOfChild);
                    mVar.L(view);
                    c0057y2.h(indexOfChild);
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                W I2 = RecyclerView.I(view);
                N n3 = recyclerView.c;
                n3.j(I2);
                n3.g(I2);
            }
            recyclerView.d0(!z3);
            if (z3 || !w3.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(W w3);

    public abstract void e();

    public abstract boolean f();
}
