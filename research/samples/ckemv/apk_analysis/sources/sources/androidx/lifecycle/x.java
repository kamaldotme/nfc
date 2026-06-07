package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: b, reason: collision with root package name */
    public final A.h f2059b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public int f2060d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f2061e;

    public x(y yVar, A.h hVar) {
        this.f2061e = yVar;
        this.f2059b = hVar;
    }

    public final void c(boolean z3) {
        if (z3 == this.c) {
            return;
        }
        this.c = z3;
        int i3 = z3 ? 1 : -1;
        y yVar = this.f2061e;
        int i4 = yVar.c;
        yVar.c = i3 + i4;
        if (!yVar.f2065d) {
            yVar.f2065d = true;
            while (true) {
                try {
                    int i5 = yVar.c;
                    if (i4 == i5) {
                        break;
                    } else {
                        i4 = i5;
                    }
                } finally {
                    yVar.f2065d = false;
                }
            }
        }
        if (this.c) {
            yVar.c(this);
        }
    }

    public void d() {
    }

    public abstract boolean e();
}
