package k;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class U0 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f3629a;

    public U0(SearchView searchView) {
        this.f3629a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        this.f3629a.s();
        return true;
    }
}
