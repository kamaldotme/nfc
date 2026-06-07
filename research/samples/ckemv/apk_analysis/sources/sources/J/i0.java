package J;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0006e f429a;

    /* renamed from: b, reason: collision with root package name */
    public List f430b;
    public ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f431d;

    public i0(C0006e c0006e) {
        super(0);
        this.f431d = new HashMap();
        this.f429a = c0006e;
    }

    public final l0 a(WindowInsetsAnimation windowInsetsAnimation) {
        l0 l0Var = (l0) this.f431d.get(windowInsetsAnimation);
        if (l0Var == null) {
            l0Var = new l0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                l0Var.f436a = new j0(windowInsetsAnimation);
            }
            this.f431d.put(windowInsetsAnimation, l0Var);
        }
        return l0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0006e c0006e = this.f429a;
        a(windowInsetsAnimation);
        ((View) c0006e.f418f).setTranslationY(0.0f);
        this.f431d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0006e c0006e = this.f429a;
        a(windowInsetsAnimation);
        View view = (View) c0006e.f418f;
        int[] iArr = (int[]) c0006e.g;
        view.getLocationOnScreen(iArr);
        c0006e.f416d = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.f430b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j3 = AbstractC0021u.j(list.get(size));
            l0 a3 = a(j3);
            fraction = j3.getFraction();
            a3.f436a.d(fraction);
            this.c.add(a3);
        }
        C0006e c0006e = this.f429a;
        y0 g = y0.g(null, windowInsets);
        c0006e.e(g, this.f430b);
        return g.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0006e c0006e = this.f429a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        A.d c = A.d.c(lowerBound);
        upperBound = bounds.getUpperBound();
        A.d c3 = A.d.c(upperBound);
        View view = (View) c0006e.f418f;
        int[] iArr = (int[]) c0006e.g;
        view.getLocationOnScreen(iArr);
        int i3 = c0006e.f416d - iArr[1];
        c0006e.f417e = i3;
        view.setTranslationY(i3);
        AbstractC0021u.m();
        return AbstractC0021u.h(c.d(), c3.d());
    }
}
