package n0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m0.A;
import m0.x;

/* loaded from: classes.dex */
public final class n extends u2.l {

    /* renamed from: e, reason: collision with root package name */
    public final s f4195e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4196f;
    public final int g;
    public final List h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4197i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4198j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f4199k;

    /* renamed from: l, reason: collision with root package name */
    public v0.l f4200l;

    static {
        m0.r.b("WorkContinuationImpl");
    }

    public n(s sVar, String str, int i3, List list) {
        this.f4195e = sVar;
        this.f4196f = str;
        this.g = i3;
        this.h = list;
        this.f4197i = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i3 == 1 && ((A) list.get(i4)).f3952b.f5108u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String uuid = ((A) list.get(i4)).f3951a.toString();
            X1.g.d(uuid, "id.toString()");
            this.f4197i.add(uuid);
            this.f4198j.add(uuid);
        }
    }

    public static boolean R(n nVar, HashSet hashSet) {
        hashSet.addAll(nVar.f4197i);
        HashSet S2 = S(nVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (S2.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(nVar.f4197i);
        return false;
    }

    public static HashSet S(n nVar) {
        HashSet hashSet = new HashSet();
        nVar.getClass();
        return hashSet;
    }

    public final x Q() {
        if (this.f4199k) {
            m0.r a3 = m0.r.a();
            TextUtils.join(", ", this.f4197i);
            a3.getClass();
        } else {
            v0.l lVar = new v0.l(5);
            this.f4195e.g.f(new w0.e(this, lVar));
            this.f4200l = lVar;
        }
        return this.f4200l;
    }
}
