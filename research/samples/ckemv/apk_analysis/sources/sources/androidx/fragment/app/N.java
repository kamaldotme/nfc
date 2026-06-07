package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class N implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1872b;
    public final /* synthetic */ ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1875f;

    public N(int i3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1872b = i3;
        this.c = arrayList;
        this.f1873d = arrayList2;
        this.f1874e = arrayList3;
        this.f1875f = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i3 = 0; i3 < this.f1872b; i3++) {
            View view = (View) this.c.get(i3);
            String str = (String) this.f1873d.get(i3);
            WeakHashMap weakHashMap = J.T.f402a;
            J.H.v(view, str);
            J.H.v((View) this.f1874e.get(i3), (String) this.f1875f.get(i3));
        }
    }
}
