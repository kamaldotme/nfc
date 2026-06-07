package h2;

import e2.AbstractC0139v;
import i2.r;
import java.util.ArrayList;
import m0.z;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final O1.i f3095a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3096b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3097d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3098e;

    /* renamed from: f, reason: collision with root package name */
    public final K1.a f3099f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(W1.q qVar, f fVar, O1.i iVar, int i3, int i4) {
        this(iVar, i3, i4);
        this.f3097d = 1;
        this.f3097d = 1;
        this.f3098e = fVar;
        this.f3099f = qVar;
    }

    @Override // h2.f
    public Object a(g gVar, O1.d dVar) {
        Object b3;
        switch (this.f3097d) {
            case 1:
                P1.a aVar = P1.a.f784b;
                K1.h hVar = K1.h.f605a;
                if (this.f3096b == -3) {
                    O1.i j3 = dVar.j();
                    O1.i o3 = j3.o(this.f3095a);
                    if (X1.g.a(o3, j3)) {
                        b3 = e(gVar, dVar);
                        if (b3 != aVar) {
                            return hVar;
                        }
                    } else {
                        O1.e eVar = O1.e.f781b;
                        if (X1.g.a(o3.A(eVar), j3.A(eVar))) {
                            O1.i j4 = dVar.j();
                            if (!(gVar instanceof r) && !(gVar instanceof i2.p)) {
                                gVar = new d(gVar, j4);
                            }
                            b3 = i2.q.a(o3, gVar, j2.a.m(o3), new i2.e(this, null), dVar);
                            if (b3 != aVar) {
                                b3 = hVar;
                            }
                            if (b3 != aVar) {
                                return hVar;
                            }
                        }
                    }
                    return b3;
                }
                b3 = b(gVar, dVar);
                if (b3 != aVar) {
                    return hVar;
                }
                return b3;
            default:
                return b(gVar, dVar);
        }
    }

    public final Object b(g gVar, O1.d dVar) {
        Object c = AbstractC0139v.c(new i2.c(null, this, gVar), dVar);
        return c == P1.a.f784b ? c : K1.h.f605a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g2.r rVar, O1.d dVar) {
        a aVar;
        int i3;
        switch (this.f3097d) {
            case 0:
                if (dVar instanceof a) {
                    aVar = (a) dVar;
                    int i4 = aVar.h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        aVar.h = i4 - Integer.MIN_VALUE;
                        Object obj = aVar.f3094f;
                        P1.a aVar2 = P1.a.f784b;
                        i3 = aVar.h;
                        K1.h hVar = K1.h.f605a;
                        if (i3 != 0) {
                            z.m0(obj);
                            aVar.f3093e = rVar;
                            aVar.h = 1;
                            Object e3 = ((W1.p) this.f3098e).e(rVar, aVar);
                            if (e3 != aVar2) {
                                e3 = hVar;
                            }
                            if (e3 == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            rVar = aVar.f3093e;
                            z.m0(obj);
                        }
                        if (((g2.q) rVar).f3079e.d()) {
                            throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                        }
                        return hVar;
                    }
                }
                aVar = new a(this, dVar);
                Object obj2 = aVar.f3094f;
                P1.a aVar22 = P1.a.f784b;
                i3 = aVar.h;
                K1.h hVar2 = K1.h.f605a;
                if (i3 != 0) {
                }
                if (((g2.q) rVar).f3079e.d()) {
                }
            default:
                Object e4 = e(new r(rVar), dVar);
                return e4 == P1.a.f784b ? e4 : K1.h.f605a;
        }
    }

    public final b d(O1.i iVar, int i3, int i4) {
        switch (this.f3097d) {
            case 0:
                return new b((W1.p) this.f3099f, iVar, i3, i4);
            default:
                return new b((W1.q) this.f3099f, (f) this.f3098e, iVar, i3, i4);
        }
    }

    public Object e(g gVar, O1.d dVar) {
        Object c = AbstractC0139v.c(new i2.i(null, this, gVar), dVar);
        return c == P1.a.f784b ? c : K1.h.f605a;
    }

    public final f f(O1.i iVar, int i3, int i4) {
        O1.i iVar2 = this.f3095a;
        O1.i o3 = iVar.o(iVar2);
        int i5 = this.c;
        int i6 = this.f3096b;
        if (i4 == 1) {
            if (i6 != -3) {
                if (i3 != -3) {
                    if (i6 != -2) {
                        if (i3 != -2) {
                            i3 += i6;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i6;
            }
            i4 = i5;
        }
        return (X1.g.a(o3, iVar2) && i3 == i6 && i4 == i5) ? this : d(o3, i3, i4);
    }

    public final String g() {
        ArrayList arrayList = new ArrayList(4);
        O1.j jVar = O1.j.f782b;
        O1.i iVar = this.f3095a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i3 = this.f3096b;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        int i4 = this.c;
        if (i4 != 1) {
            arrayList.add("onBufferOverflow=".concat(X.d.w(i4)));
        }
        return getClass().getSimpleName() + '[' + L1.k.W(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        switch (this.f3097d) {
            case 0:
                return "block[" + ((W1.p) this.f3098e) + "] -> " + g();
            default:
                return ((f) this.f3098e) + " -> " + g();
        }
    }

    public b(O1.i iVar, int i3, int i4) {
        this.f3095a = iVar;
        this.f3096b = i3;
        this.c = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(W1.p pVar, O1.i iVar, int i3, int i4) {
        this(iVar, i3, i4);
        this.f3097d = 0;
        this.f3098e = pVar;
        this.f3099f = pVar;
    }
}
