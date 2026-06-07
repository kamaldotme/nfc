package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0099p {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2033b;
    public final C0084a c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2033b = obj;
        C0086c c0086c = C0086c.c;
        Class<?> cls = obj.getClass();
        C0084a c0084a = (C0084a) c0086c.f2040a.get(cls);
        this.c = c0084a == null ? c0086c.a(cls, null) : c0084a;
    }

    @Override // androidx.lifecycle.InterfaceC0099p
    public final void b(r rVar, EnumC0095l enumC0095l) {
        HashMap hashMap = this.c.f2036a;
        List list = (List) hashMap.get(enumC0095l);
        Object obj = this.f2033b;
        C0084a.a(list, rVar, enumC0095l, obj);
        C0084a.a((List) hashMap.get(EnumC0095l.ON_ANY), rVar, enumC0095l, obj);
    }
}
