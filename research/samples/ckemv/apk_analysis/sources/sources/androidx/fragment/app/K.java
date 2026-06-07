package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1866b;

    public K(View view, ArrayList arrayList) {
        this.f1865a = view;
        this.f1866b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f1865a.setVisibility(8);
        ArrayList arrayList = this.f1866b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((View) arrayList.get(i3)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
