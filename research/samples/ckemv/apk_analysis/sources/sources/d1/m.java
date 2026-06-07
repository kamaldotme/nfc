package d1;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2634b;
    public final /* synthetic */ o c;

    public /* synthetic */ m(o oVar, int i3) {
        this.f2634b = i3;
        this.c = oVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2634b) {
            case 0:
                this.c.clear();
                return;
            default:
                this.c.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        n a3;
        switch (this.f2634b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                o oVar = this.c;
                oVar.getClass();
                Object key = entry.getKey();
                n nVar = null;
                if (key != null) {
                    try {
                        a3 = oVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a3 != null && Objects.equals(a3.h, entry.getValue())) {
                        nVar = a3;
                    }
                    return nVar == null;
                }
                a3 = null;
                if (a3 != null) {
                    nVar = a3;
                }
                if (nVar == null) {
                }
            default:
                return this.c.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2634b) {
            case 0:
                return new l(this.c, 0);
            default:
                return new l(this.c, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        n a3;
        switch (this.f2634b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                o oVar = this.c;
                oVar.getClass();
                Object key = entry.getKey();
                n nVar = null;
                if (key != null) {
                    try {
                        a3 = oVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a3 != null && Objects.equals(a3.h, entry.getValue())) {
                        nVar = a3;
                    }
                    if (nVar != null) {
                        return false;
                    }
                    oVar.c(nVar, true);
                    return true;
                }
                a3 = null;
                if (a3 != null) {
                    nVar = a3;
                }
                if (nVar != null) {
                }
            default:
                o oVar2 = this.c;
                oVar2.getClass();
                n nVar2 = null;
                if (obj != null) {
                    try {
                        nVar2 = oVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (nVar2 != null) {
                    oVar2.c(nVar2, true);
                }
                return nVar2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2634b) {
            case 0:
                return this.c.f2644e;
            default:
                return this.c.f2644e;
        }
    }
}
