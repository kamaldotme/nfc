package X0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends U0.f {

    /* renamed from: v, reason: collision with root package name */
    public final RectF f1038v;

    public g(U0.k kVar, RectF rectF) {
        super(kVar);
        this.f1038v = rectF;
    }

    @Override // U0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f1038v = gVar.f1038v;
    }
}
