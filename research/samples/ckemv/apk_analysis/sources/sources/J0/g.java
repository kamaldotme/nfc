package j0;

import J.E;
import J.T;
import a.AbstractC0059a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: A, reason: collision with root package name */
    public static final C0227c f3400A;

    /* renamed from: B, reason: collision with root package name */
    public static final C0227c f3401B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0227c f3402C;
    public static final C0227c D;

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f3403y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: z, reason: collision with root package name */
    public static final C0227c f3404z;

    /* JADX WARN: Type inference failed for: r0v2, types: [j0.b, android.util.Property] */
    static {
        new Property(PointF.class, "boundsOrigin").f3391a = new Rect();
        f3404z = new C0227c(0, PointF.class, "topLeft");
        f3400A = new C0227c(1, PointF.class, "bottomRight");
        f3401B = new C0227c(2, PointF.class, "bottomRight");
        f3402C = new C0227c(3, PointF.class, "topLeft");
        D = new C0227c(4, PointF.class, "position");
    }

    public static void H(v vVar) {
        View view = vVar.f3453b;
        WeakHashMap weakHashMap = T.f402a;
        if (!E.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = vVar.f3452a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", vVar.f3453b.getParent());
    }

    @Override // j0.o
    public final void d(v vVar) {
        H(vVar);
    }

    @Override // j0.o
    public final void g(v vVar) {
        H(vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, j0.f] */
    @Override // j0.o
    public final Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        int i3;
        g gVar;
        ObjectAnimator ofObject;
        if (vVar == null || vVar2 == null) {
            return null;
        }
        HashMap hashMap = vVar.f3452a;
        HashMap hashMap2 = vVar2.f3452a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i4 = rect.left;
        int i5 = rect2.left;
        int i6 = rect.top;
        int i7 = rect2.top;
        int i8 = rect.right;
        int i9 = rect2.right;
        int i10 = rect.bottom;
        int i11 = rect2.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i3 = 0;
        } else {
            i3 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i3++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i3++;
        }
        if (i3 <= 0) {
            return null;
        }
        View view = vVar2.f3453b;
        w.a(view, i4, i6, i8, i10);
        if (i3 != 2) {
            gVar = this;
            if (i4 == i5 && i6 == i7) {
                gVar.f3439u.getClass();
                ofObject = ObjectAnimator.ofObject(view, f3401B, (TypeConverter) null, d1.e.j(i8, i10, i9, i11));
            } else {
                gVar.f3439u.getClass();
                ofObject = ObjectAnimator.ofObject(view, f3402C, (TypeConverter) null, d1.e.j(i4, i6, i5, i7));
            }
        } else if (i12 == i14 && i13 == i15) {
            gVar = this;
            gVar.f3439u.getClass();
            ofObject = ObjectAnimator.ofObject(view, D, (TypeConverter) null, d1.e.j(i4, i6, i5, i7));
        } else {
            gVar = this;
            ?? obj = new Object();
            obj.f3398e = view;
            gVar.f3439u.getClass();
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(obj, f3404z, (TypeConverter) null, d1.e.j(i4, i6, i5, i7));
            gVar.f3439u.getClass();
            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(obj, f3400A, (TypeConverter) null, d1.e.j(i8, i10, i9, i11));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject2, ofObject3);
            animatorSet.addListener(new C0228d(obj));
            ofObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC0059a.M(viewGroup4, true);
            gVar.a(new C0229e(viewGroup4));
        }
        return ofObject;
    }

    @Override // j0.o
    public final String[] p() {
        return f3403y;
    }
}
