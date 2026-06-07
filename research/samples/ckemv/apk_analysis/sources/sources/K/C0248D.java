package k;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import xyz.happify.ckemv.R;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248D extends RatingBar {

    /* renamed from: b, reason: collision with root package name */
    public final C0246B f3557b;

    public C0248D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        c1.a(this, getContext());
        C0246B c0246b = new C0246B(this);
        this.f3557b = c0246b;
        c0246b.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        Bitmap bitmap = (Bitmap) this.f3557b.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }
}
