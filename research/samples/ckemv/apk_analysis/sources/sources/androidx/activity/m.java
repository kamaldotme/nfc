package androidx.activity;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class m extends X1.h implements W1.l {
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f1465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(u uVar, int i3) {
        super(1);
        this.c = i3;
        this.f1465d = uVar;
    }

    @Override // W1.l
    public final Object h(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.c) {
            case 0:
                X1.g.e((b) obj, "backEvent");
                u uVar = this.f1465d;
                L1.i iVar = uVar.f1498b;
                ListIterator listIterator = iVar.listIterator(iVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((androidx.fragment.app.v) obj2).f2005a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                uVar.c = (androidx.fragment.app.v) obj2;
                return K1.h.f605a;
            default:
                X1.g.e((b) obj, "backEvent");
                L1.i iVar2 = this.f1465d.f1498b;
                ListIterator listIterator2 = iVar2.listIterator(iVar2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (((androidx.fragment.app.v) obj3).f2005a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                return K1.h.f605a;
        }
    }
}
