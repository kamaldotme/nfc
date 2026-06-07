package K;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: K.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0028b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i3) {
        accessibilityEvent.setContentChangeTypes(i3);
    }
}
