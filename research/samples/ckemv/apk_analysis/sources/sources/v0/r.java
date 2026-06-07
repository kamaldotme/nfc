package v0;

import J.InterfaceC0018q;
import J.w0;
import J.y0;
import Z.c0;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0077n;
import androidx.fragment.app.B;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j1.C0238h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xmlpull.v1.XmlPullParserException;
import t.C0383a;

/* loaded from: classes.dex */
public final class r implements InterfaceC0018q {

    /* renamed from: b, reason: collision with root package name */
    public Object f5124b = new Object();
    public Object c = new LinkedHashMap();

    public n0.m A(j jVar) {
        n0.m mVar;
        X1.g.e(jVar, "id");
        synchronized (this.f5124b) {
            mVar = (n0.m) ((LinkedHashMap) this.c).remove(jVar);
        }
        return mVar;
    }

    public float B(int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        r rVar;
        boolean z3;
        int i13;
        int i14 = 1;
        boolean z4 = Math.abs(i6 - i4) > Math.abs(i5 - i3);
        if (z4) {
            i8 = i3;
            i7 = i4;
            i10 = i5;
            i9 = i6;
        } else {
            i7 = i3;
            i8 = i4;
            i9 = i5;
            i10 = i6;
        }
        int abs = Math.abs(i9 - i7);
        int abs2 = Math.abs(i10 - i8);
        int i15 = 2;
        int i16 = (-abs) / 2;
        int i17 = i7 < i9 ? 1 : -1;
        int i18 = i8 < i10 ? 1 : -1;
        int i19 = i9 + i17;
        int i20 = i7;
        int i21 = i8;
        int i22 = 0;
        while (true) {
            if (i20 == i19) {
                i11 = i19;
                i12 = i15;
                break;
            }
            int i23 = z4 ? i21 : i20;
            int i24 = z4 ? i20 : i21;
            if (i22 == i14) {
                z3 = z4;
                i13 = i14;
                i11 = i19;
                rVar = this;
            } else {
                rVar = this;
                z3 = z4;
                i11 = i19;
                i13 = 0;
            }
            if (i13 == ((p1.b) rVar.f5124b).b(i23, i24)) {
                if (i22 == 2) {
                    return f.t(i20, i21, i7, i8);
                }
                i22++;
            }
            i16 += abs2;
            if (i16 > 0) {
                if (i21 == i10) {
                    i12 = 2;
                    break;
                }
                i21 += i18;
                i16 -= abs;
            }
            i20 += i17;
            i19 = i11;
            z4 = z3;
            i14 = 1;
            i15 = 2;
        }
        if (i22 == i12) {
            return f.t(i11, i10, i7, i8);
        }
        return Float.NaN;
    }

    public float C(int i3, int i4, int i5, int i6) {
        float f3;
        float f4;
        float B3 = B(i3, i4, i5, i6);
        int i7 = i3 - (i5 - i3);
        p1.b bVar = (p1.b) this.f5124b;
        int i8 = 0;
        if (i7 < 0) {
            f3 = i3 / (i3 - i7);
            i7 = 0;
        } else {
            int i9 = bVar.f4328b;
            if (i7 >= i9) {
                float f5 = ((i9 - 1) - i3) / (i7 - i3);
                int i10 = i9 - 1;
                f3 = f5;
                i7 = i10;
            } else {
                f3 = 1.0f;
            }
        }
        float f6 = i4;
        int i11 = (int) (f6 - ((i6 - i4) * f3));
        if (i11 < 0) {
            f4 = f6 / (i4 - i11);
        } else {
            int i12 = bVar.c;
            if (i11 >= i12) {
                f4 = ((i12 - 1) - i4) / (i11 - i4);
                i8 = i12 - 1;
            } else {
                i8 = i11;
                f4 = 1.0f;
            }
        }
        return (B(i3, i4, (int) (((i7 - i3) * f4) + i3), i8) + B3) - 1.0f;
    }

    public n0.m D(j jVar) {
        n0.m mVar;
        synchronized (this.f5124b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new n0.m(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                mVar = (n0.m) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public float a(H1.c cVar, H1.c cVar2) {
        int i3 = (int) cVar.f3505a;
        int i4 = (int) cVar.f3506b;
        int i5 = (int) cVar2.f3505a;
        int i6 = (int) cVar2.f3506b;
        float C2 = C(i3, i4, i5, i6);
        float C3 = C((int) cVar2.f3505a, i6, (int) cVar.f3505a, i4);
        return Float.isNaN(C2) ? C3 / 7.0f : Float.isNaN(C3) ? C2 / 7.0f : (C2 + C3) / 14.0f;
    }

    public boolean b(j jVar) {
        boolean containsKey;
        synchronized (this.f5124b) {
            containsKey = ((LinkedHashMap) this.c).containsKey(jVar);
        }
        return containsKey;
    }

    public void c(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void d(boolean z3) {
        B b3 = (B) this.c;
        Context context = b3.f1819n.f1996e;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = b3.f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void e(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (r8 != false) goto L35;
     */
    @Override // J.InterfaceC0018q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y0 f(View view, y0 y0Var) {
        boolean z3;
        O0.n nVar = (O0.n) this.c;
        int i3 = nVar.f775a;
        A1.h hVar = (A1.h) this.f5124b;
        hVar.getClass();
        w0 w0Var = y0Var.f470a;
        A.d f3 = w0Var.f(7);
        A.d f4 = w0Var.f(32);
        int i4 = f3.f3b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f49b;
        bottomSheetBehavior.f2328w = i4;
        boolean e3 = O0.k.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f2320o;
        if (z4) {
            int a3 = y0Var.a();
            bottomSheetBehavior.f2327v = a3;
            paddingBottom = a3 + nVar.c;
        }
        int i5 = nVar.f776b;
        boolean z5 = bottomSheetBehavior.f2321p;
        int i6 = f3.f2a;
        if (z5) {
            paddingLeft = (e3 ? i5 : i3) + i6;
        }
        boolean z6 = bottomSheetBehavior.f2322q;
        int i7 = f3.c;
        if (z6) {
            if (!e3) {
                i3 = i5;
            }
            paddingRight = i3 + i7;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f2324s || marginLayoutParams.leftMargin == i6) {
            z3 = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z3 = true;
        }
        if (!bottomSheetBehavior.f2325t || marginLayoutParams.rightMargin == i7) {
            z7 = z3;
        } else {
            marginLayoutParams.rightMargin = i7;
        }
        if (bottomSheetBehavior.f2326u) {
            int i8 = marginLayoutParams.topMargin;
            int i9 = f3.f3b;
            if (i8 != i9) {
                marginLayoutParams.topMargin = i9;
                view.setLayoutParams(marginLayoutParams);
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                boolean z8 = hVar.f48a;
                if (z8) {
                    bottomSheetBehavior.f2318m = f4.f4d;
                }
                if (z4 || z8) {
                    bottomSheetBehavior.I();
                }
                return y0Var;
            }
        }
    }

    public void g(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void i(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void j(boolean z3) {
        B b3 = (B) this.c;
        Context context = b3.f1819n.f1996e;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = b3.f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void k(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void l(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void m(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void p(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z3) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = ((B) this.c).f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            abstractComponentCallbacksC0077n.j().f1816k.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5124b).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void r(int i3) {
        int[] iArr = (int[]) this.f5124b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i3, 10) + 1];
            this.f5124b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i3 >= iArr.length) {
            int length = iArr.length;
            while (length <= i3) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f5124b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f5124b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public H1.a s(float f3, int i3, int i4, float f4) {
        p1.b bVar;
        H1.a b3;
        H1.a b4;
        int i5 = (int) (f4 * f3);
        int max = Math.max(0, i3 - i5);
        p1.b bVar2 = (p1.b) this.f5124b;
        int min = Math.min(bVar2.f4328b - 1, i3 + i5) - max;
        float f5 = 3.0f * f3;
        if (min < f5) {
            throw C0238h.f3489d;
        }
        int max2 = Math.max(0, i4 - i5);
        int min2 = Math.min(bVar2.c - 1, i4 + i5) - max2;
        if (min2 < f5) {
            throw C0238h.f3489d;
        }
        H1.b bVar3 = new H1.b((p1.b) this.f5124b, max, max2, min, min2, f3, (j1.o) this.c);
        int i6 = bVar3.f281e;
        int i7 = bVar3.c;
        int i8 = i6 + i7;
        int i9 = bVar3.f282f;
        int i10 = (i9 / 2) + bVar3.f280d;
        int[] iArr = new int[3];
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = ((i11 & 1) == 0 ? (i11 + 1) / 2 : -((i11 + 1) / 2)) + i10;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i13 = i7;
            while (true) {
                bVar = bVar3.f278a;
                if (i13 >= i8 || bVar.b(i13, i12)) {
                    break;
                }
                i13++;
            }
            int i14 = 0;
            while (i13 < i8) {
                if (!bVar.b(i13, i12)) {
                    if (i14 == 1) {
                        i14++;
                    }
                    iArr[i14] = iArr[i14] + 1;
                } else if (i14 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i14 != 2) {
                    i14++;
                    iArr[i14] = iArr[i14] + 1;
                } else {
                    if (bVar3.a(iArr) && (b4 = bVar3.b(i12, i13, iArr)) != null) {
                        return b4;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i14 = 1;
                }
                i13++;
            }
            if (bVar3.a(iArr) && (b3 = bVar3.b(i12, i8, iArr)) != null) {
                return b3;
            }
        }
        ArrayList arrayList = bVar3.f279b;
        if (arrayList.isEmpty()) {
            throw C0238h.f3489d;
        }
        return (H1.a) arrayList.get(0);
    }

    public ArrayList t(String str) {
        a0.j a3 = a0.j.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        WorkDatabase workDatabase = (WorkDatabase) this.f5124b;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
        try {
            ArrayList arrayList = new ArrayList(n3.getCount());
            while (n3.moveToNext()) {
                arrayList.add(n3.isNull(0) ? null : n3.getString(0));
            }
            return arrayList;
        } finally {
            n3.close();
            a3.o();
        }
    }

    public void u(String str, Set set) {
        X1.g.e(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            q qVar = new q((String) it.next(), str);
            WorkDatabase workDatabase = (WorkDatabase) this.f5124b;
            workDatabase.b();
            workDatabase.c();
            try {
                ((C0402b) this.c).t(qVar);
                workDatabase.p();
            } finally {
                workDatabase.k();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int v(int i3) {
        int i4;
        int[] iArr = (int[]) this.f5124b;
        if (iArr == null || i3 >= iArr.length) {
            return -1;
        }
        List list = (List) this.c;
        if (list != null) {
            c0 c0Var = null;
            if (list != null) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    c0 c0Var2 = (c0) ((List) this.c).get(size);
                    if (c0Var2.f1239b == i3) {
                        c0Var = c0Var2;
                        break;
                    }
                    size--;
                }
            }
            if (c0Var != null) {
                ((List) this.c).remove(c0Var);
            }
            int size2 = ((List) this.c).size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    i5 = -1;
                    break;
                }
                if (((c0) ((List) this.c).get(i5)).f1239b >= i3) {
                    break;
                }
                i5++;
            }
            if (i5 != -1) {
                c0 c0Var3 = (c0) ((List) this.c).get(i5);
                ((List) this.c).remove(i5);
                i4 = c0Var3.f1239b;
                if (i4 != -1) {
                    int[] iArr2 = (int[]) this.f5124b;
                    Arrays.fill(iArr2, i3, iArr2.length, -1);
                    return ((int[]) this.f5124b).length;
                }
                int i6 = i4 + 1;
                Arrays.fill((int[]) this.f5124b, i3, i6, -1);
                return i6;
            }
        }
        i4 = -1;
        if (i4 != -1) {
        }
    }

    public void w(int i3, int i4) {
        int[] iArr = (int[]) this.f5124b;
        if (iArr == null || i3 >= iArr.length) {
            return;
        }
        int i5 = i3 + i4;
        r(i5);
        int[] iArr2 = (int[]) this.f5124b;
        System.arraycopy(iArr2, i3, iArr2, i5, (iArr2.length - i3) - i4);
        Arrays.fill((int[]) this.f5124b, i3, i5, -1);
        List list = (List) this.c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) ((List) this.c).get(size);
            int i6 = c0Var.f1239b;
            if (i6 >= i3) {
                c0Var.f1239b = i6 + i4;
            }
        }
    }

    public void x(int i3, int i4) {
        int[] iArr = (int[]) this.f5124b;
        if (iArr == null || i3 >= iArr.length) {
            return;
        }
        int i5 = i3 + i4;
        r(i5);
        int[] iArr2 = (int[]) this.f5124b;
        System.arraycopy(iArr2, i5, iArr2, i3, (iArr2.length - i3) - i4);
        int[] iArr3 = (int[]) this.f5124b;
        Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
        List list = (List) this.c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) ((List) this.c).get(size);
            int i6 = c0Var.f1239b;
            if (i6 >= i3) {
                if (i6 < i5) {
                    ((List) this.c).remove(size);
                } else {
                    c0Var.f1239b = i6 - i4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cb, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        t.f fVar;
        t.k kVar = new t.k();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i3))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i3);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    fVar = null;
                } catch (IOException e3) {
                    e3.printStackTrace();
                } catch (XmlPullParserException e4) {
                    e4.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c = 6;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c = 7;
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                            }
                            c = 65535;
                            switch (c) {
                                case 0:
                                    fVar = t.k.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 1:
                                    fVar = t.k.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    fVar.f4799d.f4828a = true;
                                    break;
                                case 2:
                                    fVar = t.k.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    fVar.f4799d.f4832c0 = 1;
                                    break;
                                case 3:
                                    if (fVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    fVar.f4798b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 4:
                                    if (fVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    fVar.f4800e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (fVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    fVar.f4799d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (fVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    fVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (fVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0383a.a(context, xmlResourceParser, fVar.f4801f);
                                    break;
                            }
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name2 = xmlResourceParser.getName();
                            if ("ConstraintSet".equals(name2)) {
                                ((SparseArray) this.c).put(identifier, kVar);
                                return;
                            } else if (name2.equalsIgnoreCase("Constraint")) {
                                kVar.c.put(Integer.valueOf(fVar.f4797a), fVar);
                                fVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.c).put(identifier, kVar);
                return;
            }
        }
    }

    public List z(String str) {
        List Y2;
        X1.g.e(str, "workSpecId");
        synchronized (this.f5124b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (X1.g.a(((j) entry.getKey()).f5079a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.c).remove((j) it.next());
                }
                Y2 = L1.k.Y(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return Y2;
    }
}
