package x1;

import j1.AbstractC0241k;
import j1.C0238h;
import j1.C0242l;
import j1.EnumC0231a;
import j1.EnumC0233c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p1.C0356a;
import y1.C0450e;

/* renamed from: x1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439g extends AbstractC0440h {
    public static final AbstractC0440h[] c = new AbstractC0440h[0];

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0443k[] f5234d = new AbstractC0443k[0];

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5235a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0440h[] f5236b;

    public C0439g(Map map, int i3) {
        this.f5235a = i3;
        switch (i3) {
            case 1:
                Collection collection = map == null ? null : (Collection) map.get(EnumC0233c.f3475d);
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(EnumC0231a.f3463i)) {
                        arrayList.add(new C0437e(0));
                    } else if (collection.contains(EnumC0231a.f3470p)) {
                        arrayList.add(new C0437e(3));
                    }
                    if (collection.contains(EnumC0231a.h)) {
                        arrayList.add(new C0437e(2));
                    }
                    if (collection.contains(EnumC0231a.f3471q)) {
                        arrayList.add(new C0437e(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new C0437e(0));
                    arrayList.add(new C0437e(2));
                    arrayList.add(new C0437e(1));
                }
                this.f5236b = (AbstractC0443k[]) arrayList.toArray(f5234d);
                return;
            default:
                Collection collection2 = map == null ? null : (Collection) map.get(EnumC0233c.f3475d);
                boolean z3 = (map == null || map.get(EnumC0233c.h) == null) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(EnumC0231a.f3463i) || collection2.contains(EnumC0231a.f3470p) || collection2.contains(EnumC0231a.h) || collection2.contains(EnumC0231a.f3471q)) {
                        arrayList2.add(new C0439g(map, 1));
                    }
                    if (collection2.contains(EnumC0231a.f3460d)) {
                        arrayList2.add(new C0435c(z3));
                    }
                    if (collection2.contains(EnumC0231a.f3461e)) {
                        arrayList2.add(new C0436d());
                    }
                    if (collection2.contains(EnumC0231a.f3462f)) {
                        arrayList2.add(new Object());
                    }
                    if (collection2.contains(EnumC0231a.f3464j)) {
                        arrayList2.add(new C0438f());
                    }
                    if (collection2.contains(EnumC0231a.c)) {
                        arrayList2.add(new C0433a());
                    }
                    if (collection2.contains(EnumC0231a.f3468n)) {
                        arrayList2.add(new C0450e());
                    }
                    if (collection2.contains(EnumC0231a.f3469o)) {
                        arrayList2.add(new z1.c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new C0439g(map, 1));
                    arrayList2.add(new C0435c(false));
                    arrayList2.add(new C0433a());
                    arrayList2.add(new C0436d());
                    arrayList2.add(new Object());
                    arrayList2.add(new C0438f());
                    arrayList2.add(new C0450e());
                    arrayList2.add(new z1.c());
                }
                this.f5236b = (AbstractC0440h[]) arrayList2.toArray(c);
                return;
        }
    }

    @Override // x1.AbstractC0440h, j1.InterfaceC0240j
    public final void c() {
        switch (this.f5235a) {
            case 0:
                for (AbstractC0440h abstractC0440h : this.f5236b) {
                    abstractC0440h.c();
                }
                return;
            default:
                for (AbstractC0443k abstractC0443k : (AbstractC0443k[]) this.f5236b) {
                    abstractC0443k.getClass();
                }
                return;
        }
    }

    @Override // x1.AbstractC0440h
    public final C0242l d(int i3, C0356a c0356a, Map map) {
        boolean z3;
        switch (this.f5235a) {
            case 0:
                for (AbstractC0440h abstractC0440h : this.f5236b) {
                    try {
                        return abstractC0440h.d(i3, c0356a, map);
                    } catch (AbstractC0241k unused) {
                    }
                }
                throw C0238h.f3489d;
            default:
                int[] o3 = AbstractC0443k.o(c0356a);
                for (AbstractC0443k abstractC0443k : (AbstractC0443k[]) this.f5236b) {
                    try {
                        C0242l m3 = abstractC0443k.m(i3, c0356a, o3, map);
                        EnumC0231a enumC0231a = m3.f3495d;
                        EnumC0231a enumC0231a2 = EnumC0231a.f3463i;
                        String str = m3.f3493a;
                        boolean z4 = enumC0231a == enumC0231a2 && str.charAt(0) == '0';
                        Collection collection = map == null ? null : (Collection) map.get(EnumC0233c.f3475d);
                        EnumC0231a enumC0231a3 = EnumC0231a.f3470p;
                        if (collection != null && !collection.contains(enumC0231a3)) {
                            z3 = false;
                            if (!z4 && z3) {
                                C0242l c0242l = new C0242l(str.substring(1), m3.f3494b, m3.c, enumC0231a3);
                                c0242l.a(m3.f3496e);
                                return c0242l;
                            }
                        }
                        z3 = true;
                        return !z4 ? m3 : m3;
                    } catch (AbstractC0241k unused2) {
                    }
                }
                throw C0238h.f3489d;
        }
    }
}
