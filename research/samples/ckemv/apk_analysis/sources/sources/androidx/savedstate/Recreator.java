package androidx.savedstate;

import X1.g;
import android.os.Bundle;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.InterfaceC0099p;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import d0.InterfaceC0113b;
import d0.d;
import d0.e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0099p {

    /* renamed from: b, reason: collision with root package name */
    public final e f2181b;

    public Recreator(e eVar) {
        g.e(eVar, "owner");
        this.f2181b = eVar;
    }

    @Override // androidx.lifecycle.InterfaceC0099p
    public final void b(r rVar, EnumC0095l enumC0095l) {
        Object obj;
        boolean z3;
        if (enumC0095l != EnumC0095l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.d().f(this);
        Bundle c = this.f2181b.b().c("androidx.savedstate.Restarter");
        if (c == null) {
            return;
        }
        ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0113b.class);
                g.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        g.d(newInstance, "{\n                constr…wInstance()\n            }");
                        e eVar = this.f2181b;
                        g.e(eVar, "owner");
                        if (!(eVar instanceof P)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                        }
                        O c3 = ((P) eVar).c();
                        d b3 = eVar.b();
                        c3.getClass();
                        Iterator it = new HashSet(c3.f2032a.keySet()).iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            g.e(str2, "key");
                            M m3 = (M) c3.f2032a.get(str2);
                            g.b(m3);
                            t d3 = eVar.d();
                            g.e(b3, "registry");
                            g.e(d3, "lifecycle");
                            HashMap hashMap = m3.f2028a;
                            if (hashMap == null) {
                                obj = null;
                            } else {
                                synchronized (hashMap) {
                                    obj = m3.f2028a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z3 = savedStateHandleController.f2035b)) {
                                if (!(!z3)) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner".toString());
                                }
                                savedStateHandleController.f2035b = true;
                                d3.a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(c3.f2032a.keySet()).isEmpty()) {
                            b3.f();
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException("Failed to instantiate " + str, e3);
                    }
                } catch (NoSuchMethodException e4) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(X.d.i("Class ", str, " wasn't found"), e5);
            }
        }
    }
}
