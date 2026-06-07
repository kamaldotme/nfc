package r0;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367b extends AbstractC0368c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4630a;

    public C0367b(int i3) {
        this.f4630a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0367b) && this.f4630a == ((C0367b) obj).f4630a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4630a);
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.f4630a + ')';
    }
}
