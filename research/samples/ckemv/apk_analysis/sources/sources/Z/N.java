package Z;

import J.C0000a;
import J.C0004c;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1178a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1179b;
    public final ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1180d;

    /* renamed from: e, reason: collision with root package name */
    public int f1181e;

    /* renamed from: f, reason: collision with root package name */
    public int f1182f;
    public M g;
    public final /* synthetic */ RecyclerView h;

    public N(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1178a = arrayList;
        this.f1179b = null;
        this.c = new ArrayList();
        this.f1180d = Collections.unmodifiableList(arrayList);
        this.f1181e = 2;
        this.f1182f = 2;
    }

    public final void a(W w3, boolean z3) {
        RecyclerView.j(w3);
        RecyclerView recyclerView = this.h;
        Y y3 = recyclerView.f2133k0;
        if (y3 != null) {
            X x2 = y3.f1223e;
            boolean z4 = x2 instanceof X;
            View view = w3.f1205a;
            J.T.l(view, z4 ? (C0004c) x2.f1221e.remove(view) : null);
        }
        if (z3 && recyclerView.f2122d0 != null) {
            recyclerView.g.p(w3);
        }
        w3.f1219r = null;
        M c = c();
        c.getClass();
        int i3 = w3.f1209f;
        ArrayList arrayList = c.a(i3).f1173a;
        if (((L) c.f1176a.get(i3)).f1174b <= arrayList.size()) {
            return;
        }
        w3.o();
        arrayList.add(w3);
    }

    public final int b(int i3) {
        RecyclerView recyclerView = this.h;
        if (i3 >= 0 && i3 < recyclerView.f2122d0.b()) {
            return !recyclerView.f2122d0.g ? i3 : recyclerView.f2123e.g(i3, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + recyclerView.f2122d0.b() + recyclerView.y());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Z.M, java.lang.Object] */
    public final M c() {
        if (this.g == null) {
            ?? obj = new Object();
            obj.f1176a = new SparseArray();
            obj.f1177b = 0;
            this.g = obj;
        }
        return this.g;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f2092t0;
        C0.b bVar = this.h.f2120c0;
        int[] iArr2 = (int[]) bVar.f112d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        bVar.c = 0;
    }

    public final void e(int i3) {
        ArrayList arrayList = this.c;
        a((W) arrayList.get(i3), true);
        arrayList.remove(i3);
    }

    public final void f(View view) {
        W I2 = RecyclerView.I(view);
        boolean l3 = I2.l();
        RecyclerView recyclerView = this.h;
        if (l3) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I2.k()) {
            I2.f1215n.j(I2);
        } else if (I2.r()) {
            I2.f1211j &= -33;
        }
        g(I2);
        if (recyclerView.f2102I == null || I2.i()) {
            return;
        }
        recyclerView.f2102I.d(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(W w3) {
        boolean z3;
        boolean z4;
        boolean k2 = w3.k();
        boolean z5 = true;
        RecyclerView recyclerView = this.h;
        View view = w3.f1205a;
        if (k2 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(w3.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (w3.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + w3 + recyclerView.y());
        }
        if (w3.q()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((w3.f1211j & 16) == 0) {
            WeakHashMap weakHashMap = J.T.f402a;
            if (J.B.i(view)) {
                z3 = true;
                AbstractC0058z abstractC0058z = recyclerView.f2134l;
                if (w3.i()) {
                    z5 = false;
                } else {
                    if (this.f1182f <= 0 || w3.e(526)) {
                        z4 = false;
                    } else {
                        ArrayList arrayList = this.c;
                        int size = arrayList.size();
                        if (size >= this.f1182f && size > 0) {
                            e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.f2092t0;
                        if (size > 0) {
                            C0.b bVar = recyclerView.f2120c0;
                            int i3 = w3.c;
                            if (((int[]) bVar.f112d) != null) {
                                int i4 = bVar.c * 2;
                                for (int i5 = 0; i5 < i4; i5 += 2) {
                                    if (((int[]) bVar.f112d)[i5] == i3) {
                                        break;
                                    }
                                }
                            }
                            int i6 = size - 1;
                            loop1: while (i6 >= 0) {
                                int i7 = ((W) arrayList.get(i6)).c;
                                C0.b bVar2 = recyclerView.f2120c0;
                                if (((int[]) bVar2.f112d) == null) {
                                    break;
                                }
                                int i8 = bVar2.c * 2;
                                for (int i9 = 0; i9 < i8; i9 += 2) {
                                    if (((int[]) bVar2.f112d)[i9] == i7) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i6 + 1;
                        }
                        arrayList.add(size, w3);
                        z4 = true;
                    }
                    if (z4) {
                        z5 = false;
                    } else {
                        a(w3, true);
                    }
                    r1 = z4;
                }
                recyclerView.g.p(w3);
                if (r1 && !z5 && z3) {
                    w3.f1219r = null;
                    return;
                }
                return;
            }
        }
        z3 = false;
        AbstractC0058z abstractC0058z2 = recyclerView.f2134l;
        if (w3.i()) {
        }
        recyclerView.g.p(w3);
        if (r1) {
        }
    }

    public final void h(View view) {
        D d3;
        W I2 = RecyclerView.I(view);
        boolean e3 = I2.e(12);
        RecyclerView recyclerView = this.h;
        if (!e3 && I2.m() && (d3 = recyclerView.f2102I) != null) {
            C0042i c0042i = (C0042i) d3;
            if (I2.d().isEmpty() && c0042i.g && !I2.h()) {
                if (this.f1179b == null) {
                    this.f1179b = new ArrayList();
                }
                I2.f1215n = this;
                I2.f1216o = true;
                this.f1179b.add(I2);
                return;
            }
        }
        if (I2.h() && !I2.j() && !recyclerView.f2134l.f1373b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I2.f1215n = this;
        I2.f1216o = false;
        this.f1178a.add(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0442, code lost:
    
        if ((r12 + r9) >= r26) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bd, code lost:
    
        if (r5.g == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ed, code lost:
    
        r11.b(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f5, code lost:
    
        if (r11.k() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f7, code lost:
    
        r4.removeDetachedView(r11.f1205a, false);
        r11.f1215n.j(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x020e, code lost:
    
        g(r11);
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0206, code lost:
    
        if (r11.r() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0208, code lost:
    
        r11.f1211j &= -33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d7, code lost:
    
        if (r11.f1209f != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ea, code lost:
    
        if (r11.f1208e != r8.b(r11.c)) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final W i(int i3, long j3) {
        boolean z3;
        W w3;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams;
        I i4;
        View view;
        int b3;
        int size;
        int g;
        RecyclerView recyclerView = this.h;
        if (i3 < 0 || i3 >= recyclerView.f2122d0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + recyclerView.f2122d0.b() + recyclerView.y());
        }
        T t3 = recyclerView.f2122d0;
        if (t3.g) {
            ArrayList arrayList = this.f1179b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        w3 = (W) this.f1179b.get(i5);
                        if (!w3.r() && w3.c() == i3) {
                            w3.b(32);
                            break;
                        }
                        i5++;
                    } else if (recyclerView.f2134l.f1373b && (g = recyclerView.f2123e.g(i3, 0)) > 0 && g < recyclerView.f2134l.a()) {
                        long b4 = recyclerView.f2134l.b(g);
                        for (int i6 = 0; i6 < size; i6++) {
                            W w4 = (W) this.f1179b.get(i6);
                            if (!w4.r() && w4.f1208e == b4) {
                                w4.b(32);
                                w3 = w4;
                                break;
                            }
                        }
                    }
                }
                z3 = w3 == null;
            }
            w3 = null;
            if (w3 == null) {
            }
        } else {
            z3 = false;
            w3 = null;
        }
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = this.f1178a;
        if (w3 == null) {
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                W w5 = (W) arrayList3.get(i7);
                if (!w5.r() && w5.c() == i3 && !w5.h() && (t3.g || !w5.j())) {
                    w5.b(32);
                    w3 = w5;
                    break;
                }
            }
            v0.m mVar = recyclerView.f2125f;
            ArrayList arrayList4 = (ArrayList) mVar.f5088e;
            int size3 = arrayList4.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    view = null;
                    break;
                }
                View view2 = (View) arrayList4.get(i8);
                ((C0057y) mVar.c).getClass();
                W I2 = RecyclerView.I(view2);
                if (I2.c() == i3 && !I2.h() && !I2.j()) {
                    view = view2;
                    break;
                }
                i8++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        w3 = null;
                        break;
                    }
                    w3 = (W) arrayList2.get(i9);
                    if (!w3.h() && w3.c() == i3 && !w3.f()) {
                        arrayList2.remove(i9);
                        break;
                    }
                    i9++;
                }
            } else {
                W I3 = RecyclerView.I(view);
                v0.m mVar2 = recyclerView.f2125f;
                int indexOfChild = ((C0057y) mVar2.c).f1371a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                C0035b c0035b = (C0035b) mVar2.f5087d;
                if (!c0035b.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                c0035b.a(indexOfChild);
                mVar2.L(view);
                v0.m mVar3 = recyclerView.f2125f;
                int indexOfChild2 = ((C0057y) mVar3.c).f1371a.indexOfChild(view);
                if (indexOfChild2 != -1) {
                    C0035b c0035b2 = (C0035b) mVar3.f5087d;
                    if (!c0035b2.d(indexOfChild2)) {
                        b3 = indexOfChild2 - c0035b2.b(indexOfChild2);
                        if (b3 != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I3 + recyclerView.y());
                        }
                        recyclerView.f2125f.i(b3);
                        h(view);
                        I3.b(8224);
                        w3 = I3;
                    }
                }
                b3 = -1;
                if (b3 != -1) {
                }
            }
            if (w3 != null) {
                if (!w3.j()) {
                    int i10 = w3.c;
                    if (i10 < 0 || i10 >= recyclerView.f2134l.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + w3 + recyclerView.y());
                    }
                    if (!t3.g) {
                        recyclerView.f2134l.getClass();
                    }
                    AbstractC0058z abstractC0058z = recyclerView.f2134l;
                    if (abstractC0058z.f1373b) {
                    }
                    z3 = true;
                }
            }
        }
        if (w3 == null) {
            int g3 = recyclerView.f2123e.g(i3, 0);
            if (g3 < 0 || g3 >= recyclerView.f2134l.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + g3 + ").state:" + t3.b() + recyclerView.y());
            }
            recyclerView.f2134l.getClass();
            AbstractC0058z abstractC0058z2 = recyclerView.f2134l;
            if (abstractC0058z2.f1373b) {
                long b5 = abstractC0058z2.b(g3);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        w3 = (W) arrayList3.get(size5);
                        if (w3.f1208e == b5 && !w3.r()) {
                            if (w3.f1209f == 0) {
                                w3.b(32);
                                if (w3.j() && !t3.g) {
                                    w3.f1211j = (w3.f1211j & (-15)) | 2;
                                }
                            } else {
                                arrayList3.remove(size5);
                                View view3 = w3.f1205a;
                                recyclerView.removeDetachedView(view3, false);
                                W I4 = RecyclerView.I(view3);
                                I4.f1215n = null;
                                I4.f1216o = false;
                                I4.f1211j &= -33;
                                g(I4);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            W w6 = (W) arrayList2.get(size6);
                            if (w6.f1208e != b5 || w6.f()) {
                                size6--;
                            } else if (w6.f1209f == 0) {
                                arrayList2.remove(size6);
                                w3 = w6;
                            } else {
                                e(size6);
                            }
                        }
                        w3 = null;
                    }
                }
                if (w3 != null) {
                    w3.c = g3;
                    z3 = true;
                }
            }
            if (w3 == null) {
                L l3 = (L) c().f1176a.get(0);
                if (l3 != null) {
                    ArrayList arrayList5 = l3.f1173a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((W) arrayList5.get(size7)).f()) {
                                w3 = (W) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                w3 = null;
                if (w3 != null) {
                    w3.o();
                    int[] iArr = RecyclerView.f2092t0;
                }
            }
            if (w3 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j3 != Long.MAX_VALUE) {
                    long j4 = this.g.a(0).c;
                    if (j4 != 0 && j4 + nanoTime >= j3) {
                        return null;
                    }
                }
                AbstractC0058z abstractC0058z3 = recyclerView.f2134l;
                abstractC0058z3.getClass();
                try {
                    int i11 = F.k.f158a;
                    F.j.a("RV CreateView");
                    w3 = abstractC0058z3.d(recyclerView);
                    View view4 = w3.f1205a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    w3.f1209f = 0;
                    F.j.b();
                    int[] iArr2 = RecyclerView.f2092t0;
                    RecyclerView D = RecyclerView.D(view4);
                    if (D != null) {
                        w3.f1206b = new WeakReference(D);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    L a3 = this.g.a(0);
                    long j5 = a3.c;
                    if (j5 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * 3);
                    }
                    a3.c = nanoTime2;
                } catch (Throwable th) {
                    int i12 = F.k.f158a;
                    F.j.b();
                    throw th;
                }
            }
        }
        if (z3 && !t3.g && w3.e(8192)) {
            w3.f1211j &= -8193;
            if (t3.f1195j) {
                D.b(w3);
                D d3 = recyclerView.f2102I;
                w3.d();
                d3.getClass();
                A1.i iVar = new A1.i(3);
                iVar.a(w3);
                recyclerView.V(w3, iVar);
            }
        }
        boolean z6 = t3.g;
        View view5 = w3.f1205a;
        if (z6 && w3.g()) {
            w3.g = i3;
        } else if (!w3.g() || (w3.f1211j & 2) != 0 || w3.h()) {
            int g4 = recyclerView.f2123e.g(i3, 0);
            w3.f1219r = recyclerView;
            int i13 = w3.f1209f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j3 != Long.MAX_VALUE) {
                long j6 = this.g.a(i13).f1175d;
                if (j6 != 0) {
                }
            }
            AbstractC0058z abstractC0058z4 = recyclerView.f2134l;
            abstractC0058z4.getClass();
            w3.c = g4;
            if (abstractC0058z4.f1373b) {
                w3.f1208e = abstractC0058z4.b(g4);
            }
            w3.f1211j = (w3.f1211j & (-520)) | 1;
            int i14 = F.k.f158a;
            F.j.a("RV OnBindView");
            w3.d();
            abstractC0058z4.c(w3, g4);
            ArrayList arrayList6 = w3.f1212k;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            w3.f1211j &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
            if (layoutParams2 instanceof I) {
                ((I) layoutParams2).c = true;
            }
            F.j.b();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            L a4 = this.g.a(w3.f1209f);
            long j7 = a4.f1175d;
            if (j7 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j7 / 4) * 3);
            }
            a4.f1175d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.f2155y;
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                z4 = true;
            } else {
                WeakHashMap weakHashMap = J.T.f402a;
                if (J.B.c(view5) == 0) {
                    z4 = true;
                    J.B.s(view5, 1);
                } else {
                    z4 = true;
                }
                Y y3 = recyclerView.f2133k0;
                if (y3 != null) {
                    X x2 = y3.f1223e;
                    if (x2 instanceof X) {
                        x2.getClass();
                        View.AccessibilityDelegate c = J.T.c(view5);
                        C0004c c0004c = c == null ? null : c instanceof C0000a ? ((C0000a) c).f411a : new C0004c(c);
                        if (c0004c != null && c0004c != x2) {
                            x2.f1221e.put(view5, c0004c);
                        }
                    }
                    J.T.l(view5, x2);
                }
            }
            if (t3.g) {
                w3.g = i3;
            }
            z5 = z4;
            layoutParams = view5.getLayoutParams();
            if (layoutParams != null) {
                i4 = (I) recyclerView.generateDefaultLayoutParams();
                view5.setLayoutParams(i4);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                i4 = (I) layoutParams;
            } else {
                i4 = (I) recyclerView.generateLayoutParams(layoutParams);
                view5.setLayoutParams(i4);
            }
            i4.f1170a = w3;
            i4.f1172d = (z3 || !z5) ? false : z4;
            return w3;
        }
        z5 = false;
        z4 = true;
        layoutParams = view5.getLayoutParams();
        if (layoutParams != null) {
        }
        i4.f1170a = w3;
        i4.f1172d = (z3 || !z5) ? false : z4;
        return w3;
    }

    public final void j(W w3) {
        if (w3.f1216o) {
            this.f1179b.remove(w3);
        } else {
            this.f1178a.remove(w3);
        }
        w3.f1215n = null;
        w3.f1216o = false;
        w3.f1211j &= -33;
    }

    public final void k() {
        H h = this.h.f2136m;
        this.f1182f = this.f1181e + (h != null ? h.f1164j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1182f; size--) {
            e(size);
        }
    }
}
