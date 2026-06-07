package X1;

import L1.x;
import W1.n;
import W1.o;
import W1.p;
import W1.q;
import W1.r;
import W1.s;
import W1.t;
import W1.u;
import W1.v;
import b2.InterfaceC0107b;
import f0.C0166b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements InterfaceC0107b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1136b;
    public static final LinkedHashMap c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1137a;

    static {
        List R2 = L1.l.R(W1.a.class, W1.l.class, p.class, q.class, C0166b.class, r.class, s.class, t.class, u.class, v.class, W1.b.class, W1.c.class, W1.d.class, W1.e.class, W1.f.class, W1.g.class, W1.h.class, W1.i.class, W1.j.class, W1.k.class, W1.m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(L1.m.S(R2));
        int i3 = 0;
        for (Object obj : R2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new K1.c((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f1136b = x.P(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        g.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            g.b(str);
            sb.append(d2.d.l0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1136b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.O(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), d2.d.l0((String) entry2.getValue()));
        }
        c = linkedHashMap;
    }

    public d(Class cls) {
        g.e(cls, "jClass");
        this.f1137a = cls;
    }

    @Override // X1.c
    public final Class a() {
        return this.f1137a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && g.a(u2.d.n(this), u2.d.n((InterfaceC0107b) obj));
    }

    public final int hashCode() {
        return u2.d.n(this).hashCode();
    }

    public final String toString() {
        return this.f1137a.toString() + " (Kotlin reflection is not available)";
    }
}
