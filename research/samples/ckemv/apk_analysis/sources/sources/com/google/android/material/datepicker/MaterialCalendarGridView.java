package com.google.android.material.datepicker;

import J.T;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2375b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w.d(null);
        if (m.E(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(xyz.happify.ckemv.R.id.cancel_button);
            setNextFocusRightId(xyz.happify.ckemv.R.id.confirm_button);
        }
        this.f2375b = m.E(getContext(), xyz.happify.ckemv.R.attr.nestedScrollable);
        T.l(this, new N.i(3));
    }

    public final p a() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((p) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p pVar = (p) super.getAdapter();
        pVar.getClass();
        int max = Math.max(pVar.a(), getFirstVisiblePosition());
        int min = Math.min(pVar.c(), getLastVisiblePosition());
        pVar.getItem(max);
        pVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        if (!z3) {
            super.onFocusChanged(false, i3, rect);
            return;
        }
        if (i3 == 33) {
            setSelection(((p) super.getAdapter()).c());
        } else if (i3 == 130) {
            setSelection(((p) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i3, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (!super.onKeyDown(i3, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((p) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i3) {
            return false;
        }
        setSelection(((p) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f2375b) {
            super.onMeasure(i3, i4);
            return;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i3) {
        if (i3 < ((p) super.getAdapter()).a()) {
            super.setSelection(((p) super.getAdapter()).a());
        } else {
            super.setSelection(i3);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof p) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()));
    }
}
