package W;

import U0.e;
import X.d;
import androidx.lifecycle.M;
import n.C0343l;

/* loaded from: classes.dex */
public final class a extends M {

    /* renamed from: d, reason: collision with root package name */
    public static final e f980d = new e(9);
    public final C0343l c = new C0343l();

    @Override // androidx.lifecycle.M
    public final void a() {
        C0343l c0343l = this.c;
        int i3 = c0343l.f4163d;
        if (i3 > 0) {
            d.q(c0343l.c[0]);
            throw null;
        }
        Object[] objArr = c0343l.c;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        c0343l.f4163d = 0;
    }
}
