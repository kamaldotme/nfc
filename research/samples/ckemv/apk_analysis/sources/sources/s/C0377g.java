package s;

import java.util.Iterator;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0377g extends C0376f {

    /* renamed from: m, reason: collision with root package name */
    public int f4686m;

    public C0377g(m mVar) {
        super(mVar);
        if (mVar instanceof C0380j) {
            this.f4680e = 2;
        } else {
            this.f4680e = 3;
        }
    }

    @Override // s.C0376f
    public final void d(int i3) {
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
}
