package n;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333b extends C0342k implements Map {

    /* renamed from: i, reason: collision with root package name */
    public C0332a f4130i;

    public C0333b(C0333b c0333b) {
        if (c0333b != null) {
            int i3 = c0333b.f4160d;
            b(i3);
            if (this.f4160d != 0) {
                for (int i4 = 0; i4 < i3; i4++) {
                    put(c0333b.h(i4), c0333b.j(i4));
                }
            } else if (i3 > 0) {
                System.arraycopy(c0333b.f4159b, 0, this.f4159b, 0, i3);
                System.arraycopy(c0333b.c, 0, this.c, 0, i3 << 1);
                this.f4160d = i3;
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f4130i == null) {
            this.f4130i = new C0332a(0, this);
        }
        C0332a c0332a = this.f4130i;
        if (((C0339h) c0332a.f1422a) == null) {
            c0332a.f1422a = new C0339h(c0332a, 0);
        }
        return (C0339h) c0332a.f1422a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f4130i == null) {
            this.f4130i = new C0332a(0, this);
        }
        C0332a c0332a = this.f4130i;
        if (((C0339h) c0332a.f1423b) == null) {
            c0332a.f1423b = new C0339h(c0332a, 1);
        }
        return (C0339h) c0332a.f1423b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f4160d);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f4130i == null) {
            this.f4130i = new C0332a(0, this);
        }
        C0332a c0332a = this.f4130i;
        if (((C0341j) c0332a.c) == null) {
            c0332a.c = new C0341j(c0332a);
        }
        return (C0341j) c0332a.c;
    }
}
