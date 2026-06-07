package X0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import k.C0275c0;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1084b;
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f1085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f1086e;

    public r(t tVar, int i3, TextView textView, int i4, TextView textView2) {
        this.f1086e = tVar;
        this.f1083a = i3;
        this.f1084b = textView;
        this.c = i4;
        this.f1085d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0275c0 c0275c0;
        int i3 = this.f1083a;
        t tVar = this.f1086e;
        tVar.f1100n = i3;
        tVar.f1098l = null;
        TextView textView = this.f1084b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (c0275c0 = tVar.f1104r) != null) {
                c0275c0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1085d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1085d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
