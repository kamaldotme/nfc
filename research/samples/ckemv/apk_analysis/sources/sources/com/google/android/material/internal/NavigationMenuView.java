package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.InterfaceC0190B;
import j.MenuC0207m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0190B {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // j.InterfaceC0190B
    public final void b(MenuC0207m menuC0207m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
