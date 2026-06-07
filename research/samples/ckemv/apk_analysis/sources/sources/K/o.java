package K;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f594a;

    public o(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f594a = collectionItemInfo;
    }

    public static o a(int i3, int i4, int i5, int i6, boolean z3) {
        return new o(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i4, i5, i6, false, z3));
    }
}
