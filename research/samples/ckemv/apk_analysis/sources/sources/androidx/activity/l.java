package androidx.activity;

import X1.g;
import android.os.Bundle;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0099p;
import androidx.lifecycle.r;
import androidx.savedstate.Recreator;
import com.google.gson.reflect.TypeToken;
import d0.InterfaceC0114c;
import g1.AbstractC0178c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import m0.z;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1462a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1463b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1464d;

    public l(d0.e eVar) {
        this.f1462a = 1;
        this.c = eVar;
        this.f1464d = new d0.d();
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1.p b(TypeToken typeToken) {
        String str;
        d1.p fVar;
        int i3 = 28;
        int i4 = 29;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = (Map) this.c;
        X.d.q(map.get(type));
        X.d.q(map.get(rawType));
        d1.p pVar = null;
        d1.g gVar = EnumSet.class.isAssignableFrom(rawType) ? new d1.g(type, 0) : rawType == EnumMap.class ? new d1.g(type, 1) : null;
        if (gVar != null) {
            return gVar;
        }
        d1.d.e((List) this.f1464d);
        if (!Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                z zVar = AbstractC0178c.f3037a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e3) {
                    str = "Failed making constructor '" + AbstractC0178c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e3.getMessage();
                }
                fVar = str != null ? new d1.f(str, 2) : new A.h(i4, declaredConstructor);
            } catch (NoSuchMethodException unused) {
            }
            if (fVar == null) {
                return fVar;
            }
            if (Collection.class.isAssignableFrom(rawType)) {
                pVar = SortedSet.class.isAssignableFrom(rawType) ? new U0.e(24) : Set.class.isAssignableFrom(rawType) ? new U0.e(25) : Queue.class.isAssignableFrom(rawType) ? new U0.e(26) : new U0.e(27);
            } else if (Map.class.isAssignableFrom(rawType)) {
                pVar = ConcurrentNavigableMap.class.isAssignableFrom(rawType) ? new U0.e(28) : ConcurrentMap.class.isAssignableFrom(rawType) ? new U0.e(29) : SortedMap.class.isAssignableFrom(rawType) ? new d1.e(i7) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new d1.e(i5) : new d1.e(i6);
            }
            if (pVar != null) {
                return pVar;
            }
            String a3 = a(rawType);
            if (a3 != null) {
                return new d1.f(a3, 1);
            }
            if (this.f1463b) {
                return new A.h(i3, rawType);
            }
            return new d1.f("Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", 0);
        }
        fVar = null;
        if (fVar == null) {
        }
    }

    public void c() {
        d0.e eVar = (d0.e) this.c;
        androidx.lifecycle.t d3 = eVar.d();
        if (d3.c != EnumC0096m.c) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        d3.a(new Recreator(eVar));
        final d0.d dVar = (d0.d) this.f1464d;
        dVar.getClass();
        if (!(!dVar.f2608a)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        d3.a(new InterfaceC0099p() { // from class: d0.a
            @Override // androidx.lifecycle.InterfaceC0099p
            public final void b(r rVar, EnumC0095l enumC0095l) {
                d dVar2 = d.this;
                g.e(dVar2, "this$0");
                if (enumC0095l == EnumC0095l.ON_START) {
                    dVar2.c = true;
                } else if (enumC0095l == EnumC0095l.ON_STOP) {
                    dVar2.c = false;
                }
            }
        });
        dVar.f2608a = true;
        this.f1463b = true;
    }

    public void d(Bundle bundle) {
        if (!this.f1463b) {
            c();
        }
        androidx.lifecycle.t d3 = ((d0.e) this.c).d();
        if (!(!(d3.c.compareTo(EnumC0096m.f2046e) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d3.c).toString());
        }
        d0.d dVar = (d0.d) this.f1464d;
        if (!dVar.f2608a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!dVar.f2609b)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        dVar.f2611e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2609b = true;
    }

    public void e(Bundle bundle) {
        X1.g.e(bundle, "outBundle");
        d0.d dVar = (d0.d) this.f1464d;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2611e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.f fVar = (m.f) dVar.f2610d;
        fVar.getClass();
        m.d dVar2 = new m.d(fVar);
        fVar.f3949d.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0114c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public String toString() {
        switch (this.f1462a) {
            case 2:
                return ((Map) this.c).toString();
            default:
                return super.toString();
        }
    }

    public l(j jVar, d dVar) {
        this.f1462a = 0;
        this.c = new Object();
        this.f1464d = new ArrayList();
    }

    public l(Map map, List list) {
        this.f1462a = 2;
        this.c = map;
        this.f1463b = true;
        this.f1464d = list;
    }
}
