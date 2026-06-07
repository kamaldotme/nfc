package B0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import n.C0342k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0342k f66a = new C0342k();

    /* renamed from: b, reason: collision with root package name */
    public final C0342k f67b = new C0342k();

    public static b a(Context context, int i3) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i3);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, B0.c] */
    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Animator animator = (Animator) arrayList.get(i3);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            bVar.f67b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f64b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f65d;
            }
            ?? obj = new Object();
            obj.f70d = 0;
            obj.f71e = 1;
            obj.f68a = startDelay;
            obj.f69b = duration;
            obj.c = interpolator;
            obj.f70d = objectAnimator.getRepeatCount();
            obj.f71e = objectAnimator.getRepeatMode();
            bVar.f66a.put(propertyName, obj);
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f66a.equals(((b) obj).f66a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f66a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f66a + "}\n";
    }
}
