package e2;

import java.util.concurrent.Future;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122d implements d0, W1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2799b;
    public final Object c;

    public /* synthetic */ C0122d(int i3, Object obj) {
        this.f2799b = i3;
        this.c = obj;
    }

    public final void b(Throwable th) {
        switch (this.f2799b) {
            case 0:
                if (th != null) {
                    ((Future) this.c).cancel(false);
                    return;
                }
                return;
            case 1:
                ((C) this.c).f();
                return;
            default:
                ((W1.l) this.c).h(th);
                return;
        }
    }

    @Override // W1.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        switch (this.f2799b) {
            case 0:
                b((Throwable) obj);
                return K1.h.f605a;
            case 1:
                b((Throwable) obj);
                return K1.h.f605a;
            default:
                b((Throwable) obj);
                return K1.h.f605a;
        }
    }

    public final String toString() {
        switch (this.f2799b) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) this.c) + ']';
            case 1:
                return "DisposeOnCancel[" + ((C) this.c) + ']';
            default:
                return "InvokeOnCancel[" + ((W1.l) this.c).getClass().getSimpleName() + '@' + AbstractC0139v.f(this) + ']';
        }
    }
}
