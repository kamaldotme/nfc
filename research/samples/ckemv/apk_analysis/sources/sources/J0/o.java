package j0;

import J.H;
import J.T;
import J.Z;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import n.AbstractC0335d;
import n.C0333b;
import n.C0336e;
import n.C0342k;

/* loaded from: classes.dex */
public abstract class o implements Cloneable {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f3420v = {2, 1, 3, 4};

    /* renamed from: w, reason: collision with root package name */
    public static final d1.e f3421w = new d1.e(6);

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f3422x = new ThreadLocal();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3430l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3431m;

    /* renamed from: t, reason: collision with root package name */
    public d1.e f3438t;

    /* renamed from: b, reason: collision with root package name */
    public final String f3423b = getClass().getName();
    public long c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f3424d = -1;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f3425e = null;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3426f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public v0.i h = new v0.i(3);

    /* renamed from: i, reason: collision with root package name */
    public v0.i f3427i = new v0.i(3);

    /* renamed from: j, reason: collision with root package name */
    public t f3428j = null;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f3429k = f3420v;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3432n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public int f3433o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3434p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3435q = false;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f3436r = null;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f3437s = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public d1.e f3439u = f3421w;

    public static void c(v0.i iVar, View view, v vVar) {
        ((C0333b) iVar.f5076b).put(view, vVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) iVar.c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = T.f402a;
        String k2 = H.k(view);
        if (k2 != null) {
            C0333b c0333b = (C0333b) iVar.f5078e;
            if (c0333b.containsKey(k2)) {
                c0333b.put(k2, null);
            } else {
                c0333b.put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0336e c0336e = (C0336e) iVar.f5077d;
                if (c0336e.f4141b) {
                    c0336e.c();
                }
                if (AbstractC0335d.b(c0336e.c, c0336e.f4143e, itemIdAtPosition) < 0) {
                    J.B.r(view, true);
                    c0336e.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0336e.d(itemIdAtPosition, null);
                if (view2 != null) {
                    J.B.r(view2, false);
                    c0336e.e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n.b, n.k, java.lang.Object] */
    public static C0333b o() {
        ThreadLocal threadLocal = f3422x;
        C0333b c0333b = (C0333b) threadLocal.get();
        if (c0333b != null) {
            return c0333b;
        }
        ?? c0342k = new C0342k();
        threadLocal.set(c0342k);
        return c0342k;
    }

    public static boolean t(v vVar, v vVar2, String str) {
        Object obj = vVar.f3452a.get(str);
        Object obj2 = vVar2.f3452a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(d1.e eVar) {
        this.f3438t = eVar;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.f3425e = timeInterpolator;
    }

    public void C(d1.e eVar) {
        if (eVar == null) {
            this.f3439u = f3421w;
        } else {
            this.f3439u = eVar;
        }
    }

    public void D() {
    }

    public void E(long j3) {
        this.c = j3;
    }

    public final void F() {
        if (this.f3433o == 0) {
            ArrayList arrayList = this.f3436r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3436r.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((n) arrayList2.get(i3)).c();
                }
            }
            this.f3435q = false;
        }
        this.f3433o++;
    }

    public String G(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f3424d != -1) {
            str2 = str2 + "dur(" + this.f3424d + ") ";
        }
        if (this.c != -1) {
            str2 = str2 + "dly(" + this.c + ") ";
        }
        if (this.f3425e != null) {
            str2 = str2 + "interp(" + this.f3425e + ") ";
        }
        ArrayList arrayList = this.f3426f;
        int size = arrayList.size();
        ArrayList arrayList2 = this.g;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String h = X.d.h(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 > 0) {
                    h = X.d.h(h, ", ");
                }
                h = h + arrayList.get(i3);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (i4 > 0) {
                    h = X.d.h(h, ", ");
                }
                h = h + arrayList2.get(i4);
            }
        }
        return X.d.h(h, ")");
    }

    public void a(n nVar) {
        if (this.f3436r == null) {
            this.f3436r = new ArrayList();
        }
        this.f3436r.add(nVar);
    }

    public void b(View view) {
        this.g.add(view);
    }

    public abstract void d(v vVar);

    public final void e(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            v vVar = new v(view);
            if (z3) {
                g(vVar);
            } else {
                d(vVar);
            }
            vVar.c.add(this);
            f(vVar);
            if (z3) {
                c(this.h, view, vVar);
            } else {
                c(this.f3427i, view, vVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                e(viewGroup.getChildAt(i3), z3);
            }
        }
    }

    public void f(v vVar) {
    }

    public abstract void g(v vVar);

    public final void h(ViewGroup viewGroup, boolean z3) {
        i(z3);
        ArrayList arrayList = this.f3426f;
        int size = arrayList.size();
        ArrayList arrayList2 = this.g;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z3);
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i3)).intValue());
            if (findViewById != null) {
                v vVar = new v(findViewById);
                if (z3) {
                    g(vVar);
                } else {
                    d(vVar);
                }
                vVar.c.add(this);
                f(vVar);
                if (z3) {
                    c(this.h, findViewById, vVar);
                } else {
                    c(this.f3427i, findViewById, vVar);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            v vVar2 = new v(view);
            if (z3) {
                g(vVar2);
            } else {
                d(vVar2);
            }
            vVar2.c.add(this);
            f(vVar2);
            if (z3) {
                c(this.h, view, vVar2);
            } else {
                c(this.f3427i, view, vVar2);
            }
        }
    }

    public final void i(boolean z3) {
        if (z3) {
            ((C0333b) this.h.f5076b).clear();
            ((SparseArray) this.h.c).clear();
            ((C0336e) this.h.f5077d).a();
        } else {
            ((C0333b) this.f3427i.f5076b).clear();
            ((SparseArray) this.f3427i.c).clear();
            ((C0336e) this.f3427i.f5077d).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f3437s = new ArrayList();
            oVar.h = new v0.i(3);
            oVar.f3427i = new v0.i(3);
            oVar.f3430l = null;
            oVar.f3431m = null;
            return oVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [j0.m, java.lang.Object] */
    public void l(ViewGroup viewGroup, v0.i iVar, v0.i iVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator k2;
        int i3;
        View view;
        v vVar;
        Animator animator;
        C0333b o3 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            v vVar2 = (v) arrayList.get(i4);
            v vVar3 = (v) arrayList2.get(i4);
            v vVar4 = null;
            if (vVar2 != null && !vVar2.c.contains(this)) {
                vVar2 = null;
            }
            if (vVar3 != null && !vVar3.c.contains(this)) {
                vVar3 = null;
            }
            if (!(vVar2 == null && vVar3 == null) && ((vVar2 == null || vVar3 == null || r(vVar2, vVar3)) && (k2 = k(viewGroup, vVar2, vVar3)) != null)) {
                String str = this.f3423b;
                if (vVar3 != null) {
                    String[] p3 = p();
                    view = vVar3.f3453b;
                    if (p3 != null && p3.length > 0) {
                        vVar = new v(view);
                        v vVar5 = (v) ((C0333b) iVar2.f5076b).getOrDefault(view, null);
                        i3 = size;
                        if (vVar5 != null) {
                            int i5 = 0;
                            while (i5 < p3.length) {
                                HashMap hashMap = vVar.f3452a;
                                String str2 = p3[i5];
                                hashMap.put(str2, vVar5.f3452a.get(str2));
                                i5++;
                                p3 = p3;
                            }
                        }
                        int i6 = o3.f4160d;
                        for (int i7 = 0; i7 < i6; i7++) {
                            animator = null;
                            m mVar = (m) o3.getOrDefault((Animator) o3.h(i7), null);
                            if (mVar.c != null && mVar.f3416a == view && mVar.f3417b.equals(str) && mVar.c.equals(vVar)) {
                                break;
                            }
                        }
                    } else {
                        i3 = size;
                        vVar = null;
                    }
                    animator = k2;
                    k2 = animator;
                    vVar4 = vVar;
                } else {
                    i3 = size;
                    view = vVar2.f3453b;
                }
                if (k2 != null) {
                    y yVar = w.f3454a;
                    C0224D c0224d = new C0224D(viewGroup);
                    ?? obj = new Object();
                    obj.f3416a = view;
                    obj.f3417b = str;
                    obj.c = vVar4;
                    obj.f3418d = c0224d;
                    obj.f3419e = this;
                    o3.put(k2, obj);
                    this.f3437s.add(k2);
                }
            } else {
                i3 = size;
            }
            i4++;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator2 = (Animator) this.f3437s.get(sparseIntArray.keyAt(i8));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i8) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i3 = this.f3433o - 1;
        this.f3433o = i3;
        if (i3 == 0) {
            ArrayList arrayList = this.f3436r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3436r.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((n) arrayList2.get(i4)).d(this);
                }
            }
            for (int i5 = 0; i5 < ((C0336e) this.h.f5077d).f(); i5++) {
                View view = (View) ((C0336e) this.h.f5077d).g(i5);
                if (view != null) {
                    WeakHashMap weakHashMap = T.f402a;
                    J.B.r(view, false);
                }
            }
            for (int i6 = 0; i6 < ((C0336e) this.f3427i.f5077d).f(); i6++) {
                View view2 = (View) ((C0336e) this.f3427i.f5077d).g(i6);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = T.f402a;
                    J.B.r(view2, false);
                }
            }
            this.f3435q = true;
        }
    }

    public final v n(View view, boolean z3) {
        t tVar = this.f3428j;
        if (tVar != null) {
            return tVar.n(view, z3);
        }
        ArrayList arrayList = z3 ? this.f3430l : this.f3431m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            }
            v vVar = (v) arrayList.get(i3);
            if (vVar == null) {
                return null;
            }
            if (vVar.f3453b == view) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return (v) (z3 ? this.f3431m : this.f3430l).get(i3);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final v q(View view, boolean z3) {
        t tVar = this.f3428j;
        if (tVar != null) {
            return tVar.q(view, z3);
        }
        return (v) ((C0333b) (z3 ? this.h : this.f3427i).f5076b).getOrDefault(view, null);
    }

    public boolean r(v vVar, v vVar2) {
        if (vVar == null || vVar2 == null) {
            return false;
        }
        String[] p3 = p();
        if (p3 == null) {
            Iterator it = vVar.f3452a.keySet().iterator();
            while (it.hasNext()) {
                if (t(vVar, vVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : p3) {
            if (!t(vVar, vVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3426f;
        int size = arrayList.size();
        ArrayList arrayList2 = this.g;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return G("");
    }

    public void u(View view) {
        if (this.f3435q) {
            return;
        }
        C0333b o3 = o();
        int i3 = o3.f4160d;
        y yVar = w.f3454a;
        WindowId windowId = view.getWindowId();
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            m mVar = (m) o3.j(i4);
            if (mVar.f3416a != null) {
                C0224D c0224d = mVar.f3418d;
                if ((c0224d instanceof C0224D) && c0224d.f3390a.equals(windowId)) {
                    ((Animator) o3.h(i4)).pause();
                }
            }
        }
        ArrayList arrayList = this.f3436r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f3436r.clone();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((n) arrayList2.get(i5)).b();
            }
        }
        this.f3434p = true;
    }

    public void v(n nVar) {
        ArrayList arrayList = this.f3436r;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(nVar);
        if (this.f3436r.size() == 0) {
            this.f3436r = null;
        }
    }

    public void w(View view) {
        this.g.remove(view);
    }

    public void x(ViewGroup viewGroup) {
        if (this.f3434p) {
            if (!this.f3435q) {
                C0333b o3 = o();
                int i3 = o3.f4160d;
                y yVar = w.f3454a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    m mVar = (m) o3.j(i4);
                    if (mVar.f3416a != null) {
                        C0224D c0224d = mVar.f3418d;
                        if ((c0224d instanceof C0224D) && c0224d.f3390a.equals(windowId)) {
                            ((Animator) o3.h(i4)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.f3436r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3436r.clone();
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((n) arrayList2.get(i5)).e();
                    }
                }
            }
            this.f3434p = false;
        }
    }

    public void y() {
        F();
        C0333b o3 = o();
        Iterator it = this.f3437s.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o3.containsKey(animator)) {
                F();
                if (animator != null) {
                    animator.addListener(new Z(this, o3));
                    long j3 = this.f3424d;
                    if (j3 >= 0) {
                        animator.setDuration(j3);
                    }
                    long j4 = this.c;
                    if (j4 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j4);
                    }
                    TimeInterpolator timeInterpolator = this.f3425e;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new D0.a(2, this));
                    animator.start();
                }
            }
        }
        this.f3437s.clear();
        m();
    }

    public void z(long j3) {
        this.f3424d = j3;
    }
}
