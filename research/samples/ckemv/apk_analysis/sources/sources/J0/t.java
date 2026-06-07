package j0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class t extends o {

    /* renamed from: A, reason: collision with root package name */
    public int f3445A;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f3448y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f3449z = true;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3446B = false;

    /* renamed from: C, reason: collision with root package name */
    public int f3447C = 0;

    @Override // j0.o
    public final void A(d1.e eVar) {
        this.f3438t = eVar;
        this.f3447C |= 8;
        int size = this.f3448y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f3448y.get(i3)).A(eVar);
        }
    }

    @Override // j0.o
    public final void B(TimeInterpolator timeInterpolator) {
        this.f3447C |= 1;
        ArrayList arrayList = this.f3448y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((o) this.f3448y.get(i3)).B(timeInterpolator);
            }
        }
        this.f3425e = timeInterpolator;
    }

    @Override // j0.o
    public final void C(d1.e eVar) {
        super.C(eVar);
        this.f3447C |= 4;
        if (this.f3448y != null) {
            for (int i3 = 0; i3 < this.f3448y.size(); i3++) {
                ((o) this.f3448y.get(i3)).C(eVar);
            }
        }
    }

    @Override // j0.o
    public final void D() {
        this.f3447C |= 2;
        int size = this.f3448y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f3448y.get(i3)).D();
        }
    }

    @Override // j0.o
    public final void E(long j3) {
        this.c = j3;
    }

    @Override // j0.o
    public final String G(String str) {
        String G2 = super.G(str);
        for (int i3 = 0; i3 < this.f3448y.size(); i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G2);
            sb.append("\n");
            sb.append(((o) this.f3448y.get(i3)).G(str + "  "));
            G2 = sb.toString();
        }
        return G2;
    }

    public final void H(o oVar) {
        this.f3448y.add(oVar);
        oVar.f3428j = this;
        long j3 = this.f3424d;
        if (j3 >= 0) {
            oVar.z(j3);
        }
        if ((this.f3447C & 1) != 0) {
            oVar.B(this.f3425e);
        }
        if ((this.f3447C & 2) != 0) {
            oVar.D();
        }
        if ((this.f3447C & 4) != 0) {
            oVar.C(this.f3439u);
        }
        if ((this.f3447C & 8) != 0) {
            oVar.A(this.f3438t);
        }
    }

    @Override // j0.o
    public final void a(n nVar) {
        super.a(nVar);
    }

    @Override // j0.o
    public final void b(View view) {
        for (int i3 = 0; i3 < this.f3448y.size(); i3++) {
            ((o) this.f3448y.get(i3)).b(view);
        }
        this.g.add(view);
    }

    @Override // j0.o
    public final void d(v vVar) {
        if (s(vVar.f3453b)) {
            Iterator it = this.f3448y.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.s(vVar.f3453b)) {
                    oVar.d(vVar);
                    vVar.c.add(oVar);
                }
            }
        }
    }

    @Override // j0.o
    public final void f(v vVar) {
        int size = this.f3448y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f3448y.get(i3)).f(vVar);
        }
    }

    @Override // j0.o
    public final void g(v vVar) {
        if (s(vVar.f3453b)) {
            Iterator it = this.f3448y.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.s(vVar.f3453b)) {
                    oVar.g(vVar);
                    vVar.c.add(oVar);
                }
            }
        }
    }

    @Override // j0.o
    /* renamed from: j */
    public final o clone() {
        t tVar = (t) super.clone();
        tVar.f3448y = new ArrayList();
        int size = this.f3448y.size();
        for (int i3 = 0; i3 < size; i3++) {
            o clone = ((o) this.f3448y.get(i3)).clone();
            tVar.f3448y.add(clone);
            clone.f3428j = tVar;
        }
        return tVar;
    }

    @Override // j0.o
    public final void l(ViewGroup viewGroup, v0.i iVar, v0.i iVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j3 = this.c;
        int size = this.f3448y.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = (o) this.f3448y.get(i3);
            if (j3 > 0 && (this.f3449z || i3 == 0)) {
                long j4 = oVar.c;
                if (j4 > 0) {
                    oVar.E(j4 + j3);
                } else {
                    oVar.E(j3);
                }
            }
            oVar.l(viewGroup, iVar, iVar2, arrayList, arrayList2);
        }
    }

    @Override // j0.o
    public final void u(View view) {
        super.u(view);
        int size = this.f3448y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f3448y.get(i3)).u(view);
        }
    }

    @Override // j0.o
    public final void v(n nVar) {
        super.v(nVar);
    }

    @Override // j0.o
    public final void w(View view) {
        for (int i3 = 0; i3 < this.f3448y.size(); i3++) {
            ((o) this.f3448y.get(i3)).w(view);
        }
        this.g.remove(view);
    }

    @Override // j0.o
    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.f3448y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f3448y.get(i3)).x(viewGroup);
        }
    }

    @Override // j0.o
    public final void y() {
        if (this.f3448y.isEmpty()) {
            F();
            m();
            return;
        }
        h hVar = new h();
        hVar.f3406b = this;
        Iterator it = this.f3448y.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(hVar);
        }
        this.f3445A = this.f3448y.size();
        if (this.f3449z) {
            Iterator it2 = this.f3448y.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).y();
            }
            return;
        }
        for (int i3 = 1; i3 < this.f3448y.size(); i3++) {
            ((o) this.f3448y.get(i3 - 1)).a(new h(1, (o) this.f3448y.get(i3)));
        }
        o oVar = (o) this.f3448y.get(0);
        if (oVar != null) {
            oVar.y();
        }
    }

    @Override // j0.o
    public final void z(long j3) {
        ArrayList arrayList;
        this.f3424d = j3;
        if (j3 < 0 || (arrayList = this.f3448y) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f3448y.get(i3)).z(j3);
        }
    }
}
