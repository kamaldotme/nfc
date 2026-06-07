package K;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class k {
    public static o a(int i3, int i4, int i5, int i6, boolean z3) {
        return new o(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i4, i5, i6, z3));
    }

    public static Object b(int i3, float f3, float f4, float f5) {
        return AccessibilityNodeInfo.RangeInfo.obtain(i3, f3, f4, f5);
    }

    public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }
}
