package O;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import k.b1;

/* loaded from: classes.dex */
public final class e extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public d f694a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((b1) this.f694a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        b1 b1Var = (b1) this.f694a;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            b1Var.getClass();
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = b1Var.f3657l;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = b1Var.g(b1Var.f3658m, charSequence2);
            } catch (RuntimeException unused) {
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        d dVar = this.f694a;
        Cursor cursor = ((c) dVar).f691d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((b1) dVar).b((Cursor) obj);
    }
}
