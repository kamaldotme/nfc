package j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import s1.C0382a;
import x1.C0439g;

/* renamed from: j1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237g implements InterfaceC0240j {
    public static final InterfaceC0240j[] c = new InterfaceC0240j[0];

    /* renamed from: a, reason: collision with root package name */
    public Map f3487a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0240j[] f3488b;

    @Override // j1.InterfaceC0240j
    public final C0242l a(v0.e eVar, Map map) {
        e(map);
        return d(eVar);
    }

    @Override // j1.InterfaceC0240j
    public final C0242l b(v0.e eVar) {
        e(null);
        return d(eVar);
    }

    @Override // j1.InterfaceC0240j
    public final void c() {
        InterfaceC0240j[] interfaceC0240jArr = this.f3488b;
        if (interfaceC0240jArr != null) {
            for (InterfaceC0240j interfaceC0240j : interfaceC0240jArr) {
                interfaceC0240j.c();
            }
        }
    }

    public final C0242l d(v0.e eVar) {
        InterfaceC0240j[] interfaceC0240jArr = this.f3488b;
        if (interfaceC0240jArr != null) {
            for (InterfaceC0240j interfaceC0240j : interfaceC0240jArr) {
                try {
                    return interfaceC0240j.a(eVar, this.f3487a);
                } catch (AbstractC0241k unused) {
                }
            }
        }
        throw C0238h.f3489d;
    }

    public final void e(Map map) {
        this.f3487a = map;
        boolean z3 = map != null && map.containsKey(EnumC0233c.f3476e);
        Collection collection = map == null ? null : (Collection) map.get(EnumC0233c.f3475d);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z4 = collection.contains(EnumC0231a.f3470p) || collection.contains(EnumC0231a.f3471q) || collection.contains(EnumC0231a.f3463i) || collection.contains(EnumC0231a.h) || collection.contains(EnumC0231a.c) || collection.contains(EnumC0231a.f3460d) || collection.contains(EnumC0231a.f3461e) || collection.contains(EnumC0231a.f3462f) || collection.contains(EnumC0231a.f3464j) || collection.contains(EnumC0231a.f3468n) || collection.contains(EnumC0231a.f3469o);
            if (z4 && !z3) {
                arrayList.add(new C0439g(map, 0));
            }
            if (collection.contains(EnumC0231a.f3467m)) {
                arrayList.add(new F1.a());
            }
            if (collection.contains(EnumC0231a.g)) {
                arrayList.add(new C0382a());
            }
            if (collection.contains(EnumC0231a.f3459b)) {
                arrayList.add(new Object());
            }
            if (collection.contains(EnumC0231a.f3466l)) {
                arrayList.add(new Object());
            }
            if (collection.contains(EnumC0231a.f3465k)) {
                arrayList.add(new v1.a());
            }
            if (z4 && z3) {
                arrayList.add(new C0439g(map, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z3) {
                arrayList.add(new C0439g(map, 0));
            }
            arrayList.add(new F1.a());
            arrayList.add(new C0382a());
            arrayList.add(new Object());
            arrayList.add(new Object());
            arrayList.add(new v1.a());
            if (z3) {
                arrayList.add(new C0439g(map, 0));
            }
        }
        this.f3488b = (InterfaceC0240j[]) arrayList.toArray(c);
    }
}
