package K;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final r f597a;

    public q(r rVar) {
        this.f597a = rVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f597a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        p a3 = this.f597a.a(i3);
        if (a3 == null) {
            return null;
        }
        return a3.f595a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i3) {
        this.f597a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        p b3 = this.f597a.b(i3);
        if (b3 == null) {
            return null;
        }
        return b3.f595a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        return this.f597a.c(i3, i4, bundle);
    }
}
