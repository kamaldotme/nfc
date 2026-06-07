package androidx.emoji2.text;

import m0.z;

/* loaded from: classes.dex */
public final class e extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f1765d;

    public e(f fVar) {
        this.f1765d = fVar;
    }

    @Override // m0.z
    public final void T(Throwable th) {
        this.f1765d.f1766a.d(th);
    }

    @Override // m0.z
    public final void U(v0.i iVar) {
        f fVar = this.f1765d;
        fVar.c = iVar;
        fVar.f1767b = new v0.m(fVar.c, new U0.e(17), fVar.f1766a.h);
        fVar.f1766a.e();
    }
}
