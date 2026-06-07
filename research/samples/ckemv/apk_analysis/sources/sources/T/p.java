package t;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class p extends b {
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4886i;

    @Override // t.b
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f4881b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 6) {
                    this.h = true;
                } else if (index == 13) {
                    this.f4886i = true;
                }
            }
        }
    }

    public abstract void h(r.g gVar, int i3, int i4);

    @Override // t.b, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.h || this.f4886i) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i3 = 0; i3 < this.c; i3++) {
                View view = (View) constraintLayout.f1686b.get(this.f4730b[i3]);
                if (view != null) {
                    if (this.h) {
                        view.setVisibility(visibility);
                    }
                    if (this.f4886i && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        c();
    }
}
