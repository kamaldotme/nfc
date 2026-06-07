package e1;

import b1.x;
import com.google.gson.reflect.TypeToken;
import g1.AbstractC0178c;
import i1.C0187b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f2713a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f2714b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2715d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2717f;
    public final /* synthetic */ Method g;
    public final /* synthetic */ boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f2718i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1.l f2719j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TypeToken f2720k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2721l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2722m;

    public l(String str, Field field, boolean z3, boolean z4, boolean z5, Method method, boolean z6, x xVar, b1.l lVar, TypeToken typeToken, boolean z7, boolean z8) {
        this.f2717f = z5;
        this.g = method;
        this.h = z6;
        this.f2718i = xVar;
        this.f2719j = lVar;
        this.f2720k = typeToken;
        this.f2721l = z7;
        this.f2722m = z8;
        this.f2713a = str;
        this.f2714b = field;
        this.c = field.getName();
        this.f2715d = z3;
        this.f2716e = z4;
    }

    public final void a(C0187b c0187b, Object obj) {
        Object obj2;
        if (this.f2715d) {
            boolean z3 = this.f2717f;
            Field field = this.f2714b;
            Method method = this.g;
            if (z3) {
                if (method == null) {
                    p.b(obj, field);
                } else {
                    p.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    obj2 = method.invoke(obj, null);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(X.d.i("Accessor ", AbstractC0178c.d(method, false), " threw exception"), e3.getCause());
                }
            } else {
                obj2 = field.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            c0187b.G(this.f2713a);
            boolean z4 = this.h;
            x xVar = this.f2718i;
            if (!z4) {
                xVar = new q(this.f2719j, xVar, this.f2720k.getType());
            }
            xVar.b(c0187b, obj2);
        }
    }
}
