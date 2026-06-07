package s;

/* loaded from: classes.dex */
public abstract class m implements InterfaceC0374d {

    /* renamed from: a, reason: collision with root package name */
    public int f4692a;

    /* renamed from: b, reason: collision with root package name */
    public r.d f4693b;
    public k c;

    /* renamed from: d, reason: collision with root package name */
    public int f4694d;

    /* renamed from: e, reason: collision with root package name */
    public final C0377g f4695e = new C0377g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f4696f = 0;
    public boolean g = false;
    public final C0376f h = new C0376f(this);

    /* renamed from: i, reason: collision with root package name */
    public final C0376f f4697i = new C0376f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f4698j = 1;

    public m(r.d dVar) {
        this.f4693b = dVar;
    }

    public static void b(C0376f c0376f, C0376f c0376f2, int i3) {
        c0376f.f4685l.add(c0376f2);
        c0376f.f4681f = i3;
        c0376f2.f4684k.add(c0376f);
    }

    public static C0376f h(r.c cVar) {
        r.c cVar2 = cVar.f4505d;
        if (cVar2 == null) {
            return null;
        }
        int a3 = q.h.a(cVar2.c);
        r.d dVar = cVar2.f4504b;
        if (a3 == 1) {
            return dVar.f4538d.h;
        }
        if (a3 == 2) {
            return dVar.f4539e.h;
        }
        if (a3 == 3) {
            return dVar.f4538d.f4697i;
        }
        if (a3 == 4) {
            return dVar.f4539e.f4697i;
        }
        if (a3 != 5) {
            return null;
        }
        return dVar.f4539e.f4690k;
    }

    public static C0376f i(r.c cVar, int i3) {
        r.c cVar2 = cVar.f4505d;
        if (cVar2 == null) {
            return null;
        }
        r.d dVar = cVar2.f4504b;
        m mVar = i3 == 0 ? dVar.f4538d : dVar.f4539e;
        int a3 = q.h.a(cVar2.c);
        if (a3 == 1 || a3 == 2) {
            return mVar.h;
        }
        if (a3 == 3 || a3 == 4) {
            return mVar.f4697i;
        }
        return null;
    }

    public final void c(C0376f c0376f, C0376f c0376f2, int i3, C0377g c0377g) {
        c0376f.f4685l.add(c0376f2);
        c0376f.f4685l.add(this.f4695e);
        c0376f.h = i3;
        c0376f.f4682i = c0377g;
        c0376f2.f4684k.add(c0376f);
        c0377g.f4684k.add(c0376f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i3, int i4) {
        int max;
        if (i4 == 0) {
            r.d dVar = this.f4693b;
            int i5 = dVar.f4546n;
            max = Math.max(dVar.f4545m, i3);
            if (i5 > 0) {
                max = Math.min(i5, i3);
            }
            if (max == i3) {
                return i3;
            }
        } else {
            r.d dVar2 = this.f4693b;
            int i6 = dVar2.f4549q;
            max = Math.max(dVar2.f4548p, i3);
            if (i6 > 0) {
                max = Math.min(i6, i3);
            }
            if (max == i3) {
                return i3;
            }
        }
        return max;
    }

    public long j() {
        if (this.f4695e.f4683j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(r.c cVar, r.c cVar2, int i3) {
        C0376f h = h(cVar);
        C0376f h3 = h(cVar2);
        if (h.f4683j && h3.f4683j) {
            int c = cVar.c() + h.g;
            int c3 = h3.g - cVar2.c();
            int i4 = c3 - c;
            C0377g c0377g = this.f4695e;
            if (!c0377g.f4683j && this.f4694d == 3) {
                int i5 = this.f4692a;
                if (i5 == 0) {
                    c0377g.d(g(i4, i3));
                } else if (i5 == 1) {
                    c0377g.d(Math.min(g(c0377g.f4686m, i3), i4));
                } else if (i5 == 2) {
                    r.d dVar = this.f4693b;
                    r.d dVar2 = dVar.f4515I;
                    if (dVar2 != null) {
                        if ((i3 == 0 ? dVar2.f4538d : dVar2.f4539e).f4695e.f4683j) {
                            c0377g.d(g((int) ((r6.g * (i3 == 0 ? dVar.f4547o : dVar.f4550r)) + 0.5f), i3));
                        }
                    }
                } else if (i5 == 3) {
                    r.d dVar3 = this.f4693b;
                    m mVar = dVar3.f4538d;
                    int i6 = mVar.f4694d;
                    m mVar2 = dVar3.f4539e;
                    if (i6 != 3 || mVar.f4692a != 3 || mVar2.f4694d != 3 || mVar2.f4692a != 3) {
                        if (i3 == 0) {
                            mVar = mVar2;
                        }
                        if (mVar.f4695e.f4683j) {
                            float f3 = dVar3.f4518L;
                            c0377g.d(i3 == 1 ? (int) ((r6.g / f3) + 0.5f) : (int) ((f3 * r6.g) + 0.5f));
                        }
                    }
                }
            }
            if (c0377g.f4683j) {
                int i7 = c0377g.g;
                C0376f c0376f = this.f4697i;
                C0376f c0376f2 = this.h;
                if (i7 == i4) {
                    c0376f2.d(c);
                    c0376f.d(c3);
                    return;
                }
                r.d dVar4 = this.f4693b;
                float f4 = i3 == 0 ? dVar4.f4525S : dVar4.f4526T;
                if (h == h3) {
                    c = h.g;
                    c3 = h3.g;
                    f4 = 0.5f;
                }
                c0376f2.d((int) ((((c3 - c) - i7) * f4) + c + 0.5f));
                c0376f.d(c0376f2.g + c0377g.g);
            }
        }
    }
}
