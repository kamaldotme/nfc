package n;

import a0.m;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f4153a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4155d;
    public boolean c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f4154b = -1;

    public C0340i(m mVar) {
        this.f4155d = mVar;
        this.f4153a = mVar.g() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f4154b;
        m mVar = this.f4155d;
        Object e3 = mVar.e(i3, 0);
        if (key != e3 && (key == null || !key.equals(e3))) {
            return false;
        }
        Object value = entry.getValue();
        Object e4 = mVar.e(this.f4154b, 1);
        return value == e4 || (value != null && value.equals(e4));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f4155d.e(this.f4154b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f4155d.e(this.f4154b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4154b < this.f4153a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f4154b;
        m mVar = this.f4155d;
        Object e3 = mVar.e(i3, 0);
        Object e4 = mVar.e(this.f4154b, 1);
        return (e3 == null ? 0 : e3.hashCode()) ^ (e4 != null ? e4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4154b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.f4155d.k(this.f4154b);
        this.f4154b--;
        this.f4153a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.f4155d.l(this.f4154b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
