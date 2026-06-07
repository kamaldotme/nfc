package s;

/* renamed from: s.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378h extends m {
    @Override // s.InterfaceC0374d
    public final void a(InterfaceC0374d interfaceC0374d) {
        C0376f c0376f = this.h;
        if (c0376f.c && !c0376f.f4683j) {
            c0376f.d((int) ((((C0376f) c0376f.f4685l.get(0)).g * ((r.h) this.f4693b).f4621d0) + 0.5f));
        }
    }

    @Override // s.m
    public final void d() {
        r.d dVar = this.f4693b;
        r.h hVar = (r.h) dVar;
        int i3 = hVar.f4622e0;
        int i4 = hVar.f4623f0;
        int i5 = hVar.f4625h0;
        C0376f c0376f = this.h;
        if (i5 == 1) {
            if (i3 != -1) {
                c0376f.f4685l.add(dVar.f4515I.f4538d.h);
                this.f4693b.f4515I.f4538d.h.f4684k.add(c0376f);
                c0376f.f4681f = i3;
            } else if (i4 != -1) {
                c0376f.f4685l.add(dVar.f4515I.f4538d.f4697i);
                this.f4693b.f4515I.f4538d.f4697i.f4684k.add(c0376f);
                c0376f.f4681f = -i4;
            } else {
                c0376f.f4678b = true;
                c0376f.f4685l.add(dVar.f4515I.f4538d.f4697i);
                this.f4693b.f4515I.f4538d.f4697i.f4684k.add(c0376f);
            }
            m(this.f4693b.f4538d.h);
            m(this.f4693b.f4538d.f4697i);
            return;
        }
        if (i3 != -1) {
            c0376f.f4685l.add(dVar.f4515I.f4539e.h);
            this.f4693b.f4515I.f4539e.h.f4684k.add(c0376f);
            c0376f.f4681f = i3;
        } else if (i4 != -1) {
            c0376f.f4685l.add(dVar.f4515I.f4539e.f4697i);
            this.f4693b.f4515I.f4539e.f4697i.f4684k.add(c0376f);
            c0376f.f4681f = -i4;
        } else {
            c0376f.f4678b = true;
            c0376f.f4685l.add(dVar.f4515I.f4539e.f4697i);
            this.f4693b.f4515I.f4539e.f4697i.f4684k.add(c0376f);
        }
        m(this.f4693b.f4539e.h);
        m(this.f4693b.f4539e.f4697i);
    }

    @Override // s.m
    public final void e() {
        r.d dVar = this.f4693b;
        int i3 = ((r.h) dVar).f4625h0;
        C0376f c0376f = this.h;
        if (i3 == 1) {
            dVar.f4520N = c0376f.g;
        } else {
            dVar.f4521O = c0376f.g;
        }
    }

    @Override // s.m
    public final void f() {
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
