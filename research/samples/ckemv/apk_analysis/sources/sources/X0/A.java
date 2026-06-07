package X0;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1018b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ A(ViewGroup viewGroup, int i3) {
        this.f1018b = i3;
        this.c = viewGroup;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i3, int i4, int i5, CharSequence charSequence) {
    }

    private final void c(int i3, int i4, int i5, CharSequence charSequence) {
    }

    private final void d(int i3, int i4, int i5, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f1018b) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.c;
                textInputLayout.u(!textInputLayout.f2485A0, false);
                if (textInputLayout.f2524l) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.f2540t) {
                    textInputLayout.v(editable);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        int i6 = this.f1018b;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        switch (this.f1018b) {
            case 0:
                return;
            default:
                SearchView searchView = (SearchView) this.c;
                Editable text = searchView.f1627q.getText();
                searchView.f1619W = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.x(!isEmpty);
                int i6 = 8;
                if (searchView.f1618V && !searchView.f1611O && isEmpty) {
                    searchView.f1632v.setVisibility(8);
                    i6 = 0;
                }
                searchView.f1634x.setVisibility(i6);
                searchView.t();
                searchView.w();
                charSequence.toString();
                searchView.getClass();
                return;
        }
    }
}
