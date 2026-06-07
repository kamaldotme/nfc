package s;

import java.util.Iterator;
import r.C0364a;

/* renamed from: s.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379i extends m {
    @Override // s.InterfaceC0374d
    public final void a(InterfaceC0374d interfaceC0374d) {
        C0364a c0364a = (C0364a) this.f4693b;
        int i3 = c0364a.f4486f0;
        C0376f c0376f = this.h;
        Iterator it = c0376f.f4685l.iterator();
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = ((C0376f) it.next()).g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (i3 == 0 || i3 == 2) {
            c0376f.d(i5 + c0364a.f4488h0);
        } else {
            c0376f.d(i4 + c0364a.f4488h0);
        }
    }

    @Override // s.m
    public final void d() {
        r.d dVar = this.f4693b;
        if (dVar instanceof C0364a) {
            C0376f c0376f = this.h;
            c0376f.f4678b = true;
            C0364a c0364a = (C0364a) dVar;
            int i3 = c0364a.f4486f0;
            boolean z3 = c0364a.f4487g0;
            int i4 = 0;
            if (i3 == 0) {
                c0376f.f4680e = 4;
                while (i4 < c0364a.f4627e0) {
                    r.d dVar2 = c0364a.f4626d0[i4];
                    if (z3 || dVar2.f4528V != 8) {
                        C0376f c0376f2 = dVar2.f4538d.h;
                        c0376f2.f4684k.add(c0376f);
                        c0376f.f4685l.add(c0376f2);
                    }
                    i4++;
                }
                m(this.f4693b.f4538d.h);
                m(this.f4693b.f4538d.f4697i);
                return;
            }
            if (i3 == 1) {
                c0376f.f4680e = 5;
                while (i4 < c0364a.f4627e0) {
                    r.d dVar3 = c0364a.f4626d0[i4];
                    if (z3 || dVar3.f4528V != 8) {
                        C0376f c0376f3 = dVar3.f4538d.f4697i;
                        c0376f3.f4684k.add(c0376f);
                        c0376f.f4685l.add(c0376f3);
                    }
                    i4++;
                }
                m(this.f4693b.f4538d.h);
                m(this.f4693b.f4538d.f4697i);
                return;
            }
            if (i3 == 2) {
                c0376f.f4680e = 6;
                while (i4 < c0364a.f4627e0) {
                    r.d dVar4 = c0364a.f4626d0[i4];
                    if (z3 || dVar4.f4528V != 8) {
                        C0376f c0376f4 = dVar4.f4539e.h;
                        c0376f4.f4684k.add(c0376f);
                        c0376f.f4685l.add(c0376f4);
                    }
                    i4++;
                }
                m(this.f4693b.f4539e.h);
                m(this.f4693b.f4539e.f4697i);
                return;
            }
            if (i3 != 3) {
                return;
            }
            c0376f.f4680e = 7;
            while (i4 < c0364a.f4627e0) {
                r.d dVar5 = c0364a.f4626d0[i4];
                if (z3 || dVar5.f4528V != 8) {
                    C0376f c0376f5 = dVar5.f4539e.f4697i;
                    c0376f5.f4684k.add(c0376f);
                    c0376f.f4685l.add(c0376f5);
                }
                i4++;
            }
            m(this.f4693b.f4539e.h);
            m(this.f4693b.f4539e.f4697i);
        }
    }

    @Override // s.m
    public final void e() {
        r.d dVar = this.f4693b;
        if (dVar instanceof C0364a) {
            int i3 = ((C0364a) dVar).f4486f0;
            C0376f c0376f = this.h;
            if (i3 == 0 || i3 == 1) {
                dVar.f4520N = c0376f.g;
            } else {
                dVar.f4521O = c0376f.g;
            }
        }
    }

    @Override // s.m
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // s.m
    public final boolean k() {
        return false;
    }

    public final void m(C0376f c0376f) {
        C0376f c0376f2 = this.h;
        c0376f2.f4684k.add(c0376f);
        c0376f.f4685l.add(c0376f2);
    }
}
