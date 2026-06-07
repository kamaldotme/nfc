package k;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: k.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257M implements ListAdapter, SpinnerAdapter {

    /* renamed from: b, reason: collision with root package name */
    public SpinnerAdapter f3600b;
    public ListAdapter c;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.c;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f3600b;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f3600b;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i3, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        SpinnerAdapter spinnerAdapter = this.f3600b;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        SpinnerAdapter spinnerAdapter = this.f3600b;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i3);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i3) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        return getDropDownView(i3, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f3600b;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i3) {
        ListAdapter listAdapter = this.c;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i3);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f3600b;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f3600b;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
