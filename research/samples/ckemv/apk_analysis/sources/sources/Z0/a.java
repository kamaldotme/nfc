package Z0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1374a = {R.attr.theme, xyz.happify.ckemv.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1375b = {xyz.happify.ckemv.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i3, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1375b, i3, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z3 = (context instanceof e) && ((e) context).f3127a == resourceId;
        if (resourceId == 0 || z3) {
            return context;
        }
        e eVar = new e(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1374a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            eVar.getTheme().applyStyle(resourceId2, true);
        }
        return eVar;
    }
}
