package j0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import n.C0333b;
import n.C0336e;

/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public o f3442b;
    public ViewGroup c;

    /* JADX WARN: Removed duplicated region for block: B:119:0x01e2 A[EDGE_INSN: B:119:0x01e2->B:120:0x01e2 BREAK  A[LOOP:1: B:17:0x0088->B:29:0x01da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        o oVar;
        int i3;
        C0333b c0333b;
        C0333b c0333b2;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        m mVar;
        View view;
        v vVar;
        int i8;
        View view2;
        int i9 = 1;
        ViewGroup viewGroup = this.c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = s.c;
        ViewGroup viewGroup2 = this.c;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        C0333b b3 = s.b();
        Long l3 = null;
        ArrayList arrayList3 = (ArrayList) b3.getOrDefault(viewGroup2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b3.put(viewGroup2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            oVar = this.f3442b;
            arrayList3.add(oVar);
            oVar.a(new q(this, b3));
            i3 = 0;
            oVar.h(viewGroup2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).x(viewGroup2);
                }
            }
            oVar.f3430l = new ArrayList();
            oVar.f3431m = new ArrayList();
            v0.i iVar = oVar.h;
            v0.i iVar2 = oVar.f3427i;
            c0333b = new C0333b((C0333b) iVar.f5076b);
            c0333b2 = new C0333b((C0333b) iVar2.f5076b);
            i4 = 0;
            while (true) {
                iArr = oVar.f3429k;
                if (i4 < iArr.length) {
                    break;
                }
                int i10 = iArr[i4];
                if (i10 == i9) {
                    for (int i11 = c0333b.f4160d - i9; i11 >= 0; i11--) {
                        View view3 = (View) c0333b.h(i11);
                        if (view3 != null && oVar.s(view3) && (vVar = (v) c0333b2.remove(view3)) != null && oVar.s(vVar.f3453b)) {
                            oVar.f3430l.add((v) c0333b.i(i11));
                            oVar.f3431m.add(vVar);
                        }
                    }
                } else if (i10 == 2) {
                    C0333b c0333b3 = (C0333b) iVar.f5078e;
                    int i12 = c0333b3.f4160d;
                    for (int i13 = 0; i13 < i12; i13++) {
                        View view4 = (View) c0333b3.j(i13);
                        if (view4 != null && oVar.s(view4)) {
                            View view5 = (View) ((C0333b) iVar2.f5078e).getOrDefault(c0333b3.h(i13), null);
                            if (view5 != null && oVar.s(view5)) {
                                v vVar2 = (v) c0333b.getOrDefault(view4, null);
                                v vVar3 = (v) c0333b2.getOrDefault(view5, null);
                                if (vVar2 != null && vVar3 != null) {
                                    oVar.f3430l.add(vVar2);
                                    oVar.f3431m.add(vVar3);
                                    c0333b.remove(view4);
                                    c0333b2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        C0336e c0336e = (C0336e) iVar.f5077d;
                        int f3 = c0336e.f();
                        int i14 = i3;
                        while (i14 < f3) {
                            View view6 = (View) c0336e.g(i14);
                            if (view6 != null && oVar.s(view6)) {
                                if (c0336e.f4141b) {
                                    c0336e.c();
                                }
                                View view7 = (View) ((C0336e) iVar2.f5077d).d(c0336e.c[i14], l3);
                                if (view7 != null && oVar.s(view7)) {
                                    v vVar4 = (v) c0333b.getOrDefault(view6, l3);
                                    v vVar5 = (v) c0333b2.getOrDefault(view7, l3);
                                    if (vVar4 != null && vVar5 != null) {
                                        oVar.f3430l.add(vVar4);
                                        oVar.f3431m.add(vVar5);
                                        c0333b.remove(view6);
                                        c0333b2.remove(view7);
                                    }
                                }
                                i9 = 1;
                            }
                            i14 += i9;
                            l3 = null;
                        }
                    }
                    i8 = i9;
                    i4 += i8;
                    i9 = i8;
                    i3 = 0;
                    l3 = null;
                } else {
                    SparseArray sparseArray = (SparseArray) iVar.c;
                    SparseArray sparseArray2 = (SparseArray) iVar2.c;
                    int size = sparseArray.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        View view8 = (View) sparseArray.valueAt(i15);
                        if (view8 != null && oVar.s(view8) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i15))) != null && oVar.s(view2)) {
                            v vVar6 = (v) c0333b.getOrDefault(view8, null);
                            v vVar7 = (v) c0333b2.getOrDefault(view2, null);
                            if (vVar6 != null && vVar7 != null) {
                                oVar.f3430l.add(vVar6);
                                oVar.f3431m.add(vVar7);
                                c0333b.remove(view8);
                                c0333b2.remove(view2);
                            }
                        }
                    }
                }
                i8 = 1;
                i4 += i8;
                i9 = i8;
                i3 = 0;
                l3 = null;
            }
            for (i5 = 0; i5 < c0333b.f4160d; i5++) {
                v vVar8 = (v) c0333b.j(i5);
                if (oVar.s(vVar8.f3453b)) {
                    oVar.f3430l.add(vVar8);
                    oVar.f3431m.add(null);
                }
            }
            for (i6 = 0; i6 < c0333b2.f4160d; i6++) {
                v vVar9 = (v) c0333b2.j(i6);
                if (oVar.s(vVar9.f3453b)) {
                    oVar.f3431m.add(vVar9);
                    oVar.f3430l.add(null);
                }
            }
            C0333b o3 = o.o();
            int i16 = o3.f4160d;
            y yVar = w.f3454a;
            WindowId windowId = viewGroup2.getWindowId();
            for (i7 = i16 - 1; i7 >= 0; i7--) {
                Animator animator = (Animator) o3.h(i7);
                if (animator != null && (mVar = (m) o3.getOrDefault(animator, null)) != null && (view = mVar.f3416a) != null) {
                    C0224D c0224d = mVar.f3418d;
                    if ((c0224d instanceof C0224D) && c0224d.f3390a.equals(windowId)) {
                        v q3 = oVar.q(view, true);
                        v n3 = oVar.n(view, true);
                        if (q3 == null && n3 == null) {
                            n3 = (v) ((C0333b) oVar.f3427i.f5076b).getOrDefault(view, null);
                        }
                        if ((q3 != null || n3 != null) && mVar.f3419e.r(mVar.c, n3)) {
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                o3.remove(animator);
                            }
                        }
                    }
                }
            }
            oVar.l(viewGroup2, oVar.h, oVar.f3427i, oVar.f3430l, oVar.f3431m);
            oVar.y();
            return true;
        }
        arrayList = null;
        oVar = this.f3442b;
        arrayList3.add(oVar);
        oVar.a(new q(this, b3));
        i3 = 0;
        oVar.h(viewGroup2, false);
        if (arrayList != null) {
        }
        oVar.f3430l = new ArrayList();
        oVar.f3431m = new ArrayList();
        v0.i iVar3 = oVar.h;
        v0.i iVar22 = oVar.f3427i;
        c0333b = new C0333b((C0333b) iVar3.f5076b);
        c0333b2 = new C0333b((C0333b) iVar22.f5076b);
        i4 = 0;
        while (true) {
            iArr = oVar.f3429k;
            if (i4 < iArr.length) {
            }
            i4 += i8;
            i9 = i8;
            i3 = 0;
            l3 = null;
        }
        while (i5 < c0333b.f4160d) {
        }
        while (i6 < c0333b2.f4160d) {
        }
        C0333b o32 = o.o();
        int i162 = o32.f4160d;
        y yVar2 = w.f3454a;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i7 >= 0) {
        }
        oVar.l(viewGroup2, oVar.h, oVar.f3427i, oVar.f3430l, oVar.f3431m);
        oVar.y();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = s.c;
        ViewGroup viewGroup2 = this.c;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) s.b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((o) it.next()).x(viewGroup2);
            }
        }
        this.f3442b.i(true);
    }
}
