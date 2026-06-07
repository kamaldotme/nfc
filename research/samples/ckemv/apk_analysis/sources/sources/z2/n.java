package z2;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends L1.e implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final i[] f5350b;

    public n(i[] iVarArr) {
        this.f5350b = iVarArr;
    }

    @Override // L1.e
    public final int a() {
        return this.f5350b.length;
    }

    @Override // L1.e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return this.f5350b[i3];
    }

    @Override // L1.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // L1.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
