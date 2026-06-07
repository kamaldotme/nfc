package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class L implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1868b;
    public final /* synthetic */ Object c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1871f;
    public final /* synthetic */ M g;

    public L(M m3, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = m3;
        this.f1867a = obj;
        this.f1868b = arrayList;
        this.c = obj2;
        this.f1869d = arrayList2;
        this.f1870e = obj3;
        this.f1871f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        M m3 = this.g;
        Object obj = this.f1867a;
        if (obj != null) {
            m3.p(obj, this.f1868b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            m3.p(obj2, this.f1869d, null);
        }
        Object obj3 = this.f1870e;
        if (obj3 != null) {
            m3.p(obj3, this.f1871f, null);
        }
    }
}
