package Z;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0036c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1237b;
    public final /* synthetic */ ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0042i f1238d;

    public /* synthetic */ RunnableC0036c(C0042i c0042i, ArrayList arrayList, int i3) {
        this.f1237b = i3;
        this.f1238d = c0042i;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f1237b) {
            case 0:
                ArrayList arrayList = this.c;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0042i c0042i = this.f1238d;
                    if (!hasNext) {
                        arrayList.clear();
                        c0042i.f1284m.remove(arrayList);
                        return;
                    }
                    C0041h c0041h = (C0041h) it2.next();
                    W w3 = c0041h.f1275a;
                    c0042i.getClass();
                    View view = w3.f1205a;
                    int i3 = c0041h.f1277d - c0041h.f1276b;
                    int i4 = c0041h.f1278e - c0041h.c;
                    if (i3 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i4 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    c0042i.f1287p.add(w3);
                    animate.setDuration(c0042i.f1151e).setListener(new C0038e(c0042i, w3, i3, view, i4, animate)).start();
                }
            case 1:
                ArrayList arrayList2 = this.c;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0042i c0042i2 = this.f1238d;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0042i2.f1285n.remove(arrayList2);
                        return;
                    }
                    C0040g c0040g = (C0040g) it3.next();
                    c0042i2.getClass();
                    W w4 = c0040g.f1270a;
                    View view2 = w4 == null ? null : w4.f1205a;
                    W w5 = c0040g.f1271b;
                    View view3 = w5 != null ? w5.f1205a : null;
                    ArrayList arrayList3 = c0042i2.f1289r;
                    long j3 = c0042i2.f1152f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j3);
                        arrayList3.add(c0040g.f1270a);
                        duration.translationX(c0040g.f1273e - c0040g.c);
                        duration.translationY(c0040g.f1274f - c0040g.f1272d);
                        it = it3;
                        duration.alpha(0.0f).setListener(new C0039f(c0042i2, c0040g, duration, view2, 0)).start();
                    } else {
                        it = it3;
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList3.add(c0040g.f1271b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j3).alpha(1.0f).setListener(new C0039f(c0042i2, c0040g, animate2, view3, 1)).start();
                    }
                    it3 = it;
                }
            default:
                ArrayList arrayList4 = this.c;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0042i c0042i3 = this.f1238d;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0042i3.f1283l.remove(arrayList4);
                        return;
                    }
                    W w6 = (W) it4.next();
                    c0042i3.getClass();
                    View view4 = w6.f1205a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c0042i3.f1286o.add(w6);
                    animate3.alpha(1.0f).setDuration(c0042i3.c).setListener(new C0037d(c0042i3, w6, view4, animate3)).start();
                }
        }
    }
}
