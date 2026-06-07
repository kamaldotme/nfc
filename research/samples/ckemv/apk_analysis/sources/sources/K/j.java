package K;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f585e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f586f;
    public static final j g;
    public static final j h;

    /* renamed from: i, reason: collision with root package name */
    public static final j f587i;

    /* renamed from: j, reason: collision with root package name */
    public static final j f588j;

    /* renamed from: k, reason: collision with root package name */
    public static final j f589k;

    /* renamed from: l, reason: collision with root package name */
    public static final j f590l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f591a;

    /* renamed from: b, reason: collision with root package name */
    public final int f592b;
    public final Class c;

    /* renamed from: d, reason: collision with root package name */
    public final B f593d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        new j(1);
        new j(2);
        new j(4);
        new j(8);
        f585e = new j(16);
        new j(32);
        new j(64);
        new j(128);
        new j(256, u.class);
        new j(512, u.class);
        new j(1024, v.class);
        new j(2048, v.class);
        f586f = new j(4096);
        g = new j(8192);
        new j(16384);
        new j(32768);
        new j(65536);
        new j(131072, z.class);
        h = new j(262144);
        f587i = new j(524288);
        f588j = new j(1048576);
        new j(2097152, A.class);
        int i3 = Build.VERSION.SDK_INT;
        new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, x.class);
        f589k = new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f590l = new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new j(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        if (i3 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction16;
        } else {
            accessibilityAction = null;
        }
        new j(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
        new j(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i3 >= 29) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction15;
        } else {
            accessibilityAction2 = null;
        }
        new j(accessibilityAction2, R.id.accessibilityActionPageRight, null, null, null);
        new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, y.class);
        new j(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, w.class);
        if (i3 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction3 = accessibilityAction14;
        } else {
            accessibilityAction3 = null;
        }
        new j(accessibilityAction3, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i3 >= 28) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction4 = accessibilityAction13;
        } else {
            accessibilityAction4 = null;
        }
        new j(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
        new j(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i3 >= 30) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction5 = accessibilityAction12;
        } else {
            accessibilityAction5 = null;
        }
        new j(accessibilityAction5, R.id.accessibilityActionImeEnter, null, null, null);
        new j(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null, null);
        if (i3 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction6 = accessibilityAction11;
        } else {
            accessibilityAction6 = null;
        }
        new j(accessibilityAction6, R.id.CTRL, null, null, null);
        if (i3 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction7 = accessibilityAction10;
        } else {
            accessibilityAction7 = null;
        }
        new j(accessibilityAction7, R.id.FUNCTION, null, null, null);
        if (i3 >= 33) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction8 = accessibilityAction9;
        } else {
            accessibilityAction8 = null;
        }
        new j(accessibilityAction8, R.id.KEYCODE_0, null, null, null);
        new j(i3 >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public j(int i3) {
        this(null, i3, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f591a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        Object obj2 = ((j) obj).f591a;
        Object obj3 = this.f591a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f591a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d3 = p.d(this.f592b);
        if (d3.equals("ACTION_UNKNOWN")) {
            Object obj = this.f591a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d3 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d3);
        return sb.toString();
    }

    public j(int i3, Class cls) {
        this(null, i3, null, null, cls);
    }

    public j(Object obj, int i3, String str, B b3, Class cls) {
        this.f592b = i3;
        this.f593d = b3;
        if (obj == null) {
            this.f591a = new AccessibilityNodeInfo.AccessibilityAction(i3, str);
        } else {
            this.f591a = obj;
        }
        this.c = cls;
    }
}
