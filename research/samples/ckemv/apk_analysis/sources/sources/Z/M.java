package Z;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f1176a;

    /* renamed from: b, reason: collision with root package name */
    public int f1177b;

    public final L a(int i3) {
        SparseArray sparseArray = this.f1176a;
        L l3 = (L) sparseArray.get(i3);
        if (l3 != null) {
            return l3;
        }
        L l4 = new L();
        sparseArray.put(i3, l4);
        return l4;
    }
}
