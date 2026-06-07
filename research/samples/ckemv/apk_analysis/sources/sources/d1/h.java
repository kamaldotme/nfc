package d1;

import b1.y;
import com.google.gson.reflect.TypeToken;
import i1.C0186a;
import i1.C0187b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends b1.x {

    /* renamed from: a, reason: collision with root package name */
    public b1.x f2621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2622b;
    public final /* synthetic */ boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1.l f2623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TypeToken f2624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f2625f;

    public h(i iVar, boolean z3, boolean z4, b1.l lVar, TypeToken typeToken) {
        this.f2625f = iVar;
        this.f2622b = z3;
        this.c = z4;
        this.f2623d = lVar;
        this.f2624e = typeToken;
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        if (this.f2622b) {
            c0186a.c0();
            return null;
        }
        b1.x xVar = this.f2621a;
        if (xVar == null) {
            b1.l lVar = this.f2623d;
            List list = lVar.f2227e;
            y yVar = this.f2625f;
            if (!list.contains(yVar)) {
                yVar = lVar.f2226d;
            }
            Iterator it = list.iterator();
            boolean z3 = false;
            while (true) {
                boolean hasNext = it.hasNext();
                TypeToken typeToken = this.f2624e;
                if (!hasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
                }
                y yVar2 = (y) it.next();
                if (z3) {
                    b1.x a3 = yVar2.a(lVar, typeToken);
                    if (a3 != null) {
                        this.f2621a = a3;
                        xVar = a3;
                        break;
                    }
                } else if (yVar2 == yVar) {
                    z3 = true;
                }
            }
        }
        return xVar.a(c0186a);
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        if (this.c) {
            c0187b.J();
            return;
        }
        b1.x xVar = this.f2621a;
        if (xVar == null) {
            b1.l lVar = this.f2623d;
            List list = lVar.f2227e;
            y yVar = this.f2625f;
            if (!list.contains(yVar)) {
                yVar = lVar.f2226d;
            }
            Iterator it = list.iterator();
            boolean z3 = false;
            while (true) {
                boolean hasNext = it.hasNext();
                TypeToken typeToken = this.f2624e;
                if (!hasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
                }
                y yVar2 = (y) it.next();
                if (z3) {
                    b1.x a3 = yVar2.a(lVar, typeToken);
                    if (a3 != null) {
                        this.f2621a = a3;
                        xVar = a3;
                        break;
                    }
                } else if (yVar2 == yVar) {
                    z3 = true;
                }
            }
        }
        xVar.b(c0187b, obj);
    }
}
