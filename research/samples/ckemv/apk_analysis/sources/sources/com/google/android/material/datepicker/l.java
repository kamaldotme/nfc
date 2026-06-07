package com.google.android.material.datepicker;

import J.InterfaceC0018q;
import J.y0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements InterfaceC0018q {

    /* renamed from: b, reason: collision with root package name */
    public final int f2406b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2407d;

    public l(Context context, XmlResourceParser xmlResourceParser) {
        this.f2407d = new ArrayList();
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), t.o.g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                this.f2406b = obtainStyledAttributes.getResourceId(index, this.f2406b);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new t.k().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // J.InterfaceC0018q
    public y0 f(View view, y0 y0Var) {
        int i3 = y0Var.f470a.f(7).f3b;
        int i4 = this.f2406b;
        View view2 = (View) this.f2407d;
        if (i4 >= 0) {
            view2.getLayoutParams().height = i4 + i3;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i3, view2.getPaddingRight(), view2.getPaddingBottom());
        return y0Var;
    }

    public l() {
        this.f2407d = new l[256];
        this.f2406b = 0;
        this.c = 0;
    }

    public l(int i3, int i4) {
        this.f2407d = null;
        this.f2406b = i3;
        int i5 = i4 & 7;
        this.c = i5 == 0 ? 8 : i5;
    }

    public l(View view, int i3, int i4) {
        this.f2406b = i3;
        this.f2407d = view;
        this.c = i4;
    }
}
