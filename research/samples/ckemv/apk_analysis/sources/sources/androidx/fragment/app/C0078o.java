package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0095l;
import d0.InterfaceC0114c;
import f.AbstractActivityC0159g;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import xyz.happify.ckemv.MainActivity;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078o implements InterfaceC0114c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1991a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1992b;

    public /* synthetic */ C0078o(MainActivity mainActivity, int i3) {
        this.f1991a = i3;
        this.f1992b = mainActivity;
    }

    @Override // d0.InterfaceC0114c
    public final Bundle a() {
        AbstractActivityC0159g abstractActivityC0159g;
        switch (this.f1991a) {
            case 0:
                Bundle bundle = new Bundle();
                do {
                    abstractActivityC0159g = (AbstractActivityC0159g) this.f1992b;
                } while (AbstractActivityC0159g.n(((C0080q) abstractActivityC0159g.f2908r.c).g));
                abstractActivityC0159g.f2909s.d(EnumC0095l.ON_STOP);
                C O2 = ((C0080q) abstractActivityC0159g.f2908r.c).g.O();
                if (O2 != null) {
                    bundle.putParcelable("android:support:fragments", O2);
                }
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC0159g) this.f1992b).k().getClass();
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f1992b));
                return bundle3;
        }
    }

    public C0078o(d0.d dVar) {
        this.f1991a = 2;
        X1.g.e(dVar, "registry");
        this.f1992b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }
}
