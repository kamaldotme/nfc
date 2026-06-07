package p0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4306b;
    public final /* synthetic */ g c;

    public /* synthetic */ f(g gVar, int i3) {
        this.f4306b = i3;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4306b) {
            case 0:
                g.a(this.c);
                return;
            default:
                g.b(this.c);
                return;
        }
    }
}
