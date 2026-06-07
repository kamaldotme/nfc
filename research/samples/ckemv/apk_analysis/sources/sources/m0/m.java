package m0;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a, reason: collision with root package name */
    public final g f3978a = g.f3972b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f3978a.equals(((m) obj).f3978a);
    }

    public final int hashCode() {
        return this.f3978a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f3978a + '}';
    }
}
