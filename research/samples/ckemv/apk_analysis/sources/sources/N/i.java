package N;

import J.C0004c;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class i extends C0004c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f673d;

    public /* synthetic */ i(int i3) {
        this.f673d = i3;
    }

    @Override // J.C0004c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f673d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                K.s.c(accessibilityEvent, nestedScrollView.getScrollX());
                K.s.d(accessibilityEvent, nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // J.C0004c
    public final void d(View view, K.p pVar) {
        int scrollRange;
        switch (this.f673d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f413a;
                AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
                if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                    return;
                }
                accessibilityNodeInfo.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    pVar.b(K.j.g);
                    pVar.b(K.j.f589k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    pVar.b(K.j.f586f);
                    pVar.b(K.j.f590l);
                    return;
                }
                return;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f413a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = pVar.f595a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                return;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f413a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = pVar.f595a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setScrollable(false);
                return;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f413a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = pVar.f595a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCollectionInfo(null);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r6 != 16908346) goto L11;
     */
    @Override // J.C0004c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i3, Bundle bundle) {
        switch (this.f673d) {
            case 0:
                if (super.g(view, i3, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i3 != 4096) {
                        if (i3 != 8192 && i3 != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i3, bundle);
        }
    }
}
