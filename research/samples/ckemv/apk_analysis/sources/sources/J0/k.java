package j0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3412b;
    public final /* synthetic */ Object c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3415f;
    public final /* synthetic */ l g;

    public k(l lVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = lVar;
        this.f3411a = obj;
        this.f3412b = arrayList;
        this.c = obj2;
        this.f3413d = arrayList2;
        this.f3414e = obj3;
        this.f3415f = arrayList3;
    }

    @Override // j0.p, j0.n
    public final void c() {
        l lVar = this.g;
        Object obj = this.f3411a;
        if (obj != null) {
            lVar.o(obj, this.f3412b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            lVar.o(obj2, this.f3413d, null);
        }
        Object obj3 = this.f3414e;
        if (obj3 != null) {
            lVar.o(obj3, this.f3415f, null);
        }
    }

    @Override // j0.n
    public final void d(o oVar) {
        oVar.v(this);
    }
}
