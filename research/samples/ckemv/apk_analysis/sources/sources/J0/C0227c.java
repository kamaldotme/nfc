package j0;

import J.T;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: j0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0227c(int i3, Class cls, String str) {
        super(cls, str);
        this.f3392a = i3;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3392a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(w.f3454a.L((View) obj));
            default:
                WeakHashMap weakHashMap = T.f402a;
                return J.D.a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3392a) {
            case 0:
                C0230f c0230f = (C0230f) obj;
                PointF pointF = (PointF) obj2;
                c0230f.getClass();
                c0230f.f3395a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0230f.f3396b = round;
                int i3 = c0230f.f3399f + 1;
                c0230f.f3399f = i3;
                if (i3 == c0230f.g) {
                    w.a(c0230f.f3398e, c0230f.f3395a, round, c0230f.c, c0230f.f3397d);
                    c0230f.f3399f = 0;
                    c0230f.g = 0;
                    return;
                }
                return;
            case 1:
                C0230f c0230f2 = (C0230f) obj;
                PointF pointF2 = (PointF) obj2;
                c0230f2.getClass();
                c0230f2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0230f2.f3397d = round2;
                int i4 = c0230f2.g + 1;
                c0230f2.g = i4;
                if (c0230f2.f3399f == i4) {
                    w.a(c0230f2.f3398e, c0230f2.f3395a, c0230f2.f3396b, c0230f2.c, round2);
                    c0230f2.f3399f = 0;
                    c0230f2.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                w.f3454a.f0((View) obj, floatValue);
                return;
            default:
                WeakHashMap weakHashMap = T.f402a;
                J.D.c((View) obj, (Rect) obj2);
                return;
        }
    }
}
