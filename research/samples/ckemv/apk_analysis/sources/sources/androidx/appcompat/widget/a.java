package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f1680b;

    public a(SearchView searchView) {
        this.f1680b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f1680b;
        ImageView imageView = searchView.f1631u;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f1627q;
        if (view == imageView) {
            searchView.y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f1609M;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f1633w) {
            searchView.o();
            return;
        }
        if (view == searchView.f1632v) {
            searchView.s();
            return;
        }
        if (view != searchView.f1634x) {
            if (view == searchAutoComplete) {
                searchView.n();
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f1622c0;
        if (searchableInfo != null) {
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m(searchView.f1606J, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f1605I);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }
}
