package I1;

/* loaded from: classes.dex */
public final class y implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f387b;
    public final int c;

    public y(int i3, int i4) {
        this.f387b = i3;
        this.c = i4;
    }

    public final y a(y yVar) {
        int i3 = yVar.c;
        int i4 = this.f387b;
        int i5 = i4 * i3;
        int i6 = yVar.f387b;
        int i7 = this.c;
        return i5 <= i6 * i7 ? new y(i6, (i7 * i6) / i4) : new y((i4 * i3) / i7, i3);
    }

    public final y b(y yVar) {
        int i3 = yVar.c;
        int i4 = this.f387b;
        int i5 = i4 * i3;
        int i6 = yVar.f387b;
        int i7 = this.c;
        return i5 >= i6 * i7 ? new y(i6, (i7 * i6) / i4) : new y((i4 * i3) / i7, i3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        int i3 = this.c * this.f387b;
        int i4 = yVar.c * yVar.f387b;
        if (i4 < i3) {
            return 1;
        }
        return i4 > i3 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f387b == yVar.f387b && this.c == yVar.c;
    }

    public final int hashCode() {
        return (this.f387b * 31) + this.c;
    }

    public final String toString() {
        return this.f387b + "x" + this.c;
    }
}
