package Z;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: Z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042i extends D {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f1279s;
    public boolean g;
    public ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f1280i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f1281j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1282k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1283l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1284m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1285n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1286o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1287p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f1288q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f1289r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((W) arrayList.get(size)).f1205a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [Z.g, java.lang.Object] */
    @Override // Z.D
    public final boolean a(W w3, W w4, A1.i iVar, A1.i iVar2) {
        int i3;
        int i4;
        int i5 = iVar.f51b;
        int i6 = iVar.c;
        if (w4.q()) {
            int i7 = iVar.f51b;
            i4 = iVar.c;
            i3 = i7;
        } else {
            i3 = iVar2.f51b;
            i4 = iVar2.c;
        }
        if (w3 == w4) {
            return g(w3, i5, i6, i3, i4);
        }
        View view = w3.f1205a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(w3);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(w4);
        float f3 = -((int) ((i3 - i5) - translationX));
        View view2 = w4.f1205a;
        view2.setTranslationX(f3);
        view2.setTranslationY(-((int) ((i4 - i6) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f1282k;
        ?? obj = new Object();
        obj.f1270a = w3;
        obj.f1271b = w4;
        obj.c = i5;
        obj.f1272d = i6;
        obj.f1273e = i3;
        obj.f1274f = i4;
        arrayList.add(obj);
        return true;
    }

    @Override // Z.D
    public final void d(W w3) {
        View view = w3.f1205a;
        view.animate().cancel();
        ArrayList arrayList = this.f1281j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0041h) arrayList.get(size)).f1275a == w3) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(w3);
                arrayList.remove(size);
            }
        }
        j(this.f1282k, w3);
        if (this.h.remove(w3)) {
            view.setAlpha(1.0f);
            c(w3);
        }
        if (this.f1280i.remove(w3)) {
            view.setAlpha(1.0f);
            c(w3);
        }
        ArrayList arrayList2 = this.f1285n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, w3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f1284m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0041h) arrayList5.get(size4)).f1275a == w3) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(w3);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f1283l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(w3)) {
                view.setAlpha(1.0f);
                c(w3);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f1288q.remove(w3);
        this.f1286o.remove(w3);
        this.f1289r.remove(w3);
        this.f1287p.remove(w3);
        i();
    }

    @Override // Z.D
    public final void e() {
        ArrayList arrayList = this.f1281j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0041h c0041h = (C0041h) arrayList.get(size);
            View view = c0041h.f1275a.f1205a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0041h.f1275a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((W) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f1280i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            W w3 = (W) arrayList3.get(size3);
            w3.f1205a.setAlpha(1.0f);
            c(w3);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f1282k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0040g c0040g = (C0040g) arrayList4.get(size4);
            W w4 = c0040g.f1270a;
            if (w4 != null) {
                k(c0040g, w4);
            }
            W w5 = c0040g.f1271b;
            if (w5 != null) {
                k(c0040g, w5);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f1284m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0041h c0041h2 = (C0041h) arrayList6.get(size6);
                    View view2 = c0041h2.f1275a.f1205a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0041h2.f1275a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f1283l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    W w6 = (W) arrayList8.get(size8);
                    w6.f1205a.setAlpha(1.0f);
                    c(w6);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f1285n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0040g c0040g2 = (C0040g) arrayList10.get(size10);
                    W w7 = c0040g2.f1270a;
                    if (w7 != null) {
                        k(c0040g2, w7);
                    }
                    W w8 = c0040g2.f1271b;
                    if (w8 != null) {
                        k(c0040g2, w8);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f1288q);
            h(this.f1287p);
            h(this.f1286o);
            h(this.f1289r);
            ArrayList arrayList11 = this.f1149b;
            if (arrayList11.size() > 0) {
                X.d.q(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // Z.D
    public final boolean f() {
        return (this.f1280i.isEmpty() && this.f1282k.isEmpty() && this.f1281j.isEmpty() && this.h.isEmpty() && this.f1287p.isEmpty() && this.f1288q.isEmpty() && this.f1286o.isEmpty() && this.f1289r.isEmpty() && this.f1284m.isEmpty() && this.f1283l.isEmpty() && this.f1285n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [Z.h, java.lang.Object] */
    public final boolean g(W w3, int i3, int i4, int i5, int i6) {
        View view = w3.f1205a;
        int translationX = i3 + ((int) view.getTranslationX());
        int translationY = i4 + ((int) w3.f1205a.getTranslationY());
        l(w3);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            c(w3);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        ArrayList arrayList = this.f1281j;
        ?? obj = new Object();
        obj.f1275a = w3;
        obj.f1276b = translationX;
        obj.c = translationY;
        obj.f1277d = i5;
        obj.f1278e = i6;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f1149b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            X.d.q(arrayList.get(0));
            throw null;
        }
    }

    public final void j(ArrayList arrayList, W w3) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0040g c0040g = (C0040g) arrayList.get(size);
            if (k(c0040g, w3) && c0040g.f1270a == null && c0040g.f1271b == null) {
                arrayList.remove(c0040g);
            }
        }
    }

    public final boolean k(C0040g c0040g, W w3) {
        if (c0040g.f1271b == w3) {
            c0040g.f1271b = null;
        } else {
            if (c0040g.f1270a != w3) {
                return false;
            }
            c0040g.f1270a = null;
        }
        w3.f1205a.setAlpha(1.0f);
        View view = w3.f1205a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(w3);
        return true;
    }

    public final void l(W w3) {
        if (f1279s == null) {
            f1279s = new ValueAnimator().getInterpolator();
        }
        w3.f1205a.animate().setInterpolator(f1279s);
        d(w3);
    }
}
