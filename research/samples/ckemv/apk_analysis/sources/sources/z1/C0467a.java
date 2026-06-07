package z1;

import java.util.Objects;
import y1.C0447b;
import y1.C0448c;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467a {

    /* renamed from: a, reason: collision with root package name */
    public final C0447b f5314a;

    /* renamed from: b, reason: collision with root package name */
    public final C0447b f5315b;
    public final C0448c c;

    public C0467a(C0447b c0447b, C0447b c0447b2, C0448c c0448c) {
        this.f5314a = c0447b;
        this.f5315b = c0447b2;
        this.c = c0448c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0467a)) {
            return false;
        }
        C0467a c0467a = (C0467a) obj;
        return Objects.equals(this.f5314a, c0467a.f5314a) && Objects.equals(this.f5315b, c0467a.f5315b) && Objects.equals(this.c, c0467a.c);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f5314a) ^ Objects.hashCode(this.f5315b)) ^ Objects.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f5314a);
        sb.append(" , ");
        sb.append(this.f5315b);
        sb.append(" : ");
        C0448c c0448c = this.c;
        sb.append(c0448c == null ? "null" : Integer.valueOf(c0448c.f5265a));
        sb.append(" ]");
        return sb.toString();
    }
}
