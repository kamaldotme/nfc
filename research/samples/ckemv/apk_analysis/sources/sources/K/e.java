package K;

import J.T;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final d f584a;

    public e(d dVar) {
        this.f584a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f584a.equals(((e) obj).f584a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f584a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        X0.k kVar = (X0.k) ((B2.b) this.f584a).f76b;
        AutoCompleteTextView autoCompleteTextView = kVar.h;
        if (autoCompleteTextView == null || u2.l.w(autoCompleteTextView)) {
            return;
        }
        int i3 = z3 ? 2 : 1;
        WeakHashMap weakHashMap = T.f402a;
        J.B.s(kVar.f1082d, i3);
    }
}
