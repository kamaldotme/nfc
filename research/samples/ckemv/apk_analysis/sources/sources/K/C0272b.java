package k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f3652a;

    public C0272b(ActionBarContainer actionBarContainer) {
        this.f3652a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3652a;
        if (actionBarContainer.h) {
            Drawable drawable = actionBarContainer.g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1531e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1532f;
        if (drawable3 == null || !actionBarContainer.f1533i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3652a;
        if (actionBarContainer.h) {
            if (actionBarContainer.g != null) {
                actionBarContainer.f1531e.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1531e;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
