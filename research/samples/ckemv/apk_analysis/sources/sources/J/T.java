package J;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f402a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f403b;
    public static boolean c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f404d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0023w f405e;

    /* renamed from: f, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0025y f406f;

    /* JADX WARN: Type inference failed for: r0v5, types: [J.w, java.lang.Object] */
    static {
        new AtomicInteger(1);
        f402a = null;
        c = false;
        f404d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f405e = new Object();
        f406f = new ViewTreeObserverOnGlobalLayoutListenerC0025y();
    }

    public static C0003b0 a(View view) {
        if (f402a == null) {
            f402a = new WeakHashMap();
        }
        C0003b0 c0003b0 = (C0003b0) f402a.get(view);
        if (c0003b0 != null) {
            return c0003b0;
        }
        C0003b0 c0003b02 = new C0003b0(view);
        f402a.put(view, c0003b02);
        return c0003b02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, J.S] */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = S.f399d;
        S s3 = (S) view.getTag(R.id.tag_unhandled_key_event_manager);
        S s4 = s3;
        if (s3 == null) {
            ?? obj = new Object();
            obj.f400a = null;
            obj.f401b = null;
            obj.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            s4 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = s4.f400a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = S.f399d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (s4.f400a == null) {
                            s4.f400a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = S.f399d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                s4.f400a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    s4.f400a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a3 = s4.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (s4.f401b == null) {
                    s4.f401b = new SparseArray();
                }
                s4.f401b.put(keyCode, new WeakReference(a3));
            }
        }
        return a3 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return M.a(view);
        }
        if (c) {
            return null;
        }
        if (f403b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f403b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = f403b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = L.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(View view) {
        return Build.VERSION.SDK_INT >= 31 ? O.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (E.a(view) != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                E.g(obtain, i3);
                if (z3) {
                    obtain.getText().add(d(view));
                    if (B.c(view) == 0) {
                        B.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i3 != 32) {
                if (view.getParent() != null) {
                    try {
                        E.e(view.getParent(), view, view, i3);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            E.g(obtain2, i3);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0008g h(View view, C0008g c0008g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0008g);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return O.b(view, c0008g);
        }
        r rVar = (r) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0019s interfaceC0019s = f405e;
        if (rVar == null) {
            if (view instanceof InterfaceC0019s) {
                interfaceC0019s = (InterfaceC0019s) view;
            }
            return interfaceC0019s.a(c0008g);
        }
        C0008g a3 = ((N.u) rVar).a(view, c0008g);
        if (a3 == null) {
            return null;
        }
        if (view instanceof InterfaceC0019s) {
            interfaceC0019s = (InterfaceC0019s) view;
        }
        return interfaceC0019s.a(a3);
    }

    public static void i(View view, int i3) {
        ArrayList e3 = e(view);
        for (int i4 = 0; i4 < e3.size(); i4++) {
            if (((K.j) e3.get(i4)).a() == i3) {
                e3.remove(i4);
                return;
            }
        }
    }

    public static void j(View view, K.j jVar, K.B b3) {
        K.j jVar2 = new K.j(null, jVar.f592b, null, b3, jVar.c);
        View.AccessibilityDelegate c3 = c(view);
        C0004c c0004c = c3 == null ? null : c3 instanceof C0000a ? ((C0000a) c3).f411a : new C0004c(c3);
        if (c0004c == null) {
            c0004c = new C0004c();
        }
        l(view, c0004c);
        i(view, jVar2.a());
        e(view).add(jVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            M.d(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    public static void l(View view, C0004c c0004c) {
        if (c0004c == null && (c(view) instanceof C0000a)) {
            c0004c = new C0004c();
        }
        if (B.c(view) == 0) {
            B.s(view, 1);
        }
        view.setAccessibilityDelegate(c0004c == null ? null : c0004c.f414b);
    }

    public static void m(View view, CharSequence charSequence) {
        new C0024x(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0025y viewTreeObserverOnGlobalLayoutListenerC0025y = f406f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0025y.f468b.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0025y);
            B.o(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC0025y);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0025y.f468b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0025y);
            if (E.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0025y);
            }
        }
    }
}
