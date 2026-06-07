package R0;

import android.graphics.Typeface;
import v0.f;
import z.AbstractC0452b;

/* loaded from: classes.dex */
public final class b extends AbstractC0452b {
    public final /* synthetic */ f h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f831i;

    public b(d dVar, f fVar) {
        this.f831i = dVar;
        this.h = fVar;
    }

    @Override // z.AbstractC0452b
    public final void g(int i3) {
        this.f831i.f844m = true;
        this.h.D(i3);
    }

    @Override // z.AbstractC0452b
    public final void h(Typeface typeface) {
        d dVar = this.f831i;
        dVar.f845n = Typeface.create(typeface, dVar.c);
        dVar.f844m = true;
        this.h.E(dVar.f845n, false);
    }
}
