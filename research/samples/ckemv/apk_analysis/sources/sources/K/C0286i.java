package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import j.C0196b;
import xyz.happify.ckemv.R;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286i extends C0318y implements InterfaceC0290k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0288j f3689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0286i(C0288j c0288j, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f3689e = c0288j;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        o1.a(this, getContentDescription());
        setOnTouchListener(new C0196b(this, this));
    }

    @Override // k.InterfaceC0290k
    public final boolean a() {
        return false;
    }

    @Override // k.InterfaceC0290k
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3689e.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            B.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
