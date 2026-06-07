package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class D extends androidx.lifecycle.M {

    /* renamed from: i, reason: collision with root package name */
    public static final U0.e f1837i = new U0.e(22);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1840f;
    public final HashMap c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1838d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1839e = new HashMap();
    public boolean g = false;
    public boolean h = false;

    public D(boolean z3) {
        this.f1840f = z3;
    }

    @Override // androidx.lifecycle.M
    public final void a() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.g = true;
    }

    public final void b(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (this.h || this.c.remove(abstractComponentCallbacksC0077n.f1972f) == null || !Log.isLoggable("FragmentManager", 2)) {
            return;
        }
        abstractComponentCallbacksC0077n.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d3 = (D) obj;
        return this.c.equals(d3.c) && this.f1838d.equals(d3.f1838d) && this.f1839e.equals(d3.f1839e);
    }

    public final int hashCode() {
        return this.f1839e.hashCode() + ((this.f1838d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1838d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1839e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
