package q;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public i f4392b;
    public final /* synthetic */ g c;

    public f(g gVar) {
        this.c = gVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4392b.f4397b - ((i) obj).f4397b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f4392b != null) {
            for (int i3 = 0; i3 < 9; i3++) {
                str = str + this.f4392b.h[i3] + " ";
            }
        }
        return str + "] " + this.f4392b;
    }
}
