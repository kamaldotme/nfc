package com.google.android.material.button;

import A.h;
import G0.d;
import G0.e;
import G0.f;
import J.AbstractC0013l;
import J.B;
import J.C;
import J.T;
import O0.k;
import U0.j;
import Z0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f2346l = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2347b;
    public final h c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2348d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2349e;

    /* renamed from: f, reason: collision with root package name */
    public Integer[] f2350f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2351i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2352j;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f2353k;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f2347b = new ArrayList();
        this.c = new h(3, this);
        this.f2348d = new LinkedHashSet();
        this.f2349e = new d(this);
        this.g = false;
        this.f2353k = new HashSet();
        TypedArray f3 = k.f(getContext(), attributeSet, A0.a.f28j, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(f3.getBoolean(3, false));
        this.f2352j = f3.getResourceId(1, -1);
        this.f2351i = f3.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f3.getBoolean(0, true));
        f3.recycle();
        WeakHashMap weakHashMap = T.f402a;
        B.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (c(i3)) {
                return i3;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && c(i4)) {
                i3++;
            }
        }
        return i3;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = T.f402a;
            materialButton.setId(C.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i3 = firstVisibleChildIndex + 1; i3 < getChildCount(); i3++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i3);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i3 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                AbstractC0013l.g(layoutParams2, 0);
                AbstractC0013l.h(layoutParams2, -min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                AbstractC0013l.h(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            AbstractC0013l.g(layoutParams3, 0);
            AbstractC0013l.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i3, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            b(materialButton.getId(), materialButton.f2343p);
            U0.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f2347b.add(new f(shapeAppearanceModel.f938e, shapeAppearanceModel.h, shapeAppearanceModel.f939f, shapeAppearanceModel.g));
            materialButton.setEnabled(isEnabled());
            T.l(materialButton, new e(0, this));
        }
    }

    public final void b(int i3, boolean z3) {
        if (i3 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f2353k);
        if (z3 && !hashSet.contains(Integer.valueOf(i3))) {
            if (this.h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i3));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i3))) {
                return;
            }
            if (!this.f2351i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i3));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i3) {
        return getChildAt(i3).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f2353k;
        this.f2353k = new HashSet(set);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = ((MaterialButton) getChildAt(i3)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.g = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.g = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f2348d.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2349e);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            treeMap.put((MaterialButton) getChildAt(i3), Integer.valueOf(i3));
        }
        this.f2350f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        f fVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i3 = 0; i3 < childCount; i3++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i3);
            if (materialButton.getVisibility() != 8) {
                j e3 = materialButton.getShapeAppearanceModel().e();
                f fVar2 = (f) this.f2347b.get(i3);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z3 = getOrientation() == 0;
                    U0.a aVar = f.f228e;
                    if (i3 == firstVisibleChildIndex) {
                        fVar = z3 ? k.e(this) ? new f(aVar, aVar, fVar2.f230b, fVar2.c) : new f(fVar2.f229a, fVar2.f231d, aVar, aVar) : new f(fVar2.f229a, aVar, fVar2.f230b, aVar);
                    } else if (i3 == lastVisibleChildIndex) {
                        fVar = z3 ? k.e(this) ? new f(fVar2.f229a, fVar2.f231d, aVar, aVar) : new f(aVar, aVar, fVar2.f230b, fVar2.c) : new f(aVar, fVar2.f231d, aVar, fVar2.c);
                    } else {
                        fVar2 = null;
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    e3.f929e = new U0.a(0.0f);
                    e3.f930f = new U0.a(0.0f);
                    e3.g = new U0.a(0.0f);
                    e3.h = new U0.a(0.0f);
                } else {
                    e3.f929e = fVar2.f229a;
                    e3.h = fVar2.f231d;
                    e3.f930f = fVar2.f230b;
                    e3.g = fVar2.c;
                }
                materialButton.setShapeAppearanceModel(e3.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.h || this.f2353k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2353k.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = ((MaterialButton) getChildAt(i3)).getId();
            if (this.f2353k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        Integer[] numArr = this.f2350f;
        return (numArr == null || i4 >= numArr.length) ? i4 : numArr[i4].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i3 = this.f2352j;
        if (i3 != -1) {
            d(Collections.singleton(Integer.valueOf(i3)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.h ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        e();
        a();
        super.onMeasure(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2347b.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            ((MaterialButton) getChildAt(i3)).setEnabled(z3);
        }
    }

    public void setSelectionRequired(boolean z3) {
        this.f2351i = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.h != z3) {
            this.h = z3;
            d(new HashSet());
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            ((MaterialButton) getChildAt(i3)).setA11yClassName((this.h ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i3) {
        setSingleSelection(getResources().getBoolean(i3));
    }
}
