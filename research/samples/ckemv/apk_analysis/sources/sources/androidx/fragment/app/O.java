package androidx.fragment.app;

import J.ViewTreeObserverOnPreDrawListenerC0020t;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n.C0333b;

/* loaded from: classes.dex */
public abstract class O {
    public static void e(View view, Rect rect) {
        WeakHashMap weakHashMap = J.T.f402a;
        if (J.E.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean f(List list) {
        return list == null || list.isEmpty();
    }

    public static ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            WeakHashMap weakHashMap = J.T.f402a;
            arrayList2.add(J.H.k(view));
            J.H.v(view, null);
        }
        return arrayList2;
    }

    public static void m(ViewGroup viewGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C0333b c0333b) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            WeakHashMap weakHashMap = J.T.f402a;
            String k2 = J.H.k(view);
            arrayList4.add(k2);
            if (k2 != null) {
                J.H.v(view, null);
                String str = (String) c0333b.getOrDefault(k2, null);
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i4))) {
                        J.H.v((View) arrayList2.get(i4), k2);
                        break;
                    }
                    i4++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0020t.a(viewGroup, new N(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract Object d();

    public abstract Object g(Object obj, Object obj2);

    public abstract Object h(Object obj, Object obj2, Object obj3);

    public abstract void j(Object obj, View view, ArrayList arrayList);

    public abstract void k(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void l(View view, Object obj);

    public abstract void n(Object obj, ArrayList arrayList, ArrayList arrayList2);
}
