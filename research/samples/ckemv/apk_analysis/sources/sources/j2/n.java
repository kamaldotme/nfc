package j2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3529e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3530f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");
    public static final d1.f g = new d1.f("REMOVE_FROZEN", 4);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f3531a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3532b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f3533d;

    public n(int i3, boolean z3) {
        this.f3531a = i3;
        this.f3532b = z3;
        int i4 = i3 - 1;
        this.c = i4;
        this.f3533d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3530f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                return (2305843009213693952L & j3) != 0 ? 2 : 1;
            }
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            int i5 = this.c;
            if (((i4 + 2) & i5) == (i3 & i5)) {
                return 1;
            }
            boolean z3 = this.f3532b;
            AtomicReferenceArray atomicReferenceArray = this.f3533d;
            if (z3 || atomicReferenceArray.get(i4 & i5) == null) {
                if (f3530f.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((i4 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i4 & i5, obj);
                    n nVar = this;
                    while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                        nVar = nVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVar.f3533d;
                        int i6 = nVar.c & i4;
                        Object obj2 = atomicReferenceArray2.get(i6);
                        if ((obj2 instanceof m) && ((m) obj2).f3528a == i4) {
                            atomicReferenceArray2.set(i6, obj);
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i7 = this.f3531a;
                if (i7 < 1024 || ((i4 - i3) & 1073741823) > (i7 >> 1)) {
                    break;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f3530f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        while (true) {
            atomicLongFieldUpdater = f3530f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                break;
            }
            long j4 = j3 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j4)) {
                j3 = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3529e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f3531a * 2, this.f3532b);
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i5 = this.c;
                int i6 = i3 & i5;
                if (i6 == (i5 & i4)) {
                    break;
                }
                Object obj = this.f3533d.get(i6);
                if (obj == null) {
                    obj = new m(i3);
                }
                nVar2.f3533d.set(nVar2.c & i3, obj);
                i3++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3530f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return g;
            }
            int i3 = (int) (j3 & 1073741823);
            int i4 = this.c;
            int i5 = i3 & i4;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i4) == i5) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3533d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z3 = this.f3532b;
            if (obj == null) {
                if (z3) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j4 = (i3 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j3, (j3 & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(i5, null);
                    return obj;
                }
                if (z3) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3530f;
                        long j5 = atomicLongFieldUpdater2.get(nVar);
                        int i6 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j5, (j5 & (-1073741824)) | j4)) {
                                nVar.f3533d.set(nVar.c & i6, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
