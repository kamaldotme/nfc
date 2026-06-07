package h0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import v0.f;
import xyz.happify.ckemv.R;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0179a f3082d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f3083e = new Object();
    public final Context c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3085b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3084a = new HashMap();

    public C0179a(Context context) {
        this.c = context.getApplicationContext();
    }

    public static C0179a c(Context context) {
        if (f3082d == null) {
            synchronized (f3083e) {
                try {
                    if (f3082d == null) {
                        f3082d = new C0179a(context);
                    }
                } finally {
                }
            }
        }
        return f3082d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f3085b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0180b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (f.z()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f3084a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0180b interfaceC0180b = (InterfaceC0180b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a3 = interfaceC0180b.a();
                if (!a3.isEmpty()) {
                    for (Class cls2 : a3) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0180b.b(this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new RuntimeException(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
