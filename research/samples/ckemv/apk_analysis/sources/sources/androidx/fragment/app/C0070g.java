package androidx.fragment.app;

import J.W;
import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070g {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1920a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1921b = new ArrayList();
    public final ArrayList c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1922d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1923e = false;

    public C0070g(ViewGroup viewGroup) {
        this.f1920a = viewGroup;
    }

    public static void a(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (W.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                a(childAt, arrayList);
            }
        }
    }

    public static C0070g g(ViewGroup viewGroup, U0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0070g) {
            return (C0070g) tag;
        }
        eVar.getClass();
        C0070g c0070g = new C0070g(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0070g);
        return c0070g;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, F.d] */
    public final void b(int i3, int i4, G g) {
        synchronized (this.f1921b) {
            try {
                ?? obj = new Object();
                T e3 = e(g.c);
                if (e3 != null) {
                    e3.c(i3, i4);
                    return;
                }
                T t3 = new T(i3, i4, g, obj);
                this.f1921b.add(t3);
                t3.f1883d.add(new S(this, t3, 0));
                t3.f1883d.add(new S(this, t3, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, F.d] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, F.d] */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.fragment.app.e, A1.f, java.lang.Object] */
    public final void c(ArrayList arrayList, boolean z3) {
        Iterator it = arrayList.iterator();
        T t3 = null;
        T t4 = null;
        while (it.hasNext()) {
            T t5 = (T) it.next();
            int c = X.d.c(t5.c.f1957F);
            int a3 = q.h.a(t5.f1881a);
            if (a3 != 0) {
                if (a3 != 1) {
                    if (a3 != 2 && a3 != 3) {
                    }
                } else if (c != 2) {
                    t4 = t5;
                }
            }
            if (c == 2 && t3 == null) {
                t3 = t5;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z4 = false;
            if (!it2.hasNext()) {
                break;
            }
            T t6 = (T) it2.next();
            ?? obj = new Object();
            t6.d();
            HashSet hashSet = t6.f1884e;
            hashSet.add(obj);
            ?? fVar = new A1.f(t6, obj);
            fVar.f1918d = false;
            fVar.c = z3;
            arrayList2.add(fVar);
            ?? obj2 = new Object();
            t6.d();
            hashSet.add(obj2);
            if (z3) {
                if (t6 != t3) {
                    arrayList3.add(new C0069f(t6, obj2, z3, z4));
                    t6.f1883d.add(new G.m(this, arrayList4, t6));
                }
                z4 = true;
                arrayList3.add(new C0069f(t6, obj2, z3, z4));
                t6.f1883d.add(new G.m(this, arrayList4, t6));
            } else {
                if (t6 != t4) {
                    arrayList3.add(new C0069f(t6, obj2, z3, z4));
                    t6.f1883d.add(new G.m(this, arrayList4, t6));
                }
                z4 = true;
                arrayList3.add(new C0069f(t6, obj2, z3, z4));
                t6.f1883d.add(new G.m(this, arrayList4, t6));
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((C0069f) it3.next()).h();
        }
        ViewGroup viewGroup = this.f1920a;
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C0069f c0069f = (C0069f) it4.next();
            hashMap.put((T) c0069f.f46a, Boolean.FALSE);
            c0069f.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        boolean z5 = false;
        while (it5.hasNext()) {
            C0068e c0068e = (C0068e) it5.next();
            if (c0068e.h()) {
                c0068e.d();
            } else {
                v0.l l3 = c0068e.l(context);
                if (l3 == null) {
                    c0068e.d();
                } else {
                    Animator animator = (Animator) l3.f5084e;
                    if (animator == null) {
                        arrayList5.add(c0068e);
                    } else {
                        T t7 = (T) c0068e.f46a;
                        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = t7.c;
                        if (Boolean.TRUE.equals(hashMap.get(t7))) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Objects.toString(abstractComponentCallbacksC0077n);
                            }
                            c0068e.d();
                        } else {
                            boolean z6 = t7.f1881a == 3;
                            if (z6) {
                                arrayList4.remove(t7);
                            }
                            View view = abstractComponentCallbacksC0077n.f1957F;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0066c(viewGroup, view, z6, t7, c0068e));
                            animator.setTarget(view);
                            animator.start();
                            ((F.d) c0068e.f47b).b(new A.h(22, animator));
                            z5 = true;
                        }
                    }
                }
            }
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            C0068e c0068e2 = (C0068e) it6.next();
            T t8 = (T) c0068e2.f46a;
            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = t8.c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC0077n2);
                }
                c0068e2.d();
            } else if (z5) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC0077n2);
                }
                c0068e2.d();
            } else {
                View view2 = abstractComponentCallbacksC0077n2.f1957F;
                v0.l l4 = c0068e2.l(context);
                l4.getClass();
                Animation animation = (Animation) l4.f5083d;
                animation.getClass();
                if (t8.f1881a != 1) {
                    view2.startAnimation(animation);
                    c0068e2.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    r rVar = new r(animation, viewGroup, view2);
                    rVar.setAnimationListener(new AnimationAnimationListenerC0067d(view2, viewGroup, c0068e2));
                    view2.startAnimation(rVar);
                }
                ((F.d) c0068e2.f47b).b(new v0.m(view2, viewGroup, c0068e2));
            }
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            T t9 = (T) it7.next();
            X.d.a(t9.c.f1957F, t9.f1881a);
        }
        arrayList4.clear();
    }

    public final void d() {
        if (this.f1923e) {
            return;
        }
        ViewGroup viewGroup = this.f1920a;
        WeakHashMap weakHashMap = J.T.f402a;
        if (!J.E.b(viewGroup)) {
            f();
            this.f1922d = false;
            return;
        }
        synchronized (this.f1921b) {
            try {
                if (!this.f1921b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        T t3 = (T) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(t3);
                        }
                        t3.a();
                        if (!t3.g) {
                            this.c.add(t3);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.f1921b);
                    this.f1921b.clear();
                    this.c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((T) it2.next()).d();
                    }
                    c(arrayList2, this.f1922d);
                    this.f1922d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final T e(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        Iterator it = this.f1921b.iterator();
        while (it.hasNext()) {
            T t3 = (T) it.next();
            if (t3.c.equals(abstractComponentCallbacksC0077n) && !t3.f1885f) {
                return t3;
            }
        }
        return null;
    }

    public final void f() {
        ViewGroup viewGroup = this.f1920a;
        WeakHashMap weakHashMap = J.T.f402a;
        boolean b3 = J.E.b(viewGroup);
        synchronized (this.f1921b) {
            try {
                i();
                Iterator it = this.f1921b.iterator();
                while (it.hasNext()) {
                    ((T) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.c).iterator();
                while (it2.hasNext()) {
                    T t3 = (T) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!b3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f1920a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(t3);
                    }
                    t3.a();
                }
                Iterator it3 = new ArrayList(this.f1921b).iterator();
                while (it3.hasNext()) {
                    T t4 = (T) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!b3) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f1920a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(t4);
                    }
                    t4.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f1921b) {
            try {
                i();
                this.f1923e = false;
                int size = this.f1921b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    T t3 = (T) this.f1921b.get(size);
                    int c = X.d.c(t3.c.f1957F);
                    if (t3.f1881a == 2 && c != 2) {
                        t3.c.getClass();
                        this.f1923e = false;
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        Iterator it = this.f1921b.iterator();
        while (it.hasNext()) {
            T t3 = (T) it.next();
            if (t3.f1882b == 2) {
                t3.c(X.d.b(t3.c.x().getVisibility()), 1);
            }
        }
    }
}
