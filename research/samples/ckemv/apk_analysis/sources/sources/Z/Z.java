package Z;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Z extends K {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1224a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0056x f1225b;

    public Z(C0056x c0056x) {
        this.f1225b = c0056x;
    }

    @Override // Z.K
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 0 && this.f1224a) {
            this.f1224a = false;
            this.f1225b.f();
        }
    }

    @Override // Z.K
    public final void b(RecyclerView recyclerView, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f1224a = true;
    }
}
