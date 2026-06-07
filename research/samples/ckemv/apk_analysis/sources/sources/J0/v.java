package j0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final View f3453b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3452a = new HashMap();
    public final ArrayList c = new ArrayList();

    public v(View view) {
        this.f3453b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f3453b == vVar.f3453b && this.f3452a.equals(vVar.f3452a);
    }

    public final int hashCode() {
        return this.f3452a.hashCode() + (this.f3453b.hashCode() * 31);
    }

    public final String toString() {
        String h = X.d.h(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3453b + "\n", "    values:");
        HashMap hashMap = this.f3452a;
        for (String str : hashMap.keySet()) {
            h = h + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return h;
    }
}
