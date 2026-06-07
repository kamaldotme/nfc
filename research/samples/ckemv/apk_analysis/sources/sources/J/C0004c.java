package J;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import xyz.happify.ckemv.R;

/* renamed from: J.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0004c {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f413a;

    /* renamed from: b, reason: collision with root package name */
    public final C0000a f414b;

    public C0004c() {
        this(c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f413a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public K.r b(View view) {
        AccessibilityNodeProvider a3 = AbstractC0002b.a(this.f413a, view);
        if (a3 != null) {
            return new K.r(a3);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f413a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, K.p pVar) {
        this.f413a.onInitializeAccessibilityNodeInfo(view, pVar.f595a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f413a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f413a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i3, Bundle bundle) {
        boolean z3;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                break;
            }
            K.j jVar = (K.j) list.get(i4);
            if (jVar.a() == i3) {
                K.B b3 = jVar.f593d;
                if (b3 != null) {
                    Class cls = jVar.c;
                    if (cls != null) {
                        try {
                            X.d.q(cls.getDeclaredConstructor(null).newInstance(null));
                            throw null;
                        } catch (Exception unused) {
                            z3 = b3.e(view);
                        }
                    }
                    z3 = b3.e(view);
                }
            } else {
                i4++;
            }
        }
        z3 = false;
        if (!z3) {
            z3 = AbstractC0002b.b(this.f413a, view, i3, bundle);
        }
        if (z3 || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z3;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i6 = 0;
            while (true) {
                if (clickableSpanArr == null || i6 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i6++;
            }
        }
        return z4;
    }

    public void h(View view, int i3) {
        this.f413a.sendAccessibilityEvent(view, i3);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f413a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0004c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f413a = accessibilityDelegate;
        this.f414b = new C0000a(this);
    }
}
