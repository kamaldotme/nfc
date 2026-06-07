package L1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final e f613b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f614d;

    public d(e eVar, int i3, int i4) {
        X1.g.e(eVar, "list");
        this.f613b = eVar;
        this.c = i3;
        u2.d.d(i3, i4, eVar.a());
        this.f614d = i4 - i3;
    }

    @Override // L1.e
    public final int a() {
        return this.f614d;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        int i4 = this.f614d;
        if (i3 >= 0 && i3 < i4) {
            return this.f613b.get(this.c + i3);
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
    }
}
