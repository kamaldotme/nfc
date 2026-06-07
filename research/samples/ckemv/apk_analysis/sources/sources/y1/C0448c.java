package y1;

import j1.C0244n;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5265a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5266b;
    public final C0244n[] c;

    public C0448c(int i3, int i4, int i5, int i6, int[] iArr) {
        this.f5265a = i3;
        this.f5266b = iArr;
        float f3 = i6;
        this.c = new C0244n[]{new C0244n(i4, f3), new C0244n(i5, f3)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0448c) && this.f5265a == ((C0448c) obj).f5265a;
    }

    public final int hashCode() {
        return this.f5265a;
    }
}
