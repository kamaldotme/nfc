package d2;

import a2.C0062a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2654a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2655b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public a2.c f2656d;

    /* renamed from: e, reason: collision with root package name */
    public int f2657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f2658f;

    public b(c cVar) {
        this.f2658f = cVar;
        int i3 = cVar.f2660b;
        int length = cVar.f2659a.length();
        if (length < 0) {
            throw new IllegalArgumentException(X.d.g("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 > length) {
            i3 = length;
        }
        this.f2655b = i3;
        this.c = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [a2.a, a2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i3 = this.c;
        if (i3 < 0) {
            this.f2654a = 0;
            this.f2656d = null;
            return;
        }
        c cVar = this.f2658f;
        int i4 = cVar.c;
        if (i4 > 0) {
            int i5 = this.f2657e + 1;
            this.f2657e = i5;
        }
        if (i3 <= cVar.f2659a.length()) {
            K1.c cVar2 = (K1.c) cVar.f2661d.e(cVar.f2659a, Integer.valueOf(this.c));
            if (cVar2 == null) {
                this.f2656d = new C0062a(this.f2655b, d.Y(cVar.f2659a), 1);
                this.c = -1;
            } else {
                int intValue = ((Number) cVar2.f600b).intValue();
                int intValue2 = ((Number) cVar2.c).intValue();
                this.f2656d = u2.l.P(this.f2655b, intValue);
                int i6 = intValue + intValue2;
                this.f2655b = i6;
                this.c = i6 + (intValue2 == 0 ? 1 : 0);
            }
            this.f2654a = 1;
        }
        this.f2656d = new C0062a(this.f2655b, d.Y(cVar.f2659a), 1);
        this.c = -1;
        this.f2654a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2654a == -1) {
            a();
        }
        return this.f2654a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2654a == -1) {
            a();
        }
        if (this.f2654a == 0) {
            throw new NoSuchElementException();
        }
        a2.c cVar = this.f2656d;
        X1.g.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2656d = null;
        this.f2654a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
