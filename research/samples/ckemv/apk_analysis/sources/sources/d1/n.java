package d1;

import java.util.Map;

/* loaded from: classes.dex */
public final class n implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public n f2635a;

    /* renamed from: b, reason: collision with root package name */
    public n f2636b;
    public n c;

    /* renamed from: d, reason: collision with root package name */
    public n f2637d;

    /* renamed from: e, reason: collision with root package name */
    public n f2638e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2639f;
    public final boolean g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public int f2640i;

    public n(boolean z3) {
        this.f2639f = null;
        this.g = z3;
        this.f2638e = this;
        this.f2637d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f2639f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.h;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2639f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2639f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2639f + "=" + this.h;
    }

    public n(boolean z3, n nVar, Object obj, n nVar2, n nVar3) {
        this.f2635a = nVar;
        this.f2639f = obj;
        this.g = z3;
        this.f2640i = 1;
        this.f2637d = nVar2;
        this.f2638e = nVar3;
        nVar3.f2637d = this;
        nVar2.f2638e = this;
    }
}
