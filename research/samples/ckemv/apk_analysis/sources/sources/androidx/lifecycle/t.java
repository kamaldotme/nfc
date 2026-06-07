package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l.C0324a;
import m.C0327a;
import m.C0328b;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2051a;

    /* renamed from: b, reason: collision with root package name */
    public C0327a f2052b;
    public EnumC0096m c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2053d;

    /* renamed from: e, reason: collision with root package name */
    public int f2054e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2055f;
    public boolean g;
    public final ArrayList h;

    public t(r rVar) {
        X1.g.e(rVar, "provider");
        new AtomicReference();
        this.f2051a = true;
        this.f2052b = new C0327a();
        this.c = EnumC0096m.c;
        this.h = new ArrayList();
        this.f2053d = new WeakReference(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.lifecycle.s, java.lang.Object] */
    public final void a(q qVar) {
        InterfaceC0099p reflectiveGenericLifecycleObserver;
        r rVar;
        ArrayList arrayList = this.h;
        X1.g.e(qVar, "observer");
        c("addObserver");
        EnumC0096m enumC0096m = this.c;
        EnumC0096m enumC0096m2 = EnumC0096m.f2044b;
        if (enumC0096m != enumC0096m2) {
            enumC0096m2 = EnumC0096m.c;
        }
        ?? obj = new Object();
        HashMap hashMap = v.f2057a;
        boolean z3 = qVar instanceof InterfaceC0099p;
        boolean z4 = qVar instanceof InterfaceC0087d;
        if (z3 && z4) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0087d) qVar, (InterfaceC0099p) qVar);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0087d) qVar, null);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = (InterfaceC0099p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (v.b(cls) == 2) {
                Object obj2 = v.f2058b.get(cls);
                X1.g.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    v.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0090g[] interfaceC0090gArr = new InterfaceC0090g[size];
                if (size > 0) {
                    v.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0090gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        obj.f2050b = reflectiveGenericLifecycleObserver;
        obj.f2049a = enumC0096m2;
        if (((s) this.f2052b.c(qVar, obj)) == null && (rVar = (r) this.f2053d.get()) != null) {
            boolean z5 = this.f2054e != 0 || this.f2055f;
            EnumC0096m b3 = b(qVar);
            this.f2054e++;
            while (obj.f2049a.compareTo(b3) < 0 && this.f2052b.f3940f.containsKey(qVar)) {
                arrayList.add(obj.f2049a);
                C0093j c0093j = EnumC0095l.Companion;
                EnumC0096m enumC0096m3 = obj.f2049a;
                c0093j.getClass();
                EnumC0095l a3 = C0093j.a(enumC0096m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + obj.f2049a);
                }
                obj.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b3 = b(qVar);
            }
            if (!z5) {
                h();
            }
            this.f2054e--;
        }
    }

    public final EnumC0096m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f2052b.f3940f;
        m.c cVar = hashMap.containsKey(qVar) ? ((m.c) hashMap.get(qVar)).f3945d : null;
        EnumC0096m enumC0096m = (cVar == null || (sVar = (s) cVar.f3944b) == null) ? null : sVar.f2049a;
        ArrayList arrayList = this.h;
        EnumC0096m enumC0096m2 = arrayList.isEmpty() ^ true ? (EnumC0096m) arrayList.get(arrayList.size() - 1) : null;
        EnumC0096m enumC0096m3 = this.c;
        X1.g.e(enumC0096m3, "state1");
        if (enumC0096m == null || enumC0096m.compareTo(enumC0096m3) >= 0) {
            enumC0096m = enumC0096m3;
        }
        return (enumC0096m2 == null || enumC0096m2.compareTo(enumC0096m) >= 0) ? enumC0096m : enumC0096m2;
    }

    public final void c(String str) {
        if (this.f2051a) {
            C0324a.O().f3891b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(X.d.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0095l enumC0095l) {
        X1.g.e(enumC0095l, "event");
        c("handleLifecycleEvent");
        e(enumC0095l.a());
    }

    public final void e(EnumC0096m enumC0096m) {
        EnumC0096m enumC0096m2 = this.c;
        if (enumC0096m2 == enumC0096m) {
            return;
        }
        EnumC0096m enumC0096m3 = EnumC0096m.c;
        EnumC0096m enumC0096m4 = EnumC0096m.f2044b;
        if (enumC0096m2 == enumC0096m3 && enumC0096m == enumC0096m4) {
            throw new IllegalStateException(("no event down from " + this.c + " in component " + this.f2053d.get()).toString());
        }
        this.c = enumC0096m;
        if (this.f2055f || this.f2054e != 0) {
            this.g = true;
            return;
        }
        this.f2055f = true;
        h();
        this.f2055f = false;
        if (this.c == enumC0096m4) {
            this.f2052b = new C0327a();
        }
    }

    public final void f(q qVar) {
        X1.g.e(qVar, "observer");
        c("removeObserver");
        this.f2052b.b(qVar);
    }

    public final void g() {
        EnumC0096m enumC0096m = EnumC0096m.f2045d;
        c("setCurrentState");
        e(enumC0096m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        r rVar = (r) this.f2053d.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0327a c0327a = this.f2052b;
            if (c0327a.f3950e != 0) {
                m.c cVar = c0327a.f3948b;
                X1.g.b(cVar);
                EnumC0096m enumC0096m = ((s) cVar.f3944b).f2049a;
                m.c cVar2 = this.f2052b.c;
                X1.g.b(cVar2);
                EnumC0096m enumC0096m2 = ((s) cVar2.f3944b).f2049a;
                if (enumC0096m == enumC0096m2 && this.c == enumC0096m2) {
                    break;
                }
                this.g = false;
                EnumC0096m enumC0096m3 = this.c;
                m.c cVar3 = this.f2052b.f3948b;
                X1.g.b(cVar3);
                if (enumC0096m3.compareTo(((s) cVar3.f3944b).f2049a) < 0) {
                    C0327a c0327a2 = this.f2052b;
                    C0328b c0328b = new C0328b(c0327a2.c, c0327a2.f3948b, 1);
                    c0327a2.f3949d.put(c0328b, Boolean.FALSE);
                    while (c0328b.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) c0328b.next();
                        X1.g.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f2049a.compareTo(this.c) > 0 && !this.g && this.f2052b.f3940f.containsKey(qVar)) {
                            C0093j c0093j = EnumC0095l.Companion;
                            EnumC0096m enumC0096m4 = sVar.f2049a;
                            c0093j.getClass();
                            X1.g.e(enumC0096m4, "state");
                            int ordinal = enumC0096m4.ordinal();
                            EnumC0095l enumC0095l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0095l.ON_PAUSE : EnumC0095l.ON_STOP : EnumC0095l.ON_DESTROY;
                            if (enumC0095l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f2049a);
                            }
                            this.h.add(enumC0095l.a());
                            sVar.a(rVar, enumC0095l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                m.c cVar4 = this.f2052b.c;
                if (!this.g && cVar4 != null && this.c.compareTo(((s) cVar4.f3944b).f2049a) > 0) {
                    C0327a c0327a3 = this.f2052b;
                    c0327a3.getClass();
                    m.d dVar = new m.d(c0327a3);
                    c0327a3.f3949d.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f2049a.compareTo(this.c) < 0 && !this.g && this.f2052b.f3940f.containsKey(qVar2)) {
                            this.h.add(sVar2.f2049a);
                            C0093j c0093j2 = EnumC0095l.Companion;
                            EnumC0096m enumC0096m5 = sVar2.f2049a;
                            c0093j2.getClass();
                            EnumC0095l a3 = C0093j.a(enumC0096m5);
                            if (a3 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f2049a);
                            }
                            sVar2.a(rVar, a3);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
