package m;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3943a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3944b;
    public c c;

    /* renamed from: d, reason: collision with root package name */
    public c f3945d;

    public c(Object obj, Object obj2) {
        this.f3943a = obj;
        this.f3944b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3943a.equals(cVar.f3943a) && this.f3944b.equals(cVar.f3944b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3943a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3944b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3943a.hashCode() ^ this.f3944b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3943a + "=" + this.f3944b;
    }
}
