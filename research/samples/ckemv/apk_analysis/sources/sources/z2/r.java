package z2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f5360a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f5361b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f5361b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i3 = 0; i3 < highestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        if (qVar.f5359f != null || qVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (qVar.f5357d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (f5361b - 1))];
        q qVar2 = f5360a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i3 = qVar3 != null ? qVar3.c : 0;
        if (i3 >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f5359f = qVar3;
        qVar.f5356b = 0;
        qVar.c = i3 + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (f5361b - 1))];
        q qVar = f5360a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f5359f);
        qVar2.f5359f = null;
        qVar2.c = 0;
        return qVar2;
    }
}
