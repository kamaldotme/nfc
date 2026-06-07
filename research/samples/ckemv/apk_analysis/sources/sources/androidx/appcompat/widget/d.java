package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f1682b;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f1682b = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f1682b;
        if (searchAutoComplete.h) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.h = false;
        }
    }
}
