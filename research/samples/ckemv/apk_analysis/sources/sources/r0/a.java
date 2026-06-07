package R0;

import A.h;
import android.graphics.Typeface;
import v0.f;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f828d;

    /* renamed from: e, reason: collision with root package name */
    public final h f829e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f830f;

    public a(h hVar, Typeface typeface) {
        this.f828d = typeface;
        this.f829e = hVar;
    }

    @Override // v0.f
    public final void D(int i3) {
        if (this.f830f) {
            return;
        }
        O0.b bVar = (O0.b) this.f829e.c;
        if (bVar.j(this.f828d)) {
            bVar.h(false);
        }
    }

    @Override // v0.f
    public final void E(Typeface typeface, boolean z3) {
        if (this.f830f) {
            return;
        }
        O0.b bVar = (O0.b) this.f829e.c;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
