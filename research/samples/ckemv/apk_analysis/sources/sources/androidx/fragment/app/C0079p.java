package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import b.InterfaceC0101b;
import f.AbstractActivityC0159g;
import f.AbstractC0163k;
import xyz.happify.ckemv.MainActivity;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079p implements InterfaceC0101b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0159g f1994b;

    public /* synthetic */ C0079p(MainActivity mainActivity, int i3) {
        this.f1993a = i3;
        this.f1994b = mainActivity;
    }

    @Override // b.InterfaceC0101b
    public final void a() {
        switch (this.f1993a) {
            case 0:
                AbstractActivityC0159g abstractActivityC0159g = this.f1994b;
                C0080q c0080q = (C0080q) abstractActivityC0159g.f2908r.c;
                c0080q.g.b(c0080q, c0080q, null);
                Bundle c = ((d0.d) abstractActivityC0159g.f1452f.f1464d).c("android:support:fragments");
                if (c != null) {
                    Parcelable parcelable = c.getParcelable("android:support:fragments");
                    C0080q c0080q2 = (C0080q) abstractActivityC0159g.f2908r.c;
                    if (!(c0080q2 instanceof androidx.lifecycle.P)) {
                        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
                    }
                    c0080q2.g.N(parcelable);
                    return;
                }
                return;
            default:
                AbstractActivityC0159g abstractActivityC0159g2 = this.f1994b;
                AbstractC0163k k2 = abstractActivityC0159g2.k();
                f.v vVar = (f.v) k2;
                LayoutInflater from = LayoutInflater.from(vVar.f2983l);
                if (from.getFactory() == null) {
                    from.setFactory2(vVar);
                } else {
                    boolean z3 = from.getFactory2() instanceof f.v;
                }
                ((d0.d) abstractActivityC0159g2.f1452f.f1464d).c("androidx:appcompat");
                k2.c();
                return;
        }
    }
}
