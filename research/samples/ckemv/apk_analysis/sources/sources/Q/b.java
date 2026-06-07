package Q;

import J.B;
import J.C;
import J.C0004c;
import J.T;
import K.p;
import K.r;
import K.t;
import a.AbstractC0059a;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n.C0343l;

/* loaded from: classes.dex */
public abstract class b extends C0004c {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f785n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final U0.e f786o = new U0.e(4);

    /* renamed from: p, reason: collision with root package name */
    public static final U0.e f787p = new U0.e(5);
    public final AccessibilityManager h;

    /* renamed from: i, reason: collision with root package name */
    public final View f791i;

    /* renamed from: j, reason: collision with root package name */
    public a f792j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f788d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f789e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f790f = new Rect();
    public final int[] g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f793k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f794l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f795m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f791i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = T.f402a;
        if (B.c(view) == 0) {
            B.s(view, 1);
        }
    }

    @Override // J.C0004c
    public final r b(View view) {
        if (this.f792j == null) {
            this.f792j = new a(this);
        }
        return this.f792j;
    }

    @Override // J.C0004c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // J.C0004c
    public final void d(View view, p pVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f413a;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((J0.d) this).f480q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i3) {
        if (this.f794l != i3) {
            return false;
        }
        this.f794l = Integer.MIN_VALUE;
        J0.d dVar = (J0.d) this;
        if (i3 == 1) {
            Chip chip = dVar.f480q;
            chip.f2365n = false;
            chip.refreshDrawableState();
        }
        q(i3, 8);
        return true;
    }

    public final p k(int i3) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        p pVar = new p(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f785n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        pVar.f596b = -1;
        View view = this.f791i;
        obtain.setParent(view);
        o(i3, pVar);
        if (pVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f789e;
        pVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(view.getContext().getPackageName());
        pVar.c = i3;
        obtain.setSource(view, i3);
        if (this.f793k == i3) {
            obtain.setAccessibilityFocused(true);
            pVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            pVar.a(64);
        }
        boolean z3 = this.f794l == i3;
        if (z3) {
            pVar.a(2);
        } else if (obtain.isFocusable()) {
            pVar.a(1);
        }
        obtain.setFocused(z3);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f788d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            pVar.f(rect3);
            if (pVar.f596b != -1) {
                p pVar2 = new p(AccessibilityNodeInfo.obtain());
                for (int i4 = pVar.f596b; i4 != -1; i4 = pVar2.f596b) {
                    pVar2.f596b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = pVar2.f595a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i4, pVar2);
                    pVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f790f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                pVar.f595a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return pVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i3, Rect rect) {
        int i4;
        int i5;
        Object obj;
        p pVar;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        C0343l c0343l = new C0343l();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            c0343l.d(((Integer) arrayList.get(i9)).intValue(), k(((Integer) arrayList.get(i9)).intValue()));
        }
        int i10 = this.f794l;
        int i11 = Integer.MIN_VALUE;
        p pVar2 = i10 == Integer.MIN_VALUE ? null : (p) c0343l.c(i10, null);
        U0.e eVar = f786o;
        U0.e eVar2 = f787p;
        View view = this.f791i;
        if (i3 == 1 || i3 == 2) {
            i4 = 0;
            i5 = -1;
            WeakHashMap weakHashMap = T.f402a;
            boolean z3 = C.d(view) == 1;
            eVar2.getClass();
            int i12 = c0343l.f4163d;
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList2.add((p) c0343l.c[i13]);
            }
            Collections.sort(arrayList2, new c(z3, eVar));
            if (i3 == 1) {
                int size = arrayList2.size();
                if (pVar2 != null) {
                    size = arrayList2.indexOf(pVar2);
                }
                int i14 = size - 1;
                if (i14 >= 0) {
                    obj = arrayList2.get(i14);
                    pVar = (p) obj;
                }
                obj = null;
                pVar = (p) obj;
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (pVar2 == null ? -1 : arrayList2.lastIndexOf(pVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    pVar = (p) obj;
                }
                obj = null;
                pVar = (p) obj;
            }
        } else {
            if (i3 != 17 && i3 != 33 && i3 != 66 && i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i15 = this.f794l;
            if (i15 != Integer.MIN_VALUE) {
                n(i15).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i3 == 17) {
                    i5 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i3 == 33) {
                    i5 = -1;
                    rect2.set(0, height, width, height);
                } else if (i3 == 66) {
                    rect2.set(-1, 0, -1, height);
                    i5 = -1;
                } else {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i5 = -1;
                }
                Rect rect3 = new Rect(rect2);
                if (i3 != 17) {
                    i4 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i3 == 33) {
                    i4 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i3 == 66) {
                    i4 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i4 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                eVar2.getClass();
                i7 = c0343l.f4163d;
                Rect rect4 = new Rect();
                pVar = null;
                for (i8 = i4; i8 < i7; i8++) {
                    p pVar3 = (p) c0343l.c[i8];
                    if (pVar3 != pVar2) {
                        eVar.getClass();
                        pVar3.f(rect4);
                        if (AbstractC0059a.z(i3, rect2, rect4)) {
                            if (AbstractC0059a.z(i3, rect2, rect3) && !AbstractC0059a.c(i3, rect2, rect4, rect3)) {
                                if (!AbstractC0059a.c(i3, rect2, rect3, rect4)) {
                                    int B3 = AbstractC0059a.B(i3, rect2, rect4);
                                    int D = AbstractC0059a.D(i3, rect2, rect4);
                                    int i16 = (D * D) + (B3 * 13 * B3);
                                    int B4 = AbstractC0059a.B(i3, rect2, rect3);
                                    int D2 = AbstractC0059a.D(i3, rect2, rect3);
                                    if (i16 >= (D2 * D2) + (B4 * 13 * B4)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            pVar = pVar3;
                        }
                    }
                }
            }
            i5 = -1;
            Rect rect32 = new Rect(rect2);
            if (i3 != 17) {
            }
            eVar2.getClass();
            i7 = c0343l.f4163d;
            Rect rect42 = new Rect();
            pVar = null;
            while (i8 < i7) {
            }
        }
        p pVar4 = pVar;
        if (pVar4 != null) {
            int i17 = i4;
            while (true) {
                if (i17 >= c0343l.f4163d) {
                    i6 = i5;
                    break;
                }
                if (c0343l.c[i17] == pVar4) {
                    i6 = i17;
                    break;
                }
                i17++;
            }
            i11 = c0343l.f4162b[i6];
        }
        return p(i11);
    }

    public final p n(int i3) {
        if (i3 != -1) {
            return k(i3);
        }
        View view = this.f791i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        p pVar = new p(obtain);
        WeakHashMap weakHashMap = T.f402a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.f595a.addChild(view, ((Integer) arrayList.get(i4)).intValue());
        }
        return pVar;
    }

    public abstract void o(int i3, p pVar);

    public final boolean p(int i3) {
        int i4;
        View view = this.f791i;
        if ((!view.isFocused() && !view.requestFocus()) || (i4 = this.f794l) == i3) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            j(i4);
        }
        if (i3 == Integer.MIN_VALUE) {
            return false;
        }
        this.f794l = i3;
        J0.d dVar = (J0.d) this;
        if (i3 == 1) {
            Chip chip = dVar.f480q;
            chip.f2365n = true;
            chip.refreshDrawableState();
        }
        q(i3, 8);
        return true;
    }

    public final void q(int i3, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i3 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.f791i).getParent()) == null) {
            return;
        }
        if (i3 != -1) {
            obtain = AccessibilityEvent.obtain(i4);
            p n3 = n(i3);
            obtain.getText().add(n3.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n3.f595a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            t.a(obtain, view, i3);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i4);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
