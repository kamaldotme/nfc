package e1;

import b1.w;
import b1.x;
import com.google.gson.reflect.TypeToken;
import i1.C0186a;
import i1.C0187b;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends x {
    public static final i c = new i();

    /* renamed from: a, reason: collision with root package name */
    public final b1.l f2711a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2712b;

    public k(b1.l lVar, w wVar) {
        this.f2711a = lVar;
        this.f2712b = wVar;
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        Object arrayList;
        Serializable arrayList2;
        int W2 = c0186a.W();
        int a3 = q.h.a(W2);
        if (a3 == 0) {
            c0186a.a();
            arrayList = new ArrayList();
        } else if (a3 != 2) {
            arrayList = null;
        } else {
            c0186a.b();
            arrayList = new d1.o(true);
        }
        if (arrayList == null) {
            return c(c0186a, W2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c0186a.J()) {
                String Q2 = arrayList instanceof Map ? c0186a.Q() : null;
                int W3 = c0186a.W();
                int a4 = q.h.a(W3);
                if (a4 == 0) {
                    c0186a.a();
                    arrayList2 = new ArrayList();
                } else if (a4 != 2) {
                    arrayList2 = null;
                } else {
                    c0186a.b();
                    arrayList2 = new d1.o(true);
                }
                boolean z3 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(c0186a, W3);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(Q2, arrayList2);
                }
                if (z3) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c0186a.A();
                } else {
                    c0186a.D();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        if (obj == null) {
            c0187b.J();
            return;
        }
        Class<?> cls = obj.getClass();
        b1.l lVar = this.f2711a;
        lVar.getClass();
        x d3 = lVar.d(TypeToken.get((Class) cls));
        if (!(d3 instanceof k)) {
            d3.b(c0187b, obj);
        } else {
            c0187b.i();
            c0187b.D();
        }
    }

    public final Serializable c(C0186a c0186a, int i3) {
        int a3 = q.h.a(i3);
        if (a3 == 5) {
            return c0186a.U();
        }
        if (a3 == 6) {
            return this.f2712b.a(c0186a);
        }
        if (a3 == 7) {
            return Boolean.valueOf(c0186a.M());
        }
        if (a3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(X.d.x(i3)));
        }
        c0186a.S();
        return null;
    }
}
