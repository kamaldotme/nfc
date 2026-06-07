package L1;

import e2.C0124f;
import e2.InterfaceC0123e;
import java.util.concurrent.CancellationException;
import x0.C0432k;

/* loaded from: classes.dex */
public final class a extends X1.h implements W1.l {
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, Object obj) {
        super(1);
        this.c = i3;
        this.f609d = obj;
    }

    @Override // W1.l
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                return obj == ((e) this.f609d) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                a2.c cVar = (a2.c) obj;
                X1.g.e(cVar, "it");
                CharSequence charSequence = (CharSequence) this.f609d;
                X1.g.e(charSequence, "<this>");
                return charSequence.subSequence(cVar.f1424b, cVar.c + 1).toString();
            case 2:
                K1.h hVar = K1.h.f605a;
                ((C0124f) ((InterfaceC0123e) this.f609d)).c(hVar);
                return hVar;
            default:
                Throwable th = (Throwable) obj;
                m0.l lVar = (m0.l) this.f609d;
                if (th == null) {
                    if (!lVar.f3977a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th instanceof CancellationException) {
                    lVar.f3977a.cancel(true);
                } else {
                    C0432k c0432k = lVar.f3977a;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    c0432k.k(th);
                }
                return K1.h.f605a;
        }
    }
}
