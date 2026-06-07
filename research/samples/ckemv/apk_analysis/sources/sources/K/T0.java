package k;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class T0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f3625a;

    public T0(SearchView searchView) {
        this.f3625a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        SearchView searchView = this.f3625a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f1608L;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z3);
        }
    }
}
