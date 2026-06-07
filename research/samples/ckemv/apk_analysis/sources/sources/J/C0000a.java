package J;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* renamed from: J.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0004c f411a;

    public C0000a(C0004c c0004c) {
        this.f411a = c0004c;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f411a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        K.r b3 = this.f411a.b(view);
        if (b3 != null) {
            return (AccessibilityNodeProvider) b3.f599a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f411a.c(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        K.p pVar = new K.p(accessibilityNodeInfo);
        WeakHashMap weakHashMap = T.f402a;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(L.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z3 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z3);
        } else {
            Bundle c = K.k.c(accessibilityNodeInfo);
            if (c != null) {
                c.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z3 | (c.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(L.c(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z4 = bool2 != null && bool2.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z4);
        } else {
            Bundle c3 = K.k.c(accessibilityNodeInfo);
            if (c3 != null) {
                c3.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z4 ? 2 : 0) | (c3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        CharSequence d3 = T.d(view);
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(d3);
        } else {
            K.k.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d3);
        }
        if (i3 >= 30) {
            obj = N.b(view);
        } else {
            Object tag3 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag3)) {
                obj = tag3;
            }
        }
        CharSequence charSequence = (CharSequence) obj;
        if (i3 >= 30) {
            K.l.c(accessibilityNodeInfo, charSequence);
        } else {
            K.k.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f411a.d(view, pVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            pVar.b((K.j) list.get(i4));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f411a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f411a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
        return this.f411a.g(view, i3, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i3) {
        this.f411a.h(view, i3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f411a.i(view, accessibilityEvent);
    }
}
