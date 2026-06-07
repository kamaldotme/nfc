package androidx.fragment.app;

import android.content.Context;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068e extends A1.f {
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1918d;

    /* renamed from: e, reason: collision with root package name */
    public v0.l f1919e;

    public final v0.l l(Context context) {
        if (this.f1918d) {
            return this.f1919e;
        }
        T t3 = (T) this.f46a;
        v0.l A3 = u2.l.A(context, t3.c, t3.f1881a == 2, this.c);
        this.f1919e = A3;
        this.f1918d = true;
        return A3;
    }
}
