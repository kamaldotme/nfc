package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.AbstractC0116a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: b, reason: collision with root package name */
    public final int f1502b;
    public final int c;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0116a.f2681t);
        this.c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1502b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
