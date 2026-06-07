package M1;

import java.util.Map;

/* loaded from: classes.dex */
public final class d implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final e f636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f637b;

    public d(e eVar, int i3) {
        X1.g.e(eVar, "map");
        this.f636a = eVar;
        this.f637b = i3;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (X1.g.a(entry.getKey(), getKey()) && X1.g.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f636a.f639b[this.f637b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f636a.c;
        X1.g.b(objArr);
        return objArr[this.f637b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        e eVar = this.f636a;
        eVar.c();
        Object[] objArr = eVar.c;
        if (objArr == null) {
            int length = eVar.f639b.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            eVar.c = objArr;
        }
        int i3 = this.f637b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
