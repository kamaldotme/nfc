package Z;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class I extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public W f1170a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1171b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1172d;

    public I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1171b = new Rect();
        this.c = true;
        this.f1172d = false;
    }

    public I(int i3, int i4) {
        super(i3, i4);
        this.f1171b = new Rect();
        this.c = true;
        this.f1172d = false;
    }

    public I(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1171b = new Rect();
        this.c = true;
        this.f1172d = false;
    }

    public I(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1171b = new Rect();
        this.c = true;
        this.f1172d = false;
    }

    public I(I i3) {
        super((ViewGroup.LayoutParams) i3);
        this.f1171b = new Rect();
        this.c = true;
        this.f1172d = false;
    }
}
