package N1;

import X1.g;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a implements Comparator {
    public static final a c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final a f685d = new a(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f686b;

    public /* synthetic */ a(int i3) {
        this.f686b = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f686b) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                g.e(comparable, "a");
                g.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                g.e(comparable3, "a");
                g.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f686b) {
            case 0:
                return f685d;
            default:
                return c;
        }
    }
}
