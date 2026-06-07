package C1;

import j1.C0238h;
import j1.C0244n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p1.b f119a;

    /* renamed from: b, reason: collision with root package name */
    public final C0244n f120b;
    public final C0244n c;

    /* renamed from: d, reason: collision with root package name */
    public final C0244n f121d;

    /* renamed from: e, reason: collision with root package name */
    public final C0244n f122e;

    /* renamed from: f, reason: collision with root package name */
    public final int f123f;
    public final int g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f124i;

    public c(p1.b bVar, C0244n c0244n, C0244n c0244n2, C0244n c0244n3, C0244n c0244n4) {
        boolean z3 = c0244n == null || c0244n2 == null;
        boolean z4 = c0244n3 == null || c0244n4 == null;
        if (z3 && z4) {
            throw C0238h.f3489d;
        }
        if (z3) {
            c0244n = new C0244n(0.0f, c0244n3.f3506b);
            c0244n2 = new C0244n(0.0f, c0244n4.f3506b);
        } else if (z4) {
            int i3 = bVar.f4328b;
            c0244n3 = new C0244n(i3 - 1, c0244n.f3506b);
            c0244n4 = new C0244n(i3 - 1, c0244n2.f3506b);
        }
        this.f119a = bVar;
        this.f120b = c0244n;
        this.c = c0244n2;
        this.f121d = c0244n3;
        this.f122e = c0244n4;
        this.f123f = (int) Math.min(c0244n.f3505a, c0244n2.f3505a);
        this.g = (int) Math.max(c0244n3.f3505a, c0244n4.f3505a);
        this.h = (int) Math.min(c0244n.f3506b, c0244n3.f3506b);
        this.f124i = (int) Math.max(c0244n2.f3506b, c0244n4.f3506b);
    }

    public c(c cVar) {
        this.f119a = cVar.f119a;
        this.f120b = cVar.f120b;
        this.c = cVar.c;
        this.f121d = cVar.f121d;
        this.f122e = cVar.f122e;
        this.f123f = cVar.f123f;
        this.g = cVar.g;
        this.h = cVar.h;
        this.f124i = cVar.f124i;
    }
}
