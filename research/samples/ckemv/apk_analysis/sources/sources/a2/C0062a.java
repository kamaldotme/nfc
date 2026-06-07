package a2;

import java.util.Iterator;
import m0.z;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0062a implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final int f1424b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1425d;

    public C0062a(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1424b = i3;
        this.c = z.I(i3, i4, i5);
        this.f1425d = i5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0062a) {
            if (!isEmpty() || !((C0062a) obj).isEmpty()) {
                C0062a c0062a = (C0062a) obj;
                if (this.f1424b != c0062a.f1424b || this.c != c0062a.c || this.f1425d != c0062a.f1425d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1424b * 31) + this.c) * 31) + this.f1425d;
    }

    public boolean isEmpty() {
        int i3 = this.f1425d;
        int i4 = this.c;
        int i5 = this.f1424b;
        if (i3 > 0) {
            if (i5 <= i4) {
                return false;
            }
        } else if (i5 >= i4) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0063b(this.f1424b, this.c, this.f1425d);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.c;
        int i4 = this.f1424b;
        int i5 = this.f1425d;
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
