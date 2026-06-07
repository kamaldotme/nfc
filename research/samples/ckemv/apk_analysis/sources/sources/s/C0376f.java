package s;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0376f implements InterfaceC0374d {

    /* renamed from: d, reason: collision with root package name */
    public final m f4679d;

    /* renamed from: f, reason: collision with root package name */
    public int f4681f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public m f4677a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4678b = false;
    public boolean c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4680e = 1;
    public int h = 1;

    /* renamed from: i, reason: collision with root package name */
    public C0377g f4682i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4683j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4684k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4685l = new ArrayList();

    public C0376f(m mVar) {
        this.f4679d = mVar;
    }

    @Override // s.InterfaceC0374d
    public final void a(InterfaceC0374d interfaceC0374d) {
        ArrayList arrayList = this.f4685l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0376f) it.next()).f4683j) {
                return;
            }
        }
        this.c = true;
        m mVar = this.f4677a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f4678b) {
            this.f4679d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0376f c0376f = null;
        int i3 = 0;
        while (it2.hasNext()) {
            C0376f c0376f2 = (C0376f) it2.next();
            if (!(c0376f2 instanceof C0377g)) {
                i3++;
                c0376f = c0376f2;
            }
        }
        if (c0376f != null && i3 == 1 && c0376f.f4683j) {
            C0377g c0377g = this.f4682i;
            if (c0377g != null) {
                if (!c0377g.f4683j) {
                    return;
                } else {
                    this.f4681f = this.h * c0377g.g;
                }
            }
            d(c0376f.g + this.f4681f);
        }
        m mVar2 = this.f4677a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(InterfaceC0374d interfaceC0374d) {
        this.f4684k.add(interfaceC0374d);
        if (this.f4683j) {
            interfaceC0374d.a(interfaceC0374d);
        }
    }

    public final void c() {
        this.f4685l.clear();
        this.f4684k.clear();
        this.f4683j = false;
        this.g = 0;
        this.c = false;
        this.f4678b = false;
    }

    public void d(int i3) {
        if (this.f4683j) {
            return;
        }
        this.f4683j = true;
        this.g = i3;
        Iterator it = this.f4684k.iterator();
        while (it.hasNext()) {
            InterfaceC0374d interfaceC0374d = (InterfaceC0374d) it.next();
            interfaceC0374d.a(interfaceC0374d);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4679d.f4693b.f4529W);
        sb.append(":");
        sb.append(X.d.A(this.f4680e));
        sb.append("(");
        sb.append(this.f4683j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4685l.size());
        sb.append(":d=");
        sb.append(this.f4684k.size());
        sb.append(">");
        return sb.toString();
    }
}
