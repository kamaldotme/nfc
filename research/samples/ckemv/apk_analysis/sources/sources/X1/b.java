package X1;

import b2.InterfaceC0106a;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC0106a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient InterfaceC0106a f1132b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f1133d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1134e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1135f;
    public final boolean g;

    public b(Object obj, Class cls, String str, String str2, boolean z3) {
        this.c = obj;
        this.f1133d = cls;
        this.f1134e = str;
        this.f1135f = str2;
        this.g = z3;
    }

    public final c b() {
        c dVar;
        Class cls = this.f1133d;
        if (cls == null) {
            return null;
        }
        if (this.g) {
            k.f1143a.getClass();
            dVar = new i(cls);
        } else {
            k.f1143a.getClass();
            dVar = new d(cls);
        }
        return dVar;
    }
}
