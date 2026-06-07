package Z;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: Z.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0047n implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f1323f = new ThreadLocal();
    public static final O0.l g = new O0.l(1);

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1324b;
    public long c;

    /* renamed from: d, reason: collision with root package name */
    public long f1325d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1326e;

    public static W c(RecyclerView recyclerView, int i3, long j3) {
        int x2 = recyclerView.f2125f.x();
        for (int i4 = 0; i4 < x2; i4++) {
            W I2 = RecyclerView.I(recyclerView.f2125f.w(i4));
            if (I2.c == i3 && !I2.h()) {
                return null;
            }
        }
        N n3 = recyclerView.c;
        try {
            recyclerView.P();
            W i5 = n3.i(i3, j3);
            if (i5 != null) {
                if (!i5.g() || i5.h()) {
                    n3.a(i5, false);
                } else {
                    n3.f(i5.f1205a);
                }
            }
            recyclerView.Q(false);
            return i5;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f2144q && this.c == 0) {
            this.c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0.b bVar = recyclerView.f2120c0;
        bVar.f110a = i3;
        bVar.f111b = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j3) {
        C0046m c0046m;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0046m c0046m2;
        ArrayList arrayList = this.f1324b;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0.b bVar = recyclerView3.f2120c0;
                bVar.c(recyclerView3, false);
                i3 += bVar.c;
            }
        }
        ArrayList arrayList2 = this.f1326e;
        arrayList2.ensureCapacity(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i6);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0.b bVar2 = recyclerView4.f2120c0;
                int abs = Math.abs(bVar2.f111b) + Math.abs(bVar2.f110a);
                for (int i7 = 0; i7 < bVar2.c * 2; i7 += 2) {
                    if (i5 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c0046m2 = obj;
                    } else {
                        c0046m2 = (C0046m) arrayList2.get(i5);
                    }
                    int[] iArr = (int[]) bVar2.f112d;
                    int i8 = iArr[i7 + 1];
                    c0046m2.f1319a = i8 <= abs;
                    c0046m2.f1320b = abs;
                    c0046m2.c = i8;
                    c0046m2.f1321d = recyclerView4;
                    c0046m2.f1322e = iArr[i7];
                    i5++;
                }
            }
        }
        Collections.sort(arrayList2, g);
        for (int i9 = 0; i9 < arrayList2.size() && (recyclerView = (c0046m = (C0046m) arrayList2.get(i9)).f1321d) != null; i9++) {
            W c = c(recyclerView, c0046m.f1322e, c0046m.f1319a ? Long.MAX_VALUE : j3);
            if (c != null && c.f1206b != null && c.g() && !c.h() && (recyclerView2 = (RecyclerView) c.f1206b.get()) != null) {
                if (recyclerView2.f2156z && recyclerView2.f2125f.x() != 0) {
                    D d3 = recyclerView2.f2102I;
                    if (d3 != null) {
                        d3.e();
                    }
                    H h = recyclerView2.f2136m;
                    N n3 = recyclerView2.c;
                    if (h != null) {
                        h.d0(n3);
                        recyclerView2.f2136m.e0(n3);
                    }
                    n3.f1178a.clear();
                    n3.d();
                }
                C0.b bVar3 = recyclerView2.f2120c0;
                bVar3.c(recyclerView2, true);
                if (bVar3.c != 0) {
                    try {
                        int i10 = F.k.f158a;
                        F.j.a("RV Nested Prefetch");
                        T t3 = recyclerView2.f2122d0;
                        AbstractC0058z abstractC0058z = recyclerView2.f2134l;
                        t3.f1191d = 1;
                        t3.f1192e = abstractC0058z.a();
                        t3.g = false;
                        t3.h = false;
                        t3.f1194i = false;
                        for (int i11 = 0; i11 < bVar3.c * 2; i11 += 2) {
                            c(recyclerView2, ((int[]) bVar3.f112d)[i11], j3);
                        }
                        F.j.b();
                        c0046m.f1319a = false;
                        c0046m.f1320b = 0;
                        c0046m.c = 0;
                        c0046m.f1321d = null;
                        c0046m.f1322e = 0;
                    } catch (Throwable th) {
                        int i12 = F.k.f158a;
                        F.j.b();
                        throw th;
                    }
                }
            }
            c0046m.f1319a = false;
            c0046m.f1320b = 0;
            c0046m.c = 0;
            c0046m.f1321d = null;
            c0046m.f1322e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = F.k.f158a;
            F.j.a("RV Prefetch");
            ArrayList arrayList = this.f1324b;
            if (arrayList.isEmpty()) {
                this.c = 0L;
                F.j.b();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.c = 0L;
                F.j.b();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f1325d);
                this.c = 0L;
                F.j.b();
            }
        } catch (Throwable th) {
            this.c = 0L;
            int i5 = F.k.f158a;
            F.j.b();
            throw th;
        }
    }
}
