package I1;

import j1.C0235e;
import j1.C0239i;

/* loaded from: classes.dex */
public final class s extends m {
    public boolean c;

    @Override // I1.m
    public final v0.e b(C0239i c0239i) {
        if (this.c) {
            this.c = false;
            return new v0.e(new p1.e(new C0235e(c0239i)));
        }
        this.c = true;
        return new v0.e(new p1.e(c0239i));
    }
}
