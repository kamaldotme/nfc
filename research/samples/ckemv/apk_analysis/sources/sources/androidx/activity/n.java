package androidx.activity;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class n extends X1.h implements W1.a {
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f1466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(u uVar, int i3) {
        super(0);
        this.c = i3;
        this.f1466d = uVar;
    }

    @Override // W1.a
    public final Object d() {
        Object obj;
        switch (this.c) {
            case 0:
                this.f1466d.b();
                return K1.h.f605a;
            case 1:
                u uVar = this.f1466d;
                L1.i iVar = uVar.f1498b;
                ListIterator listIterator = iVar.listIterator(iVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((androidx.fragment.app.v) obj).f2005a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                uVar.c = null;
                return K1.h.f605a;
            default:
                this.f1466d.b();
                return K1.h.f605a;
        }
    }
}
