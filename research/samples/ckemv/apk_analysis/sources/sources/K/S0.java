package k;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class S0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3624b;
    public final /* synthetic */ SearchView c;

    public /* synthetic */ S0(SearchView searchView, int i3) {
        this.f3624b = i3;
        this.c = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3624b) {
            case 0:
                this.c.u();
                return;
            default:
                O.c cVar = this.c.f1612P;
                if (cVar instanceof b1) {
                    cVar.b(null);
                    return;
                }
                return;
        }
    }
}
