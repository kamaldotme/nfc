package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1794a;

    /* renamed from: b, reason: collision with root package name */
    public n f1795b;

    public r(int i3) {
        this.f1794a = new SparseArray(i3);
    }

    public final void a(n nVar, int i3, int i4) {
        int a3 = nVar.a(i3);
        SparseArray sparseArray = this.f1794a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a3);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(nVar.a(i3), rVar);
        }
        if (i4 > i3) {
            rVar.a(nVar, i3 + 1, i4);
        } else {
            rVar.f1795b = nVar;
        }
    }
}
