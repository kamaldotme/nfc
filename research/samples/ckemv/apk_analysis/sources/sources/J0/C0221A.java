package j0;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import xyz.happify.ckemv.R;

/* renamed from: j0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221A extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3378b;
    public final /* synthetic */ View c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f3379d;

    public C0221A(i iVar, ViewGroup viewGroup, View view, View view2) {
        this.f3379d = iVar;
        this.f3377a = viewGroup;
        this.f3378b = view;
        this.c = view2;
    }

    @Override // j0.p, j0.n
    public final void b() {
        this.f3377a.getOverlay().remove(this.f3378b);
    }

    @Override // j0.n
    public final void d(o oVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.f3377a.getOverlay().remove(this.f3378b);
        oVar.v(this);
    }

    @Override // j0.p, j0.n
    public final void e() {
        View view = this.f3378b;
        if (view.getParent() == null) {
            this.f3377a.getOverlay().add(view);
            return;
        }
        i iVar = this.f3379d;
        ArrayList arrayList = iVar.f3432n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = iVar.f3436r;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) iVar.f3436r.clone();
        int size2 = arrayList3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((n) arrayList3.get(i3)).a();
        }
    }
}
