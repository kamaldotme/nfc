package j0;

import J.E;
import J.T;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n.C0333b;
import n.C0342k;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C0225a f3443a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3444b;
    public static final ArrayList c;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.a, j0.t] */
    static {
        ?? tVar = new t();
        tVar.f3449z = false;
        tVar.H(new i(2));
        tVar.H(new o());
        tVar.H(new i(1));
        f3443a = tVar;
        f3444b = new ThreadLocal();
        c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, j0.r, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, o oVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = T.f402a;
        if (E.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (oVar == null) {
                oVar = f3443a;
            }
            o clone = oVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).u(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            X.d.q(viewGroup.getTag(R.id.transition_current_scene));
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                ?? obj = new Object();
                obj.f3442b = clone;
                obj.c = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n.b, n.k, java.lang.Object] */
    public static C0333b b() {
        C0333b c0333b;
        ThreadLocal threadLocal = f3444b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0333b = (C0333b) weakReference.get()) != null) {
            return c0333b;
        }
        ?? c0342k = new C0342k();
        threadLocal.set(new WeakReference(c0342k));
        return c0342k;
    }
}
