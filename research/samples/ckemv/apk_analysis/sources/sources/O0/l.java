package O0;

import J.H;
import J.T;
import Z.C0046m;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f774b;

    public /* synthetic */ l(int i3) {
        this.f774b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r3 != false) goto L26;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i3 = 1;
        switch (this.f774b) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0046m c0046m = (C0046m) obj;
                C0046m c0046m2 = (C0046m) obj2;
                RecyclerView recyclerView = c0046m.f1321d;
                if ((recyclerView == null) == (c0046m2.f1321d == null)) {
                    boolean z3 = c0046m.f1319a;
                    if (z3 == c0046m2.f1319a) {
                        i3 = c0046m2.f1320b - c0046m.f1320b;
                        if (i3 == 0) {
                            int i4 = c0046m.c - c0046m2.c;
                            if (i4 != 0) {
                                return i4;
                            }
                            return 0;
                        }
                    }
                    return i3;
                }
                break;
            case 2:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 3:
                return ((q.i) obj).f4397b - ((q.i) obj2).f4397b;
            default:
                WeakHashMap weakHashMap = T.f402a;
                float m3 = H.m((View) obj);
                float m4 = H.m((View) obj2);
                if (m3 > m4) {
                    return -1;
                }
                return m3 < m4 ? 1 : 0;
        }
    }
}
