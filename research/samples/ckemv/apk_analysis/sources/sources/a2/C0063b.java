package a2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f1426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1427b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public int f1428d;

    public C0063b(int i3, int i4, int i5) {
        this.f1426a = i5;
        this.f1427b = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.c = z3;
        this.f1428d = z3 ? i3 : i4;
    }

    public final int a() {
        int i3 = this.f1428d;
        if (i3 != this.f1427b) {
            this.f1428d = this.f1426a + i3;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
