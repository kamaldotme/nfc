package r;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final d f4504b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public c f4505d;
    public q.i g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f4503a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f4506e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f4507f = -1;

    public c(d dVar, int i3) {
        this.f4504b = dVar;
        this.c = i3;
    }

    public final void a(c cVar, int i3) {
        b(cVar, i3, -1, false);
    }

    public final boolean b(c cVar, int i3, int i4, boolean z3) {
        if (cVar == null) {
            h();
            return true;
        }
        if (!z3 && !g(cVar)) {
            return false;
        }
        this.f4505d = cVar;
        if (cVar.f4503a == null) {
            cVar.f4503a = new HashSet();
        }
        this.f4505d.f4503a.add(this);
        if (i3 > 0) {
            this.f4506e = i3;
        } else {
            this.f4506e = 0;
        }
        this.f4507f = i4;
        return true;
    }

    public final int c() {
        c cVar;
        if (this.f4504b.f4528V == 8) {
            return 0;
        }
        int i3 = this.f4507f;
        return (i3 <= -1 || (cVar = this.f4505d) == null || cVar.f4504b.f4528V != 8) ? this.f4506e : i3;
    }

    public final c d() {
        int i3 = this.c;
        int a3 = q.h.a(i3);
        d dVar = this.f4504b;
        switch (a3) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f4558z;
            case 2:
                return dVar.f4508A;
            case 3:
                return dVar.f4556x;
            case 4:
                return dVar.f4557y;
            default:
                throw new AssertionError(X.d.t(i3));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f4503a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f4505d != null;
    }

    public final boolean g(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i3 = this.c;
        d dVar = cVar.f4504b;
        int i4 = cVar.c;
        if (i4 == i3) {
            return i3 != 6 || (dVar.f4555w && this.f4504b.f4555w);
        }
        switch (q.h.a(i3)) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z3 = i4 == 2 || i4 == 4;
                if (dVar instanceof h) {
                    return z3 || i4 == 8;
                }
                return z3;
            case 2:
            case 4:
                boolean z4 = i4 == 3 || i4 == 5;
                if (dVar instanceof h) {
                    return z4 || i4 == 9;
                }
                return z4;
            case 6:
                return (i4 == 6 || i4 == 8 || i4 == 9) ? false : true;
            default:
                throw new AssertionError(X.d.t(i3));
        }
    }

    public final void h() {
        HashSet hashSet;
        c cVar = this.f4505d;
        if (cVar != null && (hashSet = cVar.f4503a) != null) {
            hashSet.remove(this);
        }
        this.f4505d = null;
        this.f4506e = 0;
        this.f4507f = -1;
    }

    public final void i() {
        q.i iVar = this.g;
        if (iVar == null) {
            this.g = new q.i(1);
        } else {
            iVar.c();
        }
    }

    public final String toString() {
        return this.f4504b.f4529W + ":" + X.d.t(this.c);
    }
}
