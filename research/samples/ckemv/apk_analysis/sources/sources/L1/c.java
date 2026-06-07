package L1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends b implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i3) {
        super(eVar);
        this.f612d = eVar;
        int a3 = eVar.a();
        if (i3 >= 0 && i3 <= a3) {
            this.f611b = i3;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + a3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f611b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f611b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f611b - 1;
        this.f611b = i3;
        return this.f612d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f611b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
