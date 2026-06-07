package X0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends U0.g {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1039z = 0;

    /* renamed from: y, reason: collision with root package name */
    public g f1040y;

    public h(g gVar) {
        super(gVar);
        this.f1040y = gVar;
    }

    @Override // U0.g
    public final void f(Canvas canvas) {
        if (this.f1040y.f1038v.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f1040y.f1038v);
        super.f(canvas);
        canvas.restore();
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1040y = new g(this.f1040y);
        return this;
    }

    public final void o(float f3, float f4, float f5, float f6) {
        RectF rectF = this.f1040y.f1038v;
        if (f3 == rectF.left && f4 == rectF.top && f5 == rectF.right && f6 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f4, f5, f6);
        invalidateSelf();
    }
}
