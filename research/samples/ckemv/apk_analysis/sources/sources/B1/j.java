package b1;

import i1.C0186a;
import i1.C0187b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f2222b;

    public /* synthetic */ j(x xVar, int i3) {
        this.f2221a = i3;
        this.f2222b = xVar;
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        switch (this.f2221a) {
            case 0:
                return new AtomicLong(((Number) this.f2222b.a(c0186a)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                c0186a.a();
                while (c0186a.J()) {
                    arrayList.add(Long.valueOf(((Number) this.f2222b.a(c0186a)).longValue()));
                }
                c0186a.A();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((Long) arrayList.get(i3)).longValue());
                }
                return atomicLongArray;
            default:
                if (c0186a.W() != 9) {
                    return this.f2222b.a(c0186a);
                }
                c0186a.S();
                return null;
        }
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        switch (this.f2221a) {
            case 0:
                this.f2222b.b(c0187b, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c0187b.b();
                int length = atomicLongArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    this.f2222b.b(c0187b, Long.valueOf(atomicLongArray.get(i3)));
                }
                c0187b.A();
                return;
            default:
                if (obj == null) {
                    c0187b.J();
                    return;
                } else {
                    this.f2222b.b(c0187b, obj);
                    return;
                }
        }
    }
}
