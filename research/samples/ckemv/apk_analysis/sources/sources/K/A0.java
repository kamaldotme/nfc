package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class A0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3550b;
    public final /* synthetic */ Object c;

    public /* synthetic */ A0(int i3, Object obj) {
        this.f3550b = i3;
        this.c = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        C0311u0 c0311u0;
        switch (this.f3550b) {
            case 0:
                if (i3 == -1 || (c0311u0 = ((G0) this.c).f3570d) == null) {
                    return;
                }
                c0311u0.setListSelectionHidden(false);
                return;
            default:
                ((SearchView) this.c).q(i3);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f3550b;
    }
}
