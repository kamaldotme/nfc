package C1;

import v0.C0403c;

/* loaded from: classes.dex */
public final class f extends C0403c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f132e;

    public f(c cVar, boolean z3) {
        super(cVar);
        this.f132e = z3;
    }

    public final a r() {
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        a[] aVarArr = (a[]) this.f5067d;
        for (a aVar : aVarArr) {
            if (aVar != null) {
                aVar.c();
                int i3 = aVar.f116e % 30;
                int i4 = aVar.f117f;
                if (!this.f132e) {
                    i4 += 2;
                }
                int i5 = i4 % 3;
                if (i5 == 0) {
                    bVar2.b((i3 * 3) + 1);
                } else if (i5 == 1) {
                    bVar4.b(i3 / 3);
                    bVar3.b(i3 % 3);
                } else if (i5 == 2) {
                    bVar.b(i3 + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar2 = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0], 0);
        s(aVarArr, aVar2);
        return aVar2;
    }

    public final void s(a[] aVarArr, a aVar) {
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            a aVar2 = aVarArr[i3];
            if (aVar2 != null) {
                int i4 = aVar2.f116e % 30;
                int i5 = aVar2.f117f;
                if (i5 > aVar.f117f) {
                    aVarArr[i3] = null;
                } else {
                    if (!this.f132e) {
                        i5 += 2;
                    }
                    int i6 = i5 % 3;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 == 2 && i4 + 1 != aVar.f114b) {
                                aVarArr[i3] = null;
                            }
                        } else if (i4 / 3 != aVar.c || i4 % 3 != aVar.f116e) {
                            aVarArr[i3] = null;
                        }
                    } else if ((i4 * 3) + 1 != aVar.f115d) {
                        aVarArr[i3] = null;
                    }
                }
            }
        }
    }

    @Override // v0.C0403c
    public final String toString() {
        return "IsLeft: " + this.f132e + '\n' + super.toString();
    }
}
