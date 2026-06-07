package k;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class C0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z3) {
        popupWindow.setIsClippedToScreen(z3);
    }
}
