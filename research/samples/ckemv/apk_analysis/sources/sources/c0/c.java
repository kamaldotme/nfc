package c0;

import X1.g;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f2244b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2245d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2246e;

    public c(int i3, int i4, String str, String str2) {
        this.f2244b = i3;
        this.c = i4;
        this.f2245d = str;
        this.f2246e = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        g.e(cVar, "other");
        int i3 = this.f2244b - cVar.f2244b;
        return i3 == 0 ? this.c - cVar.c : i3;
    }
}
