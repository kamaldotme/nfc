package L1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements c2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f620b;

    public /* synthetic */ r(int i3, Object obj) {
        this.f619a = i3;
        this.f620b = obj;
    }

    @Override // c2.c
    public final Iterator iterator() {
        switch (this.f619a) {
            case 0:
                return ((Iterable) this.f620b).iterator();
            default:
                return (Iterator) this.f620b;
        }
    }
}
