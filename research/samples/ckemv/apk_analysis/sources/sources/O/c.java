package O;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k.b1;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable, d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f690b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public Cursor f691d;

    /* renamed from: e, reason: collision with root package name */
    public int f692e;

    /* renamed from: f, reason: collision with root package name */
    public a f693f;
    public b g;
    public e h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f691d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f693f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f691d = cursor;
            if (cursor != null) {
                a aVar2 = this.f693f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f692e = cursor.getColumnIndexOrThrow("_id");
                this.f690b = true;
                notifyDataSetChanged();
            } else {
                this.f692e = -1;
                this.f690b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f690b || (cursor = this.f691d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f690b) {
            return null;
        }
        this.f691d.moveToPosition(i3);
        if (view == null) {
            b1 b1Var = (b1) this;
            view = b1Var.f3656k.inflate(b1Var.f3655j, viewGroup, false);
        }
        a(view, this.f691d);
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O.e, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f694a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        Cursor cursor;
        if (!this.f690b || (cursor = this.f691d) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f691d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        Cursor cursor;
        if (this.f690b && (cursor = this.f691d) != null && cursor.moveToPosition(i3)) {
            return this.f691d.getLong(this.f692e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f690b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f691d.moveToPosition(i3)) {
            throw new IllegalStateException(X.d.f("couldn't move cursor to position ", i3));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f691d);
        return view;
    }
}
