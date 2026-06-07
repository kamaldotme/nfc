package j0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.O;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends O {
    @Override // androidx.fragment.app.O
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((o) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.O
    public final void b(Object obj, ArrayList arrayList) {
        o oVar = (o) obj;
        if (oVar == null) {
            return;
        }
        int i3 = 0;
        if (oVar instanceof t) {
            t tVar = (t) oVar;
            int size = tVar.f3448y.size();
            while (i3 < size) {
                b((i3 < 0 || i3 >= tVar.f3448y.size()) ? null : (o) tVar.f3448y.get(i3), arrayList);
                i3++;
            }
            return;
        }
        if (O.f(oVar.f3426f) && O.f(null) && O.f(null) && O.f(oVar.g)) {
            int size2 = arrayList.size();
            while (i3 < size2) {
                oVar.b((View) arrayList.get(i3));
                i3++;
            }
        }
    }

    @Override // androidx.fragment.app.O
    public final void c(ViewGroup viewGroup, Object obj) {
        s.a(viewGroup, (o) obj);
    }

    @Override // androidx.fragment.app.O
    public final Object d() {
        return null;
    }

    @Override // androidx.fragment.app.O
    public final Object g(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        if (oVar == null || oVar2 == null) {
            if (oVar != null) {
                return oVar;
            }
            if (oVar2 != null) {
                return oVar2;
            }
            return null;
        }
        t tVar = new t();
        tVar.H(oVar);
        tVar.H(oVar2);
        tVar.f3449z = false;
        return tVar;
    }

    @Override // androidx.fragment.app.O
    public final Object h(Object obj, Object obj2, Object obj3) {
        t tVar = new t();
        if (obj != null) {
            tVar.H((o) obj);
        }
        if (obj2 != null) {
            tVar.H((o) obj2);
        }
        if (obj3 != null) {
            tVar.H((o) obj3);
        }
        return tVar;
    }

    @Override // androidx.fragment.app.O
    public final void j(Object obj, View view, ArrayList arrayList) {
        ((o) obj).a(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.O
    public final void k(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((o) obj).a(new k(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.O
    public final void l(View view, Object obj) {
        if (view != null) {
            O.e(view, new Rect());
            ((o) obj).A(new d1.e(5));
        }
    }

    @Override // androidx.fragment.app.O
    public final void n(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t tVar = (t) obj;
        if (tVar != null) {
            ArrayList arrayList3 = tVar.g;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            o(tVar, arrayList, arrayList2);
        }
    }

    public final void o(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        o oVar = (o) obj;
        int i3 = 0;
        if (oVar instanceof t) {
            t tVar = (t) oVar;
            int size = tVar.f3448y.size();
            while (i3 < size) {
                o((i3 < 0 || i3 >= tVar.f3448y.size()) ? null : (o) tVar.f3448y.get(i3), arrayList, arrayList2);
                i3++;
            }
            return;
        }
        if (O.f(oVar.f3426f) && O.f(null) && O.f(null)) {
            ArrayList arrayList3 = oVar.g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i3 < size2) {
                    oVar.b((View) arrayList2.get(i3));
                    i3++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    oVar.w((View) arrayList.get(size3));
                }
            }
        }
    }
}
