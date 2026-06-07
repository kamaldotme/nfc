package j0;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3410b;

    public j(View view, ArrayList arrayList) {
        this.f3409a = view;
        this.f3410b = arrayList;
    }

    @Override // j0.n
    public final void a() {
    }

    @Override // j0.n
    public final void b() {
    }

    @Override // j0.n
    public final void c() {
    }

    @Override // j0.n
    public final void d(o oVar) {
        oVar.v(this);
        this.f3409a.setVisibility(8);
        ArrayList arrayList = this.f3410b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((View) arrayList.get(i3)).setVisibility(0);
        }
    }

    @Override // j0.n
    public final void e() {
    }
}
