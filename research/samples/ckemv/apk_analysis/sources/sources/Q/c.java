package Q;

import K.p;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f796b = new Rect();
    public final Rect c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f797d;

    /* renamed from: e, reason: collision with root package name */
    public final U0.e f798e;

    public c(boolean z3, U0.e eVar) {
        this.f797d = z3;
        this.f798e = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f798e.getClass();
        Rect rect = this.f796b;
        ((p) obj).f(rect);
        Rect rect2 = this.c;
        ((p) obj2).f(rect2);
        int i3 = rect.top;
        int i4 = rect2.top;
        if (i3 < i4) {
            return -1;
        }
        if (i3 > i4) {
            return 1;
        }
        int i5 = rect.left;
        int i6 = rect2.left;
        boolean z3 = this.f797d;
        if (i5 < i6) {
            return z3 ? 1 : -1;
        }
        if (i5 > i6) {
            return z3 ? -1 : 1;
        }
        int i7 = rect.bottom;
        int i8 = rect2.bottom;
        if (i7 < i8) {
            return -1;
        }
        if (i7 > i8) {
            return 1;
        }
        int i9 = rect.right;
        int i10 = rect2.right;
        if (i9 < i10) {
            return z3 ? 1 : -1;
        }
        if (i9 > i10) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
