package O;

import android.database.DataSetObserver;
import k.G0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f689b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f688a = i3;
        this.f689b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f688a) {
            case 0:
                c cVar = (c) this.f689b;
                cVar.f690b = true;
                cVar.notifyDataSetChanged();
                return;
            default:
                G0 g02 = (G0) this.f689b;
                if (g02.f3568A.isShowing()) {
                    g02.i();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f688a) {
            case 0:
                c cVar = (c) this.f689b;
                cVar.f690b = false;
                cVar.notifyDataSetInvalidated();
                return;
            default:
                ((G0) this.f689b).dismiss();
                return;
        }
    }
}
