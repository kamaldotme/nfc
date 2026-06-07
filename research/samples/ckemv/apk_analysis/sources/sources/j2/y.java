package j2;

import e2.F;
import e2.G;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3546b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public F[] f3547a;

    public final void a(F f3) {
        f3.c((G) this);
        F[] fArr = this.f3547a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3546b;
        if (fArr == null) {
            fArr = new F[4];
            this.f3547a = fArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= fArr.length) {
            Object[] copyOf = Arrays.copyOf(fArr, atomicIntegerFieldUpdater.get(this) * 2);
            X1.g.d(copyOf, "copyOf(this, newSize)");
            fArr = (F[]) copyOf;
            this.f3547a = fArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        fArr[i3] = f3;
        f3.c = i3;
        c(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F b(int i3) {
        Object[] objArr = this.f3547a;
        X1.g.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3546b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i3 < atomicIntegerFieldUpdater.get(this)) {
            d(i3, atomicIntegerFieldUpdater.get(this));
            int i4 = (i3 - 1) / 2;
            if (i3 > 0) {
                F f3 = objArr[i3];
                X1.g.b(f3);
                Object obj = objArr[i4];
                X1.g.b(obj);
                if (f3.compareTo(obj) < 0) {
                    d(i3, i4);
                    c(i4);
                }
            }
            while (true) {
                int i5 = i3 * 2;
                int i6 = i5 + 1;
                if (i6 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f3547a;
                X1.g.b(objArr2);
                int i7 = i5 + 2;
                if (i7 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i7];
                    X1.g.b(comparable);
                    Object obj2 = objArr2[i6];
                    X1.g.b(obj2);
                }
                i7 = i6;
                Comparable comparable2 = objArr2[i3];
                X1.g.b(comparable2);
                Comparable comparable3 = objArr2[i7];
                X1.g.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i3, i7);
                i3 = i7;
            }
        }
        F f4 = objArr[atomicIntegerFieldUpdater.get(this)];
        X1.g.b(f4);
        f4.c(null);
        f4.c = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return f4;
    }

    public final void c(int i3) {
        while (i3 > 0) {
            F[] fArr = this.f3547a;
            X1.g.b(fArr);
            int i4 = (i3 - 1) / 2;
            F f3 = fArr[i4];
            X1.g.b(f3);
            F f4 = fArr[i3];
            X1.g.b(f4);
            if (f3.compareTo(f4) <= 0) {
                return;
            }
            d(i3, i4);
            i3 = i4;
        }
    }

    public final void d(int i3, int i4) {
        F[] fArr = this.f3547a;
        X1.g.b(fArr);
        F f3 = fArr[i4];
        X1.g.b(f3);
        F f4 = fArr[i3];
        X1.g.b(f4);
        fArr[i3] = f3;
        fArr[i4] = f4;
        f3.c = i3;
        f4.c = i4;
    }
}
