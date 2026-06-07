package D0;

import I0.d;
import X0.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import j0.o;
import java.util.ArrayList;
import k0.f;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f135a = i3;
        this.f136b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f135a) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f136b;
                actionBarOverlayLayout.f1574x = null;
                actionBarOverlayLayout.f1562l = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f135a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f136b).h = null;
                return;
            case 1:
                k kVar = (k) this.f136b;
                kVar.q();
                kVar.f1054r.start();
                return;
            case 2:
                ((o) this.f136b).m();
                animator.removeListener(this);
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f136b;
                actionBarOverlayLayout.f1574x = null;
                actionBarOverlayLayout.f1562l = false;
                return;
            default:
                f fVar = (f) this.f136b;
                ArrayList arrayList = new ArrayList(fVar.f3834f);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ColorStateList colorStateList = ((I0.a) arrayList.get(i3)).f294b.f309p;
                    if (colorStateList != null) {
                        B.b.h(fVar, colorStateList);
                    }
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f135a) {
            case 4:
                f fVar = (f) this.f136b;
                ArrayList arrayList = new ArrayList(fVar.f3834f);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    d dVar = ((I0.a) arrayList.get(i3)).f294b;
                    ColorStateList colorStateList = dVar.f309p;
                    if (colorStateList != null) {
                        B.b.g(fVar, colorStateList.getColorForState(dVar.f313t, colorStateList.getDefaultColor()));
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
