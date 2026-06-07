package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import xyz.happify.ckemv.R;

/* renamed from: k.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250F extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final C0251G f3560b;

    public C0250F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        c1.a(this, getContext());
        C0251G c0251g = new C0251G(this);
        this.f3560b = c0251g;
        c0251g.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0251G c0251g = this.f3560b;
        Drawable drawable = c0251g.f3563f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c0251g.f3562e;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3560b.f3563f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3560b.g(canvas);
    }
}
