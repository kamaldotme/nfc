package androidx.activity.result;

import I1.v;
import I1.x;
import a.AbstractC0059a;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0099p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1487a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1488b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1489d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f1490e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1491f = new HashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i3, int i4, Intent intent) {
        b bVar;
        String str = (String) this.f1487a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f1490e.get(str);
        if (eVar == null || (bVar = eVar.f1483a) == null || !this.f1489d.contains(str)) {
            this.f1491f.remove(str);
            this.g.putParcelable(str, new a(intent, i4));
            return true;
        }
        bVar.a(eVar.f1484b.G(intent, i4));
        this.f1489d.remove(str);
        return true;
    }

    public abstract void b(int i3, AbstractC0059a abstractC0059a, x xVar);

    public final c c(final String str, r rVar, final v vVar, final B2.b bVar) {
        t d3 = rVar.d();
        if (d3.c.compareTo(EnumC0096m.f2046e) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + rVar + " is attempting to register while current state is " + d3.c + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap hashMap = this.c;
        f fVar = (f) hashMap.get(str);
        if (fVar == null) {
            fVar = new f(d3);
        }
        InterfaceC0099p interfaceC0099p = new InterfaceC0099p() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.InterfaceC0099p
            public final void b(r rVar2, EnumC0095l enumC0095l) {
                boolean equals = EnumC0095l.ON_START.equals(enumC0095l);
                String str2 = str;
                g gVar = g.this;
                if (!equals) {
                    if (EnumC0095l.ON_STOP.equals(enumC0095l)) {
                        gVar.f1490e.remove(str2);
                        return;
                    } else {
                        if (EnumC0095l.ON_DESTROY.equals(enumC0095l)) {
                            gVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap hashMap2 = gVar.f1490e;
                b bVar2 = bVar;
                AbstractC0059a abstractC0059a = vVar;
                hashMap2.put(str2, new e(bVar2, abstractC0059a));
                HashMap hashMap3 = gVar.f1491f;
                if (hashMap3.containsKey(str2)) {
                    Object obj = hashMap3.get(str2);
                    hashMap3.remove(str2);
                    bVar2.a(obj);
                }
                Bundle bundle = gVar.g;
                a aVar = (a) bundle.getParcelable(str2);
                if (aVar != null) {
                    bundle.remove(str2);
                    bVar2.a(abstractC0059a.G(aVar.c, aVar.f1477b));
                }
            }
        };
        fVar.f1485a.a(interfaceC0099p);
        fVar.f1486b.add(interfaceC0099p);
        hashMap.put(str, fVar);
        return new c(this, str, vVar);
    }

    public final d d(String str, AbstractC0059a abstractC0059a, b bVar) {
        e(str);
        this.f1490e.put(str, new e(bVar, abstractC0059a));
        HashMap hashMap = this.f1491f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.g;
        a aVar = (a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            bVar.a(abstractC0059a.G(aVar.c, aVar.f1477b));
        }
        return new d(this, str, abstractC0059a);
    }

    public final void e(String str) {
        HashMap hashMap = this.f1488b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        Y1.e.f1147b.getClass();
        int nextInt = Y1.e.c.d().nextInt(2147418112);
        while (true) {
            int i3 = nextInt + 65536;
            HashMap hashMap2 = this.f1487a;
            if (!hashMap2.containsKey(Integer.valueOf(i3))) {
                hashMap2.put(Integer.valueOf(i3), str);
                hashMap.put(str, Integer.valueOf(i3));
                return;
            } else {
                Y1.e.f1147b.getClass();
                nextInt = Y1.e.c.d().nextInt(2147418112);
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f1489d.contains(str) && (num = (Integer) this.f1488b.remove(str)) != null) {
            this.f1487a.remove(num);
        }
        this.f1490e.remove(str);
        HashMap hashMap = this.f1491f;
        if (hashMap.containsKey(str)) {
            Objects.toString(hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        f fVar = (f) hashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f1486b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f1485a.f((InterfaceC0099p) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
