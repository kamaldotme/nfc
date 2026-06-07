package k;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0205k;
import j.MenuC0207m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class g1 implements InterfaceC0294m, InterfaceC0205k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3687b;

    public /* synthetic */ g1(Toolbar toolbar) {
        this.f3687b = toolbar;
    }

    @Override // j.InterfaceC0205k
    public void e(MenuC0207m menuC0207m) {
        Toolbar toolbar = this.f3687b;
        C0288j c0288j = toolbar.f1655b.f1583u;
        if (c0288j == null || !c0288j.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1645H.c).iterator();
            if (it.hasNext()) {
                X.d.q(it.next());
                throw null;
            }
        }
    }

    @Override // j.InterfaceC0205k
    public boolean g(MenuC0207m menuC0207m, MenuItem menuItem) {
        this.f3687b.getClass();
        return false;
    }
}
