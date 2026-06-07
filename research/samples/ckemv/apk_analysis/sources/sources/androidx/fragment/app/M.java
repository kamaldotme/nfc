package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class M extends O {
    public static boolean o(Transition transition) {
        return (O.f(transition.getTargetIds()) && O.f(transition.getTargetNames()) && O.f(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.O
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.O
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i3 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i3 < transitionCount) {
                b(transitionSet.getTransitionAt(i3), arrayList);
                i3++;
            }
            return;
        }
        if (o(transition) || !O.f(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i3 < size) {
            transition.addTarget((View) arrayList.get(i3));
            i3++;
        }
    }

    @Override // androidx.fragment.app.O
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.O
    public final Object d() {
        return null;
    }

    @Override // androidx.fragment.app.O
    public final Object g(Object obj, Object obj2) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        if (transition != null && transition2 != null) {
            return new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        }
        if (transition != null) {
            return transition;
        }
        if (transition2 != null) {
            return transition2;
        }
        return null;
    }

    @Override // androidx.fragment.app.O
    public final Object h(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.O
    public final void j(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new K(view, arrayList));
    }

    @Override // androidx.fragment.app.O
    public final void k(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new L(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.O
    public final void l(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            O.e(view, rect);
            ((Transition) obj).setEpicenterCallback(new J(rect));
        }
    }

    @Override // androidx.fragment.app.O
    public final void n(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            p(transitionSet, arrayList, arrayList2);
        }
    }

    public final void p(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i3 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i3 < transitionCount) {
                p(transitionSet.getTransitionAt(i3), arrayList, arrayList2);
                i3++;
            }
            return;
        }
        if (o(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i3 < size) {
            transition.addTarget((View) arrayList2.get(i3));
            i3++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }
}
