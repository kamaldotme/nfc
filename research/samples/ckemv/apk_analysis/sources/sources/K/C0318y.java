package k;

import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: k.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0318y extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    public final C0298o f3804b;
    public final J1.l c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0318y(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        d1.a(context);
        this.f3805d = false;
        c1.a(this, getContext());
        C0298o c0298o = new C0298o(this);
        this.f3804b = c0298o;
        c0298o.d(attributeSet, i3);
        J1.l lVar = new J1.l(this);
        this.c = lVar;
        lVar.e(attributeSet, i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0298o c0298o = this.f3804b;
        if (c0298o != null) {
            c0298o.a();
        }
        J1.l lVar = this.c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.f3804b;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.f3804b;
        if (c0298o != null) {
            return c0298o.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e1 e1Var;
        J1.l lVar = this.c;
        if (lVar == null || (e1Var = (e1) lVar.f580d) == null) {
            return null;
        }
        return (ColorStateList) e1Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e1 e1Var;
        J1.l lVar = this.c;
        if (lVar == null || (e1Var = (e1) lVar.f580d) == null) {
            return null;
        }
        return (PorterDuff.Mode) e1Var.f3683d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.c.c).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0298o c0298o = this.f3804b;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.f3804b;
        if (c0298o != null) {
            c0298o.f(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        J1.l lVar = this.c;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        J1.l lVar = this.c;
        if (lVar != null && drawable != null && !this.f3805d) {
            lVar.f579b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (lVar != null) {
            lVar.a();
            if (this.f3805d) {
                return;
            }
            ImageView imageView = (ImageView) lVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(lVar.f579b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f3805d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        J1.l lVar = this.c;
        if (lVar != null) {
            ImageView imageView = (ImageView) lVar.c;
            if (i3 != 0) {
                Drawable s3 = AbstractC0059a.s(imageView.getContext(), i3);
                if (s3 != null) {
                    AbstractC0299o0.a(s3);
                }
                imageView.setImageDrawable(s3);
            } else {
                imageView.setImageDrawable(null);
            }
            lVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        J1.l lVar = this.c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0298o c0298o = this.f3804b;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.f3804b;
        if (c0298o != null) {
            c0298o.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        J1.l lVar = this.c;
        if (lVar != null) {
            if (((e1) lVar.f580d) == null) {
                lVar.f580d = new Object();
            }
            e1 e1Var = (e1) lVar.f580d;
            e1Var.c = colorStateList;
            e1Var.f3682b = true;
            lVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        J1.l lVar = this.c;
        if (lVar != null) {
            if (((e1) lVar.f580d) == null) {
                lVar.f580d = new Object();
            }
            e1 e1Var = (e1) lVar.f580d;
            e1Var.f3683d = mode;
            e1Var.f3681a = true;
            lVar.a();
        }
    }
}
