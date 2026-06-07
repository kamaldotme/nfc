package e1;

import b1.C0103a;
import b1.x;
import b1.y;
import c1.InterfaceC0110a;
import c1.InterfaceC0111b;
import com.google.gson.reflect.TypeToken;
import g1.AbstractC0178c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements y {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.activity.l f2728b;
    public final b1.h c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.i f2729d;

    /* renamed from: e, reason: collision with root package name */
    public final c f2730e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2731f;

    public p(androidx.activity.l lVar, d1.i iVar, c cVar, List list) {
        C0103a c0103a = b1.h.f2219b;
        this.f2728b = lVar;
        this.c = c0103a;
        this.f2729d = iVar;
        this.f2730e = cVar;
        this.f2731f = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!d1.s.f2648a.a(obj, accessibleObject)) {
            throw new RuntimeException(X.d.h(AbstractC0178c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // b1.y
    public final x a(b1.l lVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        d1.d.e(this.f2731f);
        return AbstractC0178c.f3037a.Q(rawType) ? new o(rawType, c(lVar, typeToken, rawType, true)) : new n(this.f2728b.b(typeToken), c(lVar, typeToken, rawType, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap c(b1.l lVar, TypeToken typeToken, Class cls, boolean z3) {
        boolean z4;
        Method method;
        InterfaceC0111b interfaceC0111b;
        ArrayList arrayList;
        ?? singletonList;
        int size;
        ?? r3;
        l lVar2;
        int i3;
        boolean z5;
        int i4;
        Field[] fieldArr;
        Class cls2;
        x xVar;
        p pVar = this;
        b1.l lVar3 = lVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        TypeToken typeToken2 = typeToken;
        Class cls3 = cls;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            if (cls3 != cls && declaredFields.length > 0) {
                d1.d.e(pVar.f2731f);
            }
            int length = declaredFields.length;
            boolean z6 = false;
            int i5 = 0;
            while (i5 < length) {
                Field field = declaredFields[i5];
                boolean d3 = pVar.d(field, true);
                boolean d4 = pVar.d(field, z6);
                if (d3 || d4) {
                    if (!z3) {
                        z4 = d4;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        z4 = z6;
                    } else {
                        Method y3 = AbstractC0178c.f3037a.y(cls3, field);
                        AbstractC0178c.e(y3);
                        if (y3.getAnnotation(InterfaceC0111b.class) != null && field.getAnnotation(InterfaceC0111b.class) == null) {
                            throw new RuntimeException(X.d.i("@SerializedName on ", AbstractC0178c.d(y3, z6), " is not supported"));
                        }
                        z4 = d4;
                        method = y3;
                        if (method == null) {
                            AbstractC0178c.e(field);
                        }
                        Type h = d1.d.h(typeToken2.getType(), cls3, field.getGenericType(), new HashMap());
                        interfaceC0111b = (InterfaceC0111b) field.getAnnotation(InterfaceC0111b.class);
                        if (interfaceC0111b != null) {
                            singletonList = Collections.singletonList(pVar.c.b(field));
                        } else {
                            String value = interfaceC0111b.value();
                            String[] alternate = interfaceC0111b.alternate();
                            if (alternate.length == 0) {
                                singletonList = Collections.singletonList(value);
                            } else {
                                ArrayList arrayList2 = new ArrayList(alternate.length + 1);
                                arrayList2.add(value);
                                Collections.addAll(arrayList2, alternate);
                                arrayList = arrayList2;
                                size = arrayList.size();
                                r3 = z6;
                                l lVar4 = null;
                                ?? r5 = arrayList;
                                while (r3 < size) {
                                    String str = (String) r5.get(r3);
                                    boolean z7 = r3 != 0 ? z6 : d3;
                                    TypeToken<?> typeToken3 = TypeToken.get(h);
                                    Class<? super Object> rawType = typeToken3.getRawType();
                                    l lVar5 = lVar4;
                                    boolean z8 = (rawType instanceof Class) && rawType.isPrimitive();
                                    int modifiers = field.getModifiers();
                                    boolean z9 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                                    InterfaceC0110a interfaceC0110a = (InterfaceC0110a) field.getAnnotation(InterfaceC0110a.class);
                                    if (interfaceC0110a != null) {
                                        pVar.f2730e.getClass();
                                        xVar = c.b(pVar.f2728b, lVar3, typeToken3, interfaceC0110a);
                                    } else {
                                        xVar = null;
                                    }
                                    boolean z10 = xVar != null;
                                    if (xVar == null) {
                                        xVar = lVar3.d(typeToken3);
                                    }
                                    int i6 = r3;
                                    int i7 = size;
                                    Object obj = r5;
                                    Field field2 = field;
                                    int i8 = i5;
                                    int i9 = length;
                                    Field[] fieldArr2 = declaredFields;
                                    boolean z11 = z8;
                                    Class cls4 = cls3;
                                    lVar4 = (l) linkedHashMap.put(str, new l(str, field, z7, z4, false, method, z10, xVar, lVar, typeToken3, z11, z9));
                                    if (lVar5 != null) {
                                        lVar4 = lVar5;
                                    }
                                    pVar = this;
                                    lVar3 = lVar;
                                    d3 = z7;
                                    z6 = false;
                                    cls3 = cls4;
                                    length = i9;
                                    field = field2;
                                    declaredFields = fieldArr2;
                                    size = i7;
                                    r5 = obj;
                                    i5 = i8;
                                    r3 = i6 + 1;
                                }
                                lVar2 = lVar4;
                                Field field3 = field;
                                i3 = i5;
                                z5 = z6;
                                i4 = length;
                                fieldArr = declaredFields;
                                cls2 = cls3;
                                if (lVar2 != null) {
                                    throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + lVar2.f2713a + "'; conflict is caused by fields " + AbstractC0178c.c(lVar2.f2714b) + " and " + AbstractC0178c.c(field3));
                                }
                            }
                        }
                        arrayList = singletonList;
                        size = arrayList.size();
                        r3 = z6;
                        l lVar42 = null;
                        ?? r52 = arrayList;
                        while (r3 < size) {
                        }
                        lVar2 = lVar42;
                        Field field32 = field;
                        i3 = i5;
                        z5 = z6;
                        i4 = length;
                        fieldArr = declaredFields;
                        cls2 = cls3;
                        if (lVar2 != null) {
                        }
                    }
                    method = null;
                    if (method == null) {
                    }
                    Type h3 = d1.d.h(typeToken2.getType(), cls3, field.getGenericType(), new HashMap());
                    interfaceC0111b = (InterfaceC0111b) field.getAnnotation(InterfaceC0111b.class);
                    if (interfaceC0111b != null) {
                    }
                    arrayList = singletonList;
                    size = arrayList.size();
                    r3 = z6;
                    l lVar422 = null;
                    ?? r522 = arrayList;
                    while (r3 < size) {
                    }
                    lVar2 = lVar422;
                    Field field322 = field;
                    i3 = i5;
                    z5 = z6;
                    i4 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    if (lVar2 != null) {
                    }
                } else {
                    i3 = i5;
                    z5 = z6;
                    i4 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                }
                i5 = i3 + 1;
                pVar = this;
                lVar3 = lVar;
                z6 = z5;
                cls3 = cls2;
                length = i4;
                declaredFields = fieldArr;
            }
            Class cls5 = cls3;
            typeToken2 = TypeToken.get(d1.d.h(typeToken2.getType(), cls5, cls5.getGenericSuperclass(), new HashMap()));
            cls3 = typeToken2.getRawType();
            pVar = this;
            lVar3 = lVar;
        }
        return linkedHashMap;
    }

    public final boolean d(Field field, boolean z3) {
        Class<?> type = field.getType();
        d1.i iVar = this.f2729d;
        iVar.getClass();
        if (!d1.i.c(type)) {
            iVar.b(z3);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !d1.i.c(field.getType())) {
                List list = z3 ? iVar.f2627b : iVar.c;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        X.d.q(it.next());
                        throw null;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
