package X0;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import k.C0259O;
import k.G0;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1113b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i3, Object obj) {
        this.f1113b = i3;
        this.c = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        Object item;
        switch (this.f1113b) {
            case 0:
                w wVar = (w) this.c;
                if (i3 < 0) {
                    G0 g02 = wVar.f1116f;
                    item = !g02.f3568A.isShowing() ? null : g02.f3570d.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i3);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                G0 g03 = wVar.f1116f;
                if (onItemClickListener != null) {
                    if (view == null || i3 < 0) {
                        view = g03.f3568A.isShowing() ? g03.f3570d.getSelectedView() : null;
                        i3 = !g03.f3568A.isShowing() ? -1 : g03.f3570d.getSelectedItemPosition();
                        j3 = !g03.f3568A.isShowing() ? Long.MIN_VALUE : g03.f3570d.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g03.f3570d, view, i3, j3);
                }
                g03.dismiss();
                return;
            case 1:
                C0259O c0259o = (C0259O) this.c;
                c0259o.f3606H.setSelection(i3);
                if (c0259o.f3606H.getOnItemClickListener() != null) {
                    c0259o.f3606H.performItemClick(view, i3, c0259o.f3603E.getItemId(i3));
                }
                c0259o.dismiss();
                return;
            default:
                ((SearchView) this.c).p(i3);
                return;
        }
    }
}
