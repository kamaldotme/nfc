package R0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import v0.f;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextPaint f833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f834f;
    public final /* synthetic */ d g;

    public c(d dVar, Context context, TextPaint textPaint, f fVar) {
        this.g = dVar;
        this.f832d = context;
        this.f833e = textPaint;
        this.f834f = fVar;
    }

    @Override // v0.f
    public final void D(int i3) {
        this.f834f.D(i3);
    }

    @Override // v0.f
    public final void E(Typeface typeface, boolean z3) {
        this.g.g(this.f832d, this.f833e, typeface);
        this.f834f.E(typeface, z3);
    }
}
