package m0;

import java.util.LinkedHashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public final class s extends a0.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3985d;

    public s(int i3, Class cls) {
        this.f3985d = i3;
        UUID randomUUID = UUID.randomUUID();
        X1.g.d(randomUUID, "randomUUID()");
        this.f1422a = randomUUID;
        String uuid = ((UUID) this.f1422a).toString();
        X1.g.d(uuid, "id.toString()");
        this.f1423b = new v0.o(uuid, 0, cls.getName(), (String) null, (g) null, (g) null, 0L, 0L, 0L, (d) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(L1.x.O(1));
        linkedHashSet.add(strArr[0]);
        this.c = linkedHashSet;
    }

    @Override // a0.m
    public final A c() {
        switch (this.f3985d) {
            case 0:
                return new A((UUID) this.f1422a, (v0.o) this.f1423b, (LinkedHashSet) this.c);
            default:
                v0.o oVar = (v0.o) this.f1423b;
                if (!oVar.f5104q) {
                    return new A((UUID) this.f1422a, oVar, (LinkedHashSet) this.c);
                }
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }
    }
}
