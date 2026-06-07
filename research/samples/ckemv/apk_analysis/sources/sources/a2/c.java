package a2;

/* loaded from: classes.dex */
public final class c extends C0062a {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1429e = new C0062a(1, 0, 1);

    @Override // a2.C0062a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1424b == cVar.f1424b) {
                    if (this.c == cVar.c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // a2.C0062a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1424b * 31) + this.c;
    }

    @Override // a2.C0062a
    public final boolean isEmpty() {
        return this.f1424b > this.c;
    }

    @Override // a2.C0062a
    public final String toString() {
        return this.f1424b + ".." + this.c;
    }
}
