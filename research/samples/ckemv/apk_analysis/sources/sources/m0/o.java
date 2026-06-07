package m0;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final g f3979a;

    public o(g gVar) {
        this.f3979a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return this.f3979a.equals(((o) obj).f3979a);
    }

    public final int hashCode() {
        return this.f3979a.hashCode() + (o.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f3979a + '}';
    }
}
