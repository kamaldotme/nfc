package b1;

import com.google.gson.reflect.TypeToken;
import h1.AbstractC0182b;
import i1.C0186a;
import i1.C0187b;
import i1.C0188c;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import xyz.happify.ckemv.MeResponse;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f2224a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2225b;
    public final androidx.activity.l c;

    /* renamed from: d, reason: collision with root package name */
    public final e1.c f2226d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2227e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2228f;

    public l() {
        d1.i iVar = d1.i.f2626d;
        Map emptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.f2224a = new ThreadLocal();
        this.f2225b = new ConcurrentHashMap();
        androidx.activity.l lVar = new androidx.activity.l(emptyMap, emptyList2);
        this.c = lVar;
        this.f2228f = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(e1.u.f2741A);
        arrayList.add(e1.k.c);
        arrayList.add(iVar);
        arrayList.addAll(emptyList);
        arrayList.add(e1.u.f2755p);
        arrayList.add(e1.u.g);
        arrayList.add(e1.u.f2745d);
        arrayList.add(e1.u.f2746e);
        arrayList.add(e1.u.f2747f);
        i iVar2 = e1.u.f2750k;
        arrayList.add(new e1.s(Long.TYPE, Long.class, iVar2));
        arrayList.add(new e1.s(Double.TYPE, Double.class, new i(0)));
        arrayList.add(new e1.s(Float.TYPE, Float.class, new i(1)));
        arrayList.add(e1.j.f2709b);
        arrayList.add(e1.u.h);
        arrayList.add(e1.u.f2748i);
        arrayList.add(new e1.r(AtomicLong.class, new j(new j(iVar2, 0), 2), 0));
        arrayList.add(new e1.r(AtomicLongArray.class, new j(new j(iVar2, 1), 2), 0));
        arrayList.add(e1.u.f2749j);
        arrayList.add(e1.u.f2751l);
        arrayList.add(e1.u.f2756q);
        arrayList.add(e1.u.f2757r);
        arrayList.add(new e1.r(BigDecimal.class, e1.u.f2752m, 0));
        arrayList.add(new e1.r(BigInteger.class, e1.u.f2753n, 0));
        arrayList.add(new e1.r(d1.k.class, e1.u.f2754o, 0));
        arrayList.add(e1.u.f2758s);
        arrayList.add(e1.u.f2759t);
        arrayList.add(e1.u.f2761v);
        arrayList.add(e1.u.f2762w);
        arrayList.add(e1.u.f2764y);
        arrayList.add(e1.u.f2760u);
        arrayList.add(e1.u.f2744b);
        arrayList.add(e1.d.f2697b);
        arrayList.add(e1.u.f2763x);
        if (AbstractC0182b.f3090a) {
            arrayList.add(AbstractC0182b.c);
            arrayList.add(AbstractC0182b.f3091b);
            arrayList.add(AbstractC0182b.f3092d);
        }
        arrayList.add(e1.b.f2693d);
        arrayList.add(e1.u.f2743a);
        arrayList.add(new e1.c(lVar, 0));
        arrayList.add(new e1.h(lVar));
        e1.c cVar = new e1.c(lVar, 1);
        this.f2226d = cVar;
        arrayList.add(cVar);
        arrayList.add(e1.u.f2742B);
        arrayList.add(new e1.p(lVar, iVar, cVar, emptyList2));
        this.f2227e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            throw new IllegalArgumentException(d3 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str) {
        Class cls = MeResponse.class;
        Object c = c(str, TypeToken.get(cls));
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, TypeToken typeToken) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        C0186a c0186a = new C0186a(new StringReader(str));
        boolean z3 = true;
        c0186a.c = true;
        try {
            try {
                try {
                    try {
                        try {
                            c0186a.W();
                        } finally {
                            c0186a.c = false;
                        }
                    } catch (EOFException e3) {
                        e = e3;
                    }
                    try {
                        obj = d(typeToken).a(c0186a);
                    } catch (EOFException e4) {
                        e = e4;
                        z3 = false;
                        if (!z3) {
                            throw new RuntimeException(e);
                        }
                        if (obj != null) {
                        }
                        return obj;
                    }
                    if (obj != null) {
                        try {
                            if (c0186a.W() != 10) {
                                throw new RuntimeException("JSON document was not fully consumed.");
                            }
                        } catch (C0188c e5) {
                            throw new RuntimeException(e5);
                        } catch (IOException e6) {
                            throw new RuntimeException(e6);
                        }
                    }
                    return obj;
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (IllegalStateException e8) {
                throw new RuntimeException(e8);
            }
        } catch (AssertionError e9) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e9.getMessage(), e9);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [b1.k, java.lang.Object] */
    public final x d(TypeToken typeToken) {
        boolean z3;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f2225b;
        x xVar = (x) concurrentHashMap.get(typeToken);
        if (xVar != null) {
            return xVar;
        }
        ThreadLocal threadLocal = this.f2224a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            x xVar2 = (x) map.get(typeToken);
            if (xVar2 != null) {
                return xVar2;
            }
            z3 = false;
        }
        try {
            ?? obj = new Object();
            x xVar3 = null;
            obj.f2223a = null;
            map.put(typeToken, obj);
            Iterator it = this.f2227e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xVar3 = ((y) it.next()).a(this, typeToken);
                if (xVar3 != null) {
                    if (obj.f2223a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    obj.f2223a = xVar3;
                    map.put(typeToken, xVar3);
                }
            }
            if (z3) {
                threadLocal.remove();
            }
            if (xVar3 != null) {
                if (z3) {
                    concurrentHashMap.putAll(map);
                }
                return xVar3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z3) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final C0187b e(Writer writer) {
        C0187b c0187b = new C0187b(writer);
        c0187b.g = this.f2228f;
        c0187b.f3197f = false;
        c0187b.f3198i = false;
        return c0187b;
    }

    public final String f(Map map) {
        if (map == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
        Class cls = map.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(map, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final void g(C0187b c0187b) {
        p pVar = p.f2230b;
        boolean z3 = c0187b.f3197f;
        c0187b.f3197f = true;
        boolean z4 = c0187b.g;
        c0187b.g = this.f2228f;
        boolean z5 = c0187b.f3198i;
        c0187b.f3198i = false;
        try {
            try {
                e1.r rVar = e1.u.f2743a;
                i.d(c0187b, pVar);
                c0187b.f3197f = z3;
                c0187b.g = z4;
                c0187b.f3198i = z5;
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
            }
        } catch (Throwable th) {
            c0187b.f3197f = z3;
            c0187b.g = z4;
            c0187b.f3198i = z5;
            throw th;
        }
    }

    public final void h(Map map, Class cls, C0187b c0187b) {
        x d3 = d(TypeToken.get((Type) cls));
        boolean z3 = c0187b.f3197f;
        c0187b.f3197f = true;
        boolean z4 = c0187b.g;
        c0187b.g = this.f2228f;
        boolean z5 = c0187b.f3198i;
        c0187b.f3198i = false;
        try {
            try {
                try {
                    d3.b(c0187b, map);
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
            }
        } finally {
            c0187b.f3197f = z3;
            c0187b.g = z4;
            c0187b.f3198i = z5;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f2227e + ",instanceCreators:" + this.c + "}";
    }
}
